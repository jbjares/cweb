package br.com.cweb.view.cadastro.cadastroconvenio.client.service;

import br.com.cweb.cadastro.persistence.entity.Convenio;
import br.com.cweb.relatorio.to.TipoFormatoRelatorio;
import br.com.cweb.relatorio.to.TipoNomeRelatorio;

import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("springGwtServices/CadastroConvenioServiceFacade")
public interface CadastroConvenioServiceFacade extends RemoteService{

	PagingLoadResult<Convenio> retornaListaPaginadaConvenio(PagingLoadConfig config, Convenio convenio);
	Convenio recuperaConvenio(Long id);
	Long salvarConvenio(Convenio convenio);
	void excluirConvenio(Convenio convenio);
	void gerarRelatorio(Convenio convenio);
}
