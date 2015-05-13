package br.com.cweb.mensagem.handler;

import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.MessageBoxEvent;
import com.extjs.gxt.ui.client.widget.MessageBox;
import br.com.cweb.mensagem.exception.MensagemException;
import br.com.cweb.mensagem.to.Mensagem;
import br.com.cweb.widgets.erro.CustomHandler;

/**
 * Classe para exibir na camada visual as excessoes 
 * do tipo MensagemException
 * @author Sebastiao Nunes
 * @version 1.0
 */
public class MessageHandler implements CustomHandler<Throwable>{

	  
	public boolean canHandle(Object obj) {
	    
	    return (obj instanceof MensagemException);
	}

	public void handle(Throwable exception) {
	    
		handle(exception,null);
	}

	//TODO melhorar renderizacao da lista de mensagens
	public void handle(Throwable exception, Listener<MessageBoxEvent> listener) {
		
		MensagemException e = (MensagemException) exception;
		if (e.getMensagem() != null) {
			MessageBox.alert("alerta!","Ocorreu um erro grave!"+ " \nDetalhes:\n"+ e.getMensagem().getDescricao(),null);
		}
		else if((e.getListaMensagens() != null) && (e.getListaMensagens().size() > 0)){
			
			String mensagem = "";
			
			for(Mensagem msg:e.getListaMensagens()){
				mensagem = mensagem + "\n" + msg.getDescricao(); 
			}
			MessageBox.alert("alerta!","Ocorreu um erro grave!"+ " \nDetalhes:\n"+ mensagem,null);
		}
		
	}

	
}
