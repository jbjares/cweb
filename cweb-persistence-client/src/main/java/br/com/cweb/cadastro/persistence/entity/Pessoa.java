package br.com.cweb.cadastro.persistence.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.cweb.core.persistence.entity.EntityModel;
import br.com.cweb.seguranca.persistence.entity.Usuario;


@javax.persistence.TableGenerator(
        name="pessoaGen", 
        table="TABLESEQ_CAD_PESSOA", 
        pkColumnName="GEN_KEY", 
        valueColumnName="GEN_VALUE", 
        pkColumnValue="ID_PESSOA",
	    allocationSize=1
)

@Entity
@Table(name = "CAD_PESSOA")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="TP_PESSOA",discriminatorType=DiscriminatorType.INTEGER)
public class Pessoa extends EntityModel<Long>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 94527223482285909L;

	@Id
	@Column(name = "ID_PESSOA")
	@GeneratedValue(generator = "pessoaGen",strategy=GenerationType.TABLE)
	private Long id;
	
	
	@ManyToOne
	@JoinColumn(name="ID_PERFIL_COMISSAO")
	private PerfilComissao perfilComissao;

	
	@OneToOne
	@JoinColumn(name="ID_PESSOA_VINCULADORA")
	private Pessoa pessoaVinculadora;

	
	@ManyToOne
	@JoinColumn(name="ID_ATRIBUICAO")
	private Atribuicao atribuicao;
	
	
	
//	@Type(type="br.com.cweb.core.persistence.entity.GenericEnumUserType",
//			parameters=@Parameter(name = "enumClass", 
//			value = "br.com.cweb.cadastro.persistence.entity.TipoPessoa.java.TipoPessoa"))
	@Column(name="TP_PESSOA")
	private TipoPessoa tipoPessoa;

	@Column(name="ST_BONIFICACAO_CONTRATUAL")
	private Boolean possuiBonificacaoContratual;
	
	
	@OneToMany(mappedBy="pessoa",cascade=CascadeType.ALL)
	private List<Endereco> enderecos;
	
	@OneToMany(mappedBy="pessoa",cascade=CascadeType.ALL)
	private List<ContaBancaria> dadosBancarios;

	@OneToOne(mappedBy="pessoa",cascade=CascadeType.ALL)
	private Usuario usuario;
	
	@OneToOne(mappedBy="pessoa",cascade=CascadeType.ALL)
	private ArvoreFamiliar arvoreFamiliar;
	
	@OneToMany(mappedBy="pessoaVinculadora")
	private List<Pessoa> vinculados;
	
	public Pessoa() {}
	
	public Pessoa(Long id) {
		this.id=id;
	}

	public ArvoreFamiliar getArvoreFamiliar() {
		return arvoreFamiliar;
	}

	public void setArvoreFamiliar(ArvoreFamiliar arvoreFamiliar) {
		this.arvoreFamiliar = arvoreFamiliar;
	}

	public Boolean getPossuiBonificacaoContratual() {
		return possuiBonificacaoContratual;
	}

	public void setPossuiBonificacaoContratual(Boolean possuiBonificacaoContratual) {
		this.possuiBonificacaoContratual = possuiBonificacaoContratual;
	}

	public Atribuicao getAtribuicao() {
		return atribuicao;
	}

	public void setAtribuicao(Atribuicao atribuicao) {
		this.atribuicao = atribuicao;
	}

	public Pessoa getPessoaVinculadora() {
		return pessoaVinculadora;
	}

	public void setPessoaVinculadora(Pessoa pessoaVinculadora) {
		this.pessoaVinculadora = pessoaVinculadora;
	}

	public List<Pessoa> getVinculados() {
		return vinculados;
	}

	public void setVinculados(List<Pessoa> vinculados) {
		this.vinculados = vinculados;
	}

	@Override
	public void setId(Long id) {
		this.id=id;
	}

	@Override
	public Long getId() {
		return this.id;
	}

	public PerfilComissao getPerfilComissao() {
		return perfilComissao;
	}

	public void setPerfilComissao(PerfilComissao perfilComissao) {
		this.perfilComissao = perfilComissao;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<ContaBancaria> getDadosBancarios() {
		return dadosBancarios;
	}

	public void setDadosBancarios(List<ContaBancaria> dadosBancarios) {
		this.dadosBancarios = dadosBancarios;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
