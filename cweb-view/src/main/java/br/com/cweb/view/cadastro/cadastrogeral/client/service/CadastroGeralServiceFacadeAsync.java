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

public interface CadastroGeralServiceFacadeAsync{

	public void retornaListaEstados(AsyncCallback<List<Estado>> callback);
	
	public void retornaListaCidades(AsyncCallback<List<Cidade>> callback);
	
	public void retornaListaCidadesPorEstado(Long idEstado, AsyncCallback<List<Cidade>> callback);
	
	public void retornaListaBancos(AsyncCallback<List<InstituicaoFinanceira>> callback);
	
	public void retornaListaTipoConta(AsyncCallback<List<TipoConta>> callback);
	
	public void retornaListaPerfilComissao(AsyncCallback<List<PerfilComissao>> callback);
	
	public void retornaListaGrupoAcesso(AsyncCallback<List<GrupoAcesso>> callback);

	public void retornaListaAtribuicao(AsyncCallback<List<Atribuicao>> callback);
	
	public void retornaListaPessoa(AsyncCallback<List<Pessoa>> callback);
	
	public void retornaListaPaginadaPessoaFisicaJuridica(PagingLoadConfig config,PessoaFisicaJuridica pessoaFisicaJuridica, AsyncCallback<PagingLoadResult<PessoaFisicaJuridica>> callback);
	
	public void retornaListaPagianadaPessoa(PagingLoadConfig config, AsyncCallback<PagingLoadResult<Pessoa>> callback);
	
	public void retornaListarCpfCnpjPessoaPorTipoVinculacao(Long codigoTipoVinculacao, AsyncCallback<List<PessoaFisicaJuridica>> callback);
	
	public void gerarRelatorio(PessoaFisicaJuridica pessoaFisicaJuridica, TipoNomeRelatorio nome, TipoFormatoRelatorio formato, AsyncCallback<Void> callback);
	
	public void retornaListaAtribuicaoVinculado(AsyncCallback<List<Atribuicao>> callback);
	
	public void retornaListaAtribuicaoVinculador(Integer codigoHirarquicoDoVinculado, AsyncCallback<List<Atribuicao>> callback);

	public void recuperarUsuarioPorLogin(String login, AsyncCallback<Usuario> callback);	
	
	public void incluirPessoa(Pessoa pessoa, AsyncCallback<Long> callback);

	public void verificarSePessoaPossuiVinculados(Long idPessoa, AsyncCallback<Boolean> callback);

	public void exlcuirPessoa(Long idPessoa, AsyncCallback<Boolean> callback);
	
	public void retornarPessoa(Long idPessoa, AsyncCallback<Pessoa> callback);

	public void retornarPessoaFisicaJuridica(Long idPessoa, AsyncCallback<PessoaFisicaJuridica> callback);
	
	public void recuperarEnderecoPoridPessoa(Long idPessoa, AsyncCallback<Endereco> callback);
	
	public void recuperarDadosBancariosPoridPessoa(Long idPessoa, AsyncCallback<ContaBancaria> callback);
	
	public void recuperarUsuarioPoridPessoa(Long idPessoa, AsyncCallback<Usuario> callback);
	
	public void retornarPessoaFisicaJuridicaPorCpfCnpj(Long cpfCnpj, AsyncCallback<PessoaFisicaJuridica> callback);
	
	public void atualizarPessoa(Pessoa pessoa, AsyncCallback<Boolean> callback);
	
	public void retornaListaAtribuicao(String query,AsyncCallback callback);
	public void retornaListaEstados(String query,AsyncCallback callback);

}
