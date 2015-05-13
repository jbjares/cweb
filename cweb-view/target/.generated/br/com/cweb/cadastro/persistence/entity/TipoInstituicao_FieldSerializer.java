package br.com.cweb.cadastro.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TipoInstituicao_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Integer getValue(br.com.cweb.cadastro.persistence.entity.TipoInstituicao instance) /*-{
    return instance.@br.com.cweb.cadastro.persistence.entity.TipoInstituicao::value;
  }-*/;
  
  private static native void setValue(br.com.cweb.cadastro.persistence.entity.TipoInstituicao instance, java.lang.Integer value) 
  /*-{
    instance.@br.com.cweb.cadastro.persistence.entity.TipoInstituicao::value = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.cadastro.persistence.entity.TipoInstituicao instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static br.com.cweb.cadastro.persistence.entity.TipoInstituicao instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    br.com.cweb.cadastro.persistence.entity.TipoInstituicao[] values = br.com.cweb.cadastro.persistence.entity.TipoInstituicao.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.cadastro.persistence.entity.TipoInstituicao instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.cadastro.persistence.entity.TipoInstituicao_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.TipoInstituicao_FieldSerializer.deserialize(reader, (br.com.cweb.cadastro.persistence.entity.TipoInstituicao)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.TipoInstituicao_FieldSerializer.serialize(writer, (br.com.cweb.cadastro.persistence.entity.TipoInstituicao)object);
  }
  
}
