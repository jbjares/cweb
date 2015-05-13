package br.com.cweb.cadastro.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Pessoa_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar getArvoreFamiliar(br.com.cweb.cadastro.persistence.entity.Pessoa instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::arvoreFamiliar;
  }-*/;
  
  private static native void setArvoreFamiliar(br.com.cweb.cadastro.persistence.entity.Pessoa instance, br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::arvoreFamiliar = value;
  }-*/;
  
  private static native br.com.cweb.cadastro.persistence.entity.Atribuicao getAtribuicao(br.com.cweb.cadastro.persistence.entity.Pessoa instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::atribuicao;
  }-*/;
  
  private static native void setAtribuicao(br.com.cweb.cadastro.persistence.entity.Pessoa instance, br.com.cweb.cadastro.persistence.entity.Atribuicao value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::atribuicao = value;
  }-*/;
  
  private static native java.util.List getDadosBancarios(br.com.cweb.cadastro.persistence.entity.Pessoa instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::dadosBancarios;
  }-*/;
  
  private static native void setDadosBancarios(br.com.cweb.cadastro.persistence.entity.Pessoa instance, java.util.List value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::dadosBancarios = value;
  }-*/;
  
  private static native java.util.List getEnderecos(br.com.cweb.cadastro.persistence.entity.Pessoa instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::enderecos;
  }-*/;
  
  private static native void setEnderecos(br.com.cweb.cadastro.persistence.entity.Pessoa instance, java.util.List value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::enderecos = value;
  }-*/;
  
  private static native java.lang.Long getId(br.com.cweb.cadastro.persistence.entity.Pessoa instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::id;
  }-*/;
  
  private static native void setId(br.com.cweb.cadastro.persistence.entity.Pessoa instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::id = value;
  }-*/;
  
  private static native br.com.cweb.cadastro.persistence.entity.PerfilComissao getPerfilComissao(br.com.cweb.cadastro.persistence.entity.Pessoa instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::perfilComissao;
  }-*/;
  
  private static native void setPerfilComissao(br.com.cweb.cadastro.persistence.entity.Pessoa instance, br.com.cweb.cadastro.persistence.entity.PerfilComissao value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::perfilComissao = value;
  }-*/;
  
  private static native br.com.cweb.cadastro.persistence.entity.Pessoa getPessoaVinculadora(br.com.cweb.cadastro.persistence.entity.Pessoa instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::pessoaVinculadora;
  }-*/;
  
  private static native void setPessoaVinculadora(br.com.cweb.cadastro.persistence.entity.Pessoa instance, br.com.cweb.cadastro.persistence.entity.Pessoa value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::pessoaVinculadora = value;
  }-*/;
  
  private static native java.lang.Boolean getPossuiBonificacaoContratual(br.com.cweb.cadastro.persistence.entity.Pessoa instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::possuiBonificacaoContratual;
  }-*/;
  
  private static native void setPossuiBonificacaoContratual(br.com.cweb.cadastro.persistence.entity.Pessoa instance, java.lang.Boolean value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::possuiBonificacaoContratual = value;
  }-*/;
  
  private static native br.com.cweb.cadastro.persistence.entity.TipoPessoa getTipoPessoa(br.com.cweb.cadastro.persistence.entity.Pessoa instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::tipoPessoa;
  }-*/;
  
  private static native void setTipoPessoa(br.com.cweb.cadastro.persistence.entity.Pessoa instance, br.com.cweb.cadastro.persistence.entity.TipoPessoa value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::tipoPessoa = value;
  }-*/;
  
  private static native br.com.cweb.seguranca.persistence.entity.Usuario getUsuario(br.com.cweb.cadastro.persistence.entity.Pessoa instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::usuario;
  }-*/;
  
  private static native void setUsuario(br.com.cweb.cadastro.persistence.entity.Pessoa instance, br.com.cweb.seguranca.persistence.entity.Usuario value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::usuario = value;
  }-*/;
  
  private static native java.util.List getVinculados(br.com.cweb.cadastro.persistence.entity.Pessoa instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::vinculados;
  }-*/;
  
  private static native void setVinculados(br.com.cweb.cadastro.persistence.entity.Pessoa instance, java.util.List value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Pessoa::vinculados = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.cadastro.persistence.entity.Pessoa instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-2", streamReader.readString());
    setArvoreFamiliar(instance, (br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar) streamReader.readObject());
    setAtribuicao(instance, (br.com.cweb.cadastro.persistence.entity.Atribuicao) streamReader.readObject());
    setDadosBancarios(instance, (java.util.List) streamReader.readObject());
    setEnderecos(instance, (java.util.List) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setPerfilComissao(instance, (br.com.cweb.cadastro.persistence.entity.PerfilComissao) streamReader.readObject());
    setPessoaVinculadora(instance, (br.com.cweb.cadastro.persistence.entity.Pessoa) streamReader.readObject());
    setPossuiBonificacaoContratual(instance, (java.lang.Boolean) streamReader.readObject());
    setTipoPessoa(instance, (br.com.cweb.cadastro.persistence.entity.TipoPessoa) streamReader.readObject());
    setUsuario(instance, (br.com.cweb.seguranca.persistence.entity.Usuario) streamReader.readObject());
    setVinculados(instance, (java.util.List) streamReader.readObject());
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.cadastro.persistence.entity.Pessoa instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.cadastro.persistence.entity.Pessoa();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.cadastro.persistence.entity.Pessoa instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-2"));
    streamWriter.writeObject(getArvoreFamiliar(instance));
    streamWriter.writeObject(getAtribuicao(instance));
    streamWriter.writeObject(getDadosBancarios(instance));
    streamWriter.writeObject(getEnderecos(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getPerfilComissao(instance));
    streamWriter.writeObject(getPessoaVinculadora(instance));
    streamWriter.writeObject(getPossuiBonificacaoContratual(instance));
    streamWriter.writeObject(getTipoPessoa(instance));
    streamWriter.writeObject(getUsuario(instance));
    streamWriter.writeObject(getVinculados(instance));
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.cadastro.persistence.entity.Pessoa_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.Pessoa_FieldSerializer.deserialize(reader, (br.com.cweb.cadastro.persistence.entity.Pessoa)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.Pessoa_FieldSerializer.serialize(writer, (br.com.cweb.cadastro.persistence.entity.Pessoa)object);
  }
  
}
