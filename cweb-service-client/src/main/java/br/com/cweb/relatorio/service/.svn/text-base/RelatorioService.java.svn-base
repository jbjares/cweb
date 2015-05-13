package br.com.cweb.relatorio.service;

import br.com.cweb.cadastro.persistence.entity.Convenio;
import br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira;
import br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica;
import br.com.cweb.relatorio.to.TipoFormatoRelatorio;
import br.com.cweb.relatorio.to.TipoNomeRelatorio;

public interface RelatorioService {

	void gerarRelatorioCadastroGeral(PessoaFisicaJuridica pessoaFisicaJuridica, TipoNomeRelatorio nome, TipoFormatoRelatorio formato);
	void gerarRelatorioCadastroConvenio(Convenio convenio, TipoNomeRelatorio nome, TipoFormatoRelatorio formato);
	void gerarRelatorioCadastroGrupoAcesso(TipoNomeRelatorio nome, TipoFormatoRelatorio formato);
	void gerarRelatorioInstituicaoFinanceira(InstituicaoFinanceira instituicaoFinanceira, TipoNomeRelatorio nome, TipoFormatoRelatorio formato);
}
