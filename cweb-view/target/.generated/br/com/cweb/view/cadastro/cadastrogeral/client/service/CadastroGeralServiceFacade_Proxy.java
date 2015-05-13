package br.com.cweb.view.cadastro.cadastrogeral.client.service;

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

public class CadastroGeralServiceFacade_Proxy extends RemoteServiceProxy implements br.com.cweb.view.cadastro.cadastrogeral.client.service.CadastroGeralServiceFacadeAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "br.com.cweb.view.cadastro.cadastrogeral.client.service.CadastroGeralServiceFacade";
  private static final String SERIALIZATION_POLICY ="B6CE54E2DD963A3A8B70E333412C3EF0";
  private static final br.com.cweb.view.cadastro.cadastrogeral.client.service.CadastroGeralServiceFacade_TypeSerializer SERIALIZER = new br.com.cweb.view.cadastro.cadastrogeral.client.service.CadastroGeralServiceFacade_TypeSerializer();
  
  public CadastroGeralServiceFacade_Proxy() {
    super(GWT.getModuleBaseURL(),
      "springGwtServices/CadastroGeralServiceFacade", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void atualizarPessoa(br.com.cweb.cadastro.persistence.entity.Pessoa pessoa, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.atualizarPessoa", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("atualizarPessoa");
      streamWriter.writeInt(1);
      streamWriter.writeString("br.com.cweb.cadastro.persistence.entity.Pessoa/4040299406");
      streamWriter.writeObject(pessoa);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.atualizarPessoa",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.atualizarPessoa", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void exlcuirPessoa(java.lang.Long idPessoa, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.exlcuirPessoa", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("exlcuirPessoa");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idPessoa);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.exlcuirPessoa",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.exlcuirPessoa", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void gerarRelatorio(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica pessoaFisicaJuridica, br.com.cweb.relatorio.to.TipoNomeRelatorio nome, br.com.cweb.relatorio.to.TipoFormatoRelatorio formato, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.gerarRelatorio", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("gerarRelatorio");
      streamWriter.writeInt(3);
      streamWriter.writeString("br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica/660816837");
      streamWriter.writeString("br.com.cweb.relatorio.to.TipoNomeRelatorio/887727518");
      streamWriter.writeString("br.com.cweb.relatorio.to.TipoFormatoRelatorio/1851932827");
      streamWriter.writeObject(pessoaFisicaJuridica);
      streamWriter.writeObject(nome);
      streamWriter.writeObject(formato);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.gerarRelatorio",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "CadastroGeralServiceFacade_Proxy.gerarRelatorio", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void incluirPessoa(br.com.cweb.cadastro.persistence.entity.Pessoa pessoa, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.incluirPessoa", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("incluirPessoa");
      streamWriter.writeInt(1);
      streamWriter.writeString("br.com.cweb.cadastro.persistence.entity.Pessoa/4040299406");
      streamWriter.writeObject(pessoa);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.incluirPessoa",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.incluirPessoa", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void recuperarDadosBancariosPoridPessoa(java.lang.Long idPessoa, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.recuperarDadosBancariosPoridPessoa", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("recuperarDadosBancariosPoridPessoa");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idPessoa);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.recuperarDadosBancariosPoridPessoa",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.recuperarDadosBancariosPoridPessoa", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void recuperarEnderecoPoridPessoa(java.lang.Long idPessoa, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.recuperarEnderecoPoridPessoa", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("recuperarEnderecoPoridPessoa");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idPessoa);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.recuperarEnderecoPoridPessoa",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.recuperarEnderecoPoridPessoa", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void recuperarUsuarioPorLogin(java.lang.String login, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.recuperarUsuarioPorLogin", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("recuperarUsuarioPorLogin");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(login);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.recuperarUsuarioPorLogin",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.recuperarUsuarioPorLogin", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void recuperarUsuarioPoridPessoa(java.lang.Long idPessoa, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.recuperarUsuarioPoridPessoa", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("recuperarUsuarioPoridPessoa");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idPessoa);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.recuperarUsuarioPoridPessoa",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.recuperarUsuarioPoridPessoa", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListaAtribuicao(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaAtribuicao", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListaAtribuicao");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaAtribuicao",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.retornaListaAtribuicao", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListaAtribuicao(java.lang.String query, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaAtribuicao", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListaAtribuicao");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(query);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaAtribuicao",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.retornaListaAtribuicao", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListaAtribuicaoVinculado(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaAtribuicaoVinculado", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListaAtribuicaoVinculado");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaAtribuicaoVinculado",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.retornaListaAtribuicaoVinculado", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListaAtribuicaoVinculador(java.lang.Integer codigoHirarquicoDoVinculado, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaAtribuicaoVinculador", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListaAtribuicaoVinculador");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Integer/3438268394");
      streamWriter.writeObject(codigoHirarquicoDoVinculado);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaAtribuicaoVinculador",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.retornaListaAtribuicaoVinculador", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListaBancos(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaBancos", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListaBancos");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaBancos",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.retornaListaBancos", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListaCidades(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaCidades", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListaCidades");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaCidades",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.retornaListaCidades", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListaCidadesPorEstado(java.lang.Long idEstado, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaCidadesPorEstado", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListaCidadesPorEstado");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idEstado);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaCidadesPorEstado",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.retornaListaCidadesPorEstado", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListaEstados(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaEstados", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListaEstados");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaEstados",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.retornaListaEstados", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListaEstados(java.lang.String query, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaEstados", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListaEstados");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(query);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaEstados",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.retornaListaEstados", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListaGrupoAcesso(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaGrupoAcesso", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListaGrupoAcesso");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaGrupoAcesso",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.retornaListaGrupoAcesso", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListaPagianadaPessoa(com.extjs.gxt.ui.client.data.PagingLoadConfig config, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaPagianadaPessoa", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListaPagianadaPessoa");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.extjs.gxt.ui.client.data.PagingLoadConfig");
      streamWriter.writeObject(config);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaPagianadaPessoa",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.retornaListaPagianadaPessoa", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListaPaginadaPessoaFisicaJuridica(com.extjs.gxt.ui.client.data.PagingLoadConfig config, br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica pessoaFisicaJuridica, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaPaginadaPessoaFisicaJuridica", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListaPaginadaPessoaFisicaJuridica");
      streamWriter.writeInt(2);
      streamWriter.writeString("com.extjs.gxt.ui.client.data.PagingLoadConfig");
      streamWriter.writeString("br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica/660816837");
      streamWriter.writeObject(config);
      streamWriter.writeObject(pessoaFisicaJuridica);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaPaginadaPessoaFisicaJuridica",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.retornaListaPaginadaPessoaFisicaJuridica", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListaPerfilComissao(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaPerfilComissao", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListaPerfilComissao");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaPerfilComissao",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.retornaListaPerfilComissao", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListaPessoa(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaPessoa", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListaPessoa");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaPessoa",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.retornaListaPessoa", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListaTipoConta(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaTipoConta", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListaTipoConta");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListaTipoConta",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.retornaListaTipoConta", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornaListarCpfCnpjPessoaPorTipoVinculacao(java.lang.Long codigoTipoVinculacao, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListarCpfCnpjPessoaPorTipoVinculacao", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornaListarCpfCnpjPessoaPorTipoVinculacao");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(codigoTipoVinculacao);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornaListarCpfCnpjPessoaPorTipoVinculacao",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.retornaListarCpfCnpjPessoaPorTipoVinculacao", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornarPessoa(java.lang.Long idPessoa, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornarPessoa", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornarPessoa");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idPessoa);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornarPessoa",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.retornarPessoa", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornarPessoaFisicaJuridica(java.lang.Long idPessoa, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornarPessoaFisicaJuridica", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornarPessoaFisicaJuridica");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idPessoa);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornarPessoaFisicaJuridica",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.retornarPessoaFisicaJuridica", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void retornarPessoaFisicaJuridicaPorCpfCnpj(java.lang.Long cpfCnpj, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornarPessoaFisicaJuridicaPorCpfCnpj", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("retornarPessoaFisicaJuridicaPorCpfCnpj");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(cpfCnpj);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.retornarPessoaFisicaJuridicaPorCpfCnpj",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.retornarPessoaFisicaJuridicaPorCpfCnpj", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void verificarSePessoaPossuiVinculados(java.lang.Long idPessoa, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.verificarSePessoaPossuiVinculados", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("verificarSePessoaPossuiVinculados");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(idPessoa);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("CadastroGeralServiceFacade_Proxy.verificarSePessoaPossuiVinculados",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "CadastroGeralServiceFacade_Proxy.verificarSePessoaPossuiVinculados", statsContext, payload, callback);
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
