package br.com.cweb.view.seguranca.trocasenha.server;

import org.dozer.DozerBeanMapperSingletonWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.cweb.cadastro.service.AcessoService;
import br.com.cweb.seguranca.persistence.entity.Usuario;
import br.com.cweb.view.seguranca.trocasenha.client.service.TrocaSenhaServiceFacade;

@Service("TrocaSenhaServiceFacade")
public class TrocaSenhaServiceFacadeImpl implements TrocaSenhaServiceFacade{

	@Autowired
	private AcessoService acessoService;
	
	public void alterarSenha(String senha) {
		
		Usuario usuario = acessoService.obterUsuarioLogado();
		usuario.setSenha(senha);
		acessoService.alterarSenha(usuario);
	}

	public String obterLoginPessoa(){
		
		Usuario usuario = acessoService.obterUsuarioLogado();
		
		return usuario.getLogin();
	}

	public Usuario obterUsuario() {
		
		Usuario usuario = acessoService.obterUsuarioLogado();
		
		return DozerBeanMapperSingletonWrapper.getInstance().map(usuario,Usuario.class);
	}
	
	
}
