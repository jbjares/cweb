package br.com.cweb.core.persistence.exception;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class NenhumRegistroEncontradoException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException_FieldSerializer.deserialize(reader, (br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException_FieldSerializer.serialize(writer, (br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException)object);
  }
  
}
