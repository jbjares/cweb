package br.com.cweb.view.desktop.client.service;

import java.util.List;

import br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO;
import br.com.cweb.seguranca.persistence.entity.MenuDTO;
import br.com.cweb.seguranca.persistence.entity.Usuario;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface DesktopServiceAsync{

	public void logoff(AsyncCallback<Void> callback);
	public void obterUsuarioLogado(AsyncCallback<Usuario> callback);
	public void obterNomePessoa(Usuario usuario, AsyncCallback<String> callback);
	public void getMenu(AsyncCallback<List<MenuDTO>> callback);
	public void getUsuarioLogado(AsyncCallback<UsuarioLogadoDTO> callback);
}
