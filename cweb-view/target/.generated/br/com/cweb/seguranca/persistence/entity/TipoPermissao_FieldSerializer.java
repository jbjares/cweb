package br.com.cweb.seguranca.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TipoPermissao_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Long getId(br.com.cweb.seguranca.persistence.entity.TipoPermissao instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.TipoPermissao::id;
  }-*/;
  
  private static native void setId(br.com.cweb.seguranca.persistence.entity.TipoPermissao instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.TipoPermissao::id = value;
  }-*/;
  
  private static native java.lang.String getNome(br.com.cweb.seguranca.persistence.entity.TipoPermissao instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.TipoPermissao::nome;
  }-*/;
  
  private static native void setNome(br.com.cweb.seguranca.persistence.entity.TipoPermissao instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.TipoPermissao::nome = value;
  }-*/;
  
  private static native java.lang.String getSigla(br.com.cweb.seguranca.persistence.entity.TipoPermissao instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.TipoPermissao::sigla;
  }-*/;
  
  private static native void setSigla(br.com.cweb.seguranca.persistence.entity.TipoPermissao instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.TipoPermissao::sigla = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.seguranca.persistence.entity.TipoPermissao instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-2", streamReader.readString());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNome(instance, streamReader.readString());
    setSigla(instance, streamReader.readString());
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.seguranca.persistence.entity.TipoPermissao instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.seguranca.persistence.entity.TipoPermissao();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.seguranca.persistence.entity.TipoPermissao instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-2"));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getNome(instance));
    streamWriter.writeString(getSigla(instance));
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.seguranca.persistence.entity.TipoPermissao_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.seguranca.persistence.entity.TipoPermissao_FieldSerializer.deserialize(reader, (br.com.cweb.seguranca.persistence.entity.TipoPermissao)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.seguranca.persistence.entity.TipoPermissao_FieldSerializer.serialize(writer, (br.com.cweb.seguranca.persistence.entity.TipoPermissao)object);
  }
  
}
