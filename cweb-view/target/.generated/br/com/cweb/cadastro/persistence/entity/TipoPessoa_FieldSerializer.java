package br.com.cweb.cadastro.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TipoPessoa_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Integer getTipo(br.com.cweb.cadastro.persistence.entity.TipoPessoa instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.TipoPessoa::tipo;
  }-*/;
  
  private static native void setTipo(br.com.cweb.cadastro.persistence.entity.TipoPessoa instance, java.lang.Integer value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.TipoPessoa::tipo = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.cadastro.persistence.entity.TipoPessoa instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static br.com.cweb.cadastro.persistence.entity.TipoPessoa instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    br.com.cweb.cadastro.persistence.entity.TipoPessoa[] values = br.com.cweb.cadastro.persistence.entity.TipoPessoa.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.cadastro.persistence.entity.TipoPessoa instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.cadastro.persistence.entity.TipoPessoa_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.TipoPessoa_FieldSerializer.deserialize(reader, (br.com.cweb.cadastro.persistence.entity.TipoPessoa)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.TipoPessoa_FieldSerializer.serialize(writer, (br.com.cweb.cadastro.persistence.entity.TipoPessoa)object);
  }
  
}
