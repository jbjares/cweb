package br.com.cweb.relatorio.to;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TipoNomeRelatorio_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getNome(br.com.cweb.relatorio.to.TipoNomeRelatorio instance) /*-{
    return instance.@br.com.cweb.relatorio.to.TipoNomeRelatorio::nome;
  }-*/;
  
  private static native void setNome(br.com.cweb.relatorio.to.TipoNomeRelatorio instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.relatorio.to.TipoNomeRelatorio::nome = value;
  }-*/;
  
  private static native java.lang.Integer getValue(br.com.cweb.relatorio.to.TipoNomeRelatorio instance) /*-{
    return instance.@br.com.cweb.relatorio.to.TipoNomeRelatorio::value;
  }-*/;
  
  private static native void setValue(br.com.cweb.relatorio.to.TipoNomeRelatorio instance, java.lang.Integer value) 
  /*-{
    instance.@br.com.cweb.relatorio.to.TipoNomeRelatorio::value = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.relatorio.to.TipoNomeRelatorio instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static br.com.cweb.relatorio.to.TipoNomeRelatorio instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    br.com.cweb.relatorio.to.TipoNomeRelatorio[] values = br.com.cweb.relatorio.to.TipoNomeRelatorio.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.relatorio.to.TipoNomeRelatorio instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.relatorio.to.TipoNomeRelatorio_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.relatorio.to.TipoNomeRelatorio_FieldSerializer.deserialize(reader, (br.com.cweb.relatorio.to.TipoNomeRelatorio)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.relatorio.to.TipoNomeRelatorio_FieldSerializer.serialize(writer, (br.com.cweb.relatorio.to.TipoNomeRelatorio)object);
  }
  
}
