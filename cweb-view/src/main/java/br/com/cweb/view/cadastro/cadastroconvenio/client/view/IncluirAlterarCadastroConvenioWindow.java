package br.com.cweb.view.cadastro.cadastroconvenio.client.view;

import br.com.cweb.cadastro.persistence.entity.Convenio;
import br.com.cweb.view.cadastro.cadastroconvenio.client.i18n.CadastroConvenioConstants;
import br.com.cweb.view.cadastro.cadastroconvenio.client.i18n.CadastroConvenioMessages;
import br.com.cweb.view.cadastro.cadastroconvenio.client.i18n.CadastroConvenioTooltip;
import br.com.cweb.view.cadastro.cadastroconvenio.client.service.CadastroConvenioServiceFacade;
import br.com.cweb.view.cadastro.cadastroconvenio.client.service.CadastroConvenioServiceFacadeAsync;
import br.com.cweb.view.desktop.client.build.WindowAPI;
import br.com.cweb.view.template.client.TemplateWindow;
import br.com.cweb.widgets.action.RpcWaitCallback;
import br.com.cweb.widgets.constants.Permissoes;
import br.com.cweb.widgets.window.AjudaCommonsWindow;
import br.com.cweb.widgets.window.IWindow;

import com.extjs.gxt.ui.client.Style.LayoutRegion;
import com.extjs.gxt.ui.client.binding.Converter;
import com.extjs.gxt.ui.client.binding.FieldBinding;
import com.extjs.gxt.ui.client.binding.FormBinding;
import com.extjs.gxt.ui.client.data.BeanModel;
import com.extjs.gxt.ui.client.data.PagingLoader;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.event.WindowEvent;
import com.extjs.gxt.ui.client.event.WindowListener;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.Label;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.Radio;
import com.extjs.gxt.ui.client.widget.form.RadioGroup;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteData;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteLayout;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import com.extjs.gxt.ui.client.widget.layout.BorderLayoutData;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.google.gwt.core.client.GWT;

public class IncluirAlterarCadastroConvenioWindow extends TemplateWindow {
	private static final CadastroConvenioTooltip TOOLTIPS = GWT.create(CadastroConvenioTooltip.class);
	private static final CadastroConvenioConstants CONSTANTS = GWT.create(CadastroConvenioConstants.class);
	private static final CadastroConvenioMessages MESSAGES = GWT.create(CadastroConvenioMessages.class);

	CadastroConvenioServiceFacadeAsync service = GWT
			.create(CadastroConvenioServiceFacade.class);

	private FormBinding formBindings;
	private TextField<String> txtDescricao;

	protected AjudaCommonsWindow ajuda;

	private Radio radioInativo;

	private Radio radioAtivo;

	private Button btnLimpar;

	private FormPanel formConvenio;

	private ListStore<BeanModel> store;

	private Button btnSalvar;

	public IncluirAlterarCadastroConvenioWindow(ListStore<BeanModel> store) {
		setActive(true);
		setId("id_cadastrconvenio_window");
		setOnEsc(false);
		setModal(true);
		setMaximizable(true);
		setMinHeight(191);
		setMinWidth(447);
		setInitialWidth(447);
		setHeading(CONSTANTS.janelaCadastroTitulo());
		setLayout(new BorderLayout());

		ContentPanel panelConvenio = new ContentPanel();
		panelConvenio.setId("id_cadastroconvenio_panelconvenio");
		panelConvenio.setHeaderVisible(false);
		panelConvenio.setHeading("");

		formConvenio = new FormPanel();
		formConvenio.setId("id_cadastroconvenio_form");
		formConvenio.setHeaderVisible(false);
		formConvenio.setHeading("Convênio");
		formConvenio.setCollapsible(true);
		formConvenio.setLayout(new AbsoluteLayout());

		txtDescricao = new TextField<String>();
		txtDescricao.setToolTip(TOOLTIPS.nome());
		txtDescricao.setId("id_incluiralterar_cadastroconvenio_txtDescricao");
		txtDescricao.setAllowBlank(false);
		formConvenio.add(txtDescricao, new AbsoluteData(19, 79));
		txtDescricao.setSize("267px", "22px");
		txtDescricao.setName("nome");
		txtDescricao.setFieldLabel("Descrição");
		txtDescricao.setFireChangeEventOnSetValue(true);

		Label lblDescricao = new Label("Descrição do Convênio");
		lblDescricao.setToolTip(TOOLTIPS.nome());
		lblDescricao.setText(CONSTANTS.nome());
		lblDescricao.setLabelFor("nome");
		formConvenio.add(lblDescricao, new AbsoluteData(19, 59));

		RadioGroup radioGroupSituacao = new RadioGroup();
		radioGroupSituacao.setName("possuiCadastroAtivo");
		radioGroupSituacao
				.setId("id_IncluirAlterarCadastroConvenio_radioGroupSituacao");
		radioGroupSituacao.setSelectionRequired(true);

		radioAtivo = new Radio();
		radioAtivo.setToolTip(TOOLTIPS.ativo());
		radioAtivo.setId("id_IncluirAlterarCadastroConvenio_radioAtivo");
		radioAtivo.setName("ativo");
		radioGroupSituacao.add(radioAtivo);
		radioAtivo.setBoxLabel(CONSTANTS.ativo());
		radioAtivo.setFireChangeEventOnSetValue(true);

		radioInativo = new Radio();
		radioInativo.setToolTip(TOOLTIPS.inativo());
		radioInativo.setId("id_IncluirAlterarCadastroConvenio_radioInativo");
		radioInativo.setName("inativo");
		radioGroupSituacao.add(radioInativo);
		radioInativo.setBoxLabel(CONSTANTS.inativo());
		radioInativo.setFireChangeEventOnSetValue(true);

		formConvenio.add(radioGroupSituacao, new AbsoluteData(292, 79));
		radioGroupSituacao.setSize("131px", "22px");
		radioGroupSituacao.setFieldLabel("Situação");

		Label lblSituao = new Label("Descrição do Convênio");
		lblSituao.setToolTip(CONSTANTS.situacao());
		lblSituao.setText(CONSTANTS.situacao());
		lblSituao.setLabelFor("possuiCadastroAtivo");
		formConvenio.add(lblSituao, new AbsoluteData(292, 59));
		lblSituao.setSize("109px", "13px");
		panelConvenio.setLayout(new FitLayout());
		panelConvenio.add(formConvenio);
		formConvenio.setHeight("118px");
		panelConvenio.setCollapsible(true);

		btnSalvar = new Button(CONSTANTS.salvar());
		btnSalvar.setToolTip(TOOLTIPS.salvar());
		
		btnSalvar.setData(IWindow.OPERATION, Permissoes.SALVAR);
		addSecurityButton(btnSalvar);
		
		panelConvenio.addButton(btnSalvar);
		btnSalvar.setId("id_IncluirAlterarCadastroConvenio_btnSalvar");

		btnSalvar.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				onSalvar();
			}
		});
		btnSalvar.setWidth("60");

		btnLimpar = new Button(CONSTANTS.limpar());
		btnLimpar.setToolTip(TOOLTIPS.limpar());
		
		btnLimpar.setData(IWindow.OPERATION, Permissoes.LIMPAR);
		addSecurityButton(btnLimpar);
		
		panelConvenio.addButton(btnLimpar);
		btnLimpar.setId("id_IncluirAlterarCadastroConvenio_btnLimpar");
		btnLimpar.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				onClearForm();
			}
		});
		btnLimpar.setWidth("60");

		Button btnVoltar = new Button(CONSTANTS.voltar());
		btnVoltar.setToolTip(TOOLTIPS.voltar());
		
		btnVoltar.setData(IWindow.OPERATION, Permissoes.VOLTAR);
		addSecurityButton(btnVoltar);
		
		panelConvenio.addButton(btnVoltar);
		btnVoltar.setId("id_IncluirAlterarCadastroConvenio_btnVoltar");
		btnVoltar.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				onVoltar();
			}
		});
		btnVoltar.setWidth("60");

		Button btnAjuda = new Button(CONSTANTS.ajudar());
		btnAjuda.setData(IWindow.OPERATION, Permissoes.AJUDA);
		addSecurityButton(btnAjuda);
		btnAjuda.setToolTip(TOOLTIPS.ajudar());
		panelConvenio.addButton(btnAjuda);
		btnAjuda.setId("id_IncluirAlterarCadastroConvenio_btnAjuda");
		btnAjuda.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				onAjuda();

			}
		});
		btnAjuda.setWidth("60");
		add(panelConvenio, new BorderLayoutData(LayoutRegion.CENTER));
		panelConvenio.setSize("100%", "200");

		formBindings = new FormBinding(formConvenio, true);
		formBindings.addFieldBinding(new FieldBinding(radioGroupSituacao,
				"possuiCadastroAtivo"));
		formBindings.getBinding(radioGroupSituacao).setConverter(
				new Converter() {
					public Object convertModelValue(Object value) {
						return (value != null && (Boolean) value) ? radioAtivo
								: radioInativo;
					}

					public Object convertFieldValue(Object value) {
						return (Boolean) (value != null && value == radioAtivo);
					}
				});
		formBindings.setStore(store);
		this.store = store;
	}

	protected void onSalvar() {

		Convenio convenio = ((BeanModel) this.formBindings.getModel())
				.getBean();

		final boolean incluindo = convenio.getId() == null;
		final boolean excluindo = !incluindo && txtDescricao.isReadOnly();

		if (!excluindo) {
			service.salvarConvenio(convenio,
					new RpcWaitCallback<Long>(MESSAGES.aguarde(),
							MESSAGES.processando()) {

						@Override
						public void handleResponse(Long novoId) {

							if (incluindo)
								onSucessoToInsert(novoId);
							onSucesso();
						}

						@Override
						public void handleFailure(Throwable exception) {
							MessageBox.alert(MESSAGES.tituloFalha(),
									MESSAGES.falhaNaOperacao(), null);
						}

					});
		} else {
			service.excluirConvenio(convenio,
					new RpcWaitCallback<Void>(MESSAGES.aguarde(),
							MESSAGES.processando()) {

						@Override
						public void handleResponse(Void vvoid) {

							onSucessoToRemove();

						}

						@Override
						public void handleFailure(Throwable exception) {
							MessageBox.alert(MESSAGES.tituloInformacao(),
									MESSAGES.falhaNaOperacao(), null);
						}

					});
		}

		this.addWindowListener(new WindowListener() {
			public void windowHide(WindowEvent we) {
				onWindowHide();
			}

		});
	}

	protected void onWindowHide() {
		this.store.rejectChanges();
		this.formBindings.unbind();
		this.btnSalvar.setText("Salvar");
		this.setReadOnlyToFields(false);
	}

	protected void onSucessoToRemove() {
		this.hide();
		PagingLoader loader = (PagingLoader) store.getLoader();
		loader.load();
	}

	protected void onSucessoToInsert(Long novoId) {
		BeanModel model = (BeanModel) this.formBindings.getModel();

		Convenio convenio = model.getBean();
		convenio.setId(novoId);

		ListStore<BeanModel> store = this.store;
		store.insert(model, 0);
	}

	protected void onSucesso() {
		this.store.commitChanges();
		MessageBox.alert(MESSAGES.tituloInformacao(),
				MESSAGES.operacaoSucesso(), null);
		this.hide();// discardChanges

	}

	protected void onVoltar() {
		this.hide();
	}

	@Override
	protected void onAjuda() {
		if (ajuda == null)
			ajuda = new AjudaCommonsWindow(
					"id_AjudaCadastroConvenioWindow",
					"Gerênciar Convênios - Ajuda",
					"\r\nFuncionalidade:\r\n- Manter Cadastro Convênio    \r\n\r\nObjetivo:\r\n- Incluir, alterar ou excluir os Convênios dos Planos Bancários.   \r\n\r\nDescri\u00E7\u00F5es adicionais: \r\n- \u00C9 poss\u00EDvel identificar e vincular uma pessoa a seu superior respons\u00E1vel, como uma base ou um corretor captador. \r\nConceder permiss\u00E3o para que a pessoa se torne um usu\u00E1rio do sistema e possa acess\u00E1-lo atrav\u00E9s de um Login/Senha.\r\nToda vez que um nova pessoa \u00E9 cadastrada e \u00E9 liberado seu acesso como usu\u00E1rio, o sistema envia uma senha provis\u00F3ria para o e-mail do usu\u00E1rio. A senha deve ser trocada no primeiro acesso.\r\nInformar dados de conta banc\u00E1ria para que as pessoas possam receber seus devidos pagamentos.    \r\n\r\nIncluir: \r\n- Orienta\u00E7\u00E3o: . Para realizar a a\u00E7\u00E3o de incluir \u00E9 clicar no bot\u00E3o Incluir da tela inicial de consulta. \r\nO sistema abrir\u00E1 a tela de cadastro onde ser\u00E1 preciso preencher algumas informa\u00E7\u00F5es obrigat\u00F3rias na tela, depois clicar em Salvar.   \r\n\r\nAlterar:    \r\n- Para realizar a a\u00E7\u00E3o de alterar \u00E9 preciso selecionar o registro na tela de consulta e clicar no bot\u00E3o Alterar. \r\nO sistema abrir\u00E1 a tela de cadastro com as informa\u00E7\u00F5es passiveis de altera\u00E7\u00E3o.    \r\n\r\nExcluir:\r\nOrienta\u00E7\u00E3o: . Para realizar a a\u00E7\u00E3o de excluir \u00E9 preciso selecionar o registro na tela de consulta e clicar no bot\u00E3o Excluir.\r\nUma pessoa s\u00F3 pode ser exclu\u00EDda do cadastro caso nenhuma outra informa\u00E7\u00E3o do sistema dependa deste registro. Por outro lado, o sistema permite que este cadastro possa ser alterado para situa\u00E7\u00E3o de inativo.    \r\n      \r\nPesquisar:\r\n- Para clicar no bot\u00E3o Pesquisar, uma tela de filtro \u00E9 apresentada. \u00C9 preciso informar pelo menos algum filtro na tela antes de clicar em pesquisar.\r\nO sistema abrir\u00E1 uma tela de consulta com resultado da pesquisa.    \r\n       \r\nImprimir:\r\n- Est\u00E1 op\u00E7\u00E3o permite que seja impresso as informa\u00E7\u00F5es apresentadas na tela de consulta.   \r\n       \r\nLimpar:\r\n- Limpa todos os campos da tela   \r\n        \r\n");

		ajuda.show();
	}

	@Override
	protected void onClearForm() {
		formConvenio.clear();
	}

	public void showToRemove(BeanModel model) {
		setReadOnlyToFields(true);
		formBindings.bind(model);
		this.btnSalvar.setText("Excluir");
		WindowAPI.buildWindow(this);
	}

	public void showToUpdate(BeanModel model) {
		
		setReadOnlyToFields(false);
		formBindings.bind(model);
		WindowAPI.buildWindow(this);
	}

	public void showToInsert(BeanModel beanModel) {
		setReadOnlyToFields(false);
		formBindings.bind(beanModel);
		WindowAPI.buildWindow(this);
	}

	private void setReadOnlyToFields(boolean readOnly) {

		this.formConvenio.setReadOnly(readOnly);
		/*
		 * txtDescricao.setReadOnly(readOnly); radioAtivo.setReadOnly(readOnly);
		 * radioInativo.setReadOnly(readOnly);
		 */

		btnLimpar.setEnabled(!readOnly);
	}
}
