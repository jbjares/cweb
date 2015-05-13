package br.com.cweb.core.persistence.beanmodel;



import java.io.Serializable;

/**
 * Classe que define a ordenação de um atributo.
 * 
 * @author jair
 */
public class Ordenacao implements Serializable{
	
	private static final long serialVersionUID = 1760696788541663691L;

	private String atributo;
	private boolean asc;
	
	public Ordenacao(){
	}
	
	public Ordenacao(String atributo,boolean asc){
		setAtributo(atributo);
		setAsc(asc);
	}

	/**
	 * Retorna se essa ordenação é ascendente.
	 * @return se essa ordenação é ascendente.
	 */
	public boolean isAsc() {
		return asc;
	}

	public void setAsc(boolean asc) {
		this.asc = asc;
	}

	/**
	 * Retorna se essa ordenação é descendente.
	 * @return se essa ordenação é descendente.
	 */
	public boolean isDesc() {
		return !isAsc();
	}

	public void setDesc(boolean desc) {
		setAsc(!desc);
	}

	/**
	 * Retorna o atributo a ser ordenado.
	 * @return o atributo a ser ordenado.
	 */
	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}
	
	/**
	 * Cria uma nova ordenação ascendente para o atributo
	 * @param atributo atributo a ser ordenado.
	 * @return uma nova ordenação ascendente para o atributo
	 */
	public static Ordenacao asc(String atributo){
		return new Ordenacao(atributo,true);
	}
	
	/**
	 * Cria uma nova ordenação descendente para o atributo
	 * @param atributo atributo a ser ordenado.
	 * @return uma nova ordenação descendente para o atributo
	 */
	public static Ordenacao desc(String atributo){
		return new Ordenacao(atributo,false);
	}
}