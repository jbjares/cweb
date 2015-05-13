package br.com.cweb.cadastro.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.cweb.core.persistence.entity.EntityModel;


@javax.persistence.TableGenerator(
        name="enderecoGen", 
        table="TABLESEQ_CAD_ENDERECO", 
        pkColumnName="GEN_KEY", 
        valueColumnName="GEN_VALUE", 
        pkColumnValue="ID_ENDERECO",
	    allocationSize=1
)


@Entity
@Table(name = "CAD_ENDERECO")
public class Endereco extends EntityModel<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8702808082713887605L;

	@Id
	@Column(name="ID_ENDERECO")
	@GeneratedValue(generator = "enderecoGen",strategy=GenerationType.TABLE)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="ID_PESSOA")
	private Pessoa pessoa;
	
	@ManyToOne
	@JoinColumn(name="ID_CIDADE")
	private Cidade cidade;

	@Column(name="TP_ENDERECO")
	private TipoEndereco tipoEndereco;
	
	@Column(name="AF_DE_ENDERECO")
	private String endereco;
	
	@Column(name="AF_NUMERO")
	private String numero;
	
	@Column(name="NR_CEP")
	private Long cep;
	
	@Column(name="AF_BAIRRO")
	private String bairro;
	
	@Column(name="AF_EMAIL")
	private String email;
	
	@Column(name="AF_TELEFONE_FAX")
	private String fax;
	
	@Column(name="AF_TELEFONE_FIXO")
	private String telefoneFixo;
	
	@Column(name="AF_CELULAR")
	private String celular;
	
	@Column(name="AF_NM_RESPONSAVEL")
	private String nomeResponsavel;
	
	@Column(name="AF_TELEFONE_RESPONSAVEL")
	private String telefoneResponsavel;

	
	@Override
	public void setId(Long id) {
		this.id=id;
	}

	@Override
	public Long getId() {
		return this.id;
	}

	public TipoEndereco getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(TipoEndereco tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Long getCep() {
		return cep;
	}

	public void setCep(Long cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getTelefoneResponsavel() {
		return telefoneResponsavel;
	}

	public void setTelefoneResponsavel(String telefoneResponsavel) {
		this.telefoneResponsavel = telefoneResponsavel;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
