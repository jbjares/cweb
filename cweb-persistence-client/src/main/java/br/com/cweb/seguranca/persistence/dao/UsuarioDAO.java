package br.com.cweb.seguranca.persistence.dao;

import java.util.List;

import br.com.cweb.core.persistence.dao.AbstractHibernateDao;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;
import br.com.cweb.seguranca.persistence.entity.Usuario;

public abstract class UsuarioDAO  extends AbstractHibernateDao<Usuario, Long>{

	public abstract List<Usuario> findAll();

	public abstract Usuario find(String login, String senha);

	public abstract Usuario find(String login);
 
	public abstract Usuario findByIdPessoa(Long idPessoa) throws DaoException, NenhumRegistroEncontradoException;
}
