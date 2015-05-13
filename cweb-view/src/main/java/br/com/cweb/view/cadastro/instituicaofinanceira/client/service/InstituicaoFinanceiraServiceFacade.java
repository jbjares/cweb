package br.com.cweb.view.cadastro.instituicaofinanceira.client.service;

import java.util.List;

import br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira;
import br.com.cweb.mensagem.exception.MensagemException;
import br.com.cweb.mensagem.to.Mensagem;
import br.com.cweb.relatorio.to.TipoFormatoRelatorio;
import br.com.cweb.relatorio.to.TipoNomeRelatorio;

import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.gwt.user.client.rpc.RemoteService;

@RemoteServiceRelativePath("springGwtServices/InstituicaoFinanceiraServiceFacade")
public interface InstituicaoFinanceiraServiceFacade extends RemoteService{
	
	public List<InstituicaoFinanceira> retornaListaInstituicaoFinanceira();	
	
	public void gerarRelatorio(InstituicaoFinanceira instituicaoFinanceira, TipoNomeRelatorio nome, TipoFormatoRelatorio formato);	
	
	public Mensagem incluirInstituicaoFinanceira(InstituicaoFinanceira instituicaoFinanceira)throws MensagemException;	

	public Boolean excluirInstituicaoFinanceira(Long idInstituicao);
	
	public InstituicaoFinanceira retornarInstituicaoFinanceira(Long idInstituicao);
	
	public Boolean atualizarInstituicaoFinanceira(InstituicaoFinanceira instituicaoFinanceira);
	
	public PagingLoadResult<InstituicaoFinanceira> retornaListaPaginadaInstituicaoFinanceira(PagingLoadConfig config, InstituicaoFinanceira instituicaoFinanceira);
	
	public Boolean verificarDependenciaDeInstituicaoFinanceira(Long idInstituicao);
}
