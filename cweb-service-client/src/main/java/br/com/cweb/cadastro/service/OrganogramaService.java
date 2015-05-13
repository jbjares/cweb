package br.com.cweb.cadastro.service;

import java.util.List;

import br.com.cweb.cadastro.persistence.entity.Atribuicao;
import br.com.cweb.cadastro.persistence.entity.ContaBancaria;
import br.com.cweb.cadastro.persistence.entity.Endereco;
import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.cadastro.persistence.entity.PessoaFisica;
import br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica;
import br.com.cweb.cadastro.persistence.entity.PessoaJuridica;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.seguranca.persistence.entity.Usuario;

public interface OrganogramaService {

	List<Atribuicao> recuperarAtribuicoes();

	List<Pessoa> recuperarPessoasOrganograma();
	
	List<PessoaFisicaJuridica> recuperarPessoasFisicasJuridicasOrganograma();

	List<PessoaFisicaJuridica> recuperarPessoasFisicasJuridicasOrganogramaPorCodigoAtribuicao(
			Long codigoTipoVinculacao);

	List<PessoaFisicaJuridica> recuperarPessoasFisicasJuridicasOrganograma(
			PessoaFisicaJuridica pessoaFisicaJuridica);

	List<Atribuicao> recuperarAtribuicoesInferioresAoUsuarioLogado();

	List<Atribuicao> recuperarAtribuicoesInferioresAoUsuarioLogadoESuperioresAInformada(
			Integer codigoHierarquicoAtribuicaoMaisBaixa);

	Long incluirPessoa(Pessoa pessoa);

	Boolean verificarSePessoaPossuiVinculados(Long idPessoa);

	Boolean excluirPessoa(Long idPessoa);

	Pessoa recuperarPessoa(Long idPessoa);

	PessoaFisicaJuridica recuperarPessoaFisicaJuridica(Long idPessoa);

	Endereco recuperarEnderecoPoridPessoa(Long idPessoa);
	
	ContaBancaria recuperarDadosBancariosPoridPessoa(Long idPessoa);

	Usuario recuperarUsuarioPoridPessoa(Long idPessoa);

	PessoaFisicaJuridica retornarPessoaFisicaJuridicaPorCpfCnpj(String cpfCnpj);
	
	Boolean atualizarPessoa(Pessoa pessoa);

	List<Atribuicao> recuperarAtribuicoes(String query);
}
