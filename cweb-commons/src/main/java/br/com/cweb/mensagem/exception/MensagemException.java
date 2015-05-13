package br.com.cweb.mensagem.exception;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.cweb.mensagem.to.Mensagem;

/**
 * Classe de Excecao para as validacoes
 * do sistema.
 * @author Sebastiao Nunes
 * @since 1.0
 */
public class MensagemException extends RuntimeException implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Mensagem mensagem;

	private List<Mensagem> listaMensagens = new ArrayList<Mensagem>(0);

	public MensagemException() {
	}

	public MensagemException(Mensagem msg) {
		super((msg != null) ? msg.getDescricao() : null);
		this.mensagem = msg;
	}

	public MensagemException(List<Mensagem> lista) {
		this.listaMensagens = lista;
	}

	public Mensagem getMensagem() {
		return mensagem;
	}

	public void setMensagem(Mensagem mensagem) {
		this.mensagem = mensagem;
	}

	public List<Mensagem> getListaMensagens() {
		return listaMensagens;
	}

	public void setListaMensagens(List<Mensagem> listaMensagens) {
		this.listaMensagens = listaMensagens;
	}
}
