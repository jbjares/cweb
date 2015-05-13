package br.com.cweb.view.seguranca.acessorecurso.client.service;

import br.com.cweb.mensagem.exception.MensagemException;
import br.com.cweb.seguranca.persistence.entity.Funcionalidade;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;
import br.com.cweb.widgets.window.DefaultWindowConfig;
import br.com.cweb.widgets.window.IWindowConfig;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("springGwtServices/AcessoRecursoServiceFacade")
public interface AcessoRecursoServiceFacade extends RemoteService{
	
	public IWindowConfig getWindowConfig(String codigoFunc)throws MensagemException;
	public IWindowConfig getWindowConfig(String idFuncionalidade,String idGrupoAcesso)throws MensagemException;
	

}
