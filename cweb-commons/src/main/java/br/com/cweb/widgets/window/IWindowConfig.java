package br.com.cweb.widgets.window;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import br.com.cweb.widgets.constants.Function;

public interface IWindowConfig {
		
	String CODIGO = "codigo";
	Map<String, Serializable> getParameters();
	List<Function> getFunctions();

	 String getCodigo();
}
