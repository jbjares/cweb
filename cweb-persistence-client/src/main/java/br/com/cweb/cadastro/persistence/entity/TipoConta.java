package br.com.cweb.cadastro.persistence.entity;

import br.com.cweb.core.persistence.entity.EnumModel;

public enum TipoConta implements EnumModel{
	CORRENTE("Corrente",0), POUPANCA("Poupanca",1);
	
	private Integer tipo;
	
	private String descricao;

	TipoConta(String descricao, Integer tipo) {
		this.tipo = tipo;
		this.descricao=descricao;
	}

	public int getValue() { return tipo; }
	
	public static TipoConta valueOf(int value){
		for(TipoConta tcc:values()){
			if(tcc.getValue()==value){
				return tcc;
			}
		}
		throw new IllegalArgumentException("Tipo nao encontrado: "+value);
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
