package br.com.cweb.cadastro.persistence.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "CAD_PESSOA_JURIDICA")
@DiscriminatorValue("1")
public class PessoaJuridica extends Pessoa{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 937569115013709879L;
	
	@Column(name="AF_NM_RAZAO_SOCIAL")
	private String razaoSocial;
	
	@Column(name="NR_CNPJ")
	private String cnpj;
	
	@Column(name="AF_NM_FANTASIA")
	private String nomeFantasia;
	
	@Column(name="AF_SIGLA")
	private String sigla;


	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	
}
