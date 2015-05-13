package br.com.cweb.cadastro.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ContaBancaria_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getAgencia(br.com.cweb.cadastro.persistence.entity.ContaBancaria instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.ContaBancaria::agencia;
  }-*/;
  
  private static native void setAgencia(br.com.cweb.cadastro.persistence.entity.ContaBancaria instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.ContaBancaria::agencia = value;
  }-*/;
  
  private static native br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira getBanco(br.com.cweb.cadastro.persistence.entity.ContaBancaria instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.ContaBancaria::banco;
  }-*/;
  
  private static native void setBanco(br.com.cweb.cadastro.persistence.entity.ContaBancaria instance, br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.ContaBancaria::banco = value;
  }-*/;
  
  private static native java.lang.String getConta(br.com.cweb.cadastro.persistence.entity.ContaBancaria instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.ContaBancaria::conta;
  }-*/;
  
  private static native void setConta(br.com.cweb.cadastro.persistence.entity.ContaBancaria instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.ContaBancaria::conta = value;
  }-*/;
  
  private static native java.lang.String getCpfCnpjFavorecido(br.com.cweb.cadastro.persistence.entity.ContaBancaria instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.ContaBancaria::cpfCnpjFavorecido;
  }-*/;
  
  private static native void setCpfCnpjFavorecido(br.com.cweb.cadastro.persistence.entity.ContaBancaria instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.ContaBancaria::cpfCnpjFavorecido = value;
  }-*/;
  
  private static native java.lang.String getCpfCnpjFavorecidoMascarado(br.com.cweb.cadastro.persistence.entity.ContaBancaria instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.ContaBancaria::cpfCnpjFavorecidoMascarado;
  }-*/;
  
  private static native void setCpfCnpjFavorecidoMascarado(br.com.cweb.cadastro.persistence.entity.ContaBancaria instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.ContaBancaria::cpfCnpjFavorecidoMascarado = value;
  }-*/;
  
  private static native java.lang.Long getId(br.com.cweb.cadastro.persistence.entity.ContaBancaria instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.ContaBancaria::id;
  }-*/;
  
  private static native void setId(br.com.cweb.cadastro.persistence.entity.ContaBancaria instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.ContaBancaria::id = value;
  }-*/;
  
  private static native java.lang.String getNomeFavorecido(br.com.cweb.cadastro.persistence.entity.ContaBancaria instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.ContaBancaria::nomeFavorecido;
  }-*/;
  
  private static native void setNomeFavorecido(br.com.cweb.cadastro.persistence.entity.ContaBancaria instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.ContaBancaria::nomeFavorecido = value;
  }-*/;
  
  private static native br.com.cweb.cadastro.persistence.entity.Pessoa getPessoa(br.com.cweb.cadastro.persistence.entity.ContaBancaria instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.ContaBancaria::pessoa;
  }-*/;
  
  private static native void setPessoa(br.com.cweb.cadastro.persistence.entity.ContaBancaria instance, br.com.cweb.cadastro.persistence.entity.Pessoa value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.ContaBancaria::pessoa = value;
  }-*/;
  
  private static native br.com.cweb.cadastro.persistence.entity.TipoConta getTipoConta(br.com.cweb.cadastro.persistence.entity.ContaBancaria instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.ContaBancaria::tipoConta;
  }-*/;
  
  private static native void setTipoConta(br.com.cweb.cadastro.persistence.entity.ContaBancaria instance, br.com.cweb.cadastro.persistence.entity.TipoConta value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.ContaBancaria::tipoConta = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.cadastro.persistence.entity.ContaBancaria instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-2", streamReader.readString());
    setAgencia(instance, streamReader.readString());
    setBanco(instance, (br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira) streamReader.readObject());
    setConta(instance, streamReader.readString());
    setCpfCnpjFavorecido(instance, streamReader.readString());
    setCpfCnpjFavorecidoMascarado(instance, streamReader.readString());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNomeFavorecido(instance, streamReader.readString());
    setPessoa(instance, (br.com.cweb.cadastro.persistence.entity.Pessoa) streamReader.readObject());
    setTipoConta(instance, (br.com.cweb.cadastro.persistence.entity.TipoConta) streamReader.readObject());
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.cadastro.persistence.entity.ContaBancaria instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.cadastro.persistence.entity.ContaBancaria();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.cadastro.persistence.entity.ContaBancaria instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-2"));
    streamWriter.writeString(getAgencia(instance));
    streamWriter.writeObject(getBanco(instance));
    streamWriter.writeString(getConta(instance));
    streamWriter.writeString(getCpfCnpjFavorecido(instance));
    streamWriter.writeString(getCpfCnpjFavorecidoMascarado(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getNomeFavorecido(instance));
    streamWriter.writeObject(getPessoa(instance));
    streamWriter.writeObject(getTipoConta(instance));
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.cadastro.persistence.entity.ContaBancaria_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.ContaBancaria_FieldSerializer.deserialize(reader, (br.com.cweb.cadastro.persistence.entity.ContaBancaria)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.ContaBancaria_FieldSerializer.serialize(writer, (br.com.cweb.cadastro.persistence.entity.ContaBancaria)object);
  }
  
}
