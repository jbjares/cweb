package br.com.cweb.view.seguranca.acessorecurso.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AcessoRecursoServiceFacadeAsync{
	
	public void getWindowConfig(String codigoFunc, AsyncCallback callback);
	public void getWindowConfig(String idFuncionalidade,String idGrupoAcesso,AsyncCallback callback);
		
	

}
