package br.com.cweb.seguranca.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import br.com.cweb.core.persistence.entity.EntityModel;

@javax.persistence.TableGenerator(
        name="acessomenuGen", 
        table="TABLESEQ_SEG_ACESSOMENU", 
        pkColumnName="GEN_KEY", 
        valueColumnName="GEN_VALUE", 
        pkColumnValue="ID_ACESSOMENU",
	    allocationSize=1
)

@Entity
@Table(name="SEG_ACESSO_MENU")
public class AcessoMenu extends EntityModel<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_ACESSO")
	@GeneratedValue(generator = "acessomenuGen",strategy=GenerationType.TABLE)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="ID_FUNCIONALIDADE")
	private Funcionalidade funcionalidade;
	
	@ManyToOne
	@JoinColumn(name="ID_TIPO_PERMISSAO")
	private TipoPermissao permissao;
	
	@ManyToOne
	@JoinColumn(name="ID_GRUPO_ACESSO")
	private GrupoAcesso grupoAcesso;
	
	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public Long getId() {
		return id;
	}

	public void setFuncionalidade(Funcionalidade funcionalidade) {
		this.funcionalidade = funcionalidade;
	}

	public Funcionalidade getFuncionalidade() {
		return funcionalidade;
	}

	public void setPermissao(TipoPermissao permissao) {
		this.permissao = permissao;
	}

	public TipoPermissao getPermissao() {
		return permissao;
	}

	public void setGrupoAcesso(GrupoAcesso grupoAcesso) {
		this.grupoAcesso = grupoAcesso;
	}

	public GrupoAcesso getGrupoAcesso() {
		return grupoAcesso;
	}

}
