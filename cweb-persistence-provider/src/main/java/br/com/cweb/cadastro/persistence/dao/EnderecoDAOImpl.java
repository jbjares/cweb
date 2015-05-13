package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.cweb.cadastro.persistence.entity.Endereco;
import br.com.cweb.cadastro.persistence.entity.Estado;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;

@Repository("enderecoDAO")
public class EnderecoDAOImpl  extends EnderecoDAO{
	
	@Override
	public Endereco findById(Long value) {
		return (Endereco) getHibernateTemplate().get(Endereco.class, value);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Endereco> findAll() throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(Endereco.class);
		return getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public Endereco findByIdPessoa(Long idPessoa)throws DaoException, NenhumRegistroEncontradoException {
		
		DetachedCriteria criteria = DetachedCriteria.forClass(Endereco.class).add(Restrictions.eq("pessoa.id",idPessoa));
		if(!getHibernateTemplate().findByCriteria(criteria).isEmpty()){
			Endereco endereco = (Endereco) getHibernateTemplate().findByCriteria(criteria).get(0);
			return endereco; 
		}
		throw new NenhumRegistroEncontradoException("Nenhum registro encontrado para o filtro: "+ idPessoa);
	}

}
