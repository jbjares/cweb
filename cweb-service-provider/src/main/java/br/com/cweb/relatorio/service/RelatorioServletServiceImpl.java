package br.com.cweb.relatorio.service;

import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletContext;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.stereotype.Service;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import br.com.cweb.relatorio.to.RelatorioConstantes;

@Service("relatorioServletServiceImpl")
public class RelatorioServletServiceImpl implements ServletContextAware {
	
	private ServletContext servlet;

	public ServletContext getServlet() {
		return servlet;
	}

	public void setServletContext(ServletContext servletContext) {
		this.servlet = servletContext;
	}

	public ServletRequestAttributes obterAtributos() {
		return (ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes();
	}

	public void gerarRelatorio(List<?> result,String nomeRelatorio,String formato,Object filtro){
		obterAtributos().getRequest().setAttribute(RelatorioConstantes.NOME_RELATORIO,nomeRelatorio);
		obterAtributos().getRequest().setAttribute(RelatorioConstantes.TIPO_RELATORIO,formato);
		
		InputStream is = getClass().getResourceAsStream(nomeRelatorio+".jasper");
		byte[] bytes = null;
		
		try {
			bytes = JasperRunManager.runReportToPdf(is,null, new JRBeanCollectionDataSource(result));
		} 
		
		catch (JRException e) {
			throw new RuntimeException(e.getMessage(),e);
		}
		obterAtributos().getRequest().getSession().setAttribute(nomeRelatorio,bytes);
	}

}
