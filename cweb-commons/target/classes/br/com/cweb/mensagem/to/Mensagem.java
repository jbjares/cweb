package br.com.cweb.mensagem.to;

import java.io.Serializable;

/**
 * Classe para tranportar mensagens entre
 * as camadas do sistema
 * @author Sebastiao Nunes
 * @since 1.0
 */
public class Mensagem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	private String descricao;
	
	public Mensagem(){}
	
	public Mensagem(Integer codigo,String descricao){
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public Mensagem(String descricao){
		this.descricao = descricao;
	}
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	
}
