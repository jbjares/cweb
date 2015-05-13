package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Repository;

import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.core.persistence.exception.DaoException;


@Repository("pessoaDAO")
public class PessoaDAOImpl extends PessoaDAO{

	@Override
	public Pessoa findById(Long value) {
		return (Pessoa) getHibernateTemplate().get(Pessoa.class, value);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pessoa> findAll() throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(Pessoa.class);
		return getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public void updatePessoa(Pessoa pessoa) throws DaoException {
		getHibernateTemplate().update(pessoa);
	}
	
	

}
