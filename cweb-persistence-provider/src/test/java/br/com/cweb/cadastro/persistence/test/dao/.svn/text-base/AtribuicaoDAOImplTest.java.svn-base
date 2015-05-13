package br.com.cweb.cadastro.persistence.test.dao;

import java.util.List;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import br.com.cweb.cadastro.persistence.dao.AtribuicaoDAO;
import br.com.cweb.cadastro.persistence.entity.Atribuicao;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.seguranca.persistence.dao.UsuarioDAO;
import br.com.cweb.seguranca.persistence.entity.Usuario;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( {"classpath:cweb-persistence-test.xml", "classpath:hibernate-test.cfg.xml"})
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
public class AtribuicaoDAOImplTest extends TestCase{
	
	
	@Autowired
	private AtribuicaoDAO atribuicaoDAO;
	
	@Test
	public void init(){
		Assert.assertNotNull(atribuicaoDAO);
	}
	
	@Test
	public void testComboAtribuicaoComUsuarioMatriz() throws Exception{
		List<Atribuicao> atribuicoes = atribuicaoDAO.findAllMenosGraduadas(1);
		Assert.assertEquals(6,atribuicoes.size());
		Assert.assertEquals(new Integer(1),atribuicoes.get(0).getCodigoHierarquico());
		Assert.assertEquals(new Integer(2),atribuicoes.get(1).getCodigoHierarquico());
		Assert.assertEquals(new Integer(3),atribuicoes.get(2).getCodigoHierarquico());
		Assert.assertEquals(new Integer(4),atribuicoes.get(3).getCodigoHierarquico());
		Assert.assertEquals(new Integer(5),atribuicoes.get(4).getCodigoHierarquico());
		Assert.assertEquals(new Integer(6),atribuicoes.get(5).getCodigoHierarquico());
	}

	@Test
	public void testComboAtribuidoAComUsuarioMatrizEAtribuicaoSubParaCliente() throws Exception{
		List<Atribuicao> atribuicoes = atribuicaoDAO.findAllGraduadosEntreDoisExtremos(1,2);
		Assert.assertEquals(1,atribuicoes.size());
		Assert.assertEquals(new Integer(1),atribuicoes.get(0).getCodigoHierarquico());
	}
	
	@Test
	public void testComboAtribuidoAComUsuarioMatrizEAtribuicaoBaseParaCliente() throws Exception{
		List<Atribuicao> atribuicoes = atribuicaoDAO.findAllGraduadosEntreDoisExtremos(1,3);
		Assert.assertEquals(2,atribuicoes.size());
		Assert.assertEquals(new Integer(1),atribuicoes.get(0).getCodigoHierarquico());
		Assert.assertEquals(new Integer(2),atribuicoes.get(1).getCodigoHierarquico());
	}
	
	@Test
	public void testSelecaoParaAutocomplete() throws DaoException{
		List<Atribuicao> result=atribuicaoDAO.findAll("MA");
		Assert.assertNotNull(result);
	}
	
}
