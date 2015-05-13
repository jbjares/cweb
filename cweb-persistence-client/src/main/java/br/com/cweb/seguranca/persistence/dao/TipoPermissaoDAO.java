package br.com.cweb.seguranca.persistence.dao;

import java.util.List;
import br.com.cweb.core.persistence.dao.AbstractHibernateDao;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;
import br.com.cweb.seguranca.persistence.entity.TipoPermissao;

public abstract class TipoPermissaoDAO extends AbstractHibernateDao<TipoPermissao, Long>{

	public abstract List<TipoPermissao> findAll()throws DaoException, NenhumRegistroEncontradoException;
}
