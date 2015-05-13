package br.com.cweb.seguranca.persistence.dao;

import java.util.List;
import br.com.cweb.core.persistence.dao.AbstractHibernateDao;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;
import br.com.cweb.seguranca.persistence.entity.AcessoMenu;
import br.com.cweb.seguranca.persistence.entity.Funcionalidade;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;

public abstract class AcessoMenuDAO extends AbstractHibernateDao<AcessoMenu, Long>{

	public abstract List<AcessoMenu> findByIdGrupoAcesso(Long idGrupoAcesso) throws DaoException, NenhumRegistroEncontradoException;
	public abstract AcessoMenu findByAcessoMenu(AcessoMenu acessoMenu);
	public abstract List<AcessoMenu> findByIdFuncionalidade(Long idFuncionalidade)throws NenhumRegistroEncontradoException; 
	public abstract List<AcessoMenu> obterAcessosPorFuncionalidadeGrupoAcesso(Funcionalidade funcionalidade,GrupoAcesso grupoAcesso) throws NenhumRegistroEncontradoException;
}
