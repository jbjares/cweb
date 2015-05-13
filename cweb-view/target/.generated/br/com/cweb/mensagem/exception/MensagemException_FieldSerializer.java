package br.com.cweb.mensagem.exception;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class MensagemException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getListaMensagens(br.com.cweb.mensagem.exception.MensagemException instance) /*-{
    return instance.@br.com.cweb.mensagem.exception.MensagemException::listaMensagens;
  }-*/;
  
  private static native void setListaMensagens(br.com.cweb.mensagem.exception.MensagemException instance, java.util.List value) 
  /*-{
    instance.@br.com.cweb.mensagem.exception.MensagemException::listaMensagens = value;
  }-*/;
  
  private static native br.com.cweb.mensagem.to.Mensagem getMensagem(br.com.cweb.mensagem.exception.MensagemException instance) /*-{
    return instance.@br.com.cweb.mensagem.exception.MensagemException::mensagem;
  }-*/;
  
  private static native void setMensagem(br.com.cweb.mensagem.exception.MensagemException instance, br.com.cweb.mensagem.to.Mensagem value) 
  /*-{
    instance.@br.com.cweb.mensagem.exception.MensagemException::mensagem = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, br.com.cweb.mensagem.exception.MensagemException instance) throws SerializationException {
    setListaMensagens(instance, (java.util.List) streamReader.readObject());
    setMensagem(instance, (br.com.cweb.mensagem.to.Mensagem) streamReader.readObject());
    
    com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static br.com.cweb.mensagem.exception.MensagemException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new br.com.cweb.mensagem.exception.MensagemException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, br.com.cweb.mensagem.exception.MensagemException instance) throws SerializationException {
    streamWriter.writeObject(getListaMensagens(instance));
    streamWriter.writeObject(getMensagem(instance));
    
    com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return br.com.cweb.mensagem.exception.MensagemException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    br.com.cweb.mensagem.exception.MensagemException_FieldSerializer.deserialize(reader, (br.com.cweb.mensagem.exception.MensagemException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    br.com.cweb.mensagem.exception.MensagemException_FieldSerializer.serialize(writer, (br.com.cweb.mensagem.exception.MensagemException)object);
  }
  
}
