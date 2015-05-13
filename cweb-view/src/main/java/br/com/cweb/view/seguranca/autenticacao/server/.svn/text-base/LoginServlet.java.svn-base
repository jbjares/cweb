package br.com.cweb.view.seguranca.autenticacao.server;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import br.com.cweb.seguranca.persistence.entity.Usuario;
import br.com.cweb.seguranca.service.SegurancaServletServiceImpl;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = -1766213353592050763L;

	private WebApplicationContext appContext;

	@Override
	public void init() throws ServletException {
		super.init();

		appContext = WebApplicationContextUtils
				.getRequiredWebApplicationContext(getServletContext());
	}

	public WebApplicationContext getAppContext() {
		return appContext;
	}

	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		
		Usuario usuario = new Usuario();
		usuario.setLogin(request.getParameter("j_username"));
		usuario.setSenha(request.getParameter("j_password"));

		if (request.getSession().getAttribute("gwt.codesvr") != null){
			String url = getAppContext().getBean(SegurancaServletServiceImpl.class).logarRedirecionando(usuario);
			response.sendRedirect(url + (url.contains("?") ? "&" : "?") +"gwt.codesvr="+ request.getSession().getAttribute("gwt.codesvr"));
		} else {
			response.sendRedirect(getAppContext().getBean(SegurancaServletServiceImpl.class).logarRedirecionando(usuario));
		}
	}
}