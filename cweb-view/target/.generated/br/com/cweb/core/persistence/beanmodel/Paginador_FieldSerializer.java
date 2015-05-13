package br.com.cweb.core.persistence.beanmodel;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Paginador_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native int getIndiceRegistroInicial(br.com.cweb.core.persistence.beanmodel.Paginador instance) /*-{
    return instance.@br.com.cweb.core.persistence.beanmodel.Paginador::indiceRegistroInicial;
  }-*/;
  
  private static native void setIndiceRegistroInicial(br.com.cweb.core.persistence.beanmodel.Paginador instance, int value) 
  /*-{
    instance.@br.com.cweb.core.persistence.beanmodel.Paginador::indiceRegistroInicial = value;
  }-*/;
  
  private static native int getRegistrosPorPagina(br.com.cweb.core.persistence.beanmodel.Paginador instance) /*-{
    return instance.@br.com.cweb.core.persistence.beanmodel.Paginador::registrosPorPagina;
  }-*/;
  
  private static native void setRegistrosPorPagina(br.com.cweb.core.persistence.beanmodel.Paginador instance, int value) 
  /*-{
    instance.@br.com.cweb.core.persistence.beanmodel.Paginador::registrosPorPagina = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.core.persistence.beanmodel.Paginador instance) throws SerializationException {
    setIndiceRegistroInicial(instance, streamReader.readInt());
    setRegistrosPorPagina(instance, streamReader.readInt());
    
  }
  
  public static br.com.cweb.core.persistence.beanmodel.Paginador instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.core.persistence.beanmodel.Paginador();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.core.persistence.beanmodel.Paginador instance) throws SerializationException {
    streamWriter.writeInt(getIndiceRegistroInicial(instance));
    streamWriter.writeInt(getRegistrosPorPagina(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.core.persistence.beanmodel.Paginador_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.core.persistence.beanmodel.Paginador_FieldSerializer.deserialize(reader, (br.com.cweb.core.persistence.beanmodel.Paginador)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.core.persistence.beanmodel.Paginador_FieldSerializer.serialize(writer, (br.com.cweb.core.persistence.beanmodel.Paginador)object);
  }
  
}
