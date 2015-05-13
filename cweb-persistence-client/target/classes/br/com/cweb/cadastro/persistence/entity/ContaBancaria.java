package br.com.cweb.cadastro.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.com.cweb.core.persistence.entity.EntityModel;
import br.com.cweb.widgets.util.CpfCnpj;

@javax.persistence.TableGenerator(
        name="contabancariaGen", 
        table="TABLESEQ_CAD_CONTABANCARIA", 
        pkColumnName="GEN_KEY", 
        valueColumnName="GEN_VALUE", 
        pkColumnValue="ID_CONTA_BANCARIA",
	    allocationSize=1
)

@Entity
@Table(name = "CAD_CONTA_BANCARIA")
public class ContaBancaria extends EntityModel<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4818747690997515473L;

	@Id
	@Column(name="ID_CONTA_BANCARIA")
	@GeneratedValue(generator = "contabancariaGen",strategy=GenerationType.TABLE)
	private Long id;

	@ManyToOne
	@JoinColumn(name="ID_PESSOA")
	private Pessoa pessoa;
	
	@ManyToOne
	@JoinColumn(name="ID_BANCO")
	private InstituicaoFinanceira banco;

	@Column(name="TP_CONTA")
	private TipoConta tipoConta;
	
	@Column(name="AF_CD_AGENCIA")
	private String agencia;
	
	@Column(name="AF_CD_CONTA")
	private String conta;
	
	@Column(name="AF_NM_FAVORECIDO")
	private String nomeFavorecido;
	
	@Column(name="NR_CPF_CNPJ_FAVORECIDO")
	private String cpfCnpjFavorecido;
	
	@Transient
	private String cpfCnpjFavorecidoMascarado;
	
	
	
	public String getCpfCnpjFavorecidoMascarado() {
		CpfCnpj cpfCnpjMask = new CpfCnpj(cpfCnpjFavorecido.toString());
		return cpfCnpjMask.getCpfCnpj();
	}

	public void setCpfCnpjFavorecidoMascarado(String cpfCnpjFavorecidoMascarado) {
		this.cpfCnpjFavorecidoMascarado = cpfCnpjFavorecidoMascarado;
	}

	@Override
	public void setId(Long id) {
		this.id=id;
	}

	@Override
	public Long getId() {
		return this.id;
	}

	public InstituicaoFinanceira getBanco() {
		return banco;
	}

	public void setBanco(InstituicaoFinanceira banco) {
		this.banco = banco;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getNomeFavorecido() {
		return nomeFavorecido;
	}

	public void setNomeFavorecido(String nomeFavorecido) {
		this.nomeFavorecido = nomeFavorecido;
	}

	public String getCpfCnpjFavorecido() {
		return cpfCnpjFavorecido;
	}

	public void setCpfCnpjFavorecido(String cpfCnpjFavorecido) {
		this.cpfCnpjFavorecido = cpfCnpjFavorecido;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
