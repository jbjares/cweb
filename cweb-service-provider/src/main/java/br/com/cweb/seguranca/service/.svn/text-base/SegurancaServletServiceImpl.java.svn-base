package br.com.cweb.seguranca.service;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import br.com.cweb.cadastro.service.AcessoService;
import br.com.cweb.cadastro.service.to.RespostaEnumTO;
import br.com.cweb.seguranca.persistence.entity.Usuario;




@Service("segurancaServletServiceImpl")
public class SegurancaServletServiceImpl implements ServletContextAware {

	@Autowired
	private AcessoService acessoService;
	
	private ServletContext servlet;

	
	public String logarRedirecionando(Usuario usuario) {
		RespostaEnumTO retornoLogar = acessoService.logar(usuario);
		switch (retornoLogar) {
		
		case LOGADO:
			return enviarRespostaSucesso();

		case SENHA_INCORRETA:
			return enviarRespostaErro(1);

//		case RespostaEnumTO.RESETAR_SENHA:
//			return enviarRespostaSucesso();

		case LOGIN_INVALIDO:
			return enviarRespostaErro(2);

		case USUARIO_NAO_EXISTE_NO_BANCO:
			return enviarRespostaErro(3);

		case ACESSO_BLOQUEADO_POR_MULTIPLOS_ACESSOS:
			return enviarRespostaErro(4);

		case USUARIO_BLOQUEADO:
			return enviarRespostaErro(5);

		default:
			return enviarRespostaErro(1);
		}
	}

	public ServletRequestAttributes obterAtributos() {
		return (ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes();
	}
	
	public String getEnderecoIp(){
		return obterAtributos().getRequest().getRemoteAddr();
	}

	public void anularSessao(boolean criarSessao) {

		HttpServletRequest request = obterAtributos().getRequest();
		HttpSession sessao = request.getSession(criarSessao);

		if (sessao != null) {
			sessao.invalidate();
		}
	}

	public Usuario obterUsuarioNaSessao() {
		ServletRequestAttributes atributos = obterAtributos();
		if(atributos==null){
			return null;
		}
		return (Usuario) atributos.getRequest().getSession(false).getAttribute("usuario");
	}

	private String enviarRespostaErro(int erro) {

		return enviarResposta("/login.jsp", "erro=" + erro);
	}

	public void salvarUsuarioNaSessao(Usuario usuario) {
		ServletRequestAttributes attributes = obterAtributos();
		if (attributes != null) {
			attributes.getRequest().getSession().setAttribute("usuario",usuario);
		}
	}

	private String enviarRespostaSucesso() {
		return enviarResposta("/CwebViewDesktop.html");
	}

	private String enviarResposta(String url, String... args) {
		if (args.length > 0) {
			url += "?";
		}

		for (int i = 0; i < args.length; i++) {

			url += args[i];

			if (i < (args.length - 1)) {
				url += "&";
			}
		}

		ServletRequestAttributes attributes = obterAtributos();
		if (attributes != null) {
			return attributes.getRequest().getContextPath().replace("/login","")+ url;
		} else {
			return url;
		}
	}

	
	public ServletContext getServlet() {
		return servlet;
	}


	public void setServletContext(ServletContext servletContext) {
		this.servlet = servletContext;		
	}

	
}
