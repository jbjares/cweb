package br.com.cweb.view.seguranca.acessomenugrupo.client.service;

import java.util.List;

import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;
import br.com.cweb.mensagem.exception.MensagemException;
import br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO;
import br.com.cweb.seguranca.persistence.entity.AcessoMenu;
import br.com.cweb.seguranca.persistence.entity.Funcionalidade;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;
import br.com.cweb.seguranca.persistence.entity.TipoPermissao;
import br.com.cweb.seguranca.persistence.entity.Usuario;

import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("springGwtServices/AcessoMenuGrupoServiceFacade")
public interface AcessoMenuGrupoServiceFacade extends RemoteService{
	
	public PagingLoadResult<Funcionalidade> retornaListaPaginadaFuncionalidades(PagingLoadConfig config,Long idModulo); 
	public List<TipoPermissao> obterPermissoesPertencemFuncionalidade(Funcionalidade funcionalidade,GrupoAcesso grupoAcesso);
	public List<TipoPermissao> obterPermissoesNaoPertencemFuncionalidade(Funcionalidade funcionalidade,GrupoAcesso grupoAcesso);
	public void salvarPermissoesSelecionadas(List<TipoPermissao> listaPermissoes,GrupoAcesso grupoAcesso,Funcionalidade funcionalidade,Usuario usuario)
	throws MensagemException;
	public List<Funcionalidade> obterFuncionalidadeTipoRotina();
	public List<Funcionalidade> obterFuncionalidadeTipoModulo()throws MensagemException;
	public List<Funcionalidade> obterTodasFuncionalidadesUmModulo(Long idModulo)throws MensagemException;
	public List<TipoPermissao> obterPermissoesCadastradas(Funcionalidade funcionalidade)throws MensagemException;

}
