package br.com.cweb.cadastro.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PessoaFisica_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getApelido(br.com.cweb.cadastro.persistence.entity.PessoaFisica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisica::apelido;
  }-*/;
  
  private static native void setApelido(br.com.cweb.cadastro.persistence.entity.PessoaFisica instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisica::apelido = value;
  }-*/;
  
  private static native java.lang.String getCpf(br.com.cweb.cadastro.persistence.entity.PessoaFisica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisica::cpf;
  }-*/;
  
  private static native void setCpf(br.com.cweb.cadastro.persistence.entity.PessoaFisica instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisica::cpf = value;
  }-*/;
  
  private static native java.lang.String getNome(br.com.cweb.cadastro.persistence.entity.PessoaFisica instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisica::nome;
  }-*/;
  
  private static native void setNome(br.com.cweb.cadastro.persistence.entity.PessoaFisica instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PessoaFisica::nome = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.cadastro.persistence.entity.PessoaFisica instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-3", streamReader.readString());
    setApelido(instance, streamReader.readString());
    setCpf(instance, streamReader.readString());
    setNome(instance, streamReader.readString());
    
    br.com.cweb.cadastro.persistence.entity.Pessoa_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.cadastro.persistence.entity.PessoaFisica instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.cadastro.persistence.entity.PessoaFisica();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.cadastro.persistence.entity.PessoaFisica instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-3"));
    streamWriter.writeString(getApelido(instance));
    streamWriter.writeString(getCpf(instance));
    streamWriter.writeString(getNome(instance));
    
    br.com.cweb.cadastro.persistence.entity.Pessoa_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.cadastro.persistence.entity.PessoaFisica_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.PessoaFisica_FieldSerializer.deserialize(reader, (br.com.cweb.cadastro.persistence.entity.PessoaFisica)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.PessoaFisica_FieldSerializer.serialize(writer, (br.com.cweb.cadastro.persistence.entity.PessoaFisica)object);
  }
  
}
