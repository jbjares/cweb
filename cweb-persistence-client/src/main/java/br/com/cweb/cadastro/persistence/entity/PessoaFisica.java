package br.com.cweb.cadastro.persistence.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "CAD_PESSOA_FISICA")
@DiscriminatorValue("0")
public class PessoaFisica extends Pessoa{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4571223236136882461L;
	
	@Column(name="AF_NOME")
	private String nome;
	
	@Column(name="NR_CPF")
	private String cpf;
	
	@Column(name="AF_APELIDO")
	private String apelido;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	
}
