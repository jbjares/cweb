package br.com.cweb.view.cadastro.instituicaofinanceira.client.view;


import br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira;
import br.com.cweb.cadastro.persistence.entity.TipoInstituicao;
import br.com.cweb.mensagem.to.Mensagem;
import br.com.cweb.view.cadastro.cadastrogeral.client.i18n.CadastroGeralI18N;
import br.com.cweb.view.cadastro.instituicaofinanceira.client.i18n.InstituicaoFinanceiraI18N;
import br.com.cweb.view.cadastro.instituicaofinanceira.client.service.InstituicaoFinanceiraServiceFacade;
import br.com.cweb.view.cadastro.instituicaofinanceira.client.service.InstituicaoFinanceiraServiceFacadeAsync;
import br.com.cweb.view.desktop.client.i18n.DesktopI18N;
import br.com.cweb.view.template.client.TemplateWindow;
import br.com.cweb.widgets.action.RpcWaitCallback;
import br.com.cweb.widgets.constants.Function;
import br.com.cweb.widgets.constants.Permissoes;
import br.com.cweb.widgets.window.IWindow;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.FieldSet;
import com.extjs.gxt.ui.client.widget.form.LabelField;
import com.extjs.gxt.ui.client.widget.form.NumberField;
import com.extjs.gxt.ui.client.widget.form.Radio;
import com.extjs.gxt.ui.client.widget.form.RadioGroup;
import com.extjs.gxt.ui.client.widget.form.TextArea;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteData;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteLayout;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class IncluiAlteraInstituicaoFinanceiraWindow extends TemplateWindow {
	
	private LayoutContainer containerPrincipal;
	
	ContentPanel panelPrincipal = new ContentPanel();;
	LayoutContainer layoutContainerPrincipal = new LayoutContainer();
	InstituicaoFinanceiraServiceFacadeAsync service = GWT.create(InstituicaoFinanceiraServiceFacade.class);
	
	private LayoutContainer layoutContainerInstituicao;
	
	private RadioGroup radioGroupSituacaoInstituicao;
	private RadioGroup radioGroupTipoInstituicao;
	private Radio radioTipoInstituicaoBanco;
	private Radio radioTipoInstituicaoParceiro;
	private Radio radioSituacaoInstituicaoAtivo;
	private Radio radioSituacaoInstituicaoInativo;
	
	private NumberField textCodigo;
	private TextField textNome;
	private TextField textSigla;
	private TextField textSite;
	
	private Button btnPesquisar;
	private Button btnIncluir;
	private Button btnLimpar;
	private Button btnVoltar;
	private FieldSet fieldSetInstituicao;	

	private TextArea textAreaObservacoes;
		
	
	public IncluiAlteraInstituicaoFinanceiraWindow(String header, InstituicaoFinanceira instituicaoFinanceira, Boolean isVisualizar) {
		this.setId("id_IncluiAlteraCadastroInstituicaoFinanceiraWindow");
		setMinimizable(true);
		setResizable(false);
		setSize("786px", "348px");
		setHeading(InstituicaoFinanceiraI18N.constants.headingCadastroInstituicao() + " - " + header);
				
		panelPrincipal.setId("id_IncluiAlteraCadastroInstituicaoFinanceiraWindow_PanelPrincipal");
		panelPrincipal.setHeaderVisible(false);
		panelPrincipal.setButtonAlign(HorizontalAlignment.LEFT);
		panelPrincipal.setAutoWidth(true);
		panelPrincipal.setAutoHeight(true);
		
		panelPrincipal.add(getForm());
		fieldSetInstituicao.setSize("840", "270");
		layoutContainerInstituicao.setSize("770px", "280");
		
		layoutContainerInstituicao.add(panelPrincipal);	
		panelPrincipal.setSize("810", "120");
		
		add(layoutContainerInstituicao);
		
		if(!isVisualizar){
			add(doGetPesquisa());			
		}else{
			bloquearcomponentes();
		}
		
		if (instituicaoFinanceira != null) {
			popularCamposAlteracao(instituicaoFinanceira);		
		}
		
	}
	
	private void bloquearcomponentes() {
		
		textAreaObservacoes.disable();
		textCodigo.disable();
		textNome.disable();
		textSigla.disable();
		textSite.disable();
		radioGroupSituacaoInstituicao.disable();
		radioGroupTipoInstituicao.disable();		
	}

	private void popularCamposAlteracao(
			final InstituicaoFinanceira instituicaoFinanceira) {
		
		textCodigo.setValue(instituicaoFinanceira.getId());
		textNome.setValue(instituicaoFinanceira.getNome());
		textSigla.setValue(instituicaoFinanceira.getSigla());
		textSite.setValue(instituicaoFinanceira.getSite());
		textAreaObservacoes.setValue(instituicaoFinanceira.getObservacoes());
		
		if(instituicaoFinanceira.getPossuiCadastroAtivo()){
			radioSituacaoInstituicaoAtivo.setValue(true);
		}else{
			radioSituacaoInstituicaoInativo.setValue(false);
		}
		
		
		/* load dados instituicao */

		service.retornarInstituicaoFinanceira(instituicaoFinanceira.getId(), new AsyncCallback<InstituicaoFinanceira>(){
			
			private InstituicaoFinanceira instituicao;
			
			public void onFailure(Throwable caught) {
				com.google.gwt.user.client.Window
				.alert("Ocorreu um erro grave!"
						+ " \nDetalhes:\n"
						+ caught.getMessage());
				
			}			
			
			public void onSuccess(InstituicaoFinanceira instituicao) {
				this.instituicao = instituicao;	
				
				textCodigo.setValue(instituicao.getId());
				textNome.setName(instituicao.getNome());
				textSigla.setValue(instituicao.getSigla());
				textSite.setValue(instituicao.getSite());
				
				if(instituicao.getPossuiCadastroAtivo()){
					radioSituacaoInstituicaoAtivo.setValue(true);
				}else{
					radioSituacaoInstituicaoInativo.setValue(true);
				}
				
				if(instituicao.getTipoInstituicao().getValue() == 0){
					radioTipoInstituicaoBanco.setValue(true);
				}else{
					radioTipoInstituicaoParceiro.setValue(true);
				}
				
			}
			
			
		});		
	}

	private Component doGetPesquisa() {
		
		LayoutContainer layoutContainerBotoesPesquisa = new LayoutContainer();
		layoutContainerBotoesPesquisa.setId("id_IncluiAlteraInstituicaoFinanceiraWindow_LayoutContainerBotoesPesquisa");
		layoutContainerBotoesPesquisa.setLayout(new AbsoluteLayout());	
		
		Button btnLimpar = new Button(InstituicaoFinanceiraI18N.constants.limpar());
		btnLimpar.setId("id_IncluiAlteraInstituicaoFinanceiraWindow_BtnLimpar");
		btnLimpar.setData(IWindow.OPERATION, Permissoes.LIMPAR);
		addSecurityButton(btnLimpar);
		layoutContainerBotoesPesquisa.add(btnLimpar, new AbsoluteData(670, 6));

		Button btnSalvar = new Button(InstituicaoFinanceiraI18N.constants.salvar());
		btnSalvar.setId("id_IncluiAlteraInstituicaoFinanceiraWindow_BtnSalvar");
		btnSalvar.setData(IWindow.OPERATION, Permissoes.SALVAR);
		addSecurityButton(btnSalvar);
		layoutContainerBotoesPesquisa.add(btnSalvar, new AbsoluteData(720, 6));
		layoutContainerBotoesPesquisa.setSize("750", "40");

		/* tooltips para os botoes */
		btnLimpar.setToolTip(InstituicaoFinanceiraI18N.tooltip.limpar());
		btnSalvar.setToolTip(InstituicaoFinanceiraI18N.tooltip.alterar());

		btnLimpar.addSelectionListener(new SelectionListener<ButtonEvent>() {

			@Override
			public void componentSelected(ButtonEvent ce) {
				onClearForm();
			}
		});

		btnSalvar.addSelectionListener(new SelectionListener<ButtonEvent>() {

			@Override
			public void componentSelected(ButtonEvent ce) {
				salvar();
			}
		});

		return layoutContainerBotoesPesquisa;	

	}

	protected void salvar() {
		
		InstituicaoFinanceira instituicaoFinanceira = null;

		if (!isDadosValidos()) {
			return;
		}
		
		instituicaoFinanceira = getInstituicaoPopuladaTela();

		if (getOperacao() == Function.EDITAR) {
			service.atualizarInstituicaoFinanceira(instituicaoFinanceira, new RpcWaitCallback<Boolean>() {
				
				@Override
				public void handleResponse(Boolean result) {
					if (result) {						
						MessageBox.info("Informacao!", "Instituicao Financeira atualizada com sucesso!", null);
					}
				}

			});
		} else {

			service.incluirInstituicaoFinanceira(instituicaoFinanceira, new RpcWaitCallback<Mensagem>(DesktopI18N.messages.aguarde(),DesktopI18N.messages.processando()) {
				
				@Override
				public void handleResponse(Mensagem mensagem) {
					MessageBox.alert(CadastroGeralI18N.messages.headingInformacao(), mensagem.getDescricao(), null);
				}
				
			});
		}

		
	}

	private InstituicaoFinanceira getInstituicaoPopuladaTela() {
		
		Long codigoInstituicao = textCodigo.getValue() == null ? null:textCodigo.getValue().longValue();
		String nomeInstituicao = textNome.getValue() == null ? null:textNome.getValue().toString();
		String sigla = textSigla.getValue() == null ? null:textSigla.getValue().toString();
		String site =  textSite.getValue() == null ? null:textSite.getValue().toString();
		String observacao = textAreaObservacoes.getValue() == null ? null:textAreaObservacoes.getValue().toString();
		Boolean possuiCadastroInstituicaoAtivo = radioSituacaoInstituicaoAtivo.getValue();
		
		Boolean tipoInstituicaoBanco = radioTipoInstituicaoBanco.getValue();
		
		InstituicaoFinanceira instituicaoFinanceira = new InstituicaoFinanceira();		
		instituicaoFinanceira.setId(codigoInstituicao);
		instituicaoFinanceira.setNome(nomeInstituicao);
		instituicaoFinanceira.setSigla(sigla);		
		instituicaoFinanceira.setSite(site);
		instituicaoFinanceira.setObservacoes(observacao);
		instituicaoFinanceira.setPossuiCadastroAtivo(possuiCadastroInstituicaoAtivo);	
		if(tipoInstituicaoBanco){
			instituicaoFinanceira.setTipoInstituicao(TipoInstituicao.BANCO);
		}else{
			instituicaoFinanceira.setTipoInstituicao(TipoInstituicao.PARCEIRO);
		}
		
		return instituicaoFinanceira;		
	}

	private boolean isDadosValidos() {
		
		if (!textAreaObservacoes.isValid()) {
			return false;
		}else if (!textCodigo.isValid()) {
			return false;
		} else if (!textNome.isValid()) {
			return false;
		} else if (!textSigla.isValid()) {
			return false;
		} else if (!textSite.isValid()) {
			return false;
		} else if (!radioSituacaoInstituicaoAtivo.isValid()) {
			return false;
		} else if (!radioSituacaoInstituicaoInativo.isValid()) {
			return false;
		} else if (!radioTipoInstituicaoBanco.isValid()) {
			return false;
		} else if (!radioTipoInstituicaoParceiro.isValid()) {
			return false;
		} 		
		return true;	
	}

	private Component getForm(){
		
		layoutContainerInstituicao = new LayoutContainer();
		layoutContainerInstituicao.setId("id_IncluiAlteraInstituicaoFinanceiraWindow_LayoutContainerInstituicao");
		
		/*Dados de Instituicao*/
		fieldSetInstituicao = new FieldSet();
		//fieldSetInstituicao.setHeading(InstituicaoFinanceiraI18N.constants.headingCadastroInstituicao());
		fieldSetInstituicao.setId("id_IncluiAlteraCadastroGeralWindow_FieldSetInstituicao");
		fieldSetInstituicao.setAutoWidth(true);
		fieldSetInstituicao.setLayout(new AbsoluteLayout());
		
		LabelField labelCodigo = new LabelField(InstituicaoFinanceiraI18N.constants.codigo());
		labelCodigo.setId("id_IncluiAlteraInstituicaoFinanceiraWindow_LabelCodigo");
		fieldSetInstituicao.add(labelCodigo, new AbsoluteData(0,0));		
		textCodigo = new NumberField();
		textCodigo.setId("id_IncluiAlteraCadastroInstituicaoFinanceiraWindow_TextCodigo");		
		textCodigo.setName("codigo");		
		textCodigo.setToolTip(InstituicaoFinanceiraI18N.tooltip.identificadorInstituicao());
		textCodigo.setMaxLength(30);
		textCodigo.setAllowBlank(false);
		fieldSetInstituicao.add(textCodigo, new AbsoluteData(0, 17));
		textCodigo.setSize("95px", "22px");
		
		
		LabelField labelSigla = new LabelField(InstituicaoFinanceiraI18N.constants.sigla());
		labelSigla.setId("id_IncluiAlteraInstituicaoFinanceiraWindow_LabelSigla");
		fieldSetInstituicao.add(labelSigla, new AbsoluteData(582, 70));
		textSigla = new TextField<String>();		
		textSigla.setId("id_IncluiAlteraCadastroInstituicaoFinanceiraWindow_TextSigla");
		textSigla.setAllowBlank(true);
		textSigla.setFieldLabel("sigla");
		textSigla.setMaxLength(20);
		fieldSetInstituicao.add(textSigla, new AbsoluteData(615,67));
		textSigla.setSize("78px", "22px");
		
		
		LabelField labelNome = new LabelField(InstituicaoFinanceiraI18N.constants.nome());
		labelNome.setId("id_IncluiAlteraInstituicaoFinanceiraWindow_LabelNome");
		fieldSetInstituicao.add(labelNome, new AbsoluteData(0, 45));
		textNome = new TextField<String>();
		textNome.setId("id_IncluiAlteraCadastroInstituicaoFinanceiraWindow_TextNome");
		textNome.setName("nome");
		textNome.setAllowBlank(false);
		textNome.setMaxLength(100);
		fieldSetInstituicao.add(textNome, new AbsoluteData(0, 67));
		textNome.setSize("388px", "22px");
		
		
		LabelField labelSite = new LabelField(InstituicaoFinanceiraI18N.constants.webSite());
		labelSite.setId("id_IncluiAlteraInstituicaoFinanceiraWindow_LabelSite");
		fieldSetInstituicao.add(labelSite, new AbsoluteData(0, 95));
		textSite = new TextField<String>();
		textSite.setId("id_IncluiAlteraCadastroInstituicaoFinanceiraWindow_TextSite");
		textSite.setAllowBlank(true);
		textSite.setFieldLabel("webSite");
		textSite.setMaxLength(200);
		fieldSetInstituicao.add(textSite, new AbsoluteData(0, 113));	
		textSite.setSize("232px", "22px");
		
		
		LabelField labelObservacoes = new LabelField(InstituicaoFinanceiraI18N.constants.observacoes());
		labelObservacoes.setId("id_IncluiAlteraInstituicaoFinanceiraWindow_LabelObservacoes");
		fieldSetInstituicao.add(labelObservacoes, new AbsoluteData(0, 141));
		labelObservacoes.setSize("75px", "14px");
		textAreaObservacoes = new TextArea();
		textAreaObservacoes.setId("id_IncluiAlteraCadastroInstituicaoFinanceiraWindow_TextAreaObservacoes");
		textAreaObservacoes.setFieldLabel("observacoes");
		textAreaObservacoes.setMaxLength(255);
		fieldSetInstituicao.add(textAreaObservacoes, new AbsoluteData(0, 166));
		textAreaObservacoes.setSize("750px", "60px");
		
		
		LabelField labelSituacaoInstituicao = new LabelField(InstituicaoFinanceiraI18N.constants.situacao());
		labelSituacaoInstituicao.setId("id_IncluiAlteraInstituicaoFinanceiraWindow_LabelSituacaoInstituicao");
		fieldSetInstituicao.add(labelSituacaoInstituicao, new AbsoluteData(558, 124));
		radioGroupSituacaoInstituicao = new RadioGroup();
		radioGroupSituacaoInstituicao.setId("id_IncluiAlteraInstituicaoFinanceiraWindow_RadioGroupSituacaoInstituicao");
		radioGroupSituacaoInstituicao.setSelectionRequired(true);
		
		
		radioSituacaoInstituicaoAtivo = new Radio();
		radioSituacaoInstituicaoAtivo.setId("id_IncluiAlteraCadastroInstituicaoFinanceiraWindow_RadioSituacaoInstituicaoAtivo");
		radioGroupSituacaoInstituicao.add(radioSituacaoInstituicaoAtivo);
		radioSituacaoInstituicaoAtivo.setWidth("61px");
		radioSituacaoInstituicaoAtivo.setBoxLabel(InstituicaoFinanceiraI18N.constants.situacaoAtiva());		
		radioSituacaoInstituicaoAtivo.setToolTip(InstituicaoFinanceiraI18N.tooltip.situacao());
		radioSituacaoInstituicaoAtivo.setHideLabel(true);
		radioSituacaoInstituicaoAtivo.setValue(true);
		radioSituacaoInstituicaoAtivo.setAutoValidate(true);
		
		
		radioSituacaoInstituicaoInativo = new Radio();
		radioSituacaoInstituicaoInativo.setId("id_IncluiAlteraCadastroInstituicaoFinanceiraWindow_RadioSituacaoInstituicaoInativo");
		radioGroupSituacaoInstituicao.add(radioSituacaoInstituicaoInativo);
		radioSituacaoInstituicaoInativo.setBoxLabel("Inativo");		
		radioSituacaoInstituicaoInativo.setToolTip("");
		radioSituacaoInstituicaoInativo.setHideLabel(true);
		radioSituacaoInstituicaoInativo.setValue(true);
		radioSituacaoInstituicaoInativo.setAutoValidate(true);		
		
		fieldSetInstituicao.add(radioGroupSituacaoInstituicao, new AbsoluteData(615, 124));
		
		
		
		LabelField labelTipoInstituicao = new LabelField(InstituicaoFinanceiraI18N.constants.tipoInstituicao());
		labelTipoInstituicao.setId("id_IncluiAlteraInstituicaoFinanceiraWindow_LabelTipoInstituicao");
		fieldSetInstituicao.add(labelTipoInstituicao, new AbsoluteData(582, 98));
		radioGroupTipoInstituicao = new RadioGroup();
		radioGroupTipoInstituicao.setId("id_IncluiAlteraInstituicaoFinanceiraWindow_RadioGroupTipoInstituicao");
		radioGroupTipoInstituicao.setSelectionRequired(true);
		
		
		radioTipoInstituicaoBanco = new Radio();
		radioTipoInstituicaoBanco.setId("id_IncluiAlteraCadastroInstituicaoFinanceiraWindow_RadioTipoInstituicaoBanco");
		radioGroupTipoInstituicao.add(radioTipoInstituicaoBanco);
		radioTipoInstituicaoBanco.setBoxLabel("Banco");		
		radioTipoInstituicaoBanco.setToolTip("");
		radioTipoInstituicaoBanco.setHideLabel(true);
		radioTipoInstituicaoBanco.setValue(true);
		radioTipoInstituicaoBanco.setAutoValidate(true);
		
		
		radioTipoInstituicaoParceiro = new Radio();
		radioTipoInstituicaoParceiro.setId("id_IncluiAlteraCadastroInstituicaoFinanceiraWindow_RadioTipoInstituicaoParceiro");
		radioGroupTipoInstituicao.add(radioTipoInstituicaoParceiro);
		radioTipoInstituicaoParceiro.setBoxLabel("Parceiro");		
		radioTipoInstituicaoParceiro.setToolTip("");
		radioTipoInstituicaoParceiro.setHideLabel(true);
		radioTipoInstituicaoParceiro.setValue(true);
		radioTipoInstituicaoParceiro.setAutoValidate(true);
		
		fieldSetInstituicao.add(radioGroupTipoInstituicao, new AbsoluteData(615, 95));		
		
		return fieldSetInstituicao;
	}

	@Override
	protected void onAjuda() {
		AjudaInstituicaoFinanceiraWindow ajudaInstituicaoFinanceiraWindow = new AjudaInstituicaoFinanceiraWindow();
		ajudaInstituicaoFinanceiraWindow.show();
		
	}

	@Override
	protected void onClearForm() {
		
		textAreaObservacoes.reset();
		textCodigo.reset();
		textNome.reset();
		textSigla.reset();
		textSite.reset();
		
		radioSituacaoInstituicaoAtivo.reset();
		radioSituacaoInstituicaoInativo.reset();
		radioTipoInstituicaoBanco.reset();
		radioTipoInstituicaoParceiro.reset();		
	}
}
