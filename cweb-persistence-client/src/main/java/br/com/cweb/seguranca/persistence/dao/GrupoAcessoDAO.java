package br.com.cweb.seguranca.persistence.dao;

import java.util.List;

import br.com.cweb.core.persistence.dao.AbstractHibernateDao;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;

public abstract class GrupoAcessoDAO  extends AbstractHibernateDao<GrupoAcesso, Long>{

	public abstract List<GrupoAcesso> findAll() throws DaoException;

}
