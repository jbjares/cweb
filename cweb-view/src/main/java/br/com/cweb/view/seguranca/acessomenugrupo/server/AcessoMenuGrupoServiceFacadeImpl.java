package br.com.cweb.view.seguranca.acessomenugrupo.server;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.dozer.DozerBeanMapperSingletonWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.extjs.gxt.ui.client.data.BasePagingLoadResult;
import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.google.gwt.user.client.rpc.AsyncCallback;

import br.com.cweb.cadastro.persistence.entity.Estado;
import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.cadastro.service.AcessoService;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;
import br.com.cweb.mensagem.exception.MensagemException;
import br.com.cweb.mensagem.to.Mensagem;
import br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO;
import br.com.cweb.seguranca.persistence.entity.AcessoMenu;
import br.com.cweb.seguranca.persistence.entity.Funcionalidade;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;
import br.com.cweb.seguranca.persistence.entity.TipoPermissao;
import br.com.cweb.seguranca.persistence.entity.Usuario;
import br.com.cweb.view.seguranca.acessomenugrupo.client.service.AcessoMenuGrupoServiceFacade;


@Service("AcessoMenuGrupoServiceFacade")
public class AcessoMenuGrupoServiceFacadeImpl implements AcessoMenuGrupoServiceFacade{
    
	@Autowired
	private AcessoService acessoService;
	private static int PAGE_SIZE=5;
	
	public List<Funcionalidade> obterFuncionalidadesPorGrupoAcesso(Long idGrupoAcesso) {
		
		List<Funcionalidade> result = null;
		try {
			result = acessoService.obterFuncionalidadesPorGrupoAcesso(idGrupoAcesso);
		}
		catch (NenhumRegistroEncontradoException e) {
			throw new MensagemException(new Mensagem(e.getMessage()));
		}
		catch (DaoException e) {
			throw new MensagemException(new Mensagem(e.getMessage()));
		} 
		return result;
	}
	
	
	@SuppressWarnings("unchecked")
	public PagingLoadResult<Funcionalidade> retornaListaPaginadaFuncionalidades(PagingLoadConfig config,Long idModulo)  {
		
		List<Funcionalidade> funcionalidades = obterTodasFuncionalidadesUmModulo(idModulo);
		return getPagingLoadResultFuncionalidades(funcionalidades, config);
	}
	
	private PagingLoadResult getPagingLoadResultFuncionalidades(List lista,PagingLoadConfig config) {

		List funcionalidades = new ArrayList();
		int offset = config.getOffset();
		int limit = lista.size();

		if(config.getLimit() == 50){
			config.setLimit(PAGE_SIZE);
		}
		
		/**
		 * verifica se o proximo deslocamento e maior que o total de paginas, se
		 * for ele retorna o ultimo registro como limit da pagina.
		 **/
		if (config.getLimit() > 0) {
			limit = Math.min(offset + config.getLimit(), limit);
		}

		for (int i = config.getOffset(); i < limit; i++) {
			funcionalidades.add(lista.get(i));
		}
		return new BasePagingLoadResult<Pessoa>(funcionalidades, offset,
				lista.size());
	}
	
	public List<TipoPermissao> obterPermissoesPertencemFuncionalidade(Funcionalidade funcionalidade,GrupoAcesso grupoAcesso) {
		
		List<TipoPermissao> listaPermissoes = null;
		try {
			listaPermissoes = acessoService.obterPermissoesPertencemFuncionalidade(funcionalidade,grupoAcesso);
		}
		catch (DaoException e) {
			throw new MensagemException(new Mensagem(e.getMessage()));
		
		} catch (NenhumRegistroEncontradoException e) {
			
			listaPermissoes = new ArrayList<TipoPermissao>();
			return listaPermissoes;
		}
		
		return listaPermissoes;
	}

	public List<TipoPermissao> obterPermissoesNaoPertencemFuncionalidade(Funcionalidade funcionalidade,GrupoAcesso grupoAcesso) {
		
		List<TipoPermissao> listaPermissoes = null;
		try {
			listaPermissoes = acessoService.obterPermissoesNaoPertencemFuncionalidade(funcionalidade,grupoAcesso);
		}
		catch (DaoException e) {
			throw new MensagemException(new Mensagem(e.getMessage()));
		
		} catch (NenhumRegistroEncontradoException e) {
			throw new MensagemException(new Mensagem(e.getMessage()));
		}
		
		return listaPermissoes;
		
	}

	public void salvarPermissoesSelecionadas (
			List<TipoPermissao> listaPermissoes, GrupoAcesso grupoAcesso,
			Funcionalidade funcionalidade, Usuario usuario) throws MensagemException{
		
		try{
			acessoService.salvarPermissoesSelecionadas(listaPermissoes, grupoAcesso, funcionalidade, usuario);
		}
		catch (Exception e) {
			
			throw new MensagemException (new Mensagem(e.getMessage()));
		}
		
	}

	public List<Funcionalidade> obterFuncionalidadeTipoRotina(){
		
		List<Funcionalidade> funcionalidades = null;
		List<Funcionalidade> result = new ArrayList<Funcionalidade>();
		
		try {
			funcionalidades = acessoService.obterFuncionalidadeTipoRotina();
			for (Funcionalidade funcionalidade : funcionalidades) {
				if (funcionalidade == null) {
					continue;
				}
				result.add(DozerBeanMapperSingletonWrapper.getInstance().map(
						funcionalidade, Funcionalidade.class));
			} 
		} catch (NenhumRegistroEncontradoException e) {
			throw new MensagemException(new Mensagem(e.getMessage()));
		}
		catch (Exception e) {
			throw new MensagemException(new Mensagem(e.getMessage()));
		}
		
		return result;
	}

	public List<Funcionalidade> obterFuncionalidadeTipoModulo()	throws MensagemException {
		
		List<Funcionalidade> funcionalidades = null;
		List<Funcionalidade> result = new ArrayList<Funcionalidade>();
		try {
			funcionalidades = acessoService.obterFuncionalidadesTipoModulo();
			
			for (Funcionalidade funcionalidade : funcionalidades) {
				if (funcionalidade == null) {
					continue;
				}
				result.add(DozerBeanMapperSingletonWrapper.getInstance().map(
						funcionalidade, Funcionalidade.class));
			} 
			
		} catch (NenhumRegistroEncontradoException e) {
			throw new MensagemException(new Mensagem(e.getMessage()));
		}
		return result;
	}

	public List<Funcionalidade> obterTodasFuncionalidadesUmModulo(Long idModulo)throws MensagemException{
		
		List<Funcionalidade> funcionalidades = null;
		List<Funcionalidade> result = new ArrayList<Funcionalidade>();
		
		try {
			Integer modulo = Integer.parseInt(idModulo.toString());
			funcionalidades = acessoService.obterTodasFuncionalidadesUmModulo(modulo);
		
			for (Funcionalidade funcionalidade : funcionalidades) {
				if (funcionalidade == null) {
					continue;
				}
				result.add(DozerBeanMapperSingletonWrapper.getInstance().map(
						funcionalidade, Funcionalidade.class));
			}
		
		} catch (NenhumRegistroEncontradoException e) {
			throw new MensagemException(new Mensagem(e.getMessage()));
		}
		catch (Exception e) {
			throw new MensagemException(new Mensagem(e.getMessage()));
		}
		return result;
	}
	
	public List<TipoPermissao> obterPermissoesCadastradas(Funcionalidade funcionalidade)throws MensagemException{
	
		try{
			return acessoService.obterPermissoesCadastradas(funcionalidade);
		}
		catch (Exception e) {
			throw new MensagemException(new Mensagem(e.getMessage()));
		}
	}
}
