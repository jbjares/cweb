package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.core.persistence.dao.AbstractHibernateDao;
import br.com.cweb.core.persistence.exception.DaoException;

public abstract class PessoaDAO  extends AbstractHibernateDao<Pessoa, Long>{

	public abstract List<Pessoa> findAll() throws DaoException;
	public abstract void updatePessoa(Pessoa pessoa)throws DaoException;

}
