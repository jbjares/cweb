package br.com.cweb.view.cadastro.instituicaofinanceira.client.i18n;

import com.google.gwt.i18n.client.Messages;

public interface InstituicaoFinanceiraConstants extends Messages{
	
	/* titulo formulario de cadastro de instituicao fina*/
	String headingCadastroInstituicao();
	String headingGrid();
	
	/*Dados instituicao financeira*/
	String identificacao();
	String codigo();
	String  nome();
	String webSite();
	String observacoes();
	String  sigla();
	
	String tipoInstituicao();
	String tipoInstituicaoBanco();
	String tipoInstituicaoParceiro();
	String situacao();
	String situacaoAtiva();
	String situacaoInativa();	
	
	/* commons */
	String salvar();
	String limpar();
	String pesquisar();
	String excluir();
	String incluir();
	String alterar();
	String imprimir();
	String visualizar();	
}
