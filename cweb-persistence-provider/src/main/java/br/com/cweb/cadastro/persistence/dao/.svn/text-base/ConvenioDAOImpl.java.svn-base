package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.stereotype.Repository;

import br.com.cweb.cadastro.persistence.entity.Convenio;
import br.com.cweb.core.persistence.beanmodel.Ordenacao;
import br.com.cweb.core.persistence.beanmodel.Paginador;
import br.com.cweb.core.persistence.beanmodel.ResultadoPaginado;
import br.com.cweb.core.persistence.util.HibernateUtils;


@Repository("convenioDAO")
public class ConvenioDAOImpl extends ConvenioDAO{

	@Override
	public Convenio findById(Long value) {
		return (Convenio) getHibernateTemplate().get(Convenio.class, value);
	}

	@Override
	public ResultadoPaginado<Convenio> findByExample(final Paginador paginador, final	Convenio convenio) {
		
		return getHibernateTemplate().execute(new HibernateCallback<ResultadoPaginado<Convenio>>() {

            public ResultadoPaginado<Convenio> doInHibernate(Session session) {
            	
        		Criteria criteria = session.createCriteria(Convenio.class);
        		
        		if (convenio.getId() != null) criteria.add(Restrictions.eq("id", convenio.getId()));
        		if (convenio.getNome() != null) criteria.add(Restrictions.like("nome", '%' + convenio.getNome() + '%').ignoreCase());
        		if (convenio.getPossuiCadastroAtivo() != null) criteria.add(Restrictions.like("possuiCadastroAtivo", convenio.getPossuiCadastroAtivo()));
        		
        		return HibernateUtils.getResultadoPaginado(criteria, paginador, new Ordenacao[]{});
            }
        });
		
	}

	@Override
	public List<Convenio> findAll(Convenio convenio) {
		ResultadoPaginado<Convenio> resultado = this.findByExample(null, convenio);
		return resultado.getResultado();
	}

}
