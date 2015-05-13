package br.com.cweb.view.seguranca.acessorecurso.server;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cweb.cadastro.service.AcessoService;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;
import br.com.cweb.core.persistence.exception.ValidationException;
import br.com.cweb.mensagem.exception.MensagemException;
import br.com.cweb.mensagem.to.Mensagem;
import br.com.cweb.seguranca.persistence.entity.Funcionalidade;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;
import br.com.cweb.seguranca.persistence.entity.TipoPermissao;
import br.com.cweb.view.seguranca.acessorecurso.client.service.AcessoRecursoServiceFacade;
import br.com.cweb.widgets.window.DefaultWindowConfig;
import br.com.cweb.widgets.window.IWindow;
import br.com.cweb.widgets.window.IWindowConfig;

/**
 * 
 * @author Sebastiao Nunes.
 * @since 1.0
 *
 */


@Service("AcessoRecursoServiceFacade")
public class AcessoRecursoServiceFacadeImpl implements AcessoRecursoServiceFacade{

	@Autowired
	private AcessoService acessoService;
	
	public IWindowConfig getWindowConfig(String codigoFunc) {
		
		try {
			
			List<TipoPermissao> result = acessoService.obterPermissoes(codigoFunc);
			Map<String, Serializable> parameters = new HashMap<String, Serializable>();
			
			if(result != null && result.size() > 0){
				
				for(TipoPermissao permissao:result){
					parameters.put(permissao.getSigla(), Boolean.TRUE);
				}
			}
			
			parameters.put(IWindowConfig.CODIGO, codigoFunc);
			DefaultWindowConfig config = new DefaultWindowConfig(parameters);
			
			return config;
		}
		catch (NumberFormatException e) {
			throw new MensagemException(new Mensagem(e.getMessage()));
		}
		catch (NenhumRegistroEncontradoException e) {
			throw new MensagemException(new Mensagem(e.getMessage()));
		}
		
	}

	public IWindowConfig getWindowConfig(String idFuncionalidade,String idGrupoAcesso)throws MensagemException{
		
		try {
			
			Funcionalidade funcionalidade = new Funcionalidade();
			GrupoAcesso grupoAcesso = new GrupoAcesso();
			
			funcionalidade.setId(new Long(idFuncionalidade));
			grupoAcesso.setId(new Long(idGrupoAcesso));
			
			List<TipoPermissao> listaPermissoes = acessoService.obterPermissoes(funcionalidade,grupoAcesso);
			IWindowConfig windowConfig = loadWindowConfig(listaPermissoes, funcionalidade);
			return windowConfig; 
			
		} catch (NumberFormatException e) {
			throw new MensagemException(new Mensagem(e.getMessage()));
		} catch (NenhumRegistroEncontradoException e) {
			throw new MensagemException(new Mensagem(e.getMessage()));
		} catch (ValidationException e) {
			throw new MensagemException(new Mensagem(e.getMessage()));
		}catch(Exception e){
			throw new MensagemException(new Mensagem(e.getMessage()));
		}
	}
	
	private IWindowConfig loadWindowConfig(List<TipoPermissao> listaPermissoes,Funcionalidade funcionalidade){
		
		Map<String, Serializable> parameters = new HashMap<String, Serializable>();
		
		if(listaPermissoes != null && listaPermissoes.size() > 0){
			
			for(TipoPermissao permissao:listaPermissoes){
				parameters.put(permissao.getSigla(), Boolean.TRUE);
			}
		}
		
		parameters.put(IWindowConfig.CODIGO, funcionalidade.getId());
		DefaultWindowConfig config = new DefaultWindowConfig(parameters);
		
		return config;
	}
	
}
