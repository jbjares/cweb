package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.cweb.cadastro.persistence.entity.ContaBancaria;
import br.com.cweb.cadastro.persistence.entity.Endereco;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;

@Repository("dadosBancariosDAO")
public class DadosBancariosDAOImpl  extends DadosBancariosDAO{

	@Override
	public ContaBancaria findById(Long value) {
		return (ContaBancaria) getHibernateTemplate().get(ContaBancaria.class, value);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ContaBancaria> findAll() throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(ContaBancaria.class);
		return getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public ContaBancaria findByIdPessoa(Long idPessoa) throws DaoException, NenhumRegistroEncontradoException {

		DetachedCriteria criteria = DetachedCriteria.forClass(ContaBancaria.class).add(Restrictions.eq("pessoa.id",idPessoa));
		if(!getHibernateTemplate().findByCriteria(criteria).isEmpty()){
			ContaBancaria contaBancaria = (ContaBancaria) getHibernateTemplate().findByCriteria(criteria).get(0);
			return contaBancaria; 
		}
		throw new NenhumRegistroEncontradoException("Nenhum registro encontrado para o filtro: "+ idPessoa);
	}

	

}
