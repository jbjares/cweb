package br.com.cweb.cadastro.service;

import java.util.List;

import br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira;
import br.com.cweb.cadastro.persistence.entity.PerfilComissao;
import br.com.cweb.cadastro.persistence.entity.TipoConta;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;
import br.com.cweb.core.persistence.exception.ValidationException;
import br.com.cweb.mensagem.to.Mensagem;

public interface InstituicaoFinanceiraService {

	List<PerfilComissao> recuperarPerfilComissao()throws NenhumRegistroEncontradoException;

	List<TipoConta> recuperarTiposConta();

	List<InstituicaoFinanceira> recuperarBancos();
	
	List<InstituicaoFinanceira> recuperarInstituicoes();
	
	List<InstituicaoFinanceira> retornarListaInstituicaoFinanceira(InstituicaoFinanceira instituicao);
	
	Long incluirInstituicao(InstituicaoFinanceira instituicaoFinanceira)throws ValidationException,DaoException;
	
	Boolean excluirInstituicao(Long idInstituicao);
	
	InstituicaoFinanceira retornarInstituicao(Long idInstituicao);
	
	Boolean atualizaInstituicaoFinanceira(InstituicaoFinanceira instituicaoFinanceira);	
	
	Boolean verificarDependenciaInstituicaoFinanceira(Long idInstituicao);
}
