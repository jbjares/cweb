package br.com.cweb.widgets.constants;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Function_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getCodigo(br.com.cweb.widgets.constants.Function instance) /*-{
    return instance.@br.com.cweb.widgets.constants.Function::codigo;
  }-*/;
  
  private static native void setCodigo(br.com.cweb.widgets.constants.Function instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.widgets.constants.Function::codigo = value;
  }-*/;
  
  private static native java.lang.String getName(br.com.cweb.widgets.constants.Function instance) /*-{
    return instance.@br.com.cweb.widgets.constants.Function::name;
  }-*/;
  
  private static native void setName(br.com.cweb.widgets.constants.Function instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.widgets.constants.Function::name = value;
  }-*/;
  
  private static native java.lang.Integer getValue(br.com.cweb.widgets.constants.Function instance) /*-{
    return instance.@br.com.cweb.widgets.constants.Function::value;
  }-*/;
  
  private static native void setValue(br.com.cweb.widgets.constants.Function instance, java.lang.Integer value) 
  /*-{
    instance.@br.com.cweb.widgets.constants.Function::value = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.widgets.constants.Function instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static br.com.cweb.widgets.constants.Function instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    br.com.cweb.widgets.constants.Function[] values = br.com.cweb.widgets.constants.Function.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.widgets.constants.Function instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.widgets.constants.Function_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.widgets.constants.Function_FieldSerializer.deserialize(reader, (br.com.cweb.widgets.constants.Function)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.widgets.constants.Function_FieldSerializer.serialize(writer, (br.com.cweb.widgets.constants.Function)object);
  }
  
}
