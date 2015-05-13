package br.com.cweb.seguranca.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GrupoAcesso_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Long getId(br.com.cweb.seguranca.persistence.entity.GrupoAcesso instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.GrupoAcesso::id;
  }-*/;
  
  private static native void setId(br.com.cweb.seguranca.persistence.entity.GrupoAcesso instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.GrupoAcesso::id = value;
  }-*/;
  
  private static native java.lang.String getNome(br.com.cweb.seguranca.persistence.entity.GrupoAcesso instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.GrupoAcesso::nome;
  }-*/;
  
  private static native void setNome(br.com.cweb.seguranca.persistence.entity.GrupoAcesso instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.GrupoAcesso::nome = value;
  }-*/;
  
  private static native br.com.cweb.cadastro.persistence.entity.Pessoa getPessoaResponsavel(br.com.cweb.seguranca.persistence.entity.GrupoAcesso instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.GrupoAcesso::pessoaResponsavel;
  }-*/;
  
  private static native void setPessoaResponsavel(br.com.cweb.seguranca.persistence.entity.GrupoAcesso instance, br.com.cweb.cadastro.persistence.entity.Pessoa value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.GrupoAcesso::pessoaResponsavel = value;
  }-*/;
  
  private static native java.util.List getUsuarios(br.com.cweb.seguranca.persistence.entity.GrupoAcesso instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.GrupoAcesso::usuarios;
  }-*/;
  
  private static native void setUsuarios(br.com.cweb.seguranca.persistence.entity.GrupoAcesso instance, java.util.List value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.GrupoAcesso::usuarios = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.seguranca.persistence.entity.GrupoAcesso instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-2", streamReader.readString());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNome(instance, streamReader.readString());
    setPessoaResponsavel(instance, (br.com.cweb.cadastro.persistence.entity.Pessoa) streamReader.readObject());
    setUsuarios(instance, (java.util.List) streamReader.readObject());
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.seguranca.persistence.entity.GrupoAcesso instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.seguranca.persistence.entity.GrupoAcesso();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.seguranca.persistence.entity.GrupoAcesso instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-2"));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getNome(instance));
    streamWriter.writeObject(getPessoaResponsavel(instance));
    streamWriter.writeObject(getUsuarios(instance));
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.seguranca.persistence.entity.GrupoAcesso_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.seguranca.persistence.entity.GrupoAcesso_FieldSerializer.deserialize(reader, (br.com.cweb.seguranca.persistence.entity.GrupoAcesso)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.seguranca.persistence.entity.GrupoAcesso_FieldSerializer.serialize(writer, (br.com.cweb.seguranca.persistence.entity.GrupoAcesso)object);
  }
  
}
