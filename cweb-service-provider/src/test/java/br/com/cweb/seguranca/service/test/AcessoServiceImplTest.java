package br.com.cweb.seguranca.service.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import br.com.cweb.cadastro.service.AcessoService;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;
import br.com.cweb.core.persistence.exception.ValidationException;
import br.com.cweb.seguranca.persistence.entity.Funcionalidade;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;
import br.com.cweb.seguranca.persistence.entity.TipoPermissao;
import br.com.cweb.seguranca.persistence.entity.Usuario;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( {"classpath:cweb-service.xml","classpath:cweb-persistence.xml", "classpath:hibernate.cfg.xml"})
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
public class AcessoServiceImplTest {

	
	@Autowired
	private AcessoService acessoService;
	
	@Test
	public void init(){
		Assert.assertNotNull(acessoService);
	}
	
	@Test
	public void testRecuperarPermissoes() throws NumberFormatException, NenhumRegistroEncontradoException{
		
		List<TipoPermissao> result = acessoService.obterPermissoes("1");
		
	}
	
	@Test
	public void testRecuperarFuncionalidadesByGrupoAcesso() throws NumberFormatException, NenhumRegistroEncontradoException, DaoException{
		
		List<Funcionalidade> result = acessoService.obterFuncionalidadesPorGrupoAcesso(new Long("1"));
		Assert.assertNotNull(result);
	}
	
	@Test
	public void recuperarPermissoesPertencemFuncionalidade() throws NumberFormatException, DaoException, NenhumRegistroEncontradoException{
		
		Funcionalidade funcionalidade = new Funcionalidade();
		funcionalidade.setId(new Long("1"));
		
		GrupoAcesso grupoAcesso = new GrupoAcesso();
		grupoAcesso.setId(new Long("1"));
		
		List<TipoPermissao> permissoes = acessoService.obterPermissoesPertencemFuncionalidade(funcionalidade,grupoAcesso);
		Assert.assertNotNull(permissoes);
		
	}
	
	@Test
	public void recuperarPermissoesNaoPertencemFuncionalidade() throws NumberFormatException, DaoException, NenhumRegistroEncontradoException{
		
		Funcionalidade funcionalidade = new Funcionalidade();
		funcionalidade.setId(new Long("1"));
		
		GrupoAcesso grupoAcesso = new GrupoAcesso();
		grupoAcesso.setId(new Long("1"));
		
		List<TipoPermissao> permissoes = acessoService.obterPermissoesNaoPertencemFuncionalidade(funcionalidade,grupoAcesso);
		Assert.assertNotNull(permissoes);
	}
	
	@Test
	public void recuperarPermissoesGerenciarPessoasUsuarios() throws DaoException, NenhumRegistroEncontradoException{
		
		Funcionalidade funcionalidade = new Funcionalidade();
		funcionalidade.setId(new Long("1"));
		
		GrupoAcesso grupoAcesso = new GrupoAcesso();
		grupoAcesso.setId(new Long("1"));
		
		List<TipoPermissao> permissoes = acessoService.obterPermissoesNaoPertencemFuncionalidade(funcionalidade,grupoAcesso);
		Assert.assertEquals(1, permissoes.size());
		
	}
	
	
	@Test
	public void salvarPermissoesSelecionadas() throws NenhumRegistroEncontradoException,ValidationException{
		
		TipoPermissao incluir = new TipoPermissao();
		incluir.setId(new Long("2"));
		
		TipoPermissao excluir = new TipoPermissao();
		excluir.setId(new Long("4"));
		
		List<TipoPermissao> permissoes = new ArrayList<TipoPermissao>();
		
		permissoes.add(incluir);
		permissoes.add(excluir);
		
		GrupoAcesso grupoAcesso = new GrupoAcesso();
		grupoAcesso.setId(new Long("1"));
		
		Funcionalidade funcionalidade = new Funcionalidade();
		funcionalidade.setId(new Long("1"));
		
		Usuario usuario = new Usuario();
		usuario.setId(new Long("1"));
		
		acessoService.salvarPermissoesSelecionadas(permissoes, grupoAcesso, funcionalidade, usuario);
		
	}
	
	@Test
	public void obterFuncionalidadesTipoModulo() throws NenhumRegistroEncontradoException{
		
		List<Funcionalidade> result = acessoService.obterFuncionalidadesTipoModulo();
		Assert.assertEquals(2, result.size());
	}
	
	@Test
	public void obterTodasFuncionalidadeUmModulo() throws NenhumRegistroEncontradoException{
		
		List<Funcionalidade> result = acessoService.obterTodasFuncionalidadesUmModulo(6);
		Assert.assertEquals(3, result.size());
	}
	
	
	@Test
	public void obterPermissoesCadastradas() throws DaoException, NenhumRegistroEncontradoException{
		
		Funcionalidade funcionalidade = new Funcionalidade();
		funcionalidade.setId(new Long("1"));
		
		List<TipoPermissao> permissoes = acessoService.obterPermissoesCadastradas(funcionalidade);
		Assert.assertNotNull(permissoes);
	}
	
	
	
}
