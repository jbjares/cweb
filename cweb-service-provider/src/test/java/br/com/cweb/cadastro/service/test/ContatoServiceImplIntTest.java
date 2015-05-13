package br.com.cweb.cadastro.service.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import br.com.cweb.cadastro.persistence.entity.Estado;
import br.com.cweb.cadastro.service.LocalizacaoService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( {"classpath:cweb-service.xml","classpath:cweb-persistence.xml", "classpath:hibernate.cfg.xml"})
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
public class ContatoServiceImplIntTest {

	@Autowired
	private LocalizacaoService contatoService;
	
	@Test
	public void init(){
		Assert.assertNotNull(contatoService);
	}
	
	@Ignore
	public void testRecuperarEstados(){
		List<Estado> estados = contatoService.recuperarEstados();
		Assert.assertEquals(1, estados.size());
		Assert.assertEquals("PA", estados.get(0).getNome());
	}
	
}
