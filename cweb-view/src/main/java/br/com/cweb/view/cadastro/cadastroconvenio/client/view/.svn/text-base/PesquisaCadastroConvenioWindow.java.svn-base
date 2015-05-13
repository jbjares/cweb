package br.com.cweb.view.cadastro.cadastroconvenio.client.view;

import java.util.ArrayList;
import java.util.List;

import br.com.cweb.cadastro.persistence.entity.Convenio;
import br.com.cweb.relatorio.to.TipoFormatoRelatorio;
import br.com.cweb.relatorio.to.TipoNomeRelatorio;
import br.com.cweb.view.cadastro.cadastroconvenio.client.service.CadastroConvenioServiceFacade;
import br.com.cweb.view.cadastro.cadastroconvenio.client.service.CadastroConvenioServiceFacadeAsync;
import br.com.cweb.view.template.client.TemplateWindow;
import br.com.cweb.widgets.action.RpcWaitCallback;
import br.com.cweb.widgets.build.BeanModelBuilder;
import br.com.cweb.widgets.constants.Permissoes;
import br.com.cweb.widgets.window.AjudaCommonsWindow;
import br.com.cweb.widgets.window.IWindow;
import br.com.cweb.widgets.window.IWindowConfig;

import com.extjs.gxt.ui.client.Style.SelectionMode;
import com.extjs.gxt.ui.client.binding.Converter;
import com.extjs.gxt.ui.client.binding.FieldBinding;
import com.extjs.gxt.ui.client.binding.FormBinding;
import com.extjs.gxt.ui.client.data.BasePagingLoader;
import com.extjs.gxt.ui.client.data.BeanModel;
import com.extjs.gxt.ui.client.data.BeanModelReader;
import com.extjs.gxt.ui.client.data.LoadEvent;
import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.extjs.gxt.ui.client.data.PagingLoader;
import com.extjs.gxt.ui.client.data.RpcProxy;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.LoadListener;
import com.extjs.gxt.ui.client.event.SelectionChangedEvent;
import com.extjs.gxt.ui.client.event.SelectionChangedListener;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.FormPanel.LabelAlign;
import com.extjs.gxt.ui.client.widget.form.LabelField;
import com.extjs.gxt.ui.client.widget.form.Radio;
import com.extjs.gxt.ui.client.widget.form.RadioGroup;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.grid.GridSelectionModel;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteData;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteLayout;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.extjs.gxt.ui.client.widget.layout.VBoxLayout;
import com.extjs.gxt.ui.client.widget.layout.VBoxLayout.VBoxLayoutAlign;
import com.extjs.gxt.ui.client.widget.layout.VBoxLayoutData;
import com.extjs.gxt.ui.client.widget.toolbar.PagingToolBar;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import br.com.cweb.view.cadastro.cadastroconvenio.client.i18n.CadastroConvenioConstants;
import br.com.cweb.view.cadastro.cadastroconvenio.client.i18n.CadastroConvenioMessages;
import br.com.cweb.view.cadastro.cadastroconvenio.client.i18n.CadastroConvenioTooltip;

public class PesquisaCadastroConvenioWindow extends TemplateWindow {
	private static final CadastroConvenioTooltip TOOLTIPS = GWT.create(CadastroConvenioTooltip.class);
	private static final CadastroConvenioConstants CONSTANTS = GWT.create(CadastroConvenioConstants.class);
	private static final CadastroConvenioMessages MESSAGES = GWT.create(CadastroConvenioMessages.class);

	CadastroConvenioServiceFacadeAsync service = GWT
			.create(CadastroConvenioServiceFacade.class);

	private Grid<BeanModel> grid;

	private TextField<String> textDescricao;
	private Radio radioSituacaoAtiva;
	private Radio radioSituacaoInativa;

	private PagingToolBar toolBar;

	private ContentPanel containerPrincipal;
	private ContentPanel panelGrid;

	// TODO Incluir como parametro padrao do appcontext
	private static int PAGE_SIZE = 10;

	private Button btnPesquisar;

	private Button btnLimpar;

	private Button btnAlterar;

	private Button btnAjuda;

	private Button btnImprimir;
	private Button btnNovo;

	protected IncluirAlterarCadastroConvenioWindow incluirAlterarCadastroConvenioWindow;

	private AjudaCommonsWindow ajuda;
	private Button btnExcluir;

	private FormBinding formBinding;

	private FormPanel formPesquisa;

	public PesquisaCadastroConvenioWindow() {
		setMaximizable(true);
		setInitialWidth(524);
		setMinHeight(371);
		setMinWidth(524);

		this.setId("id_pesquisaCadastroConvenio");
		setMinimizable(true);
		setSize("524px", "371px");
		setHeading(CONSTANTS.janelaPesquisaTitulo());
		new FormPanel().setBodyStyle(bbarStyle);
		VBoxLayout boxLayout = new VBoxLayout();
		boxLayout.setVBoxLayoutAlign(VBoxLayoutAlign.STRETCHMAX);
		setLayout(boxLayout);
		containerPrincipal = new ContentPanel();
		containerPrincipal.setHeaderVisible(false);
		containerPrincipal.setHeight(125);
		containerPrincipal.setId("id_pesquisaCadastroConvenio_containerPrincipal");
		containerPrincipal.setBorders(true);
		containerPrincipal.setLayout(new FitLayout());

		formPesquisa = new FormPanel();
		formPesquisa.setLabelAlign(LabelAlign.TOP);
		formPesquisa.setId("id_PesquisaCadastroConvenioWindow_formPesquisa");
		formPesquisa.setHeaderVisible(false);
		formPesquisa.setHeading("Principal");
		formPesquisa.setCollapsible(false);
		formPesquisa.setLayout(new AbsoluteLayout());

		textDescricao = new TextField<String>();
		textDescricao.setFieldLabel("Descrição");
		textDescricao.setId("id_pesquisaCadastroConvenio_textDescricao");
		textDescricao.setToolTip(TOOLTIPS.nomePesquisa());
		textDescricao.setName("nome");

		formPesquisa.add(textDescricao, new AbsoluteData(20, 63));
		textDescricao.setSize("273px", "22px");

		RadioGroup groupSituacao = new RadioGroup();
		groupSituacao.setId("id_pesquisaCadastroConvenio_groupSituacao");
		groupSituacao.setName("nome_mudar");

		radioSituacaoAtiva = new Radio();
		groupSituacao.add(radioSituacaoAtiva);
		radioSituacaoAtiva.setSize("60px", "22px");
		radioSituacaoAtiva.setId("id_pesquisaCadastroConvenio_radioSituacaoAtiva");
		radioSituacaoAtiva.setToolTip(TOOLTIPS.ativo());
		radioSituacaoAtiva.setHideLabel(true);
		radioSituacaoAtiva.setBoxLabel(CONSTANTS.ativo());
		radioSituacaoAtiva.setName("ativo");

		radioSituacaoInativa = new Radio();
		groupSituacao.add(radioSituacaoInativa);
		radioSituacaoInativa.setSize("74px", "22px");
		radioSituacaoInativa.setId("id_pesquisaCadastroConvenio_radioSituacaoInativa");
		radioSituacaoInativa.setToolTip(TOOLTIPS.inativo());
		radioSituacaoInativa.setBoxLabel(CONSTANTS.inativo());
		radioSituacaoInativa.setName("inativo");
		formPesquisa.add(groupSituacao, new AbsoluteData(299, 63));
		groupSituacao.setSize("129px", "22px");
		groupSituacao.setFieldLabel("Situação");

		LabelField lblfldDescrioDoConvnio = new LabelField(CONSTANTS.nome());
		lblfldDescrioDoConvnio.setToolTip(TOOLTIPS.nomePesquisa());
		lblfldDescrioDoConvnio.setFieldLabel("nome");
		formPesquisa.add(lblfldDescrioDoConvnio, new AbsoluteData(20, 36));

		LabelField lblfldSituao = new LabelField(CONSTANTS.situacao());
		lblfldSituao.setToolTip(TOOLTIPS.situacaoPesquisa());
		lblfldSituao.setFieldLabel("situacao");
		formPesquisa.add(lblfldSituao, new AbsoluteData(299, 38));
		lblfldSituao.setSize("126px", "19px");

		containerPrincipal.add(formPesquisa);
		formPesquisa.setHeight("129px");
		btnPesquisar = new Button(CONSTANTS.pesquisar());
		
		btnPesquisar.setData(IWindow.OPERATION, Permissoes.PESQUISAR);
		addSecurityButton(btnPesquisar);
		
		containerPrincipal.addButton(btnPesquisar);
		btnPesquisar.setId("id_pesquisaCadastroConvenio_btnPesquisar");
		btnPesquisar.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				atualizarGrid();
			}

		});
		btnPesquisar.setToolTip(TOOLTIPS.pesquisar());
		
		btnNovo = new Button(CONSTANTS.novo());
		btnNovo.setToolTip(TOOLTIPS.novo());
		
		btnNovo.setData(IWindow.OPERATION, Permissoes.NOVO);
		addSecurityButton(btnNovo);
		
		containerPrincipal.addButton(btnNovo);
		btnNovo.setId("id_pesquisaCadastroConvenio_btnNovo");
		btnNovo.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				onNovo();
			}

		});
		btnNovo.setWidth("60");
		btnAlterar = new Button(CONSTANTS.alterar());
		containerPrincipal.addButton(btnAlterar);
		btnAlterar.setEnabled(false);
		btnAlterar.setSize("60", "22");
		
		btnAlterar.setData(IWindow.OPERATION, Permissoes.ALTERAR);
		addSecurityButton(btnAlterar);
		
		btnAlterar.setId("id_PesquisaCadastroConvenioWindow_BtnAlterar");

		btnAlterar.addSelectionListener(new SelectionListener<ButtonEvent>() {
			@Override
			public void componentSelected(ButtonEvent ce) {
				onAlterar();
			}

		});
		btnAlterar.setToolTip(TOOLTIPS.alterar());

		btnExcluir = new Button(CONSTANTS.excluir());
		containerPrincipal.addButton(btnExcluir);
		btnExcluir.setEnabled(false);
		btnExcluir.setId("id_PesquisaCadastroConvenioWindow_BtnExcluir");
		btnExcluir.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				onExcluir();
			}
		});
		btnExcluir.setToolTip(TOOLTIPS.excluirPesquisa());
		btnExcluir.setSize("60", "22");
		
		btnExcluir.setData(IWindow.OPERATION, Permissoes.EXCLUIR);
		addSecurityButton(btnExcluir);
		
		btnLimpar = new Button(CONSTANTS.limpar());
		containerPrincipal.addButton(btnLimpar);
		btnLimpar.setId("id_pesquisaCadastroConvenio_btnLimpar");

		btnLimpar.addSelectionListener(new SelectionListener<ButtonEvent>() {

			@Override
			public void componentSelected(ButtonEvent ce) {
				onClearForm();
			}
		});
		btnLimpar.setToolTip(TOOLTIPS.limpar());
		btnLimpar.setWidth("60");
		btnImprimir = new Button(CONSTANTS.imprimir());
		
		btnLimpar.setData(IWindow.OPERATION, Permissoes.LIMPAR);
		addSecurityButton(btnLimpar);
		
		containerPrincipal.addButton(btnImprimir);
		btnImprimir.setEnabled(false);
		btnImprimir.setId("id_PesquisaCadastroConvenioWindow_BtnImprimir");

		btnImprimir.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				if (grid.getStore().getModels().isEmpty()) {
					return;
				}
				Convenio convenio = getObjetoConvenioPopuladoPelaTela();

				service.gerarRelatorio(
						convenio,
						new RpcWaitCallback<Void>(MESSAGES.aguarde(), MESSAGES.processando()) {

							@Override
							public void handleResponse(Void vvoid) {
								exibirRelatorio(
										TipoNomeRelatorio.CADASTRO_CONVENIO,
										TipoFormatoRelatorio.PDF);
							}

							@Override
							public void handleFailure(Throwable exception) {
								MessageBox
										.alert(MESSAGES.tituloFalha(),
												MESSAGES.falhaNaOperacao(),
												null);
							}

						});
			}

		});
		btnImprimir.setToolTip(TOOLTIPS.limpar());
		btnImprimir.setSize("60px", "22px");
		
		btnImprimir.setData(IWindow.OPERATION, Permissoes.IMPRIMIR);
		addSecurityButton(btnImprimir);
		
		btnAjuda = new Button(CONSTANTS.ajudar());
		containerPrincipal.addButton(btnAjuda);
		btnAjuda.setWidth("60");
		btnAjuda.setId("id_pesquisaCadastroConvenio_btnAjuda");

		btnAjuda.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				onAjuda();
			}
		});
		btnAjuda.setToolTip(TOOLTIPS.ajudar());
		
		btnAjuda.setData(IWindow.OPERATION, Permissoes.AJUDA);
		addSecurityButton(btnAjuda);
		
		VBoxLayoutData vbld_containerPrincipal = new VBoxLayoutData();
		vbld_containerPrincipal.setFlex(1.0);
		add(containerPrincipal, vbld_containerPrincipal);
		containerPrincipal.setHeight("125");

		formBinding = new FormBinding(formPesquisa, true);
		formBinding.addFieldBinding(new FieldBinding(groupSituacao,
				"possuiCadastroAtivo"));
		formBinding.getBinding(groupSituacao).setConverter(new Converter() {

			public Object convertModelValue(Object value) {
				if (Boolean.TRUE.equals(value))
					return radioSituacaoAtiva;
				else
					return radioSituacaoInativa;
			}

			public Object convertFieldValue(Object value) {
				if (value != null && value == radioSituacaoAtiva)
					return Boolean.TRUE;
				else
					return Boolean.FALSE;
			}
		});

		VBoxLayoutData vbld_panelGrid = new VBoxLayoutData();
		vbld_panelGrid.setFlex(1.0);
		panelGrid = getPanelGrid();
		add(panelGrid, vbld_panelGrid);

	}

	protected void onAlterar() {
		getCadastroWindow().showToUpdate(
				(BeanModel) grid.getSelectionModel().getSelectedItem());
	}

	protected void onExcluir() {
		getCadastroWindow().showToRemove(
				(BeanModel) grid.getSelectionModel().getSelectedItem());
	}

	private void onNovo() {
		BeanModel beanModel = createNewBeanModel();
		getCadastroWindow().showToInsert(beanModel);
	}

	private BeanModel createNewBeanModel() {
		Convenio convenio = new Convenio();
		convenio.setPossuiCadastroAtivo(true);
		BeanModel beanModel = BeanModelBuilder.buildBeanModel(convenio,
				Convenio.class);
		return beanModel;
	}

	private ContentPanel getPanelGrid() {

		grid = getGridConsulta();
		panelGrid = new ContentPanel();
		panelGrid.setWidth(-1);
		panelGrid.setId("id_pesquisaCadastroConvenio_panelGrid");
		panelGrid.add(grid);
		panelGrid.setBottomComponent(toolBar);
		panelGrid.setHeading(CONSTANTS.headingGrid()); 
		return panelGrid;
	}

	private ColumnModel getColumnModel() {
		List<ColumnConfig> configs = new ArrayList<ColumnConfig>();

		ColumnConfig column = new ColumnConfig();
//		column.setId("id");
//		column.setHeader("Nº");
//		column.setWidth(70);
//		configs.add(column);

		column = new ColumnConfig();
		column.setId("nome");
		column.setHeader(CONSTANTS.nome());
		column.setWidth(200);
		configs.add(column);

		column = new ColumnConfig();
		column.setId("situacao");
		column.setHeader(CONSTANTS.situacao());
		column.setWidth(80);

		configs.add(column);

		ColumnModel columnModel = new ColumnModel(configs);

		return columnModel;
	}

	public Grid<BeanModel> getGridConsulta() {
		ColumnModel columnModel = getColumnModel();
		grid = new Grid<BeanModel>(new ListStore<BeanModel>(), columnModel);
		grid.setLoadMask(true);
		grid.setId("id_pesquisaCadastroConvenio_grid");
		grid.setColumnReordering(true);
		grid.setVisible(true);
		grid.setColumnLines(true);
		grid.setStripeRows(true);
		grid.setSize("700", "120");
		grid.setBorders(true);
		grid.setAutoWidth(true);

		grid.getSelectionModel().addSelectionChangedListener(
				new SelectionChangedListener<BeanModel>() {

					@Override
					public void selectionChanged(
							SelectionChangedEvent<BeanModel> se) {
						
						if(isRenderButton(btnAlterar) && isRenderButton(btnExcluir)){
							btnAlterar.setEnabled(se.getSelection().size() == 1);
							btnExcluir.setEnabled(se.getSelection().size() == 1);
						}
					}
				});

		GridSelectionModel<BeanModel> selectModel = grid.getSelectionModel();
		selectModel.setSelectionMode(SelectionMode.SINGLE);

		toolBar = new PagingToolBar(PAGE_SIZE);
		toolBar.setId("id_pesquisaCadastroConvenio_toolBar");

		attachedLoaderToGrid();

		return grid;
	}

	protected IncluirAlterarCadastroConvenioWindow getCadastroWindow() {
		if (incluirAlterarCadastroConvenioWindow == null)
			incluirAlterarCadastroConvenioWindow = new IncluirAlterarCadastroConvenioWindow(
					grid.getStore());
		
		IWindowConfig cfg = this.getWindowConfig();
		incluirAlterarCadastroConvenioWindow.setWindowConfig(cfg);
		return incluirAlterarCadastroConvenioWindow;
	}

	private void attachedLoaderToGrid() {
		RpcProxy proxyGrid = new RpcProxy() {
			@Override
			protected void load(Object loadConfig, AsyncCallback callback) {
				service.retornaListaPaginadaConvenio(
						(PagingLoadConfig) loadConfig,
						getObjetoConvenioPopuladoPelaTela(), callback);
			}

		};

		BeanModelReader readerGrid = new BeanModelReader();
		PagingLoader<PagingLoadResult<BeanModel>> loader = new BasePagingLoader<PagingLoadResult<BeanModel>>(
				proxyGrid, readerGrid);

		ListStore<BeanModel> store = new ListStore<BeanModel>(loader);

		toolBar.bind(loader);
		grid.reconfigure(store, getColumnModel());

		loader.addLoadListener(new LoadListener() {
			public void loaderLoad(LoadEvent le) {
				PagingLoader<PagingLoadResult<BeanModel>> loader = (PagingLoader<PagingLoadResult<BeanModel>>) le.loader;
				
				if(isRenderButton(btnImprimir)){
					btnImprimir.setEnabled(loader.getTotalCount() > 0);
				}
			}
		});

	}

	private void atualizarGrid() {
		ListStore<BeanModel> store = grid.getStore();
		PagingLoader<PagingLoadResult<BeanModel>> loader = (PagingLoader<PagingLoadResult<BeanModel>>) store
				.getLoader();
		loader.load();
	}

	private Convenio getObjetoConvenioPopuladoPelaTela() {
		BeanModel beanModel = (BeanModel) formBinding.getModel();

		if (beanModel == null) {
			beanModel = createNewBeanModel();
			formBinding.bind(beanModel);
		}

		Convenio convenio = beanModel.getBean();

		return convenio;
	}

	@Override
	protected void onAjuda() {
		if (ajuda == null)
			ajuda = new AjudaCommonsWindow(
					"id_AjudaCadastroConvenioWindow",
					"Gerênciar Convênios - Ajuda",
					"\r\nFuncionalidade:\r\n- Manter Cadastro de Convênio dos Planos Bancários    "
							+ "\r\n\r\nObjetivo:\r\n- Incluir, alterar ou excluir informa\u00E7\u00F5es cadastrais sobre Convênios.   "
							+ "\r\n\r\nA\u00E7\u00E3o: Incluir \r\n- Orienta\u00E7\u00E3o: Para realizar a a\u00E7\u00E3o de incluir \u00E9  preciso preencher o campo descri\u00E7\u00E3o, selecionar a situa\u00E7\u00E3o e clicar em salvar. "
							+ "\r\n\r\nA\u00E7\u00E3o: Alterar \r\n- Orienta\u00E7\u00E3o: Para realizar a a\u00E7\u00E3o de alterar \u00E9 preciso selecionar o registro na tela de consulta. O sistema retornar\u00E1 na tela de cadastro as informa\u00E7\u00F5es para altera\u00E7\u00E3o. "
							+ "\r\n\r\nA\u00E7\u00E3o: Excluir \r\n- Orienta\u00E7\u00E3o: Para realizar a a\u00E7\u00E3o de excluir \u00E9 preciso selecionar o registro na tela de consulta e clicar no bot\u00E3o Excluir.\r\nUm registro s\u00F3 pode ser exclu\u00EDdo do cadastro caso nenhuma outra informa\u00E7\u00E3o do sistema dependa deste registro. Por outro lado, o sistema poder\u00E1 executar a a\u00E7\u00E3o de alterar a situa\u00E7\u00E3o para inativo.    "
							+ "\r\n\r\nA\u00E7\u00E3o: Imprimir \r\n- Orienta\u00E7\u00E3o: Est\u00E1 op\u00E7\u00E3o permite a impressao das informa\u00E7\u00F5es apresentadas na tela de consulta.   "
							+ "\r\n\r\nA\u00E7\u00E3o: Limpar\r\n- Limpa todos os campos da tela");

		ajuda.show();
	}

	@Override
	protected void onClearForm() {

		formPesquisa.reset();

	}

	protected void onClearResult() {
		btnAlterar.setEnabled(false);
		btnImprimir.setEnabled(false);
		btnExcluir.setEnabled(false);
		grid.getStore().removeAll();
	}
}
