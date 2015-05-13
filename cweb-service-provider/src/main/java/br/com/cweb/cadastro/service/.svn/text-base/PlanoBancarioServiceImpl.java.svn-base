package br.com.cweb.cadastro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;

import br.com.cweb.cadastro.persistence.dao.ConvenioDAO;
import br.com.cweb.cadastro.persistence.entity.Convenio;
import br.com.cweb.core.persistence.beanmodel.Paginador;
import br.com.cweb.core.persistence.beanmodel.ResultadoPaginado;
import br.com.cweb.core.persistence.exception.DaoException;

@Service("planoBancarioService")
public class PlanoBancarioServiceImpl implements PlanoBancarioService {

	@Autowired
	private ConvenioDAO convenioDAO;
	
	public Convenio recuperarConvenio(Long idConvenio) {
		
		Convenio convenio = null;
		try {
			convenio = convenioDAO.findById(idConvenio);
		} catch (DaoException ex) {
			throw new RuntimeException(ex.getMessage(),ex);
		}
		
		return convenio;
	}
	

	public Long salvarConvenio(Convenio convenio) {
		Long id = convenio.getId();
		if (id == null){
			return convenioDAO.create(convenio);
		} else {
			convenioDAO.update(convenio);
			return id;
		}
	}
	
	public void excluirConvenio(Long idConvenio) {
		try {
			convenioDAO.delete(convenioDAO.findById(idConvenio));
			Convenio convenio = convenioDAO.findById(idConvenio);
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}


	public ResultadoPaginado<Convenio> retornaListaPaginadaConvenio(
			Paginador paginador, Convenio convenio) {
		return convenioDAO.findByExample(paginador, convenio);
	}

}
