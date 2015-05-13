package br.com.cweb.core.persistence.dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import br.com.cweb.core.persistence.exception.DaoException;

public abstract class AbstractHibernateDao<T, K> {


	private HibernateTemplate hibernateTemplate;

	public AbstractHibernateDao() {}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Autowired
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@SuppressWarnings("unchecked")
	public K create(T bean){
		return (K) hibernateTemplate.save(bean);
	}

	public void update(T bean){
		hibernateTemplate.update(bean);
	}

	public void delete(T bean){
		hibernateTemplate.delete(bean);
	}
	
	public void refresh(T bean){
		hibernateTemplate.refresh(bean);
	}
	
	public boolean isEntityInPersistentContext(T bean) {		
		return getHibernateTemplate().contains(bean);
	}
	
	public Session getSession(){
		return getHibernateTemplate().getSessionFactory().getCurrentSession();
	}

	public abstract T findById(K value) throws DaoException;

}
