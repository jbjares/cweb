package br.com.cweb.widgets.erro;

import java.util.*;

/**
 * Classe para gerenciar as excessoes do sistema.
 * @author Sebastiao Nunes
 * @version 1.0
 */
public abstract class ExceptionManager {

	
    protected static List<CustomHandler<Throwable>> handlers = new ArrayList<CustomHandler<Throwable>>();
    
    
    public static void addHandler(final CustomHandler<Throwable> handler)
    {
        handlers.add(0, handler);
    }
    
    public static void handleException(final Throwable except)
    {
        for (CustomHandler<Throwable> handler : handlers)
        {
            if (handler.canHandle(except))
            {
                handler.handle(except);
                break;
            }
        }
    }
    
    
}
