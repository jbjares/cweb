package br.com.cweb.cadastro.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class InstituicaoFinanceira_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Long getId(br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira::id;
  }-*/;
  
  private static native void setId(br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira::id = value;
  }-*/;
  
  private static native java.lang.String getNome(br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira::nome;
  }-*/;
  
  private static native void setNome(br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira::nome = value;
  }-*/;
  
  private static native java.lang.String getObservacoes(br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira::observacoes;
  }-*/;
  
  private static native void setObservacoes(br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira::observacoes = value;
  }-*/;
  
  private static native java.lang.String getSigla(br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira::sigla;
  }-*/;
  
  private static native void setSigla(br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira::sigla = value;
  }-*/;
  
  private static native java.lang.String getSite(br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira::site;
  }-*/;
  
  private static native void setSite(br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira::site = value;
  }-*/;
  
  private static native br.com.cweb.cadastro.persistence.entity.TipoInstituicao getTipoInstituicao(br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira::tipoInstituicao;
  }-*/;
  
  private static native void setTipoInstituicao(br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira instance, br.com.cweb.cadastro.persistence.entity.TipoInstituicao value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira::tipoInstituicao = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-2", streamReader.readString());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNome(instance, streamReader.readString());
    setObservacoes(instance, streamReader.readString());
    setSigla(instance, streamReader.readString());
    setSite(instance, streamReader.readString());
    setTipoInstituicao(instance, (br.com.cweb.cadastro.persistence.entity.TipoInstituicao) streamReader.readObject());
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-2"));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getNome(instance));
    streamWriter.writeString(getObservacoes(instance));
    streamWriter.writeString(getSigla(instance));
    streamWriter.writeString(getSite(instance));
    streamWriter.writeObject(getTipoInstituicao(instance));
    
    br.com.cweb.core.persistence.entity.EntityModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira_FieldSerializer.deserialize(reader, (br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira_FieldSerializer.serialize(writer, (br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira)object);
  }
  
}
