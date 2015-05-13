package br.com.cweb.widgets.action;

import br.com.cweb.widgets.erro.ExceptionManager;

import com.google.gwt.user.client.rpc.AsyncCallback;

public abstract class RpcCallback <T> implements AsyncCallback<T> {

	 private boolean done = false;
	    
	    public void onFailure(Throwable caught)
	    {
	    	try
	    	{
		        this.done = true;
		        ExceptionManager.handleException(caught);
	    	}
	    	finally
	    	{
	    		handleFailure(caught);
	    	}
	    	
	    }
	    
	    public void onSuccess(T result)
	    {
	        try
	        {
	            this.done = true;
	            handleResponse(result);
	        }
	        catch(Exception ex)
	        {
	            ex.printStackTrace();
	            onFailure(ex);
	        }
	    }
	    
	    /**
	     * Indica se o processamento ja foi concluido ou nao.
	     * @return boolean true caso o processamento tenha sido concluido e false caso contrario.
	     */
	    public boolean isDone() { return done; }
	    
	    /**
	     * Metodo para tratamento da resposta do servidor.
	     * @param value Objeto retornado apos o processamento.
	     */
	    public void handleResponse(final T value)
	    {
	    }
	    
	    /**
	     * Metodo para tratamento de erro do servidor. 
	     * @param exception Instancia da excecao lancada.
	     */
	    public void handleFailure(final Throwable exception) 
	    {
	    }
}
