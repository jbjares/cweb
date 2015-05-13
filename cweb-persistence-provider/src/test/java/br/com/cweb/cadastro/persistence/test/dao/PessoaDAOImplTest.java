package br.com.cweb.cadastro.persistence.test.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import br.com.cweb.cadastro.persistence.dao.ArvoreFamiliarDAO;
import br.com.cweb.cadastro.persistence.dao.AtribuicaoDAO;
import br.com.cweb.cadastro.persistence.dao.CidadeDAO;
import br.com.cweb.cadastro.persistence.dao.EnderecoDAO;
import br.com.cweb.cadastro.persistence.dao.EstadoDAO;
import br.com.cweb.cadastro.persistence.dao.InstituicaoFinanceiraDAO;
import br.com.cweb.cadastro.persistence.dao.PerfilComissaoDAO;
import br.com.cweb.cadastro.persistence.dao.PessoaDAO;
import br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar;
import br.com.cweb.cadastro.persistence.entity.Atribuicao;
import br.com.cweb.cadastro.persistence.entity.Cidade;
import br.com.cweb.cadastro.persistence.entity.ContaBancaria;
import br.com.cweb.cadastro.persistence.entity.Endereco;
import br.com.cweb.cadastro.persistence.entity.Estado;
import br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira;
import br.com.cweb.cadastro.persistence.entity.PerfilComissao;
import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.cadastro.persistence.entity.PessoaFisica;
import br.com.cweb.cadastro.persistence.entity.PessoaJuridica;
import br.com.cweb.cadastro.persistence.entity.TipoConta;
import br.com.cweb.cadastro.persistence.entity.TipoPessoa;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.seguranca.persistence.dao.GrupoAcessoDAO;
import br.com.cweb.seguranca.persistence.dao.UsuarioDAO;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;
import br.com.cweb.seguranca.persistence.entity.Usuario;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( {"classpath:cweb-persistence-test.xml", "classpath:hibernate-test.cfg.xml"})
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
public class PessoaDAOImplTest {


	@Autowired
	private PessoaDAO pessoaDAO;

	@Autowired
	private AtribuicaoDAO atribuicaoDAO;

	@Autowired
	private PerfilComissaoDAO perfilComissaoDAO;
	
	@Autowired
	private InstituicaoFinanceiraDAO instituicaoFinanceiraDAO;
	
	@Autowired
	private CidadeDAO cidadeDAO;
	
	@Autowired
	private EstadoDAO estadoDAO;
	
	@Autowired
	private EnderecoDAO enderecoDAO;
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Autowired
	private GrupoAcessoDAO grupoAcessoDAO;
	
	@Autowired
	private ArvoreFamiliarDAO arvoreFamiliarDAO;
	
	@Test
	public void init(){
		Assert.assertNotNull(pessoaDAO);
	}
	
	@Test
	public void testIncluirPessoaFisica() throws DaoException{
		Endereco endereco = new Endereco();//
		Cidade cidade = new Cidade();
		Estado estado = new Estado();
		ContaBancaria dadosBancarios = new ContaBancaria();//
		Usuario usuario = new Usuario();//

		PessoaFisica pessoaFisica = new PessoaFisica();
	  	
		/** identificacao **/
		pessoaFisica.setAtribuicao(atribuicaoDAO.findById(4l));
		
		pessoaFisica.setNome("JB CORRETOR TEST INCLUSAO");
		pessoaFisica.setApelido("JB");
		pessoaFisica.setCpf("1234567890");
		pessoaFisica.setTipoPessoa(TipoPessoa.FISICA);
		pessoaFisica.setPossuiCadastroAtivo(true);
		
		/** dados bancarios**/
		
		dadosBancarios.setBanco(instituicaoFinanceiraDAO.findById(222l));
		dadosBancarios.setAgencia("1234567890");
		dadosBancarios.setConta("4567");
		dadosBancarios.setNomeFavorecido("jb");
		dadosBancarios.setCpfCnpjFavorecido("234567890");
		dadosBancarios.setDataHoraAtualizacao(new Date());
		dadosBancarios.setIdUsuarioAtualizador(9999l);
		dadosBancarios.setPossuiCadastroAtivo(true);
		
		
		pessoaFisica.setPerfilComissao(perfilComissaoDAO.findById(2l));
		
		dadosBancarios.setPessoa(pessoaFisica);
		
		pessoaFisica.setPossuiBonificacaoContratual(true);
		
		dadosBancarios.setTipoConta(TipoConta.CORRENTE);
		
		List<ContaBancaria> listaDadosBancarios = new ArrayList<ContaBancaria>();
		listaDadosBancarios.add(dadosBancarios);
		pessoaFisica.setDadosBancarios(listaDadosBancarios);
		
		/** Vincula��o/Depend�ncia/Captador **/
		pessoaFisica.setPessoaVinculadora(pessoaDAO.findById(1l));

		pessoaFisica.setIdUsuarioAtualizador(9999l);

		Long id = pessoaDAO.create(pessoaFisica);
		
		Assert.assertNotNull(id);
		
		
		/** contato **/
		endereco.setEndereco("RUA ONJONJONJONO");
		endereco.setNumero("123");
		endereco.setCep(new Long("23456789"));
		endereco.setBairro("bairro");
		
		estado = estadoDAO.findById(23l);
		cidade = cidadeDAO.findById(2304400l);
		cidade.setEstado(estado);
		
		endereco.setCidade(cidade);
		endereco.setEmail("jbjares@gmail.com");
		
		endereco.setFax("12345678");
		endereco.setTelefoneFixo("1256798789");
		endereco.setCelular("1234568");
		endereco.setNomeResponsavel("129976987");
		endereco.setTelefoneResponsavel("JB");
		endereco.setDataHoraAtualizacao(new Date());
		endereco.setIdUsuarioAtualizador(9999l);
		endereco.setPossuiCadastroAtivo(true);
		endereco.setPessoa(pessoaDAO.findById(id));
		enderecoDAO.create(endereco);
		
		/** Controle de Acesso do Usu�rio **/
		usuario.setLogin("jbjares");
		usuario.setPossuiCadastroAtivo(true);			
		usuario.setGupoAcesso(grupoAcessoDAO.findById(6l));
		usuario.setIdUsuarioAtualizador(9999l);
		usuario.setPossuiCadastroAtivo(true);
		usuario.setDataHoraAtualizacao(new Date());
		usuario.setPessoa(pessoaDAO.findById(id));
		
		usuario.setIdSuperUsuario(new Long("1"));				
		usuario.setSenha("cweb");				
		usuarioDAO.create(usuario);
		
		Pessoa pessoaarvore = pessoaDAO.findById(1l);
		Pessoa pessoa = pessoaDAO.findById(id);
		ArvoreFamiliar arvoreFamiliar = new ArvoreFamiliar();
		arvoreFamiliar.setIdUsuarioAtualizador(9999l);
		arvoreFamiliar.setPossuiCadastroAtivo(true);
		arvoreFamiliar.setDataHoraAtualizacao(new Date());
		arvoreFamiliar.setPessoa(pessoa);
		arvoreFamiliar.setNivel(pessoaarvore.getArvoreFamiliar().getNivel()+1);
		arvoreFamiliar.setArvore(pessoaarvore.getArvoreFamiliar().getArvore()+pessoaarvore.getId()+";");
		arvoreFamiliarDAO.create(arvoreFamiliar);
		
	}

	@Test
	public void testIncluirPessoaJuridica() throws DaoException{
		Endereco endereco = new Endereco();//
		Cidade cidade = new Cidade();
		Estado estado = new Estado();
		ContaBancaria dadosBancarios = new ContaBancaria();//
		Usuario usuario = new Usuario();//

		PessoaJuridica pessoaJuridica = new PessoaJuridica();
	  	
		/** identificacao **/
		pessoaJuridica.setAtribuicao(atribuicaoDAO.findById(2l));
		

		pessoaJuridica.setRazaoSocial("JB SUB 2 LTDA");
		pessoaJuridica.setSigla("JB");
		pessoaJuridica.setCnpj("1234567890");		
		pessoaJuridica.setNomeFantasia("JB SUB 2");
		pessoaJuridica.setTipoPessoa(TipoPessoa.JURIDICA);
		pessoaJuridica.setPossuiCadastroAtivo(true);
		
		/** dados bancarios**/
		
		dadosBancarios.setBanco(instituicaoFinanceiraDAO.findById(222l));
		dadosBancarios.setAgencia("1239767");
		dadosBancarios.setConta("79679");
		dadosBancarios.setNomeFavorecido("jb");
		dadosBancarios.setCpfCnpjFavorecido("987698");
		dadosBancarios.setDataHoraAtualizacao(new Date());
		dadosBancarios.setIdUsuarioAtualizador(9999l);
		dadosBancarios.setPossuiCadastroAtivo(true);
		
		
		pessoaJuridica.setPerfilComissao(perfilComissaoDAO.findById(2l));
		
		dadosBancarios.setPessoa(pessoaJuridica);
		
		pessoaJuridica.setPossuiBonificacaoContratual(true);
		
		dadosBancarios.setTipoConta(TipoConta.CORRENTE);
		
		List<ContaBancaria> listaDadosBancarios = new ArrayList<ContaBancaria>();
		listaDadosBancarios.add(dadosBancarios);
		pessoaJuridica.setDadosBancarios(listaDadosBancarios);
		
		/** Vincula��o/Depend�ncia/Captador **/
		pessoaJuridica.setPessoaVinculadora(pessoaDAO.findById(1l));

		pessoaJuridica.setIdUsuarioAtualizador(9999l);

		Long id = pessoaDAO.create(pessoaJuridica);
		
		Assert.assertNotNull(id);
		
		
		/** contato **/
		endereco.setEndereco("RUA ONJONJOighiuhiuhoNJONO");
		endereco.setNumero("123");
		endereco.setCep(new Long("897088"));
		endereco.setBairro("bairropj");
		
		estado = estadoDAO.findById(23l);
		cidade = cidadeDAO.findById(2304400l);
		cidade.setEstado(estado);
		
		endereco.setCidade(cidade);
		endereco.setEmail("jbjares@gmail.com");
		
		endereco.setFax("12345678");
		endereco.setTelefoneFixo("1256798789");
		endereco.setCelular("1234568");
		endereco.setNomeResponsavel("129976987");
		endereco.setTelefoneResponsavel("JB");
		endereco.setDataHoraAtualizacao(new Date());
		endereco.setIdUsuarioAtualizador(9999l);
		endereco.setPossuiCadastroAtivo(true);
		endereco.setPessoa(pessoaDAO.findById(id));
		enderecoDAO.create(endereco);
		
		/** Controle de Acesso do Usu�rio **/
		usuario.setLogin("jbjarespj");
		usuario.setPossuiCadastroAtivo(true);			
		usuario.setGupoAcesso(grupoAcessoDAO.findById(6l));
		usuario.setIdUsuarioAtualizador(9999l);
		usuario.setPossuiCadastroAtivo(true);
		usuario.setDataHoraAtualizacao(new Date());
		usuario.setPessoa(pessoaDAO.findById(id));
		
		//usuario.setIdSuperUsuario(new Long("1"));				
		usuario.setSenha("cweb");				
		usuarioDAO.create(usuario);
		
		Pessoa pessoaarvore = pessoaDAO.findById(1l);
		Pessoa pessoa = pessoaDAO.findById(id);
		ArvoreFamiliar arvoreFamiliar = new ArvoreFamiliar();
		arvoreFamiliar.setIdUsuarioAtualizador(9999l);
		arvoreFamiliar.setPossuiCadastroAtivo(true);
		arvoreFamiliar.setDataHoraAtualizacao(new Date());
		arvoreFamiliar.setPessoa(pessoa);
		arvoreFamiliar.setNivel(pessoaarvore.getArvoreFamiliar().getNivel()+1);
		arvoreFamiliar.setArvore(pessoaarvore.getArvoreFamiliar().getArvore()+pessoaarvore.getId()+";");
		arvoreFamiliarDAO.create(arvoreFamiliar);
		
	}
	
	
}
