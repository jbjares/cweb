package br.com.cweb.seguranca.persistence.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.core.persistence.entity.EntityModel;


@javax.persistence.TableGenerator(
        name="grupoacessoGen", 
        table="TABLESEQ_SEG_GRUPOACESSO", 
        pkColumnName="GEN_KEY", 
        valueColumnName="GEN_VALUE", 
        pkColumnValue="ID_GRUPO_ACESSO",
	    allocationSize=1
)

@Entity
@Table(name="SEG_GRUPO_ACESSO")
public class GrupoAcesso extends EntityModel<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1382535332198498476L;

	@Id
	@Column(name="ID_GRUPO_ACESSO")
	@GeneratedValue(generator = "grupoacessoGen",strategy=GenerationType.TABLE)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="ID_PESSOA")
	private Pessoa pessoaResponsavel;
	
	@OneToMany(mappedBy="gupoAcesso")
	private List<Usuario> usuarios;
	
	@Column(name="AF_NOME")
	private String nome;
	
	public GrupoAcesso() {}
	
	public GrupoAcesso(Long id) {
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

	public Pessoa getPessoaResponsavel() {
		return pessoaResponsavel;
	}

	public void setPessoaResponsavel(Pessoa pessoaResponsavel) {
		this.pessoaResponsavel = pessoaResponsavel;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
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
