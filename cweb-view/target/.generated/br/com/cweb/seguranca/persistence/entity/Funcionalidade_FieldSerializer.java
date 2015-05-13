package br.com.cweb.seguranca.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Funcionalidade_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Long getId(br.com.cweb.seguranca.persistence.entity.Funcionalidade instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.Funcionalidade::id;
  }-*/;
  
  private static native void setId(br.com.cweb.seguranca.persistence.entity.Funcionalidade instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.Funcionalidade::id = value;
  }-*/;
  
  private static native java.lang.String getNome(br.com.cweb.seguranca.persistence.entity.Funcionalidade instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.Funcionalidade::nome;
  }-*/;
  
  private static native void setNome(br.com.cweb.seguranca.persistence.entity.Funcionalidade instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.Funcionalidade::nome = value;
  }-*/;
  
  private static native java.lang.Integer getPaiFuncionalidade(br.com.cweb.seguranca.persistence.entity.Funcionalidade instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.Funcionalidade::paiFuncionalidade;
  }-*/;
  
  private static native void setPaiFuncionalidade(br.com.cweb.seguranca.persistence.entity.Funcionalidade instance, java.lang.Integer value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.Funcionalidade::paiFuncionalidade = value;
  }-*/;
  
  private static native java.lang.String getSigla(br.com.cweb.seguranca.persistence.entity.Funcionalidade instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.Funcionalidade::sigla;
  }-*/;
  
  private static native void setSigla(br.com.cweb.seguranca.persistence.entity.Funcionalidade instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.Funcionalidade::sigla = value;
  }-*/;
  
  private static native java.lang.Integer getTipoFuncionalidade(br.com.cweb.seguranca.persistence.entity.Funcionalidade instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.Funcionalidade::tipoFuncionalidade;
  }-*/;
  
  private static native void setTipoFuncionalidade(br.com.cweb.seguranca.persistence.entity.Funcionalidade instance, java.lang.Integer value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.Funcionalidade::tipoFuncionalidade = value;
  }-*/;
  
  private static native java.util.Set getTipoPermissoes(br.com.cweb.seguranca.persistence.entity.Funcionalidade instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.Funcionalidade::tipoPermissoes;
  }-*/;
  
  private static native void setTipoPermissoes(br.com.cweb.seguranca.persistence.entity.Funcionalidade instance, java.util.Set value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.Funcionalidade::tipoPermissoes = value;
  }-*/;
  
  private static native java.lang.String getTooltip(br.com.cweb.seguranca.persistence.entity.Funcionalidade instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.Funcionalidade::tooltip;
  }-*/;
  
  private static native void setTooltip(br.com.cweb.seguranca.persistence.entity.Funcionalidade instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.Funcionalidade::tooltip = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.seguranca.persistence.entity.Funcionalidade instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-2", streamReader.readString());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNome(instance, streamReader.readString());
    setPaiFuncionalidade(instance, (java.lang.Integer) streamReader.readObject());
    setSigla(instance, streamReader.readString());
    setTipoFuncionalidade(instance, (java.lang.Integer) streamReader.readObject());
    setTipoPermissoes(instance, (java.util.Set) streamReader.readObject());
    setTooltip(instance, streamReader.readString());
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.seguranca.persistence.entity.Funcionalidade instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.seguranca.persistence.entity.Funcionalidade();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.seguranca.persistence.entity.Funcionalidade instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-2"));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getNome(instance));
    streamWriter.writeObject(getPaiFuncionalidade(instance));
    streamWriter.writeString(getSigla(instance));
    streamWriter.writeObject(getTipoFuncionalidade(instance));
    streamWriter.writeObject(getTipoPermissoes(instance));
    streamWriter.writeString(getTooltip(instance));
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.seguranca.persistence.entity.Funcionalidade_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.seguranca.persistence.entity.Funcionalidade_FieldSerializer.deserialize(reader, (br.com.cweb.seguranca.persistence.entity.Funcionalidade)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.seguranca.persistence.entity.Funcionalidade_FieldSerializer.serialize(writer, (br.com.cweb.seguranca.persistence.entity.Funcionalidade)object);
  }
  
}
