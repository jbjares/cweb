package br.com.cweb.core.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class EntityModel_FieldSerializer {
  private static native java.util.Date getDataHoraAtualizacao(br.com.cweb.core.persistence.entity.EntityModel instance) /*-{
    return instance.@br.com.cweb.core.persistence.entity.EntityModel::dataHoraAtualizacao;
  }-*/;
  
  private static native void setDataHoraAtualizacao(br.com.cweb.core.persistence.entity.EntityModel instance, java.util.Date value) 
  /*-{
    instance.@br.com.cweb.core.persistence.entity.EntityModel::dataHoraAtualizacao = value;
  }-*/;
  
  private static native java.lang.Long getIdUsuarioAtualizador(br.com.cweb.core.persistence.entity.EntityModel instance) /*-{
    return instance.@br.com.cweb.core.persistence.entity.EntityModel::idUsuarioAtualizador;
  }-*/;
  
  private static native void setIdUsuarioAtualizador(br.com.cweb.core.persistence.entity.EntityModel instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.core.persistence.entity.EntityModel::idUsuarioAtualizador = value;
  }-*/;
  
  private static native java.lang.Boolean getPossuiCadastroAtivo(br.com.cweb.core.persistence.entity.EntityModel instance) /*-{
    return instance.@br.com.cweb.core.persistence.entity.EntityModel::possuiCadastroAtivo;
  }-*/;
  
  private static native void setPossuiCadastroAtivo(br.com.cweb.core.persistence.entity.EntityModel instance, java.lang.Boolean value) 
  /*-{
    instance.@br.com.cweb.core.persistence.entity.EntityModel::possuiCadastroAtivo = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.core.persistence.entity.EntityModel instance) throws SerializationException {
    setDataHoraAtualizacao(instance, (java.util.Date) streamReader.readObject());
    setIdUsuarioAtualizador(instance, (java.lang.Long) streamReader.readObject());
    setPossuiCadastroAtivo(instance, (java.lang.Boolean) streamReader.readObject());
    
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.core.persistence.entity.EntityModel instance) throws SerializationException {
    streamWriter.writeObject(getDataHoraAtualizacao(instance));
    streamWriter.writeObject(getIdUsuarioAtualizador(instance));
    streamWriter.writeObject(getPossuiCadastroAtivo(instance));
    
  }
  
}
