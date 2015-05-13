package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import br.com.cweb.cadastro.persistence.entity.Cidade;
import br.com.cweb.cadastro.persistence.entity.Estado;
import br.com.cweb.core.persistence.dao.AbstractHibernateDao;
import br.com.cweb.core.persistence.exception.DaoException;

public abstract class CidadeDAO extends AbstractHibernateDao<Cidade, Long>{

	public abstract List<Cidade> findAll() throws DaoException;

	public abstract List<Cidade> findAll(Estado estado) throws DaoException;

	public abstract List<Cidade> findAll(String query) throws DaoException;

}
