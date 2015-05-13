package br.com.cweb.view.desktop.client.contexto;

import com.extjs.gxt.ui.client.Registry;

import br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO;
import br.com.cweb.view.desktop.client.build.IWindowBulider;


/**
 * Classe para armazenar parametros comuns
 * para todo o sistema.
 * @author Sebastiao Nunes
 *
 */
public class WebApplication {

	private UsuarioLogadoDTO usuarioLogado;
	private String versao;
	private String ip;
	private static WebApplication instance = new WebApplication();
	
	
	public static WebApplication getInstance() {
		return instance;
	}

	public void setUsuarioLogado(UsuarioLogadoDTO usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}

	public UsuarioLogadoDTO getUsuarioLogado() {
		return usuarioLogado;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getVersao() {
		return versao;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getIp() {
		return ip;
	}
	
	public IWindowBulider getWindowBuilder() {
		return (IWindowBulider) Registry.get("windowBuilder");
	}
	
	
}
