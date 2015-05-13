package br.com.cweb.view.seguranca.acessorecurso.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.RpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class AcessoRecursoServiceFacade_Proxy extends RemoteServiceProxy implements br.com.cweb.view.seguranca.acessorecurso.client.service.AcessoRecursoServiceFacadeAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "br.com.cweb.view.seguranca.acessorecurso.client.service.AcessoRecursoServiceFacade";
  private static final String SERIALIZATION_POLICY ="4A2E88955115B37ED1A3FE11EA71EE20";
  private static final br.com.cweb.view.seguranca.acessorecurso.client.service.AcessoRecursoServiceFacade_TypeSerializer SERIALIZER = new br.com.cweb.view.seguranca.acessorecurso.client.service.AcessoRecursoServiceFacade_TypeSerializer();
  
  public AcessoRecursoServiceFacade_Proxy() {
    super(GWT.getModuleBaseURL(),
      "springGwtServices/AcessoRecursoServiceFacade", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getWindowConfig(java.lang.String codigoFunc, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AcessoRecursoServiceFacade_Proxy.getWindowConfig", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getWindowConfig");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(codigoFunc);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AcessoRecursoServiceFacade_Proxy.getWindowConfig",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "AcessoRecursoServiceFacade_Proxy.getWindowConfig", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getWindowConfig(java.lang.String idFuncionalidade, java.lang.String idGrupoAcesso, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AcessoRecursoServiceFacade_Proxy.getWindowConfig", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getWindowConfig");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idFuncionalidade);
      streamWriter.writeString(idGrupoAcesso);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AcessoRecursoServiceFacade_Proxy.getWindowConfig",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "AcessoRecursoServiceFacade_Proxy.getWindowConfig", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  @Override
  public SerializationStreamWriter createStreamWriter() {
    ClientSerializationStreamWriter toReturn =
      (ClientSerializationStreamWriter) super.createStreamWriter();
    if (getRpcToken() != null) {
      toReturn.addFlags(ClientSerializationStreamWriter.FLAG_RPC_TOKEN_INCLUDED);
    }
    return toReturn;
  }
  @Override
  protected void checkRpcTokenType(RpcToken token) {
    if (!(token instanceof com.google.gwt.user.client.rpc.XsrfToken)) {
      throw new RpcTokenException("Invalid RpcToken type: expected 'com.google.gwt.user.client.rpc.XsrfToken' but got '" + token.getClass() + "'");
    }
  }
}
