package br.com.cweb.cadastro.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class UsuarioLogadoDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Long getId(br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO::id;
  }-*/;
  
  private static native void setId(br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO::id = value;
  }-*/;
  
  private static native java.lang.String getNome(br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO::nome;
  }-*/;
  
  private static native void setNome(br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO::nome = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO instance) throws SerializationException {
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNome(instance, streamReader.readString());
    
  }
  
  public static br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO instance) throws SerializationException {
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getNome(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO_FieldSerializer.deserialize(reader, (br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO_FieldSerializer.serialize(writer, (br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO)object);
  }
  
}
