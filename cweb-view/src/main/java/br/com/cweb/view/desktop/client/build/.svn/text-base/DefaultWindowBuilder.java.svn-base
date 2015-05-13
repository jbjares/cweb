package br.com.cweb.view.desktop.client.build;

import br.com.cweb.view.desktop.client.contexto.GerenciadorContexto;
import br.com.cweb.view.seguranca.acessorecurso.client.service.AcessoRecursoServiceFacade;
import br.com.cweb.view.seguranca.acessorecurso.client.service.AcessoRecursoServiceFacadeAsync;
import br.com.cweb.view.template.client.TemplateWindow;
import br.com.cweb.widgets.action.RpcCallback;
import br.com.cweb.widgets.erro.ExceptionManager;
import br.com.cweb.widgets.window.IWindowConfig;

import com.extjs.gxt.ui.client.widget.Window;
import com.google.gwt.core.client.GWT;


/***
 * Classe para renderizar as janelas do sistema.
 * @author Sebastiao Nunes
 * @since 1.0
 */
public class DefaultWindowBuilder implements IWindowBulider{
	
	private GerenciadorContexto context;
	private AcessoRecursoServiceFacadeAsync service = GWT.create(AcessoRecursoServiceFacade.class);
	private TemplateWindow template;
	
	public DefaultWindowBuilder(GerenciadorContexto context){
		this.context = context;
	}
	
	public void buildWindow(final Window window,String codigoFunc) {

		template = (TemplateWindow) window;
		
		service.getWindowConfig(codigoFunc, new RpcCallback<IWindowConfig>(){

			@Override
			public void handleResponse(IWindowConfig config) {
				
				template.setWindowConfig(config);
				handleWindow();
			}
			
			@Override
			public void handleFailure(Throwable exception) {
				ExceptionManager.handleException(exception);
			}
		});
		
	}
	
	
	public void buildWindow(final Window window,String codigoFunc,String idGrupoAcesso) {

		template = (TemplateWindow) window;
		
		service.getWindowConfig(codigoFunc,idGrupoAcesso, new RpcCallback<IWindowConfig>(){

			@Override
			public void handleResponse(IWindowConfig config) {
				
				template.setWindowConfig(config);
				handleWindow();
			}
			
			@Override
			public void handleFailure(Throwable exception) {
				ExceptionManager.handleException(exception);
			}
		});
		
	}
	
	public void buildWindow(Window window) {
		
		template = (TemplateWindow) window;
		handleWindow();
	}
	
	private void handleWindow(){
		
		// if (!this.getWindows().contains(w)) {
		context.getDesktop().addWindow(template);
		// }
		if (template != null && !template.isVisible()) {
			
			template.securityButton();
			template.layout(true);
			template.show();
		} else {
			template.toFront();
		}
	}

}
