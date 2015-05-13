package br.com.cweb.seguranca.persistence.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;


@Repository("grupoAcessoDAO")
public class GrupoAcessoDAOImpl extends GrupoAcessoDAO{

	@Override
	public GrupoAcesso findById(Long value) {
		return (GrupoAcesso) getHibernateTemplate().get(GrupoAcesso.class, value);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GrupoAcesso> findAll() throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(GrupoAcesso.class);
		criteria.addOrder(Order.asc("nome"));
		return getHibernateTemplate().findByCriteria(criteria);
	}
	
}
