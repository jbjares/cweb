package br.com.cweb.seguranca.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.management.RuntimeErrorException;
import javax.validation.ValidationException;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import br.com.cweb.cadastro.persistence.dao.PessoaDAO;
import br.com.cweb.cadastro.persistence.dao.PessoaFisicaDAO;
import br.com.cweb.cadastro.persistence.dao.PessoaJuridicaDAO;
import br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar;
import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.cadastro.persistence.entity.TipoPessoa;
import br.com.cweb.cadastro.service.AcessoService;
import br.com.cweb.cadastro.service.to.RespostaEnumTO;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;
import br.com.cweb.seguranca.persistence.dao.AcessoMenuDAO;
import br.com.cweb.seguranca.persistence.dao.FuncionalidadeDAO;
import br.com.cweb.seguranca.persistence.dao.GrupoAcessoDAO;
import br.com.cweb.seguranca.persistence.dao.TipoPermissaoDAO;
import br.com.cweb.seguranca.persistence.dao.UsuarioDAO;
import br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO;
import br.com.cweb.seguranca.persistence.entity.AcessoMenu;
import br.com.cweb.seguranca.persistence.entity.Funcionalidade;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;
import br.com.cweb.seguranca.persistence.entity.TipoPermissao;
import br.com.cweb.seguranca.persistence.entity.Usuario;

@Service("usuarioService")
public class AcessoServiceImpl implements AcessoService {

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Autowired
	private GrupoAcessoDAO grupoAcessoDAO;
	
	@Autowired
	private PessoaDAO pessoaDAO;
	
	@Autowired
	private PessoaFisicaDAO pessoaFisicaDAO;
	
	@Autowired
	private PessoaJuridicaDAO pessoaJuridicaDAO;

	@Autowired
	private SegurancaServletServiceImpl servletServiceImpl;
	
	@Autowired
	private AcessoMenuDAO acessoMenuDAO;

	@Autowired
	private FuncionalidadeDAO funcionalidadeDAO;
	
	@Autowired
	private TipoPermissaoDAO tipoPermissaoDAO;
	
	public List<GrupoAcesso> recuperarGruposAcesso(){
		try {
			return grupoAcessoDAO.findAll();
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(),e);
		}
	}

	@Transactional
	public RespostaEnumTO logar(Usuario usuario,boolean anularSessao) {
		RespostaEnumTO RespostaEnumTO = logar(usuario);

		if (anularSessao && !RespostaEnumTO.equals(RespostaEnumTO.LOGADO)) {
			logoff();
		}

		return RespostaEnumTO;
	}

	@Transactional
	public RespostaEnumTO logar(Usuario usuario) {

		if (usuario == null) {

			throw new IllegalArgumentException("Usuario nao pode ser nulo.");

		} else if (usuario.getLogin() == null) {

			throw new IllegalArgumentException("Login nao pode ser nulo.");

		} else if (usuario.getSenha() == null) {

			throw new IllegalArgumentException("Senha nao pode ser nula.");

		} else if (usuario.getSenha().equals("")) {

			return RespostaEnumTO.SENHA_INCORRETA;
		}

		Usuario usuarioNoBanco = obterUsuarioNoBanco(usuario);


		if (usuarioNoBanco == null) {
			return RespostaEnumTO.USUARIO_NAO_EXISTE_NO_BANCO;
			
		} 
		
		if(!usuarioNoBanco.getPossuiCadastroAtivo()){
			return RespostaEnumTO.USUARIO_BLOQUEADO;
		}

//		if (RespostaEnumTO.equals(RespostaEnumTO.RESETAR_SENHA)) {
//			usuarioNoBanco.setResetarSenha(true);
//		}

		try {
			usuarioNoBanco.getPessoa().getArvoreFamiliar();
			usuarioNoBanco.getPessoa().getAtribuicao();
			usuarioNoBanco.getPessoa().getPessoaVinculadora();
			usuarioDAO.getHibernateTemplate().evict(usuarioNoBanco);
			atribuirSuperUsuario(usuarioNoBanco);
			servletServiceImpl.salvarUsuarioNaSessao(usuarioNoBanco);
			
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(),e);
		} 

		return RespostaEnumTO.LOGADO;
	}

	private void atribuirSuperUsuario(Usuario usuarioNoBanco) {
		try {
			if(usuarioNoBanco.getIdSuperUsuario()==null){return;}
			Pessoa superUsuario;
			superUsuario = pessoaDAO.findById(usuarioNoBanco.getIdSuperUsuario());
			ArvoreFamiliar arvoreFamiliar = new ArvoreFamiliar();
			arvoreFamiliar.setArvore(superUsuario.getArvoreFamiliar().getArvore());
			arvoreFamiliar.setNivel(superUsuario.getArvoreFamiliar().getNivel());
			usuarioNoBanco.getPessoa().setArvoreFamiliar(arvoreFamiliar);
			usuarioNoBanco.getPessoa().setAtribuicao(superUsuario.getAtribuicao());
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(),e);
		}
		
	}

	private boolean isLogar(RespostaEnumTO RespostaEnumTO) {
		return RespostaEnumTO.equals(RespostaEnumTO.LOGADO);
//				|| RespostaEnumTO.equals(RespostaEnumTO.RESETAR_SENHA);
	}

	@Transactional
	public Usuario obterUsuarioNoBanco(Usuario usuario) {
		return usuarioDAO.find(usuario.getLogin(),usuario.getSenha());
	}

	public Usuario obterUsuarioLogado() {
		return servletServiceImpl.obterUsuarioNaSessao();
	}

	public void logoff() {
		servletServiceImpl.anularSessao(false);
	}

	public Usuario obterUsuarioNoBanco(String login, String senha) {
		return obterUsuarioNoBanco(new Usuario(login,senha));
	}

	public Usuario obterUsuarioNoBanco(String login) {
		return usuarioDAO.find(login);
	}

	public String obterNomePessoa(Usuario usuario) {
		try{
			Usuario usuarioBanco = obterUsuarioNoBanco(usuario);
			Pessoa pessoausuario = usuarioBanco.getPessoa();
			if(TipoPessoa.FISICA.equals(pessoausuario.getTipoPessoa())){
				return pessoaFisicaDAO.findById(pessoausuario.getId()).getNome();
			}else{
				return pessoaJuridicaDAO.findById(pessoausuario.getId()).getNomeFantasia();
			}
			
		}catch(DaoException ex){
			throw new RuntimeException(ex.getMessage(),ex);
		}
		 
	}

	public GrupoAcesso recuperarGrupoAcesso(Long idGrupoAcesso) {
		
		GrupoAcesso grupoAcesso = null;
		try {
			grupoAcesso = grupoAcessoDAO.findById(idGrupoAcesso);
		} catch (DaoException ex) {
			throw new RuntimeException(ex.getMessage(),ex);
		}
		
		return grupoAcesso;
	}

	public void incluirGrupoAcesso(GrupoAcesso grupoAcesso){
		grupoAcessoDAO.create(grupoAcesso);
	}
	
	public void atualizarGrupoAcesso(GrupoAcesso grupoAcesso){
		grupoAcessoDAO.update(grupoAcesso);
		
	}
	
	public void excluirGrupoAcesso(GrupoAcesso grupoAcesso){
		
		grupoAcessoDAO.delete(grupoAcesso);
	}

	public void alterarSenha(Usuario usuario) {
		usuarioDAO.update(usuario);
	}

	public Pessoa obterPessoa(Usuario usuario) {
		
		try{
			Usuario usuarioBanco = obterUsuarioNoBanco(usuario);
			Pessoa pessoausuario = usuarioBanco.getPessoa();
			if(TipoPessoa.FISICA.equals(pessoausuario.getTipoPessoa())){
				return pessoaFisicaDAO.findById(pessoausuario.getId());
			}else{
				return pessoaJuridicaDAO.findById(pessoausuario.getId());
			}
			
		}catch(DaoException ex){
			throw new RuntimeException(ex.getMessage(),ex);
		}
	}
	
	public List<AcessoMenu> obterAcessosMenu(Long idGrupoAcesso){
		List<AcessoMenu> result = null;
		try {
			
			return result = acessoMenuDAO.findByIdGrupoAcesso(idGrupoAcesso);
		}
		 catch (NenhumRegistroEncontradoException ex) {
				return null;	
			}
		catch (DaoException ex) {
			throw new RuntimeException(ex.getMessage(),ex);
		}
	}
	
	public List<Funcionalidade> obterFuncionalidades() {
		
		List<Funcionalidade> result = null;;
		try {
			return result = funcionalidadeDAO.findAll();
		} catch (DaoException ex) {
			throw new RuntimeException(ex.getMessage(),ex);
		} catch (NenhumRegistroEncontradoException ex) {
			return null;
		}
	}

	public List<TipoPermissao> obterPermissoes(String codigoFunc) throws NumberFormatException, NenhumRegistroEncontradoException {
		
		List<AcessoMenu> acessosMenu = acessoMenuDAO.findByIdFuncionalidade(new Long(codigoFunc));
		List<TipoPermissao> result = new ArrayList<TipoPermissao>();
		
		for(AcessoMenu acm:acessosMenu){
			result.add(acm.getPermissao());
		}
		return result;
	}
	
	/**
	 * @author Sebastiao Nunes
	 * @since 1.0
	 * @param funcionalidade 
	 * @param grupoAcesso
	 * Recupera todas as permissoes de uma funcionalidade 
	 * que um Grupo de Acesso possui.
	 */
	
	public List<TipoPermissao> obterPermissoes(Funcionalidade funcionalidade,GrupoAcesso grupoAcesso)throws NumberFormatException, 
	NenhumRegistroEncontradoException, ValidationException{
		
		if((funcionalidade == null) || (funcionalidade.getId() == null)){
			throw new ValidationException("Informe uma funcionalidade");
		}
		
		if((grupoAcesso == null) || (grupoAcesso.getId() == null)){
			throw new ValidationException("Informe um Grupo de Acesso");
		}
		
		List<AcessoMenu> acessosMenu = acessoMenuDAO.obterAcessosPorFuncionalidadeGrupoAcesso(funcionalidade, grupoAcesso);
	
		List<TipoPermissao> result = new ArrayList<TipoPermissao>();
		
		for(AcessoMenu acm:acessosMenu){
			result.add(acm.getPermissao());
		}
		return result;
	}
	
	public List<TipoPermissao> obterPermissoes()throws NenhumRegistroEncontradoException,DaoException{
		
			List<TipoPermissao> result = tipoPermissaoDAO.findAll();
			return result;
	}
	

	
	public List<Funcionalidade> obterFuncionalidadesRotina(){
		
		List<Funcionalidade> funcionalidades;
		try {
			funcionalidades = funcionalidadeDAO.findAll();
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NenhumRegistroEncontradoException e) {
			// TODO Auto-generated catch blockh
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Funcionalidade> obterFuncionalidadesPorGrupoAcesso(Long idGrupoAcesso)throws NenhumRegistroEncontradoException,DaoException {

		List<AcessoMenu> listaAcessosMenu = acessoMenuDAO.findByIdGrupoAcesso(idGrupoAcesso);
		Set<Funcionalidade> funcionalidadesTemp = new LinkedHashSet<Funcionalidade>();
		
		for(AcessoMenu acessoMenu:listaAcessosMenu){
			funcionalidadesTemp.add(acessoMenu.getFuncionalidade());
		}
		List<Funcionalidade> funcionalidades = new ArrayList<Funcionalidade>(funcionalidadesTemp);
		
		return funcionalidades;
	}
	
	/**
	 * @param idGrupoAcesso - realiza a busca pelo identificador do
	 *  grupo de acesso.
	 * @return List<TipoPermissao> - retorna o conjunto de permissoes.
	 * que uma funcionalidade possui.
	 * @throws NenhumRegistroEncontradoException 
	 * @throws DaoException 
	 */
	public List<TipoPermissao> obterPermissoesPertencemFuncionalidade(Funcionalidade funcionalidade,GrupoAcesso grupoAcesso) throws DaoException, NenhumRegistroEncontradoException{
		
		if((funcionalidade == null) || (funcionalidade.getId() == null)){
			throw new IllegalArgumentException("Informe uma Funcionalidade.");
		}
		
		if((grupoAcesso == null) || (grupoAcesso.getId() == null)){
			throw new IllegalArgumentException("Informe um Grupo de Acesso.");
		}
		
		List<AcessoMenu> listaAcessosMenu = acessoMenuDAO.obterAcessosPorFuncionalidadeGrupoAcesso(funcionalidade, grupoAcesso);
		Set<TipoPermissao> listaPermissoesTemp = new LinkedHashSet<TipoPermissao>();
		
		for(AcessoMenu acessoMenu:listaAcessosMenu){
			listaPermissoesTemp.add(acessoMenu.getPermissao());
		}
		
		List<TipoPermissao> listaPermissoes = new ArrayList<TipoPermissao>(listaPermissoesTemp);
		
		return listaPermissoes;
	}
	
	/**
	 * 
	 * @param idFuncionalidade - Identificador da Funcionalidade.
	 * @return List<TipoPermissao> - retorna a lista de permissoes que nao pertencem
	 * a funcionalidade
	 * @throws NenhumRegistroEncontradoException 
	 * @throws DaoException 
	 */
	public List<TipoPermissao> obterPermissoesNaoPertencemFuncionalidade(Funcionalidade funcionalidade,GrupoAcesso grupoAcesso) throws DaoException, NenhumRegistroEncontradoException{
		
		if((funcionalidade == null) || (funcionalidade.getId() == null)){
			throw new IllegalArgumentException("Informe uma Funcionalidade.");
		}
		
		if((grupoAcesso == null) || (grupoAcesso.getId() == null)){
			throw new IllegalArgumentException("Informe um Grupo de Acesso.");
		}
		
		List<TipoPermissao> result = new ArrayList<TipoPermissao>(); ;
		
		try{
			List<TipoPermissao> permissoesPertencemFunc = obterPermissoesPertencemFuncionalidade(funcionalidade,grupoAcesso);
			funcionalidadeDAO.refresh(funcionalidade);
			Set<TipoPermissao> permissoesPermitidas = funcionalidade.getTipoPermissoes();
			
			if(permissoesPermitidas != null && permissoesPermitidas.size() > 0){
				permissoesPermitidas.removeAll(permissoesPertencemFunc);
				result = new ArrayList<TipoPermissao>(permissoesPermitidas); 
			}
		}
		catch (NenhumRegistroEncontradoException e) {
			return result;
		}
		catch (Exception e) {
			return result ;
		}
		return result;
	}

	/**
	 * @author Sebastiao Nunes
	 * @param funcionalidade
	 * @return List<TipoPermissao> 
	 * retorna as permissoes cadastradas de uma funcionalidade caso a mesma nao possua 
	 * nenhuma permissao vinculada.
	 */
	public List<TipoPermissao> obterPermissoesCadastradas(Funcionalidade funcionalidade){
		
		
		try {
			List<AcessoMenu> listaAcessosMenu = acessoMenuDAO.obterAcessosPorFuncionalidadeGrupoAcesso(funcionalidade, null);
		} catch (NenhumRegistroEncontradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		List<TipoPermissao> listaPermissoes = null;

		if((funcionalidade == null) || (funcionalidade.getId() == null) || (funcionalidade.getId() == 0)){
			throw new IllegalArgumentException("Informe uma funcionalidade");
		}
		else{
			funcionalidadeDAO.refresh(funcionalidade);
		}
		
		if(funcionalidade.getTipoPermissoes() == null || funcionalidade.getTipoPermissoes().size() == 0){
			throw new ValidationException("Funcionalidade nao possui permissoes cadastradas.");
		}
		else{
			listaPermissoes = new ArrayList<TipoPermissao>(funcionalidade.getTipoPermissoes());
		}
		
		return listaPermissoes;
	}
	
	/**
	 * Metodo para salvar as permissoes selecionadas pelo usuario.
	 * @param listaPermissoes - Novas Permissoes selecioandas pelo usuario. 
	 * @param grupoAcesso - Grupo de Acesso do usuario
	 * @param usuario - Informacoes do usuario
	 * @return boolean - retorna true caso o conjunto de permissoes seja persistida
	 * com sucesso.
	 * @throws NenhumRegistroEncontradoException 
	 */
	
	@Transactional
	public void salvarPermissoesSelecionadas(List<TipoPermissao> listaPermissoes,GrupoAcesso grupoAcesso,
			Funcionalidade funcionalidade,Usuario usuario) throws ValidationException{
		
		if(grupoAcesso == null || grupoAcesso.getId() == null){
			throw new IllegalArgumentException("Informe o Grupo de Acesso...");
		}
		
		if(funcionalidade == null || funcionalidade.getId() == null){
			throw new IllegalArgumentException("Informe a funcionalidade...");
		}
		
		if(usuario == null || usuario.getId() == null){
			throw new IllegalArgumentException("Informe o usuario...");
		}
		
		List<AcessoMenu> acessosMenu = new ArrayList<AcessoMenu>();
		
		try{
			acessosMenu = acessoMenuDAO.obterAcessosPorFuncionalidadeGrupoAcesso(funcionalidade, grupoAcesso);
		}
		catch (NenhumRegistroEncontradoException e) {
			
			if(listaPermissoes == null || listaPermissoes.size() == 0){
				throw new ValidationException("Operacao invalida. O Grupo de Acesso nao possui acesso e nenhuma permissao selecionada.");
			}
		}
		
		/* remmove antigas permissoes*/
		if(acessosMenu != null && acessosMenu.size() > 0){
			
			for(AcessoMenu acessoMenu:acessosMenu){
				
				if((acessoMenu != null) && (acessoMenu.getId() != null)){
					acessoMenuDAO.delete(acessoMenu);
				}
		
			}
		}
		
		/* insere novas permissoes */
		if(listaPermissoes != null && listaPermissoes.size() > 0){
			
			for(TipoPermissao tipoPermissao:listaPermissoes){
				
				AcessoMenu acessoMenu = new AcessoMenu();
				acessoMenu.setIdUsuarioAtualizador(usuario.getId());
				acessoMenu.setDataHoraAtualizacao(new Date());
				acessoMenu.setPossuiCadastroAtivo(true);
				
				acessoMenu.setFuncionalidade(funcionalidade);
				acessoMenu.setGrupoAcesso(grupoAcesso);
				acessoMenu.setPermissao(tipoPermissao);
				
				acessoMenuDAO.create(acessoMenu);
			}
		}
		
	}
	
	public List<Funcionalidade> obterFuncionalidadeTipoRotina() throws NenhumRegistroEncontradoException{
		
		List<Funcionalidade> result = funcionalidadeDAO.obterFuncionalidadesTipoRotina();
		return result;
	}
	
	public List<Funcionalidade> obterFuncionalidadesTipoModulo() throws NenhumRegistroEncontradoException{
		
		Integer tipoModulo = 1;
		List<Funcionalidade> result = funcionalidadeDAO.obterFuncionalidadesTipoModulo(tipoModulo);
		return result;
	}
	
	public List<Funcionalidade> obterTodasFuncionalidadesUmModulo(Integer idModulo) throws NenhumRegistroEncontradoException{
		
		if(idModulo == null || idModulo == 0){
			throw new ValidationException("Informe um modulo");
		}
		
		List<Funcionalidade> result = funcionalidadeDAO.obterTodasFuncionalidadesUmModulo(idModulo);
		return result;
	}
	
}
