package br.com.cweb.seguranca.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AcessoGrupoDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Long getIdAcessoMenu(br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO::idAcessoMenu;
  }-*/;
  
  private static native void setIdAcessoMenu(br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO::idAcessoMenu = value;
  }-*/;
  
  private static native java.lang.Long getIdFuncionalidade(br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO::idFuncionalidade;
  }-*/;
  
  private static native void setIdFuncionalidade(br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO::idFuncionalidade = value;
  }-*/;
  
  private static native java.lang.Long getIdGrupoAcesso(br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO::idGrupoAcesso;
  }-*/;
  
  private static native void setIdGrupoAcesso(br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO::idGrupoAcesso = value;
  }-*/;
  
  private static native boolean getIsfnAlterar(br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO::isfnAlterar;
  }-*/;
  
  private static native void setIsfnAlterar(br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instance, boolean value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO::isfnAlterar = value;
  }-*/;
  
  private static native boolean getIsfnConsultar(br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO::isfnConsultar;
  }-*/;
  
  private static native void setIsfnConsultar(br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instance, boolean value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO::isfnConsultar = value;
  }-*/;
  
  private static native boolean getIsfnExcluir(br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO::isfnExcluir;
  }-*/;
  
  private static native void setIsfnExcluir(br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instance, boolean value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO::isfnExcluir = value;
  }-*/;
  
  private static native boolean getIsfnImprimir(br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO::isfnImprimir;
  }-*/;
  
  private static native void setIsfnImprimir(br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instance, boolean value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO::isfnImprimir = value;
  }-*/;
  
  private static native boolean getIsfnIncluir(br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO::isfnIncluir;
  }-*/;
  
  private static native void setIsfnIncluir(br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instance, boolean value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO::isfnIncluir = value;
  }-*/;
  
  private static native java.lang.String getNomeFuncionalidade(br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO::nomeFuncionalidade;
  }-*/;
  
  private static native void setNomeFuncionalidade(br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO::nomeFuncionalidade = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instance) throws SerializationException {
    setIdAcessoMenu(instance, (java.lang.Long) streamReader.readObject());
    setIdFuncionalidade(instance, (java.lang.Long) streamReader.readObject());
    setIdGrupoAcesso(instance, (java.lang.Long) streamReader.readObject());
    setIsfnAlterar(instance, streamReader.readBoolean());
    setIsfnConsultar(instance, streamReader.readBoolean());
    setIsfnExcluir(instance, streamReader.readBoolean());
    setIsfnImprimir(instance, streamReader.readBoolean());
    setIsfnIncluir(instance, streamReader.readBoolean());
    setNomeFuncionalidade(instance, streamReader.readString());
    instance.permissoes = (java.util.List) streamReader.readObject();
    
  }
  
  public static br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO instance) throws SerializationException {
    streamWriter.writeObject(getIdAcessoMenu(instance));
    streamWriter.writeObject(getIdFuncionalidade(instance));
    streamWriter.writeObject(getIdGrupoAcesso(instance));
    streamWriter.writeBoolean(getIsfnAlterar(instance));
    streamWriter.writeBoolean(getIsfnConsultar(instance));
    streamWriter.writeBoolean(getIsfnExcluir(instance));
    streamWriter.writeBoolean(getIsfnImprimir(instance));
    streamWriter.writeBoolean(getIsfnIncluir(instance));
    streamWriter.writeString(getNomeFuncionalidade(instance));
    streamWriter.writeObject(instance.permissoes);
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO_FieldSerializer.deserialize(reader, (br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO_FieldSerializer.serialize(writer, (br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)object);
  }
  
}
