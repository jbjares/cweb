package br.com.cweb.core.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TipoSituacaoAtivacao_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Integer getTipo(br.com.cweb.core.persistence.entity.TipoSituacaoAtivacao instance) /*-{
    return instance.@br.com.cweb.core.persistence.entity.TipoSituacaoAtivacao::tipo;
  }-*/;
  
  private static native void setTipo(br.com.cweb.core.persistence.entity.TipoSituacaoAtivacao instance, java.lang.Integer value) 
  /*-{
    instance.@br.com.cweb.core.persistence.entity.TipoSituacaoAtivacao::tipo = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.core.persistence.entity.TipoSituacaoAtivacao instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static br.com.cweb.core.persistence.entity.TipoSituacaoAtivacao instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    br.com.cweb.core.persistence.entity.TipoSituacaoAtivacao[] values = br.com.cweb.core.persistence.entity.TipoSituacaoAtivacao.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.core.persistence.entity.TipoSituacaoAtivacao instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.core.persistence.entity.TipoSituacaoAtivacao_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.core.persistence.entity.TipoSituacaoAtivacao_FieldSerializer.deserialize(reader, (br.com.cweb.core.persistence.entity.TipoSituacaoAtivacao)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.core.persistence.entity.TipoSituacaoAtivacao_FieldSerializer.serialize(writer, (br.com.cweb.core.persistence.entity.TipoSituacaoAtivacao)object);
  }
  
}
