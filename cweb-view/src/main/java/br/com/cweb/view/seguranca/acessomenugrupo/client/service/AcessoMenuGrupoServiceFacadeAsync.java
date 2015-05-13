package br.com.cweb.view.seguranca.acessomenugrupo.client.service;

import java.util.List;

import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;
import br.com.cweb.mensagem.exception.MensagemException;
import br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO;
import br.com.cweb.seguranca.persistence.entity.Funcionalidade;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;
import br.com.cweb.seguranca.persistence.entity.TipoPermissao;
import br.com.cweb.seguranca.persistence.entity.Usuario;

import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AcessoMenuGrupoServiceFacadeAsync {
	
	public void retornaListaPaginadaFuncionalidades(PagingLoadConfig config,Long idModulo,AsyncCallback callback);
	public void obterPermissoesPertencemFuncionalidade(Funcionalidade funcionalidade,GrupoAcesso grupoAcesso,AsyncCallback<List<TipoPermissao>> callback);
	public void obterPermissoesNaoPertencemFuncionalidade(Funcionalidade funcionalidade,GrupoAcesso grupoAcesso,AsyncCallback<List<TipoPermissao>> callback);
	public void salvarPermissoesSelecionadas(List<TipoPermissao> listaPermissoes,GrupoAcesso grupoAcesso,Funcionalidade funcionalidade,Usuario usuario,AsyncCallback callback);
	public void obterFuncionalidadeTipoRotina(AsyncCallback<List<Funcionalidade>> callback);
	public void obterFuncionalidadeTipoModulo(AsyncCallback<List<Funcionalidade>> callback)throws MensagemException;
	public void obterTodasFuncionalidadesUmModulo(Long idModulo,AsyncCallback<List<Funcionalidade>> callback)throws MensagemException;
	public void obterPermissoesCadastradas(Funcionalidade funcionalidade,AsyncCallback<List<TipoPermissao>> callback)throws MensagemException;

}
