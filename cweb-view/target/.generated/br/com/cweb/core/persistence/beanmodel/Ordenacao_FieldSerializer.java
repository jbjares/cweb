package br.com.cweb.core.persistence.beanmodel;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Ordenacao_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getAsc(br.com.cweb.core.persistence.beanmodel.Ordenacao instance) /*-{
    return instance.@br.com.cweb.core.persistence.beanmodel.Ordenacao::asc;
  }-*/;
  
  private static native void setAsc(br.com.cweb.core.persistence.beanmodel.Ordenacao instance, boolean value) 
  /*-{
    instance.@br.com.cweb.core.persistence.beanmodel.Ordenacao::asc = value;
  }-*/;
  
  private static native java.lang.String getAtributo(br.com.cweb.core.persistence.beanmodel.Ordenacao instance) /*-{
    return instance.@br.com.cweb.core.persistence.beanmodel.Ordenacao::atributo;
  }-*/;
  
  private static native void setAtributo(br.com.cweb.core.persistence.beanmodel.Ordenacao instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.core.persistence.beanmodel.Ordenacao::atributo = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.core.persistence.beanmodel.Ordenacao instance) throws SerializationException {
    setAsc(instance, streamReader.readBoolean());
    setAtributo(instance, streamReader.readString());
    
  }
  
  public static br.com.cweb.core.persistence.beanmodel.Ordenacao instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.core.persistence.beanmodel.Ordenacao();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.core.persistence.beanmodel.Ordenacao instance) throws SerializationException {
    streamWriter.writeBoolean(getAsc(instance));
    streamWriter.writeString(getAtributo(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.core.persistence.beanmodel.Ordenacao_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.core.persistence.beanmodel.Ordenacao_FieldSerializer.deserialize(reader, (br.com.cweb.core.persistence.beanmodel.Ordenacao)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.core.persistence.beanmodel.Ordenacao_FieldSerializer.serialize(writer, (br.com.cweb.core.persistence.beanmodel.Ordenacao)object);
  }
  
}
