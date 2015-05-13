package br.com.cweb.cadastro.persistence.test.dao;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import br.com.cweb.cadastro.persistence.entity.Estado;
import br.com.cweb.seguranca.persistence.dao.UsuarioDAO;
import br.com.cweb.seguranca.persistence.entity.Usuario;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( {"classpath:cweb-persistence-test.xml", "classpath:hibernate-test.cfg.xml"})
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
public class UsuarioDAOImplIntTest {

	@Autowired
	private UsuarioDAO usuairoDAO;
	
	@Test
	public void init(){
		Assert.assertNotNull(usuairoDAO);
	}
	
	@Test
	public void testConsultaUsuario() throws Exception{
		Usuario usuario = usuairoDAO.find("cweb", "cweb");
		Assert.assertNotNull(usuario);
	}
	
}
