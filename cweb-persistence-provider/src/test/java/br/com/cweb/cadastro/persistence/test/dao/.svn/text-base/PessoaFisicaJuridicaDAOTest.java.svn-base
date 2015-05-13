package br.com.cweb.cadastro.persistence.test.dao;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import br.com.cweb.cadastro.persistence.dao.PessoaFisicaJuridicaDAO;
import br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar;
import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica;
import br.com.cweb.cadastro.persistence.entity.TipoPessoa;
import br.com.cweb.core.persistence.exception.DaoException;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( {"classpath:cweb-persistence-test.xml", "classpath:hibernate-test.cfg.xml"})
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
public class PessoaFisicaJuridicaDAOTest {
	
	@Autowired
	private PessoaFisicaJuridicaDAO pessoaFisicaJuridicaDAO;
	
	@Test
	public void init(){
		Assert.assertNotNull(pessoaFisicaJuridicaDAO);
	}
	
	@Test
	public void testConsultaCadastroGeralComUsuarioMatriz() throws DaoException{
		
		/**
		 --SELECT NA BASE DE TESTE: 
			select * from v_pessoa_fisica_juridica pfj
			join seg_usuario usua on (usua.id_pessoa=pfj.id_pessoa)
			where pfj.TP_PESSOA =0
			and pfj.ST_CADASTRO_PESSOA=1
			and pfj.ST_CADASTRO_USUARIO=1
			and pfj.AF_ARVORE like '%;0;1;%'
			and pfj.nr_nivel >= 1
		 * 
		 */
		
		Pessoa pessoaLoagada = new Pessoa();
		ArvoreFamiliar arvoreFamiliar = new ArvoreFamiliar();
		pessoaLoagada.setId(1l);
		pessoaLoagada.setArvoreFamiliar(arvoreFamiliar);
		arvoreFamiliar.setArvore(";0;");
		arvoreFamiliar.setNivel(1);
		
		PessoaFisicaJuridica pessoaFisicaJuridica = new PessoaFisicaJuridica();
		pessoaFisicaJuridica.setPossuiCadastroPessoaAtivo(true);
		pessoaFisicaJuridica.setPossuiCadastroUsuarioAtivo(true);
		pessoaFisicaJuridica.setPossuiUsuario(true);
		pessoaFisicaJuridica.setTipoPessoa(TipoPessoa.FISICA);
		
		List<PessoaFisicaJuridica> pessoaFisicaJuridicaList = pessoaFisicaJuridicaDAO.findAll(pessoaFisicaJuridica, pessoaLoagada);
		
		Assert.assertEquals(8,pessoaFisicaJuridicaList.size());
		Assert.assertEquals(new Long(8),pessoaFisicaJuridicaList.get(0).getId());
		Assert.assertEquals(new Long(9),pessoaFisicaJuridicaList.get(1).getId());
		Assert.assertEquals(new Long(11),pessoaFisicaJuridicaList.get(2).getId());
		Assert.assertEquals(new Long(12),pessoaFisicaJuridicaList.get(3).getId());
		Assert.assertEquals(new Long(13),pessoaFisicaJuridicaList.get(4).getId());
		Assert.assertEquals(new Long(15),pessoaFisicaJuridicaList.get(5).getId());
		Assert.assertEquals(new Long(59),pessoaFisicaJuridicaList.get(6).getId());
		Assert.assertEquals(new Long(73),pessoaFisicaJuridicaList.get(7).getId());
		
		
		/**
		 --SELECT NA BASE DE TESTE: 
			select * from v_pessoa_fisica_juridica pfj
			where pfj.TP_PESSOA =0
			and pfj.ST_CADASTRO_PESSOA=1
			and pfj.AF_ARVORE like '%;0;1;%'
			and pfj.nr_nivel >= 1
			and pfj.af_login is null
		 * 
		 */
		
		Pessoa pessoaLoagada2 = new Pessoa();
		ArvoreFamiliar arvoreFamiliar2 = new ArvoreFamiliar();
		pessoaLoagada2.setId(1l);
		pessoaLoagada2.setArvoreFamiliar(arvoreFamiliar2);
		arvoreFamiliar2.setArvore(";0;");
		arvoreFamiliar2.setNivel(1);
		
		PessoaFisicaJuridica pessoaFisicaJuridica2 = new PessoaFisicaJuridica();
		pessoaFisicaJuridica2.setPossuiCadastroPessoaAtivo(true);
		pessoaFisicaJuridica2.setPossuiUsuario(false);
		pessoaFisicaJuridica2.setTipoPessoa(TipoPessoa.FISICA);
		
		List<PessoaFisicaJuridica> pessoaFisicaJuridicaList2 = pessoaFisicaJuridicaDAO.findAll(pessoaFisicaJuridica2, pessoaLoagada2);
		
		Assert.assertEquals(0,pessoaFisicaJuridicaList2.size());
		
		/**
		 --SELECT NA BASE DE TESTE: 
			select * from v_pessoa_fisica_juridica pfj
			where pfj.TP_PESSOA =0
			and pfj.ST_CADASTRO_PESSOA=1
			and pfj.ST_CADASTRO_USUARIO=1
			and pfj.AF_ARVORE like '%;0;1;%'
			and pfj.nr_nivel >= 1
		 * 
		 */
		Pessoa pessoaLoagada3 = new Pessoa();
		ArvoreFamiliar arvoreFamiliar3 = new ArvoreFamiliar();
		pessoaLoagada3.setId(1l);
		pessoaLoagada3.setArvoreFamiliar(arvoreFamiliar3);
		arvoreFamiliar3.setArvore(";0;");
		arvoreFamiliar3.setNivel(1);
		
		PessoaFisicaJuridica pessoaFisicaJuridica3 = new PessoaFisicaJuridica();
		pessoaFisicaJuridica3.setPossuiCadastroPessoaAtivo(true);
		pessoaFisicaJuridica3.setPossuiCadastroUsuarioAtivo(true);
		pessoaFisicaJuridica3.setPossuiUsuario(true);
		pessoaFisicaJuridica3.setTipoPessoa(TipoPessoa.JURIDICA);
		
		List<PessoaFisicaJuridica> pessoaFisicaJuridicaList3 = pessoaFisicaJuridicaDAO.findAll(pessoaFisicaJuridica3, pessoaLoagada3);
		
		Assert.assertEquals(10,pessoaFisicaJuridicaList3.size());
		Assert.assertEquals(new Long(1),pessoaFisicaJuridicaList3.get(0).getId());
		Assert.assertEquals(new Long(2),pessoaFisicaJuridicaList3.get(1).getId());
		Assert.assertEquals(new Long(3),pessoaFisicaJuridicaList3.get(2).getId());
		Assert.assertEquals(new Long(4),pessoaFisicaJuridicaList3.get(3).getId());
		Assert.assertEquals(new Long(5),pessoaFisicaJuridicaList3.get(4).getId());
		Assert.assertEquals(new Long(6),pessoaFisicaJuridicaList3.get(5).getId());

		
		/**
		 --SELECT NA BASE DE TESTE: 
			select * from v_pessoa_fisica_juridica pfj
			where pfj.TP_PESSOA =1
			and pfj.ST_CADASTRO_PESSOA=1
			and pfj.ST_CADASTRO_USUARIO=1
			and pfj.AF_ARVORE like '%;0;1;%'
			and pfj.nr_nivel >= 1
		 * 
		 */
		Pessoa pessoaLoagada4 = new Pessoa();
		ArvoreFamiliar arvoreFamiliar4 = new ArvoreFamiliar();
		pessoaLoagada4.setId(1l);
		pessoaLoagada4.setArvoreFamiliar(arvoreFamiliar4);
		arvoreFamiliar4.setArvore(";0;");
		arvoreFamiliar4.setNivel(1);
		
		PessoaFisicaJuridica pessoaFisicaJuridica4 = new PessoaFisicaJuridica();
		pessoaFisicaJuridica4.setPossuiCadastroPessoaAtivo(true);
		pessoaFisicaJuridica4.setPossuiUsuario(false);
		pessoaFisicaJuridica4.setTipoPessoa(TipoPessoa.JURIDICA);
		
		List<PessoaFisicaJuridica> pessoaFisicaJuridicaList4 = pessoaFisicaJuridicaDAO.findAll(pessoaFisicaJuridica4, pessoaLoagada4);
		
		Assert.assertEquals(1,pessoaFisicaJuridicaList4.size());
		Assert.assertEquals(new Long(10),pessoaFisicaJuridicaList4.get(0).getId());
	}
	

	@Test
	public void testConsultaCadastroGeralComUsuarioSub() throws DaoException{
		
		/**
		 --SELECT NA BASE DE TESTE: 
			select * from v_pessoa_fisica_juridica pfj
			where pfj.TP_PESSOA =0
			and pfj.ST_CADASTRO_PESSOA=1
			and pfj.ST_CADASTRO_USUARIO=1
			and pfj.AF_ARVORE like '%;0;1;2;%'
			and pfj.nr_nivel > 2
		 * 
		 */
		
		Pessoa pessoaLoagadaPf = new Pessoa();
		ArvoreFamiliar arvoreFamiliarPf = new ArvoreFamiliar();
		pessoaLoagadaPf.setId(2l);
		pessoaLoagadaPf.setArvoreFamiliar(arvoreFamiliarPf);
		arvoreFamiliarPf.setArvore(";0;1;");
		arvoreFamiliarPf.setNivel(2);
		
		PessoaFisicaJuridica pessoaFisicaJuridicaPf = new PessoaFisicaJuridica();
		pessoaFisicaJuridicaPf.setPossuiCadastroPessoaAtivo(true);
		pessoaFisicaJuridicaPf.setPossuiUsuario(true);
		pessoaFisicaJuridicaPf.setTipoPessoa(TipoPessoa.FISICA);
		
		List<PessoaFisicaJuridica> pessoaFisicaJuridicaListPf = pessoaFisicaJuridicaDAO.findAll(pessoaFisicaJuridicaPf, pessoaLoagadaPf);
		
		Assert.assertEquals(1,pessoaFisicaJuridicaListPf.size());
		Assert.assertEquals(new Long(7),pessoaFisicaJuridicaListPf.get(0).getId());
		
		
		/**
		 --SELECT NA BASE DE TESTE: 
			select * from v_pessoa_fisica_juridica pfj
			where pfj.TP_PESSOA =1
			and pfj.ST_CADASTRO_PESSOA=1
			and pfj.ST_CADASTRO_USUARIO=1
			and pfj.AF_ARVORE like '%;0;1;2;%'
			and pfj.nr_nivel > 2
		 * 
		 */
		Pessoa pessoaLoagadaPj = new Pessoa();
		ArvoreFamiliar arvoreFamiliarPj = new ArvoreFamiliar();
		pessoaLoagadaPj.setId(2l);
		pessoaLoagadaPj.setArvoreFamiliar(arvoreFamiliarPj);
		arvoreFamiliarPj.setArvore(";0;1;");
		arvoreFamiliarPj.setNivel(2);
		
		PessoaFisicaJuridica pessoaFisicaJuridicaPj = new PessoaFisicaJuridica();
		pessoaFisicaJuridicaPj.setPossuiCadastroPessoaAtivo(true);
		pessoaFisicaJuridicaPj.setPossuiUsuario(true);
		pessoaFisicaJuridicaPj.setTipoPessoa(TipoPessoa.JURIDICA);
		
		List<PessoaFisicaJuridica> pessoaFisicaJuridicaListPj = pessoaFisicaJuridicaDAO.findAll(pessoaFisicaJuridicaPj, pessoaLoagadaPj);
		
		Assert.assertEquals(2,pessoaFisicaJuridicaListPj.size());
		Assert.assertEquals(new Long(4),pessoaFisicaJuridicaListPj.get(0).getId());
		Assert.assertEquals(new Long(6),pessoaFisicaJuridicaListPj.get(1).getId());
	}
	

	
	@Test
	public void testConsultaCadastroGeralComUsuarioBase() throws DaoException{
		
		/**
		 --SELECT NA BASE DE TESTE: 
			select * from v_pessoa_fisica_juridica pfj
			where pfj.TP_PESSOA =0
			and pfj.ST_CADASTRO_PESSOA=1
			and pfj.ST_CADASTRO_USUARIO=1
			and pfj.AF_ARVORE like '%;0;1;2;4;%'
			and pfj.nr_nivel > 3
		 * 
		 */
		
		Pessoa pessoaLoagadaPf = new Pessoa();
		ArvoreFamiliar arvoreFamiliarPf = new ArvoreFamiliar();
		pessoaLoagadaPf.setId(5l);
		pessoaLoagadaPf.setArvoreFamiliar(arvoreFamiliarPf);
		arvoreFamiliarPf.setArvore(";0;1;3;");
		arvoreFamiliarPf.setNivel(3);
		
		PessoaFisicaJuridica pessoaFisicaJuridicaPf = new PessoaFisicaJuridica();
		pessoaFisicaJuridicaPf.setPossuiCadastroPessoaAtivo(true);
		pessoaFisicaJuridicaPf.setPossuiUsuario(true);
		pessoaFisicaJuridicaPf.setTipoPessoa(TipoPessoa.FISICA);
		
		List<PessoaFisicaJuridica> pessoaFisicaJuridicaListPf = pessoaFisicaJuridicaDAO.findAll(pessoaFisicaJuridicaPf, pessoaLoagadaPf);
		
		Assert.assertEquals(2,pessoaFisicaJuridicaListPf.size());
		Assert.assertEquals(new Long(11),pessoaFisicaJuridicaListPf.get(0).getId());
		Assert.assertEquals(new Long(12),pessoaFisicaJuridicaListPf.get(1).getId());
		
		
		/**
		 --SELECT NA BASE DE TESTE: 
			select * from v_pessoa_fisica_juridica pfj
			where pfj.TP_PESSOA =1
			and pfj.ST_CADASTRO_PESSOA=1
			and pfj.ST_CADASTRO_USUARIO=1
			and pfj.AF_ARVORE like '%;0;1;2;4;%'
			and pfj.nr_nivel > 3
		 * 
		 */
		Pessoa pessoaLoagadaPj = new Pessoa();
		ArvoreFamiliar arvoreFamiliarPj = new ArvoreFamiliar();
		pessoaLoagadaPj.setId(4l);
		pessoaLoagadaPj.setArvoreFamiliar(arvoreFamiliarPj);
		arvoreFamiliarPj.setArvore(";0;1;2;");
		arvoreFamiliarPj.setNivel(3);
		
		PessoaFisicaJuridica pessoaFisicaJuridicaPj = new PessoaFisicaJuridica();
		pessoaFisicaJuridicaPj.setPossuiCadastroPessoaAtivo(true);
		pessoaFisicaJuridicaPj.setPossuiUsuario(true);
		pessoaFisicaJuridicaPj.setTipoPessoa(TipoPessoa.JURIDICA);
		
		List<PessoaFisicaJuridica> pessoaFisicaJuridicaListPj = pessoaFisicaJuridicaDAO.findAll(pessoaFisicaJuridicaPj, pessoaLoagadaPj);
		
		Assert.assertEquals(1,pessoaFisicaJuridicaListPj.size());
		Assert.assertEquals(new Long(6),pessoaFisicaJuridicaListPj.get(0).getId());
	}
	
	@Test
	public void testConsultaCadastroGeralComUsuarioCaptador() throws DaoException{
		
		/**
		 --SELECT NA BASE DE TESTE: 
			select * from v_pessoa_fisica_juridica pfj
			where pfj.TP_PESSOA =0
			and pfj.ST_CADASTRO_PESSOA=1
			and pfj.ST_CADASTRO_USUARIO=1
			and pfj.AF_ARVORE like '%;0;1;2;4;6;%'
			and pfj.nr_nivel > 4
		 * 
		 */
		
		Pessoa pessoaLoagadaPf = new Pessoa();
		ArvoreFamiliar arvoreFamiliarPf = new ArvoreFamiliar();
		pessoaLoagadaPf.setId(6l);
		pessoaLoagadaPf.setArvoreFamiliar(arvoreFamiliarPf);
		arvoreFamiliarPf.setArvore(";0;1;2;4;");
		arvoreFamiliarPf.setNivel(4);
		
		PessoaFisicaJuridica pessoaFisicaJuridicaPf = new PessoaFisicaJuridica();
		pessoaFisicaJuridicaPf.setPossuiCadastroPessoaAtivo(true);
		pessoaFisicaJuridicaPf.setPossuiUsuario(true);
		pessoaFisicaJuridicaPf.setTipoPessoa(TipoPessoa.FISICA);
		
		List<PessoaFisicaJuridica> pessoaFisicaJuridicaListPf = pessoaFisicaJuridicaDAO.findAll(pessoaFisicaJuridicaPf, pessoaLoagadaPf);
		
		Assert.assertEquals(1,pessoaFisicaJuridicaListPf.size());
		Assert.assertEquals(new Long(7),pessoaFisicaJuridicaListPf.get(0).getId());
		
	}
	

	@Test
	public void testConsultaCadastroGeralPJComUsuarioMatrizEcpfCnpjPai5543255000121() throws DaoException{
		
		/**
		 --SELECT NA BASE DE TESTE: 
			select * from v_pessoa_fisica_juridica pfj
			where pfj.TP_PESSOA =1
			and pfj.ST_CADASTRO_PESSOA=1
			and pfj.ST_CADASTRO_USUARIO=1
			and pfj.AF_ARVORE like '%;0;1;2;%'
			and pfj.nr_nivel > 2
			and pfj.AF_LOGIN is not null
		 * 
		 */
		
		Pessoa pessoaLoagadaPj = new Pessoa();
		ArvoreFamiliar arvoreFamiliarPj = new ArvoreFamiliar();
		pessoaLoagadaPj.setId(1l);
		pessoaLoagadaPj.setArvoreFamiliar(arvoreFamiliarPj);
		arvoreFamiliarPj.setArvore(";0;");
		arvoreFamiliarPj.setNivel(1);
		
		PessoaFisicaJuridica pessoaFisicaJuridicaPj = new PessoaFisicaJuridica();
		pessoaFisicaJuridicaPj.setPossuiCadastroPessoaAtivo(true);
		pessoaFisicaJuridicaPj.setPossuiUsuario(true);
		pessoaFisicaJuridicaPj.setTipoPessoa(TipoPessoa.JURIDICA);
		pessoaFisicaJuridicaPj.setCpfCnpjVinculante("5543255000121");
		
		List<PessoaFisicaJuridica> pessoaFisicaJuridicaListPj = pessoaFisicaJuridicaDAO.findAll(pessoaFisicaJuridicaPj, pessoaLoagadaPj);
		
		Assert.assertEquals(2,pessoaFisicaJuridicaListPj.size());
		Assert.assertEquals(new Long(4),pessoaFisicaJuridicaListPj.get(0).getId());
		Assert.assertEquals(new Long(6),pessoaFisicaJuridicaListPj.get(1).getId());
		
	}
	
	
	@Test
	public void testConsultaCadastroGeralPfComUsuarioMatrizEcpfCnpjPaiDaMesmaSub() throws DaoException{
		
		/**
		 --SELECT NA BASE DE TESTE: 
			select * from v_pessoa_fisica_juridica pfj
			where pfj.TP_PESSOA =1
			and pfj.ST_CADASTRO_PESSOA=1
			and pfj.ST_CADASTRO_USUARIO=1
			and pfj.AF_ARVORE like '%;0;1;2;%'
			and pfj.nr_nivel > 2
			and pfj.AF_LOGIN is not null
		 * 
		 */
		
		Pessoa pessoaLoagadaPf = new Pessoa();
		ArvoreFamiliar arvoreFamiliarPf = new ArvoreFamiliar();
		pessoaLoagadaPf.setId(1l);
		pessoaLoagadaPf.setArvoreFamiliar(arvoreFamiliarPf);
		arvoreFamiliarPf.setArvore(";0;");
		arvoreFamiliarPf.setNivel(1);
		
		PessoaFisicaJuridica pessoaFisicaJuridicaPf = new PessoaFisicaJuridica();
		pessoaFisicaJuridicaPf.setPossuiCadastroPessoaAtivo(true);
		pessoaFisicaJuridicaPf.setPossuiUsuario(true);
		pessoaFisicaJuridicaPf.setTipoPessoa(TipoPessoa.FISICA);
		pessoaFisicaJuridicaPf.setCpfCnpjVinculante("5543255000121");
		
		List<PessoaFisicaJuridica> pessoaFisicaJuridicaListPf = pessoaFisicaJuridicaDAO.findAll(pessoaFisicaJuridicaPf, pessoaLoagadaPf);
		
		Assert.assertEquals(1,pessoaFisicaJuridicaListPf.size());
		Assert.assertEquals(new Long(7),pessoaFisicaJuridicaListPf.get(0).getId());
		
	}
	
	@Test
	public void testConsultaCadastroGeralPfComUsuarioSubEcpfCnpjPaiDeOutraSub() throws DaoException{
		Pessoa pessoaLoagadaPf = new Pessoa();
		ArvoreFamiliar arvoreFamiliarPf = new ArvoreFamiliar();
		pessoaLoagadaPf.setId(2l);
		pessoaLoagadaPf.setArvoreFamiliar(arvoreFamiliarPf);
		arvoreFamiliarPf.setArvore(";0;1;");
		arvoreFamiliarPf.setNivel(2);
		
		PessoaFisicaJuridica pessoaFisicaJuridicaPf = new PessoaFisicaJuridica();
		pessoaFisicaJuridicaPf.setPossuiCadastroPessoaAtivo(true);
		pessoaFisicaJuridicaPf.setPossuiUsuario(true);
		pessoaFisicaJuridicaPf.setTipoPessoa(TipoPessoa.FISICA);
		pessoaFisicaJuridicaPf.setCpfCnpjVinculante("8743255000123");
		
		List<PessoaFisicaJuridica> pessoaFisicaJuridicaListPf = pessoaFisicaJuridicaDAO.findAll(pessoaFisicaJuridicaPf, pessoaLoagadaPf);
		
		Assert.assertEquals(0,pessoaFisicaJuridicaListPf.size());
		
	}

	@Test
	public void testfindAllByCodigoAtribuicaoSub1LogadoComSub1() throws DaoException{
		Pessoa pessoaLoagadaPf = new Pessoa();
		ArvoreFamiliar arvoreFamiliarPf = new ArvoreFamiliar();
		pessoaLoagadaPf.setId(2l);
		pessoaLoagadaPf.setArvoreFamiliar(arvoreFamiliarPf);
		arvoreFamiliarPf.setArvore(";0;1;");
		arvoreFamiliarPf.setNivel(2);
		
		PessoaFisicaJuridica pessoaFisicaJuridicaPf = new PessoaFisicaJuridica();
		pessoaFisicaJuridicaPf.setPossuiCadastroPessoaAtivo(true);
		pessoaFisicaJuridicaPf.setPossuiUsuario(true);
		pessoaFisicaJuridicaPf.setTipoPessoa(TipoPessoa.FISICA);
		pessoaFisicaJuridicaPf.setCpfCnpjVinculante("5543255000121");
		
		List<PessoaFisicaJuridica> pessoaFisicaJuridicaListPf = pessoaFisicaJuridicaDAO.findAll(pessoaFisicaJuridicaPf, pessoaLoagadaPf);
		
		Assert.assertEquals(1,pessoaFisicaJuridicaListPf.size());
		Assert.assertEquals(new Long(7),pessoaFisicaJuridicaListPf.get(0).getId());
	}

}
