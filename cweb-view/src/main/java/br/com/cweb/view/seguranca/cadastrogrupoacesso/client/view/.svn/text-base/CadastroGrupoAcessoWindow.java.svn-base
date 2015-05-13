package br.com.cweb.view.seguranca.cadastrogrupoacesso.client.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.cweb.relatorio.to.TipoFormatoRelatorio;
import br.com.cweb.relatorio.to.TipoNomeRelatorio;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;
import br.com.cweb.seguranca.persistence.entity.TipoSituacaoGrupo;
import br.com.cweb.view.cadastro.cadastrogeral.client.i18n.CadastroGeralI18N;
import br.com.cweb.view.desktop.client.build.WindowAPI;
import br.com.cweb.view.desktop.client.i18n.DesktopI18N;
import br.com.cweb.view.seguranca.acessomenugrupo.client.view.AcessoMenuGrupoWindow;
import br.com.cweb.view.seguranca.cadastrogrupoacesso.client.i18n.CadastroGrupoAcessoI18N;
import br.com.cweb.view.seguranca.cadastrogrupoacesso.client.service.CadastroGrupoAcessoServiceFacade;
import br.com.cweb.view.seguranca.cadastrogrupoacesso.client.service.CadastroGrupoAcessoServiceFacadeAsync;
import br.com.cweb.view.template.client.TemplateWindow;
import br.com.cweb.widgets.action.RpcWaitCallback;
import br.com.cweb.widgets.constants.Function;
import br.com.cweb.widgets.constants.Permissoes;
import br.com.cweb.widgets.window.DefaultWindowConfig;
import br.com.cweb.widgets.window.IWindow;
import br.com.cweb.widgets.window.IWindowConfig;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.Style.SelectionMode;
import com.extjs.gxt.ui.client.data.BasePagingLoader;
import com.extjs.gxt.ui.client.data.BeanModel;
import com.extjs.gxt.ui.client.data.BeanModelReader;
import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.extjs.gxt.ui.client.data.PagingLoader;
import com.extjs.gxt.ui.client.data.RpcProxy;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.ComboBox.TriggerAction;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.SimpleComboBox;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.grid.GridSelectionModel;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteData;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteLayout;
import com.extjs.gxt.ui.client.widget.toolbar.PagingToolBar;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class CadastroGrupoAcessoWindow extends TemplateWindow{

	CadastroGrupoAcessoServiceFacadeAsync service = GWT.create(CadastroGrupoAcessoServiceFacade.class);

	private TextField<String> textDescricao;
	private SimpleComboBox<TipoSituacaoGrupo> comboSituacao;
	private LayoutContainer containerPrincipal;
	private ContentPanel panelPrincipal;
	private FormPanel form;
	private Grid<BeanModel> grid;
	private PagingToolBar toolBar;
	private static final int PAGE_SIZE = 5;
	public CadastroGrupoAcessoWindow() {
		
		setMinimizable(true);
		setResizable(false);
		setSize("882px", "375px");
		setHeading(CadastroGrupoAcessoI18N.constants.title());
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
		panelPrincipal.setSize("800", "300");
		panelPrincipal.add(getForm());
		containerPrincipal.add(panelPrincipal);
		add(containerPrincipal);
		add(getContainerBotoes());
		add(getResultado());
		atualizarGrid();
	}
	
	private Component getForm() {
	
		form = new FormPanel();
		form.setId("idFormGa");
		form.setHeaderVisible(false);
		form.setHeight(100);
		
		textDescricao = new TextField<String>();
		textDescricao.setId("idDesc");
		textDescricao.setAllowBlank(false);
		textDescricao.setFieldLabel(CadastroGrupoAcessoI18N.constants.descricao());
		form.add(textDescricao);
		
		comboSituacao = new SimpleComboBox<TipoSituacaoGrupo>();
		comboSituacao.setId("idSituacao");
		comboSituacao.setAllowBlank(false);
		comboSituacao.add(Arrays.asList(TipoSituacaoGrupo.values()));
		comboSituacao.setFieldLabel(CadastroGrupoAcessoI18N.constants.situacao());
		comboSituacao.setTriggerAction(TriggerAction.ALL);
		
		form.add(comboSituacao);
		
		return form;
	}
	
	private Component getResultado(){
		
		ContentPanel panelGrid = new ContentPanel();
		panelGrid.setId("idContainerGrid");
		
		grid = getGridConsulta();
		grid.setId("idGrid");
		panelGrid = new ContentPanel();
		panelGrid.setId("id_PanelGrid");
		panelGrid.add(grid);
		panelGrid.setBottomComponent(toolBar);
		return panelGrid;
	}
	
	private ColumnModel getColumnModel() {
		 List<ColumnConfig> configs = new ArrayList<ColumnConfig>();  
		   
		 ColumnConfig column = new ColumnConfig();    
		 column.setId("nome");    
		 column.setHeader("Nome");    
		 column.setWidth(400);    
		 configs.add(column);  
		 
		 column = new ColumnConfig();    
		 column.setId("situacao");    
		 column.setHeader("Situacao");    
		 column.setWidth(445);
		 
		 configs.add(column);
		 
		 ColumnModel columnModel = new ColumnModel(configs);
		 
		 return columnModel;
	}
	
	public Grid<BeanModel> getGridConsulta() {
		ColumnModel columnModel = getColumnModel();
		grid = new Grid<BeanModel>(new ListStore(),columnModel);
		grid.setId("id_Grid");
		grid.setColumnReordering(true);
		grid.setVisible(true);
		grid.setColumnLines(true);
		grid.setStripeRows(true);
		grid.setSize("700", "150");
		grid.setBorders(true);
		grid.setAutoWidth(true);
		
		GridSelectionModel selectModel = grid.getSelectionModel();
		selectModel.setSelectionMode(SelectionMode.SINGLE);
		
		toolBar = new PagingToolBar(PAGE_SIZE);
		toolBar.setId("idBarGrupoAcesso");
		return grid;
	}
	
	private void atualizarGrid() {
		RpcProxy proxyGrid = new RpcProxy() {
			@Override
			protected void load(Object loadConfig, AsyncCallback callback) {
				service.retornaListaPaginadaGruposAcesso((PagingLoadConfig)loadConfig,callback);
			}

		};
			
		BeanModelReader readerGrid = new BeanModelReader();		
		PagingLoader<PagingLoadResult<BeanModel>> loader = 
				new BasePagingLoader<PagingLoadResult<BeanModel>>(proxyGrid,readerGrid);
		ListStore<BeanModel> store = new ListStore<BeanModel>(loader);
		loader.load();

		toolBar.bind(loader);
		grid.getStore().removeAll();
		grid.reconfigure(store, getColumnModel());		
	}
	
	private Component getContainerBotoes(){
		
		/* define o container para os botoes de pesquisa */
		LayoutContainer containerBotoes = new LayoutContainer();
		containerBotoes.setId("id_ContainerBotoes");
		
		/* define o layout para o container*/
		AbsoluteLayout layoutBotoes = new AbsoluteLayout();		
		containerBotoes.setLayout(layoutBotoes);
		
		/* define os botoes*/
		Button btnPesquisar = new Button(CadastroGeralI18N.constants.pesquisar());
		
		btnPesquisar.setData(IWindow.OPERATION, Permissoes.PESQUISAR);
		addSecurityButton(btnPesquisar);
		
		btnPesquisar.setId("id_BtnPesquisar");
		btnPesquisar.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				
			}

		});
		
		Button btnAcesso = new Button("Acesso ao Grupo");
		btnAcesso.setData(IWindow.OPERATION, Permissoes.ACESSO_GRUPO);
		addSecurityButton(btnAcesso);
		
		btnAcesso.setId("id_acesso");
		containerBotoes.add(btnAcesso,new AbsoluteData(505, 6));
		
		btnAcesso.addSelectionListener(new SelectionListener<ButtonEvent>(){

			@Override
			public void componentSelected(ButtonEvent ce) {
				BeanModel beanModel = grid.getSelectionModel().getSelectedItem();
				GrupoAcesso grupoAcesso = beanModel.getBean();
				
				IWindowConfig cfg =  getWindowConfig();
				
				if((cfg != null) && (cfg.getParameters() != null)){
					cfg.getParameters().put(IWindow.DOMAIN_OBJECT, grupoAcesso);
				}
				else{
					Map<String, Serializable> params = new HashMap<String, Serializable>();
					params.put(IWindow.DOMAIN_OBJECT, grupoAcesso);
					cfg =  new DefaultWindowConfig(params);
				}
				
				AcessoMenuGrupoWindow acessoMenuGrupoWindow = new AcessoMenuGrupoWindow(cfg);
				WindowAPI.buildWindow(acessoMenuGrupoWindow);
			}
		});
	
		
		Button btnLimpar = new Button(CadastroGeralI18N.constants.limpar());
		btnLimpar.setId("id_BtnLimpar");
		btnLimpar.setData(IWindow.OPERATION, Permissoes.LIMPAR);
		addSecurityButton(btnLimpar);
		
		Button btnAlterar = new Button(CadastroGeralI18N.constants.alterar());
		btnAlterar.setId("id_BtnAlterar");
		btnAlterar.setData(IWindow.OPERATION, Permissoes.ALTERAR);
		addSecurityButton(btnAlterar);
		
		Button btnIncluir = new Button(CadastroGeralI18N.constants.salvar());
		btnIncluir.setId("id_BtnIncluir");
		btnIncluir.setData(IWindow.OPERATION, Permissoes.SALVAR);
		addSecurityButton(btnIncluir);
		
		Button btnImprimir = new Button(CadastroGeralI18N.constants.imprimir());
		btnImprimir.setId("id_BtnImprimir");
		btnImprimir.setData(IWindow.OPERATION, Permissoes.IMPRIMIR);
		addSecurityButton(btnImprimir);
		
		btnAlterar.addSelectionListener(new SelectionListener<ButtonEvent>() {
			@Override
			public void componentSelected(ButtonEvent ce) {
				BeanModel beanModel = grid.getSelectionModel().getSelectedItem();
				if(beanModel==null){
					MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(),CadastroGeralI18N.messages.alterarSelecioneRegistro(), null);
					return;
				}
				
				GrupoAcesso grupoAcesso = beanModel.getBean();
				
				textDescricao.setValue(grupoAcesso.getNome());	
				
				if(grupoAcesso.getPossuiCadastroAtivo()){
					comboSituacao.setSimpleValue(TipoSituacaoGrupo.ATIVO);
					
				}
				else{
					comboSituacao.setSimpleValue(TipoSituacaoGrupo.INATIVO);
					grupoAcesso.setPossuiCadastroAtivo(false);
				}
				
				IWindowConfig cfg = getWindowConfig();
				cfg.getParameters().put(IWindow.OPERATION, Function.EDITAR);
				cfg.getParameters().put(IWindow.DOMAIN_OBJECT, grupoAcesso);
				
			}
			
		});
		
		btnIncluir.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				
				if(!isDadosValidos()){
					return ;
				}
				
				if(getOperacao() == null){
					
					IWindowConfig cfg = getWindowConfig();
					cfg.getParameters().put(IWindow.OPERATION, Function.INCLUIR);
					
				}
				
				if(getOperacao() == Function.EDITAR){

					GrupoAcesso grupoAcesso = (GrupoAcesso) getWindowConfig().getParameters().get(IWindow.DOMAIN_OBJECT);
					grupoAcesso.setNome(textDescricao.getValue());
					grupoAcesso.setPossuiCadastroAtivo(definirSituacaoGrupo());
					
					service.atualizarGrupoAcesso(grupoAcesso, new RpcWaitCallback<GrupoAcesso>(DesktopI18N.messages.aguarde(),DesktopI18N.messages.processando()) {
						
						@Override
						public void handleResponse(GrupoAcesso grupoAcesso) {
							MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(), CadastroGrupoAcessoI18N.messages.sucessOperation(), null);
							atualizarGrid();
						}
						
						@Override
						public void handleFailure(Throwable exception) {
							MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(), CadastroGrupoAcessoI18N.messages.errorOperation(), null);
						}
					
					});
				}
				else{
					
					GrupoAcesso grupoAcesso = new GrupoAcesso();
					grupoAcesso.setNome(textDescricao.getValue());
					grupoAcesso.setPossuiCadastroAtivo(definirSituacaoGrupo());
					
					service.incluirGrupoAcesso(grupoAcesso, new RpcWaitCallback<GrupoAcesso>(DesktopI18N.messages.aguarde(),DesktopI18N.messages.processando()) {
					
						@Override
						public void handleResponse(GrupoAcesso grupoAcesso) {
							MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(), CadastroGrupoAcessoI18N.messages.sucessOperation(), null);
							atualizarGrid();
						}
						
						@Override
						public void handleFailure(Throwable exception) {
							MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(), CadastroGrupoAcessoI18N.messages.errorOperation(), null);
						}
					
					});
				}
			}
		});
		
		Button btnExcluir = new Button(CadastroGeralI18N.constants.excluir());
		btnExcluir.setId("id_BtnExcluir");
		btnExcluir.setData(IWindow.OPERATION, Permissoes.EXCLUIR);
		addSecurityButton(btnExcluir);
		
		btnExcluir.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				BeanModel beanModel = grid.getSelectionModel().getSelectedItem();
				if(beanModel==null){
					MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(),CadastroGeralI18N.messages.excluirSelecioneRegistro(), null);
					return;
				}
				GrupoAcesso grupoAcesso = beanModel.getBean();

				service.excluirGrupoAcesso(grupoAcesso, new RpcWaitCallback<GrupoAcesso>(DesktopI18N.messages.aguarde(),DesktopI18N.messages.processando()) {
					
					@Override
					public void handleResponse(GrupoAcesso grupoAcesso) {
						MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(), CadastroGrupoAcessoI18N.messages.sucessOperation(), null);
						atualizarGrid();
					}
					
					@Override
					public void handleFailure(Throwable exception) {
						MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(), CadastroGrupoAcessoI18N.messages.errorOperation(), null);
					}
				
				});
				
			}
		});
		
		
		btnImprimir.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				
				service.gerarRelatorio(TipoNomeRelatorio.CADASTRO_GRUPO_ACESSO,TipoFormatoRelatorio.PDF, new RpcWaitCallback (DesktopI18N.messages.aguarde(),DesktopI18N.messages.processando()) {
					
					@Override
					public void handleResponse(Object value) {
						exibirRelatorio(TipoNomeRelatorio.CADASTRO_GRUPO_ACESSO,TipoFormatoRelatorio.PDF);
					}
					
					@Override
					public void handleFailure(Throwable exception) {
						MessageBox.alert("Alerta","Ocorreu um erro e o relatorio nao sera exibido." +
								" \nDetalhes:\n"+exception.getMessage(),null);
					}
				});
				
			}
		});
		
		btnLimpar.addSelectionListener(new SelectionListener<ButtonEvent>(){

			@Override
			public void componentSelected(ButtonEvent ce) {
				onClearForm();
			}
		});
		
		/* tooltips para os botoes */
		btnPesquisar.setToolTip(CadastroGeralI18N.tooltip.botaoPesquisar());
		btnLimpar.setToolTip(CadastroGeralI18N.tooltip.botaoLimpar());
		btnAlterar.setToolTip(CadastroGeralI18N.tooltip.botaoAlterar());
		btnIncluir.setToolTip(CadastroGeralI18N.tooltip.botaoIncluir());
		btnImprimir.setToolTip(CadastroGeralI18N.tooltip.botaoImprimir());
		btnAlterar.setToolTip(CadastroGeralI18N.tooltip.botaoAlterar());
		btnExcluir.setToolTip(CadastroGeralI18N.tooltip.botaoExcluir());
		
		/* adiciona os botoes ao grid */
//		containerBotoes.add(btnPesquisar, new AbsoluteData(540, 6));
		containerBotoes.add(btnLimpar, new AbsoluteData(606, 6));
		containerBotoes.add(btnAlterar, new AbsoluteData(752, 6));
		containerBotoes.add(btnIncluir, new AbsoluteData(706, 6));
		containerBotoes.add(btnExcluir, new AbsoluteData(656, 6));
		containerBotoes.add(btnImprimir,new AbsoluteData(803, 6));
		containerBotoes.setSize("868", "32");
	
		return containerBotoes;
	}
	
	protected boolean definirSituacaoGrupo(){
		
		TipoSituacaoGrupo situacaoGrupo = comboSituacao.getSimpleValue();
		
		if(situacaoGrupo == TipoSituacaoGrupo.ATIVO){
			return true;
		}
		else{
			return false;
		}
	}
	
	@Override
	protected void onAjuda() {
		AjudaCadastroGrupoAcessoWindow ajudaCadastroGrupoAcessoWindow = new AjudaCadastroGrupoAcessoWindow();
		ajudaCadastroGrupoAcessoWindow.show();
	}
	
	@Override
	protected void onClearForm(){
		form.clear();
	}
	
	protected boolean isDadosValidos(){
		
		if(!textDescricao.isValid()){
			return false;
		}
		else if(!comboSituacao.isValid()){
				return false;
		}
		else{
			return true;
		}
	}
	
	
}
