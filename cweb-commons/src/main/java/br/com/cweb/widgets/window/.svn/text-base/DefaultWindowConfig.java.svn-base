package br.com.cweb.widgets.window;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.cweb.widgets.constants.Function;

public class DefaultWindowConfig implements IWindowConfig, Serializable{

	private static final long serialVersionUID = 1L;
	
	private Map<String, Serializable> parameters;
	
	 public DefaultWindowConfig(Map<String, Serializable> parameters)
	 {
	        this.parameters = parameters;
	 }
	 
	 public DefaultWindowConfig()
	 {
	        
	 }
	 
	public Map<String, Serializable> getParameters() {
		
		return parameters;
	}

	public List<Function> getFunctions() {
		
		 List<Function> functions = new ArrayList<Function>();
	        java.util.Set<String> keys = parameters.keySet();
	        for(String key : keys)
	        {
	            String str = key.toUpperCase();
	            if (str.equals("FN_INCLUIR"))
	                functions.add(Function.INCLUIR);
	            else if (str.equals("FN_EDITAR"))
	                functions.add(Function.EDITAR);
	            else if (str.equals("FN_EXCLUIR"))
	                functions.add(Function.DELETAR);
	            else if (str.equals("FN_SELECIONAR"))
	                functions.add(Function.SELECIONAR);
	            else if (str.equals("FN_CONSULTAR"))
	            	functions.add(Function.CONSULTAR);
	        }
	        return functions;
	}

	public String getCodigo() {
		
		String strId = (String) parameters.get(CODIGO);
    	if (strId == null || "".equals(strId))
    		return "";
    	return strId;
	}

	

}
