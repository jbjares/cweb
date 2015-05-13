package br.com.cweb.cadastro.persistence.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import br.com.cweb.core.persistence.entity.EntityModel;

@javax.persistence.TableGenerator(
        name="atribuicaopessoaGen", 
        table="TABLESEQ_CAD_ATRIBUICAO_PESSOA", 
        pkColumnName="GEN_KEY", 
        valueColumnName="GEN_VALUE", 
        pkColumnValue="ID_ATRIBUICAO",
	    allocationSize=1
)

@Entity
@Table(name = "CAD_ATRIBUICAO")
public class Atribuicao extends EntityModel<Long>{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -587051333144223023L;

	@Id
	@Column(name="ID_ATRIBUICAO")
	@GeneratedValue(generator ="atribuicaopessoaGen" ,strategy=GenerationType.TABLE)
	private Long id;
	
	@Column(name="AF_NOME")
	private String nome;

	@Column(name="NR_HIERARQ")
	private Integer codigoHierarquico;

	
	public Atribuicao() {}

	public Atribuicao(Long id) {
		this.id=id;
	}

	public Integer getCodigoHierarquico() {
		return codigoHierarquico;
	}

	public void setCodigoHierarquico(Integer codigoHierarquico) {
		this.codigoHierarquico = codigoHierarquico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
