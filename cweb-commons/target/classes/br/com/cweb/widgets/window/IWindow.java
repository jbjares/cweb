package br.com.cweb.widgets.window;



public interface IWindow {

	 public static final String OPERATION = "operation";
	 public static final String DOMAIN_OBJECT = "domainObject";
	 
	 void setWindowConfig(IWindowConfig cfg);
	 
	 IWindowConfig getWindowConfig();
}
