package br.com.cweb.mensagem.to;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Mensagem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Integer getCodigo(br.com.cweb.mensagem.to.Mensagem instance) /*-{
    return instance.@br.com.cweb.mensagem.to.Mensagem::codigo;
  }-*/;
  
  private static native void setCodigo(br.com.cweb.mensagem.to.Mensagem instance, java.lang.Integer value) 
  /*-{
    instance.@br.com.cweb.mensagem.to.Mensagem::codigo = value;
  }-*/;
  
  private static native java.lang.String getDescricao(br.com.cweb.mensagem.to.Mensagem instance) /*-{
    return instance.@br.com.cweb.mensagem.to.Mensagem::descricao;
  }-*/;
  
  private static native void setDescricao(br.com.cweb.mensagem.to.Mensagem instance, java.lang.String value) 
  /*-{
    instance.@br.com.cweb.mensagem.to.Mensagem::descricao = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.mensagem.to.Mensagem instance) throws SerializationException {
    setCodigo(instance, (java.lang.Integer) streamReader.readObject());
    setDescricao(instance, streamReader.readString());
    
  }
  
  public static br.com.cweb.mensagem.to.Mensagem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.mensagem.to.Mensagem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.mensagem.to.Mensagem instance) throws SerializationException {
    streamWriter.writeObject(getCodigo(instance));
    streamWriter.writeString(getDescricao(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.mensagem.to.Mensagem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.mensagem.to.Mensagem_FieldSerializer.deserialize(reader, (br.com.cweb.mensagem.to.Mensagem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.mensagem.to.Mensagem_FieldSerializer.serialize(writer, (br.com.cweb.mensagem.to.Mensagem)object);
  }
  
}
