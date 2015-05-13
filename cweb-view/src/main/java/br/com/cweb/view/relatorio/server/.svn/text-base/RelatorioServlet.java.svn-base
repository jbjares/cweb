package br.com.cweb.view.relatorio.server;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cweb.relatorio.to.RelatorioConstantes;

@SuppressWarnings("serial")
public class RelatorioServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		String nomeRelatorio = (String) request.getParameter(RelatorioConstantes.NOME_RELATORIO);
		String extensaoRelatorio = (String) request.getParameter(RelatorioConstantes.TIPO_RELATORIO);
		
		byte[] bytes = (byte[]) request.getSession().getAttribute(nomeRelatorio);
		
        if (bytes != null && bytes.length > 0) {  
        	response.setContentType("application/pdf");
        	response.setHeader("Content-disposition","attachment;filename="+nomeRelatorio+"."+extensaoRelatorio);
        	response.setContentLength(bytes.length); 
            ServletOutputStream ouputStream = response.getOutputStream();  
            ouputStream.write(bytes, 0, bytes.length);
            request.getSession().removeAttribute(nomeRelatorio);
            ouputStream.flush();  
            ouputStream.close();  
            response.flushBuffer();
        } 
			
	}
	
	
}
