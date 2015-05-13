package br.com.cweb.view.cadastro.cadastrogeral.client.i18n;

import com.google.gwt.i18n.client.Messages;

public interface CadastroGeralConstants extends Messages{
    
	/* titulo formulario de cadastro */
	String headingCadastroGeral();
	
	/* identificacao */
	String identificacao();
	String codigo();
	String sigla();
	String atribuicao();
	String cpfCnpj();
	String nomeRazaoSocial();
	String apelidoNomeFantasia();
	String situacao();
	String situacaoAtiva();
	String situacaoInativa();
	String tipoPessoa();
	String pessoaFisica();
	String pessoaJuridica();
	
	/* dados de contatos */
	String dadosContatos();
	String endereco();
	String numero();
	String cep();
	String bairro();
	String estado();
	String cidade();
	String email();
	String emailDDFax();
	String emailDDTelefoneFixo();
	String dddCelular();
	String responsavel();
	String dddTelefoneResponsavel();
	
	/* dados bancarios */
	String dadosBancarios();
	String banco();
	String tipoConta();
	String agencia();
	String numeroConta();
	String favorecido();
	String cpfCnpjFavorecido();
	String perfilComissao();
	String bonificacaoContrato();
	String sim();
	String nao();
	
	/* vinculacao/dependencia/captador*/
	String vinculacaoDependenciaCaptador();
	String vinculadoA();
	String cpfCnpjVinculador();
	
	/* controle acesso usuario */
	String controleAcessoUsuario();
	String grupoAcesso();
	String login();
	String situacaoUsuario();
	String bloqueado();
	String liberado();
	String checkGerarSenha();
	
	/* titulo form pesquisa */
	String headingPesquisaCadastro();
	String headingGrid();
	String inexistente();
	String nomeVinculador();
	
	/* commons */
	String salvar();
	String limpar();
	String pesquisar();
	String excluir();
	String incluir();
	String alterar();
	String imprimir();


}


