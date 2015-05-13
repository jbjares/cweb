package br.com.cweb.cadastro.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PessoaJuridica_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getCnpj(br.com.cweb.cadastro.persistence.entity.PessoaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaJuridica::cnpj;
  }-*/;
  
  private static native void setCnpj(br.com.cweb.cadastro.persistence.entity.PessoaJuridica instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaJuridica::cnpj = value;
  }-*/;
  
  private static native java.lang.String getNomeFantasia(br.com.cweb.cadastro.persistence.entity.PessoaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaJuridica::nomeFantasia;
  }-*/;
  
  private static native void setNomeFantasia(br.com.cweb.cadastro.persistence.entity.PessoaJuridica instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaJuridica::nomeFantasia = value;
  }-*/;
  
  private static native java.lang.String getRazaoSocial(br.com.cweb.cadastro.persistence.entity.PessoaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaJuridica::razaoSocial;
  }-*/;
  
  private static native void setRazaoSocial(br.com.cweb.cadastro.persistence.entity.PessoaJuridica instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaJuridica::razaoSocial = value;
  }-*/;
  
  private static native java.lang.String getSigla(br.com.cweb.cadastro.persistence.entity.PessoaJuridica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaJuridica::sigla;
  }-*/;
  
  private static native void setSigla(br.com.cweb.cadastro.persistence.entity.PessoaJuridica instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaJuridica::sigla = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.cadastro.persistence.entity.PessoaJuridica instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-3", streamReader.readString());
    setCnpj(instance, streamReader.readString());
    setNomeFantasia(instance, streamReader.readString());
    setRazaoSocial(instance, streamReader.readString());
    setSigla(instance, streamReader.readString());
    
    br.com.cweb.cadastro.persistence.entity.Pessoa_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.cadastro.persistence.entity.PessoaJuridica instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.cadastro.persistence.entity.PessoaJuridica();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.cadastro.persistence.entity.PessoaJuridica instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-3"));
    streamWriter.writeString(getCnpj(instance));
    streamWriter.writeString(getNomeFantasia(instance));
    streamWriter.writeString(getRazaoSocial(instance));
    streamWriter.writeString(getSigla(instance));
    
    br.com.cweb.cadastro.persistence.entity.Pessoa_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.cadastro.persistence.entity.PessoaJuridica_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.PessoaJuridica_FieldSerializer.deserialize(reader, (br.com.cweb.cadastro.persistence.entity.PessoaJuridica)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.PessoaJuridica_FieldSerializer.serialize(writer, (br.com.cweb.cadastro.persistence.entity.PessoaJuridica)object);
  }
  
}
