package br.com.cweb.view.cadastro.cadastroconvenio.client.service;

import br.com.cweb.cadastro.persistence.entity.Convenio;

import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface CadastroConvenioServiceFacadeAsync{

	void retornaListaPaginadaConvenio(PagingLoadConfig config, Convenio convenio, AsyncCallback<PagingLoadResult<Convenio>> callback);
	void recuperaConvenio(Long id, AsyncCallback<Convenio> callback);
	void salvarConvenio(Convenio convenio, AsyncCallback<Long> callback);
	void excluirConvenio(Convenio convenio, AsyncCallback<Void> callback);
	void gerarRelatorio(Convenio convenio, AsyncCallback<Void> callback);
}
