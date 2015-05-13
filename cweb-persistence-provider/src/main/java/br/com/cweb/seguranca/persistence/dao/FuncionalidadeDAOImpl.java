package br.com.cweb.seguranca.persistence.dao;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;
import br.com.cweb.seguranca.persistence.entity.AcessoMenu;
import br.com.cweb.seguranca.persistence.entity.Funcionalidade;
import br.com.cweb.seguranca.persistence.entity.Usuario;

@Repository("funcionalidadeDAO")
public class FuncionalidadeDAOImpl extends FuncionalidadeDAO{

	@Override
	public List<Funcionalidade> findAll()throws DaoException, NenhumRegistroEncontradoException {
		
		DetachedCriteria criteria = DetachedCriteria.forClass(Funcionalidade.class);
		if(!getHibernateTemplate().findByCriteria(criteria).isEmpty()){
			List<Funcionalidade> result = getHibernateTemplate().findByCriteria(criteria);
			return result; 
		}
		throw new NenhumRegistroEncontradoException("Nenhum registro encontrado ");
	}

	@Override
	public Funcionalidade findById(Long value) throws DaoException {
		
		DetachedCriteria criteria = DetachedCriteria.forClass(Funcionalidade.class);
		criteria.add(Restrictions.eq("id", value));
		List<Funcionalidade> result=getHibernateTemplate().findByCriteria(criteria);
		return result.isEmpty()?null:result.get(0);
	}

	public List<Funcionalidade> obterFuncionalidadesTipoRotina() throws NenhumRegistroEncontradoException{
		
		DetachedCriteria criteria = DetachedCriteria.forClass(Funcionalidade.class).add(Restrictions.eq("tipoFuncionalidade",3));
		
		if(!getHibernateTemplate().findByCriteria(criteria).isEmpty()){
			List<Funcionalidade> result = getHibernateTemplate().findByCriteria(criteria);
			return result; 
		}
		
		throw new NenhumRegistroEncontradoException("Nenhum registro encontrado ");
	}
	
	public List<Funcionalidade> obterFuncionalidadesTipoModulo(Integer tipo) throws NenhumRegistroEncontradoException{
		
		DetachedCriteria criteria = DetachedCriteria.forClass(Funcionalidade.class).add(Restrictions.eq("tipoFuncionalidade",tipo));
		
		if(!getHibernateTemplate().findByCriteria(criteria).isEmpty()){
			List<Funcionalidade> result = getHibernateTemplate().findByCriteria(criteria);
			return result; 
		}
		
		throw new NenhumRegistroEncontradoException("Nenhum registro encontrado ");
	}

	public List<Funcionalidade> obterTodasFuncionalidadesUmModulo(Integer idFuncionalidade)throws NenhumRegistroEncontradoException{
		
		DetachedCriteria criteria = DetachedCriteria.forClass(Funcionalidade.class)
		.add(Restrictions.eq("paiFuncionalidade",idFuncionalidade));
		
		if(!getHibernateTemplate().findByCriteria(criteria).isEmpty()){
			List<Funcionalidade> result = getHibernateTemplate().findByCriteria(criteria);
			return result; 
		}
		
		throw new NenhumRegistroEncontradoException("Nenhum registro encontrado ");
		
	}
	
	

}
