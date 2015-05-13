package br.com.cweb.core.persistence.beanmodel;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class SimpleModelData_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.core.persistence.beanmodel.SimpleModelData instance) throws SerializationException {
    
    com.extjs.gxt.ui.client.data.BeanModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.core.persistence.beanmodel.SimpleModelData instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.core.persistence.beanmodel.SimpleModelData();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.core.persistence.beanmodel.SimpleModelData instance) throws SerializationException {
    
    com.extjs.gxt.ui.client.data.BeanModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.core.persistence.beanmodel.SimpleModelData_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.core.persistence.beanmodel.SimpleModelData_FieldSerializer.deserialize(reader, (br.com.cweb.core.persistence.beanmodel.SimpleModelData)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.core.persistence.beanmodel.SimpleModelData_FieldSerializer.serialize(writer, (br.com.cweb.core.persistence.beanmodel.SimpleModelData)object);
  }
  
}
