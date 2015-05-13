package br.com.cweb.view.cadastro.instituicaofinanceira.server;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapperSingletonWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extjs.gxt.ui.client.data.BasePagingLoadResult;
import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;

import br.com.cweb.cadastro.persistence.entity.Cidade;
import br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira;
import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.cadastro.service.InstituicaoFinanceiraService;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.ValidationException;
import br.com.cweb.mensagem.exception.MensagemException;
import br.com.cweb.mensagem.to.Mensagem;
import br.com.cweb.relatorio.service.RelatorioService;
import br.com.cweb.relatorio.to.TipoFormatoRelatorio;
import br.com.cweb.relatorio.to.TipoNomeRelatorio;
import br.com.cweb.view.cadastro.instituicaofinanceira.client.i18n.InstituicaoFinanceiraI18N;
import br.com.cweb.view.cadastro.instituicaofinanceira.client.service.InstituicaoFinanceiraServiceFacade;

@Service("InstituicaoFinanceiraServiceFacade")
@SuppressWarnings("unchecked")
public class InstituicaoFinanceiraServiceFacadeImpl  implements InstituicaoFinanceiraServiceFacade{
	
	@Autowired
	private InstituicaoFinanceiraService instituicaoFinanceiraService;
	
	@Autowired
	private RelatorioService relatorioService;

	public List<InstituicaoFinanceira> retornaListaInstituicaoFinanceira() {
		
		List<InstituicaoFinanceira> instituicoes = instituicaoFinanceiraService.recuperarInstituicoes();
		
		/*List<InstituicaoFinanceira> result = new ArrayList<InstituicaoFinanceira>();
		for (InstituicaoFinanceira instituicaoFinanceira : instituicoes) {
			if(instituicaoFinanceira == null){
				continue;
			}
			
			result.add(DozerBeanMapperSingletonWrapper.getInstance().map(
					instituicaoFinanceira, InstituicaoFinanceira.class));
		}	*/
		
		return instituicoes;
	}	

	public void gerarRelatorio(InstituicaoFinanceira instituicaoFinanceira, TipoNomeRelatorio nome, TipoFormatoRelatorio formato) {
		
		relatorioService.gerarRelatorioInstituicaoFinanceira(instituicaoFinanceira, nome, formato);		
	}	

	public Mensagem incluirInstituicaoFinanceira(InstituicaoFinanceira instituicaoFinanceira)throws MensagemException {
			
		try{
			instituicaoFinanceiraService.incluirInstituicao(instituicaoFinanceira);
			return new Mensagem("Instituicao Financeira cadastrada com sucesso!");
		}
		catch (ValidationException e) {
			throw new MensagemException(e.getListaMensagens());
		}
		catch (DaoException e) {
			throw new MensagemException(new Mensagem(e.getMessage()));
		}
	}

	public Boolean excluirInstituicaoFinanceira(Long idInstituicao) {
		
		return instituicaoFinanceiraService.excluirInstituicao(idInstituicao);
	}

	public InstituicaoFinanceira retornarInstituicaoFinanceira(Long idInstituicao) {
		
		InstituicaoFinanceira instituicaoFinanceira = instituicaoFinanceiraService.retornarInstituicao(idInstituicao); 
		
		/*if(instituicaoFinanceira == null){
			return null;
		}
		
		return DozerBeanMapperSingletonWrapper.getInstance().map(
				instituicaoFinanceira, InstituicaoFinanceira.class);*/		
		return instituicaoFinanceira;
	}

	public Boolean atualizarInstituicaoFinanceira(InstituicaoFinanceira instituicaoFinanceira) {
		
		Boolean result = instituicaoFinanceiraService.atualizaInstituicaoFinanceira(instituicaoFinanceira);
		return result;
	}
	
	
	public PagingLoadResult<InstituicaoFinanceira> retornaListaPaginadaInstituicaoFinanceira(
			PagingLoadConfig config, InstituicaoFinanceira instituicao) {
		
		List<InstituicaoFinanceira> result = instituicaoFinanceiraService.retornarListaInstituicaoFinanceira(instituicao);
		return getPagingLoadResult(result, config);		
	}
	
	
	private PagingLoadResult getPagingLoadResult(List lista,
			PagingLoadConfig config) {

		List pageInstituicoes = new ArrayList();
		int offset = config.getOffset();
		int limit = lista.size();

		/**
		 * verifica se o proximo deslocamento e maior que o total de paginas, se
		 * for ele retorna o ultimo registro como limit da pagina.
		 **/
		if (config.getLimit() > 0) {
			limit = Math.min(offset + config.getLimit(), limit);
		}

		for (int i = config.getOffset(); i < limit; i++) {
			pageInstituicoes.add(lista.get(i));
		}
		return new BasePagingLoadResult<Pessoa>(pageInstituicoes, offset,
				lista.size());
	}

	public Boolean verificarDependenciaDeInstituicaoFinanceira(Long idInstituicao) {		
		
		 return instituicaoFinanceiraService.verificarDependenciaInstituicaoFinanceira(idInstituicao);	
	}
}
