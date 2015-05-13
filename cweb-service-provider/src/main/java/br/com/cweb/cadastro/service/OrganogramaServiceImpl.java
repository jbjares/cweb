package br.com.cweb.cadastro.service;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.TreeMap;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.text.StrSubstitutor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cweb.cadastro.persistence.dao.ArvoreFamiliarDAO;
import br.com.cweb.cadastro.persistence.dao.AtribuicaoDAO;
import br.com.cweb.cadastro.persistence.dao.CidadeDAO;
import br.com.cweb.cadastro.persistence.dao.DadosBancariosDAO;
import br.com.cweb.cadastro.persistence.dao.EnderecoDAO;
import br.com.cweb.cadastro.persistence.dao.EstadoDAO;
import br.com.cweb.cadastro.persistence.dao.InstituicaoFinanceiraDAO;
import br.com.cweb.cadastro.persistence.dao.PerfilComissaoDAO;
import br.com.cweb.cadastro.persistence.dao.PessoaDAO;
import br.com.cweb.cadastro.persistence.dao.PessoaFisicaJuridicaDAO;
import br.com.cweb.cadastro.persistence.dao.PessoaJuridicaDAO;
import br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar;
import br.com.cweb.cadastro.persistence.entity.Atribuicao;
import br.com.cweb.cadastro.persistence.entity.Cidade;
import br.com.cweb.cadastro.persistence.entity.ContaBancaria;
import br.com.cweb.cadastro.persistence.entity.Endereco;
import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica;
import br.com.cweb.cadastro.persistence.entity.TipoEndereco;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;
import br.com.cweb.seguranca.persistence.dao.GrupoAcessoDAO;
import br.com.cweb.seguranca.persistence.dao.UsuarioDAO;
import br.com.cweb.seguranca.persistence.entity.Usuario;

@Service("organogramaService")
public class OrganogramaServiceImpl implements ApplicationContextAware, OrganogramaService {

	@Autowired
	private AtribuicaoDAO atribuicaoDAO;

	@Autowired
	private PessoaDAO pessoaDAO;

	@Autowired
	private PessoaFisicaJuridicaDAO pessoaFisicaJuridicaDAO;

	@Autowired
	private AcessoService acessoService;

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

	@Autowired
	private DadosBancariosDAO dadosBancariosDAO;
	
	@Autowired(required = false)
	private MailSender mailSender;
	
	private ApplicationContext applicationContext;

	public List<Atribuicao> recuperarAtribuicoes() {
		try {
			return atribuicaoDAO.findAll();
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public List<Atribuicao> recuperarAtribuicoesInferioresAoUsuarioLogado() {
		try {
			Usuario usuario = acessoService.obterUsuarioLogado();
			return atribuicaoDAO.findAllMenosGraduadas(usuario.getPessoa()
					.getAtribuicao().getCodigoHierarquico());

		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public List<Atribuicao> recuperarAtribuicoesInferioresAoUsuarioLogadoESuperioresAInformada(
			Integer codigoHierarquicoAtribuicaoMaisBaixa) {
		try {
			Usuario usuario = acessoService.obterUsuarioLogado();
			return atribuicaoDAO.findAllGraduadosEntreDoisExtremos(usuario
					.getPessoa().getAtribuicao().getCodigoHierarquico(),
					codigoHierarquicoAtribuicaoMaisBaixa);

		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public List<Pessoa> recuperarPessoasOrganograma() {
		try {
			return pessoaDAO.findAll();
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public List<PessoaFisicaJuridica> recuperarPessoasFisicasJuridicasOrganograma() {
		try {
			return pessoaFisicaJuridicaDAO.findAll();
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public List<PessoaFisicaJuridica> recuperarPessoasFisicasJuridicasOrganogramaPorCodigoAtribuicao(
			Long codigoTipoVinculacao) {
		List<PessoaFisicaJuridica> result;
		try {
			Usuario usuario = acessoService.obterUsuarioLogado();
			result = pessoaFisicaJuridicaDAO.findAllByCodigoAtribuicao(
					codigoTipoVinculacao, usuario);
			return result;

		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public List<PessoaFisicaJuridica> recuperarPessoasFisicasJuridicasOrganograma(
			PessoaFisicaJuridica pessoaFisicaJuridica) {
		List<PessoaFisicaJuridica> result;
		try {
			Usuario usuario = acessoService.obterUsuarioLogado();
			result = pessoaFisicaJuridicaDAO.findAll(pessoaFisicaJuridica,
					usuario.getPessoa());
			return result;

		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	@Transactional
	public Boolean verificarSePessoaPossuiVinculados(Long idPessoa) {
		try {
			Pessoa pessoa = pessoaDAO.findById(idPessoa);
			if (pessoa.getVinculados() == null) {
				return false;
			}
			List<Pessoa> vinculados = pessoa.getVinculados();
			return !vinculados.isEmpty();
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public Boolean excluirPessoa(Long idPessoa) {
		try {
			pessoaDAO.delete(pessoaDAO.findById(idPessoa));
			Pessoa pessoa = pessoaDAO.findById(idPessoa);
			return pessoa == null;
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	@Transactional
	public Long incluirPessoa(Pessoa pessoa) {

		try {
			Usuario usuarioLogado = acessoService.obterUsuarioLogado();
			
			Atribuicao atribuicao = atribuicaoDAO.findById(pessoa.getAtribuicao().getId());
			pessoa.setAtribuicao(atribuicaoDAO.findById(pessoa.getAtribuicao().getId()));
			ContaBancaria contaBancaria = pessoa.getDadosBancarios().get(0);
			contaBancaria.setBanco(instituicaoFinanceiraDAO.findById(contaBancaria.getBanco().getId()));

			// TODO criar um interceptor do hibernate para isto:
			contaBancaria.setDataHoraAtualizacao(new Date());
			contaBancaria.setIdUsuarioAtualizador(usuarioLogado.getId());
			contaBancaria.setPossuiCadastroAtivo(true);

			if(pessoa.getPerfilComissao()!=null){
				pessoa.setPerfilComissao(perfilComissaoDAO.findById(pessoa.getPerfilComissao().getId()));
			}
			
			Pessoa pessoaVinculadora = pessoaDAO.findById(pessoa.getPessoaVinculadora().getId());
			
			pessoa.setPessoaVinculadora(pessoaVinculadora);

			// TODO criar um interceptor do hibernate para isto:
			pessoa.setDataHoraAtualizacao(new Date());
			pessoa.setIdUsuarioAtualizador(usuarioLogado.getPessoa().getId());
			pessoa.setPossuiCadastroAtivo(true);

			Endereco endereco = pessoa.getEnderecos().get(0);
			Usuario usuario = pessoa.getUsuario();
			ContaBancaria conta = pessoa.getDadosBancarios().get(0);

			pessoa.setDadosBancarios(Collections.EMPTY_LIST);
			pessoa.setEnderecos(Collections.EMPTY_LIST);
			pessoa.setUsuario(null);
			pessoa.setArvoreFamiliar(null);

			Long idPessoaCadastrada = pessoaDAO.create(pessoa);
			Pessoa pessoaCadastrada = pessoaDAO.findById(idPessoaCadastrada);
			
			conta.setPessoa(pessoaCadastrada);
			// TODO criar um interceptor do hibernate para isto:
			conta.setDataHoraAtualizacao(new Date());
			conta.setIdUsuarioAtualizador(usuarioLogado.getId());
			conta.setPossuiCadastroAtivo(true);
			dadosBancariosDAO.create(conta);
			
			
			endereco.setPessoa(pessoaCadastrada);
			endereco.setTipoEndereco(TipoEndereco.CORRESPONDENCIA);
			Cidade cidade = cidadeDAO.findById(endereco.getCidade().getId());
			cidade.setEstado(estadoDAO.findById(cidade.getEstado().getId()));
			endereco.setCidade(cidade);
			// TODO criar um interceptor do hibernate para isto:
			endereco.setDataHoraAtualizacao(new Date());
			endereco.setIdUsuarioAtualizador(usuarioLogado.getId());
			endereco.setPossuiCadastroAtivo(true);
			enderecoDAO.create(endereco);

			usuario.setPessoa(pessoaCadastrada);
			if ((usuario.getIdSuperUsuario() != null)&& ("999999999".equals(usuario.getIdSuperUsuario().toString()))) {
				usuario.setIdSuperUsuario(usuarioLogado.getPessoa().getId());
			}
			if ((usuario.getSenha() != null)&& ("999999999".equals(usuario.getSenha().toString()))) {
				String senha = gerarSenha();
				usuario.setSenha(senha);
				
				if(endereco==null || endereco.getEmail()==null || "".equals(endereco.getEmail())){
					throw new RuntimeException("A pessoa cadastrada nao possui email, para o envio da senha!");
				}
				
				String email = endereco.getEmail();					
				eviarSenhaPorEmail(email,senha);
			}
			// TODO criar um interceptor do hibernate para isto:
			usuario.setDataHoraAtualizacao(new Date());
			usuario.setIdUsuarioAtualizador(usuarioLogado.getId());
			usuario.setPossuiCadastroAtivo(true);
			usuario.setGupoAcesso(grupoAcessoDAO.findById(usuario
					.getGupoAcesso().getId()));
			usuarioDAO.create(usuario);

			ArvoreFamiliar arvoreFamiliar = new ArvoreFamiliar();
			
			arvoreFamiliar.setArvore(pessoaVinculadora.getArvoreFamiliar().getArvore() + pessoaVinculadora.getId() + ";");
			
			//Caso seja uma matriz cadastrando outra matriz o nivel é o mesmo.
			if(atribuicao.getCodigoHierarquico().equals(new Integer(1))){
				arvoreFamiliar.setNivel(pessoaVinculadora.getArvoreFamiliar().getNivel());
			}else{
				arvoreFamiliar.setNivel(pessoaVinculadora.getArvoreFamiliar().getNivel() + 1);
			}
			
			arvoreFamiliar.setPessoa(pessoaCadastrada);
			// TODO criar um interceptor do hibernate para isto:
			arvoreFamiliar.setDataHoraAtualizacao(new Date());
			arvoreFamiliar.setIdUsuarioAtualizador(usuarioLogado.getId());
			arvoreFamiliar.setPossuiCadastroAtivo(true);
			arvoreFamiliarDAO.create(arvoreFamiliar);

			return idPessoaCadastrada;
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	@Transactional
	public Pessoa recuperarPessoa(Long idPessoa) {
		try {
			Pessoa pessoa = pessoaDAO.findById(idPessoa);
			pessoa.setVinculados(Collections.EMPTY_LIST);
			pessoa.setArvoreFamiliar(null);
			return pessoa;
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public PessoaFisicaJuridica recuperarPessoaFisicaJuridica(Long idPessoa) {
		try {
			return pessoaFisicaJuridicaDAO.findById(idPessoa);
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	/* urgente */
	public Endereco recuperarEnderecoPoridPessoa(Long idPessoa) {

		try {
			return enderecoDAO.findByIdPessoa(idPessoa);
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		} catch (NenhumRegistroEncontradoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public ContaBancaria recuperarDadosBancariosPoridPessoa(Long idPessoa) {

		try {
			return dadosBancariosDAO.findByIdPessoa(idPessoa);
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		} catch (NenhumRegistroEncontradoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public Usuario recuperarUsuarioPoridPessoa(Long idPessoa) {

		try {
			return usuarioDAO.findByIdPessoa(idPessoa);
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		} catch (NenhumRegistroEncontradoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public PessoaFisicaJuridica retornarPessoaFisicaJuridicaPorCpfCnpj(
			String cpfCnpj) {

		try {
			return pessoaFisicaJuridicaDAO.findByCpfCnpj(cpfCnpj);
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	@Transactional
	public Boolean atualizarPessoa(Pessoa pessoa) {

		try {
			Endereco endereco = null;
			Usuario usuarioLogado = acessoService.obterUsuarioLogado();

			ContaBancaria contaBancaria = pessoa.getDadosBancarios().get(0);

			contaBancaria.setDataHoraAtualizacao(new Date());
			contaBancaria.setIdUsuarioAtualizador(usuarioLogado.getId());
			contaBancaria.setPessoa(pessoa);

			pessoa.setDataHoraAtualizacao(new Date());
			pessoa.setIdUsuarioAtualizador(usuarioLogado.getPessoa().getId());

			endereco = pessoa.getEnderecos().get(0);
			Usuario usuario = pessoa.getUsuario();

			pessoa.setEnderecos(Collections.EMPTY_LIST);
			pessoa.setUsuario(null);
			pessoa.setArvoreFamiliar(null);
			pessoa.setDadosBancarios(null);

			pessoaDAO.update(pessoa);
			dadosBancariosDAO.update(contaBancaria);

			endereco.setPessoa(pessoa);
			endereco.setTipoEndereco(TipoEndereco.CORRESPONDENCIA);
			endereco.setDataHoraAtualizacao(new Date());
			endereco.setIdUsuarioAtualizador(usuarioLogado.getId());

			enderecoDAO.update(endereco);

			usuario.setPessoa(pessoa);

			if ((usuario.getIdSuperUsuario() != null) && ("999999999".equals(usuario.getIdSuperUsuario().toString()))) {
				usuario.setIdSuperUsuario(usuarioLogado.getPessoa().getId());
			}
			if ((usuario.getSenha() != null) && ("999999999".equals(usuario.getSenha().toString()))) {
				String senha = gerarSenha();
				usuario.setSenha(senha);
				
				if(endereco==null || endereco.getEmail()==null || "".equals(endereco.getEmail())){
					throw new RuntimeException("A pessoa cadastrada nao possui email, para o envio da senha!");
				}
				
				String email = endereco.getEmail();					
				eviarSenhaPorEmail(email,senha);
			}

			usuario.setDataHoraAtualizacao(new Date());
			usuario.setIdUsuarioAtualizador(usuarioLogado.getId());

			usuarioDAO.update(usuario);

			Pessoa pessoaVinculadora = pessoa.getPessoaVinculadora();

			Atribuicao atribuicao = atribuicaoDAO.findById(pessoa.getAtribuicao().getId());
			ArvoreFamiliar arvoreFamiliar = pessoaVinculadora.getArvoreFamiliar();
			
			arvoreFamiliar.setArvore(pessoaVinculadora.getArvoreFamiliar().getArvore() + pessoaVinculadora.getId() + ";");
			
			//Caso seja uma matriz cadastrando outra matriz o nivel é o mesmo.
			if(atribuicao.getCodigoHierarquico().equals(new Integer(1))){
				arvoreFamiliar.setNivel(pessoaVinculadora.getArvoreFamiliar().getNivel());
			}else{
				arvoreFamiliar.setNivel(pessoaVinculadora.getArvoreFamiliar().getNivel() + 1);
			}
			
			arvoreFamiliar.setPessoa(pessoa);

			arvoreFamiliar.setDataHoraAtualizacao(new Date());
			arvoreFamiliar.setIdUsuarioAtualizador(usuarioLogado.getId());
			arvoreFamiliar.setPossuiCadastroAtivo(true);
			pessoaDAO.update(pessoa);

			Pessoa p = pessoaDAO.findById(pessoa.getId());
			return p != null;

		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(), e);
		}

	}
	

	private void eviarSenhaPorEmail(String email, String senha) {
		SimpleMailMessage templateMailMessage = (SimpleMailMessage) applicationContext.getBean("templateMessage");
		templateMailMessage.setTo(email);
		templateMailMessage.setText(getTexto(senha));
		mailSender.send(templateMailMessage);
	}

	private String getTemplateConteudo(
			org.springframework.core.io.Resource resource) {
		try {
			return IOUtils.toString(resource.getInputStream(), "UTF-8");
		} catch (Exception exc) {
			throw new RuntimeException(exc);
		}
	}
	private String getTexto(String novaSenha) {
		
		String templateConteudo = getTemplateConteudo(applicationContext
				.getResource("classpath:/templateMensagem.txt"));
		Map<String, Object> args = new TreeMap<String, Object>();

		args.put("senha", novaSenha);

		return StrSubstitutor.replace(templateConteudo, args);
	}
	public String gerarSenha() {

		final int limite = 10;
		final int tamanhoSenha = 8;
		
		StringBuilder builder = new StringBuilder();
		Random random = new Random();
		
		for (int i = 0; i < tamanhoSenha; i++) {

			builder.append(random.nextInt(limite));
		}

		return builder.toString();
	}

	public void setApplicationContext(ApplicationContext appContext)throws BeansException {
		this.applicationContext = appContext;
	}
	
	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	public List<Atribuicao> recuperarAtribuicoes(String query) {
		
		List<Atribuicao> result;
		
		try {
			
			if(!StringUtils.isBlank(query)){
				result = atribuicaoDAO.findAll(query);
			}
			else{
				result = atribuicaoDAO.findAll();
			}
		} catch (DaoException e) {
			throw new RuntimeException(e);
		}
		
		return result;
	}
		
}
	


