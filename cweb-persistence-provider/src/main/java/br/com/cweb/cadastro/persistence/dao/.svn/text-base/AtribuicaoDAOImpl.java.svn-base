package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.extjs.gxt.ui.client.widget.form.FormPanel.Method;

import br.com.cweb.cadastro.persistence.entity.Atribuicao;
import br.com.cweb.core.persistence.exception.DaoException;

@Repository("atribuicaoDAO")
public class AtribuicaoDAOImpl extends AtribuicaoDAO{

	@SuppressWarnings("unchecked")
	@Override
	public List<Atribuicao> findAll() throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(Atribuicao.class);
		return getHibernateTemplate().findByCriteria(criteria);	
	}

	@Override
	public Atribuicao findById(Long value) throws DaoException {
		return (Atribuicao) getHibernateTemplate().get(Atribuicao.class, value);
	}
	
	@Override
	public List<Atribuicao> findAllMaisGraduadas(Integer graduacaoBase) throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(Atribuicao.class);
		criteria.add(Restrictions.lt("codigoHierarquico", graduacaoBase));
		criteria.addOrder(Order.asc("codigoHierarquico"));
		return getHibernateTemplate().findByCriteria(criteria);	
	}
	
	@Override
	public List<Atribuicao> findAllMenosGraduadas(Integer graduacaoBase) throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(Atribuicao.class);
		if(new Integer(1).equals(graduacaoBase)){
			criteria.add(Restrictions.ge("codigoHierarquico", graduacaoBase));			
		}else{
			criteria.add(Restrictions.gt("codigoHierarquico", graduacaoBase));
		}
		criteria.addOrder(Order.asc("codigoHierarquico"));
		return getHibernateTemplate().findByCriteria(criteria);	
	}
	

	public List<Atribuicao> findAllGraduadosEntreDoisExtremos(Integer graduacaoMaxima,Integer graduacaoMinima) throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(Atribuicao.class);
			criteria.add(Restrictions.and(
					Restrictions.ge("codigoHierarquico", graduacaoMaxima),
					Restrictions.lt("codigoHierarquico", graduacaoMinima)));
		criteria.addOrder(Order.asc("codigoHierarquico"));
		return getHibernateTemplate().findByCriteria(criteria);	
	}

	@Override
	public List<Atribuicao> findAll(String query) throws DaoException {
		
		DetachedCriteria criteria = DetachedCriteria.forClass(Atribuicao.class);
		criteria.add(Restrictions.like("nome", query,MatchMode.ANYWHERE));
		List<Atribuicao> result=getHibernateTemplate().findByCriteria(criteria);
		return result.isEmpty()?null:result;
	}


}
