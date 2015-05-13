package br.com.cweb.widgets.window;

import com.extjs.gxt.ui.client.Style.Orientation;
import com.extjs.gxt.ui.client.Style.Scroll;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.Window;
import com.extjs.gxt.ui.client.widget.form.TextArea;
import com.extjs.gxt.ui.client.widget.layout.RowData;
import com.extjs.gxt.ui.client.widget.layout.RowLayout;

public class AjudaCommonsWindow extends Window {

	private TextArea txtrNewTextarea;
	public AjudaCommonsWindow() {
		setSize("820px", "540px");
		setResizable(false);
		setModal(true);
		setVScrollPosition(533);
		setHScrollPosition(848);
		setLayout(new RowLayout(Orientation.VERTICAL));
		
		LayoutContainer layoutContainer = new LayoutContainer();
		layoutContainer.setScrollMode(Scroll.AUTO);
		
		txtrNewTextarea = new TextArea();
		txtrNewTextarea.setReadOnly(true);
		txtrNewTextarea.setVisible(true);
		layoutContainer.add(txtrNewTextarea);
		txtrNewTextarea.setSize("800", "500");
		txtrNewTextarea.setFieldLabel("New TextArea");
		add(layoutContainer, new RowData(805.0, 505.0, new Margins()));
		layoutContainer.setSize("834", "520");
		layoutContainer.setBorders(true);
	}
	
	public AjudaCommonsWindow(String id, String heading, String helpText) {
		this();
		this.setId(id);
		setHeading(heading);
		txtrNewTextarea.setEmptyText(helpText);
	}

}
