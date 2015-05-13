package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import br.com.cweb.cadastro.persistence.entity.Atribuicao;
import br.com.cweb.core.persistence.dao.AbstractHibernateDao;
import br.com.cweb.core.persistence.exception.DaoException;

public abstract class AtribuicaoDAO extends AbstractHibernateDao<Atribuicao, Long>{

	public abstract List<Atribuicao> findAll() throws DaoException;

	public abstract List<Atribuicao> findAllMenosGraduadas(Integer graduacaoBase)throws DaoException;
	
	public abstract List<Atribuicao> findAllMaisGraduadas(Integer graduacaoBase)throws DaoException;

	public abstract List<Atribuicao> findAllGraduadosEntreDoisExtremos(Integer graduacaoMaxima,Integer graduacaoMinima) throws DaoException;
	
	public abstract List<Atribuicao> findAll(String query)throws DaoException;
}
