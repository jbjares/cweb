package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Repository;

import br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar;
import br.com.cweb.core.persistence.exception.DaoException;

@Repository("arvoreFamiliarDAO")
public class ArvoreFamiliarDAOImpl extends ArvoreFamiliarDAO{

	@SuppressWarnings("unchecked")
	@Override
	public List<ArvoreFamiliar> findAll() throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(ArvoreFamiliar.class);
		return getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public ArvoreFamiliar findById(Long value) throws DaoException {
		return (ArvoreFamiliar) getHibernateTemplate().get(ArvoreFamiliar.class, value);
	}

}
