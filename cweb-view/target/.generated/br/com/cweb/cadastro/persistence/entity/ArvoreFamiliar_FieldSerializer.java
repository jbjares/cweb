package br.com.cweb.cadastro.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ArvoreFamiliar_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getArvore(br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar::arvore;
  }-*/;
  
  private static native void setArvore(br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar::arvore = value;
  }-*/;
  
  private static native java.lang.Long getId(br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar::id;
  }-*/;
  
  private static native void setId(br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar::id = value;
  }-*/;
  
  private static native java.lang.Integer getNivel(br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar::nivel;
  }-*/;
  
  private static native void setNivel(br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar instance, java.lang.Integer value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar::nivel = value;
  }-*/;
  
  private static native br.com.cweb.cadastro.persistence.entity.Pessoa getPessoa(br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar::pessoa;
  }-*/;
  
  private static native void setPessoa(br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar instance, br.com.cweb.cadastro.persistence.entity.Pessoa value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar::pessoa = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-2", streamReader.readString());
    setArvore(instance, streamReader.readString());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNivel(instance, (java.lang.Integer) streamReader.readObject());
    setPessoa(instance, (br.com.cweb.cadastro.persistence.entity.Pessoa) streamReader.readObject());
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-2"));
    streamWriter.writeString(getArvore(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getNivel(instance));
    streamWriter.writeObject(getPessoa(instance));
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar_FieldSerializer.deserialize(reader, (br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar_FieldSerializer.serialize(writer, (br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar)object);
  }
  
}
