package br.com.cweb.cadastro.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.cweb.core.persistence.entity.EntityModel;

//@javax.persistence.TableGenerator(
//        name="cidadeGen", 
//        table="TABLESEQ_CAD_CIDADE", 
//        pkColumnName="GEN_KEY", 
//        valueColumnName="GEN_VALUE", 
//        pkColumnValue="ID_CIDADE",
//	    allocationSize=1
//)

@Entity
@Table(name="CAD_CIDADE")
public class Cidade extends EntityModel<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7128833585529437013L;

	@Id
	//@GeneratedValue(generator = "cidadeGen",strategy=GenerationType.TABLE)
	@Column(name="ID_CIDADE")
	private Long id;

	@Column(name="AF_NOME")
	private String nome;

	@ManyToOne
	@JoinColumn(name="ID_ESTADO")
	private Estado estado;

	
	public Cidade() {}

	public Cidade(Long id) {
		this.id=id;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public void setId(Long id) {
		this.id=id;
	}

	@Override
	public Long getId() {
		return this.id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}

