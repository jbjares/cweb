package br.com.cweb.view.cadastro.instituicaofinanceira.client.service;

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

public class InstituicaoFinanceiraServiceFacade_Proxy extends RemoteServiceProxy implements br.com.cweb.view.cadastro.instituicaofinanceira.client.service.InstituicaoFinanceiraServiceFacadeAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "br.com.cweb.view.cadastro.instituicaofinanceira.client.service.InstituicaoFinanceiraServiceFacade";
  private static final String SERIALIZATION_POLICY ="2729397FC553B11208B849EEC21A24C3";
  private static final br.com.cweb.view.cadastro.instituicaofinanceira.client.service.InstituicaoFinanceiraServiceFacade_TypeSerializer SERIALIZER = new br.com.cweb.view.cadastro.instituicaofinanceira.client.service.InstituicaoFinanceiraServiceFacade_TypeSerializer();
  
  public InstituicaoFinanceiraServiceFacade_Proxy() {
    super(GWT.getModuleBaseURL(),
      "springGwtServices/InstituicaoFinanceiraServiceFacade", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void atualizarInstituicaoFinanceira(br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira instituicaoFinanceira, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("InstituicaoFinanceiraServiceFacade_Proxy.atualizarInstituicaoFinanceira", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("atualizarInstituicaoFinanceira");
      streamWriter.writeInt(1);
      streamWriter.writeString("br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira/3001789167");
      streamWriter.writeObject(instituicaoFinanceira);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("InstituicaoFinanceiraServiceFacade_Proxy.atualizarInstituicaoFinanceira",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "InstituicaoFinanceiraServiceFacade_Proxy.atualizarInstituicaoFinanceira", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void excluirInstituicaoFinanceira(java.lang.Long idInstituicao, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("InstituicaoFinanceiraServiceFacade_Proxy.excluirInstituicaoFinanceira", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("excluirInstituicaoFinanceira");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idInstituicao);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("InstituicaoFinanceiraServiceFacade_Proxy.excluirInstituicaoFinanceira",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "InstituicaoFinanceiraServiceFacade_Proxy.excluirInstituicaoFinanceira", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void gerarRelatorio(br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira instituicaoFinanceira, br.com.cweb.relatorio.to.TipoNomeRelatorio nome, br.com.cweb.relatorio.to.TipoFormatoRelatorio formato, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("InstituicaoFinanceiraServiceFacade_Proxy.gerarRelatorio", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("gerarRelatorio");
      streamWriter.writeInt(3);
      streamWriter.writeString("br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira/3001789167");
      streamWriter.writeString("br.com.cweb.relatorio.to.TipoNomeRelatorio/887727518");
      streamWriter.writeString("br.com.cweb.relatorio.to.TipoFormatoRelatorio/1851932827");
      streamWriter.writeObject(instituicaoFinanceira);
      streamWriter.writeObject(nome);
      streamWriter.writeObject(formato);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("InstituicaoFinanceiraServiceFacade_Proxy.gerarRelatorio",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "InstituicaoFinanceiraServiceFacade_Proxy.gerarRelatorio", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void incluirInstituicaoFinanceira(br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira instituicaoFinanceira, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("InstituicaoFinanceiraServiceFacade_Proxy.incluirInstituicaoFinanceira", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("incluirInstituicaoFinanceira");
      streamWriter.writeInt(1);
      streamWriter.writeString("br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira/3001789167");
      streamWriter.writeObject(instituicaoFinanceira);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("InstituicaoFinanceiraServiceFacade_Proxy.incluirInstituicaoFinanceira",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "InstituicaoFinanceiraServiceFacade_Proxy.incluirInstituicaoFinanceira", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListaInstituicaoFinanceira(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("InstituicaoFinanceiraServiceFacade_Proxy.retornaListaInstituicaoFinanceira", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListaInstituicaoFinanceira");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("InstituicaoFinanceiraServiceFacade_Proxy.retornaListaInstituicaoFinanceira",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "InstituicaoFinanceiraServiceFacade_Proxy.retornaListaInstituicaoFinanceira", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListaPaginadaInstituicaoFinanceira(com.extjs.gxt.ui.client.data.PagingLoadConfig config, br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira instituicaoFinanceira, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("InstituicaoFinanceiraServiceFacade_Proxy.retornaListaPaginadaInstituicaoFinanceira", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListaPaginadaInstituicaoFinanceira");
      streamWriter.writeInt(2);
      streamWriter.writeString("com.extjs.gxt.ui.client.data.PagingLoadConfig");
      streamWriter.writeString("br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira/3001789167");
      streamWriter.writeObject(config);
      streamWriter.writeObject(instituicaoFinanceira);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("InstituicaoFinanceiraServiceFacade_Proxy.retornaListaPaginadaInstituicaoFinanceira",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "InstituicaoFinanceiraServiceFacade_Proxy.retornaListaPaginadaInstituicaoFinanceira", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornarInstituicaoFinanceira(java.lang.Long idInstituicao, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("InstituicaoFinanceiraServiceFacade_Proxy.retornarInstituicaoFinanceira", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornarInstituicaoFinanceira");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idInstituicao);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("InstituicaoFinanceiraServiceFacade_Proxy.retornarInstituicaoFinanceira",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "InstituicaoFinanceiraServiceFacade_Proxy.retornarInstituicaoFinanceira", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void verificarDependenciaDeInstituicaoFinanceira(java.lang.Long idInstituicao, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("InstituicaoFinanceiraServiceFacade_Proxy.verificarDependenciaDeInstituicaoFinanceira", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("verificarDependenciaDeInstituicaoFinanceira");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idInstituicao);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("InstituicaoFinanceiraServiceFacade_Proxy.verificarDependenciaDeInstituicaoFinanceira",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "InstituicaoFinanceiraServiceFacade_Proxy.verificarDependenciaDeInstituicaoFinanceira", statsContext, payload, callback);
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
