package br.com.cweb.view.seguranca.cadastrogrupoacesso.client.service;

import java.util.List;

import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.relatorio.to.TipoFormatoRelatorio;
import br.com.cweb.relatorio.to.TipoNomeRelatorio;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;

import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface CadastroGrupoAcessoServiceFacadeAsync{

	void retornaListaPaginadaGruposAcesso(PagingLoadConfig config, AsyncCallback<PagingLoadResult<GrupoAcesso>> callback);
	void recuperaGrupoAcesso(Long id, AsyncCallback<GrupoAcesso> callback);
	void incluirGrupoAcesso(GrupoAcesso grupoAcesso, AsyncCallback<GrupoAcesso> callback);
	void atualizarGrupoAcesso(GrupoAcesso grupoAcesso, AsyncCallback<GrupoAcesso> callback);
	void excluirGrupoAcesso(GrupoAcesso grupoAcesso, AsyncCallback<GrupoAcesso> callback);
	void gerarRelatorio(TipoNomeRelatorio nomeRelatorio,TipoFormatoRelatorio formato, AsyncCallback<Void> callback);
}
