package br.com.cweb.widgets.action;

import com.extjs.gxt.ui.client.widget.MessageBox;

public abstract class RpcWaitCallback <T> extends RpcCallback<T> {

	private MessageBox box;
	
	public RpcWaitCallback(String message, String waitText){
		box = MessageBox.wait("CWEB", message, waitText);
	}
	
	public RpcWaitCallback(String message){
		this(message, "Carregando...");
	}
	
	public RpcWaitCallback(){
		this("");
	}
	
	public final void onSuccess(T result) {
		box.close();
		super.onSuccess(result);
	};
	
	@Override
	public final void onFailure(Throwable caught) {
		box.close();
		super.onFailure(caught);
	}

}
