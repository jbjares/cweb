package br.com.cweb.cadastro.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PessoaFisicaJuridica_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getApelidoNomeFantasia(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::apelidoNomeFantasia;
  }-*/;
  
  private static native void setApelidoNomeFantasia(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::apelidoNomeFantasia = value;
  }-*/;
  
  private static native java.lang.String getArvore(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::arvore;
  }-*/;
  
  private static native void setArvore(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::arvore = value;
  }-*/;
  
  private static native java.lang.String getCpfCnpj(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::cpfCnpj;
  }-*/;
  
  private static native void setCpfCnpj(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::cpfCnpj = value;
  }-*/;
  
  private static native java.lang.String getCpfCnpjMascarado(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::cpfCnpjMascarado;
  }-*/;
  
  private static native void setCpfCnpjMascarado(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::cpfCnpjMascarado = value;
  }-*/;
  
  private static native java.lang.String getCpfCnpjPai(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::cpfCnpjPai;
  }-*/;
  
  private static native void setCpfCnpjPai(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::cpfCnpjPai = value;
  }-*/;
  
  private static native java.lang.String getCpfCnpjVinculante(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::cpfCnpjVinculante;
  }-*/;
  
  private static native void setCpfCnpjVinculante(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::cpfCnpjVinculante = value;
  }-*/;
  
  private static native java.lang.Long getId(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::id;
  }-*/;
  
  private static native void setId(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::id = value;
  }-*/;
  
  private static native java.lang.Long getIdAravore(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::idAravore;
  }-*/;
  
  private static native void setIdAravore(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::idAravore = value;
  }-*/;
  
  private static native java.lang.Long getIdAtribuicao(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::idAtribuicao;
  }-*/;
  
  private static native void setIdAtribuicao(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::idAtribuicao = value;
  }-*/;
  
  private static native java.lang.Long getIdGrupoAcesso(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::idGrupoAcesso;
  }-*/;
  
  private static native void setIdGrupoAcesso(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::idGrupoAcesso = value;
  }-*/;
  
  private static native java.lang.Long getIdPai(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::idPai;
  }-*/;
  
  private static native void setIdPai(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::idPai = value;
  }-*/;
  
  private static native java.lang.Long getIdPessoaUsuarioLogado(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::idPessoaUsuarioLogado;
  }-*/;
  
  private static native void setIdPessoaUsuarioLogado(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::idPessoaUsuarioLogado = value;
  }-*/;
  
  private static native java.lang.Long getIdSuperAtribuicao(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::idSuperAtribuicao;
  }-*/;
  
  private static native void setIdSuperAtribuicao(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::idSuperAtribuicao = value;
  }-*/;
  
  private static native java.lang.Long getIdSuperUsuario(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::idSuperUsuario;
  }-*/;
  
  private static native void setIdSuperUsuario(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::idSuperUsuario = value;
  }-*/;
  
  private static native java.lang.String getLogin(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::login;
  }-*/;
  
  private static native void setLogin(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::login = value;
  }-*/;
  
  private static native java.lang.Integer getNivel(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::nivel;
  }-*/;
  
  private static native void setNivel(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.Integer value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::nivel = value;
  }-*/;
  
  private static native java.lang.String getNomeCidade(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::nomeCidade;
  }-*/;
  
  private static native void setNomeCidade(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::nomeCidade = value;
  }-*/;
  
  private static native java.lang.String getNomeRazaoSocial(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::nomeRazaoSocial;
  }-*/;
  
  private static native void setNomeRazaoSocial(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::nomeRazaoSocial = value;
  }-*/;
  
  private static native java.lang.Boolean getPossuiCadastroPessoaAtivo(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::possuiCadastroPessoaAtivo;
  }-*/;
  
  private static native void setPossuiCadastroPessoaAtivo(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.Boolean value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::possuiCadastroPessoaAtivo = value;
  }-*/;
  
  private static native java.lang.Boolean getPossuiCadastroUsuarioAtivo(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::possuiCadastroUsuarioAtivo;
  }-*/;
  
  private static native void setPossuiCadastroUsuarioAtivo(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.Boolean value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::possuiCadastroUsuarioAtivo = value;
  }-*/;
  
  private static native java.lang.Boolean getPossuiUsuario(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::possuiUsuario;
  }-*/;
  
  private static native void setPossuiUsuario(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.Boolean value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::possuiUsuario = value;
  }-*/;
  
  private static native java.lang.String getSiglaPessoaJuridica(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::siglaPessoaJuridica;
  }-*/;
  
  private static native void setSiglaPessoaJuridica(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::siglaPessoaJuridica = value;
  }-*/;
  
  private static native java.lang.String getSiglaUF(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::siglaUF;
  }-*/;
  
  private static native void setSiglaUF(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::siglaUF = value;
  }-*/;
  
  private static native java.lang.String getTipo(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::tipo;
  }-*/;
  
  private static native void setTipo(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::tipo = value;
  }-*/;
  
  private static native br.com.cweb.cadastro.persistence.entity.TipoPessoa getTipoPessoa(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::tipoPessoa;
  }-*/;
  
  private static native void setTipoPessoa(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance, br.com.cweb.cadastro.persistence.entity.TipoPessoa value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::tipoPessoa = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setApelidoNomeFantasia(instance, streamReader.readString());
    setArvore(instance, streamReader.readString());
    setCpfCnpj(instance, streamReader.readString());
    setCpfCnpjMascarado(instance, streamReader.readString());
    setCpfCnpjPai(instance, streamReader.readString());
    setCpfCnpjVinculante(instance, streamReader.readString());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setIdAravore(instance, (java.lang.Long) streamReader.readObject());
    setIdAtribuicao(instance, (java.lang.Long) streamReader.readObject());
    setIdGrupoAcesso(instance, (java.lang.Long) streamReader.readObject());
    setIdPai(instance, (java.lang.Long) streamReader.readObject());
    setIdPessoaUsuarioLogado(instance, (java.lang.Long) streamReader.readObject());
    setIdSuperAtribuicao(instance, (java.lang.Long) streamReader.readObject());
    setIdSuperUsuario(instance, (java.lang.Long) streamReader.readObject());
    setLogin(instance, streamReader.readString());
    setNivel(instance, (java.lang.Integer) streamReader.readObject());
    setNomeCidade(instance, streamReader.readString());
    setNomeRazaoSocial(instance, streamReader.readString());
    setPossuiCadastroPessoaAtivo(instance, (java.lang.Boolean) streamReader.readObject());
    setPossuiCadastroUsuarioAtivo(instance, (java.lang.Boolean) streamReader.readObject());
    setPossuiUsuario(instance, (java.lang.Boolean) streamReader.readObject());
    setSiglaPessoaJuridica(instance, streamReader.readString());
    setSiglaUF(instance, streamReader.readString());
    setTipo(instance, streamReader.readString());
    setTipoPessoa(instance, (br.com.cweb.cadastro.persistence.entity.TipoPessoa) streamReader.readObject());
    
  }
  
  public static br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getApelidoNomeFantasia(instance));
    streamWriter.writeString(getArvore(instance));
    streamWriter.writeString(getCpfCnpj(instance));
    streamWriter.writeString(getCpfCnpjMascarado(instance));
    streamWriter.writeString(getCpfCnpjPai(instance));
    streamWriter.writeString(getCpfCnpjVinculante(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getIdAravore(instance));
    streamWriter.writeObject(getIdAtribuicao(instance));
    streamWriter.writeObject(getIdGrupoAcesso(instance));
    streamWriter.writeObject(getIdPai(instance));
    streamWriter.writeObject(getIdPessoaUsuarioLogado(instance));
    streamWriter.writeObject(getIdSuperAtribuicao(instance));
    streamWriter.writeObject(getIdSuperUsuario(instance));
    streamWriter.writeString(getLogin(instance));
    streamWriter.writeObject(getNivel(instance));
    streamWriter.writeString(getNomeCidade(instance));
    streamWriter.writeString(getNomeRazaoSocial(instance));
    streamWriter.writeObject(getPossuiCadastroPessoaAtivo(instance));
    streamWriter.writeObject(getPossuiCadastroUsuarioAtivo(instance));
    streamWriter.writeObject(getPossuiUsuario(instance));
    streamWriter.writeString(getSiglaPessoaJuridica(instance));
    streamWriter.writeString(getSiglaUF(instance));
    streamWriter.writeString(getTipo(instance));
    streamWriter.writeObject(getTipoPessoa(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica_FieldSerializer.deserialize(reader, (br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica_FieldSerializer.serialize(writer, (br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)object);
  }
  
}
