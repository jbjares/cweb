package br.com.cweb.core.persistence.beanmodel;



import java.io.Serializable;
import java.util.List;

/**
 * Essa classe adiciona informações de paginação a uma lista.
 * Objetos dessa classe devem ser retornados pelos serviços
 * que precisam notificar seus clientes sobre os dados de paginação.
 * @author jair
 *
 * @param <T> Tipo do objeto que está sendo paginado
 */
public class ResultadoPaginado<T> implements Serializable {
	
	private static final long serialVersionUID = 7123396568911884424L;

	private List<T> resultado;
	private Paginador paginador;
	private Long totalRegistros;
	
	
	public ResultadoPaginado(){
	}
	
	public ResultadoPaginado(List<T> resultado, Paginador paginador) {
		super();
		this.resultado = resultado;
		this.paginador = paginador;
	}
	
	/**
	 * Retorna o resultado paginado
	 * @return o resultado paginado
	 */
	public List<T> getResultado() {
		return resultado;
	}
	public void setResultado(List<T> resultado) {
		this.resultado = resultado;
	}
	
	/**
	 * Retorna o total de registros obtidos na busca
	 * @return o total de registros obtidos na busca
	 */
	public Long getTotalRegistros() {
		return totalRegistros;
	}
	public void setTotalRegistros(Long total) {
		this.totalRegistros = total;
	}
	
	/**
	 * Retorna o paginador que contém os dados de paginação
	 * referentes ao {@link #getResultado()}.
	 * @return paginador que contém os dados de paginação
	 * referentes ao {@link #getResultado()}.
	 */
	public Paginador getPaginador() {
		return paginador;
	}
	public void setPaginador(Paginador paginador) {
		this.paginador = paginador;
	}

	@Override
	public String toString() {
		return "ResultadoPaginado [paginador=" + paginador
				+ ", totalRegistros=" + totalRegistros + "]";
	}
	
	
}