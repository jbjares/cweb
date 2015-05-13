package br.com.cweb.widgets.window;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class DefaultWindowConfig_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Map getParameters(br.com.cweb.widgets.window.DefaultWindowConfig instance) /*-{
    return instance.@br.com.cweb.widgets.window.DefaultWindowConfig::parameters;
  }-*/;
  
  private static native void setParameters(br.com.cweb.widgets.window.DefaultWindowConfig instance, java.util.Map value) 
  /*-{
    instance.@br.com.cweb.widgets.window.DefaultWindowConfig::parameters = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.widgets.window.DefaultWindowConfig instance) throws SerializationException {
    setParameters(instance, (java.util.Map) streamReader.readObject());
    
  }
  
  public static br.com.cweb.widgets.window.DefaultWindowConfig instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.widgets.window.DefaultWindowConfig();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.widgets.window.DefaultWindowConfig instance) throws SerializationException {
    streamWriter.writeObject(getParameters(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.widgets.window.DefaultWindowConfig_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.widgets.window.DefaultWindowConfig_FieldSerializer.deserialize(reader, (br.com.cweb.widgets.window.DefaultWindowConfig)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.widgets.window.DefaultWindowConfig_FieldSerializer.serialize(writer, (br.com.cweb.widgets.window.DefaultWindowConfig)object);
  }
  
}
