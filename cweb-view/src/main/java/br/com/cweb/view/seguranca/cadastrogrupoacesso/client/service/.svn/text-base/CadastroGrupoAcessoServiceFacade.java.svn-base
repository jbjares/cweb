package br.com.cweb.view.seguranca.cadastrogrupoacesso.client.service;

import java.util.List;

import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.relatorio.to.TipoFormatoRelatorio;
import br.com.cweb.relatorio.to.TipoNomeRelatorio;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;

import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("springGwtServices/CadastroGrupoAcessoServiceFacade")
public interface CadastroGrupoAcessoServiceFacade extends RemoteService{

	PagingLoadResult<GrupoAcesso> retornaListaPaginadaGruposAcesso(PagingLoadConfig config);
	GrupoAcesso recuperaGrupoAcesso(Long id);
	void incluirGrupoAcesso(GrupoAcesso grupoAcesso);
	void atualizarGrupoAcesso(GrupoAcesso grupoAcesso);
	void excluirGrupoAcesso(GrupoAcesso grupoAcesso);
	void gerarRelatorio(TipoNomeRelatorio nomeRelatorio,TipoFormatoRelatorio formato);
}
