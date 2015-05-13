package br.com.cweb.cadastro.persistence.test.dao;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import br.com.cweb.cadastro.persistence.dao.InstituicaoFinanceiraDAO;
import br.com.cweb.cadastro.persistence.entity.ContaBancaria;
import br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira;
import br.com.cweb.cadastro.persistence.entity.TipoInstituicao;
import br.com.cweb.core.persistence.exception.DaoException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( {"classpath:cweb-persistence-test.xml", "classpath:hibernate-test.cfg.xml"})
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
public class InstituicaoFinanceiraDAOImplTest {

	@Autowired
	private InstituicaoFinanceiraDAO dao;
	
	InstituicaoFinanceira instituicao;
	
	@Test
	public void init(){
		Assert.assertNotNull(dao);
	}
	
	@Test
	public void listarInstituicoes() throws Exception{
		
		List<InstituicaoFinanceira> instituicoes = dao.findAll();
		Assert.assertEquals(239, instituicoes.size());
		
		for (InstituicaoFinanceira instituicaoFinanceira : instituicoes) {
			System.out.println(instituicaoFinanceira.getId()+" - "+instituicaoFinanceira.getNome());
		}
	}
	
	@Test
	public void buscarPorId() throws Exception{
		
		InstituicaoFinanceira instituicao = dao.findById(new Long(208));
		
		Assert.assertEquals(new Long(208), instituicao.getId());
		//Assert.assertEquals(new String("BANCO CENTRAL DO BRASIL                           "), instituicao.getNome());
		
	}
	
	@Test
	public void createInstituicao() throws Exception{
		
		InstituicaoFinanceira instituicao = new InstituicaoFinanceira();
		instituicao.setNome("HUGO BANK S.A.");
		instituicao.setTipoInstituicao(TipoInstituicao.BANCO);
		instituicao.setPossuiCadastroAtivo(true);
		instituicao.setIdUsuarioAtualizador(new Long(9999));
		instituicao.setDataHoraAtualizacao(new Date());
		
		Long idInstituicao = dao.create(instituicao);
		System.out.println("ID"+ idInstituicao);
		
		InstituicaoFinanceira vInstituicao = dao.findById(idInstituicao);
		
		Assert.assertEquals(vInstituicao.getId(), idInstituicao);
		
		
	}
	
	@Test
	public void atualizarInstituicao() throws DaoException{
		
		InstituicaoFinanceira instituicao = dao.findById(new Long(1001));
		
		instituicao.setSite("www.vhugo.com.br");
		dao.update(instituicao);
	}
	
	@Test
	public void excluirInstituicao(){
		
		try {
			InstituicaoFinanceira instituicao;
			instituicao = dao.findById(new Long(208));
			dao.delete(instituicao);
		} catch (DaoException e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void buscarInstituicao(){
		
		InstituicaoFinanceira instituicao = new InstituicaoFinanceira();
		instituicao.setNome("VICTOR BANK S.A.");		
	}
	
	@Test
	public void buscarPorCriteriaPorId(){
		List<InstituicaoFinanceira> listaRetornada = new LinkedList<InstituicaoFinanceira>();
		
		try {			
			instituicao = new InstituicaoFinanceira();
			instituicao.setId(new Long(20));
			listaRetornada = dao.findAll(instituicao);		
			
			for (InstituicaoFinanceira instituicaoFinanceira : listaRetornada) {
				System.out.print("INSTITUICAO - "+instituicaoFinanceira.getId());
				System.out.print(" - "+instituicaoFinanceira.getNome());
				System.out.print(" - "+instituicaoFinanceira.getSigla());
				System.out.print(" - "+instituicaoFinanceira.getSite());				
			}
		} catch (DaoException e) {
			e.printStackTrace();
		}		
	}
	
	
	@Test
	public void buscarPorCriteriaPorNome(){
		List<InstituicaoFinanceira> listaRetornada = new LinkedList<InstituicaoFinanceira>();
		
		try {			
			instituicao = new InstituicaoFinanceira();
			instituicao.setNome("VICTOR BANK S.A.");
			listaRetornada = dao.findAll(instituicao);		
			
			for (InstituicaoFinanceira instituicaoFinanceira : listaRetornada) {
				System.out.print("INSTITUICAO - "+instituicaoFinanceira.getId());
				System.out.print(" - "+instituicaoFinanceira.getNome());
				System.out.print(" - "+instituicaoFinanceira.getSigla());
				System.out.print(" - "+instituicaoFinanceira.getSite());	
				System.out.println();
			}
		} catch (DaoException e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void buscarPorCriteriaPorSigla(){
		List<InstituicaoFinanceira> listaRetornada = new LinkedList<InstituicaoFinanceira>();
		
		try {			
			instituicao = new InstituicaoFinanceira();
			instituicao.setSigla("VHUGO");
			listaRetornada = dao.findAll(instituicao);		
			
			for (InstituicaoFinanceira instituicaoFinanceira : listaRetornada) {
				System.out.print("INSTITUICAO - "+instituicaoFinanceira.getId());
				System.out.print(" - "+instituicaoFinanceira.getNome());
				System.out.print(" - "+instituicaoFinanceira.getSigla());
				System.out.print(" - "+instituicaoFinanceira.getSite());		
				System.out.println();
			}
		} catch (DaoException e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void buscarPorCriteriaPorTipo(){
		List<InstituicaoFinanceira> listaRetornada = new LinkedList<InstituicaoFinanceira>();
		
		try {			
			instituicao = new InstituicaoFinanceira();			
			instituicao.setTipoInstituicao(TipoInstituicao.PARCEIRO);
			listaRetornada = dao.findAll(instituicao);		
			
			for (InstituicaoFinanceira instituicaoFinanceira : listaRetornada) {
				System.out.print("INSTITUICAO - "+instituicaoFinanceira.getId());
				System.out.print(" - "+instituicaoFinanceira.getNome());
				System.out.print(" - "+instituicaoFinanceira.getSigla());
				System.out.print(" - "+instituicaoFinanceira.getSite());	
				System.out.println();
			}
		} catch (DaoException e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void buscarPorCriteriaSituacao(){
		List<InstituicaoFinanceira> listaRetornada = new LinkedList<InstituicaoFinanceira>();
		
		try {			
			instituicao = new InstituicaoFinanceira();			
			instituicao.setId(new Long(1001));
			instituicao.setPossuiCadastroAtivo(true);
			instituicao.setTipoInstituicao(TipoInstituicao.BANCO);
			listaRetornada = dao.findAll(instituicao);		
			
			for (InstituicaoFinanceira instituicaoFinanceira : listaRetornada) {
				System.out.print("INSTITUICAO - "+instituicaoFinanceira.getId());
				System.out.print(" - "+instituicaoFinanceira.getNome());
				System.out.print(" - "+instituicaoFinanceira.getSigla());
				System.out.print(" - "+instituicaoFinanceira.getSite());	
				System.out.println();
			}
		} catch (DaoException e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void findDependentes(){
		
		try {				
			
			List<InstituicaoFinanceira> retorno = dao.findDependentesInstituicao(new Long(208));
			System.out.println("Dependentes: " + retorno.size());
			
		} catch (DaoException e) {
			e.printStackTrace();
		}
	}
	
}
