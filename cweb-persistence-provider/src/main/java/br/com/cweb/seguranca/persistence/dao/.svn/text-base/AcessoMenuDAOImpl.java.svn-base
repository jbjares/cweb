package br.com.cweb.seguranca.persistence.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;
import br.com.cweb.seguranca.persistence.entity.AcessoMenu;
import br.com.cweb.seguranca.persistence.entity.Funcionalidade;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;

@Repository("acessoMenuDAO")
public class AcessoMenuDAOImpl extends AcessoMenuDAO{

	@Override
	public AcessoMenu findById(Long value) throws DaoException {
		return (AcessoMenu) getHibernateTemplate().get(AcessoMenu.class, value);
	}

	@Override
	public List<AcessoMenu> findByIdGrupoAcesso(Long idGrupoAcesso)throws DaoException, NenhumRegistroEncontradoException {
		
		DetachedCriteria criteria = DetachedCriteria.forClass(AcessoMenu.class).add(Restrictions.eq("grupoAcesso.id",idGrupoAcesso));
		if(!getHibernateTemplate().findByCriteria(criteria).isEmpty()){
			List<AcessoMenu> result = getHibernateTemplate().findByCriteria(criteria);
			return result; 
		}
		throw new NenhumRegistroEncontradoException("Nenhum registro encontrado para o filtro: "+ idGrupoAcesso);
		
	}

	@Override
	public AcessoMenu findByAcessoMenu(AcessoMenu acessoMenu) {
		
		DetachedCriteria criteria = DetachedCriteria.forClass(AcessoMenu.class).
		add(Restrictions.eq("grupoAcesso.id",acessoMenu.getGrupoAcesso().getId())).
		add(Restrictions.eq("permissao.id",acessoMenu.getPermissao().getId())).
		add(Restrictions.eq("funcionalidade.id",acessoMenu.getFuncionalidade().getId()));
		
		if(!getHibernateTemplate().findByCriteria(criteria).isEmpty()){
			List<AcessoMenu> result = getHibernateTemplate().findByCriteria(criteria);
			return result.get(0); 
		}
		
		return null;
	}
	
	@Override
	public List<AcessoMenu> findByIdFuncionalidade(Long idFuncionalidade)throws NenhumRegistroEncontradoException {
		
		DetachedCriteria criteria = DetachedCriteria.forClass(AcessoMenu.class).
		add(Restrictions.eq("funcionalidade.id",idFuncionalidade));
		
		if(!getHibernateTemplate().findByCriteria(criteria).isEmpty()){
			List<AcessoMenu> result = getHibernateTemplate().findByCriteria(criteria);
			return result; 
		}
		throw new NenhumRegistroEncontradoException("Dados não encontrados");
		
	}
	
	public List<AcessoMenu> obterAcessosPorFuncionalidadeGrupoAcesso(Funcionalidade funcionalidade,GrupoAcesso grupoAcesso) throws NenhumRegistroEncontradoException{
		
		DetachedCriteria criteria = DetachedCriteria.forClass(AcessoMenu.class).
		add(Restrictions.eq("grupoAcesso.id",grupoAcesso.getId())).
		add(Restrictions.eq("funcionalidade.id",funcionalidade.getId()));
		
		if(!getHibernateTemplate().findByCriteria(criteria).isEmpty()){
			List<AcessoMenu> result = getHibernateTemplate().findByCriteria(criteria);
			return result; 
		}
		throw new NenhumRegistroEncontradoException("Dados não encontrados");
	}

}
