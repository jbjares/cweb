package br.com.cweb.relatorio.to;


public enum TipoFormatoRelatorio {

	EXCEL(0,"xls"),PDF(1,"pdf");
	
	private Integer value;
	
	private String extensao;
	
	TipoFormatoRelatorio(Integer value, String extensao){
		this.extensao=extensao;
		this.value=value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getExtensao() {
		return extensao;
	}

	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}
	
	public static TipoFormatoRelatorio valueOf(int value){
		for(TipoFormatoRelatorio tcc:values()){
			if(tcc.getValue()==value){
				return tcc;
			}
		}
		throw new IllegalArgumentException("Tipo não encontrado: "+value);
	}

}
