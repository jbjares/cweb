package br.com.cweb.cadastro.persistence.test.dao;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import br.com.cweb.cadastro.persistence.dao.DadosBancariosDAO;
import br.com.cweb.cadastro.persistence.entity.ContaBancaria;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( {"classpath:cweb-persistence-test.xml", "classpath:hibernate-test.cfg.xml"})
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
public class DadosBancariosDAOImplTest {

	@Autowired
	private DadosBancariosDAO dadosBancariosDAO;

	
	@Test
	public void init(){
		Assert.assertNotNull("instancia do DAO não nula!", dadosBancariosDAO);
	}
	
	@Test
	public void findByIdPessoa() throws DaoException, NenhumRegistroEncontradoException{
		
		ContaBancaria contaBancaria = dadosBancariosDAO.findById(2l);
		
	}

}
