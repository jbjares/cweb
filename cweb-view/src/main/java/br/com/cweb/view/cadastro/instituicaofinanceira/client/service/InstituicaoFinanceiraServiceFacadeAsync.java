package br.com.cweb.view.cadastro.instituicaofinanceira.client.service;

import java.util.List;

import br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira;
import br.com.cweb.mensagem.exception.MensagemException;
import br.com.cweb.mensagem.to.Mensagem;
import br.com.cweb.relatorio.to.TipoFormatoRelatorio;
import br.com.cweb.relatorio.to.TipoNomeRelatorio;

import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface InstituicaoFinanceiraServiceFacadeAsync{
	
	public void retornaListaInstituicaoFinanceira(AsyncCallback<List<InstituicaoFinanceira>> callback);	
	
	public void gerarRelatorio(InstituicaoFinanceira instituicaoFinanceira, TipoNomeRelatorio nome, TipoFormatoRelatorio formato, AsyncCallback<Void> callback);	
	
	public void incluirInstituicaoFinanceira(InstituicaoFinanceira instituicaoFinanceira, AsyncCallback<Mensagem> callback)throws MensagemException;	

	public void excluirInstituicaoFinanceira(Long idInstituicao, AsyncCallback<Boolean> callback);
	
	public void retornarInstituicaoFinanceira(Long idInstituicao, AsyncCallback<InstituicaoFinanceira> callback);
	
	public void atualizarInstituicaoFinanceira(InstituicaoFinanceira instituicaoFinanceira, AsyncCallback<Boolean> callback);
	
	public void retornaListaPaginadaInstituicaoFinanceira(PagingLoadConfig config, InstituicaoFinanceira instituicaoFinanceira, AsyncCallback<PagingLoadResult<InstituicaoFinanceira>> callback);
	
	public void verificarDependenciaDeInstituicaoFinanceira(Long idInstituicao, AsyncCallback<Boolean> callback);
}
