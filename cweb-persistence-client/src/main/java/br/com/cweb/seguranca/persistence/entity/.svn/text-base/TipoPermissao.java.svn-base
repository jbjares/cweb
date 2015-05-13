package br.com.cweb.seguranca.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.cweb.core.persistence.entity.EntityModel;

@javax.persistence.TableGenerator(
        name="tipopermissaoGen", 
        table="TABLESEQ_SEG_TIPOPERMISSAO", 
        pkColumnName="GEN_KEY", 
        valueColumnName="GEN_VALUE", 
        pkColumnValue="ID_TIPOPERMISSAO",
	    allocationSize=1
)

@Entity
@Table(name="SEG_TIPO_PERMISSAO")
public class TipoPermissao extends EntityModel<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_TIPO_PERMISSAO")
	@GeneratedValue(generator = "tipopermissaoGen",strategy=GenerationType.TABLE)
	private Long id;
	
	@Column(name="DE_TIPO_PERMISSAO")
	private String nome;
	
	@Column(name="SIGLA")
	private String sigla;
	
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

	

}
