package br.com.cweb.core.persistence.exception;

import java.util.ArrayList;
import java.util.List;
import br.com.cweb.mensagem.to.Mensagem;

/**
 * @author Sebastiao Nunes
 * @since 1.0
 */
public class ValidationException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Mensagem> listaMensagens = new ArrayList<Mensagem>(0);
	
	public ValidationException(Mensagem mensagem) {
		this.listaMensagens.add(mensagem);
	}
	
	public List<Mensagem> getListaMensagens() {
		return listaMensagens;
	}

	public void setListaMensagens(List<Mensagem> listaMensagens) {
		this.listaMensagens = listaMensagens;
	}

	public ValidationException(List<Mensagem> listaMensagens) {
		this.listaMensagens.addAll(listaMensagens);
	}
}
