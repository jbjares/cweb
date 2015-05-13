package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import br.com.cweb.cadastro.persistence.entity.PessoaFisica;
import br.com.cweb.core.persistence.dao.AbstractHibernateDao;
import br.com.cweb.core.persistence.exception.DaoException;

public abstract class PessoaFisicaDAO  extends AbstractHibernateDao<PessoaFisica, Long>{

	public abstract List<PessoaFisica> findAll() throws DaoException;

}
