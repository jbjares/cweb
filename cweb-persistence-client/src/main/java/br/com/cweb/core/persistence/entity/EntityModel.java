package br.com.cweb.core.persistence.entity;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


@MappedSuperclass
@SuppressWarnings("serial")
public abstract class EntityModel<T> implements Serializable {

	
	@Column(name="ID_USU_ATU")
	private Long idUsuarioAtualizador;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DH_ATU")
	private Date dataHoraAtualizacao;

	@Column(name = "ST_ATV")
	private Boolean possuiCadastroAtivo;
	
//	@Version
//	@Column(name = "NR_VER")
//	private Long versao;
	
	public abstract void setId(T id);
	
	public abstract T getId();
	
	public Long getIdUsuarioAtualizador() {
		return idUsuarioAtualizador;
	}

	public void setIdUsuarioAtualizador(Long idUsuarioAtualizador) {
		this.idUsuarioAtualizador = idUsuarioAtualizador;
	}

	public Date getDataHoraAtualizacao() {
		return dataHoraAtualizacao;
	}

	public void setDataHoraAtualizacao(Date dataHoraAtualizacao) {
		this.dataHoraAtualizacao = dataHoraAtualizacao;
	}

	public Boolean getPossuiCadastroAtivo() {
		return possuiCadastroAtivo;
	}

	public void setPossuiCadastroAtivo(Boolean possuiCadastroAtivo) {
		this.possuiCadastroAtivo = possuiCadastroAtivo;
	}

//	public Long getVersao() {
//		return versao;
//	}
//
//	public void setVersao(Long versao) {
//		this.versao = versao;
//	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || !(getClass().equals(obj.getClass())) )
			return false;
		EntityModel bean = (EntityModel) obj;
		return bean.getId().equals(this.getId());
	}

	@Override
	public int hashCode() {
		return 1;
	}
	
//	@Override
//	public int hashCode() {
//		return (((Integer)getId() * getClass().hashCode()) << 3) - 456;
//	}
}
