package br.com.cweb.cadastro.persistence.test.dao;

import java.util.List;
import java.util.Set;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;
import br.com.cweb.seguranca.persistence.dao.FuncionalidadeDAO;
import br.com.cweb.seguranca.persistence.entity.Funcionalidade;
import br.com.cweb.seguranca.persistence.entity.TipoPermissao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( {"classpath:cweb-persistence-test.xml", "classpath:hibernate-test.cfg.xml"})
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
public class FuncionalidadeDAOImplTest extends TestCase{

	@Autowired
	public FuncionalidadeDAO funcionalidadeDAO;
	
	@Test
	public void init(){
		Assert.assertNotNull(funcionalidadeDAO);
	}
	
	@Test
	public void obterFuncionalidadesTipoRotina() throws NenhumRegistroEncontradoException{
		
		List<Funcionalidade> funcionalidades = funcionalidadeDAO.obterFuncionalidadesTipoRotina();
		Assert.assertNotNull(funcionalidades);
	}
	
	@Test
	public void obterFuncionalidadesTipoModulo() throws NenhumRegistroEncontradoException{
		
		List<Funcionalidade> funcionalidades = funcionalidadeDAO.obterFuncionalidadesTipoModulo(1);
		Assert.assertEquals(2, funcionalidades.size());
	}
	
	@Test
	public void obterTodasFuncionalidadesUmModulo() throws NenhumRegistroEncontradoException{
		
		List<Funcionalidade> funcionalidades = funcionalidadeDAO.obterTodasFuncionalidadesUmModulo(6);
		Assert.assertEquals(3, funcionalidades.size());
		
	}
	
	@Transactional
	@Test
	public void obterPermissoesUmaFuncionalidade() throws NumberFormatException, DaoException{
		
		Funcionalidade funcionalidade = funcionalidadeDAO.findById(new Long("1"));
		Assert.assertNotNull(funcionalidade);
		
		Set<TipoPermissao> permissoes = funcionalidade.getTipoPermissoes();
		Assert.assertEquals(6, permissoes.size());
		
	}
	
	
	
}
