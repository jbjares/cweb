package br.com.cweb.seguranca.persistence.entity;

import java.io.Serializable;

/**
 * @author Sebastiao Nunes
 * @since 1.0
 */
public class MenuDTO implements Serializable, Comparable<MenuDTO> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private TipoFuncionalidade tipoFuncionlidade;
	private Integer pai;
	private String descricao;
	private String sigla;
	private String tooltip;
	private Long idGrupoAcesso;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoFuncionalidade getTipoFuncionalidade() {
		return tipoFuncionlidade;
	}

	public void setTipoFuncionalidade(TipoFuncionalidade tipoFuncionlidade) {
		this.tipoFuncionlidade = tipoFuncionlidade;
	}

	public Integer getPai() {
		return pai;
	}

	public void setPai(Integer pai) {
		this.pai = pai;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int compareTo(MenuDTO menu) {
		
		if (this.getTipoFuncionalidade().getValue() < menu.getTipoFuncionalidade().getValue()) {
			return -1;
		}
		if (this.getTipoFuncionalidade().getValue()  > menu.getTipoFuncionalidade().getValue()) {
			return 1;
		}
		return 0;

		
	}
	
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}

	public String getTooltip() {
		return tooltip;
	}

	public void setIdGrupoAcesso(Long idGrupoAcesso) {
		this.idGrupoAcesso = idGrupoAcesso;
	}

	public Long getIdGrupoAcesso() {
		return idGrupoAcesso;
	}
}
