package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import br.com.cweb.cadastro.persistence.entity.PessoaJuridica;
import br.com.cweb.core.persistence.dao.AbstractHibernateDao;
import br.com.cweb.core.persistence.exception.DaoException;

public abstract class PessoaJuridicaDAO  extends AbstractHibernateDao<PessoaJuridica, Long>{

	public abstract List<PessoaJuridica> findAll() throws DaoException;

}
