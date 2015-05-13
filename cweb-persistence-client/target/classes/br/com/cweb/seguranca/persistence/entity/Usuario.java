package br.com.cweb.seguranca.persistence.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.core.persistence.entity.EntityModel;

@javax.persistence.TableGenerator(
        name="usuarioGen", 
        table="TABLESEQ_SEG_USUARIO", 
        pkColumnName="GEN_KEY", 
        valueColumnName="GEN_VALUE", 
        pkColumnValue="ID_USUARIO",
	    allocationSize=1
)


@Entity
@Table(name="SEG_USUARIO")
public class Usuario extends EntityModel<Long>{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4513350104043871746L;
	
	public Usuario(){}
	
	public Usuario(String login, String senha){
		this.login=login;
		this.senha=senha;
	}

	@Id
	@Column(name="ID_USUARIO")
	@GeneratedValue(generator = "usuarioGen",strategy=GenerationType.TABLE)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="ID_GRUPO_ACESSO")
	private GrupoAcesso gupoAcesso;

	@OneToOne
	@JoinColumn(name="ID_PESSOA")
	private Pessoa pessoa;

	
	@Column(name="AF_LOGIN")
	private String login;
	
	@Column(name="AF_SENHA")
	private String senha;


	@Column(name="ID_SUP_USUA")
	private Long idSuperUsuario;

	
	@Override
	public void setId(Long id) {
		this.id=id;
	}

	@Override
	public Long getId() {
		return this.id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public GrupoAcesso getGupoAcesso() {
		return gupoAcesso;
	}

	public void setGupoAcesso(GrupoAcesso gupoAcesso) {
		this.gupoAcesso = gupoAcesso;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Long getIdSuperUsuario() {
		return idSuperUsuario;
	}

	public void setIdSuperUsuario(Long idSuperUsuario) {
		this.idSuperUsuario = idSuperUsuario;
	}
	
	
}
