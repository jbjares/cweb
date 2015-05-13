package br.com.cweb.view.template.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ComboBoxClear_TriggerAction_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.view.template.client.ComboBoxClear.TriggerAction instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static br.com.cweb.view.template.client.ComboBoxClear.TriggerAction instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    br.com.cweb.view.template.client.ComboBoxClear.TriggerAction[] values = br.com.cweb.view.template.client.ComboBoxClear.TriggerAction.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.view.template.client.ComboBoxClear.TriggerAction instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.view.template.client.ComboBoxClear_TriggerAction_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.view.template.client.ComboBoxClear_TriggerAction_FieldSerializer.deserialize(reader, (br.com.cweb.view.template.client.ComboBoxClear.TriggerAction)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.view.template.client.ComboBoxClear_TriggerAction_FieldSerializer.serialize(writer, (br.com.cweb.view.template.client.ComboBoxClear.TriggerAction)object);
  }
  
}
