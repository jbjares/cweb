package br.com.cweb.core.persistence.util;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.impl.CriteriaImpl;
import org.hibernate.transform.ResultTransformer;

import br.com.cweb.core.persistence.beanmodel.Ordenacao;
import br.com.cweb.core.persistence.beanmodel.Paginador;
import br.com.cweb.core.persistence.beanmodel.ResultadoPaginado;


public class HibernateUtils {
	private HibernateUtils(){
		
	}
	
	@SuppressWarnings("unchecked")
	public static <T> List<T> executarDetachedCriteria(Session session,DetachedCriteria detachedCriteria,Paginador paginador,Ordenacao...ordenacoes){
		Criteria criteria=detachedCriteria.getExecutableCriteria(session);
		return executarCriteria(criteria, paginador, ordenacoes);
	}
		
	@SuppressWarnings("unchecked")
	public static <T> List<T> executarCriteria(Criteria criteria,Paginador paginador,Ordenacao...ordenacoes){
		ResultadoPaginado<Object> pagina = getResultadoPaginado(criteria, paginador, ordenacoes);
		return (List<T>) pagina.getResultado();
	}
	
	public static <T> ResultadoPaginado<T> getResultadoPaginado(Session session,DetachedCriteria detachedCriteria,Paginador paginador,Ordenacao... ordenacoes){
		List<T> l=executarDetachedCriteria(session, detachedCriteria, paginador,ordenacoes);
		return new ResultadoPaginado<T>(l,paginador);
	}
	
	public static <T> ResultadoPaginado<T> getResultadoPaginado(Criteria criteria,Paginador paginador,Ordenacao... ordenacoes){
		
		ResultadoPaginado resultado = new ResultadoPaginado<T>();
		resultado.setPaginador(paginador);
		
		if(paginador==null){
			adicionarOrdenacoes(criteria,ordenacoes);
			List<T> lista = (List<T>)criteria.list();
			resultado.setResultado(lista);
			resultado.setTotalRegistros(new Long(lista.size()));
			return resultado;
		}		
		
		//guardando a projection e o resultTransformer
		Projection originalProjection = ((CriteriaImpl)criteria).getProjection();
	    ResultTransformer originalResultTransformer = ((CriteriaImpl)criteria).getResultTransformer();
	    
		//alterando a projection. Isso também altera o resultTransformer como efeito colateral
	    criteria.setProjection(Projections.rowCount());
	    
	    Long total = (Long) criteria.uniqueResult();
	    resultado.setTotalRegistros(total);
		if(total==0){
			resultado.setResultado(Collections.emptyList());
			return resultado;
		}
		
		//restaurando a projection e o resultTransformer
		criteria.setProjection(originalProjection);
		criteria.setResultTransformer(originalResultTransformer);
		
		adicionarOrdenacoes(criteria,ordenacoes);
		criteria.setMaxResults(paginador.getRegistrosPorPagina());
		criteria.setFirstResult(paginador.getIndiceRegistroInicial());
		List<T> l = (List<T>)criteria.list();
		
		
		if (l==null || l == Collections.EMPTY_LIST ){
			l = new ArrayList<T>();
		}
		
		resultado.setResultado(l);
		
		return resultado;
	}
	
	private static Criteria adicionarOrdenacoes(Criteria c,Ordenacao... ordenacoes){
		if(ordenacoes==null || ordenacoes.length==0){
			return c;
		}
		for(Ordenacao o:ordenacoes){
			c.addOrder(o.isAsc()?Order.asc(o.getAtributo()):Order.desc(o.getAtributo()));
		}
		return c;
	}
}