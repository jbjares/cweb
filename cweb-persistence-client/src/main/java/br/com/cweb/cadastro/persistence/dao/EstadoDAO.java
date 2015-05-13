package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import br.com.cweb.cadastro.persistence.entity.Estado;
import br.com.cweb.core.persistence.dao.AbstractHibernateDao;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;

public abstract class EstadoDAO  extends AbstractHibernateDao<Estado, Long>{

	public abstract List<Estado> findAll() throws DaoException;

	public abstract Estado findBySigla(String sigla) throws DaoException, NenhumRegistroEncontradoException;
	
	public abstract List<Estado> findAll(String query)throws DaoException;
}
