package br.com.cweb.view.cadastro.cadastrogeral.server;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapperSingletonWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cweb.cadastro.persistence.entity.Atribuicao;
import br.com.cweb.cadastro.persistence.entity.Cidade;
import br.com.cweb.cadastro.persistence.entity.ContaBancaria;
import br.com.cweb.cadastro.persistence.entity.Endereco;
import br.com.cweb.cadastro.persistence.entity.Estado;
import br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira;
import br.com.cweb.cadastro.persistence.entity.PerfilComissao;
import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.cadastro.persistence.entity.PessoaFisica;
import br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica;
import br.com.cweb.cadastro.persistence.entity.PessoaJuridica;
import br.com.cweb.cadastro.persistence.entity.TipoConta;
import br.com.cweb.cadastro.service.AcessoService;
import br.com.cweb.cadastro.service.ComissaoService;
import br.com.cweb.cadastro.service.InstituicaoFinanceiraService;
import br.com.cweb.cadastro.service.LocalizacaoService;
import br.com.cweb.cadastro.service.OrganogramaService;
import br.com.cweb.core.persistence.entity.EntityModel;
import br.com.cweb.relatorio.service.RelatorioService;
import br.com.cweb.relatorio.to.TipoFormatoRelatorio;
import br.com.cweb.relatorio.to.TipoNomeRelatorio;
import br.com.cweb.seguranca.persistence.dao.UsuarioDAO;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;
import br.com.cweb.seguranca.persistence.entity.Usuario;
import br.com.cweb.view.cadastro.cadastrogeral.client.service.CadastroGeralServiceFacade;
import com.extjs.gxt.ui.client.data.BasePagingLoadResult;
import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;

@Service("CadastroGeralServiceFacade")
public class CadastroGeralServiceFacadeImpl implements
		CadastroGeralServiceFacade {

	@Autowired
	private LocalizacaoService localizacaoService;

	@Autowired
	private InstituicaoFinanceiraService instituicaoFinanceiraService;

	@Autowired
	private ComissaoService comissaoService;

	@Autowired
	private OrganogramaService organogramaService;

	@Autowired
	private AcessoService acessoService;

	@Autowired
	private RelatorioService relatorioService;

	public List<Estado> retornaListaEstados() {
		List<Estado> estados = localizacaoService.recuperarEstados();
		List<Estado> result = new ArrayList<Estado>();
		for (Estado estado : estados) {
			if (estado == null) {
				continue;
			}
			result.add(DozerBeanMapperSingletonWrapper.getInstance().map(
					estado, Estado.class));
		}
		return result;
	}

	public List<Cidade> retornaListaCidades() {
		List<Cidade> cidades = localizacaoService.recuperarCidades();
		List<Cidade> result = new ArrayList<Cidade>();
		for (Cidade cidade : cidades) {
			if (cidade == null) {
				continue;
			}
			result.add(DozerBeanMapperSingletonWrapper.getInstance().map(
					cidade, Cidade.class));
		}
		return result;
	}

	public List<Cidade> retornaListaCidadesPorEstado(Long idEstado) {
		List<Cidade> cidades = localizacaoService
				.recuperarCidadesPorEstado(idEstado);
		List<Cidade> result = new ArrayList<Cidade>();
		for (Cidade cidade : cidades) {
			if (cidade == null) {
				continue;
			}
			result.add(DozerBeanMapperSingletonWrapper.getInstance().map(
					cidade, Cidade.class));
		}
		return result;
	}

	public List<InstituicaoFinanceira> retornaListaBancos() {
		List<InstituicaoFinanceira> result = instituicaoFinanceiraService
				.recuperarBancos();
		return result;
	}

	public List<TipoConta> retornaListaTipoConta() {
		List<TipoConta> result = instituicaoFinanceiraService.recuperarTiposConta();
		return result;
	}

	public List<PerfilComissao> retornaListaPerfilComissao() {
		List<PerfilComissao> perfis = comissaoService.recuperarPerfisComissao();
		List<PerfilComissao> result = new ArrayList<PerfilComissao>();
		for (PerfilComissao perfil : perfis) {
			if (perfil == null) {
				continue;
			}
			result.add(DozerBeanMapperSingletonWrapper.getInstance().map(
					perfil, PerfilComissao.class));
		}
		return result;
	}

	public List<GrupoAcesso> retornaListaGrupoAcesso() {
		List<GrupoAcesso> retorno = acessoService.recuperarGruposAcesso();
		List<GrupoAcesso> result = new ArrayList<GrupoAcesso>();
		for (GrupoAcesso grupoAcessoRetorno : retorno) {
			if (grupoAcessoRetorno == null) {
				continue;
			}
			GrupoAcesso grupoAcessoResult = DozerBeanMapperSingletonWrapper
					.getInstance().map(grupoAcessoRetorno, GrupoAcesso.class);
			result.add(grupoAcessoResult);
		}
		return result;
	}

	public List<Atribuicao> retornaListaAtribuicao() {
		List<Atribuicao> result = organogramaService.recuperarAtribuicoes();
		return result;
	}

	public List<Pessoa> retornaListaPessoa() {
		List<Pessoa> retorno = organogramaService.recuperarPessoasOrganograma();
		List<Pessoa> result = new ArrayList<Pessoa>();
		for (Pessoa pessoaRetorno : retorno) {
			if (pessoaRetorno == null) {
				continue;
			}
			Pessoa pessoaResult = DozerBeanMapperSingletonWrapper.getInstance()
					.map(pessoaRetorno, Pessoa.class);
			result.add(pessoaResult);
		}
		return result;
	}

	public Usuario recuperarUsuarioPorLogin(String login) {
		Usuario usuario = acessoService.obterUsuarioNoBanco(login);
		if (usuario == null) {
			return null;
		}
		return DozerBeanMapperSingletonWrapper.getInstance().map(usuario,
				Usuario.class);
	}

	public PagingLoadResult<PessoaFisicaJuridica> retornaListaPaginadaPessoaFisicaJuridica(
			PagingLoadConfig config) {
		List<PessoaFisicaJuridica> result = organogramaService
				.recuperarPessoasFisicasJuridicasOrganograma();
		return getPagingLoadResult(result, config);
	}

	public PagingLoadResult<PessoaFisicaJuridica> retornaListaPaginadaPessoaFisicaJuridica(
			PagingLoadConfig config, PessoaFisicaJuridica pessoaFisicaJuridica) {
		Usuario usuario = acessoService.obterUsuarioLogado();
		pessoaFisicaJuridica.setIdPessoaUsuarioLogado(usuario.getPessoa()
				.getId());
		List<PessoaFisicaJuridica> result = organogramaService
				.recuperarPessoasFisicasJuridicasOrganograma(pessoaFisicaJuridica);
		return getPagingLoadResult(result, config);
	}

	public void gerarRelatorio(PessoaFisicaJuridica pessoaFisicaJuridica,
			TipoNomeRelatorio nome, TipoFormatoRelatorio formato) {
		relatorioService.gerarRelatorioCadastroGeral(pessoaFisicaJuridica,
				nome, formato);
	}

	public List<PessoaFisicaJuridica> retornaListarCpfCnpjPessoaPorTipoVinculacao(
			Long codigoTipoVinculacao) {
		return organogramaService
				.recuperarPessoasFisicasJuridicasOrganogramaPorCodigoAtribuicao(codigoTipoVinculacao);
	}

	public List<Atribuicao> retornaListaAtribuicaoVinculado() {
		return organogramaService
				.recuperarAtribuicoesInferioresAoUsuarioLogado();
	}

	public List<Atribuicao> retornaListaAtribuicaoVinculador(
			Integer codigoHirarquicoDoVinculado) {
		return organogramaService
				.recuperarAtribuicoesInferioresAoUsuarioLogadoESuperioresAInformada(codigoHirarquicoDoVinculado);
	}

	public PagingLoadResult<Pessoa> retornaListaPagianadaPessoa(
			PagingLoadConfig config) {
		List<Pessoa> listaPessoas = retornaListaPessoa();
		return getPagingLoadResult(listaPessoas, config);
	}

	private PagingLoadResult getPagingLoadResult(List lista,
			PagingLoadConfig config) {

		List pagePessoas = new ArrayList();
		int offset = config.getOffset();
		int limit = lista.size();

		/**
		 * verifica se o proximo deslocamento e maior que o total de paginas, se
		 * for ele retorna o ultimo registro como limit da pagina.
		 **/
		if (config.getLimit() > 0) {
			limit = Math.min(offset + config.getLimit(), limit);
		}

		for (int i = config.getOffset(); i < limit; i++) {
			pagePessoas.add(lista.get(i));
		}
		return new BasePagingLoadResult<Pessoa>(pagePessoas, offset,
				lista.size());
	}

	public Long incluirPessoa(Pessoa pessoa) {
		return organogramaService.incluirPessoa(pessoa);
	}

	public Boolean verificarSePessoaPossuiVinculados(Long idPessoa) {
		return organogramaService.verificarSePessoaPossuiVinculados(idPessoa);
	}

	public Boolean exlcuirPessoa(Long idPessoa) {
		return organogramaService.excluirPessoa(idPessoa);
	}

	public Pessoa retornarPessoa(Long idPessoa) {

		Pessoa pessoa = organogramaService.recuperarPessoa(idPessoa);
		return DozerBeanMapperSingletonWrapper.getInstance().map(pessoa,
				Pessoa.class);
	}

	public PessoaFisicaJuridica retornarPessoaFisicaJuridica(Long idPessoa) {
		return organogramaService.recuperarPessoaFisicaJuridica(idPessoa);
	}

	public Endereco recuperarEnderecoPoridPessoa(Long idPessoa) {
		Endereco endereco = organogramaService
				.recuperarEnderecoPoridPessoa(idPessoa);
		return endereco = DozerBeanMapperSingletonWrapper.getInstance().map(
				endereco, Endereco.class);
	}

	public ContaBancaria recuperarDadosBancariosPoridPessoa(Long idPessoa) {
		ContaBancaria contaBancaria = organogramaService
				.recuperarDadosBancariosPoridPessoa(idPessoa);
		return DozerBeanMapperSingletonWrapper.getInstance().map(contaBancaria,
				ContaBancaria.class);
	}

	public Usuario recuperarUsuarioPoridPessoa(Long idPessoa) {
		Usuario usuario = organogramaService
				.recuperarUsuarioPoridPessoa(idPessoa);
		return DozerBeanMapperSingletonWrapper.getInstance().map(usuario,
				Usuario.class);
	}

	public PessoaFisicaJuridica retornarPessoaFisicaJuridicaPorCpfCnpj(
			Long cpfCnpj) {
		return organogramaService.recuperarPessoaFisicaJuridica(cpfCnpj);
	}

	public Boolean atualizarPessoa(Pessoa pessoa) {
		try {
			Boolean result = organogramaService.atualizarPessoa(pessoa);
			return result;
		} catch (RuntimeException e) {
			System.out.println(e);
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public List<Atribuicao> retornaListaAtribuicao(String query) {
		
		List<Atribuicao> result = organogramaService.recuperarAtribuicoes(query);
		return result;
	}

	public List<Estado> retornaListaEstados(String query) {
		
		List<Estado> estados = localizacaoService.recuperarEstados(query);
		List<Estado> result = new ArrayList<Estado>();
		for (Estado estado : estados) {
			if (estado == null) {
				continue;
			}
			result.add(DozerBeanMapperSingletonWrapper.getInstance().map(
					estado, Estado.class));
		}
		return result;
	}
}
