package br.com.cweb.cadastro.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cweb.cadastro.persistence.dao.InstituicaoFinanceiraDAO;
import br.com.cweb.cadastro.persistence.dao.PerfilComissaoDAO;
import br.com.cweb.cadastro.persistence.entity.ContaBancaria;
import br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira;
import br.com.cweb.cadastro.persistence.entity.PerfilComissao;
import br.com.cweb.cadastro.persistence.entity.TipoConta;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;
import br.com.cweb.core.persistence.exception.ValidationException;
import br.com.cweb.mensagem.to.Mensagem;
import br.com.cweb.seguranca.persistence.entity.Usuario;

@Service("instituicaoFinanceiraService")
@Transactional
public class InstituicaoFinanceiraServiceImpl implements
		InstituicaoFinanceiraService {

	@Autowired
	private InstituicaoFinanceiraDAO instituicaoDAO;

	@Autowired
	private PerfilComissaoDAO perfilComissaoDAO;

	@Autowired
	private AcessoService acessoService;
	
	public List<InstituicaoFinanceira> recuperarBancos() {
		try {
			return instituicaoDAO.findAllBancos();
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public List<TipoConta> recuperarTiposConta() {
		return Arrays.asList(TipoConta.values());
	}

	public List<PerfilComissao> recuperarPerfilComissao()
			throws NenhumRegistroEncontradoException {
		try {
			return perfilComissaoDAO.findAll();
		} catch (DaoException e) {
			throw new NenhumRegistroEncontradoException(e.getMessage(), e);
		}
	}

	public List<InstituicaoFinanceira> recuperarInstituicoes() {
		try {
			return instituicaoDAO.findAll();
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	
	public Long incluirInstituicao(InstituicaoFinanceira instituicaoFinanceira)throws ValidationException,DaoException {

		Usuario usuarioLogado = acessoService.obterUsuarioLogado();		
		instituicaoFinanceira.setIdUsuarioAtualizador(usuarioLogado.getId());
		
		InstituicaoFinanceira instituicaoTemp;
		instituicaoTemp = instituicaoDAO.findById(instituicaoFinanceira.getId());
				
		if(instituicaoTemp != null){
			throw new ValidationException(new Mensagem("Instituição já Cadastrada"));
		}
		
		return instituicaoDAO.create(instituicaoFinanceira);
		
	}

	public Boolean excluirInstituicao(Long idInstituicao) {

		try {
			Boolean retorno = verificarDependenciaInstituicaoFinanceira(idInstituicao);
			
			if(!retorno){
				instituicaoDAO.delete(instituicaoDAO.findById(idInstituicao));
				InstituicaoFinanceira instituicaFinanceira = instituicaoDAO.findById(idInstituicao);
				return instituicaFinanceira == null;
			}else{
				InstituicaoFinanceira instituicao = instituicaoDAO.findById(idInstituicao);
				instituicao.setPossuiCadastroAtivo(false);
				instituicaoDAO.update(instituicao);
				return true;				
			}				
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public InstituicaoFinanceira retornarInstituicao(Long idInstituicao) {
		try {
			return instituicaoDAO.findById(idInstituicao);
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
	
	public Boolean atualizaInstituicaoFinanceira(InstituicaoFinanceira instituicaoFinanceira){
		
		try {			
			Usuario usuarioLogado = acessoService.obterUsuarioLogado();
			
			instituicaoFinanceira.setIdUsuarioAtualizador(usuarioLogado.getId());
			
			instituicaoDAO.update(instituicaoFinanceira);
			InstituicaoFinanceira instituicao;
			instituicao = instituicaoDAO.findById(instituicaoFinanceira.getId());
			return instituicao != null;			
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}		
	}

	public List<InstituicaoFinanceira> retornarListaInstituicaoFinanceira(InstituicaoFinanceira instituicao) {
		try {
			List<InstituicaoFinanceira> retorno = instituicaoDAO.findAll(instituicao);
			return retorno;
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public Boolean verificarDependenciaInstituicaoFinanceira(Long idInstituicao) {
		try {
			List<InstituicaoFinanceira> listInstituicoes = instituicaoDAO.findDependentesInstituicao(idInstituicao);
			
			if(listInstituicoes == null){
				return false;
			}
			
			return !listInstituicoes.isEmpty();
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}		
	}
	
}
