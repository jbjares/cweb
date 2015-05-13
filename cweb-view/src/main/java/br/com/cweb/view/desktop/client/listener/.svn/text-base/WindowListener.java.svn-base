package br.com.cweb.view.desktop.client.listener;

import br.com.cweb.view.desktop.client.build.IWindowBulider;
import com.extjs.gxt.ui.client.Registry;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.MenuEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.Window;

/**
 * Classe Listener para renderizar as Janelas 
 * do Sistema.
 * @author Sebastiao Nunes
 * @Since 1.0
 * @param <T>
 */
public class WindowListener <T extends ComponentEvent> extends SelectionListener<T>{

	private String codigoFunc;
	private String idGrupoAcesso;
	
	public WindowListener(String codigoFunc,String idGrupoAcesso){
		this.codigoFunc = codigoFunc;
		this.idGrupoAcesso = idGrupoAcesso;
	}
	
	@Override
	public void componentSelected(T event) {
		
		Window window;
		if (event instanceof MenuEvent) {
			MenuEvent me = (MenuEvent) event;
			window = me.getItem().getData("window");
		} else {
			window = event.getComponent().getData("window");
		}
		
		IWindowBulider builder = (IWindowBulider) Registry.get("windowBuilder");
		
		builder.buildWindow(window,codigoFunc,idGrupoAcesso);
	}

	public void setCodigoFunc(String codigoFunc) {
		this.codigoFunc = codigoFunc;
	}

	public String getCodigoFunc() {
		return codigoFunc;
	}

	public void setIdGrupoAcesso(String idGrupoAcesso) {
		this.idGrupoAcesso = idGrupoAcesso;
	}

	public String getIdGrupoAcesso() {
		return idGrupoAcesso;
	}
}
