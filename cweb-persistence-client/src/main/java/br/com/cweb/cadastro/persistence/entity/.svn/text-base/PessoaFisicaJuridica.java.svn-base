package br.com.cweb.cadastro.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.com.cweb.widgets.util.CpfCnpj;


@Entity
@Table(name="V_PESSOA_FISICA_JURIDICA")
public class PessoaFisicaJuridica implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8271826256880573327L;

	@Id
	@Column(name="ID_PESSOA")
	private Long id;
	
	@Column(name="AF_NOME_RAZAO")	
	private String nomeRazaoSocial;
	
	@Column(name="NR_CPF_CNPJ")
	private String cpfCnpj;
	
	@Column(name="AF_TIPO")
	private String tipo;
	
	@Column(name="AF_NM_CIDADE")
	private String nomeCidade;

	@Column(name="AF_SIGLA_UF")
	private String siglaUF;
	
	@Column(name="AF_LOGIN")
	private String login;
	
	@Column(name="ID_PESSOA_PAI")
	private Long idPai;
	
	@Column(name="ID_ATRIBUICAO")
	private Long idAtribuicao;
	
	@Column(name="ST_CADASTRO_PESSOA")//
	private Boolean possuiCadastroPessoaAtivo;

	@Column(name="ST_CADASTRO_USUARIO")//
	private Boolean possuiCadastroUsuarioAtivo;
	
	@Column(name="TP_PESSOA")//
	private TipoPessoa tipoPessoa;
	
	@Column(name="AF_APELIDO_NOME_FANTASIA")//
	private String apelidoNomeFantasia;
	
	@Column(name="NR_CPF_CNPJ_PAI")//
	private String cpfCnpjPai;
	
	@Column(name="ID_GRUPO_ACESSO")//
	private Long idGrupoAcesso;
	
	@Column(name="AF_SIGLA_PJ")
	private String siglaPessoaJuridica;
	
	@Column(name="AF_ARVORE")
	private String arvore;
	
	@Column(name="NR_NIVEL")
	private Integer nivel;
	
	@Column(name="ID_SUPER_ATRIBUICAO")
	private Long idSuperAtribuicao;
	
	@Column(name="ID_SUPER_USUARIO")
	private Long idSuperUsuario;
	
	@Column(name="ID_ARVORE_FAMILIAR")
	private Long idAravore;

	@Transient
	private Boolean possuiUsuario;
	
	@Transient
	private Long idPessoaUsuarioLogado;

	@Transient
	private String cpfCnpjVinculante;
	
	@Transient
	private String cpfCnpjMascarado;

	public String getCpfCnpjMascarado() {
		CpfCnpj cpfCnpjMask = new CpfCnpj(cpfCnpj.toString());
		return cpfCnpjMask.getCpfCnpj();
	}

	public void setCpfCnpjMascarado(String cpfCnpjMascarado) {
		this.cpfCnpjMascarado = cpfCnpjMascarado;
	}

	public Long getIdSuperAtribuicao() {
		return idSuperAtribuicao;
	}

	public void setIdSuperAtribuicao(Long idSuperAtribuicao) {
		this.idSuperAtribuicao = idSuperAtribuicao;
	}

	public Long getIdSuperUsuario() {
		return idSuperUsuario;
	}

	public void setIdSuperUsuario(Long idSuperUsuario) {
		this.idSuperUsuario = idSuperUsuario;
	}

	public Long getIdPessoaUsuarioLogado() {
		return idPessoaUsuarioLogado;
	}

	public void setIdPessoaUsuarioLogado(Long idPessoaUsuarioLogado) {
		this.idPessoaUsuarioLogado = idPessoaUsuarioLogado;
	}

	public String getArvore() {
		return arvore;
	}

	public void setArvore(String arvore) {
		this.arvore = arvore;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Boolean getPossuiUsuario() {
		return possuiUsuario;
	}

	public void setPossuiUsuario(Boolean possuiUsuario) {
		this.possuiUsuario = possuiUsuario;
	}

	public Boolean getPossuiCadastroPessoaAtivo() {
		return possuiCadastroPessoaAtivo;
	}

	public void setPossuiCadastroPessoaAtivo(Boolean possuiCadastroPessoaAtivo) {
		this.possuiCadastroPessoaAtivo = possuiCadastroPessoaAtivo;
	}

	public Boolean getPossuiCadastroUsuarioAtivo() {
		return possuiCadastroUsuarioAtivo;
	}

	public void setPossuiCadastroUsuarioAtivo(Boolean possuiCadastroUsuarioAtivo) {
		this.possuiCadastroUsuarioAtivo = possuiCadastroUsuarioAtivo;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getApelidoNomeFantasia() {
		return apelidoNomeFantasia;
	}

	public void setApelidoNomeFantasia(String apelidoNomeFantasia) {
		this.apelidoNomeFantasia = apelidoNomeFantasia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdGrupoAcesso() {
		return idGrupoAcesso;
	}

	public void setIdGrupoAcesso(Long idGrupoAcesso) {
		this.idGrupoAcesso = idGrupoAcesso;
	}

	public String getSiglaPessoaJuridica() {
		return siglaPessoaJuridica;
	}

	public void setSiglaPessoaJuridica(String siglaPessoaJuridica) {
		this.siglaPessoaJuridica = siglaPessoaJuridica;
	}

	public Long getIdAtribuicao() {
		return idAtribuicao;
	}

	public void setIdAtribuicao(Long idAtribuicao) {
		this.idAtribuicao = idAtribuicao;
	}

	public String getNomeRazaoSocial() {
		return nomeRazaoSocial;
	}

	public void setNomeRazaoSocial(String nomeRazaoSocial) {
		this.nomeRazaoSocial = nomeRazaoSocial;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public String getSiglaUF() {
		return siglaUF;
	}

	public void setSiglaUF(String siglaUF) {
		this.siglaUF = siglaUF;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Long getIdPai() {
		return idPai;
	}

	public void setIdPai(Long idPai) {
		this.idPai = idPai;
	}

	public void setIdAravore(Long idAravore) {
		this.idAravore = idAravore;
	}

	public Long getIdAravore() {
		return idAravore;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getCpfCnpjPai() {
		return cpfCnpjPai;
	}

	public void setCpfCnpjPai(String cpfCnpjPai) {
		this.cpfCnpjPai = cpfCnpjPai;
	}

	public String getCpfCnpjVinculante() {
		return cpfCnpjVinculante;
	}

	public void setCpfCnpjVinculante(String cpfCnpjVinculante) {
		this.cpfCnpjVinculante = cpfCnpjVinculante;
	}

	
	
}