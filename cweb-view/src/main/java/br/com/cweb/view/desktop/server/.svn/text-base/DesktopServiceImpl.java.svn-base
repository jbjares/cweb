package br.com.cweb.view.desktop.server;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapperSingletonWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO;
import br.com.cweb.cadastro.service.AcessoService;
import br.com.cweb.mensagem.exception.MensagemException;
import br.com.cweb.mensagem.to.Mensagem;
import br.com.cweb.menu.service.MenuService;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;
import br.com.cweb.seguranca.persistence.entity.MenuDTO;
import br.com.cweb.seguranca.persistence.entity.Usuario;
import br.com.cweb.view.desktop.client.service.DesktopService;

@Service("DesktopService")
public class DesktopServiceImpl implements DesktopService{
	
	@Autowired
	private AcessoService acessoService;

	@Autowired
	private MenuService menuService;
	
	public Usuario obterUsuarioLogado(){
		Usuario usuario = acessoService.obterUsuarioLogado();
		if(usuario==null)return null;
		return DozerBeanMapperSingletonWrapper.getInstance().map(usuario,Usuario.class);
	}
	
	public void logoff(){
		acessoService.logoff();
	}

	public String obterNomePessoa(Usuario usuario) {
		return acessoService.obterNomePessoa(usuario);
	}
	
	public UsuarioLogadoDTO getUsuarioLogado()throws MensagemException{
		
		UsuarioLogadoDTO usuarioLogado = new UsuarioLogadoDTO();
		
		try{
			Usuario usuario = acessoService.obterUsuarioLogado();
			String nomeUsuario = acessoService.obterNomePessoa(usuario);
			usuarioLogado.setId(usuario.getId());
			usuarioLogado.setNome(nomeUsuario);
		}
		catch (Exception e) {
			throw new MensagemException(new Mensagem(e.getMessage()));
		}
		
		return usuarioLogado;
	}

	public List<MenuDTO> getMenu()throws MensagemException {
		
		GrupoAcesso grupoAcesso = acessoService.obterUsuarioLogado().getGupoAcesso();
		
		List<MenuDTO> result = new ArrayList<MenuDTO>();
		
			try {
				result = menuService.getMenu(grupoAcesso.getId());
			} catch (Exception e) {
				
				throw new MensagemException(new Mensagem(e.getMessage()));
			}
		
			return result;
	}
	
	
}
