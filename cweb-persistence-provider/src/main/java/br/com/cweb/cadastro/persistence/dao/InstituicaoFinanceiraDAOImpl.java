package br.com.cweb.cadastro.persistence.dao;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.springframework.stereotype.Repository;

import br.com.cweb.cadastro.persistence.entity.ContaBancaria;
import br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira;
import br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica;
import br.com.cweb.cadastro.persistence.entity.TipoInstituicao;
import br.com.cweb.core.persistence.exception.DaoException;

@Repository("instituicaoFinanceiraDAO")
public class InstituicaoFinanceiraDAOImpl extends InstituicaoFinanceiraDAO{

	@Override
	public InstituicaoFinanceira findById(Long value){
		return (InstituicaoFinanceira) getHibernateTemplate().get(InstituicaoFinanceira.class, value);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<InstituicaoFinanceira> findAll() throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(InstituicaoFinanceira.class);
		return getHibernateTemplate().findByCriteria(criteria);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<InstituicaoFinanceira> findAllBancos() throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(InstituicaoFinanceira.class)
				.add(Restrictions.eq("tipoInstituicao",TipoInstituicao.BANCO));
		return getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public List<InstituicaoFinanceira> findAll(
			InstituicaoFinanceira instituicaoFinanceira) throws DaoException {

		DetachedCriteria criteria = DetachedCriteria.forClass(InstituicaoFinanceira.class);
		List<InstituicaoFinanceira> retorno = new LinkedList<InstituicaoFinanceira>();
		
		if(instituicaoFinanceira.getId() != null){
			criteria.add(Restrictions.eq("id", instituicaoFinanceira.getId()));			
		}
		
		if(instituicaoFinanceira.getNome() != null){
			criteria.add(Restrictions.ilike("nome", instituicaoFinanceira.getNome(), MatchMode.START));			
		}
		
		if(instituicaoFinanceira.getSigla() != null){
			criteria.add(Restrictions.ilike("sigla", instituicaoFinanceira.getSigla(), MatchMode.START));
		}
		
		if(instituicaoFinanceira.getPossuiCadastroAtivo() != null){
			criteria.add(Restrictions.eq("possuiCadastroAtivo", instituicaoFinanceira.getPossuiCadastroAtivo()));
		}
		
		if(instituicaoFinanceira.getTipoInstituicao() != null){
			criteria.add(Restrictions.eq("tipoInstituicao", instituicaoFinanceira.getTipoInstituicao()));
		}
			
		retorno = getHibernateTemplate().findByCriteria(criteria);	
		
		return retorno;
	}

	@Override
	public List<InstituicaoFinanceira> findDependentesInstituicao(
			Long idInstituicaoFinanceira) throws DaoException {		
		
		List<InstituicaoFinanceira> retorno = new LinkedList<InstituicaoFinanceira>();
		
		DetachedCriteria criteria = DetachedCriteria.forClass(ContaBancaria.class);
		criteria.add(Restrictions.eq("banco", findById(idInstituicaoFinanceira)));
		
		retorno = getHibernateTemplate().findByCriteria(criteria);
		return retorno;
	}


}
