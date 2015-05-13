package br.com.cweb.seguranca.persistence.dao;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Repository;

import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;
import br.com.cweb.seguranca.persistence.entity.TipoPermissao;

@Repository("tipoPermissaoDAO")
public class TipoPermissaoDAOImpl extends TipoPermissaoDAO {

	@Override
	public List<TipoPermissao> findAll() throws DaoException,
			NenhumRegistroEncontradoException {


		DetachedCriteria criteria = DetachedCriteria.forClass(TipoPermissao.class);
		if(!getHibernateTemplate().findByCriteria(criteria).isEmpty()){
			List<TipoPermissao> result = getHibernateTemplate().findByCriteria(criteria);
			return result; 
		}
		throw new NenhumRegistroEncontradoException("Nenhum registro encontrado ");
	}

	@Override
	public TipoPermissao findById(Long value) throws DaoException {
		
		TipoPermissao permissao = findById(value);
		return permissao;
	}

}
