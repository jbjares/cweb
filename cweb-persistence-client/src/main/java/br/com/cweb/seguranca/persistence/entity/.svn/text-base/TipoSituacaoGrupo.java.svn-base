package br.com.cweb.seguranca.persistence.entity;

import br.com.cweb.core.persistence.entity.EnumModel;

public enum TipoSituacaoGrupo implements EnumModel {
	ATIVO(1), INATIVO(0);
	private Integer tipo;

	TipoSituacaoGrupo(Integer tipo) {
		this.tipo = tipo;
	}

	public int getValue() { return tipo; }
	
	public static TipoSituacaoGrupo valueOf(int value){
		for(TipoSituacaoGrupo tcc:values()){
			if(tcc.getValue()==value){
				return tcc;
			}
		}
		throw new IllegalArgumentException("Tipo não encontrado: "+value);
	}

}
