package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.cweb.cadastro.persistence.entity.Estado;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;


@Repository("estadoDAO")
public class EstadoDAOImpl<T> extends EstadoDAO{

	@Override
	public Estado findById(Long value) throws DaoException {
		return (Estado) getHibernateTemplate().get(Estado.class, value);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Estado> findAll() throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(Estado.class);
		return getHibernateTemplate().findByCriteria(criteria);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Estado findBySigla(String sigla) throws DaoException, NenhumRegistroEncontradoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(Estado.class)
				.add(Restrictions.eq("sigla",sigla));
		if(!getHibernateTemplate().findByCriteria(criteria).isEmpty()){
			return (Estado) getHibernateTemplate().findByCriteria(criteria).get(0);
		}
		throw new NenhumRegistroEncontradoException("Nenhum registro encontrado para o filtro: "+sigla);
	}

	@Override
	public List<Estado> findAll(String query) throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(Estado.class);
		criteria.add(Restrictions.like("nome", query,MatchMode.ANYWHERE));
		List<Estado> result=getHibernateTemplate().findByCriteria(criteria);
		return result.isEmpty()?null:result;
	}

}
