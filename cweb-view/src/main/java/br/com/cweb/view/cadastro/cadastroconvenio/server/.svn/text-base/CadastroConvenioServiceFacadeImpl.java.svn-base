package br.com.cweb.view.cadastro.cadastroconvenio.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cweb.cadastro.persistence.entity.Convenio;
import br.com.cweb.cadastro.service.AcessoService;
import br.com.cweb.cadastro.service.PlanoBancarioService;
import br.com.cweb.core.persistence.beanmodel.Paginador;
import br.com.cweb.core.persistence.beanmodel.ResultadoPaginado;
import br.com.cweb.relatorio.service.RelatorioService;
import br.com.cweb.relatorio.to.TipoFormatoRelatorio;
import br.com.cweb.relatorio.to.TipoNomeRelatorio;
import br.com.cweb.seguranca.persistence.entity.Usuario;
import br.com.cweb.view.cadastro.cadastroconvenio.client.service.CadastroConvenioServiceFacade;

import com.extjs.gxt.ui.client.data.BasePagingLoadResult;
import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;

@Service("CadastroConvenioServiceFacade")
public class CadastroConvenioServiceFacadeImpl implements
		CadastroConvenioServiceFacade {

	@Autowired
	private PlanoBancarioService planoBancarioService;

	@Autowired
	private AcessoService acessoService;

	@Autowired
	private RelatorioService relatorioService;
	
	private static final int PAGE_SIZE = 5;

	public Convenio recuperaConvenio(Long idConvenio) {
		Convenio convenio = planoBancarioService.recuperarConvenio(idConvenio);
		return convenio;
	}

	public Long salvarConvenio(Convenio convenio) {
		Usuario usuario = acessoService.obterUsuarioLogado();
		convenio.setIdUsuarioAtualizador(usuario.getId());
		return planoBancarioService.salvarConvenio(convenio);
	}

	public void excluirConvenio(Convenio convenio) {
		planoBancarioService.excluirConvenio(convenio.getId());
	}


	public PagingLoadResult<Convenio> retornaListaPaginadaConvenio(
			PagingLoadConfig config, Convenio convenio) {

		Paginador paginador = new Paginador();
		paginador.setIndiceRegistroInicial(config.getOffset());
		paginador.setRegistrosPorPagina(config.getLimit());

		ResultadoPaginado<Convenio> resultado = planoBancarioService.retornaListaPaginadaConvenio(paginador, convenio);
		
		return new BasePagingLoadResult<Convenio>(resultado.getResultado(),
				resultado.getPaginador().getIndiceRegistroInicial(), resultado.getTotalRegistros().intValue());
	}

	public void gerarRelatorio(Convenio convenio) {
		try{
			relatorioService.gerarRelatorioCadastroConvenio(convenio, TipoNomeRelatorio.CADASTRO_CONVENIO, TipoFormatoRelatorio.PDF);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
