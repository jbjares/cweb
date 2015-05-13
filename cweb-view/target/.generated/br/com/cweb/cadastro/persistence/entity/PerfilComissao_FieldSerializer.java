package br.com.cweb.cadastro.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PerfilComissao_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Long getId(br.com.cweb.cadastro.persistence.entity.PerfilComissao instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PerfilComissao::id;
  }-*/;
  
  private static native void setId(br.com.cweb.cadastro.persistence.entity.PerfilComissao instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PerfilComissao::id = value;
  }-*/;
  
  private static native java.lang.String getNome(br.com.cweb.cadastro.persistence.entity.PerfilComissao instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PerfilComissao::nome;
  }-*/;
  
  private static native void setNome(br.com.cweb.cadastro.persistence.entity.PerfilComissao instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PerfilComissao::nome = value;
  }-*/;
  
  private static native java.util.List getPessoas(br.com.cweb.cadastro.persistence.entity.PerfilComissao instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.PerfilComissao::pessoas;
  }-*/;
  
  private static native void setPessoas(br.com.cweb.cadastro.persistence.entity.PerfilComissao instance, java.util.List value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.PerfilComissao::pessoas = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.cadastro.persistence.entity.PerfilComissao instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-2", streamReader.readString());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNome(instance, streamReader.readString());
    setPessoas(instance, (java.util.List) streamReader.readObject());
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.cadastro.persistence.entity.PerfilComissao instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.cadastro.persistence.entity.PerfilComissao();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.cadastro.persistence.entity.PerfilComissao instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-2"));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getNome(instance));
    streamWriter.writeObject(getPessoas(instance));
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.cadastro.persistence.entity.PerfilComissao_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.PerfilComissao_FieldSerializer.deserialize(reader, (br.com.cweb.cadastro.persistence.entity.PerfilComissao)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.PerfilComissao_FieldSerializer.serialize(writer, (br.com.cweb.cadastro.persistence.entity.PerfilComissao)object);
  }
  
}
