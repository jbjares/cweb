package br.com.cweb.view.cadastro.cadastrogeral.client.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar;
import br.com.cweb.cadastro.persistence.entity.Atribuicao;
import br.com.cweb.cadastro.persistence.entity.Cidade;
import br.com.cweb.cadastro.persistence.entity.ContaBancaria;
import br.com.cweb.cadastro.persistence.entity.Endereco;
import br.com.cweb.cadastro.persistence.entity.Estado;
import br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira;
import br.com.cweb.cadastro.persistence.entity.PerfilComissao;
import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.cadastro.persistence.entity.PessoaFisica;
import br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica;
import br.com.cweb.cadastro.persistence.entity.PessoaJuridica;
import br.com.cweb.cadastro.persistence.entity.TipoConta;
import br.com.cweb.cadastro.persistence.entity.TipoPessoa;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;
import br.com.cweb.seguranca.persistence.entity.Usuario;
import br.com.cweb.view.cadastro.cadastrogeral.client.i18n.CadastroGeralI18N;
import br.com.cweb.view.cadastro.cadastrogeral.client.service.CadastroGeralServiceFacade;
import br.com.cweb.view.cadastro.cadastrogeral.client.service.CadastroGeralServiceFacadeAsync;
import br.com.cweb.view.template.client.TemplateCombosDependentes;
import br.com.cweb.view.template.client.TemplateWindow;
import br.com.cweb.widgets.action.RpcWaitCallback;
import br.com.cweb.widgets.build.BeanModelBuilder;
import br.com.cweb.widgets.constants.Function;
import br.com.cweb.widgets.constants.Permissoes;
import br.com.cweb.widgets.i18n.WidgetsI18N;
import br.com.cweb.widgets.textfield.TextFieldMask;
import br.com.cweb.widgets.util.Cnpj;
import br.com.cweb.widgets.util.Cpf;
import br.com.cweb.widgets.util.CpfCnpj;
import br.com.cweb.widgets.window.IWindow;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.data.BaseListLoader;
import com.extjs.gxt.ui.client.data.BeanModel;
import com.extjs.gxt.ui.client.data.BeanModelReader;
import com.extjs.gxt.ui.client.data.ListLoader;
import com.extjs.gxt.ui.client.data.ModelProcessor;
import com.extjs.gxt.ui.client.data.RpcProxy;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.FieldEvent;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.MessageBoxEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.CheckBox;
import com.extjs.gxt.ui.client.widget.form.CheckBoxGroup;
import com.extjs.gxt.ui.client.widget.form.ComboBox;
import com.extjs.gxt.ui.client.widget.form.FieldSet;
import com.extjs.gxt.ui.client.widget.form.LabelField;
import com.extjs.gxt.ui.client.widget.form.ListModelPropertyEditor;
import com.extjs.gxt.ui.client.widget.form.Radio;
import com.extjs.gxt.ui.client.widget.form.RadioGroup;
import com.extjs.gxt.ui.client.widget.form.SimpleComboBox;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteData;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteLayout;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.extjs.gxt.ui.client.Style;
import com.extjs.gxt.ui.client.data.LoadConfig;

public class IncluiAlteraCadastroGeralWindow extends TemplateWindow {

	protected static final Integer NUMERO_MAXIMO_CPF_COM_MASCARA = 13;

	private static final Integer NUMERO_MAXIMO_CPF = 11;

	ContentPanel contentpanelPrincipal = new ContentPanel();
	LayoutContainer layoutContainerPrincipal = new LayoutContainer();
	CadastroGeralServiceFacadeAsync service = GWT
			.create(CadastroGeralServiceFacade.class);

	private PessoaFisica pessoaFisica;
	private PessoaJuridica pessoaJuridica;
	private TextField textCodigo;
	private TextField textSigla;
	private TextField textNomeRazaoSocial;
	private TextField textApelidoNomeFantasia;
	private ComboBox<BeanModel> comboAtribuicao;
	private Radio radioTipoPessoaFisica;
	private Radio radioTipoPessoaJuridica;
	private TextField textEndereco;
	private TextField textNumero;
	private TextFieldMask textCep;
	private TextField textBairro;
	private ComboBox<BeanModel> comboEstados;
	private ComboBox<BeanModel> comboCidades;
	private TextField textEmail;
	private TextFieldMask textDddFax;
	private TextFieldMask textDddFoneFixo;
	private TextFieldMask textDddCelular;
	private TextField textResponsavel;
	private TextFieldMask textDddTelefoneResponsvel;
	private ComboBox<BeanModel> comboBancos;
	private ComboBox<BeanModel> comboTipoConta;
	private TextField textAgencia;
	private TextField textNumeroConta;
	private TextField textFavorecido;
	private TextField textCpfCnpjFavorecido;
	private ComboBox<BeanModel> comboPerfilComissao;
	private Radio bonificacaoSim;
	private Radio bonificacaoNo;
	private ComboBox<BeanModel> comboVinculacao;
	private ComboBox<BeanModel> comboCpfCnpjVinculador;
	private ComboBox<BeanModel> comboGrupoAcesso;
	private Radio situacaoUsuarioLiberado;
	private Radio situacaoUsuarioBloqueado;
	private TextField textLogin;
	private Radio situacaoPessoaAtiva;
	private Radio situacaoPessoaInativa;
	private LayoutContainer layoutContainerIdentificacao;
	private LayoutContainer layoutContainerVinculacao;
	private LayoutContainer layoutContainerControleAcesso;
	private TextField textNomeVinculador;
	private CheckBox checkgerarsenha;
	private CheckBox chckbxChecksuperusuario;
	private RadioGroup radiogroupsituacaopessoa;
	private RadioGroup radiogrouptipopessoa;
	private RadioGroup radiogrouppossuibonificacao;
	private RadioGroup radiogroupsituacaousuario;
	private CheckBoxGroup checkGerarCheckarSenha;

	private ContaBancaria cadContaBancaria;
	private Endereco cadEndereco;
	private Usuario cadUsuario;
	private String loginUpdate;

	private TextFieldMask textCpf;

	private TextFieldMask textCnpj;

	private String textCnpjTemp;
	
	private String textCpfTemp;
	
	private String textCpfFavorecidoTemp;
	
	private String textCnpjFavorecidoTemp;

	private TextFieldMask textCpfFavorecido;

	private TextFieldMask textCnpjFavorecido;
	private RadioGroup radiogrouptipopessoafavorecida;
	private Radio radiotipopessoafisicafavorecido;
	private Radio radiotipopessoajuridicafavorecido;

	private TextFieldMask textCpfCnpj;

	
	public IncluiAlteraCadastroGeralWindow(String header,PessoaFisicaJuridica pessoaFisicaJuridica, Boolean isVisualizar) {
		this.setId("id_IncluiAlteraCadastroGeralWindow");
		setMinimizable(true);
		setResizable(false);
		setSize("882px", "654px");
		setHeading(CadastroGeralI18N.constants.headingCadastroGeral() + " - "+ header);

		contentpanelPrincipal.setHeaderVisible(false);
		contentpanelPrincipal.setButtonAlign(HorizontalAlignment.LEFT);
		contentpanelPrincipal.setAutoWidth(true);
		contentpanelPrincipal.setAutoHeight(true);

		contentpanelPrincipal.add(doGetIdentificacao());
		layoutContainerIdentificacao.setSize("864", "125");

		contentpanelPrincipal.add(doGetContato());

		contentpanelPrincipal.add(doGetDadosBancarios());

		contentpanelPrincipal.add(doGetVinculacao());
		layoutContainerVinculacao.setSize("864", "75");

		contentpanelPrincipal.add(doGetControleAcesso());
		layoutContainerControleAcesso.setSize("864", "75");

		criarDependenciaEntreEstadoEcomboCidade();
		criarDependenciaEntreCombosVinculadorEcpfCnpj();
		criarDependenciaEntreCombosAtribuicaoEVinculador();
		
		if(!isVisualizar){
			add(doGetPesquisa());
		}else{
			bloquearcomponentes();
		}

		if (pessoaFisicaJuridica != null) {
			configurarCpfCnpj(pessoaFisicaJuridica);
			popularCamposAlteracao(pessoaFisicaJuridica);
			configurarTipoPessoaFavorecida(pessoaFisicaJuridica);
			configurarTipoPessoa();
			loginUpdate = pessoaFisicaJuridica.getLogin();
		}

	}

	private void bloquearcomponentes() {
		
		textCodigo.disable();
		textSigla.disable();
		textNomeRazaoSocial.disable();
		textApelidoNomeFantasia.disable();
		comboAtribuicao.disable();
		radioTipoPessoaFisica.disable();
		radioTipoPessoaJuridica.disable();
		textEndereco.disable();
		textNumero.disable();
		textCep.disable();
		textBairro.disable();
		comboEstados.disable();
		comboCidades.disable();
		textEmail.disable();
		textDddFax.disable();
		textDddFoneFixo.disable();
		textDddCelular.disable();
		textResponsavel.disable();
		textDddTelefoneResponsvel.disable();
		comboBancos.disable();
		comboTipoConta.disable();
		textAgencia.disable();
		textNumeroConta.disable();
		textFavorecido.disable();
		textCpfCnpjFavorecido.disable();
		comboPerfilComissao.disable();
		bonificacaoSim.disable();
		bonificacaoNo.disable();
		comboVinculacao.disable();
		comboCpfCnpjVinculador.disable();
		comboGrupoAcesso.disable();
		situacaoUsuarioLiberado.disable();
		situacaoUsuarioBloqueado.disable();
		textLogin.disable();
		situacaoPessoaAtiva.disable();
		situacaoPessoaInativa.disable();
		textNomeVinculador.disable();
		checkgerarsenha.disable();
		chckbxChecksuperusuario.disable();
		textCpf.disable();
		textCnpj.disable();
		textCpfFavorecido.disable();
		textCnpjFavorecido.disable();
		radiotipopessoafisicafavorecido.disable();
		radiotipopessoajuridicafavorecido.disable();
		textCpfCnpj.disable();
	}

	private void configurarTipoPessoa() {
		radioTipoPessoaFisica.disable();
		radioTipoPessoaJuridica.disable();
	}

	private void configurarTipoPessoaFavorecida(PessoaFisicaJuridica pessoaFisicaJuridica) {
			radiotipopessoafisicafavorecido.setValue(Boolean.FALSE);
			radiotipopessoajuridicafavorecido.setValue(Boolean.FALSE);
			textCpfCnpjFavorecido.show();
			textCpfCnpjFavorecido.disable();
			textCpfFavorecido.hide();
			textCnpjFavorecido.hide();
	}

	private void configurarCpfCnpj(PessoaFisicaJuridica pessoaFisicaJuridica) {
		if(pessoaFisicaJuridica!=null && TipoPessoa.FISICA.equals(pessoaFisicaJuridica.getTipoPessoa())){
			textCpf.show();
			textCnpj.hide();
			textCpfCnpj.hide();
		}

		if(pessoaFisicaJuridica!=null && TipoPessoa.JURIDICA.equals(pessoaFisicaJuridica.getTipoPessoa())){
			textCnpj.show();
			textCpf.hide();
			textCpfCnpj.hide();
		}
	}

	private void popularCamposAlteracao(final PessoaFisicaJuridica pessoaFisicaJuridica) {

		/* load dos campos de indentificacao */
		textCodigo.setValue(pessoaFisicaJuridica.getId());
		textSigla.setValue(pessoaFisicaJuridica.getSiglaPessoaJuridica());
		textApelidoNomeFantasia.setValue(pessoaFisicaJuridica.getApelidoNomeFantasia());
		if(TipoPessoa.FISICA.equals(pessoaFisicaJuridica.getTipoPessoa())){
			textCpf.setMaskedValue(pessoaFisicaJuridica.getCpfCnpjMascarado());
		}else{
			textCnpj.setMaskedValue(pessoaFisicaJuridica.getCpfCnpjMascarado());
		}

		textLogin.setValue(pessoaFisicaJuridica.getLogin());
		textNomeRazaoSocial.setValue(pessoaFisicaJuridica.getNomeRazaoSocial());

		if (pessoaFisicaJuridica.getPossuiCadastroPessoaAtivo()) {
			situacaoPessoaAtiva.setValue(true);
		} else {
			situacaoPessoaInativa.setValue(true);
		}

		/* load dados contatos */

		service.retornarPessoa(pessoaFisicaJuridica.getId(),
				new AsyncCallback<Pessoa>() {

					private Pessoa pessoa;

					public void onFailure(Throwable caught) {
						MessageBox.alert("alerta!","Ocorreu um erro grave!"+ " \nDetalhes:\n"+ caught.getMessage(),null);
					}

					public void onSuccess(Pessoa pessoa) {
						this.pessoa = pessoa;

						BeanModel atribuicaoBeanModel = BeanModelBuilder.buildBeanModel(pessoa.getAtribuicao(),Atribuicao.class);
						comboAtribuicao.getStore().add(atribuicaoBeanModel);
						comboAtribuicao.setValue(atribuicaoBeanModel);

						if(pessoa.getPerfilComissao()==null){
							RpcProxy proxyPerfilComissao = new RpcProxy() {

								@Override
								protected void load(Object loadConfig, AsyncCallback callback) {
									service.retornaListaPerfilComissao(callback);
								}
							};

							BeanModelReader readerPerfilComissao = new BeanModelReader();
							ListLoader loaderPerfilComissao = new BaseListLoader(proxyPerfilComissao, readerPerfilComissao);
							ListStore<BeanModel> storePerfilComissao = new ListStore<BeanModel>(loaderPerfilComissao);
							comboPerfilComissao.setStore(storePerfilComissao);
						}else{
							BeanModel perfilComissaoBeanModel = BeanModelBuilder.buildBeanModel(pessoa.getPerfilComissao(),PerfilComissao.class);
							comboPerfilComissao.getStore().add(perfilComissaoBeanModel);
							comboPerfilComissao.setValue(perfilComissaoBeanModel);							
						}

						BeanModel vinculadoBeanModel = BeanModelBuilder.buildBeanModel(pessoa.getPessoaVinculadora().getAtribuicao(), Atribuicao.class);
						comboVinculacao.getStore().add(vinculadoBeanModel);
						comboVinculacao.setValue(vinculadoBeanModel);


						service.retornarPessoaFisicaJuridica(pessoaFisicaJuridica.getIdPai(), new AsyncCallback<PessoaFisicaJuridica>() {

							public void onFailure(Throwable caught) {
								MessageBox.alert("alerta!","Ocorreu um erro grave!"+ " \nDetalhes:\n"+ caught.getMessage(),null);
							}

							public void onSuccess(PessoaFisicaJuridica result) {
								BeanModel pessoaFisicaJuridicaBeanModel = BeanModelBuilder.buildBeanModel(result,PessoaFisicaJuridica.class);
								comboCpfCnpjVinculador.getStore().add(pessoaFisicaJuridicaBeanModel);
								comboCpfCnpjVinculador.setValue(pessoaFisicaJuridicaBeanModel);
								comboCpfCnpjVinculador.setDisplayField("cpfCnpjMascarado");
								
								String codigo = new Long((Long) comboCpfCnpjVinculador.getValue().get("id")).toString();
								String nome = (String) comboCpfCnpjVinculador.getValue().get("nomeRazaoSocial");
								textNomeVinculador.setValue(codigo + " - " + nome);
							}
							
						});
						

						if (pessoa.getPossuiBonificacaoContratual()) {
							bonificacaoSim.setValue(true);
						} else {
							bonificacaoNo.setValue(true);
						}

						if (pessoa.getTipoPessoa().equals(TipoPessoa.FISICA)) {
							radioTipoPessoaFisica.setValue(true);
						} else if (pessoa.getTipoPessoa().equals(
								TipoPessoa.JURIDICA)) {
							radioTipoPessoaJuridica.setValue(true);
						}

					}
				});

		service.recuperarEnderecoPoridPessoa(pessoaFisicaJuridica.getId(),
				new AsyncCallback<Endereco>() {

					private Endereco endereco;

					public void onFailure(Throwable caught) {
						MessageBox.alert("alerta!","Ocorreu um erro grave!"+ " \nDetalhes:\n"+ caught.getMessage(),null);
					}

					public void onSuccess(Endereco endereco) {
						this.endereco = endereco;
						textBairro.setValue(endereco.getBairro());
						textCep.setMaskedValue(endereco.getCep().toString());
						textEmail.setValue(endereco.getEmail());
						textEndereco.setValue(endereco.getEndereco());
						textNumero.setValue(endereco.getNumero());
						textDddFax.setMaskedValue(endereco.getFax());
						textDddFoneFixo.setMaskedValue(endereco.getTelefoneFixo());
						textDddCelular.setMaskedValue(endereco.getCelular());
						textResponsavel.setValue(endereco.getNomeResponsavel());
						textDddTelefoneResponsvel.setMaskedValue(endereco.getTelefoneResponsavel());

						BeanModel estadoBeanModel = BeanModelBuilder.buildBeanModel(endereco.getCidade().getEstado(), Estado.class);
						comboEstados.getStore().add(estadoBeanModel);
						comboEstados.setValue(estadoBeanModel);

						BeanModel cidadeBeanModel = BeanModelBuilder.buildBeanModel(endereco.getCidade(),Cidade.class);
						comboCidades.getStore().add(cidadeBeanModel);
						comboCidades.setValue(cidadeBeanModel);

						cadEndereco = endereco;
					}

				});

		service.recuperarDadosBancariosPoridPessoa(
				pessoaFisicaJuridica.getId(),
				new AsyncCallback<ContaBancaria>() {

					private ContaBancaria conta;

					public void onFailure(Throwable caught) {
						MessageBox.alert("alerta!","Ocorreu um erro grave!"+ " \nDetalhes:\n"+ caught.getMessage(),null);
					}

					public void onSuccess(ContaBancaria conta) {
						this.conta = conta;
						textAgencia.setValue(conta.getAgencia());
						textNumeroConta.setValue(conta.getConta());
						textFavorecido.setValue(conta.getNomeFavorecido());
						textCpfCnpjFavorecido.setValue(conta.getCpfCnpjFavorecidoMascarado());
						textFavorecido.setValue(conta.getNomeFavorecido());

						BeanModel bancoBeanModel = BeanModelBuilder.buildBeanModel(conta.getBanco(),InstituicaoFinanceira.class);
						comboBancos.getStore().add(bancoBeanModel);
						comboBancos.setValue(bancoBeanModel);
						
						BeanModel tipoContaBeanModel = BeanModelBuilder.buildBeanModel(conta.getTipoConta(),TipoConta.class);
						comboTipoConta.getStore().add(tipoContaBeanModel);
						comboTipoConta.setValue(tipoContaBeanModel);						


						cadContaBancaria = conta;
					}
				});

		service.recuperarUsuarioPoridPessoa(pessoaFisicaJuridica.getId(),
				new AsyncCallback<Usuario>() {
					private Usuario usuario;

					public void onFailure(Throwable caught) {
						MessageBox.alert("alerta!","Ocorreu um erro grave!"+ " \nDetalhes:\n"+ caught.getMessage(),null);
					}

					public void onSuccess(Usuario usuario) {
						this.usuario = usuario;

						BeanModel grupoAcessoBeanModel = BeanModelBuilder
								.buildBeanModel(usuario.getGupoAcesso(),
										GrupoAcesso.class);
						comboGrupoAcesso.getStore().add(grupoAcessoBeanModel);
						comboGrupoAcesso.setValue(grupoAcessoBeanModel);

						if (usuario.getPossuiCadastroAtivo()) {
							situacaoUsuarioLiberado.setValue(true);
						} else {
							situacaoUsuarioBloqueado.setValue(true);
						}
						cadUsuario = usuario;
					}
				});
	}

	private void criarDependenciaEntreCombosAtribuicaoEVinculador() {
		TemplateCombosDependentes combosDependentes = new TemplateCombosDependentes() {
			@Override
			protected void load(ComboBox<?> fonte, final ComboBox<?> cb) {

				final Integer codigoHierarquico = fonte.getValue().get(
						"codigoHierarquico");
				RpcProxy proxyVinculacao = new RpcProxy() {

					@Override
					protected void load(Object loadConfig,
							AsyncCallback callback) {
						service.retornaListaAtribuicaoVinculador(
								codigoHierarquico, callback);
					}

				};

				BeanModelReader readerAtribuicao = new BeanModelReader();
				ListLoader loaderAtribuicao = new BaseListLoader(
						proxyVinculacao, readerAtribuicao);
				ListStore<BeanModel> storeAtribuicao = new ListStore<BeanModel>(
						loaderAtribuicao);
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
					protected void load(Object loadConfig,
							AsyncCallback callback) {
						service.retornaListarCpfCnpjPessoaPorTipoVinculacao(id,
								callback);
					}

				};

				BeanModelReader readerCpfCnpjVinculacao = new BeanModelReader();
				ListLoader loaderCpfCnpjVinculacao = new BaseListLoader(
						proxyVinculacao, readerCpfCnpjVinculacao);
				ListStore<BeanModel> storeCpfCnpjVinculacao = new ListStore<BeanModel>(
						loaderCpfCnpjVinculacao);
				loaderCpfCnpjVinculacao.load();
				comboCpfCnpjVinculador.getStore().removeAll();
				comboCpfCnpjVinculador.setStore(storeCpfCnpjVinculacao);

			}
		};

		combosDependentes.adicionarCombo(comboVinculacao);
		combosDependentes.adicionarCombo(comboCpfCnpjVinculador);
		combosDependentes.init();
	}

	private void criarDependenciaEntreEstadoEcomboCidade() {
		TemplateCombosDependentes combosDependentes = new TemplateCombosDependentes() {
			@Override
			protected void load(ComboBox<?> fonte, final ComboBox<?> cb) {

				final Long idEstado = fonte.getValue().get("id");
				RpcProxy proxyVinculacao = new RpcProxy() {

					@Override
					protected void load(Object loadConfig,
							AsyncCallback callback) {
						service.retornaListaCidadesPorEstado(idEstado, callback);
					}

				};

				BeanModelReader readerCidades = new BeanModelReader();
				ListLoader loaderCidades = new BaseListLoader(proxyVinculacao,
						readerCidades);
				ListStore<BeanModel> storeCidades = new ListStore<BeanModel>(
						loaderCidades);
				loaderCidades.load();
				comboCidades.getStore().removeAll();
				comboCidades.setStore(storeCidades);
				comboCidades.setAllowBlank(false);
			}
		};

		combosDependentes.adicionarCombo(comboEstados);
		combosDependentes.adicionarCombo(comboCidades);
		combosDependentes.init();
	}

	protected LayoutContainer doGetIdentificacao() {

		layoutContainerIdentificacao = new LayoutContainer();
		layoutContainerIdentificacao.setId("id_IncluiAlteraCadastroGeralWindow_LayoutContainerIdentificacao");

		FieldSet fieldsetIdentificacao = new FieldSet();
		fieldsetIdentificacao.setId("id_IncluiAlteraCadastroGeralWindow_FieldsetIdentificacao");
		fieldsetIdentificacao.setAutoWidth(true);
		fieldsetIdentificacao.setLayout(new AbsoluteLayout());

		LabelField labelCodigo = new LabelField(
				CadastroGeralI18N.constants.codigo());
		labelCodigo.setId("id_IncluiAlteraCadastroGeralWindow_LabelCodigo");
		fieldsetIdentificacao.add(labelCodigo, new AbsoluteData(0, 0));
		textCodigo = new TextField();
		textCodigo.setId("id_IncluiAlteraCadastroGeralWindow_TextCodigo");
		textCodigo.setReadOnly(true);
		textCodigo.setName("codigo");
		textCodigo.setId("codigo");
		textCodigo.setToolTip(CadastroGeralI18N.tooltip.identificadorPessoa());
		fieldsetIdentificacao.add(textCodigo, new AbsoluteData(0, 17));

		LabelField labealSigla = new LabelField(
				CadastroGeralI18N.constants.sigla());
		labealSigla.setId("id_IncluiAlteraCadastroGeralWindow_LabealSigla");
		fieldsetIdentificacao.add(labealSigla, new AbsoluteData(0, 45));
		textSigla = new TextField();
		textSigla.setId("id_IncluiAlteraCadastroGeralWindow_TextSigla");
		textSigla.setName("sigla");
		textSigla.setId("sigla");
		textSigla.setToolTip(CadastroGeralI18N.tooltip.descricaoSigla());
		textSigla.setAllowBlank(true);
		textSigla.setMaxLength(5);
		fieldsetIdentificacao.add(textSigla, new AbsoluteData(0, 62));

		LabelField labelAtribuicao = new LabelField(
				CadastroGeralI18N.constants.atribuicao());
		labelAtribuicao.setId("id_IncluiAlteraCadastroGeralWindow_LabelAtribuicao");
		fieldsetIdentificacao.add(labelAtribuicao, new AbsoluteData(178, 0));

		RpcProxy proxyAtribuicao = new RpcProxy() {

			@Override
			protected void load(Object loadConfig, AsyncCallback callback) {
//				service.retornaListaAtribuicao(callback);
				service.retornaListaAtribuicao((String) ((LoadConfig)loadConfig).get("query"),callback);
			}
		};

		BeanModelReader readerAtribuicao = new BeanModelReader();
		ListLoader loaderAtribuicao = new BaseListLoader(proxyAtribuicao,
				readerAtribuicao);
		ListStore<BeanModel> storeUnidadeCargo = new ListStore<BeanModel>(
				loaderAtribuicao);

		comboAtribuicao = new ComboBox();
		comboAtribuicao.setId("id_IncluiAlteraCadastroGeralWindow_ComboAtribuicao");
		comboAtribuicao.setStore(storeUnidadeCargo);
		fieldsetIdentificacao.add(comboAtribuicao, new AbsoluteData(178, 17));
		comboAtribuicao.setToolTip(CadastroGeralI18N.tooltip
				.identificadorAtibuicaoPessoa());
		comboAtribuicao.setAllowBlank(false);
		comboAtribuicao.setSize("238px", "22px");
		comboAtribuicao.setDisplayField("nome");
		formatarCombo(comboAtribuicao);

		comboAtribuicao.addListener(Events.Blur, new Listener<FieldEvent>() {
			public void handleEvent(FieldEvent e) {
				Object comboAtribuicaoValue = comboAtribuicao.getValue();
				if (comboAtribuicaoValue == null) {
					comboCpfCnpjVinculador.clear();
					textNomeVinculador.setValue("");
					comboCpfCnpjVinculador.setEnabled(false);
					comboVinculacao.clear();
					comboVinculacao.setEnabled(false);
				} else {
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

		LabelField labelTipoPessoa = new LabelField(
				CadastroGeralI18N.constants.tipoPessoa());
		labelTipoPessoa.setId("id_IncluiAlteraCadastroGeralWindow_LabelTipoPessoa");
		fieldsetIdentificacao.add(labelTipoPessoa, new AbsoluteData(711, 45));
		setToolTip(CadastroGeralI18N.tooltip.pessoaTipoJuridica());

		LabelField labelCpfcnpj = new LabelField(
				CadastroGeralI18N.constants.cpfCnpj());
		labelCpfcnpj.setId("id_IncluiAlteraCadastroGeralWindow_LabelCpfcnpj");
		fieldsetIdentificacao.add(labelCpfcnpj, new AbsoluteData(178, 45));

		textCpfCnpj = new TextFieldMask(CadastroGeralI18N.mask.cpf());
		textCpfCnpj.setId("id_PesquisaCadastroGeralWindow_TextCpfCnpj");
		textCpfCnpj.setToolTip(CadastroGeralI18N.tooltip.cpfCnpjPessoa());
		fieldsetIdentificacao.add(textCpfCnpj, new AbsoluteData(178, 62));
		textCpfCnpj.setSize("238px", "22px");
		textCpfCnpj.disable();
		textCpfCnpj.show();

		
		textCpf = new TextFieldMask(CadastroGeralI18N.mask.cpf());
		textCpf.setId("id_PesquisaCadastroGeralWindow_TextCpf");
		textCpf.setToolTip(CadastroGeralI18N.tooltip.cpfCnpjPessoa());
		fieldsetIdentificacao.add(textCpf, new AbsoluteData(178, 62));
		textCpf.setSize("238px", "22px");
		textCpf.hide();
		
		textCpf.addListener(Events.OnKeyPress, new Listener<ComponentEvent>() {
			public void handleEvent(ComponentEvent e) {
				if(textCpf.getValue()==null){return;}
				textCpfTemp = textCpf.getValue().toString();
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

		
		textCnpj = new TextFieldMask(CadastroGeralI18N.mask.cnpj());
		textCnpj.setId("id_PesquisaCadastroGeralWindow_TextCnpj");
		textCnpj.setToolTip(CadastroGeralI18N.tooltip.cpfCnpjPessoa());
		fieldsetIdentificacao.add(textCnpj, new AbsoluteData(178, 62));
		textCnpj.setSize("238px", "22px");
		textCnpj.hide();
		
		textCnpj.addListener(Events.OnKeyPress, new Listener<ComponentEvent>() {


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

		LabelField labelSituacao = new LabelField(
				CadastroGeralI18N.constants.situacao());
		labelSituacao.setId("id_IncluiAlteraCadastroGeralWindow_LabelSituacao");
		fieldsetIdentificacao.add(labelSituacao, new AbsoluteData(712, 0));

		LabelField labelNomeRazoSocial = new LabelField(
				CadastroGeralI18N.constants.nomeRazaoSocial());
		labelNomeRazoSocial.setId("id_IncluiAlteraCadastroGeralWindow_LabelNomeRazoSocial");
		fieldsetIdentificacao
				.add(labelNomeRazoSocial, new AbsoluteData(446, 0));

		textNomeRazaoSocial = new TextField();
		textNomeRazaoSocial.setId("id_IncluiAlteraCadastroGeralWindow_TextNomeRazaoSocial");
		fieldsetIdentificacao.add(textNomeRazaoSocial,
				new AbsoluteData(446, 17));
		textNomeRazaoSocial.setToolTip(CadastroGeralI18N.tooltip
				.nomeRazaoSocial());
		textNomeRazaoSocial.setAllowBlank(false);
		textNomeRazaoSocial.setMaxLength(50);
		textNomeRazaoSocial.setSize("238px", "22px");

		LabelField labelApelidoNomeFantasia = new LabelField(
				CadastroGeralI18N.constants.apelidoNomeFantasia());
		labelApelidoNomeFantasia.setId("id_IncluiAlteraCadastroGeralWindow_LabelApelidoNomeFantasia");
		fieldsetIdentificacao.add(labelApelidoNomeFantasia, new AbsoluteData(
				446, 45));

		textApelidoNomeFantasia = new TextField();
		textApelidoNomeFantasia.setId("id_IncluiAlteraCadastroGeralWindow_TextApelidoNomeFantasia");
		textApelidoNomeFantasia.setToolTip(CadastroGeralI18N.tooltip
				.apelidoNomeFantasia());
		textApelidoNomeFantasia.setAllowBlank(false);
		textApelidoNomeFantasia.setMaxLength(50);
		textApelidoNomeFantasia.setSize("238px", "22px");
		fieldsetIdentificacao.add(textApelidoNomeFantasia, new AbsoluteData(
				446, 62));

		radiogroupsituacaopessoa = new RadioGroup();
		radiogroupsituacaopessoa.setId("id_IncluiAlteraCadastroGeralWindow_Radiogroupsituacaopessoa");
		radiogroupsituacaopessoa.setSelectionRequired(true);

		situacaoPessoaAtiva = new Radio();
		situacaoPessoaAtiva.setId("id_IncluiAlteraCadastroGeralWindow_SituacaoPessoaAtiva");
		radiogroupsituacaopessoa.add(situacaoPessoaAtiva);
		situacaoPessoaAtiva.setBoxLabel(CadastroGeralI18N.constants
				.situacaoAtiva());
		situacaoPessoaAtiva.setToolTip(CadastroGeralI18N.tooltip.ativa());
		situacaoPessoaAtiva.setHideLabel(true);
		situacaoPessoaAtiva.setValue(true);
		situacaoPessoaAtiva.setAutoValidate(true);

		situacaoPessoaInativa = new Radio();
		situacaoPessoaInativa.setId("id_IncluiAlteraCadastroGeralWindow_SituacaoPessoaInativa");
		radiogroupsituacaopessoa.add(situacaoPessoaInativa);
		situacaoPessoaInativa.setBoxLabel(CadastroGeralI18N.constants
				.situacaoInativa());
		situacaoPessoaInativa.setToolTip(CadastroGeralI18N.tooltip.inativa());
		situacaoPessoaInativa.setHideLabel(true);
		fieldsetIdentificacao.add(radiogroupsituacaopessoa, new AbsoluteData(
				713, 17));
		radiogroupsituacaopessoa.setFieldLabel("radioGroupSituacaoPessoa");

		radiogrouptipopessoa = new RadioGroup();
		radiogrouptipopessoa.setId("id_IncluiAlteraCadastroGeralWindow_Radiogrouptipopessoa");
		radiogrouptipopessoa.setSelectionRequired(true);

		radioTipoPessoaFisica = new Radio();
		radioTipoPessoaFisica.setId("id_IncluiAlteraCadastroGeralWindow_RadioTipoPessoaFisica");
		radiogrouptipopessoa.add(radioTipoPessoaFisica);
		radioTipoPessoaFisica.setToolTip(CadastroGeralI18N.tooltip
				.pessoaTipoFisica());
		radioTipoPessoaFisica.setBoxLabel(CadastroGeralI18N.constants
				.pessoaFisica());
		radioTipoPessoaFisica.setHideLabel(true);

		radioTipoPessoaFisica.addListener(Events.OnClick, new Listener<FieldEvent>() {

			public void handleEvent(FieldEvent be) {
				textCnpj.hide();
				textCpf.show();
				textCpf.enable();
			}
			
		});


		radioTipoPessoaJuridica = new Radio();
		radioTipoPessoaJuridica.setId("id_IncluiAlteraCadastroGeralWindow_RadioTipoPessoaJuridica");
		radioTipoPessoaJuridica.setValue(new Boolean(true));
		radiogrouptipopessoa.add(radioTipoPessoaJuridica);
		radioTipoPessoaJuridica.setBoxLabel(CadastroGeralI18N.constants
				.pessoaJuridica());
		radioTipoPessoaJuridica.setHideLabel(true);
		

		radioTipoPessoaJuridica.addListener(Events.OnClick, new Listener<FieldEvent>() {

			public void handleEvent(FieldEvent be) {
				textCpf.hide();
				textCnpj.show();
				textCnpj.enable();
			}
			
		});

		fieldsetIdentificacao.add(radiogrouptipopessoa, new AbsoluteData(711,
				62));
		radiogrouptipopessoa.setFieldLabel("radioGroupTipoPessoa");

		LayoutContainer layoutContainerespacoCima = new LayoutContainer();
		layoutContainerespacoCima.setId("id_IncluiAlteraCadastroGeralWindow_LayoutContainerespacoCima");
		layoutContainerIdentificacao.add(layoutContainerespacoCima);
		layoutContainerespacoCima.setSize("864", "10");
		layoutContainerIdentificacao.add(fieldsetIdentificacao);
		fieldsetIdentificacao.setSize("862", "115");
		fieldsetIdentificacao.setHeading(CadastroGeralI18N.constants
				.identificacao());

		return layoutContainerIdentificacao;
	}

	protected LayoutContainer doGetContato() {

		LayoutContainer layoutContainerContato = new LayoutContainer();
		layoutContainerContato.setId("id_IncluiAlteraCadastroGeralWindow_LayoutContainerContato");

		FieldSet fieldDadosDeContato = new FieldSet();
		fieldDadosDeContato.setId("id_IncluiAlteraCadastroGeralWindow_FieldDadosDeContato");
		fieldDadosDeContato.setLayout(new AbsoluteLayout());

		LabelField labelEndereo = new LabelField(
				CadastroGeralI18N.constants.endereco());
		labelEndereo.setId("id_IncluiAlteraCadastroGeralWindow_LabelEndereo");
		fieldDadosDeContato.add(labelEndereo, new AbsoluteData(0, 0));

		textEndereco = new TextField();
		textEndereco.setId("id_IncluiAlteraCadastroGeralWindow_TextEndereco");
		textEndereco.setToolTip(CadastroGeralI18N.tooltip.endereco());
		textEndereco.setAllowBlank(false);
		textEndereco.setMaxLength(50);
		textEndereco.setSize("185px", "22px");
		fieldDadosDeContato.add(textEndereco, new AbsoluteData(0, 16));

		LabelField labelNmero = new LabelField(
				CadastroGeralI18N.constants.numero());
		labelNmero.setId("id_IncluiAlteraCadastroGeralWindow_LabelNmero");
		fieldDadosDeContato.add(labelNmero, new AbsoluteData(0, 44));

		textNumero = new TextField();
		textNumero.setId("id_IncluiAlteraCadastroGeralWindow_TextNumero");
		textNumero.setToolTip(CadastroGeralI18N.tooltip.numero());
		textNumero.setAllowBlank(false);
		textNumero.setMaxLength(5);

		fieldDadosDeContato.add(textNumero, new AbsoluteData(0, 60));
		textNumero.setSize("185px", "22px");

		LabelField labelCep = new LabelField(CadastroGeralI18N.constants.cep());
		labelCep.setId("id_IncluiAlteraCadastroGeralWindow_LabelCep");
		fieldDadosDeContato.add(labelCep, new AbsoluteData(0, 88));

		textCep = new TextFieldMask(CadastroGeralI18N.mask.cep());
		textCep.setId("id_IncluiAlteraCadastroGeralWindow_TextCep");
		textCep.setMinLength(10);
		textCep.setMaxLength(10);
		textCep.setToolTip(CadastroGeralI18N.tooltip.cep());
		textCep.setAllowBlank(false);

		fieldDadosDeContato.add(textCep, new AbsoluteData(0, 103));
		textCep.setSize("185px", "22px");

		LabelField labelBairro = new LabelField(
				CadastroGeralI18N.constants.bairro());
		labelBairro.setId("id_IncluiAlteraCadastroGeralWindow_LabelBairro");
		fieldDadosDeContato.add(labelBairro, new AbsoluteData(212, 0));

		textBairro = new TextField();
		textBairro.setId("id_IncluiAlteraCadastroGeralWindow_TextBairro");
		textBairro.setToolTip(CadastroGeralI18N.tooltip.bairro());
		textBairro.setSize("206px", "22px");
		textBairro.setAllowBlank(false);
		textBairro.setMaxLength(15);
		fieldDadosDeContato.add(textBairro, new AbsoluteData(212, 16));

		LabelField labelEstado = new LabelField(
				CadastroGeralI18N.constants.estado());
		labelEstado.setId("id_IncluiAlteraCadastroGeralWindow_LabelEstado");
		fieldDadosDeContato.add(labelEstado, new AbsoluteData(212, 44));

		RpcProxy proxy = new RpcProxy() {

			@Override
			protected void load(Object loadConfig, AsyncCallback callback) {
//				service.retornaListaEstados(callback);
				service.retornaListaEstados((String) ((LoadConfig)loadConfig).get("query"), callback);
			}
		};

		BeanModelReader reader = new BeanModelReader();
		ListLoader loader = new BaseListLoader(proxy, reader);
		ListStore<BeanModel> store = new ListStore<BeanModel>(loader);
		comboEstados = new ComboBox<BeanModel>();
		comboEstados.setId("id_IncluiAlteraCadastroGeralWindow_ComboEstados");
		comboEstados.setSize("206px", "22px");
		comboEstados.setToolTip(CadastroGeralI18N.tooltip.estado());
		comboEstados.setDisplayField("nome");
		comboEstados.setStore(store);
		comboEstados.setAllowBlank(false);
		formatarCombo(comboEstados);
		

		fieldDadosDeContato.add(comboEstados, new AbsoluteData(212, 60));

		LabelField labelCidade = new LabelField(
				CadastroGeralI18N.constants.cidade());
		labelCidade.setId("id_IncluiAlteraCadastroGeralWindow_LabelCidade");
		fieldDadosDeContato.add(labelCidade, new AbsoluteData(212, 88));

		RpcProxy proxyCidades = new RpcProxy() {

			@Override
			protected void load(Object loadConfig, AsyncCallback callback) {
				service.retornaListaCidades(callback);
			}
		};

		BeanModelReader readerCidades = new BeanModelReader();
		ListLoader loaderCidades = new BaseListLoader(proxyCidades,
				readerCidades);
		ListStore<BeanModel> storeCidades = new ListStore<BeanModel>(
				loaderCidades);

		comboCidades = new ComboBox<BeanModel>();
		comboCidades.setId("id_IncluiAlteraCadastroGeralWindow_ComboCidades");
		comboCidades.setStore(storeCidades);
		fieldDadosDeContato.add(comboCidades, new AbsoluteData(212, 103));
		comboCidades.setSize("206px", "22px");
		comboCidades.setToolTip(CadastroGeralI18N.tooltip.cidade());
		comboCidades.setAllowBlank(false);
		comboCidades.setDisplayField("nome");
		formatarCombo(comboCidades);

		LabelField labelEmail = new LabelField(
				CadastroGeralI18N.constants.email());
		labelEmail.setId("id_IncluiAlteraCadastroGeralWindow_LabelEmail");
		fieldDadosDeContato.add(labelEmail, new AbsoluteData(446, 0));

		textEmail = new TextField();
		textEmail.setId("id_IncluiAlteraCadastroGeralWindow_TextEmail");
		textEmail.setToolTip(CadastroGeralI18N.tooltip.email());
		textEmail.setAllowBlank(false);
		textEmail.setMaxLength(30);
		fieldDadosDeContato.add(textEmail, new AbsoluteData(446, 16));

		LabelField labelDddFax = new LabelField(
				CadastroGeralI18N.constants.emailDDFax());
		labelDddFax.setId("id_IncluiAlteraCadastroGeralWindow_LabelDddFax");
		fieldDadosDeContato.add(labelDddFax, new AbsoluteData(446, 44));

		textDddFax = new TextFieldMask(CadastroGeralI18N.mask.fone());
		textDddFax.setId("id_IncluiAlteraCadastroGeralWindow_TextDddFax");
		textDddFax.setMaxLength(15);
		textDddFax.setToolTip(CadastroGeralI18N.tooltip.fax());
		textDddFax.setAllowBlank(true);

		fieldDadosDeContato.add(textDddFax, new AbsoluteData(446, 60));

		LabelField labelDddFoneFixo = new LabelField(
				CadastroGeralI18N.constants.emailDDTelefoneFixo());
		labelDddFoneFixo.setId("id_IncluiAlteraCadastroGeralWindow_LabelDddFoneFixo");
		fieldDadosDeContato.add(labelDddFoneFixo, new AbsoluteData(446, 88));

		textDddFoneFixo = new TextFieldMask(CadastroGeralI18N.mask.fone());
		textDddFoneFixo.setId("id_IncluiAlteraCadastroGeralWindow_TextDddFoneFixo");

		textDddFoneFixo.setMaxLength(15);
		textDddFoneFixo.setToolTip(CadastroGeralI18N.tooltip.foneFixo());
		textDddFoneFixo.setAllowBlank(true);
		fieldDadosDeContato.add(textDddFoneFixo, new AbsoluteData(446, 103));

		LabelField labelDddCelular = new LabelField(
				CadastroGeralI18N.constants.dddCelular());
		labelDddCelular.setId("id_IncluiAlteraCadastroGeralWindow_LabelDddCelular");
		fieldDadosDeContato.add(labelDddCelular, new AbsoluteData(627, 0));

		textDddCelular = new TextFieldMask(CadastroGeralI18N.mask.fone());
		textDddCelular.setId("id_IncluiAlteraCadastroGeralWindow_TextDddCelular");
		textDddCelular.setMaxLength(15);
		textDddCelular.setToolTip(CadastroGeralI18N.tooltip.celular());
		fieldDadosDeContato.add(textDddCelular, new AbsoluteData(627, 16));
		textDddCelular.setAllowBlank(true);
		textDddCelular.setSize("196px", "22px");

		LabelField labelResponsvel = new LabelField(
				CadastroGeralI18N.constants.responsavel());
		labelResponsvel.setId("id_IncluiAlteraCadastroGeralWindow_LabelResponsvel");
		fieldDadosDeContato.add(labelResponsvel, new AbsoluteData(627, 44));

		textResponsavel = new TextField();
		textResponsavel.setId("id_IncluiAlteraCadastroGeralWindow_TextResponsavel");
		textResponsavel.setToolTip(CadastroGeralI18N.tooltip.responsavel());
		textResponsavel.setAllowBlank(true);
		textResponsavel.setMaxLength(50);
		textResponsavel.setSize("196px", "22px");
		fieldDadosDeContato.add(textResponsavel, new AbsoluteData(627, 60));

		LabelField labelDddTelefoneResponsvel = new LabelField(
				CadastroGeralI18N.constants.dddTelefoneResponsavel());
		labelDddTelefoneResponsvel.setId("id_IncluiAlteraCadastroGeralWindow_LabelDddTelefoneResponsvel");
		fieldDadosDeContato.add(labelDddTelefoneResponsvel, new AbsoluteData(
				627, 86));

		textDddTelefoneResponsvel = new TextFieldMask(CadastroGeralI18N.mask.fone());
		textDddTelefoneResponsvel.setId("id_IncluiAlteraCadastroGeralWindow_TextDddTelefoneResponsvel");
		textDddTelefoneResponsvel.setMaxLength(15);
		textDddTelefoneResponsvel.setToolTip(CadastroGeralI18N.tooltip
				.telefoneResponsavel());
		textDddTelefoneResponsvel.setSize("196px", "22px");
		textDddTelefoneResponsvel.setAllowBlank(true);
		fieldDadosDeContato.add(textDddTelefoneResponsvel, new AbsoluteData(
				627, 103));

		layoutContainerContato.add(fieldDadosDeContato);
		fieldDadosDeContato.setSize("864", "165");
		fieldDadosDeContato.setHeading(CadastroGeralI18N.constants
				.dadosContatos());
		layoutContainerContato.setSize("864", "170");
		return layoutContainerContato;
	}

	protected LayoutContainer doGetDadosBancarios() {

		LayoutContainer layoutContainerDadosBancarios = new LayoutContainer();
		layoutContainerDadosBancarios.setId("id_IncluiAlteraCadastroGeralWindow_LayoutContainerDadosBancarios");

		FieldSet fieldsetDadosBancarios = new FieldSet();
		fieldsetDadosBancarios.setId("id_IncluiAlteraCadastroGeralWindow_FieldsetDadosBancarios");
		fieldsetDadosBancarios.setLayout(new AbsoluteLayout());

		LabelField labelBanco = new LabelField(
				CadastroGeralI18N.constants.banco());
		labelBanco.setId("id_IncluiAlteraCadastroGeralWindow_LabelBanco");
		fieldsetDadosBancarios.add(labelBanco, new AbsoluteData(0, 0));

		RpcProxy proxyBancos = new RpcProxy() {

			@Override
			protected void load(Object loadConfig, AsyncCallback callback) {
				service.retornaListaBancos(callback);
			}
		};

		BeanModelReader readerBancos = new BeanModelReader();
		ListLoader loaderBancos = new BaseListLoader(proxyBancos, readerBancos);
		ListStore<BeanModel> storeBancos = new ListStore<BeanModel>(
				loaderBancos);

		comboBancos = new ComboBox();
		comboBancos.setId("id_IncluiAlteraCadastroGeralWindow_ComboBancos");
		formatarCombo(comboBancos);
		final String TEXTO_COMBO_BANCO = "textoComboBanco";
		
		comboBancos.setPropertyEditor(new ListModelPropertyEditor<BeanModel>() {
			public String getStringValue(BeanModel value) {
				InstituicaoFinanceira instituicaoFinanceira = (InstituicaoFinanceira) value
						.getBean();
				return instituicaoFinanceira.getId() + " - "
						+ instituicaoFinanceira.getNome();
			}
		});

		comboBancos.getView().setModelProcessor(
				new ModelProcessor<BeanModel>() {
					@Override
					public BeanModel prepareData(BeanModel model) {
						InstituicaoFinanceira instituicaoFinanceira = (InstituicaoFinanceira) model
								.getBean();
						model.set(TEXTO_COMBO_BANCO,
								instituicaoFinanceira.getId() + " - "
										+ instituicaoFinanceira.getNome());

						return model;
					}
				});

		comboBancos.setDisplayField(TEXTO_COMBO_BANCO);

		comboBancos.setStore(storeBancos);
		comboBancos.setToolTip(CadastroGeralI18N.tooltip.bancos());
		comboBancos.setSize("166px", "22px");
		comboBancos.setAllowBlank(false);
		fieldsetDadosBancarios.add(comboBancos, new AbsoluteData(0, 15));

		LabelField labelTipoConta = new LabelField(
				CadastroGeralI18N.constants.tipoConta());
		labelTipoConta.setId("id_IncluiAlteraCadastroGeralWindow_LabelTipoConta");
		fieldsetDadosBancarios.add(labelTipoConta, new AbsoluteData(0, 43));

		comboTipoConta = new ComboBox();
		comboTipoConta.setId("id_IncluiAlteraCadastroGeralWindow_ComboTipoConta");
		comboTipoConta.setToolTip(CadastroGeralI18N.tooltip.tipoConta());
		comboTipoConta.setSize("166px", "22px");
		comboTipoConta.setAllowBlank(false);
		comboTipoConta.setDisplayField("descricao");
		
		RpcProxy proxyTipoConta = new RpcProxy() {

			@Override
			protected void load(Object loadConfig, AsyncCallback callback) {
				service.retornaListaTipoConta(callback);
			}
		};

		BeanModelReader readerTipoConta = new BeanModelReader();
		ListLoader loaderTipoConta = new BaseListLoader(proxyTipoConta, readerTipoConta);
		ListStore<BeanModel> storeTipoConta = new ListStore<BeanModel>(loaderTipoConta);
		comboTipoConta.setStore(storeTipoConta);
		formatarCombo(comboTipoConta);
		fieldsetDadosBancarios.add(comboTipoConta, new AbsoluteData(0, 59));

		LabelField labelAgencia = new LabelField(
				CadastroGeralI18N.constants.agencia());
		labelAgencia.setId("id_IncluiAlteraCadastroGeralWindow_LabelAgencia");
		fieldsetDadosBancarios.add(labelAgencia, new AbsoluteData(188, 0));
		textAgencia = new TextField();
		textAgencia.setId("id_IncluiAlteraCadastroGeralWindow_TextAgencia");
		textAgencia.setToolTip(CadastroGeralI18N.tooltip.agencia());
		textAgencia.setAllowBlank(false);
		textAgencia.setMaxLength(30);
		fieldsetDadosBancarios.add(textAgencia, new AbsoluteData(188, 15));
		textAgencia.setSize("102px", "22px");

		LabelField labelNmeroDaConta = new LabelField(
				CadastroGeralI18N.constants.numeroConta());
		labelNmeroDaConta.setId("id_IncluiAlteraCadastroGeralWindow_LabelNmeroDaConta");
		fieldsetDadosBancarios
				.add(labelNmeroDaConta, new AbsoluteData(188, 43));
		textNumeroConta = new TextField();
		textNumeroConta.setId("id_IncluiAlteraCadastroGeralWindow_TextNumeroConta");
		textNumeroConta.setToolTip(CadastroGeralI18N.tooltip.numeroConta());
		textNumeroConta.setAllowBlank(false);
		textNumeroConta.setMaxLength(20);
		fieldsetDadosBancarios.add(textNumeroConta, new AbsoluteData(188, 59));
		textNumeroConta.setSize("102px", "22px");

		LabelField labelFavorecido = new LabelField(CadastroGeralI18N.constants.favorecido());
		labelFavorecido.setId("id_IncluiAlteraCadastroGeralWindow_LabelFavorecido");
		fieldsetDadosBancarios.add(labelFavorecido, new AbsoluteData(312, 0));
		textFavorecido = new TextField();
		textFavorecido.setId("id_IncluiAlteraCadastroGeralWindow_TextFavorecido");
		textFavorecido.setTitle(CadastroGeralI18N.tooltip.favorecido());
		textFavorecido.setAllowBlank(false);
		textFavorecido.setMaxLength(50);
		textFavorecido.setSize("284px", "22px");
		fieldsetDadosBancarios.add(textFavorecido, new AbsoluteData(312, 15));
		
		radiogrouptipopessoafavorecida = new RadioGroup();
		radiogrouptipopessoafavorecida.setId("id_IncluiAlteraCadastroGeralWindow_radiogrouptipopessoafavorecida");
		
		radiotipopessoafisicafavorecido = new Radio();
		radiotipopessoafisicafavorecido.setId("id_IncluiAlteraCadastroGeralWindow_radiotipopessoafisicafavorecido");
		radiogrouptipopessoafavorecida.add(radiotipopessoafisicafavorecido);
		radiotipopessoafisicafavorecido.setBoxLabel("Física");
		radiotipopessoafisicafavorecido.setHideLabel(true);
		radiotipopessoafisicafavorecido.setValue(Boolean.FALSE);

		radiotipopessoafisicafavorecido.addListener(Events.OnClick, new Listener<FieldEvent>() {
			public void handleEvent(FieldEvent be) {
				textCnpjFavorecido.hide();
				textCpfCnpjFavorecido.hide();
				textCpfFavorecido.show();
				textCpfFavorecido.enable();
				textCpfFavorecido.setMaskedValue(textCpfCnpjFavorecido.getValue()==null?"":textCpfCnpjFavorecido.getValue().toString());
			}
			
		});
		
		
		radiotipopessoajuridicafavorecido = new Radio();
		radiotipopessoajuridicafavorecido.setId("id_IncluiAlteraCadastroGeralWindow_radiotipopessoajuridicafavorecido");
		radiogrouptipopessoafavorecida.add(radiotipopessoajuridicafavorecido);
		radiotipopessoajuridicafavorecido.setBoxLabel("Jurídica");
		radiotipopessoajuridicafavorecido.setHideLabel(true);
		fieldsetDadosBancarios.add(radiogrouptipopessoafavorecida, new AbsoluteData(312, 63));
		radiogrouptipopessoafavorecida.setFieldLabel("radiogroupTipoPessoaFavorecida");
		radiotipopessoajuridicafavorecido.setValue(Boolean.FALSE);
		
		radiotipopessoajuridicafavorecido.addListener(Events.OnClick, new Listener<FieldEvent>() {
			public void handleEvent(FieldEvent be) {
				textCpfCnpjFavorecido.hide();
				textCpfFavorecido.hide();
				textCnpjFavorecido.show();
				textCnpjFavorecido.enable();
				textCnpjFavorecido.setMaskedValue(textCpfCnpjFavorecido.getValue()==null?"":textCpfCnpjFavorecido.getValue().toString());
			}
			
		});

		LabelField labelCpfCnpjFavorecido = new LabelField(
				CadastroGeralI18N.constants.cpfCnpjFavorecido());
		labelCpfCnpjFavorecido.setId("id_IncluiAlteraCadastroGeralWindow_LabelCpfCnpjFavorecido");
		fieldsetDadosBancarios.add(labelCpfCnpjFavorecido, new AbsoluteData(624, 0));
		textCpfCnpjFavorecido = new TextField();
		textCpfCnpjFavorecido.setId("id_IncluiAlteraCadastroGeralWindow_TextCpfCnpjFavorecido");
		textCpfCnpjFavorecido.setToolTip(CadastroGeralI18N.tooltip.cpfCnpjFavorecido());		
		textCpfCnpjFavorecido.setAllowBlank(false);
		textCpfCnpjFavorecido.setSize("203px", "22px");
		fieldsetDadosBancarios.add(textCpfCnpjFavorecido, new AbsoluteData(621,15));
		textCpfCnpjFavorecido.disable();
		
		textCpfFavorecido = new TextFieldMask(CadastroGeralI18N.mask.cpf());
		textCpfFavorecido.setId("id_IncluiAlteraCadastroGeralWindow_textCpfFavorecido");
		textCpfFavorecido.setToolTip(CadastroGeralI18N.tooltip.cpfCnpjFavorecido());		
		textCpfFavorecido.setAllowBlank(false);
		textCpfFavorecido.setSize("203px", "22px");
		textCpfFavorecido.hide();
		fieldsetDadosBancarios.add(textCpfFavorecido, new AbsoluteData(621,15));
		
		textCpfFavorecido.addListener(Events.OnKeyPress, new Listener<ComponentEvent>() {
			public void handleEvent(ComponentEvent e) {
				if(textCpfFavorecido.getValue()==null){return;}
				textCpfFavorecidoTemp = textCpfFavorecido.getValue().toString();
			}
		});
		
		textCpfFavorecido.addListener(Events.OnBlur, new Listener<ComponentEvent>() {
			public void handleEvent(ComponentEvent e) {
				if(textCpfFavorecido.getValue()==null|| "".equals(textCpfFavorecido.getValue())){
					textCpfFavorecido.forceInvalid("CPF/CNPJ Inválido!");
					textCpfFavorecido.setMaskedValue(textCpfFavorecidoTemp);
					
				}else if(textCpfFavorecidoTemp!=null && !Cpf.isValid(textCpfFavorecidoTemp)){
					textCpfFavorecido.forceInvalid("CPF/CNPJ Inválido!");
					textCpfFavorecido.setMaskedValue(textCpfFavorecidoTemp);					
				}else{
					textCpfFavorecido.clear();
					textCpfFavorecido.setValue(textCpfFavorecidoTemp);
				}
			}
		});
		
		textCnpjFavorecido = new TextFieldMask(CadastroGeralI18N.mask.cnpj());
		textCnpjFavorecido.setId("id_IncluiAlteraCadastroGeralWindow_textCnpjFavorecido");
		textCnpjFavorecido.setToolTip(CadastroGeralI18N.tooltip.cpfCnpjFavorecido());		
		textCnpjFavorecido.setAllowBlank(false);
		textCnpjFavorecido.setSize("203px", "22px");
		textCnpjFavorecido.hide();
		fieldsetDadosBancarios.add(textCnpjFavorecido, new AbsoluteData(621,15));
		
		textCnpjFavorecido.addListener(Events.OnKeyDown, new Listener<ComponentEvent>() {
			public void handleEvent(ComponentEvent e) {
				if(textCnpjFavorecido.getValue()==null){return;}
				textCnpjFavorecidoTemp = textCnpjFavorecido.getValue().toString();
			}
		});
		textCnpjFavorecido.addListener(Events.OnBlur, new Listener<ComponentEvent>() {
			public void handleEvent(ComponentEvent e) {
				if(textCnpjFavorecido.getValue()==null|| "".equals(textCnpjFavorecido.getValue())){
					textCnpjFavorecido.forceInvalid("CPF/CNPJ Inválido!");
					textCnpjFavorecido.setMaskedValue(textCnpjFavorecidoTemp);
				}else if(textCnpjFavorecidoTemp!=null && !Cnpj.isValid(textCnpjFavorecidoTemp)){
					textCnpjFavorecido.forceInvalid("CPF/CNPJ Inválido!");
					textCnpjFavorecido.setMaskedValue(textCnpjFavorecidoTemp);					
				}else{
					textCnpjFavorecido.clear();
					textCnpjFavorecido.setValue(textCnpjFavorecidoTemp);
				}
			}
		});		

		LabelField labelPerfilDeComisso = new LabelField(
				CadastroGeralI18N.constants.perfilComissao());
		labelPerfilDeComisso.setId("id_IncluiAlteraCadastroGeralWindow_LabelPerfilDeComisso");
		fieldsetDadosBancarios.add(labelPerfilDeComisso, new AbsoluteData(453,
				42));

		RpcProxy proxyPerfilComissao = new RpcProxy() {

			@Override
			protected void load(Object loadConfig, AsyncCallback callback) {
				service.retornaListaPerfilComissao(callback);
			}
		};

		BeanModelReader readerPerfilComissao = new BeanModelReader();
		ListLoader loaderPerfilComissao = new BaseListLoader(proxyPerfilComissao, readerPerfilComissao);
		ListStore<BeanModel> storePerfilComissao = new ListStore<BeanModel>(loaderPerfilComissao);

		comboPerfilComissao = new ComboBox();
		comboPerfilComissao.setId("id_IncluiAlteraCadastroGeralWindow_ComboPerfilComissao");
		comboPerfilComissao.setStore(storePerfilComissao);
		comboPerfilComissao.setToolTip(CadastroGeralI18N.tooltip
				.perfilComissao());
		comboPerfilComissao.setSize("143px", "22px");
		comboPerfilComissao.setDisplayField("nome");
		comboPerfilComissao.setAllowBlank(true);
		formatarCombo(comboPerfilComissao);
		fieldsetDadosBancarios.add(comboPerfilComissao, new AbsoluteData(453,
				59));

		LabelField labelBonificacao = new LabelField(
				CadastroGeralI18N.constants.bonificacaoContrato());
		labelBonificacao.setId("id_IncluiAlteraCadastroGeralWindow_LabelBonificacao");
		fieldsetDadosBancarios.add(labelBonificacao, new AbsoluteData(624, 45));

		radiogrouppossuibonificacao = new RadioGroup();
		radiogrouppossuibonificacao.setId("id_IncluiAlteraCadastroGeralWindow_Radiogrouppossuibonificacao");
		radiogrouppossuibonificacao.setSelectionRequired(true);

		bonificacaoSim = new Radio();
		bonificacaoSim.setId("id_IncluiAlteraCadastroGeralWindow_BonificacaoSim");
		radiogrouppossuibonificacao.add(bonificacaoSim);
		bonificacaoSim.setBoxLabel(CadastroGeralI18N.constants.sim());
		bonificacaoSim.setToolTip(CadastroGeralI18N.tooltip.bonificacaoSim());
		bonificacaoSim.setHideLabel(true);

		bonificacaoNo = new Radio();
		bonificacaoNo.setId("id_IncluiAlteraCadastroGeralWindow_BonificacaoNo");
		radiogrouppossuibonificacao.add(bonificacaoNo);
		bonificacaoNo.setBoxLabel(CadastroGeralI18N.constants.nao());
		bonificacaoNo.setToolTip(CadastroGeralI18N.tooltip.bonificacaoNo());
		bonificacaoNo.setHideLabel(true);
		bonificacaoNo.setValue(true);
		fieldsetDadosBancarios.add(radiogrouppossuibonificacao,new AbsoluteData(624, 59));
		radiogrouppossuibonificacao.setSize("98px", "22px");
		radiogrouppossuibonificacao.setFieldLabel("radioGroupPossuiBonificacao");
		
		LabelField lblfldTipoDePessoa = new LabelField("Tipo de Pessoa");
		fieldsetDadosBancarios.add(lblfldTipoDePessoa, new AbsoluteData(312, 43));
		
		layoutContainerDadosBancarios.add(fieldsetDadosBancarios);
		fieldsetDadosBancarios.setSize("864", "115");
		fieldsetDadosBancarios.setHeading(CadastroGeralI18N.constants.dadosBancarios());
		contentpanelPrincipal.add(layoutContainerDadosBancarios);
		layoutContainerDadosBancarios.setSize("864", "125");
		return layoutContainerDadosBancarios;
	}

	protected LayoutContainer doGetVinculacao() {

		layoutContainerVinculacao = new LayoutContainer();
		layoutContainerVinculacao.setId("id_IncluiAlteraCadastroGeralWindow_LayoutContainerVinculacao");

		FieldSet fieldsetVinculacao = new FieldSet();
		fieldsetVinculacao.setId("id_IncluiAlteraCadastroGeralWindow_FieldsetVinculacao");
		fieldsetVinculacao.setAutoWidth(true);
		fieldsetVinculacao.setLayout(new AbsoluteLayout());

		LabelField labelVinculacao = new LabelField(
				CadastroGeralI18N.constants.vinculadoA());
		labelVinculacao.setId("id_IncluiAlteraCadastroGeralWindow_LabelVinculacao");
		fieldsetVinculacao.add(labelVinculacao, new AbsoluteData(0, 0));

		comboVinculacao = new ComboBox();
		comboVinculacao.setId("id_IncluiAlteraCadastroGeralWindow_ComboVinculacao");
		comboVinculacao.setStore(new ListStore());
		comboVinculacao.setDisplayField("nome");
		fieldsetVinculacao.add(comboVinculacao, new AbsoluteData(0, 16));
		comboVinculacao.setToolTip(CadastroGeralI18N.tooltip.vinculacao());
		comboVinculacao.setAllowBlank(false);
		comboVinculacao.setSize("211px", "22px");
		formatarCombo(comboVinculacao);
		
		comboVinculacao.addListener(Events.Blur, new Listener<FieldEvent>() {
			public void handleEvent(FieldEvent e) {
				Object comboVinculacaoValue = comboVinculacao.getValue();
				if (comboVinculacaoValue == null) {
					comboCpfCnpjVinculador.clear();
					textNomeVinculador.setValue("");
					comboCpfCnpjVinculador.setEnabled(false);
				} else {
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

		LabelField labelCpfCnpjDoVinculador = new LabelField(
				CadastroGeralI18N.constants.cpfCnpjVinculador());
		labelCpfCnpjDoVinculador.setId("id_IncluiAlteraCadastroGeralWindow_LabelCpfCnpjDoVinculador");
		fieldsetVinculacao.add(labelCpfCnpjDoVinculador, new AbsoluteData(243,
				0));
		comboCpfCnpjVinculador = new ComboBox();
		comboCpfCnpjVinculador.setId("id_IncluiAlteraCadastroGeralWindow_ComboCpfCnpjVinculador");
		comboCpfCnpjVinculador.setToolTip(CadastroGeralI18N.tooltip
				.cpfCnpjDoVinculador());
		comboCpfCnpjVinculador.setStore(new ListStore());
		comboCpfCnpjVinculador.setDisplayField("cpfCnpjMascarado");
		comboCpfCnpjVinculador.setAllowBlank(false);
		comboCpfCnpjVinculador.setSize("191px", "22px");
		comboCpfCnpjVinculador.setAllowBlank(false);
		fieldsetVinculacao.add(comboCpfCnpjVinculador,
				new AbsoluteData(243, 18));
		formatarCombo(comboCpfCnpjVinculador);

		LabelField lblfldNomevinculador = new LabelField(
				CadastroGeralI18N.constants.nomeVinculador());
		lblfldNomevinculador.setId("id_IncluiAlteraCadastroGeralWindow_LblfldNomevinculador");
		fieldsetVinculacao.add(lblfldNomevinculador, new AbsoluteData(468, 0));

		textNomeVinculador = new TextField();
		textNomeVinculador.setId("id_IncluiAlteraCadastroGeralWindow_TextNomeVinculador");
		textNomeVinculador.setReadOnly(true);
		textNomeVinculador.setAllowBlank(false);
		textNomeVinculador.setSize("356px", "22px");

		fieldsetVinculacao.add(textNomeVinculador, new AbsoluteData(468, 16));
		comboCpfCnpjVinculador.addListener(Events.Blur,
				new Listener<FieldEvent>() {
					public void handleEvent(FieldEvent e) {
						Object comboCpfCnpjVinculadorValue = comboCpfCnpjVinculador
								.getValue();
						if (comboCpfCnpjVinculadorValue == null) {
							textNomeVinculador.setValue("");
							comboVinculacao.clear();
							comboCpfCnpjVinculador.setEnabled(false);
						}
					}
				});
		comboCpfCnpjVinculador.addListener(Events.Select,
				new Listener<FieldEvent>() {
					public void handleEvent(FieldEvent e) {
						String codigo = new Long((Long) comboCpfCnpjVinculador
								.getValue().get("id")).toString();
						String nome = (String) comboCpfCnpjVinculador
								.getValue().get("nomeRazaoSocial");
						textNomeVinculador.setValue(codigo + " - " + nome);
					}
				});

		layoutContainerVinculacao.add(fieldsetVinculacao);
		fieldsetVinculacao.setSize("843", "75");
		fieldsetVinculacao.setHeading(CadastroGeralI18N.constants
				.vinculacaoDependenciaCaptador());
		return layoutContainerVinculacao;
	}

	protected LayoutContainer doGetControleAcesso() {

		layoutContainerControleAcesso = new LayoutContainer();
		layoutContainerControleAcesso.setId("id_IncluiAlteraCadastroGeralWindow_LayoutContainerControleAcesso");

		FieldSet fieldsetControleAcesso = new FieldSet();
		fieldsetControleAcesso.setId("id_IncluiAlteraCadastroGeralWindow_FieldsetControleAcesso");
		fieldsetControleAcesso.setLayout(new AbsoluteLayout());

		LabelField labelGrupoDeAcesso = new LabelField(
				CadastroGeralI18N.constants.grupoAcesso());
		labelGrupoDeAcesso.setId("id_IncluiAlteraCadastroGeralWindow_LabelGrupoDeAcesso");
		fieldsetControleAcesso
				.add(labelGrupoDeAcesso, new AbsoluteData(0, -10));

		RpcProxy proxyGrupoAcesso = new RpcProxy() {

			@Override
			protected void load(Object loadConfig, AsyncCallback callback) {
				service.retornaListaGrupoAcesso(callback);
			}
		};

		BeanModelReader readerGrupoAcesso = new BeanModelReader();
		ListLoader loaderGrupoAcesso = new BaseListLoader(proxyGrupoAcesso,
				readerGrupoAcesso);
		ListStore<BeanModel> storeGrupoAcesso = new ListStore<BeanModel>(
				loaderGrupoAcesso);

		comboGrupoAcesso = new ComboBox();
		comboGrupoAcesso.setId("id_IncluiAlteraCadastroGeralWindow_ComboGrupoAcesso");
		comboGrupoAcesso.setStore(storeGrupoAcesso);
		comboGrupoAcesso.setToolTip(CadastroGeralI18N.tooltip.grupoAcesso());
		comboGrupoAcesso.setSize("221px", "22px");
		comboGrupoAcesso.setDisplayField("nome");
		comboGrupoAcesso.setAllowBlank(false);
		fieldsetControleAcesso.add(comboGrupoAcesso, new AbsoluteData(0, 15));
		formatarCombo(comboGrupoAcesso);

		LabelField labelLogin = new LabelField(
				CadastroGeralI18N.constants.login());
		labelLogin.setId("id_IncluiAlteraCadastroGeralWindow_LabelLogin");
		fieldsetControleAcesso.add(labelLogin, new AbsoluteData(257, -10));
		textLogin = new TextField();
		textLogin.setId("id_IncluiAlteraCadastroGeralWindow_TextLogin");

		textLogin.addListener(Events.OnBlur, new Listener<FieldEvent>() {
			public void handleEvent(FieldEvent e) {
				if (!"".equals(textLogin.getValue()) && textLogin.getValue() != null) {
					service.recuperarUsuarioPorLogin(textLogin.getValue().toString(), new AsyncCallback<Usuario>() {

						public void onFailure(Throwable caught) {
							MessageBox.alert("alerta!","Ocorreu um erro grave!"+ " \nDetalhes:\n"+ caught.getMessage(),null);
						}

						public void onSuccess(Usuario usuario) {
							String logintemp = textLogin.getValue().toString();
							if (usuario != null && usuario.getLogin().equals(textLogin.getValue().toString())) {
								if (loginUpdate != null && loginUpdate.equals(textLogin.getValue())) {
									return;
								}
								textLogin.forceInvalid(CadastroGeralI18N.messages.loginJaUtilizado());
							}else{
								textLogin.clear();
								textLogin.setValue(logintemp);
							}
						}
					});
				}
			}
		});
		textLogin.setToolTip(CadastroGeralI18N.tooltip.login());
		textLogin.setAllowBlank(false);
		textLogin.setMaxLength(15);
		textLogin.setSize("177px", "22px");
		fieldsetControleAcesso.add(textLogin, new AbsoluteData(256, 15));

		LabelField labelSituaoDoUsuario = new LabelField(
				CadastroGeralI18N.constants.situacao());
		labelSituaoDoUsuario.setId("id_IncluiAlteraCadastroGeralWindow_LabelSituaoDoUsuario");
		fieldsetControleAcesso.add(labelSituaoDoUsuario, new AbsoluteData(479,
				-10));

		radiogroupsituacaousuario = new RadioGroup();
		radiogroupsituacaousuario.setId("id_IncluiAlteraCadastroGeralWindow_Radiogroupsituacaousuario");
		radiogroupsituacaousuario.setSelectionRequired(true);

		situacaoUsuarioLiberado = new Radio();
		situacaoUsuarioLiberado.setId("id_IncluiAlteraCadastroGeralWindow_SituacaoUsuarioLiberado");
		radiogroupsituacaousuario.add(situacaoUsuarioLiberado);
		situacaoUsuarioLiberado.setToolTip(CadastroGeralI18N.tooltip
				.situacaoUsuarioLiberado());
		situacaoUsuarioLiberado.setBoxLabel(CadastroGeralI18N.constants
				.liberado());
		situacaoUsuarioLiberado.setHideLabel(true);
		situacaoUsuarioLiberado.setValue(true);

		situacaoUsuarioBloqueado = new Radio();
		situacaoUsuarioBloqueado.setId("id_IncluiAlteraCadastroGeralWindow_SituacaoUsuarioBloqueado");
		radiogroupsituacaousuario.add(situacaoUsuarioBloqueado);
		situacaoUsuarioBloqueado.setToolTip(CadastroGeralI18N.tooltip
				.situacaoUsuarioBloqueado());
		situacaoUsuarioBloqueado.setBoxLabel(CadastroGeralI18N.constants
				.bloqueado());
		situacaoUsuarioBloqueado.setHideLabel(true);
		situacaoUsuarioBloqueado.setValue(true);
		fieldsetControleAcesso.add(radiogroupsituacaousuario, new AbsoluteData(
				479, 15));
		radiogroupsituacaousuario.setFieldLabel("radioGroupSituacaoUsuario");

		checkGerarCheckarSenha = new CheckBoxGroup();
		checkGerarCheckarSenha.setId("id_IncluiAlteraCadastroGeralWindow_CheckGerarCheckarSenha");

		checkGerarCheckarSenha.add(checkgerarsenha);
		checkGerarCheckarSenha.add(chckbxChecksuperusuario);

		checkgerarsenha = new CheckBox();
		checkgerarsenha.setId("id_IncluiAlteraCadastroGeralWindow_Checkgerarsenha");
		checkgerarsenha.addListener(Events.OnClick, new Listener<FieldEvent>() {
			public void handleEvent(FieldEvent e) {
				Boolean value = checkgerarsenha.getValue();
				if (value) {
					if (textEmail.getValue() == null
							|| "".equals(textEmail.getValue())) {
						MessageBox.alert(CadastroGeralI18N.messages
								.headingInformacao(),
								CadastroGeralI18N.messages
										.informeEmailEnviarSenha(), null);
						checkgerarsenha.setValue(false);
						textEmail.focus();
					}
				}
			}
		});
		fieldsetControleAcesso.add(checkgerarsenha, new AbsoluteData(669, 15));
		checkgerarsenha.setBoxLabel(CadastroGeralI18N.constants
				.checkGerarSenha());
		checkgerarsenha.setHideLabel(true);
		checkgerarsenha.setToolTip(CadastroGeralI18N.tooltip.checkGerarSenha());

		chckbxChecksuperusuario = new CheckBox();
		chckbxChecksuperusuario.setId("id_IncluiAlteraCadastroGeralWindow_ChckbxChecksuperusuario");
		chckbxChecksuperusuario.addListener(Events.OnClick,
				new Listener<FieldEvent>() {
					public void handleEvent(FieldEvent e) {
						Boolean value = chckbxChecksuperusuario.getValue();
						if (value) {
							MessageBox
									.confirm(
											"Confirme",
											"Caso voce torne essa pessoa sua administradora,"
													+ "\n ela podera representar voce em acoes criticas do sistema, "
													+ "\n e tera acesso a dados sigilosos de sua exclusiva responsabilidade!"
													+ "Voce tem certeza que deseja tornar essa pessoa sua administradora?",
											new Listener<MessageBoxEvent>() {

												public void handleEvent(
														MessageBoxEvent be) {
													if (be.getButtonClicked()
															.getText()
															.equals("Sim")) {
														chckbxChecksuperusuario
																.setValue(true);
													} else {
														chckbxChecksuperusuario
																.setValue(false);
													}

												}
											});

						}
					}
				});
		fieldsetControleAcesso.add(chckbxChecksuperusuario, new AbsoluteData(
				669, 0));
		chckbxChecksuperusuario.setBoxLabel("Conceder Super Acesso");
		chckbxChecksuperusuario.setHideLabel(true);
		chckbxChecksuperusuario
				.setToolTip("Permite que o usuario cadastrado seja seu administrador");

		layoutContainerControleAcesso.add(fieldsetControleAcesso);
		fieldsetControleAcesso.setSize("866", "75");
		fieldsetControleAcesso.setAutoWidth(true);
		fieldsetControleAcesso.setHeading(CadastroGeralI18N.constants
				.controleAcessoUsuario());
		layoutContainerPrincipal.add(contentpanelPrincipal);
		contentpanelPrincipal.setSize("800", "300");
		add(layoutContainerPrincipal);
		layoutContainerPrincipal.setBorders(true);
		layoutContainerPrincipal.add(contentpanelPrincipal);
		contentpanelPrincipal.setSize("800", "300");
		add(layoutContainerPrincipal);
		layoutContainerPrincipal.setBorders(true);
		layoutContainerPrincipal.add(contentpanelPrincipal);
		contentpanelPrincipal.setSize("800", "300");
		add(layoutContainerPrincipal);
		layoutContainerPrincipal.setBorders(true);
		return layoutContainerControleAcesso;
	}

	protected LayoutContainer doGetPesquisa() {

		LayoutContainer layoutContainerBotoespesquisa = new LayoutContainer();
		layoutContainerBotoespesquisa.setId("id_IncluiAlteraCadastroGeralWindow_LayoutContainerBotoespesquisa");
		layoutContainerBotoespesquisa.setLayout(new AbsoluteLayout());

		Button btnLimpar = new Button(CadastroGeralI18N.constants.limpar());
		btnLimpar.setId("id_IncluiAlteraCadastroGeralWindow_BtnLimpar");
		btnLimpar.setData(IWindow.OPERATION, Permissoes.LIMPAR);
		addSecurityButton(btnLimpar);
		
		layoutContainerBotoespesquisa.add(btnLimpar, new AbsoluteData(769, 6));

		Button btnSalvar = new Button(CadastroGeralI18N.constants.salvar());
		btnSalvar.setId("id_IncluiAlteraCadastroGeralWindow_BtnSalvar");
		btnSalvar.setData(IWindow.OPERATION, Permissoes.SALVAR);
		addSecurityButton(btnSalvar);
		
		layoutContainerBotoespesquisa.add(btnSalvar, new AbsoluteData(819, 6));
		layoutContainerBotoespesquisa.setSize("868", "40");

		/* tooltips para os botoes */
		btnLimpar.setToolTip(CadastroGeralI18N.tooltip.botaoLimpar());
		btnSalvar.setToolTip(CadastroGeralI18N.tooltip.botaoIncluir());

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

		return layoutContainerBotoespesquisa;
	}

	private PessoaJuridica getPessoaJuridicaPopulado() {
		Atribuicao atribuicao = new Atribuicao();
		Endereco endereco = new Endereco();
		Cidade cidade = new Cidade();
		Estado estado = new Estado();
		ContaBancaria dadosBancarios = new ContaBancaria();
		InstituicaoFinanceira banco = new InstituicaoFinanceira();
		PerfilComissao perfilComissao = new PerfilComissao();
		GrupoAcesso grupoAcesso = new GrupoAcesso();
		Usuario usuario = new Usuario();
		pessoaJuridica = new PessoaJuridica();

		/** identificacao **/
		atribuicao = comboAtribuicao.getValue().getBean();
		pessoaJuridica.setAtribuicao(atribuicao);
		pessoaJuridica.setNomeFantasia(textApelidoNomeFantasia.getValue().toString());
		pessoaJuridica.setRazaoSocial(textNomeRazaoSocial.getValue().toString());
		pessoaJuridica.setSigla(textSigla.getValue()==null?"":textSigla.getValue().toString());
		pessoaJuridica.setNomeFantasia(textApelidoNomeFantasia.getValue().toString());
		pessoaJuridica.setCnpj(textCnpj.getValueUnMask().toString());
		pessoaJuridica.setTipoPessoa(TipoPessoa.JURIDICA);
		pessoaJuridica.setPossuiCadastroAtivo(situacaoPessoaAtiva.getValue());

		/* caso seja incluir, ira ser gerada no banco */
		if (getOperacao() == Function.EDITAR) {
			pessoaJuridica.setId(new Long(textCodigo.getValue().toString()));
		}

		/** contato **/
		endereco.setEndereco(textEndereco.getValue().toString());
		endereco.setNumero(textNumero.getValue().toString());
		endereco.setCep(new Long(textCep.getValueUnMask().toString()));
		endereco.setBairro(textBairro.getValue().toString());

		estado = comboEstados.getValue().getBean();
		cidade = comboCidades.getValue().getBean();
		cidade.setEstado(estado);

		endereco.setCidade(cidade);
		endereco.setEmail(textEmail.getValue().toString());

		endereco.setFax(textDddFax.getValue()==null?"":textDddFax.getValueUnMask().toString());
		endereco.setTelefoneFixo(textDddFoneFixo.getValue()==null?"":textDddFoneFixo.getValueUnMask().toString());
		endereco.setCelular(textDddCelular.getValue()==null?"":textDddCelular.getValueUnMask().toString());
		
		String resp = textResponsavel.getValue().toString();
		endereco.setNomeResponsavel(textResponsavel.getValue()==null?"":textResponsavel.getValue().toString());
		
		endereco.setTelefoneResponsavel(textDddTelefoneResponsvel.getValue()==null?"":textDddTelefoneResponsvel.getValueUnMask().toString());
		endereco.setPossuiCadastroAtivo(situacaoPessoaAtiva.getValue());

		endereco.setId(cadContaBancaria != null ? cadContaBancaria.getId(): null);/* usado no update */

		List<Endereco> listaEndereco = new ArrayList<Endereco>();
		listaEndereco.add(endereco);
		pessoaJuridica.setEnderecos(listaEndereco);

		/** dados bancarios **/
		banco = comboBancos.getValue().getBean();

		dadosBancarios.setBanco(banco);
		dadosBancarios.setAgencia(textAgencia.getValue().toString());
		dadosBancarios.setConta(textNumeroConta.getValue().toString());
		dadosBancarios.setNomeFavorecido(textFavorecido.getValue().toString());
		
		if(radiotipopessoafisicafavorecido.getValue()){
			if(textCpfFavorecido.getValueUnMask()!=null){
				dadosBancarios.setCpfCnpjFavorecido(textCpfFavorecido.getValueUnMask().toString());							
			}
		}else if(radiotipopessoajuridicafavorecido.getValue()){
			if(textCnpjFavorecido.getValueUnMask()!=null){
				dadosBancarios.setCpfCnpjFavorecido(textCnpjFavorecido.getValueUnMask().toString());				
			}
		}else{
			if(textCpfCnpjFavorecido.getValue()!=null){
				CpfCnpj cpfCnpjUtil = new CpfCnpj(textCpfCnpjFavorecido.getValue().toString());
				dadosBancarios.setCpfCnpjFavorecido(cpfCnpjUtil.getNumber());				
			}	
		}
		
		dadosBancarios.setPossuiCadastroAtivo(situacaoPessoaAtiva.getValue());
		dadosBancarios.setId(cadContaBancaria != null ? cadContaBancaria.getId() : null); /* usado no update */

		if(comboPerfilComissao.getValue()!=null){
			perfilComissao = comboPerfilComissao.getValue().getBean();			
			pessoaFisica.setPerfilComissao(perfilComissao);
		}

		dadosBancarios.setPessoa(pessoaFisica);

		pessoaJuridica.setPossuiBonificacaoContratual(bonificacaoSim.getValue() == true ? true: false);

		dadosBancarios.setTipoConta((TipoConta) comboTipoConta.getValue().getBean());

		List<ContaBancaria> listaDadosBancarios = new ArrayList<ContaBancaria>();
		listaDadosBancarios.add(dadosBancarios);
		pessoaJuridica.setDadosBancarios(listaDadosBancarios);

		/** Vinculacao/Dependencia/Captador **/
		// pessoaJuridica.setPessoaVinculadora(new Pessoa((Long)
		// comboCpfCnpjVinculador.getValue().get("id")));

		ArvoreFamiliar arvoreFamiliar = new ArvoreFamiliar();
		arvoreFamiliar.setArvore(comboCpfCnpjVinculador.getValue().get("arvore").toString());
		arvoreFamiliar.setNivel(new Integer(comboCpfCnpjVinculador.getValue().get("nivel").toString()));
		arvoreFamiliar.setId((Long) comboCpfCnpjVinculador.getValue().get("idAravore"));

		Pessoa pessoaVinculadora = new Pessoa();
		pessoaVinculadora.setId((Long) comboCpfCnpjVinculador.getValue().get("id"));
		Atribuicao atribuicaoVinc = comboVinculacao.getValue().getBean();
		pessoaVinculadora.setAtribuicao(atribuicaoVinc);
		pessoaVinculadora.setArvoreFamiliar(arvoreFamiliar);

		pessoaJuridica.setPessoaVinculadora(pessoaVinculadora);

		/** Controle de Acesso do Usuario **/
		grupoAcesso = comboGrupoAcesso.getValue().getBean();
		usuario.setLogin(textLogin.getValue().toString());
		usuario.setPossuiCadastroAtivo(situacaoUsuarioLiberado.getValue());
		usuario.setGupoAcesso(grupoAcesso);
		usuario.setId(cadUsuario != null ? cadUsuario.getId() : null);
		/*
		 * usado no
		 * update
		 */
		usuario.setSenha(cadUsuario != null ? cadUsuario.getSenha() : null); 
		
		/*
		 * usado no
		 * update
		 */
		if (chckbxChecksuperusuario.getValue()) {
			usuario.setIdSuperUsuario(new Long("999999999"));
		}
		if (checkgerarsenha.getValue()) {
			usuario.setSenha("999999999");
		}
		pessoaJuridica.setUsuario(usuario);

		return pessoaJuridica;
	}

	private PessoaFisica getPessoaFisicaPopulado() {

		Atribuicao atribuicao = new Atribuicao();
		Endereco endereco = new Endereco();
		Cidade cidade = new Cidade();
		Estado estado = new Estado();
		ContaBancaria dadosBancarios = new ContaBancaria();
		InstituicaoFinanceira banco = new InstituicaoFinanceira();
		PerfilComissao perfilComissao = new PerfilComissao();
		GrupoAcesso grupoAcesso = new GrupoAcesso();
		Usuario usuario = new Usuario();

		pessoaFisica = new PessoaFisica();

		/** identificacao **/
		atribuicao = comboAtribuicao.getValue().getBean();
		pessoaFisica.setAtribuicao(atribuicao);
		pessoaFisica.setNome(textNomeRazaoSocial.getValue().toString());
		pessoaFisica.setApelido(textApelidoNomeFantasia.getValue().toString());
		pessoaFisica.setCpf(textCpf.getValueUnMask().toString());
		pessoaFisica.setTipoPessoa(TipoPessoa.FISICA);
		pessoaFisica.setPossuiCadastroAtivo(situacaoPessoaAtiva.getValue());

		/* caso seja incluir, ira ser gerada no banco */
		if (getOperacao() == Function.EDITAR) {
			String codigo = textCodigo.getValue().toString();
			pessoaFisica.setId(new Long(codigo));
		}

		/** contato **/
		endereco.setEndereco(textEndereco.getValue().toString());
		endereco.setNumero(textNumero.getValue().toString());
		endereco.setCep(new Long(textCep.getValueUnMask().toString()));
		endereco.setBairro(textBairro.getValue().toString());
		endereco.setPossuiCadastroAtivo(situacaoPessoaAtiva.getValue());

		estado = comboEstados.getValue().getBean();
		cidade = comboCidades.getValue().getBean();
		cidade.setEstado(estado);

		endereco.setCidade(cidade);
		endereco.setEmail(textEmail.getValue().toString());
		
		endereco.setFax(textDddFax.getValue()==null?"":textDddFax.getValueUnMask().toString());
		endereco.setTelefoneFixo(textDddFoneFixo.getValue()==null?"":textDddFoneFixo.getValueUnMask().toString());
		endereco.setCelular(textDddCelular.getValue()==null?"":textDddCelular.getValueUnMask().toString());
		
		endereco.setNomeResponsavel(textResponsavel.getValue()==null?"":textResponsavel.getValue().toString());
		endereco.setTelefoneResponsavel(textDddTelefoneResponsvel.getValue()==null?"":textDddTelefoneResponsvel.getValueUnMask().toString());

		endereco.setId(cadEndereco != null ? cadEndereco.getId() : null);/*
																		 * usado
																		 * no
																		 * update
																		 */

		List<Endereco> listaEndereco = new ArrayList<Endereco>();
		listaEndereco.add(endereco);
		pessoaFisica.setEnderecos(listaEndereco);

		/** dados bancarios **/
		banco = comboBancos.getValue().getBean();

		dadosBancarios.setBanco(banco);
		dadosBancarios.setAgencia(textAgencia.getValue().toString());
		dadosBancarios.setConta(textNumeroConta.getValue().toString());
		dadosBancarios.setNomeFavorecido(textFavorecido.getValue().toString());
		if(radiotipopessoafisicafavorecido.getValue()){
			if(textCpfFavorecido.getValueUnMask()!=null){
				dadosBancarios.setCpfCnpjFavorecido(textCpfFavorecido.getValueUnMask().toString());							
			}
		}else if(radiotipopessoajuridicafavorecido.getValue()){
			if(textCnpjFavorecido.getValueUnMask()!=null){
				dadosBancarios.setCpfCnpjFavorecido(textCnpjFavorecido.getValueUnMask().toString());				
			}
		}else{
			if(textCpfCnpjFavorecido.getValue()!=null){
				CpfCnpj cpfCnpjUtil = new CpfCnpj(textCpfCnpjFavorecido.getValue().toString());
				dadosBancarios.setCpfCnpjFavorecido(cpfCnpjUtil.getNumber());				
			}			
		}
		dadosBancarios.setPossuiCadastroAtivo(situacaoPessoaAtiva.getValue());
		dadosBancarios.setId(cadContaBancaria != null ? cadContaBancaria
				.getId() : null); /* usado no update */

		if(comboPerfilComissao.getValue()!=null){
			perfilComissao = comboPerfilComissao.getValue().getBean();			
			pessoaFisica.setPerfilComissao(perfilComissao);
		}


		dadosBancarios.setPessoa(pessoaFisica);

		pessoaFisica
				.setPossuiBonificacaoContratual(bonificacaoSim.getValue() == true ? true
						: false);

		dadosBancarios.setTipoConta((TipoConta) comboTipoConta.getValue().getBean());

		List<ContaBancaria> listaDadosBancarios = new ArrayList<ContaBancaria>();
		listaDadosBancarios.add(dadosBancarios);
		pessoaFisica.setDadosBancarios(listaDadosBancarios);

		/** Vinculacao/Dependencia/Captador **/
		// pessoaFisica.setPessoaVinculadora(new Pessoa((Long)
		// comboCpfCnpjVinculador.getValue().get("id")));

		ArvoreFamiliar arvoreFamiliar = new ArvoreFamiliar();
		arvoreFamiliar.setArvore(comboCpfCnpjVinculador.getValue()
				.get("arvore").toString());
		arvoreFamiliar.setNivel(new Integer(comboCpfCnpjVinculador.getValue()
				.get("nivel").toString()));
		arvoreFamiliar.setId((Long) comboCpfCnpjVinculador.getValue().get(
				"idAravore"));

		Pessoa pessoaVinculadora = new Pessoa();
		Atribuicao atribuicaoVinc = comboVinculacao.getValue().getBean();
		pessoaVinculadora.setAtribuicao(atribuicaoVinc);
		pessoaVinculadora.setId((Long) comboCpfCnpjVinculador.getValue().get(
				"id"));

		pessoaVinculadora.setArvoreFamiliar(arvoreFamiliar);
		pessoaFisica.setPessoaVinculadora(pessoaVinculadora);

		/** Controle de Acesso do Usuario **/
		grupoAcesso = comboGrupoAcesso.getValue().getBean();
		usuario.setLogin(textLogin.getValue().toString());
		usuario.setPossuiCadastroAtivo(situacaoUsuarioLiberado.getValue());
		usuario.setGupoAcesso(grupoAcesso);
		usuario.setId(cadUsuario != null ? cadUsuario.getId() : null); /*
																		 * usado
																		 * no
																		 * update
																		 */
		usuario.setSenha(cadUsuario != null ? cadUsuario.getSenha() : null); /*
																			 * usado
																			 * no
																			 * update
																			 */

		if (chckbxChecksuperusuario.getValue()) {
			usuario.setIdSuperUsuario(new Long("999999999"));
		}
		if (checkgerarsenha.getValue()) {
			usuario.setSenha("999999999");
		}
		pessoaFisica.setUsuario(usuario);

		return pessoaFisica;

	}

	protected void salvar() {

		Pessoa pessoa = null;

		if (!isDadosValidos()) {
			return;
		}

		if (radioTipoPessoaFisica.getValue()) {
			pessoa = getPessoaFisicaPopulado();
		} else {
			pessoa = getPessoaJuridicaPopulado();
		}

		if (getOperacao() == Function.EDITAR) {
			
			/* sem o recurso de barra de progresso */
			/*service.atualizarPessoa(pessoa, new AsyncCallback<Boolean>() {

				public void onFailure(Throwable caught) {
					MessageBox.alert("alerta!","Ocorreu um erro grave!"+ " \nDetalhes:\n"+ caught.getMessage(),null);
				}

				public void onSuccess(Boolean result) {
					if (result) {
						MessageBox.info("Informacao!", "Pessoa atualizada com sucesso!", null);
					}
				}
			});*/
			
			service.atualizarPessoa(pessoa, new RpcWaitCallback<Boolean>(WidgetsI18N.messages.aguarde(),WidgetsI18N.messages.processando()){
				
				@Override
				public void handleFailure(Throwable caught) {
					MessageBox.alert("alerta!","Ocorreu um erro grave!"+ " \nDetalhes:\n"+ caught.getMessage(),null);
				}
				
				@Override
				public void handleResponse(Boolean result) {
					
					if (result) {
						MessageBox.info("Informacao!", "Pessoa atualizada com sucesso!", null);
					}
				}
				
				
			});
			
		} else {
			
			/* sem o recurso de barra de tarefa */
			/*
			service.incluirPessoa(pessoa, new AsyncCallback<Long>() {

				public void onFailure(Throwable caught) {
					MessageBox.alert("alerta!","Ocorreu um erro grave!"+ " \nDetalhes:\n"+ caught.getMessage(),null);
				}

				public void onSuccess(Long result) {
					MessageBox.info("Informacao!", "Pessoa cadastrada com sucesso!", null);
					textCodigo.setValue(result);
				}
			});*/
			
			service.incluirPessoa(pessoa, new RpcWaitCallback<Long>(WidgetsI18N.messages.aguarde(),WidgetsI18N.messages.processando()){
				
				@Override
				public void handleFailure(Throwable caught) {
					MessageBox.alert("alerta!","Ocorreu um erro grave!"+ " \nDetalhes:\n"+ caught.getMessage(),null);
				}
				
				@Override
				public void handleResponse(Long result) {
					
					MessageBox.info("Informacao!", "Pessoa cadastrada com sucesso!", null);
					textCodigo.setValue(result);
				}
				
				
			});
		}
	}

	@Override
	protected void onAjuda() {
		AjudaCadastroGeralWindow ajudaCadastroGeralWindow = new AjudaCadastroGeralWindow();
		ajudaCadastroGeralWindow.show();
	}

	@Override
	protected void onClearForm() {

		/* identificacao */
		textCodigo.reset();
		textSigla.reset();
		comboAtribuicao.reset();
		textCpf.reset();
		textCnpj.reset();
		textNomeRazaoSocial.reset();
		textApelidoNomeFantasia.reset();
		situacaoPessoaAtiva.reset();
		situacaoPessoaInativa.reset();
		radioTipoPessoaFisica.reset();
		radioTipoPessoaJuridica.reset();

		/* dados contatos */
		textEndereco.reset();
		textNumero.reset();
		textCep.reset();
		textBairro.reset();
		comboEstados.reset();
		comboCidades.reset();
		textEmail.reset();
		textDddFax.reset();
		textDddFoneFixo.reset();
		textDddCelular.reset();
		textResponsavel.reset();
		textDddTelefoneResponsvel.reset();

		/* dados bancarios */
		comboBancos.reset();
		comboTipoConta.reset();
		textAgencia.reset();
		textNumeroConta.reset();
		textFavorecido.reset();
		textCpfCnpjFavorecido.reset();
		comboPerfilComissao.reset();
		bonificacaoSim.reset();
		bonificacaoNo.reset();

		/* vinculacao dependencia capacitador */
		comboVinculacao.reset();
		comboCpfCnpjVinculador.reset();
		textNomeVinculador.reset();

		/* controle grupo acesso */
		comboGrupoAcesso.reset();
		textLogin.reset();
		situacaoUsuarioLiberado.reset();
		situacaoUsuarioBloqueado.reset();
		checkgerarsenha.reset();
		chckbxChecksuperusuario.reset();
	}

	protected boolean isDadosValidos() {

		if (!comboAtribuicao.isValid()) {
			return false;
		} else if (!textNomeRazaoSocial.isValid()) {
			return false;
		}else if (!textApelidoNomeFantasia.isValid()) {
			return false;
		} else if (!radiogroupsituacaopessoa.isValid()) {
			return false;
		} else if (!radiogrouptipopessoa.isValid()) {
			return false;
		} else if (!textEndereco.isValid()) {
			return false;
		} else if (!textNumero.isValid()) {
			return false;
		} else if (!textCep.isValid()) {
			return false;
		} else if (!textBairro.isValid()) {
			return false;
		} else if (!comboEstados.isValid()) {
			return false;
		} else if (!comboCidades.isValid()) {
			return false;
		} else if (!textEmail.isValid()) {
			return false;
		} else if (!comboBancos.isValid()) {
			return false;
		} else if (!comboTipoConta.isValid()) {
			return false;
		} else if (!textAgencia.isValid()) {
			return false;
		} else if (!textNumeroConta.isValid()) {
			return false;
		} else if (!textFavorecido.isValid()) {
			return false;
		} else if (!radiogrouppossuibonificacao.isValid()) {
			return false;
		} else if (!comboVinculacao.isValid()) {
			return false;
		} else if (!comboCpfCnpjVinculador.isValid()) {
			return false;
		} else if (!textNomeVinculador.isValid()) {
			return false;
		} else if (!comboGrupoAcesso.isValid()) {
			return false;
		} else if (!textLogin.isValid()) {
			return false;
		} else if (!radiogroupsituacaousuario.isValid()) {
			return false;
		}else if(radioTipoPessoaFisica.getValue() && (!textCpf.isValid())){
			return false;
		}else if(radioTipoPessoaJuridica.getValue() && (!textCnpj.isValid())){
			return false;
		}
		
		if(radiotipopessoafisicafavorecido.getValue()==null && radiotipopessoajuridicafavorecido.getValue()==null){
			if(!textCpfCnpjFavorecido.isValid()){
				return false;	
			}
		}
		
		if(radiotipopessoafisicafavorecido.getValue()){
			if(!textCpfFavorecido.isValid()){
				return false;	
			}
		}
		
		if(radiotipopessoajuridicafavorecido.getValue()){
			if(!textCnpjFavorecido.isValid()){
				return false;	
			}
		}
		
		return true;
	}
}
