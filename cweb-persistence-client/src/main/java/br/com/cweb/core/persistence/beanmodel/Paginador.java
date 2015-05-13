package br.com.cweb.core.persistence.beanmodel;



import java.io.Serializable;

/**
 * Paginador utilizado para restringir a busca de dados
 * 
 * @author jair
 */
public class Paginador implements Serializable{
	private static final long serialVersionUID = 5313303890867130955L;

	private int indiceRegistroInicial;
	private int registrosPorPagina;
	
	public Paginador() {
	}

	

	public Paginador(int indiceRegistroInicial, int registrosPorPagina) {
		super();
		this.indiceRegistroInicial = indiceRegistroInicial;
		this.registrosPorPagina = registrosPorPagina;
	}



	/**
	 * Retorna o índice do registro inicial
	 * @return o índice do registro inicial
	 */
	public int getIndiceRegistroInicial() {
		return indiceRegistroInicial;
	}
	public void setIndiceRegistroInicial(int inicio) {
		this.indiceRegistroInicial = inicio;
	}
	
	/**
	 * Retorna a quantidade de registros contidos em uma página 
	 * @return a quantidade de registros contidos em uma página
	 */
	public int getRegistrosPorPagina() {
		return registrosPorPagina;
	}
	public void setRegistrosPorPagina(int pagina) {
		this.registrosPorPagina = pagina;
	}



	@Override
	public String toString() {
		return "Paginador [indiceRegistroInicial=" + indiceRegistroInicial
				+ ", registrosPorPagina=" + registrosPorPagina + "]";
	}
	
	
}