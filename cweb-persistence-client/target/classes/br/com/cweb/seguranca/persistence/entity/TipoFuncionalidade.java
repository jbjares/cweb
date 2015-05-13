package br.com.cweb.seguranca.persistence.entity;

import br.com.cweb.core.persistence.entity.EnumModel;


/**
 * Armazena os tipos de funcionalidades do sistema
 * @author Sebastiao Nunes
 * @since 1.0
 */
public enum TipoFuncionalidade implements EnumModel{
	MODULO(0), MENU(1),ROTINA(2);
	private Integer tipo;

	TipoFuncionalidade(Integer tipo) {
		this.tipo = tipo;
	}

	public int getValue() { return tipo; }
	
	public static TipoFuncionalidade valueOf(int value){
		for(TipoFuncionalidade tcc:values()){
			if(tcc.getValue()==value){
				return tcc;
			}
		}
		throw new IllegalArgumentException("Tipo não encontrado: "+value);
	}

	
}
