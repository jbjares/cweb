package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.cweb.cadastro.persistence.entity.Atribuicao;
import br.com.cweb.cadastro.persistence.entity.Cidade;
import br.com.cweb.cadastro.persistence.entity.Estado;
import br.com.cweb.core.persistence.exception.DaoException;

@Repository("cidadeDAO")
public class CidadeDAOImpl extends CidadeDAO{

	@Override
	public Cidade findById(Long value)  {
		return (Cidade) getHibernateTemplate().get(Cidade.class, value);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Cidade> findAll() throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(Cidade.class);
		return getHibernateTemplate().findByCriteria(criteria);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cidade> findAll(Estado estado) throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(Cidade.class);
		criteria.add(Restrictions.eq("estado.id",estado.getId()));
		return getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public List<Cidade> findAll(String query) throws DaoException {
		
		DetachedCriteria criteria = DetachedCriteria.forClass(Cidade.class);
		criteria.add(Restrictions.like("nome", query,MatchMode.ANYWHERE));
		List<Cidade> result=getHibernateTemplate().findByCriteria(criteria);
		return result.isEmpty()?null:result;
	}
}
