package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Repository;

import br.com.cweb.cadastro.persistence.entity.PessoaJuridica;
import br.com.cweb.core.persistence.exception.DaoException;


@Repository("pessoaJuridicaDAO")
public class PessoaJuridicaDAOImpl   extends PessoaJuridicaDAO{


	@Override
	public PessoaJuridica findById(Long value) {
		return (PessoaJuridica) getHibernateTemplate().get(PessoaJuridica.class, value);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PessoaJuridica> findAll() throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(PessoaJuridica.class);
		return getHibernateTemplate().findByCriteria(criteria);
	}
}
