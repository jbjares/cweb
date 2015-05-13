package br.com.cweb.relatorio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cweb.cadastro.persistence.dao.ConvenioDAO;
import br.com.cweb.cadastro.persistence.dao.InstituicaoFinanceiraDAO;
import br.com.cweb.cadastro.persistence.dao.PessoaDAO;
import br.com.cweb.cadastro.persistence.dao.PessoaFisicaJuridicaDAO;
import br.com.cweb.cadastro.persistence.entity.Convenio;
import br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira;
import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica;
import br.com.cweb.cadastro.service.AcessoService;
import br.com.cweb.cadastro.service.InstituicaoFinanceiraService;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.relatorio.to.TipoFormatoRelatorio;
import br.com.cweb.relatorio.to.TipoNomeRelatorio;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;
import br.com.cweb.seguranca.persistence.entity.Usuario;


@Service("relatorioService")
public class RelatorioServiceImpl implements RelatorioService{

	@Autowired
	private RelatorioServletServiceImpl relatorioServletServiceImpl;
	
	@Autowired
	private PessoaFisicaJuridicaDAO pessoaFisicaJuridicaDAO;
	
	@Autowired
	private AcessoService acessoService;	
	
	@Autowired
	private InstituicaoFinanceiraDAO instituicaoFinanceiraDAO;
	
	@Autowired
	private ConvenioDAO convenioDAO;

	public void gerarRelatorioCadastroGeral(
			PessoaFisicaJuridica pessoaFisicaJuridica, TipoNomeRelatorio nome,
			TipoFormatoRelatorio formato) {
		Usuario usuario = acessoService.obterUsuarioLogado();
		try {
			relatorioServletServiceImpl.gerarRelatorio(pessoaFisicaJuridicaDAO.findAll(pessoaFisicaJuridica,usuario.getPessoa()),nome.getNome(),formato.getExtensao(),pessoaFisicaJuridica);
			return;
		
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(),e);
		}
	}


	public void gerarRelatorioCadastroGrupoAcesso(TipoNomeRelatorio nome,TipoFormatoRelatorio formato) {
		List<GrupoAcesso> result = acessoService.recuperarGruposAcesso();
		relatorioServletServiceImpl.gerarRelatorio(result,nome.getNome(),formato.getExtensao(),null);
	}


	public void gerarRelatorioInstituicaoFinanceira(InstituicaoFinanceira instituicaoFinanceira,TipoNomeRelatorio nome, TipoFormatoRelatorio formato) {
		
		Usuario usuario = acessoService.obterUsuarioLogado();
		try {
			List<InstituicaoFinanceira> instituicoes = instituicaoFinanceiraDAO.findAll(instituicaoFinanceira);
			relatorioServletServiceImpl.gerarRelatorio(instituicoes, nome.getNome(), formato.getExtensao(), null);
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(),e);
		}		
	}
	
	public void gerarRelatorioCadastroConvenio(Convenio convenio, TipoNomeRelatorio nome, TipoFormatoRelatorio formato) {
		
		List<Convenio> convenios = convenioDAO.findAll(convenio);
		relatorioServletServiceImpl.gerarRelatorio(convenios, nome.getNome(), formato.getExtensao(), convenio);
		
	}
	
}
