package br.com.cweb.cadastro.persistence.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.cweb.core.persistence.entity.EntityModel;


//@javax.persistence.TableGenerator(
//        name="estadoGen", 
//        table="TABLESEQ_CAD_ESTADO", 
//        pkColumnName="GEN_KEY", 
//        valueColumnName="GEN_VALUE", 
//        pkColumnValue="ID_ESTADO",
//	    allocationSize=1
//)


@Entity
@Table(name="CAD_ESTADO")
public class Estado extends EntityModel<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7128833585529437013L;

	@Id
	@Column(name="ID_ESTADO")
//	@GeneratedValue(generator = "estadoGen",strategy=GenerationType.TABLE)
	private Long id;

	@Column(name="AF_NOME")
	private String nome;

	@Column(name="AF_SIGLA")
	private String sigla;
	
	@Column(name="AF_REGIAO")
	private String regiao;
	
	
	@OneToMany(mappedBy="estado")
	private List<Cidade> cidades; 

	public Estado() {}
	
	public Estado(Long id) {
		this.id=id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
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
