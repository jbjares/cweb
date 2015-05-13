package br.com.cweb.view.cadastro.cadastroconvenio.client.i18n;

import com.google.gwt.i18n.client.Messages;

public interface CadastroConvenioMessages extends Messages{
    
	@DefaultMessage("Operação realizada com sucesso!")
	String operacaoSucesso();
	
	@DefaultMessage("Registro excluído com sucesso!")
	String excluidoSucesso();
	
	@DefaultMessage("Falha na operação!")
	String falhaNaOperacao();

	@DefaultMessage("Error")
	String tituloFalha();
	
	@DefaultMessage("Informação")
	String tituloInformacao();

	@DefaultMessage("Aguarde")
	String aguarde();

	@DefaultMessage("Processando")
	String processando();
}


