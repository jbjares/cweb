package br.com.cweb.view.seguranca.cadastrogrupoacesso.client.service;

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

public class CadastroGrupoAcessoServiceFacade_Proxy extends RemoteServiceProxy implements br.com.cweb.view.seguranca.cadastrogrupoacesso.client.service.CadastroGrupoAcessoServiceFacadeAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "br.com.cweb.view.seguranca.cadastrogrupoacesso.client.service.CadastroGrupoAcessoServiceFacade";
  private static final String SERIALIZATION_POLICY ="5ACA1935FAED1DA5248E9FD457881F4F";
  private static final br.com.cweb.view.seguranca.cadastrogrupoacesso.client.service.CadastroGrupoAcessoServiceFacade_TypeSerializer SERIALIZER = new br.com.cweb.view.seguranca.cadastrogrupoacesso.client.service.CadastroGrupoAcessoServiceFacade_TypeSerializer();
  
  public CadastroGrupoAcessoServiceFacade_Proxy() {
    super(GWT.getModuleBaseURL(),
      "springGwtServices/CadastroGrupoAcessoServiceFacade", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void atualizarGrupoAcesso(br.com.cweb.seguranca.persistence.entity.GrupoAcesso grupoAcesso, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGrupoAcessoServiceFacade_Proxy.atualizarGrupoAcesso", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("atualizarGrupoAcesso");
      streamWriter.writeInt(1);
      streamWriter.writeString("br.com.cweb.seguranca.persistence.entity.GrupoAcesso/1091394704");
      streamWriter.writeObject(grupoAcesso);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGrupoAcessoServiceFacade_Proxy.atualizarGrupoAcesso",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "CadastroGrupoAcessoServiceFacade_Proxy.atualizarGrupoAcesso", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void excluirGrupoAcesso(br.com.cweb.seguranca.persistence.entity.GrupoAcesso grupoAcesso, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGrupoAcessoServiceFacade_Proxy.excluirGrupoAcesso", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("excluirGrupoAcesso");
      streamWriter.writeInt(1);
      streamWriter.writeString("br.com.cweb.seguranca.persistence.entity.GrupoAcesso/1091394704");
      streamWriter.writeObject(grupoAcesso);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGrupoAcessoServiceFacade_Proxy.excluirGrupoAcesso",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "CadastroGrupoAcessoServiceFacade_Proxy.excluirGrupoAcesso", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void gerarRelatorio(br.com.cweb.relatorio.to.TipoNomeRelatorio nomeRelatorio, br.com.cweb.relatorio.to.TipoFormatoRelatorio formato, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGrupoAcessoServiceFacade_Proxy.gerarRelatorio", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("gerarRelatorio");
      streamWriter.writeInt(2);
      streamWriter.writeString("br.com.cweb.relatorio.to.TipoNomeRelatorio/887727518");
      streamWriter.writeString("br.com.cweb.relatorio.to.TipoFormatoRelatorio/1851932827");
      streamWriter.writeObject(nomeRelatorio);
      streamWriter.writeObject(formato);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGrupoAcessoServiceFacade_Proxy.gerarRelatorio",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "CadastroGrupoAcessoServiceFacade_Proxy.gerarRelatorio", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void incluirGrupoAcesso(br.com.cweb.seguranca.persistence.entity.GrupoAcesso grupoAcesso, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGrupoAcessoServiceFacade_Proxy.incluirGrupoAcesso", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("incluirGrupoAcesso");
      streamWriter.writeInt(1);
      streamWriter.writeString("br.com.cweb.seguranca.persistence.entity.GrupoAcesso/1091394704");
      streamWriter.writeObject(grupoAcesso);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGrupoAcessoServiceFacade_Proxy.incluirGrupoAcesso",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "CadastroGrupoAcessoServiceFacade_Proxy.incluirGrupoAcesso", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void recuperaGrupoAcesso(java.lang.Long id, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGrupoAcessoServiceFacade_Proxy.recuperaGrupoAcesso", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("recuperaGrupoAcesso");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(id);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGrupoAcessoServiceFacade_Proxy.recuperaGrupoAcesso",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGrupoAcessoServiceFacade_Proxy.recuperaGrupoAcesso", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListaPaginadaGruposAcesso(com.extjs.gxt.ui.client.data.PagingLoadConfig config, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGrupoAcessoServiceFacade_Proxy.retornaListaPaginadaGruposAcesso", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListaPaginadaGruposAcesso");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.extjs.gxt.ui.client.data.PagingLoadConfig");
      streamWriter.writeObject(config);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGrupoAcessoServiceFacade_Proxy.retornaListaPaginadaGruposAcesso",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGrupoAcessoServiceFacade_Proxy.retornaListaPaginadaGruposAcesso", statsContext, payload, callback);
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
