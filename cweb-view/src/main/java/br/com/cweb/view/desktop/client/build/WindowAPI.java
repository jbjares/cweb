package br.com.cweb.view.desktop.client.build;

import com.extjs.gxt.ui.client.widget.Window;
import br.com.cweb.view.desktop.client.contexto.WebApplication;


/**
 * 
 * @author Sebastiao Nunes
 * @since
 *
 */
public class WindowAPI {

	 public static void buildWindow(Window window,String codigoFuncionalidade)
	 {
	        WebApplication.getInstance().getWindowBuilder().buildWindow(window, codigoFuncionalidade);
	 }

    public static void buildWindow(Window window)
    {
        WebApplication.getInstance().getWindowBuilder().buildWindow(window);
    }
}
