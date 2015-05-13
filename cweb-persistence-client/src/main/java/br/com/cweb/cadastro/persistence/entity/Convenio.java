package br.com.cweb.cadastro.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.cweb.core.persistence.entity.EntityModel;

@javax.persistence.TableGenerator(
        name="convenioGen", 
        table="TABLESEQ_CAD_CONVENIO", 
        pkColumnName="GEN_KEY", 
        valueColumnName="GEN_VALUE", 
        pkColumnValue="ID_CONVENIO",
	    allocationSize=1
)

@Entity
@Table(name="CAD_CONVENIO")
public class Convenio extends EntityModel<Long>{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1295012586263865747L;

	@Id
	@Column(name="ID_CONVENIO")
	@GeneratedValue(generator = "convenioGen",strategy=GenerationType.TABLE)
	private Long id;

	@Column(name="AF_NOME")
	private String nome;
	
	public Convenio() {}

	public Convenio(Long id) {
		this.id=id;
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

	public String getSituacao(){
		
		if(getPossuiCadastroAtivo()){
			return "Ativo";
		}
		else{
			return "Inativo";
		}
	}
	
}

