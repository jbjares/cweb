package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira;
import br.com.cweb.core.persistence.dao.AbstractHibernateDao;
import br.com.cweb.core.persistence.exception.DaoException;

public abstract class InstituicaoFinanceiraDAO extends AbstractHibernateDao<InstituicaoFinanceira, Long>{

	public abstract List<InstituicaoFinanceira> findAll() throws DaoException;

	public abstract List<InstituicaoFinanceira> findAllBancos() throws DaoException;
	
	public abstract List<InstituicaoFinanceira> findAll(InstituicaoFinanceira instituicaoFinanceira) throws DaoException;

	public abstract List<InstituicaoFinanceira> findDependentesInstituicao(Long idInstituicaoFinanceira) throws DaoException;
}
