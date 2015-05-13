package br.com.cweb.widgets.erro;

import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.MessageBoxEvent;

/**
 * Interface para tratamento de erros do sistema
 * @author Sebastiao Nunes
 * @version 1.0
  */
public interface CustomHandler<T extends Throwable> {

	public boolean canHandle(final Object obj);

	public void handle(final T exception);

	public void handle(final T exception, final Listener<MessageBoxEvent> listener);
	
}
