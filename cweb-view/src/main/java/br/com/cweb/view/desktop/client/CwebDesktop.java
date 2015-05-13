package br.com.cweb.view.desktop.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import br.com.cweb.view.desktop.client.contexto.GerenciadorContexto;

import com.extjs.gxt.desktop.client.Shortcut;
import com.extjs.gxt.desktop.client.StartMenu;
import com.extjs.gxt.ui.client.core.DomQuery;
import com.extjs.gxt.ui.client.core.El;
import com.extjs.gxt.ui.client.core.XDOM;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.MenuEvent;
import com.extjs.gxt.ui.client.event.WindowEvent;
import com.extjs.gxt.ui.client.event.WindowListener;
import com.extjs.gxt.ui.client.widget.ComponentHelper;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.Viewport;
import com.extjs.gxt.ui.client.widget.Window;
import com.extjs.gxt.ui.client.widget.WindowManager;
import com.extjs.gxt.ui.client.widget.layout.RowData;
import com.extjs.gxt.ui.client.widget.layout.RowLayout;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * A desktop represents a desktop like application which contains a task bar,
 * start menu, and shortcuts.
 * 
 * <p/>
 * Rather than adding content directly to the root panel, content should be
 * wrapped in windows. Windows can be opened via shortcuts and the start menu.
 * 
 * <p />
 * Desktop requires a 'x-desktop' element in your host page.
 * 
 * <pre>
 *     &lt;div id="x-desktop">
 *         &lt;dl id="x-shortcuts">&lt;/dl>
 *     &lt;/div>
 * </pre>
 */
public class CwebDesktop {

	private static final String DESKTOP = "desktop";

	protected CwebTaskBar taskBar = new CwebTaskBar();
	protected WindowListener listener;
	protected Viewport viewport;
	protected LayoutContainer desktop;
	protected Window activeWindow;
	protected List<Shortcut> shortcuts;

	protected HashMap<String, Window> windows;

	private static final Integer ACTIVED = new Integer(0);
	private static final Integer MAXIMIZED = new Integer(1);
	private static final Integer MINIMIZED = new Integer(2);
	private static final Integer CLOSED = new Integer(3);

	private boolean canSaveStateInHistory = true;
	protected Timer saverWindowsState = new Timer() {
		@Override
		public void run() {
			saveStateInHistory();
		}
	};;

	protected El shortcutEl;
	
	protected GerenciadorContexto gerenciadorContexto;
	
	public CwebDesktop() {
		shortcuts = new ArrayList<Shortcut>();
		windows = new HashMap<String, Window>();

		initListeners();

		viewport = new Viewport();
		viewport.setLayout(new RowLayout());

		desktop = new LayoutContainer() {
			@Override
			protected void onRender(Element parent, int index) {
				super.onRender(parent, index);
				Element el = DomQuery.selectNode("#x-desktop");
				if (el == null) {
					el = DOM.createDiv();
					el.setClassName("x-desktop");
				}
				getElement().appendChild(el);
			}
		};

		viewport.add(desktop, new RowData(1, 1));
		viewport.add(taskBar, new RowData(1, 30));

		Element el = DomQuery.selectNode("#x-shortcuts");
		if (el == null) {
			el = DOM.createDiv();
			el.setClassName("x-shortcuts");
			XDOM.getBody().appendChild(el);
		}
		shortcutEl = new El(el);
		RootPanel.get().add(viewport);
		saveState();

	}

	/**
	 * Adds a shortcut to the desktop.
	 * 
	 * @param shortcut
	 *            the shortcut to add
	 */
	public void addShortcut(Shortcut shortcut) {
		if (shortcutEl != null) {
			shortcuts.add(shortcut);
			shortcut.render(shortcutEl.dom);
			ComponentHelper.doAttach(shortcut);
		}
	}

	/**
	 * Adds a window to the desktop.
	 * 
	 * @param window
	 *            the window to add
	 */
	public boolean addWindow(Window window) {
		String key = window.getId();
		if (!windows.containsKey(key)) {
			windows.put(key, window);
			window.setContainer(desktop.getElement());
			window.addWindowListener(listener);
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Returns the container of the "desktop", which is the viewport minus the
	 * task bar.
	 * 
	 * @return the desktop layout container
	 */
	public LayoutContainer getDesktop() {
		return desktop;
	}

	/**
	 * Returns the start menu.
	 * 
	 * @return the start menu
	 */
	public StartMenu getStartMenu() {
		return taskBar.getStartMenu();
	}

	/**
	 * Returns a list of the desktop's shortcuts.
	 * 
	 * @return the shortcuts
	 */
	public List<Shortcut> getShortcuts() {
		return shortcuts;
	}

	/**
	 * Returns the desktop's task bar.
	 * 
	 * @return the task bar
	 */
	public CwebTaskBar getTaskBar() {
		return taskBar;
	}

	/**
	 * Minimizes the window.
	 * 
	 * @param window
	 *            the window to minimize
	 */
	public void minimizeWindow(Window window) {
		doMinimizeWindow(window);
		saveState();
	}

	/**
	 * Removes a shortcut from the desktop.
	 * 
	 * @param shortcut
	 *            the shortcut to remove
	 */
	public void removeShortcut(Shortcut shortcut) {
		if (shortcutEl != null) {
			shortcuts.remove(shortcut);
			shortcutEl.dom.removeChild(shortcut.getElement());
			ComponentHelper.doDetach(shortcut);
		}
	}

	/**
	 * Removes a window from the desktop.
	 * 
	 * @param window
	 *            the window to remove
	 */
	public void removeWindow(Window window) {

		windows.remove(window.getId());
		window.removeWindowListener(listener);
		if (activeWindow == window) {
			activeWindow = null;
		}
		taskBar.removeTaskButton((TaskButton) window.getData("taskButton"));
	}

	protected void initListeners() {

		History.addValueChangeHandler(new ValueChangeHandler<String>() {

			public void onValueChange(ValueChangeEvent<String> event) {
				restoreState(event.getValue());
			}
		});

		listener = new WindowListener() {
			@Override
			public void windowActivate(WindowEvent we) {
				markActive(we.getWindow());
			}

			@Override
			public void windowDeactivate(WindowEvent we) {
				markInactive(we.getWindow());
			}

			@Override
			public void windowHide(WindowEvent we) {
				onHide(we.getWindow());
			}

			@Override
			public void windowMinimize(WindowEvent we) {
				minimizeWindow(we.getWindow());
			}

			@Override
			public void windowShow(WindowEvent we) {
				onShow(we.getWindow());
			}

		};

	}

	protected void onHide(Window window) {
		doOnHide(window);
		saveState();
	}

	private void markActive(Window window) {
		doMarkActive(window);
		saveState();
	}

	private void markInactive(Window window) {
		doMarkInactive(window);
		saveState();
	}

	private void onShow(Window window) {
		doOnShow(window);
	}

	private void saveStateInHistory() {
		try {
			String token = activeWindow == null ? DESKTOP : activeWindow
					.getId();
			History.newItem(token, false);
		} finally {
			canSaveStateInHistory = true;
		}
	}

	private void saveState() {
		if (canSaveStateInHistory) {
			canSaveStateInHistory = false;
			saverWindowsState.schedule(500);
		}
	}

	private void restoreState(String token) {
		canSaveStateInHistory = false;


		try {
			Window activeFromWindowManager = WindowManager.get().getActive();
			if (activeFromWindowManager == null
					|| !activeFromWindowManager.isModal()) {
				if (token == null || token.trim().length() == 0
						|| DESKTOP.equals(token)) {
					for (Window window : windows.values()) {
						TaskButton btn = window.getData("taskButton");
						if (btn != null && taskBar.getButtons().contains(btn)) {
							doMinimizeWindow(window);
						}
					}
				} else if (windows.containsKey(token)) {
					Window window = windows.get(token);
					window.show();
					window.toFront();
					doMarkActive(window);
				}
			}
		} finally {
			canSaveStateInHistory = true;
		}
	}

	private void doOnHide(Window window) {
		if (window.getData("minimize") != null) {
			doMarkInactive(window);
			return;
		}
		if (activeWindow == window) {
			activeWindow = null;
		}
		taskBar.removeTaskButton((TaskButton) window.getData("taskButton"));
	}

	private void doMarkActive(Window window) {
		if (activeWindow != null && activeWindow != window) {
			doMarkInactive(activeWindow);
		}
		taskBar.setActiveButton((TaskButton) window.getData("taskButton"));
		activeWindow = window;
		TaskButton btn = window.getData("taskButton");
		btn.addStyleName("active-win");
		window.setData("minimize", null);
	}

	private void doMarkInactive(Window window) {
		if (window == activeWindow) {
			activeWindow = null;
			TaskButton btn = window.getData("taskButton");
			btn.removeStyleName("active-win");
		}
	}

	private void doOnShow(Window window) {
		TaskButton btn = window.getData("taskButton");
		window.setData("minimize", null);
		if (btn != null && taskBar.getButtons().contains(btn)) {
			return;
		}
		taskBar.addTaskButton(window);
	}

	private void doMinimizeWindow(Window window) {
		window.setData("minimize", true);
		window.hide();
	}
	
}
