package br.com.cweb.view.logging.server;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.Category;

public class LogFilter implements Filter{


	@SuppressWarnings("deprecation")
	private static final Category LOG=Category.getInstance(LogFilter.class); 


	public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {
		try{
			chain.doFilter(request, response);
		}
		catch(IOException e){
			log(e);
			throw e;
		}
		catch(ServletException e){
			log(e);
			throw e;
		}
		catch(RuntimeException e){
			log(e);
			throw e;
		}
		catch(Error e){
			log(e);
			throw e;
		}
		catch(Throwable e){
			log(e);
			throw new RuntimeException("Throwable relançado como RuntimeException pelo LogFilter",e);
		}
	}
	
	private void log(Throwable e){
		LOG.error("Erro capturado pelo LogFilter",e);
	}
	
	public void destroy() {}


	public void init(FilterConfig filterConfig) throws ServletException {}
	
}