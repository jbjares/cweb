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

import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica;
import br.com.cweb.cadastro.service.LocalizacaoService;
import br.com.cweb.cadastro.service.OrganogramaService;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.seguranca.persistence.entity.Usuario;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( {"classpath:cweb-service.xml","classpath:cweb-persistence.xml", "classpath:hibernate.cfg.xml"})
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
public class OrganogramaServiceImplTest {

	
	@Autowired
	private OrganogramaService organogramaService;
	
	@Test
	public void init(){
		Assert.assertNotNull(organogramaService);
	}
	
	
	@Test
	public void testRecuperarPessoasOrganograma() {
		List<Pessoa> pessoas = organogramaService.recuperarPessoasOrganograma();
	}
	
	@Test
	public void testExcluirPessoa(){
		organogramaService.excluirPessoa(56l);
		organogramaService.excluirPessoa(57l);
		organogramaService.excluirPessoa(58l);
		organogramaService.excluirPessoa(59l);
	}
}
