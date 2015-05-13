package br.com.cweb.seguranca.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class MenuDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getDescricao(br.com.cweb.seguranca.persistence.entity.MenuDTO instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.MenuDTO::descricao;
  }-*/;
  
  private static native void setDescricao(br.com.cweb.seguranca.persistence.entity.MenuDTO instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.MenuDTO::descricao = value;
  }-*/;
  
  private static native java.lang.Integer getId(br.com.cweb.seguranca.persistence.entity.MenuDTO instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.MenuDTO::id;
  }-*/;
  
  private static native void setId(br.com.cweb.seguranca.persistence.entity.MenuDTO instance, java.lang.Integer value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.MenuDTO::id = value;
  }-*/;
  
  private static native java.lang.Long getIdGrupoAcesso(br.com.cweb.seguranca.persistence.entity.MenuDTO instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.MenuDTO::idGrupoAcesso;
  }-*/;
  
  private static native void setIdGrupoAcesso(br.com.cweb.seguranca.persistence.entity.MenuDTO instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.MenuDTO::idGrupoAcesso = value;
  }-*/;
  
  private static native java.lang.Integer getPai(br.com.cweb.seguranca.persistence.entity.MenuDTO instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.MenuDTO::pai;
  }-*/;
  
  private static native void setPai(br.com.cweb.seguranca.persistence.entity.MenuDTO instance, java.lang.Integer value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.MenuDTO::pai = value;
  }-*/;
  
  private static native java.lang.String getSigla(br.com.cweb.seguranca.persistence.entity.MenuDTO instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.MenuDTO::sigla;
  }-*/;
  
  private static native void setSigla(br.com.cweb.seguranca.persistence.entity.MenuDTO instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.MenuDTO::sigla = value;
  }-*/;
  
  private static native br.com.cweb.seguranca.persistence.entity.TipoFuncionalidade getTipoFuncionlidade(br.com.cweb.seguranca.persistence.entity.MenuDTO instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.MenuDTO::tipoFuncionlidade;
  }-*/;
  
  private static native void setTipoFuncionlidade(br.com.cweb.seguranca.persistence.entity.MenuDTO instance, br.com.cweb.seguranca.persistence.entity.TipoFuncionalidade value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.MenuDTO::tipoFuncionlidade = value;
  }-*/;
  
  private static native java.lang.String getTooltip(br.com.cweb.seguranca.persistence.entity.MenuDTO instance) /*-{
    return instance.@br.com.cweb.seguranca.persistence.entity.MenuDTO::tooltip;
  }-*/;
  
  private static native void setTooltip(br.com.cweb.seguranca.persistence.entity.MenuDTO instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.seguranca.persistence.entity.MenuDTO::tooltip = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.seguranca.persistence.entity.MenuDTO instance) throws SerializationException {
    setDescricao(instance, streamReader.readString());
    setId(instance, (java.lang.Integer) streamReader.readObject());
    setIdGrupoAcesso(instance, (java.lang.Long) streamReader.readObject());
    setPai(instance, (java.lang.Integer) streamReader.readObject());
    setSigla(instance, streamReader.readString());
    setTipoFuncionlidade(instance, (br.com.cweb.seguranca.persistence.entity.TipoFuncionalidade) streamReader.readObject());
    setTooltip(instance, streamReader.readString());
    
  }
  
  public static br.com.cweb.seguranca.persistence.entity.MenuDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.seguranca.persistence.entity.MenuDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.seguranca.persistence.entity.MenuDTO instance) throws SerializationException {
    streamWriter.writeString(getDescricao(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getIdGrupoAcesso(instance));
    streamWriter.writeObject(getPai(instance));
    streamWriter.writeString(getSigla(instance));
    streamWriter.writeObject(getTipoFuncionlidade(instance));
    streamWriter.writeString(getTooltip(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.seguranca.persistence.entity.MenuDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.seguranca.persistence.entity.MenuDTO_FieldSerializer.deserialize(reader, (br.com.cweb.seguranca.persistence.entity.MenuDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.seguranca.persistence.entity.MenuDTO_FieldSerializer.serialize(writer, (br.com.cweb.seguranca.persistence.entity.MenuDTO)object);
  }
  
}
