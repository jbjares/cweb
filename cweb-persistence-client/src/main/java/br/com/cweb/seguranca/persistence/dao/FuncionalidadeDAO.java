package br.com.cweb.seguranca.persistence.dao;

import java.util.List;
import br.com.cweb.core.persistence.dao.AbstractHibernateDao;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;
import br.com.cweb.seguranca.persistence.entity.Funcionalidade;

public abstract class FuncionalidadeDAO extends AbstractHibernateDao<Funcionalidade, Long>{
	
	public abstract List<Funcionalidade> findAll() throws DaoException, NenhumRegistroEncontradoException;
	public abstract List<Funcionalidade> obterFuncionalidadesTipoRotina() throws NenhumRegistroEncontradoException;
	public abstract List<Funcionalidade> obterFuncionalidadesTipoModulo(Integer tipo) throws NenhumRegistroEncontradoException;
	public abstract List<Funcionalidade> obterTodasFuncionalidadesUmModulo(Integer idFuncionalidade)throws NenhumRegistroEncontradoException;
}
