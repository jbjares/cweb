package br.com.cweb.seguranca.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Usuario_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native br.com.cweb.seguranca.persistence.entity.GrupoAcesso getGupoAcesso(br.com.cweb.seguranca.persistence.entity.Usuario instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.Usuario::gupoAcesso;
  }-*/;
  
  private static native void setGupoAcesso(br.com.cweb.seguranca.persistence.entity.Usuario instance, br.com.cweb.seguranca.persistence.entity.GrupoAcesso value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.Usuario::gupoAcesso = value;
  }-*/;
  
  private static native java.lang.Long getId(br.com.cweb.seguranca.persistence.entity.Usuario instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.Usuario::id;
  }-*/;
  
  private static native void setId(br.com.cweb.seguranca.persistence.entity.Usuario instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.Usuario::id = value;
  }-*/;
  
  private static native java.lang.Long getIdSuperUsuario(br.com.cweb.seguranca.persistence.entity.Usuario instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.Usuario::idSuperUsuario;
  }-*/;
  
  private static native void setIdSuperUsuario(br.com.cweb.seguranca.persistence.entity.Usuario instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.Usuario::idSuperUsuario = value;
  }-*/;
  
  private static native java.lang.String getLogin(br.com.cweb.seguranca.persistence.entity.Usuario instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.Usuario::login;
  }-*/;
  
  private static native void setLogin(br.com.cweb.seguranca.persistence.entity.Usuario instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.Usuario::login = value;
  }-*/;
  
  private static native br.com.cweb.cadastro.persistence.entity.Pessoa getPessoa(br.com.cweb.seguranca.persistence.entity.Usuario instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.Usuario::pessoa;
  }-*/;
  
  private static native void setPessoa(br.com.cweb.seguranca.persistence.entity.Usuario instance, br.com.cweb.cadastro.persistence.entity.Pessoa value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.Usuario::pessoa = value;
  }-*/;
  
  private static native java.lang.String getSenha(br.com.cweb.seguranca.persistence.entity.Usuario instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.Usuario::senha;
  }-*/;
  
  private static native void setSenha(br.com.cweb.seguranca.persistence.entity.Usuario instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.Usuario::senha = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.seguranca.persistence.entity.Usuario instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-2", streamReader.readString());
    setGupoAcesso(instance, (br.com.cweb.seguranca.persistence.entity.GrupoAcesso) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setIdSuperUsuario(instance, (java.lang.Long) streamReader.readObject());
    setLogin(instance, streamReader.readString());
    setPessoa(instance, (br.com.cweb.cadastro.persistence.entity.Pessoa) streamReader.readObject());
    setSenha(instance, streamReader.readString());
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.seguranca.persistence.entity.Usuario instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.seguranca.persistence.entity.Usuario();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.seguranca.persistence.entity.Usuario instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-2"));
    streamWriter.writeObject(getGupoAcesso(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getIdSuperUsuario(instance));
    streamWriter.writeString(getLogin(instance));
    streamWriter.writeObject(getPessoa(instance));
    streamWriter.writeString(getSenha(instance));
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.seguranca.persistence.entity.Usuario_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.seguranca.persistence.entity.Usuario_FieldSerializer.deserialize(reader, (br.com.cweb.seguranca.persistence.entity.Usuario)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.seguranca.persistence.entity.Usuario_FieldSerializer.serialize(writer, (br.com.cweb.seguranca.persistence.entity.Usuario)object);
  }
  
}
