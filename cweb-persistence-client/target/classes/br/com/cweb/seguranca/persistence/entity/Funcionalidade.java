package br.com.cweb.seguranca.persistence.entity;

import java.util.*;

import javax.persistence.*;

import br.com.cweb.core.persistence.entity.EntityModel;

@javax.persistence.TableGenerator(
        name="funcionalidadeGen", 
        table="TABLESEQ_SEG_FUNCIONALIDADE", 
        pkColumnName="GEN_KEY", 
        valueColumnName="GEN_VALUE", 
        pkColumnValue="ID_FUNCIONALIDADE",
	    allocationSize=1
)

@Entity
@Table(name="SEG_FUNCIONALIDADE")
public class Funcionalidade  extends EntityModel<Long>{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_FUNCIONALIDADE")
	@GeneratedValue(generator = "funcionalidadeGen",strategy=GenerationType.TABLE)
	private Long id;
	
	@Column(name="NM_FUNCIONALIDADE")
	private String nome;
	
	@Column(name="PAI_FUNC")
	private Integer paiFuncionalidade;
	
	@Column(name="TIPO_FUNC")
	private Integer tipoFuncionalidade;
	
	@Column(name="SIGLA")
	private String sigla;
	
	@Column(name="TOOLTIP")
	private String tooltip;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="seg_funcionalidade_tipopermissao",joinColumns={@JoinColumn(name="id_funcionalidade")},
	inverseJoinColumns={@JoinColumn(name="id_tipo_permissao")})
	private Set<TipoPermissao> tipoPermissoes;
	
    public Integer getPaiFuncionalidade() {
		return paiFuncionalidade;
	}

	public void setPaiFuncionalidade(Integer paiFuncionalidade) {
		this.paiFuncionalidade = paiFuncionalidade;
	}

	public Integer getTipoFuncionalidade() {
		return tipoFuncionalidade;
	}

	public void setTipoFuncionalidade(Integer tipoFuncionalidade) {
		this.tipoFuncionalidade = tipoFuncionalidade;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public Long getId() {
		return this.id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getSigla() {
		return sigla;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}

	public String getTooltip() {
		return tooltip;
	}

	public void setTipoPermissoes(Set<TipoPermissao> tipoPermissoes) {
		this.tipoPermissoes = tipoPermissoes;
	}

	public Set<TipoPermissao> getTipoPermissoes() {
		return this.tipoPermissoes;
	}

}
