package br.com.cweb.view.seguranca.trocasenha.client.view;

import br.com.cweb.view.template.client.TemplateWindow;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica;
import br.com.cweb.cadastro.persistence.entity.TipoPessoa;
import br.com.cweb.relatorio.to.TipoFormatoRelatorio;
import br.com.cweb.relatorio.to.TipoNomeRelatorio;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;
import br.com.cweb.seguranca.persistence.entity.TipoSituacaoGrupo;
import br.com.cweb.seguranca.persistence.entity.Usuario;
import br.com.cweb.view.cadastro.cadastrogeral.client.i18n.CadastroGeralI18N;
import br.com.cweb.view.cadastro.cadastrogeral.client.service.CadastroGeralServiceFacade;
import br.com.cweb.view.cadastro.cadastrogeral.client.service.CadastroGeralServiceFacadeAsync;
import br.com.cweb.view.cadastro.cadastrogeral.client.view.AjudaCadastroGeralWindow;
import br.com.cweb.view.cadastro.cadastrogeral.client.view.IncluiAlteraCadastroGeralWindow;
import br.com.cweb.view.desktop.client.i18n.DesktopI18N;
import br.com.cweb.view.seguranca.cadastrogrupoacesso.client.i18n.CadastroGrupoAcessoI18N;
import br.com.cweb.view.seguranca.cadastrogrupoacesso.client.service.CadastroGrupoAcessoServiceFacade;
import br.com.cweb.view.seguranca.cadastrogrupoacesso.client.service.CadastroGrupoAcessoServiceFacadeAsync;
import br.com.cweb.view.seguranca.trocasenha.client.i18n.TrocaSenhaI18N;
import br.com.cweb.view.seguranca.trocasenha.client.service.TrocaSenhaServiceFacade;
import br.com.cweb.view.seguranca.trocasenha.client.service.TrocaSenhaServiceFacadeAsync;
import br.com.cweb.view.template.client.TemplateCombosDependentes;
import br.com.cweb.view.template.client.TemplateWindow;
import br.com.cweb.widgets.action.RpcWaitCallback;
import br.com.cweb.widgets.constants.Function;
import br.com.cweb.widgets.constants.Permissoes;
import br.com.cweb.widgets.window.DefaultWindowConfig;
import br.com.cweb.widgets.window.IWindow;
import br.com.cweb.widgets.window.IWindowConfig;
import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.Style.LayoutRegion;
import com.extjs.gxt.ui.client.Style.SelectionMode;
import com.extjs.gxt.ui.client.data.BaseListLoader;
import com.extjs.gxt.ui.client.data.BasePagingLoader;
import com.extjs.gxt.ui.client.data.BeanModel;
import com.extjs.gxt.ui.client.data.BeanModelReader;
import com.extjs.gxt.ui.client.data.ListLoader;
import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.extjs.gxt.ui.client.data.PagingLoader;
import com.extjs.gxt.ui.client.data.RpcProxy;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.FieldEvent;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.ComboBox;
import com.extjs.gxt.ui.client.widget.form.FieldSet;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.LabelField;
import com.extjs.gxt.ui.client.widget.form.NumberField;
import com.extjs.gxt.ui.client.widget.form.Radio;
import com.extjs.gxt.ui.client.widget.form.RadioGroup;
import com.extjs.gxt.ui.client.widget.form.SimpleComboBox;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.grid.GridSelectionModel;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteData;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteLayout;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import com.extjs.gxt.ui.client.widget.layout.BorderLayoutData;
import com.extjs.gxt.ui.client.widget.layout.LayoutData;
import com.extjs.gxt.ui.client.widget.toolbar.PagingToolBar;
import com.extjs.gxt.ui.client.widget.toolbar.ToolBar;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class TrocaSenhaWindow extends TemplateWindow{

	
	private TrocaSenhaServiceFacadeAsync service = GWT.create(TrocaSenhaServiceFacade.class);
	private TextField<String> textLogin;
	private TextField<String> textSenhaAtual;
	private TextField<String> textNovaSenha;
	private TextField<String> textConfirmacaoSenha;
	private LayoutContainer containerPrincipal;
	private ContentPanel panelPrincipal;
	private FormPanel form;
	private Button bttLimpar;
	private Button bttSalvar;
	private String nomeUsuario;
	private Usuario usuario;
	
	public TrocaSenhaWindow() {
		
		final BorderLayout layout = new BorderLayout();  
	    setLayout(layout);
		
		obterUsuario();
		setMinimizable(true);
		setResizable(false);
		setSize("730px", "280px");
		setHeading(TrocaSenhaI18N.constants.titleForm());
		new FormPanel().setBodyStyle(bbarStyle);
		containerPrincipal = new LayoutContainer();
		containerPrincipal.setId("id_ContainerPrincipal");
		containerPrincipal.setBorders(true);
		
		panelPrincipal = new ContentPanel();
		panelPrincipal.setId("id_PanelPrincipal");
		panelPrincipal.setHeaderVisible(false);
		panelPrincipal.setButtonAlign(HorizontalAlignment.LEFT);
		panelPrincipal.setAutoWidth(true);
		panelPrincipal.setAutoHeight(true);
		panelPrincipal.setSize("600", "100");
		
		panelPrincipal.add(getForm());
		containerPrincipal.add(panelPrincipal);
		add(containerPrincipal);
	}
	
	private Component getForm() {
	
		form = new FormPanel();
		form.setId("idFormTrocaSenha");
		
		form.setHeaderVisible(false);
		form.setHeight(250);
		form.setWidth(720);
		form.setButtonAlign(HorizontalAlignment.CENTER);
		
		
		textLogin = new TextField<String>();
		textLogin.setId("idTextLogin");
		textLogin.setFieldLabel(TrocaSenhaI18N.constants.login());
		textLogin.setReadOnly(true);
		form.add(textLogin);
		
		textSenhaAtual = new TextField<String>();
		textSenhaAtual.setId("idTextSenhaAtual");
		textSenhaAtual.setAllowBlank(false);
		textSenhaAtual.setFieldLabel(TrocaSenhaI18N.constants.senhaAtual());
		textSenhaAtual.setPassword(true);
		form.add(textSenhaAtual);
		
		textNovaSenha = new TextField<String>();
		textNovaSenha.setId("idTextNovaSenha");
		textNovaSenha.setAllowBlank(false);
		textNovaSenha.setFieldLabel(TrocaSenhaI18N.constants.novaSenha());
		textNovaSenha.setPassword(true);
		form.add(textNovaSenha);
		
		textConfirmacaoSenha = new TextField<String>();
		textConfirmacaoSenha.setId("idTextConfSenha");
		textConfirmacaoSenha.setAllowBlank(false);
		textConfirmacaoSenha.setFieldLabel(TrocaSenhaI18N.constants.confirmacaoSenha());
		textConfirmacaoSenha.setPassword(true);
		form.add(textConfirmacaoSenha);
		
		
		bttSalvar = new Button(TrocaSenhaI18N.constants.salvar());
		bttSalvar.setId("idBttOk");
		bttSalvar.setData(IWindow.OPERATION, Permissoes.SALVAR);
		addSecurityButton(bttSalvar);
		
		bttLimpar = new Button(TrocaSenhaI18N.constants.limpar());
		bttLimpar.setId("idBttLimpar");
		bttLimpar.setData(IWindow.OPERATION, Permissoes.LIMPAR);
		addSecurityButton(bttLimpar);
		
		form.addButton(bttSalvar);
		form.addButton(bttLimpar);
		
		managerEvents(bttSalvar,bttLimpar);
		
		return form;
	}
	
		
	protected void managerEvents(Button bttOk,Button bttLimpar){
		
		bttOk.addSelectionListener(new SelectionListener<ButtonEvent>() {

			@Override
			public void componentSelected(ButtonEvent ce) {
				
				if(!isDadosValidos()){
					return;
				}
				
				if(!isSenhaValida()){
					return;
				}
				
				else{
//				service.alterarSenha(textConfirmacaoSenha.getValue(), new AsyncCallback(){
//
//						public void onFailure(Throwable caught) {
//							MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(),TrocaSenhaI18N.messages.cadastroErro(), null);
//						}
//
//						public void onSuccess(Object result) {
//							MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(),TrocaSenhaI18N.messages.cadastroSucesso(), null);
//						}
//					
//					});
				
					service.alterarSenha(textConfirmacaoSenha.getValue(), new RpcWaitCallback (DesktopI18N.messages.aguarde(),DesktopI18N.messages.processando()) {
					
						@Override
						public void handleResponse(Object value) {
							MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(),TrocaSenhaI18N.messages.cadastroSucesso(), null);			
						}
					
						@Override
						public void handleFailure(Throwable exception) {
							MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(),TrocaSenhaI18N.messages.cadastroErro(), null);
						}
					
					});
				}
			}
		});
		
		bttLimpar.addSelectionListener(new SelectionListener<ButtonEvent>() {

			@Override
			public void componentSelected(ButtonEvent ce) {
				onClearForm();
			}
		});

		
	}
	
	protected void obterNomePessoa(){
		
		service.obterLoginPessoa(new AsyncCallback<String>() {

			public void onFailure(Throwable caught) {
				MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(),TrocaSenhaI18N.messages.cadastroErro(), null);
			}

			public void onSuccess(String result) {
				textLogin.setValue(result);
			}
		});
	}
	
	protected boolean isSenhaValida(){
		
		if(!textNovaSenha.getValue().equals(textConfirmacaoSenha.getValue())){
			MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(),TrocaSenhaI18N.messages.confirmacaoSenhaIncorreta(), null);
			return false;
		}
		else if(!textSenhaAtual.getValue().equals(usuario.getSenha())){
			MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(),TrocaSenhaI18N.messages.senhaAtualIncorreta(), null);
			return false;
		}
		else{
			return true;
		}
	}
	
	protected void obterUsuario(){
			
		service.obterUsuario(new AsyncCallback<Usuario>(){

			public void onFailure(Throwable caught) {
				MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(),TrocaSenhaI18N.messages.cadastroErro(), null);
			}

			public void onSuccess(Usuario result) {
				usuario = result;
				textLogin.setValue(usuario.getLogin());
			}
			
		});
	}
	
	
	@Override
	protected void onAjuda() {
		AjudaCadastroGeralWindow ajudaCadastroGeralWindow = new AjudaCadastroGeralWindow();
		ajudaCadastroGeralWindow.show();
	}
	
	@Override
	protected void onClearForm(){
		textSenhaAtual.reset();
		textNovaSenha.reset();
		textConfirmacaoSenha.reset();
	}
	
	protected boolean isDadosValidos(){
		
		if(!textSenhaAtual.isValid()){
			return false;
		}
		else if(!textNovaSenha.isValid()){
			return false;
		}
		else if(!textConfirmacaoSenha.isValid()){
			return false;
		}
		else{
			return true;
		}
	}
}
