package br.com.cweb.core.persistence.entity;

public enum TipoVinculacao implements EnumModel{

	MATRIZ(0),SUBESTABELECIDO(1),BASE(2),CORRETOR(3);
	
	private Integer tipo;
	
	private TipoVinculacao(Integer tipo){
		this.tipo=tipo;
	}

	public int getValue() { return tipo; }
	
	public static TipoVinculacao valueOf(int value){
		for(TipoVinculacao tcc:values()){
			if(tcc.getValue()==value){
				return tcc;
			}
		}
		throw new IllegalArgumentException("Tipo não encontrado: "+value);
	}
	
}
