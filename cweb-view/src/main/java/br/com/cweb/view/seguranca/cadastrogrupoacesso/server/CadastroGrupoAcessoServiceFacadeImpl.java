package br.com.cweb.view.seguranca.cadastrogrupoacesso.server;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapperSingletonWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extjs.gxt.ui.client.data.BasePagingLoadResult;
import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica;
import br.com.cweb.cadastro.service.AcessoService;
import br.com.cweb.relatorio.service.RelatorioService;
import br.com.cweb.relatorio.to.TipoFormatoRelatorio;
import br.com.cweb.relatorio.to.TipoNomeRelatorio;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;
import br.com.cweb.seguranca.persistence.entity.Usuario;
import br.com.cweb.view.seguranca.cadastrogrupoacesso.client.service.CadastroGrupoAcessoServiceFacade;

@Service("CadastroGrupoAcessoServiceFacade")
public class CadastroGrupoAcessoServiceFacadeImpl implements CadastroGrupoAcessoServiceFacade{

	@Autowired
	private AcessoService acessoService;
	
	@Autowired
	private RelatorioService relatorioService;
	
	private static final int PAGE_SIZE = 5;
	
	public List<GrupoAcesso> recuperarGruposAcesso() {
		List<GrupoAcesso> retorno = acessoService.recuperarGruposAcesso();
		List<GrupoAcesso> result = new ArrayList<GrupoAcesso>();
		for (GrupoAcesso grupoAcessoRetorno : retorno) {
			if (grupoAcessoRetorno == null) {
				continue;
			}
			GrupoAcesso grupoAcessoResult = DozerBeanMapperSingletonWrapper
					.getInstance().map(grupoAcessoRetorno, GrupoAcesso.class);
			result.add(grupoAcessoResult);
		}
		return result;
	}

	public PagingLoadResult<GrupoAcesso> retornaListaPaginadaGruposAcesso(
			PagingLoadConfig config) {
		List<GrupoAcesso> listaGruposAcesso = recuperarGruposAcesso();
		return getPagingLoadResult(listaGruposAcesso, config);
	}

	private PagingLoadResult getPagingLoadResult(List lista,
			PagingLoadConfig config) {

		List pageGruposAcesso = new ArrayList();
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
			pageGruposAcesso.add(lista.get(i));
		}
		return new BasePagingLoadResult<Pessoa>(pageGruposAcesso, offset,
				lista.size());
	}

	public GrupoAcesso recuperaGrupoAcesso(Long idGrupoAcesso) {
		
		GrupoAcesso grupoAcesso = acessoService.recuperarGrupoAcesso(idGrupoAcesso);
		return grupoAcesso;
	}

	public void atualizarGrupoAcesso(GrupoAcesso grupoAcesso){
		
		GrupoAcesso grupoAc = recuperaGrupoAcesso(grupoAcesso.getId());
		grupoAcesso.setPessoaResponsavel(grupoAc.getPessoaResponsavel());
		acessoService.atualizarGrupoAcesso(grupoAcesso);
	}
	public void incluirGrupoAcesso(GrupoAcesso grupoAcesso) {
		
		Usuario usuario = acessoService.obterUsuarioLogado();
		Pessoa pessoaResp = acessoService.obterPessoa(usuario);
		grupoAcesso.setPessoaResponsavel(pessoaResp);
		grupoAcesso.setIdUsuarioAtualizador(usuario.getIdUsuarioAtualizador());
		acessoService.incluirGrupoAcesso(grupoAcesso);
	}
	public void excluirGrupoAcesso(GrupoAcesso grupoAcesso){
		acessoService.excluirGrupoAcesso(grupoAcesso);
	}
	
	public void gerarRelatorio(TipoNomeRelatorio nome, TipoFormatoRelatorio formato) {
		
		relatorioService.gerarRelatorioCadastroGrupoAcesso(nome, formato);
	}

}
