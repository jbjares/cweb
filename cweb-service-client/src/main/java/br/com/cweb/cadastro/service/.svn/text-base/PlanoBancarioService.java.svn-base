package br.com.cweb.cadastro.service;

import br.com.cweb.cadastro.persistence.entity.Convenio;
import br.com.cweb.core.persistence.beanmodel.Paginador;
import br.com.cweb.core.persistence.beanmodel.ResultadoPaginado;

public interface PlanoBancarioService {

	//UC04 - Manter Convenio para Plano Bancario
	
	Long salvarConvenio(Convenio convenio);
	
	void excluirConvenio(Long idConvenio);
	
	Convenio recuperarConvenio(Long idConvenio);
	
	ResultadoPaginado<Convenio> retornaListaPaginadaConvenio(Paginador paginador, Convenio convenio);
	
	
	
}
