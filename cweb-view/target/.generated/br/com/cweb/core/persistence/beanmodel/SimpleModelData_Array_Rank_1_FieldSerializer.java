package br.com.cweb.core.persistence.beanmodel;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class SimpleModelData_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.core.persistence.beanmodel.SimpleModelData[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.core.persistence.beanmodel.SimpleModelData[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new br.com.cweb.core.persistence.beanmodel.SimpleModelData[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.core.persistence.beanmodel.SimpleModelData[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.core.persistence.beanmodel.SimpleModelData_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.core.persistence.beanmodel.SimpleModelData_Array_Rank_1_FieldSerializer.deserialize(reader, (br.com.cweb.core.persistence.beanmodel.SimpleModelData[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.core.persistence.beanmodel.SimpleModelData_Array_Rank_1_FieldSerializer.serialize(writer, (br.com.cweb.core.persistence.beanmodel.SimpleModelData[])object);
  }
  
}
