package br.com.cweb.view.seguranca.trocasenha.client.service;

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

public class TrocaSenhaServiceFacade_Proxy extends RemoteServiceProxy implements br.com.cweb.view.seguranca.trocasenha.client.service.TrocaSenhaServiceFacadeAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "br.com.cweb.view.seguranca.trocasenha.client.service.TrocaSenhaServiceFacade";
  private static final String SERIALIZATION_POLICY ="80D1767BE8A4B6F41B49ED7841A7C235";
  private static final br.com.cweb.view.seguranca.trocasenha.client.service.TrocaSenhaServiceFacade_TypeSerializer SERIALIZER = new br.com.cweb.view.seguranca.trocasenha.client.service.TrocaSenhaServiceFacade_TypeSerializer();
  
  public TrocaSenhaServiceFacade_Proxy() {
    super(GWT.getModuleBaseURL(),
      "springGwtServices/TrocaSenhaServiceFacade", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void alterarSenha(java.lang.String senha, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("TrocaSenhaServiceFacade_Proxy.alterarSenha", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("alterarSenha");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(senha);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("TrocaSenhaServiceFacade_Proxy.alterarSenha",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "TrocaSenhaServiceFacade_Proxy.alterarSenha", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void obterLoginPessoa(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("TrocaSenhaServiceFacade_Proxy.obterLoginPessoa", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("obterLoginPessoa");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("TrocaSenhaServiceFacade_Proxy.obterLoginPessoa",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "TrocaSenhaServiceFacade_Proxy.obterLoginPessoa", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void obterUsuario(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("TrocaSenhaServiceFacade_Proxy.obterUsuario", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("obterUsuario");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("TrocaSenhaServiceFacade_Proxy.obterUsuario",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "TrocaSenhaServiceFacade_Proxy.obterUsuario", statsContext, payload, callback);
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
