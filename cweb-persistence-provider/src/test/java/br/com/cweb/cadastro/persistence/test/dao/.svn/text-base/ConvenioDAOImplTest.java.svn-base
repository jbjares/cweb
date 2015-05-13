package br.com.cweb.cadastro.persistence.test.dao;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import junit.framework.Assert;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import br.com.cweb.cadastro.persistence.dao.ConvenioDAO;
import br.com.cweb.cadastro.persistence.entity.Convenio;
import br.com.cweb.core.persistence.beanmodel.Paginador;
import br.com.cweb.core.persistence.beanmodel.ResultadoPaginado;
import br.com.cweb.core.persistence.exception.DaoException;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( {"classpath:cweb-persistence-test.xml", "classpath:hibernate-test.cfg.xml"})
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
public class ConvenioDAOImplTest {


	@Autowired
	private ConvenioDAO convenioDAO;

	
	@Test
	public void init(){
		Assert.assertNotNull("instancia do DAO não nula!", convenioDAO);
	}
	
	
	@Test
	public void testCrudConvenio() throws DaoException, IllegalAccessException, InvocationTargetException{
		
		Convenio convenioRestituicaoIR = createConvenio("RESTITUICAO DO IR");
		Long idResituicaoIr = convenioDAO.create(convenioRestituicaoIR);
		Assert.assertEquals("Id gerado e atribuida corretamente Restituicao", idResituicaoIr, convenioRestituicaoIR.getId());
		
		ResultadoPaginado<Convenio> resultadoInicial = convenioDAO.findByExample(new Paginador(0, 1), new Convenio());
		
		Convenio convenio = createConvenio("INSS");
		Long id = convenioDAO.create(convenio);
		
		Assert.assertEquals("Id gerado e atribuida corretamente", id, convenio.getId());
		
		Convenio convenioSalvo = convenioDAO.findById(id);
		Assert.assertEquals("Convenio recuperado pelo ID", convenioSalvo, convenio);		
		Assert.assertEquals("Verificando se mesmo nome atribuido", "INSS", convenioSalvo.getNome());
		
		Convenio convenioAlterdo = new Convenio();
		
		BeanUtils.copyProperties(convenioAlterdo, convenio);
		
		convenioAlterdo.setNome("DECIMO TERCEIRO");
		
		convenioDAO.update(convenioAlterdo);
		
		convenioSalvo = convenioDAO.findById(id);
		Assert.assertEquals("Convenio recuperado pelo ID", convenioSalvo, convenioAlterdo);		
		Assert.assertEquals("Verificando se mesmo nome atribuido", "DECIMO TERCEIRO", convenioSalvo.getNome());
		
		ResultadoPaginado<Convenio> resultadoTeste = convenioDAO.findByExample(new Paginador(0, 1), new Convenio());
		Assert.assertEquals("Verificando total de registros", resultadoInicial.getTotalRegistros().longValue()+1L, resultadoTeste.getTotalRegistros().longValue());
		
		convenioDAO.delete(convenioSalvo);
		Assert.assertTrue("Convenio do INSS removido com sucesso", true);
		
		resultadoTeste = convenioDAO.findByExample(new Paginador(0, 1), new Convenio());
		Assert.assertEquals("Verificando total de registros depois do delete", resultadoInicial.getTotalRegistros(), resultadoTeste.getTotalRegistros());
		
		convenioDAO.delete(convenioRestituicaoIR);
		Assert.assertTrue("Convenio do Restituição removido com sucesso", true);
	}


	private Convenio createConvenio(String nome) {
		Convenio convenio = new Convenio();
		convenio.setNome(nome);
		
		convenio.setPossuiCadastroAtivo(true);
		convenio.setDataHoraAtualizacao(new Date());
		convenio.setIdUsuarioAtualizador(9999L);
		
		return convenio;
	}
	
	
}
