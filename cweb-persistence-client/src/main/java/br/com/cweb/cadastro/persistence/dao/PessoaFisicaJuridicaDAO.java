package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar;
import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica;
import br.com.cweb.core.persistence.dao.AbstractHibernateDao;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.seguranca.persistence.entity.Usuario;

public abstract class PessoaFisicaJuridicaDAO extends AbstractHibernateDao<PessoaFisicaJuridica, Long>{
	public abstract List<PessoaFisicaJuridica> findAll() throws DaoException;

	public abstract List<PessoaFisicaJuridica> findAllByCodigoAtribuicao(Long codigoTipoVinculacao, Usuario usuario)throws DaoException;
	
	public abstract List<PessoaFisicaJuridica> findAll(PessoaFisicaJuridica pessoaFisicaJuridica,Pessoa pessoaLogada) throws DaoException;

	public abstract PessoaFisicaJuridica findByCpfCnpj(String value) throws DaoException;
	
}
