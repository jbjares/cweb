package br.com.cweb.cadastro.persistence.entity;

import br.com.cweb.core.persistence.entity.EnumModel;

public enum TipoPessoa implements EnumModel{

	FISICA(0),JURIDICA(1);
	
	private Integer tipo;
	
	TipoPessoa(Integer tipo){
		this.tipo=tipo;
	}

	public int getValue() { return tipo; }
	
	public static TipoPessoa valueOf(int value){
		for(TipoPessoa tcc:values()){
			if(tcc.getValue()==value){
				return tcc;
			}
		}
		throw new IllegalArgumentException("Tipo não encontrado: "+value);
	}

	
}
