package br.com.cweb.view.desktop.client.service;

import java.util.List;

import br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO;
import br.com.cweb.mensagem.exception.MensagemException;
import br.com.cweb.seguranca.persistence.entity.MenuDTO;
import br.com.cweb.seguranca.persistence.entity.Usuario;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("springGwtServices/DesktopService")
public interface DesktopService extends RemoteService{

	public void logoff();
	public Usuario obterUsuarioLogado();
	public String obterNomePessoa(Usuario usuario);
	public List<MenuDTO> getMenu()throws MensagemException;
	public UsuarioLogadoDTO getUsuarioLogado()throws MensagemException;
}
