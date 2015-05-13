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


@javax.persistence.TableGenerator(
        name="perfilcomissaoGen", 
        table="TABLESEQ_CAD_PERFILCOMISSAO", 
        pkColumnName="GEN_KEY", 
        valueColumnName="GEN_VALUE", 
        pkColumnValue="ID_PERFIL_COMISSAO",
	    allocationSize=1
)

@Entity
@Table(name="CAD_PERFIL_COMISSAO")
public class PerfilComissao extends EntityModel<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4873052916830098088L;

	@Id
	@GeneratedValue(generator = "perfilcomissaoGen",strategy=GenerationType.TABLE)
	@Column(name="ID_PERFIL_COMISSAO")
	private Long id;
	
	@Column(name="AF_NOME")
	private String nome;
	
	@OneToMany(mappedBy="perfilComissao")
	private List<Pessoa> pessoas;

	
	public PerfilComissao() {}
	
	public PerfilComissao(Long id) {
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

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	
}
