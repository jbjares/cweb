package br.com.cweb.view.cadastro.cadastrogeral.client.service;

import java.util.List;

import br.com.cweb.cadastro.persistence.entity.Atribuicao;
import br.com.cweb.cadastro.persistence.entity.Cidade;
import br.com.cweb.cadastro.persistence.entity.ContaBancaria;
import br.com.cweb.cadastro.persistence.entity.Endereco;
import br.com.cweb.cadastro.persistence.entity.Estado;
import br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira;
import br.com.cweb.cadastro.persistence.entity.PerfilComissao;
import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica;
import br.com.cweb.cadastro.persistence.entity.TipoConta;
import br.com.cweb.relatorio.to.TipoFormatoRelatorio;
import br.com.cweb.relatorio.to.TipoNomeRelatorio;
import br.com.cweb.seguranca.persistence.entity.GrupoAcesso;
import br.com.cweb.seguranca.persistence.entity.Usuario;

import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("springGwtServices/CadastroGeralServiceFacade")
public interface CadastroGeralServiceFacade extends RemoteService{

	public List<Estado> retornaListaEstados();
	
	public List<Cidade> retornaListaCidades();
	
	public List<Cidade> retornaListaCidadesPorEstado(Long idEstado);
	
	public List<InstituicaoFinanceira> retornaListaBancos();
	
	public List<TipoConta> retornaListaTipoConta();
	
	public List<PerfilComissao> retornaListaPerfilComissao();
	
	public List<GrupoAcesso> retornaListaGrupoAcesso();

	public List<Atribuicao> retornaListaAtribuicao();
	
	public List<Pessoa> retornaListaPessoa();
	
	public PagingLoadResult<PessoaFisicaJuridica> retornaListaPaginadaPessoaFisicaJuridica(PagingLoadConfig config,PessoaFisicaJuridica pessoaFisicaJuridica);
	
	public PagingLoadResult<Pessoa> retornaListaPagianadaPessoa(PagingLoadConfig config);
	
	public List<PessoaFisicaJuridica> retornaListarCpfCnpjPessoaPorTipoVinculacao(Long codigoTipoVinculacao);
	
	public void gerarRelatorio(PessoaFisicaJuridica pessoaFisicaJuridica, TipoNomeRelatorio nome, TipoFormatoRelatorio formato);
	
	public List<Atribuicao> retornaListaAtribuicaoVinculado();
	
	public List<Atribuicao> retornaListaAtribuicaoVinculador(Integer codigoHirarquicoDoVinculado);

	public Usuario recuperarUsuarioPorLogin(String login);	
	
	public Long incluirPessoa(Pessoa pessoa);

	public Boolean verificarSePessoaPossuiVinculados(Long idPessoa);

	public Boolean exlcuirPessoa(Long idPessoa);
	
	public Pessoa retornarPessoa(Long idPessoa);

	public PessoaFisicaJuridica retornarPessoaFisicaJuridica(Long idPessoa);
	
	public Endereco recuperarEnderecoPoridPessoa(Long idPessoa);
	
	public ContaBancaria recuperarDadosBancariosPoridPessoa(Long idPessoa);
	
	public Usuario recuperarUsuarioPoridPessoa(Long idPessoa);
	
	public PessoaFisicaJuridica retornarPessoaFisicaJuridicaPorCpfCnpj(Long cpfCnpj);
	
	public Boolean atualizarPessoa(Pessoa pessoa);

	public List<Atribuicao> retornaListaAtribuicao(String query);
	
	public List<Estado> retornaListaEstados(String query);
}
