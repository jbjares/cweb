package br.com.cweb.view.cadastro.cadastrogeral.client.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica;
import br.com.cweb.cadastro.persistence.entity.TipoPessoa;
import br.com.cweb.relatorio.to.TipoFormatoRelatorio;
import br.com.cweb.relatorio.to.TipoNomeRelatorio;
import br.com.cweb.view.cadastro.cadastrogeral.client.i18n.CadastroGeralI18N;
import br.com.cweb.view.cadastro.cadastrogeral.client.service.CadastroGeralServiceFacade;
import br.com.cweb.view.cadastro.cadastrogeral.client.service.CadastroGeralServiceFacadeAsync;
import br.com.cweb.view.desktop.client.build.DefaultWindowBuilder;
import br.com.cweb.view.desktop.client.build.WindowAPI;
import br.com.cweb.view.desktop.client.contexto.WebApplication;
import br.com.cweb.view.template.client.TemplateCombosDependentes;
import br.com.cweb.view.template.client.TemplateWindow;
import br.com.cweb.widgets.action.RpcWaitCallback;
import br.com.cweb.widgets.constants.Function;
import br.com.cweb.widgets.constants.Permissoes;
import br.com.cweb.widgets.textfield.TextFieldMask;
import br.com.cweb.widgets.util.Cnpj;
import br.com.cweb.widgets.util.Cpf;
import br.com.cweb.widgets.util.CpfCnpj;
import br.com.cweb.widgets.window.DefaultWindowConfig;
import br.com.cweb.widgets.window.IWindow;
import br.com.cweb.widgets.window.IWindowConfig;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
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
import com.extjs.gxt.ui.client.event.EventType;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.FieldEvent;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.MessageBoxEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.store.ListStore;
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
import com.extjs.gxt.ui.client.Style;
import br.com.cweb.widgets.i18n.WidgetsI18N;

public class PesquisaCadastroGeralWindow extends TemplateWindow {

	CadastroGeralServiceFacadeAsync service = GWT.create(CadastroGeralServiceFacade.class);

	private Grid<BeanModel> grid;
	private ColumnModel ColumnModel;
	private NumberField textCodigo;
	private TextField textSigla;
	private ComboBox<BeanModel> comboAtribuicao;
	private TextField textCpfCnpj;
	private TextField textNomeRazaoSocial;
	private TextField textApelidoNomeFantasia;
	private Radio radioPessoaFisica;
	private Radio radioPessoaJuridica;
	private ComboBox<BeanModel> comboVinculacao;
	private ComboBox<BeanModel> comboCpfCnpjVinculador;
	private ComboBox<BeanModel> comboGrupoAcesso;
	private TextField textLogin;
	private Radio radioUsuarioLiberado;
	private Radio radioUsuarioBloqueado;
	private Radio radioSituacaoPessoaAtiva;
	private Radio radioSituacaoPessoaInativa;
	private PagingToolBar toolBar;
	private LayoutContainer containerPrincipal;
	private ContentPanel  panelGrid;
	private ContentPanel panelPrincipal;
	
	//TODO Incluir como parametro padrao do appcontext
	private static int PAGE_SIZE = 10;
	private TextField textNomeVinculador;
	private Radio radioUsuarioInexistente;

	private RadioGroup rdgrpRadiogroupsituacaoUsuario;
	private Radio radiosituacaopessoatodos;
	private Radio radiotipopessoatodos;
	private Radio radiousuariotodos;
	private Button btnVisualizar;

	private Button btnPesquisar;

	private Button btnLimpar;

	private Button btnAlterar;

	private Button btnIncluir;

	private Button btnImprimir;

	private FieldSet fieldsetIdentificacao;
	
	private TextFieldMask textCnpj;
	
	private TextFieldMask textCpf;
	
	private String textCpfTemp;
	
	private String textCnpjTemp;
	
	public PesquisaCadastroGeralWindow() {
		this.setId("id_PesquisaCadastroGeralWindow");
		setMinimizable(true);
		setResizable(false);
		setSize("882px", "598px");
		setHeading(CadastroGeralI18N.constants.headingPesquisaCadastro());
		new FormPanel().setBodyStyle(bbarStyle);
		containerPrincipal = new LayoutContainer();
		containerPrincipal.setId("id_PesquisaCadastroGeralWindow_ContainerPrincipal");
		containerPrincipal.setBorders(true);
		
		panelPrincipal = new ContentPanel();
		panelPrincipal.setId("id_PesquisaCadastroGeralWindow_PanelPrincipal");
		panelPrincipal.setHeaderVisible(false);
		panelPrincipal.setButtonAlign(HorizontalAlignment.LEFT);
		panelPrincipal.setAutoWidth(true);
		panelPrincipal.setAutoHeight(true);
		panelPrincipal.setSize("800", "300");
		panelPrincipal.add(getContainerIdentificacao());
		panelPrincipal.add(getContainerVinculacao());
		panelPrincipal.add(getContainerControleAcesso());
		containerPrincipal.add(panelPrincipal);
		add(containerPrincipal);
		add(getContainerBotoes());
		add(getPanelGrid());
		criarDependenciaEntreCombosVinculadorEcpfCnpj();
		criarDependenciaEntreCombosAtribuicaoEVinculador();
	}
	
	private void criarDependenciaEntreCombosAtribuicaoEVinculador() {
		TemplateCombosDependentes combosDependentes = new TemplateCombosDependentes() {
			@Override
			protected void load(ComboBox<?> fonte, final ComboBox<?> cb) {
				
				final Integer codigoHierarquico = fonte.getValue().get("codigoHierarquico");
				RpcProxy proxyVinculacao = new RpcProxy() {

					@Override
					protected void load(Object loadConfig,AsyncCallback callback) {
						 service.retornaListaAtribuicaoVinculador(codigoHierarquico, callback);					
					}

				};
				
				BeanModelReader readerAtribuicao = new BeanModelReader();
				ListLoader loaderAtribuicao = new BaseListLoader(proxyVinculacao, readerAtribuicao);
				ListStore<BeanModel> storeAtribuicao = new ListStore<BeanModel>(loaderAtribuicao);
				loaderAtribuicao.load();
				comboVinculacao.getStore().removeAll();
				comboVinculacao.setStore(storeAtribuicao);

			}
		};
		
		combosDependentes.adicionarCombo(comboAtribuicao);
		combosDependentes.adicionarCombo(comboVinculacao);
		combosDependentes.init();	
	}

	private void criarDependenciaEntreCombosVinculadorEcpfCnpj() {
		TemplateCombosDependentes combosDependentes = new TemplateCombosDependentes() {
			@Override
			protected void load(ComboBox<?> fonte, final ComboBox<?> cb) {
				
				final Long id = fonte.getValue().get("id");
				RpcProxy proxyVinculacao = new RpcProxy() {

					@Override
					protected void load(Object loadConfig,AsyncCallback callback) {
						 service.retornaListarCpfCnpjPessoaPorTipoVinculacao(id, callback);					
					}

				};
				
				BeanModelReader readerCpfCnpjVinculacao = new BeanModelReader();
				ListLoader loaderCpfCnpjVinculacao = new BaseListLoader(proxyVinculacao, readerCpfCnpjVinculacao);
				ListStore<BeanModel> storeCpfCnpjVinculacao = new ListStore<BeanModel>(loaderCpfCnpjVinculacao);
				loaderCpfCnpjVinculacao.load();
				comboCpfCnpjVinculador.getStore().removeAll();
				comboCpfCnpjVinculador.setStore(storeCpfCnpjVinculacao);

			}
		};
		
		combosDependentes.adicionarCombo(comboVinculacao);
		combosDependentes.adicionarCombo(comboCpfCnpjVinculador);
		combosDependentes.init();
	}

	private Component getContainerIdentificacao() {
		
		fieldsetIdentificacao = new FieldSet();
		fieldsetIdentificacao.setId("id_PesquisaCadastroGeralWindow_FieldsetIdentificacao");
		fieldsetIdentificacao.setAutoWidth(true);
		fieldsetIdentificacao.setLayout(new AbsoluteLayout());
		
		RadioGroup radioGroupSituacaoPessoa = new RadioGroup();
		radioGroupSituacaoPessoa.setId("id_PesquisaCadastroGeralWindow_RadioGroupSituacaoPessoa");
		
		radiosituacaopessoatodos = new Radio();
		radiosituacaopessoatodos.setId("id_PesquisaCadastroGeralWindow_Radiosituacaopessoatodos");
		radioGroupSituacaoPessoa.add(radiosituacaopessoatodos);
		radiosituacaopessoatodos.setBoxLabel("Todos");
		radiosituacaopessoatodos.setHideLabel(true);
		radiosituacaopessoatodos.setValue(true);
		
		radioSituacaoPessoaAtiva = new Radio();
		radioSituacaoPessoaAtiva.setId("id_PesquisaCadastroGeralWindow_RadioSituacaoPessoaAtiva");
		radioGroupSituacaoPessoa.add(radioSituacaoPessoaAtiva);
		radioSituacaoPessoaAtiva.setToolTip(CadastroGeralI18N.tooltip.ativa());
		radioSituacaoPessoaAtiva.setHideLabel(true);
		radioSituacaoPessoaAtiva.setBoxLabel(CadastroGeralI18N.constants.situacaoAtiva());
		radioSituacaoPessoaAtiva.setSize("54px", "22px");
		
		radioSituacaoPessoaInativa = new Radio();
		radioSituacaoPessoaInativa.setId("id_PesquisaCadastroGeralWindow_RadioSituacaoPessoaInativa");
		radioGroupSituacaoPessoa.add(radioSituacaoPessoaInativa);
		radioSituacaoPessoaInativa.setToolTip(CadastroGeralI18N.tooltip.inativa());
		radioSituacaoPessoaInativa.setHideLabel(true);
		radioSituacaoPessoaInativa.setBoxLabel(CadastroGeralI18N.constants.situacaoInativa());
		radioSituacaoPessoaInativa.setSize("66px", "22px");
		fieldsetIdentificacao.add(radioGroupSituacaoPessoa, new AbsoluteData(630, 22));
		radioGroupSituacaoPessoa.setSize("185px", "22px");
		radioGroupSituacaoPessoa.setFieldLabel("radioGroupSituacaoPessoa");
		
		LayoutContainer layoutContainerIdentificacao = new LayoutContainer();
		layoutContainerIdentificacao.setId("id_PesquisaCadastroGeralWindow_LayoutContainerIdentificacao");
		LayoutContainer layoutContainerespacoCima = new LayoutContainer();
		layoutContainerespacoCima.setId("id_PesquisaCadastroGeralWindow_LayoutContainerespacoCima");
		layoutContainerIdentificacao.add(layoutContainerespacoCima);
		layoutContainerespacoCima.setSize("864", "10");
		
		layoutContainerIdentificacao.add(fieldsetIdentificacao);
		fieldsetIdentificacao.setSize("862", "135");
		fieldsetIdentificacao.setHeading(CadastroGeralI18N.constants.identificacao());
		
		//codigo
		LabelField labelCdigo = new LabelField(CadastroGeralI18N.constants.codigo());
		labelCdigo.setId("id_PesquisaCadastroGeralWindow_LabelCdigo");
		fieldsetIdentificacao.add(labelCdigo, new AbsoluteData(0, 5));
		textCodigo = new NumberField();
		textCodigo.setId("id_PesquisaCadastroGeralWindow_TextCodigo");
		textCodigo.focus();
		textCodigo.setToolTip(CadastroGeralI18N.tooltip.identificadorPessoa());
		fieldsetIdentificacao.add(textCodigo, new AbsoluteData(0, 22));
		textCodigo.setSize("80px", "22px");
		
		//sigla
		LabelField labelSigla = new LabelField(CadastroGeralI18N.constants.sigla());
		labelSigla.setId("id_PesquisaCadastroGeralWindow_LabelSigla");
		fieldsetIdentificacao.add(labelSigla, new AbsoluteData(0, 50));
		textSigla = new TextField();
		textSigla.setAllowBlank(true);
		textSigla.setMaxLength(5);
		textSigla.setId("id_PesquisaCadastroGeralWindow_textSigla");
		textSigla.setToolTip(CadastroGeralI18N.tooltip.descricaoSigla());
		fieldsetIdentificacao.add(textSigla, new AbsoluteData(0, 67));
		textSigla.setSize("80px", "22px");
				
		//atribuicao
		LabelField labelAtribuicao = new LabelField(CadastroGeralI18N.constants.atribuicao());
		labelAtribuicao.setId("id_PesquisaCadastroGeralWindow_LabelAtribuicao");
		fieldsetIdentificacao.add(labelAtribuicao, new AbsoluteData(112, 5));
		
		
		RpcProxy proxyAtribuicao = new RpcProxy() {
			
			@Override
			protected void load(Object loadConfig, AsyncCallback callback) {
				service.retornaListaAtribuicaoVinculado(callback);
			}
		};
		
		BeanModelReader readerAtribuicao = new BeanModelReader();
		ListLoader loaderAtribuicao = new BaseListLoader(proxyAtribuicao, readerAtribuicao);
		ListStore<BeanModel> storeAtribuicao = new ListStore<BeanModel>(loaderAtribuicao);
		
		comboAtribuicao = new ComboBox<BeanModel>();
		comboAtribuicao.setId("id_PesquisaCadastroGeralWindow_ComboAtribuicao");
		formatarCombo(comboAtribuicao);
		comboAtribuicao.addListener(Events.Blur, new Listener<FieldEvent>() {
			public void handleEvent(FieldEvent e) {
				Object comboAtribuicaoValue = comboAtribuicao.getValue();
				if(comboAtribuicaoValue==null){
					comboCpfCnpjVinculador.clear();
					textNomeVinculador.setValue("");
					comboCpfCnpjVinculador.setEnabled(false);
					comboVinculacao.clear();
					comboVinculacao.setEnabled(false);
				}else{
					comboCpfCnpjVinculador.setEnabled(true);
					comboVinculacao.setEnabled(true);
				}
			}
		});
		
		comboAtribuicao.addListener(Events.Select, new Listener<FieldEvent>() {
			public void handleEvent(FieldEvent e) {
					comboCpfCnpjVinculador.clear();
					textNomeVinculador.setValue("");
					comboCpfCnpjVinculador.setEnabled(false);
			}
		});
		
		
		
		comboAtribuicao.setToolTip(CadastroGeralI18N.tooltip.identificadorAtibuicaoPessoa());
		comboAtribuicao.setStore(storeAtribuicao);
		comboAtribuicao.setSize("221px", "22px");
		comboAtribuicao.setDisplayField("nome");
		comboAtribuicao.setTypeAhead(true);
		fieldsetIdentificacao.add(comboAtribuicao, new AbsoluteData(112, 22));
		formatarCombo(comboAtribuicao);
		

		
		//cpf/cnpj
		LabelField labelCpfCnpj = new LabelField(CadastroGeralI18N.constants.cpfCnpj());
		labelCpfCnpj.setId("id_PesquisaCadastroGeralWindow_LabelCpfCnpj");
		fieldsetIdentificacao.add(labelCpfCnpj, new AbsoluteData(112, 50));
		textCpfCnpj = new TextField();
		textCpfCnpj.setId("id_PesquisaCadastroGeralWindow_TextCpfCnpj");
		textCpfCnpj.setToolTip(CadastroGeralI18N.tooltip.cpfCnpjPessoa());
		fieldsetIdentificacao.add(textCpfCnpj, new AbsoluteData(112, 67));
		textCpfCnpj.setSize("221px", "22px");
		textCpfCnpj.disable();
		

		textCnpj = new TextFieldMask(CadastroGeralI18N.mask.cnpj());
		textCnpj.setId("id_PesquisaCadastroGeralWindow_TextCnpj");
		textCnpj.setToolTip(CadastroGeralI18N.tooltip.cpfCnpjPessoa());
		fieldsetIdentificacao.add(textCnpj, new AbsoluteData(112, 67));
		textCnpj.setSize("221px", "22px");
		textCnpj.hide();
		
		textCnpj.addListener(Events.OnKeyDown, new Listener<ComponentEvent>() {
			public void handleEvent(ComponentEvent e) {
				if(textCnpj.getValue()==null){return;}
				textCnpjTemp = textCnpj.getValue().toString();
			}
		});
		textCnpj.addListener(Events.OnBlur, new Listener<ComponentEvent>() {
			public void handleEvent(ComponentEvent e) {
				if(textCnpj.getValue()==null|| "".equals(textCnpj.getValue())){
					textCnpj.forceInvalid("CPF/CNPJ Inválido!");
					textCnpj.setMaskedValue(textCnpjTemp);
				}else if(!Cnpj.isValid(textCnpjTemp)){
					textCnpj.forceInvalid("CPF/CNPJ Inválido!");
					textCnpj.setMaskedValue(textCnpjTemp);					
				}else{
					textCnpj.clear();
					textCnpj.setValue(textCnpjTemp);
				}
			}
		});
		
		textCpf = new TextFieldMask(CadastroGeralI18N.mask.cpf());
		textCpf.setId("id_PesquisaCadastroGeralWindow_TextCpf");
		textCpf.setToolTip(CadastroGeralI18N.tooltip.cpfCnpjPessoa());
		fieldsetIdentificacao.add(textCpf, new AbsoluteData(112, 67));
		textCpf.setSize("221px", "22px");
		textCpf.hide();
		
		textCpf.addListener(Events.OnKeyPress, new Listener<ComponentEvent>() {
			public void handleEvent(ComponentEvent e) {
				if(textCpf.getValue()==null){return;}
				textCpfTemp = textCpf.getValue().toString();
				System.out.println(textCpfTemp);
			}
		});
		
		textCpf.addListener(Events.OnBlur, new Listener<ComponentEvent>() {
			public void handleEvent(ComponentEvent e) {
				if(textCpf.getValue()==null|| "".equals(textCpf.getValue())){
					textCpf.forceInvalid("CPF/CNPJ Inválido!");
					textCpf.setMaskedValue(textCpfTemp);
				}else if(!Cpf.isValid(textCpfTemp)){
					textCpf.forceInvalid("CPF/CNPJ Inválido!");
					textCpf.setMaskedValue(textCpfTemp);					
				}else{
					textCpf.clear();
					textCpf.setValue(textCpfTemp);
				}
			}
		});

		//nome/razao social
		LabelField labelNomeRazoSocial = new LabelField(CadastroGeralI18N.constants.nomeRazaoSocial());
		labelNomeRazoSocial.setId("id_PesquisaCadastroGeralWindow_LabelNomeRazoSocial");
		fieldsetIdentificacao.add(labelNomeRazoSocial, new AbsoluteData(371, 5));
		textNomeRazaoSocial = new TextField();
		textNomeRazaoSocial.setId("id_PesquisaCadastroGeralWindow_TextNomeRazaoSocial");
		textNomeRazaoSocial.setToolTip(CadastroGeralI18N.tooltip.nomeRazaoSocial());
		fieldsetIdentificacao.add(textNomeRazaoSocial, new AbsoluteData(371, 22));
		textNomeRazaoSocial.setSize("220px", "22px");
		
		//apelido
		LabelField labelApelidoNomeFantasia = new LabelField(CadastroGeralI18N.constants.apelidoNomeFantasia());
		labelApelidoNomeFantasia.setId("id_PesquisaCadastroGeralWindow_LabelApelidoNomeFantasia");
		fieldsetIdentificacao.add(labelApelidoNomeFantasia, new AbsoluteData(371, 50));
		textApelidoNomeFantasia = new TextField();
		textApelidoNomeFantasia.setId("id_PesquisaCadastroGeralWindow_TextApelidoNomeFantasia");
		textApelidoNomeFantasia.setToolTip(CadastroGeralI18N.tooltip.apelidoNomeFantasia());
		fieldsetIdentificacao.add(textApelidoNomeFantasia, new AbsoluteData(371, 67));
		textApelidoNomeFantasia.setSize("220px", "22px");
		
		//situacao
		LabelField labelSituacao = new LabelField(CadastroGeralI18N.constants.situacao());
		labelSituacao.setId("id_PesquisaCadastroGeralWindow_LabelSituacao");
		fieldsetIdentificacao.add(labelSituacao, new AbsoluteData(630, 5));


		//tipo de pessoa
		LabelField labelTipoPessoa = new LabelField(CadastroGeralI18N.constants.tipoPessoa());
		labelTipoPessoa.setId("id_PesquisaCadastroGeralWindow_LabelTipoPessoa");
		fieldsetIdentificacao.add(labelTipoPessoa, new AbsoluteData(630, 52));
				
		RadioGroup radioGrupoTipoPessoa = new RadioGroup();
		radioGrupoTipoPessoa.setId("id_PesquisaCadastroGeralWindow_RadioGrupoTipoPessoa");
		radioGrupoTipoPessoa.setToolTip(CadastroGeralI18N.tooltip.tipoPessoaFisicaJuridica());
		
		radiotipopessoatodos = new Radio();
		radiotipopessoatodos.setId("id_PesquisaCadastroGeralWindow_Radiotipopessoatodos");
		radioGrupoTipoPessoa.add(radiotipopessoatodos);
		radiotipopessoatodos.setBoxLabel("Todos");
		radiotipopessoatodos.setHideLabel(true);
		radiotipopessoatodos.setValue(true);
		
		radiotipopessoatodos.addListener(Events.OnClick, new Listener<FieldEvent>() {
			public void handleEvent(FieldEvent be) {
				textCpf.hide();
				textCnpj.hide();
				textCpfCnpj.show();
				textCpfCnpj.disable();
			}
			
		});
		
		radioPessoaFisica = new Radio();
		radioPessoaFisica.setId("id_PesquisaCadastroGeralWindow_RadioPessoaFisica");
		radioGrupoTipoPessoa.add(radioPessoaFisica);
		radioPessoaFisica.setBoxLabel(CadastroGeralI18N.constants.pessoaFisica());
		radioPessoaFisica.setToolTip(CadastroGeralI18N.tooltip.pessoaTipoFisica());
		radioPessoaFisica.setHideLabel(true);
		
		
		radioPessoaFisica.addListener(Events.OnClick, new Listener<FieldEvent>() {

			public void handleEvent(FieldEvent be) {
				textCpfCnpj.hide();
				textCnpj.hide();
				textCpf.show();
				textCpf.enable();
			}
			
		});
		
		radioPessoaJuridica = new Radio();
		radioPessoaJuridica.setId("id_PesquisaCadastroGeralWindow_RadioPessoaJuridica");
		radioGrupoTipoPessoa.add(radioPessoaJuridica);
		radioPessoaJuridica.setBoxLabel(CadastroGeralI18N.constants.pessoaJuridica());
		radioPessoaJuridica.setToolTip(CadastroGeralI18N.tooltip.pessoaTipoJuridica());
		radioPessoaJuridica.setHideLabel(true);
		
		radioPessoaJuridica.addListener(Events.OnClick, new Listener<FieldEvent>() {

			public void handleEvent(FieldEvent be) {
				textCpfCnpj.hide();
				textCpf.hide();
				textCnpj.show();
				textCnpj.enable();
			}
			
		});
		
		fieldsetIdentificacao.add(radioGrupoTipoPessoa, new AbsoluteData(631, 67));
		radioGrupoTipoPessoa.setSize("184px", "22px");
		radioGrupoTipoPessoa.setFieldLabel("radioGroupTipoPessoa");

		return layoutContainerIdentificacao;
	}

	private Component getContainerVinculacao(){
		LayoutContainer layoutContainerVinculacao = new LayoutContainer();
		layoutContainerVinculacao.setId("id_PesquisaCadastroGeralWindow_LayoutContainerVinculacao");
		
		FieldSet fieldsetVinculacao = new FieldSet();
		fieldsetVinculacao.setId("id_PesquisaCadastroGeralWindow_FieldsetVinculacao");
		fieldsetVinculacao.setAutoWidth(true);
		fieldsetVinculacao.setLayout(new AbsoluteLayout());
		
		LabelField labelVinculadoA = new LabelField(CadastroGeralI18N.constants.vinculadoA());
		labelVinculadoA.setId("id_PesquisaCadastroGeralWindow_LabelVinculadoA");
		fieldsetVinculacao.add(labelVinculadoA, new AbsoluteData(0, 0));

		comboVinculacao = new ComboBox();
		comboVinculacao.setId("id_PesquisaCadastroGeralWindow_ComboVinculacao");
		formatarCombo(comboVinculacao);
		comboVinculacao.addListener(Events.Blur, new Listener<FieldEvent>() {
			public void handleEvent(FieldEvent e) {
				Object comboVinculacaoValue = comboVinculacao.getValue();
				if(comboVinculacaoValue==null){
					comboCpfCnpjVinculador.clear();
					textNomeVinculador.setValue("");
					comboCpfCnpjVinculador.setEnabled(false);
				}else{
					comboCpfCnpjVinculador.setEnabled(true);
				}
			}
		});
		
		comboVinculacao.addListener(Events.Select, new Listener<FieldEvent>() {
			public void handleEvent(FieldEvent e) {
					comboCpfCnpjVinculador.clear();
					textNomeVinculador.setValue("");
					comboCpfCnpjVinculador.setEnabled(false);
			}
		});
		fieldsetVinculacao.add(comboVinculacao, new AbsoluteData(0, 16));
		comboVinculacao.setToolTip(CadastroGeralI18N.tooltip.vinculacao());
		comboVinculacao.setSize("252px", "22px");
		formatarCombo(comboVinculacao);
		
		
		comboVinculacao.setStore(new ListStore());
		comboVinculacao.setDisplayField("nome");

			
		LabelField labelCpfCnpjDoVinculador = new LabelField(CadastroGeralI18N.constants.cpfCnpjVinculador());
		labelCpfCnpjDoVinculador.setId("id_PesquisaCadastroGeralWindow_LabelCpfCnpjDoVinculador");
		fieldsetVinculacao.add(labelCpfCnpjDoVinculador, new AbsoluteData(284, 0));
		
		comboCpfCnpjVinculador = new ComboBox();
		comboCpfCnpjVinculador.setId("id_PesquisaCadastroGeralWindow_ComboCpfCnpjVinculador");
		formatarCombo(comboCpfCnpjVinculador);
		comboCpfCnpjVinculador.addListener(Events.Blur, new Listener<FieldEvent>() {
			public void handleEvent(FieldEvent e) {
				Object comboCpfCnpjVinculadorValue = comboCpfCnpjVinculador.getValue();
				if(comboCpfCnpjVinculadorValue==null){
					textNomeVinculador.setValue("");
					comboVinculacao.clear();
					comboCpfCnpjVinculador.setEnabled(false);
				}
			}
		});
		comboCpfCnpjVinculador.addListener(Events.Select, new Listener<FieldEvent>() {
			public void handleEvent(FieldEvent e) {
				String codigo = new Long((Long) comboCpfCnpjVinculador.getValue().get("id")).toString();
				String nome = (String) comboCpfCnpjVinculador.getValue().get("nomeRazaoSocial");
				textNomeVinculador.setValue(codigo+" - "+nome);
			}
		});
		comboCpfCnpjVinculador.setStore(new ListStore());
		comboCpfCnpjVinculador.setToolTip(CadastroGeralI18N.tooltip.cpfCnpjDoVinculador());
		comboCpfCnpjVinculador.setDisplayField("cpfCnpjMascarado");
		comboCpfCnpjVinculador.setSize("194px", "22px");
		fieldsetVinculacao.add(comboCpfCnpjVinculador, new AbsoluteData(284, 18));
		
		LabelField labelNomeVinculador = new LabelField(CadastroGeralI18N.constants.nomeVinculador());
		labelNomeVinculador.setId("id_PesquisaCadastroGeralWindow_LabelNomeVinculador");
		fieldsetVinculacao.add(labelNomeVinculador, new AbsoluteData(506, 0));
		
		textNomeVinculador = new TextField();
		textNomeVinculador.setId("id_PesquisaCadastroGeralWindow_TextNomeVinculador");
		textNomeVinculador.setToolTip(CadastroGeralI18N.constants.nomeVinculador());
		textNomeVinculador.setReadOnly(true);
		fieldsetVinculacao.add(textNomeVinculador, new AbsoluteData(506, 16));
		textNomeVinculador.setSize("321px", "22px");
		
		layoutContainerVinculacao.add(fieldsetVinculacao);
		fieldsetVinculacao.setSize("843", "75");
		fieldsetVinculacao.setHeading(CadastroGeralI18N.constants.vinculacaoDependenciaCaptador());
		formatarCombo(comboCpfCnpjVinculador);
		
		

		
		return layoutContainerVinculacao;
	} 

	private Component getContainerControleAcesso(){
		
		LayoutContainer layoutContainerControleAcesso = new LayoutContainer();
		layoutContainerControleAcesso.setId("id_PesquisaCadastroGeralWindow_LayoutContainerControleAcesso");
		
		FieldSet fieldsetControleAcesso = new FieldSet();
		fieldsetControleAcesso.setId("id_PesquisaCadastroGeralWindow_FieldsetControleAcesso");
		fieldsetControleAcesso.setLayout(new AbsoluteLayout());
		
		LabelField labelGrupoDeAcesso = new LabelField(CadastroGeralI18N.constants.grupoAcesso());
		labelGrupoDeAcesso.setId("id_PesquisaCadastroGeralWindow_LabelGrupoDeAcesso");
		fieldsetControleAcesso.add(labelGrupoDeAcesso, new AbsoluteData(0, -10));
		
		RpcProxy proxyGrupoAcesso = new RpcProxy() {
			
			  @Override
			  protected void load(Object loadConfig, AsyncCallback callback) {
				 service.retornaListaGrupoAcesso(callback);
			  }
		};
		
		 BeanModelReader readerGrupoAcesso = new BeanModelReader();
		 ListLoader loaderGrupoAcesso = new BaseListLoader(proxyGrupoAcesso, readerGrupoAcesso);
		 ListStore<BeanModel> storeGrupoAcesso = new ListStore<BeanModel>(loaderGrupoAcesso);
		
		comboGrupoAcesso = new ComboBox<BeanModel>();
		comboGrupoAcesso.setId("id_PesquisaCadastroGeralWindow_ComboGrupoAcesso");
		formatarCombo(comboGrupoAcesso);
		
		comboGrupoAcesso.setToolTip(CadastroGeralI18N.tooltip.grupoAcesso());
		comboGrupoAcesso.setStore(storeGrupoAcesso);
		comboGrupoAcesso.setSize("259px", "22px");
		comboGrupoAcesso.setDisplayField("nome");
		fieldsetControleAcesso.add(comboGrupoAcesso, new AbsoluteData(0, 15));
		formatarCombo(comboGrupoAcesso);
		
		LabelField labelLogin = new LabelField(CadastroGeralI18N.constants.login());
		labelLogin.setId("id_PesquisaCadastroGeralWindow_LabelLogin");
		fieldsetControleAcesso.add(labelLogin, new AbsoluteData(299, -10));
		
		textLogin = new TextField();
		textLogin.setId("id_PesquisaCadastroGeralWindow_TextLogin");
		fieldsetControleAcesso.add(textLogin, new AbsoluteData(298, 15));
		textLogin.setToolTip(CadastroGeralI18N.tooltip.login());
		textLogin.setSize("178px", "22px");
		
		LabelField labelSituaoDoUsurio = new LabelField(CadastroGeralI18N.constants.situacaoUsuario());
		labelSituaoDoUsurio.setId("id_PesquisaCadastroGeralWindow_LabelSituaoDoUsurio");
		fieldsetControleAcesso.add(labelSituaoDoUsurio, new AbsoluteData(519, -10));
		
		rdgrpRadiogroupsituacaoUsuario = new RadioGroup();
		rdgrpRadiogroupsituacaoUsuario.setId("id_PesquisaCadastroGeralWindow_RdgrpRadiogroupsituacaoUsuario");
		
		radioUsuarioLiberado = new Radio();
		radioUsuarioLiberado.setId("id_PesquisaCadastroGeralWindow_RadioUsuarioLiberado");
		radioUsuarioLiberado.addListener(Events.OnClick, new Listener<ComponentEvent>() {
			public void handleEvent(ComponentEvent e) {
				comboGrupoAcesso.setEnabled(true);
				textLogin.setEnabled(true);
			}
		});
		
		radiousuariotodos = new Radio();
		radiousuariotodos.setBoxLabel("Todos");
		radiousuariotodos.setHideLabel(true);
		radiousuariotodos.setValue(true);
		radiousuariotodos.setId("id_PesquisaCadastroGeralWindow_RadioUsuarioTodos");
		
		radioUsuarioLiberado.setId("id_PesquisaCadastroGeralWindow_RadioUsuarioLiberado");
		rdgrpRadiogroupsituacaoUsuario.add(radiousuariotodos);
		rdgrpRadiogroupsituacaoUsuario.add(radioUsuarioLiberado);
		radioUsuarioLiberado.setBoxLabel(CadastroGeralI18N.constants.liberado());
		radioUsuarioLiberado.setToolTip(CadastroGeralI18N.tooltip.situacaoUsuarioLiberado());
		radioUsuarioLiberado.setHideLabel(true);
		
		radioUsuarioBloqueado = new Radio();
		radioUsuarioBloqueado.setId("id_PesquisaCadastroGeralWindow_RadioUsuarioBloqueado");
		radioUsuarioBloqueado.setBoxLabel(CadastroGeralI18N.constants.bloqueado());
		radioUsuarioBloqueado.setToolTip(CadastroGeralI18N.tooltip.situacaoUsuarioBloqueado());
		radioUsuarioBloqueado.addListener(Events.OnClick, new Listener<FieldEvent>() {
			public void handleEvent(FieldEvent e) {
				comboGrupoAcesso.setEnabled(true);
				textLogin.setEnabled(true);
			}
		});
		rdgrpRadiogroupsituacaoUsuario.add(radioUsuarioBloqueado);
		radioUsuarioBloqueado.setHideLabel(true);
		
		radioUsuarioInexistente = new Radio();
		radioUsuarioInexistente.setId("id_PesquisaCadastroGeralWindow_RadioUsuarioInexistente");
		radioUsuarioInexistente.addListener(Events.OnClick, new Listener<FieldEvent>() {
			public void handleEvent(FieldEvent e) {
				comboGrupoAcesso.clear();
				comboGrupoAcesso.setEnabled(false);
				textLogin.setValue("");
				textLogin.setEnabled(false);
			}
		});
		rdgrpRadiogroupsituacaoUsuario.add(radioUsuarioInexistente);
		radioUsuarioInexistente.setBoxLabel(CadastroGeralI18N.constants.inexistente());
		radioUsuarioInexistente.setToolTip(CadastroGeralI18N.tooltip.usuarioInexistente());
		radioUsuarioInexistente.setHideLabel(true);
		fieldsetControleAcesso.add(rdgrpRadiogroupsituacaoUsuario, new AbsoluteData(519, 15));
		rdgrpRadiogroupsituacaoUsuario.setSize("323px", "22px");
		rdgrpRadiogroupsituacaoUsuario.setFieldLabel("radioGroupSituacao");
		
		layoutContainerControleAcesso.add(fieldsetControleAcesso);
		fieldsetControleAcesso.setSize("866", "75");
		fieldsetControleAcesso.setAutoWidth(true);
		fieldsetControleAcesso.setHeading(CadastroGeralI18N.constants.controleAcessoUsuario());
		
		return layoutContainerControleAcesso;
	}
	
	private Component getContainerBotoes(){
		
		/* define o container para os botoes de pesquisa */
		LayoutContainer containerBotoes = new LayoutContainer();
		containerBotoes.setId("id_PesquisaCadastroGeralWindow_ContainerBotoes");
		
		/* define o layout para o container*/
		AbsoluteLayout layoutBotoes = new AbsoluteLayout();		
		containerBotoes.setLayout(layoutBotoes);
		
		/* define os botoes*/
		btnPesquisar = new Button(CadastroGeralI18N.constants.pesquisar());
		btnPesquisar.setId("id_PesquisaCadastroGeralWindow_BtnPesquisar");
		btnPesquisar.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				atualizarGrid();
			}

		});
		
		btnPesquisar.setData(IWindow.OPERATION, Permissoes.PESQUISAR);
		addSecurityButton(btnPesquisar);
		
		btnLimpar = new Button(CadastroGeralI18N.constants.limpar());
		btnLimpar.setId("id_PesquisaCadastroGeralWindow_BtnLimpar");
		btnLimpar.setData(IWindow.OPERATION, Permissoes.LIMPAR);
		addSecurityButton(btnLimpar);
		
		btnAlterar = new Button(CadastroGeralI18N.constants.alterar());
		btnAlterar.setId("id_PesquisaCadastroGeralWindow_BtnAlterar");
		btnAlterar.setData(IWindow.OPERATION, Permissoes.ALTERAR);
		addSecurityButton(btnAlterar);
		
		btnIncluir = new Button(CadastroGeralI18N.constants.incluir());
		btnIncluir.setId("id_PesquisaCadastroGeralWindow_BtnIncluir");
		btnIncluir.setData(IWindow.OPERATION, Permissoes.INCLUIR);
		addSecurityButton(btnIncluir);
		
		btnImprimir = new Button(CadastroGeralI18N.constants.imprimir());
		btnImprimir.setId("id_PesquisaCadastroGeralWindow_BtnImprimir");
		btnImprimir.setData(IWindow.OPERATION, Permissoes.IMPRIMIR);
		addSecurityButton(btnImprimir);
		
		btnVisualizar = new Button("Visualizar");
		btnVisualizar.setId("id_PesquisaCadastroGeralWindow_btnVisualizar");
		btnVisualizar.setData(IWindow.OPERATION, Permissoes.VISUALIZAR);
		addSecurityButton(btnVisualizar);
		
		
		btnAlterar.addSelectionListener(new SelectionListener<ButtonEvent>() {
			@Override
			public void componentSelected(ButtonEvent ce) {
				BeanModel beanModel = grid.getSelectionModel().getSelectedItem();
				if(beanModel==null){
					MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(),CadastroGeralI18N.messages.alterarSelecioneRegistro(), null);
					return;
				}

				final Long idPessoa = beanModel.get("id");
				
				/* chamada sem utilizar o recurso de barra de progresso.*/
				 
				service.retornarPessoaFisicaJuridica(idPessoa, new AsyncCallback<PessoaFisicaJuridica>() {

					public void onFailure(Throwable caught) {
						MessageBox.alert("Alerta","Ocorreu um erro grave!" +
								" \nDetalhes:\n"+caught.getMessage(),null);
					}

					public void onSuccess(PessoaFisicaJuridica pessoaFisicaJuridica) {
						
						Map<String, Serializable> params = new HashMap<String, Serializable>();
						params.put(IWindow.OPERATION, Function.EDITAR);
						params.put(IWindow.DOMAIN_OBJECT, pessoaFisicaJuridica);
						IWindowConfig cfg = new DefaultWindowConfig(params);
						
						IncluiAlteraCadastroGeralWindow incluiAlteraCadastroGeralWindow = new IncluiAlteraCadastroGeralWindow(CadastroGeralI18N.constants.alterar(),pessoaFisicaJuridica,false);
						incluiAlteraCadastroGeralWindow.setModal(true);
						incluiAlteraCadastroGeralWindow.setMinimizable(false);
						incluiAlteraCadastroGeralWindow.setWindowConfig(cfg);
						
						WindowAPI.buildWindow(incluiAlteraCadastroGeralWindow);
						
					}
				});
				
				service.retornarPessoaFisicaJuridica(idPessoa, new RpcWaitCallback<PessoaFisicaJuridica>(WidgetsI18N.messages.aguarde(),WidgetsI18N.messages.processando()) {
					
					@Override
					public void handleResponse(PessoaFisicaJuridica pessoaFisicaJuridica) {
						Map<String, Serializable> params = new HashMap<String, Serializable>();
						params.put(IWindow.OPERATION, Function.EDITAR);
						params.put(IWindow.DOMAIN_OBJECT, pessoaFisicaJuridica);
						IWindowConfig cfg = new DefaultWindowConfig(params);
						
						IncluiAlteraCadastroGeralWindow incluiAlteraCadastroGeralWindow = new IncluiAlteraCadastroGeralWindow(CadastroGeralI18N.constants.alterar(),pessoaFisicaJuridica,false);
						incluiAlteraCadastroGeralWindow.setModal(true);
						incluiAlteraCadastroGeralWindow.setMinimizable(false);
						incluiAlteraCadastroGeralWindow.setWindowConfig(cfg);
						incluiAlteraCadastroGeralWindow.show();		
					}
					
					@Override
					public void handleFailure(Throwable caught) {
						MessageBox.alert("Alerta","Ocorreu um erro grave!" +
								" \nDetalhes:\n"+caught.getMessage(),null);
					}
					
				});
				
				
			}
			
		});
		
		btnVisualizar.addSelectionListener(new SelectionListener<ButtonEvent>() {
			@Override
			public void componentSelected(ButtonEvent ce) {
				BeanModel beanModel = grid.getSelectionModel().getSelectedItem();
				if(beanModel==null){
					MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(),"Selecione um registro para visualizar!", null);
					return;
				}

				final Long idPessoa = beanModel.get("id");
				
				/* chamada sem o recurso da barra de progresso */
				/*
				service.retornarPessoaFisicaJuridica(idPessoa, new AsyncCallback<PessoaFisicaJuridica>() {

					public void onFailure(Throwable caught) {
						MessageBox.alert("Alerta","Ocorreu um erro grave!" +
								" \nDetalhes:\n"+caught.getMessage(),null);
					}

					public void onSuccess(PessoaFisicaJuridica pessoaFisicaJuridica) {
						
						Map<String, Serializable> params = new HashMap<String, Serializable>();
						params.put(IWindow.OPERATION, Function.EDITAR);
						params.put(IWindow.DOMAIN_OBJECT, pessoaFisicaJuridica);
						IWindowConfig cfg = new DefaultWindowConfig(params);
						
						IncluiAlteraCadastroGeralWindow incluiAlteraCadastroGeralWindow = new IncluiAlteraCadastroGeralWindow("Visualizar",pessoaFisicaJuridica,true);
						incluiAlteraCadastroGeralWindow.setModal(true);
						incluiAlteraCadastroGeralWindow.setMinimizable(false);
						incluiAlteraCadastroGeralWindow.setWindowConfig(cfg);
						incluiAlteraCadastroGeralWindow.show();						
					
					}
				});*/
				
				service.retornarPessoaFisicaJuridica(idPessoa, new RpcWaitCallback<PessoaFisicaJuridica>(WidgetsI18N.messages.aguarde(),WidgetsI18N.messages.processando()) {
					
					@Override
					public void handleResponse(PessoaFisicaJuridica pessoaFisicaJuridica) {
						Map<String, Serializable> params = new HashMap<String, Serializable>();
						params.put(IWindow.OPERATION, Function.EDITAR);
						params.put(IWindow.DOMAIN_OBJECT, pessoaFisicaJuridica);
						IWindowConfig cfg = new DefaultWindowConfig(params);
						
						IncluiAlteraCadastroGeralWindow incluiAlteraCadastroGeralWindow = new IncluiAlteraCadastroGeralWindow("Visualizar",pessoaFisicaJuridica,true);
						incluiAlteraCadastroGeralWindow.setModal(true);
						incluiAlteraCadastroGeralWindow.setMinimizable(false);
						incluiAlteraCadastroGeralWindow.setWindowConfig(cfg);
						incluiAlteraCadastroGeralWindow.show();			
					}
					
					@Override
					public void handleFailure(Throwable caught) {
						MessageBox.alert("Alerta","Ocorreu um erro grave!" +
								" \nDetalhes:\n"+caught.getMessage(),null);
					}
					
				});
			}
		});
		
		btnIncluir.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				
				IWindowConfig cfg = getWindowConfig();
				cfg.getParameters().put(IWindow.OPERATION, Function.INCLUIR);
				
				IncluiAlteraCadastroGeralWindow incluiAlteraCadastroGeralWindow = new IncluiAlteraCadastroGeralWindow(CadastroGeralI18N.constants.incluir(),null,false);
				incluiAlteraCadastroGeralWindow.setWindowConfig(cfg);
				incluiAlteraCadastroGeralWindow.setModal(true);
				incluiAlteraCadastroGeralWindow.setMinimizable(false);
				
				WindowAPI.buildWindow(incluiAlteraCadastroGeralWindow);
			}
		});
		
		Button btnExcluir = new Button(CadastroGeralI18N.constants.excluir());
		btnExcluir.setId("id_PesquisaCadastroGeralWindow_BtnExcluir");
		btnExcluir.setData(IWindow.OPERATION, Permissoes.EXCLUIR);
		addSecurityButton(btnExcluir);
		
		btnExcluir.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				BeanModel beanModel = grid.getSelectionModel().getSelectedItem();
				if(beanModel==null){
					MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(),CadastroGeralI18N.messages.excluirSelecioneRegistro(), null);
					return;
				}
				final Long idPessoa = beanModel.get("id");
				
				/* sem o recurso de barra de progresso*/
				/*service.verificarSePessoaPossuiVinculados(idPessoa,new AsyncCallback<Boolean>() {

					public void onFailure(Throwable caught) {
						MessageBox.alert("Alerta","Ocorreu um erro grave!" +
								" \nDetalhes:\n"+caught.getMessage(),null);
					}

					public void onSuccess(final Boolean result) {
						MessageBox.confirm("Confirme!", "Voce tem certeza que deseja excluir definitivamente essa pessoa?",new Listener<MessageBoxEvent>() {

							public void handleEvent(MessageBoxEvent be) {
								if (be.getButtonClicked().getText().equals("Sim")) {
									if(!result){
										service.exlcuirPessoa(idPessoa, new AsyncCallback<Boolean>() {
											
											public void onFailure(Throwable caught) {
												MessageBox.alert("Alerta","Ocorreu um erro grave!" +
														" \nDetalhes:\n"+caught.getMessage(),null);
											}
											
											public void onSuccess(Boolean result) {
												if(result){
													MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(),CadastroGeralI18N.messages.excluirPessoaSucesso(), null);	
													atualizarGrid();
												}
											}
										});	
										
									}else{
										MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(),CadastroGeralI18N.messages.excluirPessoaPossuiVinculados(), null);
									}
								} else {
									return;
								}
							}
							
						});
					}
				});*/
				
				
				service.verificarSePessoaPossuiVinculados(idPessoa, new RpcWaitCallback<Boolean>(WidgetsI18N.messages.aguarde(),WidgetsI18N.messages.processando()){
					
					
					@Override
					public void handleFailure(Throwable caught) {
						
						MessageBox.alert("Alerta","Ocorreu um erro grave!" +
								" \nDetalhes:\n"+caught.getMessage(),null);
					}
					
					@Override
					public void handleResponse(final Boolean result) {
						MessageBox.confirm("Confirme!", "Voce tem certeza que deseja excluir definitivamente essa pessoa?",new Listener<MessageBoxEvent>() {

							public void handleEvent(MessageBoxEvent be) {
								if (be.getButtonClicked().getText().equals("Sim")) {
									if(!result){
										
										service.exlcuirPessoa(idPessoa, new RpcWaitCallback<Boolean>(WidgetsI18N.messages.aguarde(),WidgetsI18N.messages.processando()){
											
											@Override
											public void handleFailure(Throwable caught) {
												MessageBox.alert("Alerta","Ocorreu um erro grave!" +
														" \nDetalhes:\n"+caught.getMessage(),null);
											}
											
											@Override
											public void handleResponse(Boolean value) {
												if(value){
													MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(),CadastroGeralI18N.messages.excluirPessoaSucesso(), null);	
													atualizarGrid();
												}
											}
										});
									}else{
										MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(),CadastroGeralI18N.messages.excluirPessoaPossuiVinculados(), null);
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
			public void componentSelected(ButtonEvent ce) {
				if(grid.getStore().getModels().isEmpty()){
					return;
				}
				
				/* sem o recurso da barra de progresso */
				/*
				service.gerarRelatorio(getObjetoPessoaFisicaJuridicaPopuladoTela(),TipoNomeRelatorio.CADASTRO_GERAL,TipoFormatoRelatorio.PDF, new AsyncCallback<Void>() {
					public void onSuccess(Void result) {
						exibirRelatorio(TipoNomeRelatorio.CADASTRO_GERAL,TipoFormatoRelatorio.PDF);
					}
					
					public void onFailure(Throwable caught) {
						MessageBox.alert("Alerta","Ocorreu um erro e o relatorio nao sera exibido.",null);
					}
				});*/
				
				service.gerarRelatorio(getObjetoPessoaFisicaJuridicaPopuladoTela(), TipoNomeRelatorio.CADASTRO_GERAL, TipoFormatoRelatorio.PDF, new RpcWaitCallback (WidgetsI18N.messages.aguarde(),WidgetsI18N.messages.processando()) {
					
					@Override
					public void handleResponse(Object value) {
						exibirRelatorio(TipoNomeRelatorio.CADASTRO_GERAL,TipoFormatoRelatorio.PDF);
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
		btnPesquisar.setToolTip(CadastroGeralI18N.tooltip.botaoPesquisar());
		btnLimpar.setToolTip(CadastroGeralI18N.tooltip.botaoLimpar());
		btnAlterar.setToolTip(CadastroGeralI18N.tooltip.botaoAlterar());
		btnIncluir.setToolTip(CadastroGeralI18N.tooltip.botaoIncluir());
		btnImprimir.setToolTip(CadastroGeralI18N.tooltip.botaoImprimir());
		btnAlterar.setToolTip(CadastroGeralI18N.tooltip.botaoAlterar());
		btnExcluir.setToolTip(CadastroGeralI18N.tooltip.botaoExcluir());
		
		/* adiciona os botoes ao grid */
		containerBotoes.add(btnPesquisar, new AbsoluteData(482, 6));
		containerBotoes.add(btnLimpar, new AbsoluteData(548, 6));
		containerBotoes.add(btnExcluir, new AbsoluteData(694, 6));
		containerBotoes.add(btnIncluir, new AbsoluteData(648, 6));
		containerBotoes.add(btnAlterar, new AbsoluteData(598, 6));
		containerBotoes.add(btnImprimir,new AbsoluteData(814, 6));
		containerBotoes.add(btnVisualizar, new AbsoluteData(748, 6));
		containerBotoes.setSize("868", "32");
		
		
	
		return containerBotoes;
	}
	
	private void atualizarGrid() {
		RpcProxy proxyGrid = new RpcProxy() {
			@Override
			protected void load(Object loadConfig, AsyncCallback callback) {
				service.retornaListaPaginadaPessoaFisicaJuridica((PagingLoadConfig)loadConfig,getObjetoPessoaFisicaJuridicaPopuladoTela(), callback);
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
	private ContentPanel getPanelGrid(){
		
		grid = getGridConsulta();
		panelGrid = new ContentPanel();
		panelGrid.setId("id_PesquisaCadastroGeralWindow_PanelGrid");
		panelGrid.add(grid);
		panelGrid.setBottomComponent(toolBar);
		panelGrid.setHeading(CadastroGeralI18N.constants.headingGrid());
		return panelGrid;
	}
	
	
	private ColumnModel getColumnModel() {
		 List<ColumnConfig> configs = new ArrayList<ColumnConfig>();  
		   
		 ColumnConfig column = new ColumnConfig();    
		 column.setId("id");    
		 column.setHeader(CadastroGeralI18N.constants.codigo());    
		 column.setWidth(50);    
		 configs.add(column);  
		 
		 column = new ColumnConfig();    
		 column.setId("nomeRazaoSocial");    
		 column.setHeader(CadastroGeralI18N.constants.nomeRazaoSocial());    
		 column.setWidth(250);
		 configs.add(column);
		 
		 column = new ColumnConfig();    
		 column.setId("cpfCnpjMascarado");    
		 column.setHeader(CadastroGeralI18N.constants.cpfCnpj());    
		 column.setWidth(100);
		 configs.add(column);
		 
		 column = new ColumnConfig();    
		 column.setId("tipo");    
		 column.setHeader(CadastroGeralI18N.constants.tipoPessoa());    
		 column.setWidth(150);
		 configs.add(column);
		 
		 column = new ColumnConfig();    
		 column.setId("nomeCidade");    
		 column.setHeader(CadastroGeralI18N.constants.cidade());    
		 column.setWidth(100);
		 configs.add(column);
		 
		 column = new ColumnConfig();    
		 column.setId("siglaUF");    
		 column.setHeader(CadastroGeralI18N.constants.estado());    
		 column.setWidth(50);
		 configs.add(column);
		 
		 column = new ColumnConfig();    
		 column.setId("login");    
		 column.setHeader(CadastroGeralI18N.constants.login());    
		 column.setWidth(150);
		 configs.add(column);
		 
		 ColumnModel columnModel = new ColumnModel(configs);
		 
		 return columnModel;
	}
	
	public Grid<BeanModel> getGridConsulta() {
		ColumnModel columnModel = getColumnModel();
		grid = new Grid<BeanModel>(new ListStore(),columnModel);
		grid.setId("id_PesquisaCadastroGeralWindow_Grid");
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
		toolBar.setId("id_PesquisaCadastroGeralWindow_ToolBar");
		return grid;
	}
	
	private PessoaFisicaJuridica getObjetoPessoaFisicaJuridicaPopuladoTela() {
		
		String apelidoNomefantasia = textApelidoNomeFantasia.getValue()==null?null:textApelidoNomeFantasia.getValue().toString();
		Long codigoPessoa = textCodigo.getValue()==null?null:textCodigo.getValue().longValue();
		Long codigoGrupoAcesso = (Long) (comboGrupoAcesso.getValue()==null?null:comboGrupoAcesso.getValue().get("id"));
		String cpfCnpjVinculante = comboCpfCnpjVinculador.getValue()==null?null:comboCpfCnpjVinculador.getValue().get("cpfCnpj").toString();
		String cpfCnpjPessoa = null;
		if(radioPessoaFisica.getValue()){
			cpfCnpjPessoa = textCpf.getValueUnMask()==null?null:textCpf.getValueUnMask().toString();
		}else if(radioPessoaJuridica.getValue()){
			cpfCnpjPessoa = textCnpj.getValueUnMask()==null?null:textCnpj.getValueUnMask().toString();
		}
		
		Long codigoAtribuicao = comboAtribuicao.getValue()==null?null:new Long(comboAtribuicao.getValue().get("id").toString());
		String login = textLogin.getValue()==null?null:textLogin.getValue().toString();
		String nomeRazaoSocial = textNomeRazaoSocial.getValue()==null?null:textNomeRazaoSocial.getValue().toString();
		
		Boolean possuicadastroPessoaAtivo = null;
		if(!radiosituacaopessoatodos.getValue()){
			possuicadastroPessoaAtivo = radioSituacaoPessoaAtiva.getValue()==null?null:radioSituacaoPessoaAtiva.getValue();
		}
		
		Boolean possuicadastroUsuarioAtivo = null;
		Boolean possuiUsuario = null;
		if(!radiousuariotodos.getValue()){
			possuiUsuario = !radioUsuarioInexistente.getValue();
			possuicadastroUsuarioAtivo = radioUsuarioLiberado.getValue()==null?null:radioUsuarioLiberado.getValue();			
		}
		
		String sigla = textSigla.getValue()==null?null:textSigla.getValue().toString();
		
		TipoPessoa tipoPessoa = null;
		if(!radiotipopessoatodos.getValue()){
			tipoPessoa = radioPessoaFisica.getValue()==null?null:radioPessoaFisica.getValue()?TipoPessoa.FISICA:TipoPessoa.JURIDICA;			
		}
		
		PessoaFisicaJuridica pessoaFisicaJuridica = new PessoaFisicaJuridica();
		pessoaFisicaJuridica.setApelidoNomeFantasia(apelidoNomefantasia);
		pessoaFisicaJuridica.setId(codigoPessoa);
		pessoaFisicaJuridica.setIdGrupoAcesso(codigoGrupoAcesso);
		pessoaFisicaJuridica.setCpfCnpj(cpfCnpjPessoa);
		pessoaFisicaJuridica.setIdAtribuicao(codigoAtribuicao);
		pessoaFisicaJuridica.setLogin(login);
		pessoaFisicaJuridica.setNomeRazaoSocial(nomeRazaoSocial);
		pessoaFisicaJuridica.setPossuiCadastroPessoaAtivo(possuicadastroPessoaAtivo);
		pessoaFisicaJuridica.setPossuiCadastroUsuarioAtivo(possuicadastroUsuarioAtivo);
		pessoaFisicaJuridica.setSiglaPessoaJuridica(sigla);
		pessoaFisicaJuridica.setTipoPessoa(tipoPessoa);
		pessoaFisicaJuridica.setPossuiUsuario(possuiUsuario);
		pessoaFisicaJuridica.setCpfCnpjVinculante(cpfCnpjVinculante);
		return pessoaFisicaJuridica;
	}
	@Override
	protected void onAjuda() {
		AjudaCadastroGeralWindow ajudaCadastroGeralWindow = new AjudaCadastroGeralWindow();
		ajudaCadastroGeralWindow.show();
	}
	
	@Override
	protected void onClearForm(){
	
		/* identificacao */
		textCodigo.reset();
		textSigla.reset();
		comboAtribuicao.reset();
		textCpfCnpj.reset();
		textCpf.reset();
		textCnpj.reset();
		textNomeRazaoSocial.reset();
		textApelidoNomeFantasia.reset();
		
		radioSituacaoPessoaAtiva.reset();
		radioSituacaoPessoaInativa.reset();
		radiosituacaopessoatodos.reset();
		
		radioPessoaFisica.reset();
		radioPessoaJuridica.reset();
		radiotipopessoatodos.reset();
		
		/* vinculacao dependencia capacitador */
		comboVinculacao.reset();
		comboCpfCnpjVinculador.reset();
		textNomeVinculador.reset();
		
		/* controle grupo acesso */
		comboGrupoAcesso.reset();
		textLogin.reset();
		radiousuariotodos.reset();
		radioUsuarioLiberado.reset();
		radioUsuarioBloqueado.reset();
		radioUsuarioInexistente.reset();
	}
	
	protected void onClearResult(){
		grid.getStore().removeAll();
	}
}
