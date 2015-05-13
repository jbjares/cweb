package br.com.cweb.cadastro.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Estado_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getCidades(br.com.cweb.cadastro.persistence.entity.Estado instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Estado::cidades;
  }-*/;
  
  private static native void setCidades(br.com.cweb.cadastro.persistence.entity.Estado instance, java.util.List value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Estado::cidades = value;
  }-*/;
  
  private static native java.lang.Long getId(br.com.cweb.cadastro.persistence.entity.Estado instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Estado::id;
  }-*/;
  
  private static native void setId(br.com.cweb.cadastro.persistence.entity.Estado instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Estado::id = value;
  }-*/;
  
  private static native java.lang.String getNome(br.com.cweb.cadastro.persistence.entity.Estado instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Estado::nome;
  }-*/;
  
  private static native void setNome(br.com.cweb.cadastro.persistence.entity.Estado instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Estado::nome = value;
  }-*/;
  
  private static native java.lang.String getRegiao(br.com.cweb.cadastro.persistence.entity.Estado instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Estado::regiao;
  }-*/;
  
  private static native void setRegiao(br.com.cweb.cadastro.persistence.entity.Estado instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Estado::regiao = value;
  }-*/;
  
  private static native java.lang.String getSigla(br.com.cweb.cadastro.persistence.entity.Estado instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Estado::sigla;
  }-*/;
  
  private static native void setSigla(br.com.cweb.cadastro.persistence.entity.Estado instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Estado::sigla = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.cadastro.persistence.entity.Estado instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-2", streamReader.readString());
    setCidades(instance, (java.util.List) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNome(instance, streamReader.readString());
    setRegiao(instance, streamReader.readString());
    setSigla(instance, streamReader.readString());
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.cadastro.persistence.entity.Estado instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.cadastro.persistence.entity.Estado();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.cadastro.persistence.entity.Estado instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-2"));
    streamWriter.writeObject(getCidades(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getNome(instance));
    streamWriter.writeString(getRegiao(instance));
    streamWriter.writeString(getSigla(instance));
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.cadastro.persistence.entity.Estado_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.Estado_FieldSerializer.deserialize(reader, (br.com.cweb.cadastro.persistence.entity.Estado)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.Estado_FieldSerializer.serialize(writer, (br.com.cweb.cadastro.persistence.entity.Estado)object);
  }
  
}
