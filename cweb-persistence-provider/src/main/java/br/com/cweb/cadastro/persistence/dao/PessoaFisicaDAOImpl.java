package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Repository;

import br.com.cweb.cadastro.persistence.entity.PessoaFisica;
import br.com.cweb.core.persistence.exception.DaoException;


@Repository("pessoaFisicaDAO")
public class PessoaFisicaDAOImpl   extends PessoaFisicaDAO{


	@Override
	public PessoaFisica findById(Long value) {
		return (PessoaFisica) getHibernateTemplate().get(PessoaFisica.class, value);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PessoaFisica> findAll() throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(PessoaFisica.class);
		return getHibernateTemplate().findByCriteria(criteria);
	}
}
