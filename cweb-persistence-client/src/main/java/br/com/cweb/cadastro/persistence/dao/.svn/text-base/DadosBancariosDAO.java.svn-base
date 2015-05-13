package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import br.com.cweb.cadastro.persistence.entity.ContaBancaria;
import br.com.cweb.core.persistence.dao.AbstractHibernateDao;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;

public abstract class DadosBancariosDAO extends AbstractHibernateDao<ContaBancaria, Long>{

	public abstract List<ContaBancaria> findAll() throws DaoException;
	public abstract ContaBancaria findByIdPessoa(Long idPessoa)throws DaoException, NenhumRegistroEncontradoException;
}
