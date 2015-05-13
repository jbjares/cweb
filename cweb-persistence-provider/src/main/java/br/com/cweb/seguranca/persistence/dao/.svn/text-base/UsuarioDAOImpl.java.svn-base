package br.com.cweb.seguranca.persistence.dao;



import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.cweb.cadastro.persistence.entity.Endereco;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;
import br.com.cweb.seguranca.persistence.entity.Usuario;


@Repository("usuarioDAO")
public class UsuarioDAOImpl extends UsuarioDAO{

	@Override
	public Usuario findById(Long value) throws DaoException {
		return getHibernateTemplate().get(Usuario.class,value);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> findAll(){
		DetachedCriteria criteria = DetachedCriteria.forClass(Usuario.class);
		return getHibernateTemplate().findByCriteria(criteria);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Usuario find(String login, String senha) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Usuario.class);
		criteria.add(Restrictions.and(Restrictions.eq("login", login),Restrictions.eq("senha", senha)));
		List<Usuario> result=getHibernateTemplate().findByCriteria(criteria);
		return result.isEmpty()?null:result.get(0);
	}

	@Override
	public Usuario find(String login) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Usuario.class);
		criteria.add(Restrictions.eq("login", login));
		List<Usuario> result=getHibernateTemplate().findByCriteria(criteria);
		return result.isEmpty()?null:result.get(0);
	}
	
	@Override
	public Usuario findByIdPessoa(Long idPessoa) throws NenhumRegistroEncontradoException{
		
		DetachedCriteria criteria = DetachedCriteria.forClass(Usuario.class).add(Restrictions.eq("pessoa.id",idPessoa));
		if(!getHibernateTemplate().findByCriteria(criteria).isEmpty()){
			Usuario usuario = (Usuario) getHibernateTemplate().findByCriteria(criteria).get(0);
			return usuario; 
		}
		throw new NenhumRegistroEncontradoException("Nenhum registro encontrado para o filtro: "+ idPessoa);
	}
}
 