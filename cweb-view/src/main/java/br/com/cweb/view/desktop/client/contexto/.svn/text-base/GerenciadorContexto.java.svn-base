package br.com.cweb.view.desktop.client.contexto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.extjs.gxt.ui.client.Registry;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.MessageBoxEvent;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.Window;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.Window.ClosingEvent;
import com.google.gwt.user.client.Window.ClosingHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;

import br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO;
import br.com.cweb.mensagem.handler.MessageHandler;
import br.com.cweb.mensagem.to.Mensagem;
import br.com.cweb.menu.service.MenuService;
import br.com.cweb.seguranca.persistence.entity.MenuDTO;
import br.com.cweb.seguranca.persistence.entity.Usuario;
import br.com.cweb.view.cadastro.cadastrogeral.client.i18n.CadastroGeralI18N;
import br.com.cweb.view.desktop.client.CwebDesktop;
import br.com.cweb.view.desktop.client.CwebTaskBar;
import br.com.cweb.view.desktop.client.build.DefaultWindowBuilder;
import br.com.cweb.view.desktop.client.i18n.DesktopI18N;
import br.com.cweb.view.desktop.client.service.DesktopService;
import br.com.cweb.view.desktop.client.service.DesktopServiceAsync;
import br.com.cweb.widgets.action.RpcWaitCallback;
import br.com.cweb.widgets.erro.ExceptionManager;

/**
 * Classe para gerenciar o contexto
 * do sistema.
 * @author Sebastiao Nunes
 * 
 */
public class GerenciadorContexto {
	
	private GerenciadorMenu gerenciadorMenu;
	private CwebDesktop desktop;
	
	private List<MenuDTO> windows;

	DesktopServiceAsync service = GWT.create(DesktopService.class);
	
	private HandlerRegistration handlerClosingWindow;
	
	public GerenciadorContexto(CwebDesktop desktop) {
		this.desktop = desktop;
	}
	
	//TODO implementar CommandControler
	public void inicializar(){
		
		ExceptionManager.addHandler(new MessageHandler());//tratador excecao
		Registry.register("windowBuilder", new DefaultWindowBuilder(this));
		
		gerenciadorMenu = new GerenciadorMenu(this);

		service.getMenu(new AsyncCallback<List<MenuDTO>>() {

			public void onFailure(Throwable caught) {
				ExceptionManager.handleException(caught);
			}

			public void onSuccess(List<MenuDTO> result) {
				
				if(result == null){
					result = new ArrayList<MenuDTO>();
				}
				windows = result;
				
				service.getUsuarioLogado(new AsyncCallback<UsuarioLogadoDTO>() {

					public void onFailure(Throwable caught) {
						ExceptionManager.handleException(caught);
					}

					public void onSuccess(UsuarioLogadoDTO result) {
						WebApplication.getInstance().setUsuarioLogado(result);
						MessageBox.alert(DesktopI18N.messages.info(),DesktopI18N.messages.melhorResolucao(),null);
						
						registerClosingHandlerOfWindow();
						
						inicializarGerenciadores();
					}
				});
			}
		});
	}
	
	public void inicializarGerenciadores(){
		gerenciadorMenu.build(desktop.getTaskBar());
		gerenciadorMenu.buildMainMenu(windows);
		gerenciadorMenu.addName(WebApplication.getInstance().getUsuarioLogado().getNome());
		gerenciadorMenu.addTools();
	}
	
	public CwebDesktop getDesktop() {
		return desktop;
	}
	
	public void logoff(){
		
		MessageBox.confirm("Confirme", "Voce deseja sair do sistema?",
				new Listener<MessageBoxEvent>() {

					public void handleEvent(MessageBoxEvent be) {
						if (be.getButtonClicked().getText()
								.equals("Sim")) {

							service.logoff(new AsyncCallback<Void>() {

								public void onFailure(Throwable caught) {
									MessageBox
											.alert("alerta!",
													"Ocorreu um erro grave!"
															+ " \nDetalhes:\n"
															+ caught.getMessage(),
													null);
								}

								public void onSuccess(Void result) {
									
									handlerClosingWindow.removeHandler();
									closeWindow();
								}

							});

						}

					}
				});
	}
	
	 public static void closeWindow() {
			com.google.gwt.user.client.Window.open("../login.jsp", "_self", "");
	}
	
	 private void registerClosingHandlerOfWindow() {
			 
		 handlerClosingWindow = com.google.gwt.user.client.Window
					.addWindowClosingHandler(new ClosingHandler() {
						public void onWindowClosing(ClosingEvent event) {
							event.setMessage("Sair Sister...");
						}

					});
	}
}
