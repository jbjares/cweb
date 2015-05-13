package br.com.cweb.cadastro.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Atribuicao_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Integer getCodigoHierarquico(br.com.cweb.cadastro.persistence.entity.Atribuicao instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Atribuicao::codigoHierarquico;
  }-*/;
  
  private static native void setCodigoHierarquico(br.com.cweb.cadastro.persistence.entity.Atribuicao instance, java.lang.Integer value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Atribuicao::codigoHierarquico = value;
  }-*/;
  
  private static native java.lang.Long getId(br.com.cweb.cadastro.persistence.entity.Atribuicao instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Atribuicao::id;
  }-*/;
  
  private static native void setId(br.com.cweb.cadastro.persistence.entity.Atribuicao instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Atribuicao::id = value;
  }-*/;
  
  private static native java.lang.String getNome(br.com.cweb.cadastro.persistence.entity.Atribuicao instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.Atribuicao::nome;
  }-*/;
  
  private static native void setNome(br.com.cweb.cadastro.persistence.entity.Atribuicao instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.Atribuicao::nome = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.cadastro.persistence.entity.Atribuicao instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-2", streamReader.readString());
    setCodigoHierarquico(instance, (java.lang.Integer) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNome(instance, streamReader.readString());
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.cadastro.persistence.entity.Atribuicao instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.cadastro.persistence.entity.Atribuicao();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.cadastro.persistence.entity.Atribuicao instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-2"));
    streamWriter.writeObject(getCodigoHierarquico(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getNome(instance));
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.cadastro.persistence.entity.Atribuicao_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.Atribuicao_FieldSerializer.deserialize(reader, (br.com.cweb.cadastro.persistence.entity.Atribuicao)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.Atribuicao_FieldSerializer.serialize(writer, (br.com.cweb.cadastro.persistence.entity.Atribuicao)object);
  }
  
}
