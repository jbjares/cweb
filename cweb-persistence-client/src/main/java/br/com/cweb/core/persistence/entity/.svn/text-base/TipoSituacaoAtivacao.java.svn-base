package br.com.cweb.core.persistence.entity;


public enum TipoSituacaoAtivacao implements EnumModel{

	INATIVO(0),ATIVO(1);
	
	private Integer tipo;
	
	private TipoSituacaoAtivacao(Integer tipo){
		this.tipo=tipo;
	}

	public int getValue() { return tipo; }
	
	public static TipoSituacaoAtivacao valueOf(int value){
		for(TipoSituacaoAtivacao tcc:values()){
			if(tcc.getValue()==value){
				return tcc;
			}
		}
		throw new IllegalArgumentException("Tipo não encontrado: "+value);
	}


}
