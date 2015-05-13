package br.com.cweb.view.cadastro.instituicaofinanceira.client.view;

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
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.MessageBoxEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.FieldSet;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.LabelField;
import com.extjs.gxt.ui.client.widget.form.NumberField;
import com.extjs.gxt.ui.client.widget.form.Radio;
import com.extjs.gxt.ui.client.widget.form.RadioGroup;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import br.com.cweb.widgets.i18n.WidgetsI18N;
import br.com.cweb.widgets.action.RpcWaitCallback;

import br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira;
import br.com.cweb.cadastro.persistence.entity.TipoInstituicao;
import br.com.cweb.relatorio.to.TipoFormatoRelatorio;
import br.com.cweb.relatorio.to.TipoNomeRelatorio;
import br.com.cweb.view.cadastro.instituicaofinanceira.client.i18n.InstituicaoFinanceiraI18N;
import br.com.cweb.view.cadastro.instituicaofinanceira.client.service.InstituicaoFinanceiraServiceFacade;
import br.com.cweb.view.cadastro.instituicaofinanceira.client.service.InstituicaoFinanceiraServiceFacadeAsync;
import br.com.cweb.view.desktop.client.build.WindowAPI;
import br.com.cweb.view.template.client.TemplateWindow;
import br.com.cweb.widgets.constants.Function;
import br.com.cweb.widgets.constants.Permissoes;
import br.com.cweb.widgets.window.DefaultWindowConfig;
import br.com.cweb.widgets.window.IWindow;
import br.com.cweb.widgets.window.IWindowConfig;

import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.GridSelectionModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteData;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteLayout;
import com.extjs.gxt.ui.client.widget.toolbar.PagingToolBar;

public class PesquisaInstituicaoFinanceiraWindow extends TemplateWindow{

	private static final int PAGE_SIZE = 10;

	InstituicaoFinanceiraServiceFacadeAsync service = GWT.create(InstituicaoFinanceiraServiceFacade.class);
	
	private LayoutContainer containerPrincipal;
	
	private ContentPanel panelPrincipal;
	
	private Radio radioTipoInstituicaoBanco;
	private Radio radioTipoInstituicaoParceiro;
	private Radio radioSituacaoInstituicaoAtivo;
	private Radio radioSituacaoInstituicaoInativo;
	private NumberField textCodigo;
	private TextField textSigla;
	private TextField textNome;
	private PagingToolBar toolBar;
	private Grid<BeanModel> grid;
	
	private Button btnPesquisar;
	private Button btnIncluir;
	private Button btnLimpar;
	private Button btnAlterar;
	private Button btnImprimir;

	private Button btnVisualizar;

	private ContentPanel panelGrid;	
		
	public PesquisaInstituicaoFinanceiraWindow() {
		this.setId("id_PesquisaCadastroInstituicaoFinanceiraWindow");
		setMinimizable(true);
		setResizable(false);
		setSize("784px", "493px");
		setHeading(InstituicaoFinanceiraI18N.constants.headingCadastroInstituicao()+" - "+"Pesquisa");
		new FormPanel().setBodyStyle(bbarStyle);
		containerPrincipal = new LayoutContainer();
		containerPrincipal.setId("id_PesquisaCadastroInstituicaoFinanceiraWindow_ContainerPrincipal");
		containerPrincipal.setBorders(true);
		
		panelPrincipal = new ContentPanel();
		panelPrincipal.setId("id_PesquisaInstituicaoFinanceiraWindow_PanelPrincipal");
		panelPrincipal.setHeaderVisible(false);		
		panelPrincipal.setButtonAlign(HorizontalAlignment.LEFT);
		panelPrincipal.setAutoWidth(true);
		panelPrincipal.setAutoHeight(true);
		panelPrincipal.setSize("800", "500");
		panelPrincipal.add(getContainerIdentificacaoInstituicao());
		
		containerPrincipal.add(panelPrincipal);
		
		add(containerPrincipal);
		add(getContainerBotoes());
		add(getPanelGrid());
	}
	
	private Component getPanelGrid() {
		
		grid = getGridConsulta();
		panelGrid = new ContentPanel();
		panelGrid.setId("id_PesquisaInstituicaoFinanceiraWindow_PanelGrid");
		panelGrid.add(grid);
		panelGrid.setBottomComponent(toolBar);
		panelGrid.setHeading(InstituicaoFinanceiraI18N.constants.headingGrid());
		return panelGrid;
	}

	private Grid<BeanModel> getGridConsulta() {
		
		ColumnModel columnModel = getColumnModel();
		grid = new Grid<BeanModel>(new ListStore(), columnModel);
		grid.setId("id_PesquisaInstituicaoFinanceiraWindow_Grid");
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
		toolBar.setId("id_PesquisaInstituicaoFinanceiraWindow_ToolBar");
		return grid;
		
	}

	private ColumnModel getColumnModel() {
		List<ColumnConfig> configs = new ArrayList<ColumnConfig>();  
		   
		 ColumnConfig column = new ColumnConfig();    
		 column.setId("id");    
		 column.setHeader(InstituicaoFinanceiraI18N.constants.codigo());    
		 column.setWidth(50);    
		 configs.add(column);  
		 
		 column = new ColumnConfig();    
		 column.setId("nome");    
		 column.setHeader(InstituicaoFinanceiraI18N.constants.nome());    
		 column.setWidth(250);
		 configs.add(column);
		 
		 column = new ColumnConfig();    
		 column.setId("sigla");    
		 column.setHeader(InstituicaoFinanceiraI18N.constants.sigla());    
		 column.setWidth(100);
		 configs.add(column);
		 
		 column = new ColumnConfig();
		 column.setId("situacao");
		 column.setHeader(InstituicaoFinanceiraI18N.constants.situacao());
		 column.setWidth(100);
		 configs.add(column);
		 		 
		 ColumnModel columnModel = new ColumnModel(configs);
		 
		 return columnModel;
	}

	private Component getContainerBotoes() {
	
		/* define o container para os botoes de pesquisa */
		LayoutContainer containerBotoes = new LayoutContainer();
		containerBotoes.setId("id_PesquisaInstituicaoFinanceiraWindow_ContainerBotoes");
		
		/* define o layout para o container*/
		AbsoluteLayout layoutBotoes = new AbsoluteLayout();		
		containerBotoes.setLayout(layoutBotoes);
		
		/* define os botoes*/
		btnPesquisar = new Button(InstituicaoFinanceiraI18N.constants.pesquisar());
		btnPesquisar.setData(IWindow.OPERATION, Permissoes.PESQUISAR);
		addSecurityButton(btnPesquisar);
		
		btnPesquisar.setId("id_PesquisaInstituicaFinanceiraWindow_BtnPesquisar");
		btnPesquisar.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				atualizarGrid();
			}
		});
		
		btnLimpar = new Button(InstituicaoFinanceiraI18N.constants.limpar());
		btnLimpar.setId("id_PesquisaInstituicaFinanceiraWindow_BtnLimpar");
		btnLimpar.setData(IWindow.OPERATION, Permissoes.LIMPAR);
		addSecurityButton(btnLimpar);
		
		btnAlterar = new Button(InstituicaoFinanceiraI18N.constants.alterar());
		btnAlterar.setId("id_PesquisaCadastroGeralWindow_BtnAlterar");
		btnAlterar.setData(IWindow.OPERATION, Permissoes.ALTERAR);
		addSecurityButton(btnAlterar);
		
		btnIncluir = new Button(InstituicaoFinanceiraI18N.constants.incluir());
		btnIncluir.setId("id_PesquisaCadastroGeralWindow_BtnIncluir");
		btnIncluir.setData(IWindow.OPERATION, Permissoes.INCLUIR);
		addSecurityButton(btnIncluir);
		
		btnImprimir = new Button(InstituicaoFinanceiraI18N.constants.imprimir());
		btnImprimir.setId("id_PesquisaCadastroGeralWindow_BtnImprimir");
		btnImprimir.setData(IWindow.OPERATION, Permissoes.IMPRIMIR);
		addSecurityButton(btnImprimir);
		
		btnVisualizar = new Button(InstituicaoFinanceiraI18N.constants.visualizar());
		btnVisualizar.setId("id_PesquisaCadastroGeralWindow_btnVisualizar");
		btnVisualizar.setData(IWindow.OPERATION, Permissoes.VISUALIZAR);
		addSecurityButton(btnVisualizar);
		
		btnAlterar.addSelectionListener(new SelectionListener<ButtonEvent>() {
			@Override
			public void componentSelected(ButtonEvent ce) {
				BeanModel beanModel = grid.getSelectionModel().getSelectedItem();
				if(beanModel==null){
					MessageBox.alert(InstituicaoFinanceiraI18N.messages.headingInformacao(),InstituicaoFinanceiraI18N.messages.alterarSelecioneRegistro(), null);
					return;
				}

				final Long idInstituicao = beanModel.get("id");
				service.retornarInstituicaoFinanceira(idInstituicao, new AsyncCallback<InstituicaoFinanceira>() {

					public void onFailure(Throwable caught) {
						MessageBox.alert("Alerta","Ocorreu um erro grave!" +
								" \nDetalhes:\n"+caught.getMessage(),null);
					}

					public void onSuccess(InstituicaoFinanceira InstituicaoFinanceira) {
						
						IWindowConfig cfg = getWindowConfig();
						cfg.getParameters().put(IWindow.OPERATION, Function.EDITAR);
						cfg.getParameters().put(IWindow.DOMAIN_OBJECT, InstituicaoFinanceira);
						
						IncluiAlteraInstituicaoFinanceiraWindow incluiInstituicaoFinanceiraGeralWindow = new IncluiAlteraInstituicaoFinanceiraWindow(InstituicaoFinanceiraI18N.constants.alterar(),InstituicaoFinanceira, false);
						incluiInstituicaoFinanceiraGeralWindow.setModal(true);
						incluiInstituicaoFinanceiraGeralWindow.setMinimizable(false);
						incluiInstituicaoFinanceiraGeralWindow.setWindowConfig(cfg);
						
						WindowAPI.buildWindow(incluiInstituicaoFinanceiraGeralWindow);
						//atualizarGrid();
					}
				});
			}
			
		});
		
		
		btnVisualizar.addSelectionListener(new SelectionListener<ButtonEvent>() {
			@Override
			public void componentSelected(ButtonEvent ce) {
				BeanModel beanModel = grid.getSelectionModel().getSelectedItem();
				if(beanModel==null){
					MessageBox.alert(InstituicaoFinanceiraI18N.messages.headingInformacao(),"Selecione um registro para visualizar!", null);
					return;
				}

				final Long idInstituicao = beanModel.get("id");
				service.retornarInstituicaoFinanceira(idInstituicao, new AsyncCallback<InstituicaoFinanceira>() {

					public void onFailure(Throwable caught) {
						MessageBox.alert("Alerta","Ocorreu um erro grave!" +
								" \nDetalhes:\n"+caught.getMessage(),null);
					}

					public void onSuccess(InstituicaoFinanceira instituicaoFinanceira) {
						
						IWindowConfig cfg = getWindowConfig();
						cfg.getParameters().put(IWindow.OPERATION, Function.EDITAR);
						cfg.getParameters().put(IWindow.DOMAIN_OBJECT, instituicaoFinanceira);
						
						IncluiAlteraInstituicaoFinanceiraWindow incluiAlteraInstituicaoFinanceiraWindow = new IncluiAlteraInstituicaoFinanceiraWindow(InstituicaoFinanceiraI18N.constants.visualizar(),instituicaoFinanceira,true);
						incluiAlteraInstituicaoFinanceiraWindow.setModal(true);
						incluiAlteraInstituicaoFinanceiraWindow.setMinimizable(false);
						incluiAlteraInstituicaoFinanceiraWindow.setWindowConfig(cfg);

						WindowAPI.buildWindow(incluiAlteraInstituicaoFinanceiraWindow);
					
					}
				});
			}
			
		});
		
		btnIncluir.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				
				IWindowConfig cfg = getWindowConfig();
				cfg.getParameters().put(IWindow.OPERATION, Function.INCLUIR);
				
				IncluiAlteraInstituicaoFinanceiraWindow incluiAlteraCadastroGeralWindow = new IncluiAlteraInstituicaoFinanceiraWindow(InstituicaoFinanceiraI18N.constants.incluir(), null, false);
				incluiAlteraCadastroGeralWindow.setWindowConfig(cfg);
				incluiAlteraCadastroGeralWindow.setModal(true);
				incluiAlteraCadastroGeralWindow.setMinimizable(false);
				incluiAlteraCadastroGeralWindow.setWindowConfig(cfg);
				
				WindowAPI.buildWindow(incluiAlteraCadastroGeralWindow);
			}
		});

		Button btnExcluir = new Button(InstituicaoFinanceiraI18N.constants.excluir());
		btnExcluir.setId("id_PesquisaCadastroGeralWindow_BtnExcluir");
		btnExcluir.setData(IWindow.OPERATION, Permissoes.EXCLUIR);
		addSecurityButton(btnExcluir);
		
		btnExcluir.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				BeanModel beanModel = grid.getSelectionModel().getSelectedItem();
				if(beanModel==null){
					MessageBox.alert(InstituicaoFinanceiraI18N.messages.headingInformacao(),InstituicaoFinanceiraI18N.messages.excluirSelecioneRegistro(), null);
					return;
				}
				final Long idInstituicaoFinanceira = beanModel.get("id");
				service.verificarDependenciaDeInstituicaoFinanceira(idInstituicaoFinanceira,new AsyncCallback<Boolean>() {

					public void onFailure(Throwable caught) {
						MessageBox.alert("Alerta","Ocorreu um erro grave!" +
								" \nDetalhes:\n"+caught.getMessage(),null);
					}

					public void onSuccess(final Boolean result) {
						MessageBox.confirm("Confirme!", "Voce tem certeza que deseja excluir definitivamente essa instituicao?",new Listener<MessageBoxEvent>() {

							public void handleEvent(MessageBoxEvent be) {
								if (be.getButtonClicked().getText().equals("Sim")) {
									if(!result){
										service.excluirInstituicaoFinanceira(idInstituicaoFinanceira, new RpcWaitCallback<Boolean>(WidgetsI18N.messages.aguarde(),WidgetsI18N.messages.processando()) {
											
											@Override
											public void handleFailure(Throwable caught) {
												MessageBox.alert("Alerta","Ocorreu um erro grave!" +
														" \nDetalhes:\n"+caught.getMessage(),null);
											}
											
											@Override
											public void handleResponse(Boolean value) {
												if(value){
													MessageBox.info("Informacao!", "Instituicao Financeira excluida com sucesso!", null);	
													atualizarGrid();
												}
											}
										});	
										
									}else{
										
										desativarInstituicao(idInstituicaoFinanceira);										
									}
								} else {
									return;
								}
							}
							
						});
					}
				});
			}
		});


		btnImprimir.addSelectionListener(new SelectionListener<ButtonEvent>() {
			/*public void componentSelected(ButtonEvent ce) {
				if(grid.getStore().getModels().isEmpty()){
					return;
				}
				service.gerarRelatorio(getObjetoInstituicaoFinanceiraPopuladoTela(),TipoNomeRelatorio.CADASTRO_INSTITUICAO_FINANCEIRA,TipoFormatoRelatorio.PDF, new AsyncCallback<Void>() {
					public void onSuccess(Void result) {
						exibirRelatorio(TipoNomeRelatorio.CADASTRO_INSTITUICAO_FINANCEIRA,TipoFormatoRelatorio.PDF);
					}
					
					public void onFailure(Throwable caught) {
						MessageBox.alert("Alerta","Ocorreu um erro e o relatorio nao sera exibido.",null);
					}
				});
			}*/
			
			@SuppressWarnings("unchecked")
			public void componentSelected(ButtonEvent ce) {
				if(grid.getStore().getModels().isEmpty()){
					return;
				}			
				
				service.gerarRelatorio(getObjetoInstituicaoFinanceiraPopuladoTela(), TipoNomeRelatorio.CADASTRO_INSTITUICAO_FINANCEIRA, TipoFormatoRelatorio.PDF, new RpcWaitCallback (WidgetsI18N.messages.aguarde(),WidgetsI18N.messages.processando()) {
					
					@Override
					public void handleResponse(Object value) {
						exibirRelatorio(TipoNomeRelatorio.CADASTRO_INSTITUICAO_FINANCEIRA,TipoFormatoRelatorio.PDF);
					}
				
					@Override
					public void handleFailure(Throwable exception) {
						MessageBox.alert("Alerta","Ocorreu um erro e o relatorio nao sera exibido.",null);
					}
				
				});

			}
			
		});
		
		btnLimpar.addSelectionListener(new SelectionListener<ButtonEvent>(){

			@Override
			public void componentSelected(ButtonEvent ce) {
				onClearForm();
				onClearResult();
			}
		});
		
		/* tooltips para os botoes */
		btnPesquisar.setToolTip(InstituicaoFinanceiraI18N.tooltip.pesquisar());
		btnLimpar.setToolTip(InstituicaoFinanceiraI18N.tooltip.limpar());
		btnAlterar.setToolTip(InstituicaoFinanceiraI18N.tooltip.alterar());
		btnIncluir.setToolTip(InstituicaoFinanceiraI18N.tooltip.incluir());
		btnImprimir.setToolTip(InstituicaoFinanceiraI18N.tooltip.imprimir());
		btnExcluir.setToolTip(InstituicaoFinanceiraI18N.tooltip.excluir());
		
		/* adiciona os botoes ao grid */
		containerBotoes.add(btnPesquisar, new AbsoluteData(383, 6));
		containerBotoes.add(btnLimpar, new AbsoluteData(449, 6));
		containerBotoes.add(btnAlterar, new AbsoluteData(595, 6));
		containerBotoes.add(btnIncluir, new AbsoluteData(549, 6));
		containerBotoes.add(btnExcluir, new AbsoluteData(499, 6));
		containerBotoes.add(btnImprimir,new AbsoluteData(712, 6));
		containerBotoes.add(btnVisualizar, new AbsoluteData(646, 6));
		containerBotoes.setSize("770", "32");
		
		return containerBotoes;
		
		
	}
		
	private void desativarInstituicao(Long idInstituicaoFinanceira){
		
		service.retornarInstituicaoFinanceira(idInstituicaoFinanceira, new RpcWaitCallback<InstituicaoFinanceira>(WidgetsI18N.messages.aguarde(),WidgetsI18N.messages.processando()) {
			
			@Override
			public void handleResponse(InstituicaoFinanceira result) {												
				result.setPossuiCadastroAtivo(false);
				
				service.atualizarInstituicaoFinanceira(result, new RpcWaitCallback<Boolean>(WidgetsI18N.messages.aguarde(),WidgetsI18N.messages.processando()) {
					
					@Override
					public void handleResponse(Boolean result) {
						if (result) {
							MessageBox.info("Informacao!", "Instituicao Financeira excluida com sucesso!", null);
							atualizarGrid();
						}														
					}
					
					public void handleFailure(Throwable caught) {
						MessageBox.alert("Alerta","Ocorreu um erro grave!" +
								" \nDetalhes:\n"+caught.getMessage(),null);														
					}
				});
				
			}
			
			public void handleFailure(Throwable caught) {												
				MessageBox.alert("Alerta","Ocorreu um erro grave!" +
						" \nDetalhes:\n"+caught.getMessage(),null);
				
			}
		});
	}

	
	private void atualizarGrid() {
		RpcProxy proxyGrid = new RpcProxy() {			

			@Override
			protected void load(Object loadConfig, AsyncCallback callback) {
				service.retornaListaPaginadaInstituicaoFinanceira((PagingLoadConfig)loadConfig, getObjetoInstituicaoFinanceiraPopuladoTela(), callback);
				
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
	
	
	private InstituicaoFinanceira getObjetoInstituicaoFinanceiraPopuladoTela() {
		
		
		Long codigoInstituicao = textCodigo.getValue() == null ? null:textCodigo.getValue().longValue();
		String nomePessoa = textNome.getValue() == null ? null:textNome.getValue().toString();
		String sigla = textSigla.getValue() == null ? null:textSigla.getValue().toString();
		
		Boolean possuiCadastroInstituicaoAtivo = radioSituacaoInstituicaoAtivo.getValue();
		
		Boolean tipoInstituicaoBanco = radioTipoInstituicaoBanco.getValue();
		
		InstituicaoFinanceira instituicaoFinanceira = new InstituicaoFinanceira();		
		instituicaoFinanceira.setId(codigoInstituicao);
		instituicaoFinanceira.setNome(nomePessoa);
		instituicaoFinanceira.setSigla(sigla);		
		instituicaoFinanceira.setPossuiCadastroAtivo(possuiCadastroInstituicaoAtivo);	
		if(tipoInstituicaoBanco){
			instituicaoFinanceira.setTipoInstituicao(TipoInstituicao.BANCO);
		}else{
			instituicaoFinanceira.setTipoInstituicao(TipoInstituicao.PARCEIRO);
		}
		
		return instituicaoFinanceira;
	}

	private Component getContainerIdentificacaoInstituicao(){
		
		FieldSet fieldSetInstituicao = new FieldSet();
		fieldSetInstituicao.setId("id_PesquisaInstituicaoFinanceiraWindow_FieldSetInstituicao");
		fieldSetInstituicao.setAutoWidth(true);
		fieldSetInstituicao.setLayout(new AbsoluteLayout());
		fieldSetInstituicao.setHeading(InstituicaoFinanceiraI18N.constants.identificacao());
		
		//codigo
		LabelField labelCodigo = new LabelField(InstituicaoFinanceiraI18N.constants.codigo());
		labelCodigo.setId("id_PesquisaInstituicaoFinanceiraWindow_LabelCodigo");
		fieldSetInstituicao.add(labelCodigo, new AbsoluteData(0, 0));
		textCodigo = new NumberField();
		textCodigo.setId("id_PesquisaInstituicaoFinanceiraWindow_TextCodigo");
		textCodigo.focus();
		textCodigo.setMaxLength(30);
		textCodigo.setToolTip(InstituicaoFinanceiraI18N.tooltip.identificadorInstituicao());
		fieldSetInstituicao.add(textCodigo, new AbsoluteData(0, 17));
		textCodigo.setSize("80px", "22px");
		
		//Nome
		LabelField labelNome = new LabelField(InstituicaoFinanceiraI18N.constants.nome());
		labelNome.setId("id_PesquisaInstituicaoFinanceiraWindow_LabelSigla");
		fieldSetInstituicao.add(labelNome, new AbsoluteData(0, 45));
		textNome = new TextField();
		textNome.setAllowBlank(true);
		textNome.setMaxLength(100);
		textNome.setId("id_PesquisaInstituicaoFinanceiraWindow_textSigla");
		textNome.setToolTip(InstituicaoFinanceiraI18N.tooltip.nome());
		fieldSetInstituicao.add(textNome, new AbsoluteData(0, 67));
		textNome.setSize("374px", "22px");
		
		//sigla
		LabelField labelSigla = new LabelField(InstituicaoFinanceiraI18N.constants.sigla());
		labelSigla.setId("id_PesquisaInstituicaoFinanceiraWindow_LabelSigla");
		fieldSetInstituicao.add(labelSigla, new AbsoluteData(582, 70));
		textSigla = new TextField();
		textSigla.setAllowBlank(true);
		textSigla.setMaxLength(20);
		textSigla.setId("id_PesquisaInstituicaoFinanceiraWindow_textSigla");
		textSigla.setToolTip(InstituicaoFinanceiraI18N.tooltip.sigla());
		fieldSetInstituicao.add(textSigla, new AbsoluteData(615,67));
		textSigla.setSize("80px", "22px");
		
		RadioGroup radioGrupoTipoInstituicao = new RadioGroup();
		radioGrupoTipoInstituicao.setId("id_PesquisaInstituicaoFinanceiraWindow_RadioGrupoTipoInstituicao");
		
		RadioGroup radioGrupoSituacaoInstituicao = new RadioGroup();
		radioGrupoSituacaoInstituicao.setId("id_PesquisaInstituicaoFinanceiraWindow_RadioGrupoSituacaoInstituicao");
		
		
		LabelField labelTipoInstituicao = new LabelField(InstituicaoFinanceiraI18N.constants.tipoInstituicao());
		labelTipoInstituicao.setId("id_PesquisaInstituicaoFinanceiraWindow_LabelTipoInstituicao");
		fieldSetInstituicao.add(labelTipoInstituicao, new AbsoluteData(582, 98));
				
		radioTipoInstituicaoBanco = new Radio();
		radioTipoInstituicaoBanco.setId("id_PesquisaInstituicaoFinanceiraWindow_RadioTipoInstituicaoBanco");
		radioGrupoTipoInstituicao.add(radioTipoInstituicaoBanco);
		radioTipoInstituicaoBanco.setBoxLabel(InstituicaoFinanceiraI18N.constants.tipoInstituicaoBanco());
		radioTipoInstituicaoBanco.setHideLabel(true);
		radioTipoInstituicaoBanco.setValue(true);
		
		LabelField labelSituacaoInstituicao = new LabelField(InstituicaoFinanceiraI18N.constants.situacao());
		labelSituacaoInstituicao.setId("id_PesquisaInstituicaoFinanceiraWindow_LabelSituacaoInstituicao");
		fieldSetInstituicao.add(labelSituacaoInstituicao, new AbsoluteData(558, 124));
		
		radioTipoInstituicaoParceiro = new Radio();
		radioTipoInstituicaoParceiro.setId("id_PesquisaInstituicaoFinanceiraWindow_RadioTipoInstituicaoParceiro");
		radioGrupoTipoInstituicao.add(radioTipoInstituicaoParceiro);
		radioTipoInstituicaoParceiro.setBoxLabel(InstituicaoFinanceiraI18N.constants.tipoInstituicaoParceiro());
		radioTipoInstituicaoParceiro.setHideLabel(true);
		radioTipoInstituicaoParceiro.setValue(true);
		fieldSetInstituicao.add(radioGrupoTipoInstituicao,  new AbsoluteData(615, 95));
		radioGrupoTipoInstituicao.setSize("130", "22");
		radioGrupoTipoInstituicao.setFieldLabel(InstituicaoFinanceiraI18N.constants.tipoInstituicao());
		
		
		radioSituacaoInstituicaoAtivo = new Radio();
		radioSituacaoInstituicaoAtivo.setId("id_PesquisaInstituicaoFinanceiraWindow_RadioSituacaoInstituicaoAtivo");
		radioGrupoSituacaoInstituicao.add(radioSituacaoInstituicaoAtivo);
		radioSituacaoInstituicaoAtivo.setBoxLabel(InstituicaoFinanceiraI18N.constants.situacaoAtiva());
		radioSituacaoInstituicaoAtivo.setHideLabel(true);
		radioSituacaoInstituicaoAtivo.setValue(true);
		
		radioSituacaoInstituicaoInativo = new Radio();
		radioSituacaoInstituicaoInativo.setId("id_PesquisaInstituicaoFinanceiraWindow_RadioSituacaoInstituicaoInativo");
		radioGrupoSituacaoInstituicao.add(radioSituacaoInstituicaoInativo);
		radioSituacaoInstituicaoInativo.setBoxLabel(InstituicaoFinanceiraI18N.constants.situacaoInativa());
		radioSituacaoInstituicaoInativo.setHideLabel(true);
		radioSituacaoInstituicaoInativo.setValue(true);
		
		fieldSetInstituicao.add(radioGrupoTipoInstituicao,  new AbsoluteData(615, 95));
		radioGrupoTipoInstituicao.setSize("130", "22");
		radioGrupoTipoInstituicao.setFieldLabel(InstituicaoFinanceiraI18N.constants.tipoInstituicao());
		
		fieldSetInstituicao.add(radioGrupoSituacaoInstituicao, new AbsoluteData(615, 124));
		radioGrupoTipoInstituicao.setSize("130", "22");
		radioGrupoTipoInstituicao.setFieldLabel(InstituicaoFinanceiraI18N.constants.situacao());
		
		LayoutContainer layoutContainerIdentificacaoInstituicao = new LayoutContainer();
		layoutContainerIdentificacaoInstituicao.setId("id_PesquisaInstituicaoFinanceiraWindow_LayoutContainerIdentificacaoInstituicao");
		LayoutContainer layoutContainerEspacoCima = new LayoutContainer();
		layoutContainerEspacoCima.setId("id_PesquisaInstituicaoFinanceiraWindow_LayoutContainerEspacoCima");
		layoutContainerIdentificacaoInstituicao.add(layoutContainerEspacoCima);
		layoutContainerEspacoCima.setSize("780", "10");
		
		layoutContainerIdentificacaoInstituicao.add(fieldSetInstituicao);
		fieldSetInstituicao.setSize("780", "200");
					
		return layoutContainerIdentificacaoInstituicao;
	}
	
	@Override
	protected void onAjuda() {
		AjudaInstituicaoFinanceiraWindow ajudaInstituicaoFinanceiraWindow = new AjudaInstituicaoFinanceiraWindow();
		ajudaInstituicaoFinanceiraWindow.show();
		
	}

	@Override
	protected void onClearForm() {
		textCodigo.reset();
		textNome.reset();
		textSigla.reset();
		
		radioSituacaoInstituicaoAtivo.reset();
		radioSituacaoInstituicaoInativo.reset();
		radioTipoInstituicaoBanco.reset();
		radioTipoInstituicaoParceiro.reset();
		
	}
	
	protected void onClearResult(){
		grid.getStore().removeAll();
	}
}
