package br.com.cweb.cadastro.persistence.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Endereco_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.cadastro.persistence.entity.Endereco[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.cadastro.persistence.entity.Endereco[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new br.com.cweb.cadastro.persistence.entity.Endereco[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.cadastro.persistence.entity.Endereco[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.cadastro.persistence.entity.Endereco_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.Endereco_Array_Rank_1_FieldSerializer.deserialize(reader, (br.com.cweb.cadastro.persistence.entity.Endereco[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.cadastro.persistence.entity.Endereco_Array_Rank_1_FieldSerializer.serialize(writer, (br.com.cweb.cadastro.persistence.entity.Endereco[])object);
  }
  
}
