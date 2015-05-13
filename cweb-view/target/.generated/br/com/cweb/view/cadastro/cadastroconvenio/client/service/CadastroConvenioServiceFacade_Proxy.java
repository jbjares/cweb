package br.com.cweb.view.cadastro.cadastroconvenio.client.service;

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

public class CadastroConvenioServiceFacade_Proxy extends RemoteServiceProxy implements br.com.cweb.view.cadastro.cadastroconvenio.client.service.CadastroConvenioServiceFacadeAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "br.com.cweb.view.cadastro.cadastroconvenio.client.service.CadastroConvenioServiceFacade";
  private static final String SERIALIZATION_POLICY ="2E23069916AF5B59849EFB6B979133F4";
  private static final br.com.cweb.view.cadastro.cadastroconvenio.client.service.CadastroConvenioServiceFacade_TypeSerializer SERIALIZER = new br.com.cweb.view.cadastro.cadastroconvenio.client.service.CadastroConvenioServiceFacade_TypeSerializer();
  
  public CadastroConvenioServiceFacade_Proxy() {
    super(GWT.getModuleBaseURL(),
      "springGwtServices/CadastroConvenioServiceFacade", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void excluirConvenio(br.com.cweb.cadastro.persistence.entity.Convenio convenio, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroConvenioServiceFacade_Proxy.excluirConvenio", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("excluirConvenio");
      streamWriter.writeInt(1);
      streamWriter.writeString("br.com.cweb.cadastro.persistence.entity.Convenio/2257975695");
      streamWriter.writeObject(convenio);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroConvenioServiceFacade_Proxy.excluirConvenio",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "CadastroConvenioServiceFacade_Proxy.excluirConvenio", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void gerarRelatorio(br.com.cweb.cadastro.persistence.entity.Convenio convenio, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroConvenioServiceFacade_Proxy.gerarRelatorio", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("gerarRelatorio");
      streamWriter.writeInt(1);
      streamWriter.writeString("br.com.cweb.cadastro.persistence.entity.Convenio/2257975695");
      streamWriter.writeObject(convenio);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroConvenioServiceFacade_Proxy.gerarRelatorio",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "CadastroConvenioServiceFacade_Proxy.gerarRelatorio", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void recuperaConvenio(java.lang.Long id, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroConvenioServiceFacade_Proxy.recuperaConvenio", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("recuperaConvenio");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(id);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroConvenioServiceFacade_Proxy.recuperaConvenio",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroConvenioServiceFacade_Proxy.recuperaConvenio", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListaPaginadaConvenio(com.extjs.gxt.ui.client.data.PagingLoadConfig config, br.com.cweb.cadastro.persistence.entity.Convenio convenio, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroConvenioServiceFacade_Proxy.retornaListaPaginadaConvenio", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListaPaginadaConvenio");
      streamWriter.writeInt(2);
      streamWriter.writeString("com.extjs.gxt.ui.client.data.PagingLoadConfig");
      streamWriter.writeString("br.com.cweb.cadastro.persistence.entity.Convenio/2257975695");
      streamWriter.writeObject(config);
      streamWriter.writeObject(convenio);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroConvenioServiceFacade_Proxy.retornaListaPaginadaConvenio",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroConvenioServiceFacade_Proxy.retornaListaPaginadaConvenio", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void salvarConvenio(br.com.cweb.cadastro.persistence.entity.Convenio convenio, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroConvenioServiceFacade_Proxy.salvarConvenio", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("salvarConvenio");
      streamWriter.writeInt(1);
      streamWriter.writeString("br.com.cweb.cadastro.persistence.entity.Convenio/2257975695");
      streamWriter.writeObject(convenio);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroConvenioServiceFacade_Proxy.salvarConvenio",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroConvenioServiceFacade_Proxy.salvarConvenio", statsContext, payload, callback);
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
