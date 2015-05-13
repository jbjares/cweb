package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import br.com.cweb.cadastro.persistence.entity.Endereco;
import br.com.cweb.core.persistence.dao.AbstractHibernateDao;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;

public abstract class EnderecoDAO  extends AbstractHibernateDao<Endereco, Long>{

	public abstract List<Endereco> findAll() throws DaoException;
	public abstract Endereco findByIdPessoa(Long idPessoa)throws DaoException,NenhumRegistroEncontradoException;
	

}
