package br.com.cweb.view.desktop.client;

import br.com.cweb.mensagem.handler.MessageHandler;
import br.com.cweb.seguranca.persistence.entity.Usuario;
import br.com.cweb.view.cadastro.cadastroconvenio.client.view.PesquisaCadastroConvenioWindow;
import br.com.cweb.view.cadastro.cadastrogeral.client.view.PesquisaCadastroGeralWindow;
import br.com.cweb.view.cadastro.instituicaofinanceira.client.view.PesquisaInstituicaoFinanceiraWindow;
import br.com.cweb.view.desktop.client.contexto.GerenciadorContexto;
import br.com.cweb.view.desktop.client.contexto.WebApplication;
import br.com.cweb.view.desktop.client.i18n.DesktopI18N;
import br.com.cweb.view.desktop.client.service.DesktopService;
import br.com.cweb.view.desktop.client.service.DesktopServiceAsync;
import br.com.cweb.view.seguranca.cadastrogrupoacesso.client.view.CadastroGrupoAcessoWindow;
import br.com.cweb.view.seguranca.trocasenha.client.view.TrocaSenhaWindow;
import br.com.cweb.widgets.erro.ExceptionManager;

import com.extjs.gxt.desktop.client.StartMenu;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.MenuEvent;
import com.extjs.gxt.ui.client.event.MessageBoxEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.util.IconHelper;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.Window;
import com.extjs.gxt.ui.client.widget.menu.Menu;
import com.extjs.gxt.ui.client.widget.menu.MenuItem;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.Window.ClosingEvent;
import com.google.gwt.user.client.Window.ClosingHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class DesktopImpl extends CwebDesktop {

	private static final String CONFIRMA_SAIR_DO_SISTEMA = "Voce deseja sair do sistema?";
	private DesktopServiceAsync service = GWT.create(DesktopService.class);
	private Usuario usuario;
	private HandlerRegistration handlerClosingWindow;
	
	public DesktopImpl() {
		
		WebApplication.getInstance();
		ExceptionManager.addHandler(new MessageHandler());//tratador excecao
		definirContexto();
		//obterUsuarioLogado();
		
		// TaskBar taskBar = getTaskBar();
		// formarMenu(taskBar);
		
	
	}
	
	private void definirContexto() {
		gerenciadorContexto = new GerenciadorContexto(this);
		gerenciadorContexto.inicializar();
	}

	private void formarMenu(CwebTaskBar taskBar) {

		SelectionListener<MenuEvent> menuListener = new SelectionListener<MenuEvent>() {
			@Override
			public void componentSelected(MenuEvent me) {
				itemSelected(me);
			}
		};

		final StartMenu menu = taskBar.getStartMenu();
		taskBar.setStartButtonText("CWEB");
		taskBar.setToolTip("Clique no botao CWEB para abrir o menu iniciar do sistema");
		service.obterNomePessoa(usuario, new AsyncCallback<String>() {

			public void onFailure(Throwable caught) {
				MessageBox.alert("alerta!", "Ocorreu um erro grave!"
						+ " \nDetalhes:\n" + caught.getMessage(), null);
			}

			public void onSuccess(String nome) {
				menu.setHeading(nome);
			}
		});

		menu.setIconStyle("user");

		MenuItem menuItemCadastro = new MenuItem("Cadastro");
		menuItemCadastro.setId("id_DesktopImpl_menuItemCadastro");
		menuItemCadastro.setIcon(IconHelper.createStyle("bogus"));

		Menu sub = new Menu();

		MenuItem subMenuCadastroGeral = new MenuItem(
				"Gerenciar Pessoas e Usuarios");
		subMenuCadastroGeral.setId("id_DesktopImpl_subMenuCadastroGeral");
		subMenuCadastroGeral
				.setToolTip("Clique aqui para abrir a tela de gerenciamento de pessoas e usuarios");
		//subMenuCadastroGeral.setIconStyle("cadastroGeralPessoa");

		subMenuCadastroGeral.setData("window",
				new PesquisaCadastroGeralWindow());
		subMenuCadastroGeral.addSelectionListener(menuListener);
		sub.add(subMenuCadastroGeral);

		menuItemCadastro.setSubMenu(sub);
		menu.add(menuItemCadastro);
		
		MenuItem subMenuCadConvenio = new MenuItem("Cadastro Convenio");
		subMenuCadConvenio.setData("window", new PesquisaCadastroConvenioWindow());
		subMenuCadConvenio.addSelectionListener(menuListener);
		sub.add(subMenuCadConvenio);
		menuItemCadastro.setSubMenu(sub);
		
		/**/
		 MenuItem subMenuInstFinanc = new MenuItem("Gerenciar Instituicao Financeira");
		 subMenuInstFinanc.setId("id_DesktopImpl_subMenuCadastroGeral");
		 subMenuInstFinanc.setToolTip("Clique aqui para abrir a tela de gerenciamento de pessoas e usuarios");
//		 subMenuInstFinanc.setIconStyle("cadastroGeralPessoa");
		 subMenuInstFinanc.setData("window", new PesquisaInstituicaoFinanceiraWindow());
		 subMenuInstFinanc.addSelectionListener(menuListener);
		
		 sub.add(subMenuInstFinanc);
		 menuItemCadastro.setSubMenu(sub);
		
		/***/

		MenuItem menuItemSeg = new MenuItem("Seguranca");
		menuItemSeg.setIcon(IconHelper.createStyle("seguranca"));
		menuItemSeg.setId("id_DesktopImpl_menuItemSeg");

		Menu subSeg = new Menu();

		MenuItem cadastroGrupoAcesso = new MenuItem("Gerenciar Grupo Acesso");
		cadastroGrupoAcesso
				.setToolTip("Clique aqui para abrir a tela de gerenciamento de Grupo de Acesso");
		cadastroGrupoAcesso.setId("id_DesktopImpl_cadastroGrupoAcesso");
//		cadastroGrupoAcesso.setIconStyle("cadastroGrupoAcesso");

		cadastroGrupoAcesso.setData("window", new CadastroGrupoAcessoWindow());
		cadastroGrupoAcesso.addSelectionListener(menuListener);
		subSeg.add(cadastroGrupoAcesso);

		menuItemSeg.setSubMenu(subSeg);
		menu.add(menuItemSeg);

		/**/
		MenuItem senha = new MenuItem("Trocar Senha");
		senha.setToolTip("Clique aqui para abrir a tela para trocar de senha");
		senha.setIconStyle("cadastroGrupoAcesso");
		senha.setId("id_DesktopImpl_senha");

		senha.setData("window", new TrocaSenhaWindow());
		senha.addSelectionListener(menuListener);
		subSeg.add(senha);

		menuItemSeg.setSubMenu(subSeg);
		menu.add(menuItemSeg);

		MenuItem tool = new MenuItem("Logout");

		tool.setIcon(IconHelper.createStyle("logout"));
		tool.setToolTip("Clique aqui para sair do sistema");
		tool.setId("id_DesktopImpl_Logout");
		tool.addSelectionListener(new SelectionListener<MenuEvent>() {

			@Override
			public void componentSelected(MenuEvent ce) {

				MessageBox.confirm("Confirme", CONFIRMA_SAIR_DO_SISTEMA,
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
											handlerClosingWindow
													.removeHandler();
											closeWindow();
										}

									});

								}

							}
						});

			}
		});
		menu.addTool(tool);
	}

	private void itemSelected(ComponentEvent ce) {
		Window w;
		if (ce instanceof MenuEvent) {
			MenuEvent me = (MenuEvent) ce;
			w = me.getItem().getData("window");
		} else {
			w = ce.getComponent().getData("window");
		}
		// if (!this.getWindows().contains(w)) {
		this.addWindow(w);
		// }
		if (w != null && !w.isVisible()) {
			w.show();
		} else {
			w.toFront();
		}
	}

	private void obterUsuarioLogado() {

		service.obterUsuarioLogado(new AsyncCallback<Usuario>() {

			public void onFailure(Throwable caught) {
				MessageBox.alert("alerta!", "Ocorreu um erro grave!"
						+ " \nDetalhes:\n" + caught.getMessage(), null);
			}

			public void onSuccess(Usuario result) {
				usuario = result;
				CwebTaskBar taskBar = getTaskBar();

				registerClosingHandlerOfWindow();

				formarMenu(taskBar);
				MessageBox.alert(DesktopI18N.messages.info(),DesktopI18N.messages.melhorResolucao(),null);
			}
		});
	}

	protected void registerClosingHandlerOfWindow() {
		handlerClosingWindow = com.google.gwt.user.client.Window
				.addWindowClosingHandler(new ClosingHandler() {
					public void onWindowClosing(ClosingEvent event) {
						event.setMessage(CONFIRMA_SAIR_DO_SISTEMA);
					}

				});
	}

	public static void closeWindow() {
		com.google.gwt.user.client.Window.open("../login.jsp", "_self", "");
	}

}
