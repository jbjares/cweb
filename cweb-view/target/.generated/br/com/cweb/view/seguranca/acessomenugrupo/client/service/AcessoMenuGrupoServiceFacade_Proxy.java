package br.com.cweb.view.seguranca.acessomenugrupo.client.service;

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

public class AcessoMenuGrupoServiceFacade_Proxy extends RemoteServiceProxy implements br.com.cweb.view.seguranca.acessomenugrupo.client.service.AcessoMenuGrupoServiceFacadeAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "br.com.cweb.view.seguranca.acessomenugrupo.client.service.AcessoMenuGrupoServiceFacade";
  private static final String SERIALIZATION_POLICY ="EF16D8EDB6E3DEB81007F8CFF1625D11";
  private static final br.com.cweb.view.seguranca.acessomenugrupo.client.service.AcessoMenuGrupoServiceFacade_TypeSerializer SERIALIZER = new br.com.cweb.view.seguranca.acessomenugrupo.client.service.AcessoMenuGrupoServiceFacade_TypeSerializer();
  
  public AcessoMenuGrupoServiceFacade_Proxy() {
    super(GWT.getModuleBaseURL(),
      "springGwtServices/AcessoMenuGrupoServiceFacade", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void obterFuncionalidadeTipoModulo(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AcessoMenuGrupoServiceFacade_Proxy.obterFuncionalidadeTipoModulo", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("obterFuncionalidadeTipoModulo");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AcessoMenuGrupoServiceFacade_Proxy.obterFuncionalidadeTipoModulo",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "AcessoMenuGrupoServiceFacade_Proxy.obterFuncionalidadeTipoModulo", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void obterFuncionalidadeTipoRotina(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AcessoMenuGrupoServiceFacade_Proxy.obterFuncionalidadeTipoRotina", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("obterFuncionalidadeTipoRotina");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AcessoMenuGrupoServiceFacade_Proxy.obterFuncionalidadeTipoRotina",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "AcessoMenuGrupoServiceFacade_Proxy.obterFuncionalidadeTipoRotina", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void obterPermissoesCadastradas(br.com.cweb.seguranca.persistence.entity.Funcionalidade funcionalidade, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AcessoMenuGrupoServiceFacade_Proxy.obterPermissoesCadastradas", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("obterPermissoesCadastradas");
      streamWriter.writeInt(1);
      streamWriter.writeString("br.com.cweb.seguranca.persistence.entity.Funcionalidade/835000344");
      streamWriter.writeObject(funcionalidade);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AcessoMenuGrupoServiceFacade_Proxy.obterPermissoesCadastradas",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "AcessoMenuGrupoServiceFacade_Proxy.obterPermissoesCadastradas", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void obterPermissoesNaoPertencemFuncionalidade(br.com.cweb.seguranca.persistence.entity.Funcionalidade funcionalidade, br.com.cweb.seguranca.persistence.entity.GrupoAcesso grupoAcesso, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AcessoMenuGrupoServiceFacade_Proxy.obterPermissoesNaoPertencemFuncionalidade", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("obterPermissoesNaoPertencemFuncionalidade");
      streamWriter.writeInt(2);
      streamWriter.writeString("br.com.cweb.seguranca.persistence.entity.Funcionalidade/835000344");
      streamWriter.writeString("br.com.cweb.seguranca.persistence.entity.GrupoAcesso/1091394704");
      streamWriter.writeObject(funcionalidade);
      streamWriter.writeObject(grupoAcesso);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AcessoMenuGrupoServiceFacade_Proxy.obterPermissoesNaoPertencemFuncionalidade",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "AcessoMenuGrupoServiceFacade_Proxy.obterPermissoesNaoPertencemFuncionalidade", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void obterPermissoesPertencemFuncionalidade(br.com.cweb.seguranca.persistence.entity.Funcionalidade funcionalidade, br.com.cweb.seguranca.persistence.entity.GrupoAcesso grupoAcesso, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AcessoMenuGrupoServiceFacade_Proxy.obterPermissoesPertencemFuncionalidade", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("obterPermissoesPertencemFuncionalidade");
      streamWriter.writeInt(2);
      streamWriter.writeString("br.com.cweb.seguranca.persistence.entity.Funcionalidade/835000344");
      streamWriter.writeString("br.com.cweb.seguranca.persistence.entity.GrupoAcesso/1091394704");
      streamWriter.writeObject(funcionalidade);
      streamWriter.writeObject(grupoAcesso);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AcessoMenuGrupoServiceFacade_Proxy.obterPermissoesPertencemFuncionalidade",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "AcessoMenuGrupoServiceFacade_Proxy.obterPermissoesPertencemFuncionalidade", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void obterTodasFuncionalidadesUmModulo(java.lang.Long idModulo, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AcessoMenuGrupoServiceFacade_Proxy.obterTodasFuncionalidadesUmModulo", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("obterTodasFuncionalidadesUmModulo");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idModulo);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AcessoMenuGrupoServiceFacade_Proxy.obterTodasFuncionalidadesUmModulo",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "AcessoMenuGrupoServiceFacade_Proxy.obterTodasFuncionalidadesUmModulo", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListaPaginadaFuncionalidades(com.extjs.gxt.ui.client.data.PagingLoadConfig config, java.lang.Long idModulo, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AcessoMenuGrupoServiceFacade_Proxy.retornaListaPaginadaFuncionalidades", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListaPaginadaFuncionalidades");
      streamWriter.writeInt(2);
      streamWriter.writeString("com.extjs.gxt.ui.client.data.PagingLoadConfig");
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(config);
      streamWriter.writeObject(idModulo);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AcessoMenuGrupoServiceFacade_Proxy.retornaListaPaginadaFuncionalidades",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "AcessoMenuGrupoServiceFacade_Proxy.retornaListaPaginadaFuncionalidades", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void salvarPermissoesSelecionadas(java.util.List listaPermissoes, br.com.cweb.seguranca.persistence.entity.GrupoAcesso grupoAcesso, br.com.cweb.seguranca.persistence.entity.Funcionalidade funcionalidade, br.com.cweb.seguranca.persistence.entity.Usuario usuario, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AcessoMenuGrupoServiceFacade_Proxy.salvarPermissoesSelecionadas", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("salvarPermissoesSelecionadas");
      streamWriter.writeInt(4);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("br.com.cweb.seguranca.persistence.entity.GrupoAcesso/1091394704");
      streamWriter.writeString("br.com.cweb.seguranca.persistence.entity.Funcionalidade/835000344");
      streamWriter.writeString("br.com.cweb.seguranca.persistence.entity.Usuario/2445256274");
      streamWriter.writeObject(listaPermissoes);
      streamWriter.writeObject(grupoAcesso);
      streamWriter.writeObject(funcionalidade);
      streamWriter.writeObject(usuario);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AcessoMenuGrupoServiceFacade_Proxy.salvarPermissoesSelecionadas",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "AcessoMenuGrupoServiceFacade_Proxy.salvarPermissoesSelecionadas", statsContext, payload, callback);
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
