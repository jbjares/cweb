package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Repository;

import br.com.cweb.cadastro.persistence.entity.PerfilComissao;
import br.com.cweb.core.persistence.exception.DaoException;


@Repository("perfilComissaoDAO")
public class PerfilComissaoDAOImpl  extends PerfilComissaoDAO{

	@Override
	public PerfilComissao findById(Long value) {
		return (PerfilComissao) getHibernateTemplate().get(PerfilComissao.class, value);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PerfilComissao> findAll() throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(PerfilComissao.class);
		return getHibernateTemplate().findByCriteria(criteria);
	}
}
