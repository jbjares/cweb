package br.com.cweb.cadastro.persistence.entity;

public enum TipoInstituicao {

	BANCO(0),PARCEIRO(1);
	
	private Integer value;
	
	TipoInstituicao(Integer value){
		this.value=value;
	}
	
	public int getValue() { return value; }
	
	public static TipoInstituicao valueOf(int value){
		for(TipoInstituicao tcc:values()){
			if(tcc.getValue()==value){
				return tcc;
			}
		}
		throw new IllegalArgumentException("Tipo não encontrado: "+value);
	}


	
}
