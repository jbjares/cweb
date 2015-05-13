package br.com.cweb.seguranca.persistence.entity;

import java.io.Serializable;
import java.util.List;

public class AcessoGrupoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nomeFuncionalidade;
	private Long idFuncionalidade;
	
	private boolean isfnConsultar;
	private boolean isfnIncluir;
	private boolean isfnAlterar;
	private boolean isfnImprimir;
	private boolean isfnExcluir;
	
	private Long idGrupoAcesso;
	private Long idAcessoMenu;
	
	List<TipoPermissao> permissoes;
	
	public List<TipoPermissao> getPermissoes() {
		return permissoes;
	}
	public void setPermissoes(List<TipoPermissao> permissoes) {
		this.permissoes = permissoes;
	}
	public void setNomeFuncionalidade(String nomeFuncionalidade) {
		this.nomeFuncionalidade = nomeFuncionalidade;
	}
	public String getNomeFuncionalidade() {
		return nomeFuncionalidade;
	}
	public void setIdFuncionalidade(Long idFuncionalidade) {
		this.idFuncionalidade = idFuncionalidade;
	}
	public Long getIdFuncionalidade() {
		return idFuncionalidade;
	}
	public void setIsfnAlterar(boolean isfnAlterar) {
		this.isfnAlterar = isfnAlterar;
	}
	public boolean isIsfnAlterar() {
		return isfnAlterar;
	}
	public void setIsfnIncluir(boolean isfnIncluir) {
		this.isfnIncluir = isfnIncluir;
	}
	public boolean isIsfnIncluir() {
		return isfnIncluir;
	}
	public void setIsfnConsultar(boolean isfnConsultar) {
		this.isfnConsultar = isfnConsultar;
	}
	public boolean isIsfnConsultar() {
		return isfnConsultar;
	}
	public void setIsfnExcluir(boolean isfnExcluir) {
		this.isfnExcluir = isfnExcluir;
	}
	public boolean isIsfnExcluir() {
		return isfnExcluir;
	}
	public void setIsfnImprimir(boolean isfnImprimir) {
		this.isfnImprimir = isfnImprimir;
	}
	public boolean isIsfnImprimir() {
		return isfnImprimir;
	}
	public void setIdGrupoAcesso(Long idGrupoAcesso) {
		this.idGrupoAcesso = idGrupoAcesso;
	}
	public Long getIdGrupoAcesso() {
		return idGrupoAcesso;
	}
	public void setIdAcessoMenu(Long idAcessoMenu) {
		this.idAcessoMenu = idAcessoMenu;
	}
	public Long getIdAcessoMenu() {
		return idAcessoMenu;
	}
	
	
}
