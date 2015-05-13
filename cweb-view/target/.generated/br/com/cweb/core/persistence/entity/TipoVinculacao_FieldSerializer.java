package br.com.cweb.core.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TipoVinculacao_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Integer getTipo(br.com.cweb.core.persistence.entity.TipoVinculacao instance) /*-{
    return instance.@br.com.cweb.core.persistence.entity.TipoVinculacao::tipo;
  }-*/;
  
  private static native void setTipo(br.com.cweb.core.persistence.entity.TipoVinculacao instance, java.lang.Integer value) 
  /*-{
    instance.@br.com.cweb.core.persistence.entity.TipoVinculacao::tipo = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.core.persistence.entity.TipoVinculacao instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static br.com.cweb.core.persistence.entity.TipoVinculacao instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    br.com.cweb.core.persistence.entity.TipoVinculacao[] values = br.com.cweb.core.persistence.entity.TipoVinculacao.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.core.persistence.entity.TipoVinculacao instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.core.persistence.entity.TipoVinculacao_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.core.persistence.entity.TipoVinculacao_FieldSerializer.deserialize(reader, (br.com.cweb.core.persistence.entity.TipoVinculacao)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.core.persistence.entity.TipoVinculacao_FieldSerializer.serialize(writer, (br.com.cweb.core.persistence.entity.TipoVinculacao)object);
  }
  
}
