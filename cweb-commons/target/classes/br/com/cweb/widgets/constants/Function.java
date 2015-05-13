package br.com.cweb.widgets.constants;

public enum Function {

	INCLUIR(0, "Incluir", "I"),
	EDITAR(1, "Editar", "U"),
	DELETAR(2, "Deletar", "D"),
	SELECIONAR(7, "Selecionar", "S"),
	CONSULTAR(8, "Consultar", "L");

	private Integer value;
	private String name;
	private String codigo;

	private Function(Integer value, String name, String codigo) {
		this.value = value;
		this.name = name;
		this.codigo = codigo;
	}

	public Integer getValue() {
		return value;
	}

	public String getName() {
		return name;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public static Function valueOf(Integer value) {
		for (Function function : values()) {
			if (function.getValue().equals(value)) {
				return function;
			}
		}

		return null;
	}
}
