package br.com.cweb.cadastro.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.cweb.core.persistence.entity.EntityModel;


@javax.persistence.TableGenerator(
	name="arvoreGen", 
	table="TABLESEQ_CAD_ARVOREFAMILIAR", 
	pkColumnName="GEN_KEY", 
	valueColumnName="GEN_VALUE", 
	pkColumnValue="ID_ARVORE_FAMILIAR",
	allocationSize=1
)

@Entity
@Table(name="CAD_ARVORE_FAMILIAR")
public class ArvoreFamiliar extends EntityModel<Long>{
	
	
	private static final long serialVersionUID = 8465141942353419026L;
	
	
	@Id
	@GeneratedValue(generator = "arvoreGen",strategy=GenerationType.TABLE)
	@Column(name="ID_ARVORE_FAMILIAR")
	private Long id;
	
	@OneToOne
	@JoinColumn(name="ID_PESSOA")
	private Pessoa pessoa;
	
	@Column(name="AF_ARVORE")
	private String arvore;
	
	@Column(name="NR_NIVEL")
	private Integer nivel;
	
	

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
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

	@Override
	public void setId(Long id) {
		this.id=id;
	}

	@Override
	public Long getId() {
		return this.id;
	}

}
