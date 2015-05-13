package br.com.cweb.cadastro.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Endereco_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getBairro(br.com.cweb.cadastro.persistence.entity.Endereco instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Endereco::bairro;
  }-*/;
  
  private static native void setBairro(br.com.cweb.cadastro.persistence.entity.Endereco instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Endereco::bairro = value;
  }-*/;
  
  private static native java.lang.String getCelular(br.com.cweb.cadastro.persistence.entity.Endereco instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Endereco::celular;
  }-*/;
  
  private static native void setCelular(br.com.cweb.cadastro.persistence.entity.Endereco instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Endereco::celular = value;
  }-*/;
  
  private static native java.lang.Long getCep(br.com.cweb.cadastro.persistence.entity.Endereco instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Endereco::cep;
  }-*/;
  
  private static native void setCep(br.com.cweb.cadastro.persistence.entity.Endereco instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Endereco::cep = value;
  }-*/;
  
  private static native br.com.cweb.cadastro.persistence.entity.Cidade getCidade(br.com.cweb.cadastro.persistence.entity.Endereco instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Endereco::cidade;
  }-*/;
  
  private static native void setCidade(br.com.cweb.cadastro.persistence.entity.Endereco instance, br.com.cweb.cadastro.persistence.entity.Cidade value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Endereco::cidade = value;
  }-*/;
  
  private static native java.lang.String getEmail(br.com.cweb.cadastro.persistence.entity.Endereco instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Endereco::email;
  }-*/;
  
  private static native void setEmail(br.com.cweb.cadastro.persistence.entity.Endereco instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Endereco::email = value;
  }-*/;
  
  private static native java.lang.String getEndereco(br.com.cweb.cadastro.persistence.entity.Endereco instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Endereco::endereco;
  }-*/;
  
  private static native void setEndereco(br.com.cweb.cadastro.persistence.entity.Endereco instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Endereco::endereco = value;
  }-*/;
  
  private static native java.lang.String getFax(br.com.cweb.cadastro.persistence.entity.Endereco instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Endereco::fax;
  }-*/;
  
  private static native void setFax(br.com.cweb.cadastro.persistence.entity.Endereco instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Endereco::fax = value;
  }-*/;
  
  private static native java.lang.Long getId(br.com.cweb.cadastro.persistence.entity.Endereco instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Endereco::id;
  }-*/;
  
  private static native void setId(br.com.cweb.cadastro.persistence.entity.Endereco instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Endereco::id = value;
  }-*/;
  
  private static native java.lang.String getNomeResponsavel(br.com.cweb.cadastro.persistence.entity.Endereco instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Endereco::nomeResponsavel;
  }-*/;
  
  private static native void setNomeResponsavel(br.com.cweb.cadastro.persistence.entity.Endereco instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Endereco::nomeResponsavel = value;
  }-*/;
  
  private static native java.lang.String getNumero(br.com.cweb.cadastro.persistence.entity.Endereco instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Endereco::numero;
  }-*/;
  
  private static native void setNumero(br.com.cweb.cadastro.persistence.entity.Endereco instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Endereco::numero = value;
  }-*/;
  
  private static native br.com.cweb.cadastro.persistence.entity.Pessoa getPessoa(br.com.cweb.cadastro.persistence.entity.Endereco instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Endereco::pessoa;
  }-*/;
  
  private static native void setPessoa(br.com.cweb.cadastro.persistence.entity.Endereco instance, br.com.cweb.cadastro.persistence.entity.Pessoa value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Endereco::pessoa = value;
  }-*/;
  
  private static native java.lang.String getTelefoneFixo(br.com.cweb.cadastro.persistence.entity.Endereco instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Endereco::telefoneFixo;
  }-*/;
  
  private static native void setTelefoneFixo(br.com.cweb.cadastro.persistence.entity.Endereco instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Endereco::telefoneFixo = value;
  }-*/;
  
  private static native java.lang.String getTelefoneResponsavel(br.com.cweb.cadastro.persistence.entity.Endereco instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Endereco::telefoneResponsavel;
  }-*/;
  
  private static native void setTelefoneResponsavel(br.com.cweb.cadastro.persistence.entity.Endereco instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Endereco::telefoneResponsavel = value;
  }-*/;
  
  private static native br.com.cweb.cadastro.persistence.entity.TipoEndereco getTipoEndereco(br.com.cweb.cadastro.persistence.entity.Endereco instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Endereco::tipoEndereco;
  }-*/;
  
  private static native void setTipoEndereco(br.com.cweb.cadastro.persistence.entity.Endereco instance, br.com.cweb.cadastro.persistence.entity.TipoEndereco value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Endereco::tipoEndereco = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.cadastro.persistence.entity.Endereco instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-2", streamReader.readString());
    setBairro(instance, streamReader.readString());
    setCelular(instance, streamReader.readString());
    setCep(instance, (java.lang.Long) streamReader.readObject());
    setCidade(instance, (br.com.cweb.cadastro.persistence.entity.Cidade) streamReader.readObject());
    setEmail(instance, streamReader.readString());
    setEndereco(instance, streamReader.readString());
    setFax(instance, streamReader.readString());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNomeResponsavel(instance, streamReader.readString());
    setNumero(instance, streamReader.readString());
    setPessoa(instance, (br.com.cweb.cadastro.persistence.entity.Pessoa) streamReader.readObject());
    setTelefoneFixo(instance, streamReader.readString());
    setTelefoneResponsavel(instance, streamReader.readString());
    setTipoEndereco(instance, (br.com.cweb.cadastro.persistence.entity.TipoEndereco) streamReader.readObject());
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.cadastro.persistence.entity.Endereco instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.cadastro.persistence.entity.Endereco();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.cadastro.persistence.entity.Endereco instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-2"));
    streamWriter.writeString(getBairro(instance));
    streamWriter.writeString(getCelular(instance));
    streamWriter.writeObject(getCep(instance));
    streamWriter.writeObject(getCidade(instance));
    streamWriter.writeString(getEmail(instance));
    streamWriter.writeString(getEndereco(instance));
    streamWriter.writeString(getFax(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getNomeResponsavel(instance));
    streamWriter.writeString(getNumero(instance));
    streamWriter.writeObject(getPessoa(instance));
    streamWriter.writeString(getTelefoneFixo(instance));
    streamWriter.writeString(getTelefoneResponsavel(instance));
    streamWriter.writeObject(getTipoEndereco(instance));
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.cadastro.persistence.entity.Endereco_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.Endereco_FieldSerializer.deserialize(reader, (br.com.cweb.cadastro.persistence.entity.Endereco)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.Endereco_FieldSerializer.serialize(writer, (br.com.cweb.cadastro.persistence.entity.Endereco)object);
  }
  
}
