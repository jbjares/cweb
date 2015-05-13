package br.com.cweb.cadastro.persistence.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.cweb.core.persistence.entity.EntityModel;


@Entity
@Table(name = "CAD_INSTITUICAO_FINANCEIRA")
public class InstituicaoFinanceira extends EntityModel<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -587051333144223023L;

	@Id
	@Column(name="ID_BANCO")	
	private Long id;
	
	@Column(name="AF_NOME")
	private String nome;
	
	@Column(name="TP_INSTITUICAO")
	private TipoInstituicao tipoInstituicao;

	@Column(name="AF_SIGLA")
	private String sigla;
	
	@Column(name="AF_SITE")
	private String site;
	
/*	@OneToMany(mappedBy="banco", fetch = FetchType.EAGER)	
	private List<ContaBancaria> dependentes;
*/	
	@Column(name="DE_OBSERVACAO")
	private String observacoes;
	
	public InstituicaoFinanceira() {}

	public InstituicaoFinanceira(Long id) {
		this.id=id;
	}

	public TipoInstituicao getTipoInstituicao() {
		return tipoInstituicao;
	}

	public void setTipoInstituicao(TipoInstituicao tipoInstituicao) {
		this.tipoInstituicao = tipoInstituicao;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void setId(Long id) {
		this.id=id;
	}

	@Override
	public Long getId() {
		return this.id;
	}
	
	public String getSituacao(){
		if(getPossuiCadastroAtivo() == true){
			return "ATIVO";
		}else{
			return "INATIVO";
		}
	}
	
	public String getTipo(){
		if(this.tipoInstituicao == TipoInstituicao.BANCO){
			return "Banco";
		}else{
			return "Parceiro";
		}
	}

/*	public List<ContaBancaria> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<ContaBancaria> dependentes) {
		this.dependentes = dependentes;
	}
*/

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}	
}
