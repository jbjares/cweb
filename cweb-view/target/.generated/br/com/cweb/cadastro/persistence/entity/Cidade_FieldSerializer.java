package br.com.cweb.cadastro.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Cidade_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native br.com.cweb.cadastro.persistence.entity.Estado getEstado(br.com.cweb.cadastro.persistence.entity.Cidade instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Cidade::estado;
  }-*/;
  
  private static native void setEstado(br.com.cweb.cadastro.persistence.entity.Cidade instance, br.com.cweb.cadastro.persistence.entity.Estado value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Cidade::estado = value;
  }-*/;
  
  private static native java.lang.Long getId(br.com.cweb.cadastro.persistence.entity.Cidade instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Cidade::id;
  }-*/;
  
  private static native void setId(br.com.cweb.cadastro.persistence.entity.Cidade instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Cidade::id = value;
  }-*/;
  
  private static native java.lang.String getNome(br.com.cweb.cadastro.persistence.entity.Cidade instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Cidade::nome;
  }-*/;
  
  private static native void setNome(br.com.cweb.cadastro.persistence.entity.Cidade instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Cidade::nome = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.cadastro.persistence.entity.Cidade instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-2", streamReader.readString());
    setEstado(instance, (br.com.cweb.cadastro.persistence.entity.Estado) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNome(instance, streamReader.readString());
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.cadastro.persistence.entity.Cidade instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.cadastro.persistence.entity.Cidade();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.cadastro.persistence.entity.Cidade instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-2"));
    streamWriter.writeObject(getEstado(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getNome(instance));
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.cadastro.persistence.entity.Cidade_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.Cidade_FieldSerializer.deserialize(reader, (br.com.cweb.cadastro.persistence.entity.Cidade)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.Cidade_FieldSerializer.serialize(writer, (br.com.cweb.cadastro.persistence.entity.Cidade)object);
  }
  
}
