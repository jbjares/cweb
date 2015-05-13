package br.com.cweb.seguranca.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AcessoMenu_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native br.com.cweb.seguranca.persistence.entity.Funcionalidade getFuncionalidade(br.com.cweb.seguranca.persistence.entity.AcessoMenu instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.AcessoMenu::funcionalidade;
  }-*/;
  
  private static native void setFuncionalidade(br.com.cweb.seguranca.persistence.entity.AcessoMenu instance, br.com.cweb.seguranca.persistence.entity.Funcionalidade value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.AcessoMenu::funcionalidade = value;
  }-*/;
  
  private static native br.com.cweb.seguranca.persistence.entity.GrupoAcesso getGrupoAcesso(br.com.cweb.seguranca.persistence.entity.AcessoMenu instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.AcessoMenu::grupoAcesso;
  }-*/;
  
  private static native void setGrupoAcesso(br.com.cweb.seguranca.persistence.entity.AcessoMenu instance, br.com.cweb.seguranca.persistence.entity.GrupoAcesso value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.AcessoMenu::grupoAcesso = value;
  }-*/;
  
  private static native java.lang.Long getId(br.com.cweb.seguranca.persistence.entity.AcessoMenu instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.AcessoMenu::id;
  }-*/;
  
  private static native void setId(br.com.cweb.seguranca.persistence.entity.AcessoMenu instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.AcessoMenu::id = value;
  }-*/;
  
  private static native br.com.cweb.seguranca.persistence.entity.TipoPermissao getPermissao(br.com.cweb.seguranca.persistence.entity.AcessoMenu instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.AcessoMenu::permissao;
  }-*/;
  
  private static native void setPermissao(br.com.cweb.seguranca.persistence.entity.AcessoMenu instance, br.com.cweb.seguranca.persistence.entity.TipoPermissao value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.AcessoMenu::permissao = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.seguranca.persistence.entity.AcessoMenu instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-2", streamReader.readString());
    setFuncionalidade(instance, (br.com.cweb.seguranca.persistence.entity.Funcionalidade) streamReader.readObject());
    setGrupoAcesso(instance, (br.com.cweb.seguranca.persistence.entity.GrupoAcesso) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setPermissao(instance, (br.com.cweb.seguranca.persistence.entity.TipoPermissao) streamReader.readObject());
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.seguranca.persistence.entity.AcessoMenu instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.seguranca.persistence.entity.AcessoMenu();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.seguranca.persistence.entity.AcessoMenu instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-2"));
    streamWriter.writeObject(getFuncionalidade(instance));
    streamWriter.writeObject(getGrupoAcesso(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getPermissao(instance));
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.seguranca.persistence.entity.AcessoMenu_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.seguranca.persistence.entity.AcessoMenu_FieldSerializer.deserialize(reader, (br.com.cweb.seguranca.persistence.entity.AcessoMenu)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.seguranca.persistence.entity.AcessoMenu_FieldSerializer.serialize(writer, (br.com.cweb.seguranca.persistence.entity.AcessoMenu)object);
  }
  
}
