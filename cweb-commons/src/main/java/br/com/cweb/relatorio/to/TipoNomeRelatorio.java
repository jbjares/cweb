package br.com.cweb.relatorio.to;

public enum TipoNomeRelatorio {

	CADASTRO_CONVENIO(3, "pesquisacadastrogrupoacesso"),
	CADASTRO_INSTITUICAO_FINANCEIRA(2, "pesquisainstituicaofinanceira"),
	CADASTRO_GRUPO_ACESSO(1,"pesquisacadastrogrupoacesso"),
	CADASTRO_GERAL(0,"pesquisacadastrogeral");
	
	
	private Integer value;
	
	private String nome;
	
	TipoNomeRelatorio(Integer value, String nome){
		this.value=value;
		this.nome=nome;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static TipoNomeRelatorio valueOf(int value){
		for(TipoNomeRelatorio tcc:values()){
			if(tcc.getValue()==value){
				return tcc;
			}
		}
		throw new IllegalArgumentException("Tipo não encontrado: "+value);
	}

}
