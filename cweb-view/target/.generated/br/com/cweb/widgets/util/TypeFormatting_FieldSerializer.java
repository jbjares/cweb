package br.com.cweb.widgets.util;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TypeFormatting_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.widgets.util.TypeFormatting instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static br.com.cweb.widgets.util.TypeFormatting instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    br.com.cweb.widgets.util.TypeFormatting[] values = br.com.cweb.widgets.util.TypeFormatting.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.widgets.util.TypeFormatting instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.widgets.util.TypeFormatting_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.widgets.util.TypeFormatting_FieldSerializer.deserialize(reader, (br.com.cweb.widgets.util.TypeFormatting)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.widgets.util.TypeFormatting_FieldSerializer.serialize(writer, (br.com.cweb.widgets.util.TypeFormatting)object);
  }
  
}
