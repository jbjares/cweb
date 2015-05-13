package br.com.cweb.cadastro.persistence.entity;

import br.com.cweb.core.persistence.entity.EnumModel;

public enum TipoEndereco implements EnumModel{

	CORRESPONDENCIA(0),RESIDENCIAL(1),COMERCIAL(2);
	
	private Integer tipo;
	
	TipoEndereco(Integer tipo){
		this.tipo=tipo;
	}

	public int getValue() { return tipo; }
	
	public static TipoEndereco valueOf(int value){
		for(TipoEndereco tcc:values()){
			if(tcc.getValue()==value){
				return tcc;
			}
		}
		throw new IllegalArgumentException("Tipo não encontrado: "+value);
	}

}
