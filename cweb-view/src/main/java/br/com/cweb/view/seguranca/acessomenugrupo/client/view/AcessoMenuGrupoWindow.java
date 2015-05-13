package br.com.cweb.view.seguranca.acessomenugrupo.client.view;

import java.util.ArrayList;
import java.util.List;
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
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.FieldEvent;
import com.extjs.gxt.ui.client.event.GridEvent;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.ComboBox;
import com.extjs.gxt.ui.client.widget.form.DualListField;
import com.extjs.gxt.ui.client.widget.form.ComboBox.TriggerAction;
import com.extjs.gxt.ui.client.widget.form.DualListField.Mode;
import com.extjs.gxt.ui.client.widget.form.FieldSet;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.ListField;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.grid.CheckColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.grid.GridSelectionModel;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteData;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteLayout;
import com.extjs.gxt.ui.client.widget.layout.FormData;
import com.extjs.gxt.ui.client.widget.toolbar.PagingToolBar;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import br.com.cweb.seguranca.persistence.entity.Funcionalidade;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;
import br.com.cweb.seguranca.persistence.entity.TipoPermissao;
import br.com.cweb.seguranca.persistence.entity.Usuario;
import br.com.cweb.view.cadastro.cadastrogeral.client.i18n.CadastroGeralI18N;
import br.com.cweb.view.desktop.client.contexto.WebApplication;
import br.com.cweb.view.seguranca.acessomenugrupo.client.service.AcessoMenuGrupoServiceFacade;
import br.com.cweb.view.seguranca.acessomenugrupo.client.service.AcessoMenuGrupoServiceFacadeAsync;
import br.com.cweb.view.seguranca.cadastrogrupoacesso.client.i18n.CadastroGrupoAcessoI18N;
import br.com.cweb.view.template.client.TemplateWindow;
import br.com.cweb.widgets.action.RpcWaitCallback;
import br.com.cweb.widgets.build.BeanModelBuilder;
import br.com.cweb.widgets.constants.Permissoes;
import br.com.cweb.widgets.window.IWindow;
import br.com.cweb.widgets.window.IWindowConfig;

public class AcessoMenuGrupoWindow extends TemplateWindow{

	AcessoMenuGrupoServiceFacadeAsync service = GWT.create(AcessoMenuGrupoServiceFacade.class);

	private TextField<String> textDescricao;
	private LayoutContainer containerPrincipal;
	private ContentPanel panelPrincipal;
	private FormPanel form;
	private Grid<BeanModel> grid;
	private PagingToolBar toolBar;
	private static final int PAGE_SIZE = 5;
	private List<CheckColumnConfig> plugins;
	private final DualListField<BeanModel> dualListFieldPermissoes = new DualListField<BeanModel>();  
	private ListField<BeanModel> fromPermissoes, toPermissoes;
	private ComboBox<BeanModel> comboModulos;

	public AcessoMenuGrupoWindow(IWindowConfig cfg) {
		
		plugins = new ArrayList<CheckColumnConfig>();
		setWindowConfig(cfg);
		setMinimizable(true);
		setResizable(false);
		setSize("882px", "650px");
		setHeading(CadastroGrupoAcessoI18N.constants.title());
		new FormPanel().setBodyStyle(bbarStyle);
		containerPrincipal = new LayoutContainer();
		containerPrincipal.setId("id_ContainerPrincipal");
		//containerPrincipal.setBorders(true);
		//containerPrincipal.setHeight("600px");
		
		panelPrincipal = new ContentPanel();
		panelPrincipal.setId("id_PanelPrincipal");
		panelPrincipal.setHeaderVisible(false);
		panelPrincipal.setButtonAlign(HorizontalAlignment.LEFT);
		panelPrincipal.setAutoWidth(true);
		//panelPrincipal.setAutoHeight(true);
		//panelPrincipal.setSize("800px", "700px");
		panelPrincipal.add(getForm());
		containerPrincipal.add(panelPrincipal);
		add(containerPrincipal);
		add(getContainerBotoes());
//		add(getResultado());
		//atualizarGrid();
	}
	
	private Component getForm() {
	
		form = new FormPanel();
		form.setId("idFormGa");
		form.setHeaderVisible(false);
		//form.setHeight("400px");
	
		
		textDescricao = new TextField<String>();
		textDescricao.setId("idDesc");
		textDescricao.setAllowBlank(false);
		//textDescricao.setFieldLabel("Grupo de Acesso");
		textDescricao.setReadOnly(true);
		
		GrupoAcesso grupoAcesso = obterObjetoDominio();
		textDescricao.setValue(grupoAcesso.getNome());
		textDescricao.setBorders(false);
		//form.add(textDescricao);
		
		FieldSet fieldSetGrupoAcesso = new FieldSet();
		fieldSetGrupoAcesso.setHeading("Grupo de Acesso");
		fieldSetGrupoAcesso.add(textDescricao, new AbsoluteData());
		form.add(fieldSetGrupoAcesso, new FormData("98%"));  
		
		iniciarComboModulos();
		
		FieldSet fieldSetComboModulos = new FieldSet();
		fieldSetComboModulos.setHeading("Modulos");
		fieldSetComboModulos.add(comboModulos, new AbsoluteData());
		form.add(fieldSetComboModulos, new FormData("98%"));  
		
		FieldSet fieldSetFuncionalidades = new FieldSet();
		fieldSetFuncionalidades.setHeading("Funcionalidades");
		fieldSetFuncionalidades.add(getResultado(), new AbsoluteData());
		form.add(fieldSetFuncionalidades, new FormData("98%"));  
		
		configurePermissoes();
		iniciaPermissoes();
		
		FieldSet fieldSetPermissoes = new FieldSet();
	    fieldSetPermissoes.setHeading("Permissoes");
	    fieldSetPermissoes.add(dualListFieldPermissoes, new AbsoluteData());
	    form.add(fieldSetPermissoes, new FormData("98%"));  
		
		return form;
	}
	
	private Component getResultado(){
		
		ContentPanel panelGrid = new ContentPanel();
		panelGrid.setId("idContainerGrid");
		
		grid = getGridConsulta();
		grid.setId("idGrid");
		grid.setAutoExpandColumn("nome");
		
		grid.addListener(Events.RowClick, new Listener<GridEvent>(){

			public void handleEvent(GridEvent be) {
				
				BeanModel beanModel = grid.getSelectionModel().getSelectedItem();
				Long idFuncionalidade =  beanModel.get("id");
				
				Funcionalidade funcionalidade = new Funcionalidade();
				funcionalidade.setId(idFuncionalidade);
				
				GrupoAcesso grupoAcesso = (GrupoAcesso) obterObjetoDominio();
				
				carregarPermissoesPorFuncionalidade(funcionalidade,grupoAcesso);
			}
			
		});
		
		
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
	 column.setHeader("Funcionalidade");    
	 //column.setWidth(400);    
	
	 
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
		grid.setSize("200px", "150px");
		grid.setBorders(true);
		grid.setAutoWidth(true);
		loadPluginGrid();
		
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
				
				GrupoAcesso grupoAcesso = (GrupoAcesso) obterObjetoDominio();
				
				BeanModel beanModel = comboModulos.getValue();
				Long idModulo = beanModel.get("id");
				
				service.retornaListaPaginadaFuncionalidades((PagingLoadConfig)loadConfig,idModulo,callback);
				
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
	
	protected GrupoAcesso obterObjetoDominio(){
		
		GrupoAcesso grupoAcesso = (GrupoAcesso) getWindowConfig().getParameters().get(IWindow.DOMAIN_OBJECT);
		return grupoAcesso;
	}
	
	private Component getContainerBotoes(){
		
		/* define o container para os botoes de pesquisa */
		LayoutContainer containerBotoes = new LayoutContainer();
		containerBotoes.setId("id_ContainerBotoes");
		
		/* define o layout para o container*/
		AbsoluteLayout layoutBotoes = new AbsoluteLayout();		
		containerBotoes.setLayout(layoutBotoes);
		
		/* define os botoes*/
		
		Button btnLimpar = new Button(CadastroGeralI18N.constants.limpar());
		btnLimpar.setId("id_BtnAlterar");
		btnLimpar.setData(IWindow.OPERATION, Permissoes.LIMPAR);
		addSecurityButton(btnLimpar);
		
		Button btnIncluir = new Button(CadastroGeralI18N.constants.incluir());
		btnIncluir.setId("id_BtnIncluir");
		btnIncluir.setData(IWindow.OPERATION, Permissoes.INCLUIR);
		addSecurityButton(btnIncluir);
		
		Button btnVoltar = new Button("Voltar");
		btnVoltar.setId("id_BtnImprimir");
		btnVoltar.setData(IWindow.OPERATION, Permissoes.VOLTAR);
		addSecurityButton(btnVoltar);
		
		btnVoltar.addSelectionListener(new SelectionListener<ButtonEvent>() {
			@Override
			public void componentSelected(ButtonEvent ce) {
				close();
			}
			
		});
		
		
		btnLimpar.addSelectionListener(new SelectionListener<ButtonEvent>() {
			@Override
			public void componentSelected(ButtonEvent ce) {
				atualizarGrid();
			}
			
		});
		
		btnIncluir.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				
				BeanModel beanModel = grid.getSelectionModel().getSelectedItem();
				Long idFuncionalidade =  beanModel.get("id");
				
				Funcionalidade funcionalidade = new Funcionalidade();
				funcionalidade.setId(idFuncionalidade);
				
				/* Grupo de Acesso selecionado*/
				GrupoAcesso grupoAcesso = (GrupoAcesso) getWindowConfig().getParameters().get(IWindow.DOMAIN_OBJECT);
				
				Usuario usuario = new Usuario();
				usuario.setId(WebApplication.getInstance().getUsuarioLogado().getId());
				
				List<BeanModel> listaBeanModel = toPermissoes.getStore().getModels();
				
				List<TipoPermissao> listaPermissoes = beanModelToPojo(listaBeanModel);
				
				salvarPermissoesSelecionadas(listaPermissoes,grupoAcesso,funcionalidade,usuario);
				
				
			}
		});
		
		/* tooltips para os botoes */
		btnLimpar.setToolTip(CadastroGeralI18N.tooltip.botaoAlterar());
		btnIncluir.setToolTip(CadastroGeralI18N.tooltip.botaoIncluir());
		btnVoltar.setToolTip(CadastroGeralI18N.tooltip.botaoImprimir());
		btnLimpar.setToolTip(CadastroGeralI18N.tooltip.botaoAlterar());
		
		/* adiciona os botoes ao grid */
		containerBotoes.add(btnLimpar, new AbsoluteData(752, 6));
		containerBotoes.add(btnIncluir, new AbsoluteData(706, 6));
		containerBotoes.add(btnVoltar,new AbsoluteData(803, 6));
		containerBotoes.setSize("868", "32");
	
		return containerBotoes;
	}
	
	protected void loadPluginGrid(){
		
		for(CheckColumnConfig plugin:plugins){
			grid.addPlugin(plugin);
		}
	}
	
	@Override
	protected void onAjuda() {
		AjudaAcessoMenuGrupoWindow ajudaAcessoMenuGrupoWindow = new AjudaAcessoMenuGrupoWindow();
		ajudaAcessoMenuGrupoWindow.show();
	}
	
	@Override
	protected void onClearForm(){
		form.clear();
	}
	
	private void clearPermissoes(){
		
		fromPermissoes.getStore().removeAll();
		toPermissoes.getStore().removeAll();
	}
	
	
	private void iniciaPermissoes(){
		
		toPermissoes.setStore(new ListStore<BeanModel>());
		fromPermissoes.setStore(new ListStore<BeanModel>());
		
	}
	
	private void configurePermissoes(){
		
		dualListFieldPermissoes.setMode(Mode.INSERT);  
		dualListFieldPermissoes.setFieldLabel("Permissoes");  
	   
		fromPermissoes = dualListFieldPermissoes.getFromList();  
	    fromPermissoes.setDisplayField("nome");  
	   
	    toPermissoes = dualListFieldPermissoes.getToList();
	    toPermissoes.setDisplayField("nome");  

	}
	
	
	private void carregarPermissoesPorFuncionalidade(Funcionalidade funcionalidade,GrupoAcesso grupoAcesso){
		
		clearPermissoes();
		
		service.obterPermissoesPertencemFuncionalidade(funcionalidade,grupoAcesso, new RpcWaitCallback<List<TipoPermissao>>("Carregando Permissoes..."){

			public void handleResponse(java.util.List<TipoPermissao> result) {
				
				toPermissoes.getStore().add(BeanModelBuilder.buildListBeanModel(result, TipoPermissao.class));
			};
				
		});
		
		service.obterPermissoesNaoPertencemFuncionalidade(funcionalidade,grupoAcesso, new RpcWaitCallback<List<TipoPermissao>>("Carregando Permissoes..."){

			public void handleResponse(java.util.List<TipoPermissao> result) {
				
				fromPermissoes.getStore().add(BeanModelBuilder.buildListBeanModel(result, TipoPermissao.class));
			}
			
		});
		
		service.obterPermissoesCadastradas(funcionalidade, new RpcWaitCallback<List<TipoPermissao>>("Carregando Permissoes..."){

			public void handleResponse(java.util.List<TipoPermissao> result) {
				
				if(result != null && result.size() > 0){
					fromPermissoes.getStore().add(BeanModelBuilder.buildListBeanModel(result, TipoPermissao.class));
				}
			}
		});
	}
	
	private void carregarPermissoesCadastradas(Funcionalidade funcionalidade){
		
		service.obterPermissoesCadastradas(funcionalidade,new RpcWaitCallback<List<TipoPermissao>>("Carregando Permissoes..."){

			public void handleResponse(java.util.List<TipoPermissao> result) {
				
				fromPermissoes.getStore().add(BeanModelBuilder.buildListBeanModel(result, TipoPermissao.class));
			}
		});
	}
	
	private void salvarPermissoesSelecionadas(List<TipoPermissao> listaPermissoes,GrupoAcesso grupoAcesso,
			
			Funcionalidade funcionalidade,Usuario usuario){
		
		
		service.salvarPermissoesSelecionadas(listaPermissoes, grupoAcesso, funcionalidade, usuario, new RpcWaitCallback("Salvando Permmissoes...") {

			@Override
			public void handleResponse(Object value) {
				
				MessageBox.info("", "Permissoes Persistidas com Sucesso...", null);
			}
		});
		
		
		
	}
	
	private List<TipoPermissao> beanModelToPojo(List<BeanModel> listaBeanModel){
		
		List<TipoPermissao> listaPermissoes= new ArrayList<TipoPermissao>();
		
		for(BeanModel beanModel:listaBeanModel){
			
			if(beanModel == null){
				continue;
			}
			
			TipoPermissao tipoPermissao = beanModel.getBean();
			listaPermissoes.add(tipoPermissao);
			
		}
		
		return listaPermissoes;
	}
	
	private void iniciarComboModulos(){
		
		configurarComboModulos();
		carregarComboModulos();
		addListenerComboModulos();
	}
	
	private void carregarComboModulos(){
		
		service.obterFuncionalidadeTipoModulo(new RpcWaitCallback<List<Funcionalidade>>("Carregando Modulos...") {

			@Override
			public void handleResponse(List<Funcionalidade> result) {
				
				comboModulos.getStore().add(BeanModelBuilder.buildListBeanModel(result, Funcionalidade.class));
				List<BeanModel> models = comboModulos.getStore().getModels();
				comboModulos.setValue(models.get(0));
				atualizarGrid();
				clearPermissoes();
			}
		});
		
	}
	
	private void configurarComboModulos(){
		
		comboModulos = new ComboBox<BeanModel>();;
		comboModulos.setDisplayField("nome");
		comboModulos.setAllowBlank(false);
		comboModulos.setTriggerAction(TriggerAction.ALL);
		comboModulos.setStore(new ListStore<BeanModel>());
	}
	
	private void addListenerComboModulos(){
		
		comboModulos.addListener(Events.Change, new Listener<FieldEvent>() {
			
			public void handleEvent(FieldEvent e) {
				atualizarGrid();
			}
		});
	}
	

}
