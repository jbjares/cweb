package br.com.cweb.cadastro.persistence.test.dao;

import java.util.ArrayList;
import java.util.LinkedHashSet;
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

import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;
import br.com.cweb.seguranca.persistence.dao.AcessoMenuDAO;
import br.com.cweb.seguranca.persistence.entity.AcessoMenu;
import br.com.cweb.seguranca.persistence.entity.Funcionalidade;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( {"classpath:cweb-persistence-test.xml", "classpath:hibernate-test.cfg.xml"})
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
public class AcessoMenuDAOImplTest extends TestCase{
	
	@Autowired
	private AcessoMenuDAO acessoMenuDAO;
	
	@Test
	public void init(){
		Assert.assertNotNull(acessoMenuDAO);
	}
	
	@Test
	public void obterAcessoMenu() throws DaoException, NenhumRegistroEncontradoException{
		
		List<AcessoMenu> result = acessoMenuDAO.findByIdGrupoAcesso(new Long("1"));
		assertNotNull(result);
		
		List<Funcionalidade> fc = new ArrayList<Funcionalidade>();
		
		System.out.println("********************************");
		
		for(AcessoMenu acessoMenu:result){
			
			System.out.println("Funcionalidade: " + acessoMenu.getFuncionalidade().getNome());
			fc.add(acessoMenu.getFuncionalidade());
		}
		
		Set<Funcionalidade> fcTemp = new LinkedHashSet <Funcionalidade>();
		
		for(Funcionalidade f : fc){
			
			fcTemp.add(f);
		}
		
		System.out.println("Novas Funcionalidades recuperadas: *********************");
		
		for(Funcionalidade f : fcTemp){
			
			System.out.println("Nova: " + f.getNome());
		}

	}
	
	@Test
	public void listarAcessosMenu() throws NumberFormatException, DaoException{
		
		AcessoMenu result = acessoMenuDAO.findById(new Long("1"));
		assertNotNull(result);
		
		System.out.println("********************************");
		System.out.println("Funcionalidade: " + result.getFuncionalidade().getNome());
	}
	
	@Test
	public void obterAcessosPorFuncionalidadeGrupoAcesso() throws NenhumRegistroEncontradoException{
		
		Funcionalidade funcionalidade = new Funcionalidade();
		funcionalidade.setId(new Long("1"));
		
		GrupoAcesso grupoAcesso = new GrupoAcesso();
		grupoAcesso.setId(new Long("1"));
		
		List<AcessoMenu> result = acessoMenuDAO.obterAcessosPorFuncionalidadeGrupoAcesso(funcionalidade, grupoAcesso);
		
		Assert.assertNotNull(result);
	}
	
	
}
