package br.com.cweb.cadastro.persistence.dao;

import java.util.List;

import br.com.cweb.cadastro.persistence.entity.Convenio;
import br.com.cweb.core.persistence.beanmodel.Paginador;
import br.com.cweb.core.persistence.beanmodel.ResultadoPaginado;
import br.com.cweb.core.persistence.dao.AbstractHibernateDao;

public abstract class ConvenioDAO  extends AbstractHibernateDao<Convenio, Long>{

	public abstract ResultadoPaginado<Convenio> findByExample(Paginador paginador, Convenio convenio);

	public abstract List<Convenio> findAll(Convenio convenio);

}
