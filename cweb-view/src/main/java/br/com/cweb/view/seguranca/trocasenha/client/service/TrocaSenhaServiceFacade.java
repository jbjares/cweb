package br.com.cweb.view.seguranca.trocasenha.client.service;

import br.com.cweb.seguranca.persistence.entity.Usuario;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("springGwtServices/TrocaSenhaServiceFacade")
public interface TrocaSenhaServiceFacade  extends RemoteService{

	public void alterarSenha(String senha);
	public String obterLoginPessoa();
	public Usuario obterUsuario();
}
