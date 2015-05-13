package br.com.cweb.view.cadastro.cadastroconvenio.client.i18n;

import com.google.gwt.i18n.client.Messages;

public interface CadastroConvenioTooltip extends Messages{

	@DefaultMessage("Utilize este botão para exibir texto de ajuda")
	String ajudar();

	@DefaultMessage("Inicia o processo de alterar um convênio")
	String alterar();

	@DefaultMessage("Indica que o convênio está Ativo")
	String ativo();

	@DefaultMessage("Inicia processo de Excluir um convênio")
	String excluirCadastro();

	@DefaultMessage("Confirma a Exclusão do convênio selecionado")
	String excluirPesquisa();

	@DefaultMessage("Abre o relatório dos convênios")
	String imprimir();

	@DefaultMessage("Indica que o convênio está Inativo")
	String inativo();

	@DefaultMessage("Limpa o formulário")
	String limpar();

	@DefaultMessage("Descrição ou Nome que identifica o Convênio")
	String nome();

	@DefaultMessage("Informe o nome completo ou parcial do Convênio a ser pesquisado")
	String nomePesquisa();

	@DefaultMessage("Inicia o processo de criar um Convênio novo")
	String novo();

	@DefaultMessage("Realiza a pesquisa dos Convênios desejados")
	String pesquisar();

	@DefaultMessage("Grava as informações incluidas ou alterada do Convênio selecionado")
	String salvar();

	@DefaultMessage("Situação do Convênio: Ativo ou Inativo")
	String situacao();

	@DefaultMessage("Selecione a situação do Convênio a ser pesquisado")
	String situacaoPesquisa();

	@DefaultMessage("Cancela o processo e volta a tela de pesquisa")
	String voltar();	
}
