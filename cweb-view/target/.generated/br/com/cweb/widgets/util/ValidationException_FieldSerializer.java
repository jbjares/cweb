package br.com.cweb.widgets.util;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ValidationException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.widgets.util.ValidationException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.widgets.util.ValidationException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.widgets.util.ValidationException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.widgets.util.ValidationException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.widgets.util.ValidationException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.widgets.util.ValidationException_FieldSerializer.deserialize(reader, (br.com.cweb.widgets.util.ValidationException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.widgets.util.ValidationException_FieldSerializer.serialize(writer, (br.com.cweb.widgets.util.ValidationException)object);
  }
  
}
