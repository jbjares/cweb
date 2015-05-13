package br.com.cweb.core.persistence.beanmodel;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ResultadoPaginado_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native br.com.cweb.core.persistence.beanmodel.Paginador getPaginador(br.com.cweb.core.persistence.beanmodel.ResultadoPaginado instance) /*-{
    return instance.@br.com.cweb.core.persistence.beanmodel.ResultadoPaginado::paginador;
  }-*/;
  
  private static native void setPaginador(br.com.cweb.core.persistence.beanmodel.ResultadoPaginado instance, br.com.cweb.core.persistence.beanmodel.Paginador value) 
  /*-{
    instance.@br.com.cweb.core.persistence.beanmodel.ResultadoPaginado::paginador = value;
  }-*/;
  
  private static native java.util.List getResultado(br.com.cweb.core.persistence.beanmodel.ResultadoPaginado instance) /*-{
    return instance.@br.com.cweb.core.persistence.beanmodel.ResultadoPaginado::resultado;
  }-*/;
  
  private static native void setResultado(br.com.cweb.core.persistence.beanmodel.ResultadoPaginado instance, java.util.List value) 
  /*-{
    instance.@br.com.cweb.core.persistence.beanmodel.ResultadoPaginado::resultado = value;
  }-*/;
  
  private static native java.lang.Long getTotalRegistros(br.com.cweb.core.persistence.beanmodel.ResultadoPaginado instance) /*-{
    return instance.@br.com.cweb.core.persistence.beanmodel.ResultadoPaginado::totalRegistros;
  }-*/;
  
  private static native void setTotalRegistros(br.com.cweb.core.persistence.beanmodel.ResultadoPaginado instance, java.lang.Long value) 
  /*-{
    instance.@br.com.cweb.core.persistence.beanmodel.ResultadoPaginado::totalRegistros = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.core.persistence.beanmodel.ResultadoPaginado instance) throws SerializationException {
    setPaginador(instance, (br.com.cweb.core.persistence.beanmodel.Paginador) streamReader.readObject());
    setResultado(instance, (java.util.List) streamReader.readObject());
    setTotalRegistros(instance, (java.lang.Long) streamReader.readObject());
    
  }
  
  public static br.com.cweb.core.persistence.beanmodel.ResultadoPaginado instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.core.persistence.beanmodel.ResultadoPaginado();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.core.persistence.beanmodel.ResultadoPaginado instance) throws SerializationException {
    streamWriter.writeObject(getPaginador(instance));
    streamWriter.writeObject(getResultado(instance));
    streamWriter.writeObject(getTotalRegistros(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.core.persistence.beanmodel.ResultadoPaginado_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.core.persistence.beanmodel.ResultadoPaginado_FieldSerializer.deserialize(reader, (br.com.cweb.core.persistence.beanmodel.ResultadoPaginado)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.core.persistence.beanmodel.ResultadoPaginado_FieldSerializer.serialize(writer, (br.com.cweb.core.persistence.beanmodel.ResultadoPaginado)object);
  }
  
}
