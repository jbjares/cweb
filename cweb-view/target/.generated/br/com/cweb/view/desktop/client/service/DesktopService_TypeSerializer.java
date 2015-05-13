package br.com.cweb.view.desktop.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class DesktopService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final MethodMap methodMapNative;
  private static final JsArrayString signatureMapNative;
  
  static {
    methodMapNative = loadMethodsNative();
    signatureMapNative = loadSignaturesNative();
  }
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native MethodMap loadMethodsNative() /*-{
    var result = {};
    result["br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar/2808529220"] = [
        @br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/ArvoreFamiliar;),
        @br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/ArvoreFamiliar;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.Atribuicao/2358068784"] = [
        @br.com.cweb.cadastro.persistence.entity.Atribuicao_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.Atribuicao_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/Atribuicao;),
        @br.com.cweb.cadastro.persistence.entity.Atribuicao_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/Atribuicao;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.Cidade/1159706616"] = [
        @br.com.cweb.cadastro.persistence.entity.Cidade_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.Cidade_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/Cidade;),
        @br.com.cweb.cadastro.persistence.entity.Cidade_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/Cidade;)
      ];
    
    result["[Lbr.com.cweb.cadastro.persistence.entity.Cidade;/3695592329"] = [
        @br.com.cweb.cadastro.persistence.entity.Cidade_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.Cidade_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/cadastro/persistence/entity/Cidade;),
        @br.com.cweb.cadastro.persistence.entity.Cidade_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lbr/com/cweb/cadastro/persistence/entity/Cidade;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.ContaBancaria/1963720608"] = [
        @br.com.cweb.cadastro.persistence.entity.ContaBancaria_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.ContaBancaria_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/ContaBancaria;),
        @br.com.cweb.cadastro.persistence.entity.ContaBancaria_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/ContaBancaria;)
      ];
    
    result["[Lbr.com.cweb.cadastro.persistence.entity.ContaBancaria;/2479143526"] = [
        @br.com.cweb.cadastro.persistence.entity.ContaBancaria_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.ContaBancaria_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/cadastro/persistence/entity/ContaBancaria;),
        @br.com.cweb.cadastro.persistence.entity.ContaBancaria_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lbr/com/cweb/cadastro/persistence/entity/ContaBancaria;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.Endereco/1109738307"] = [
        @br.com.cweb.cadastro.persistence.entity.Endereco_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.Endereco_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/Endereco;),
        @br.com.cweb.cadastro.persistence.entity.Endereco_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/Endereco;)
      ];
    
    result["[Lbr.com.cweb.cadastro.persistence.entity.Endereco;/4233337058"] = [
        @br.com.cweb.cadastro.persistence.entity.Endereco_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.Endereco_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/cadastro/persistence/entity/Endereco;),
        @br.com.cweb.cadastro.persistence.entity.Endereco_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lbr/com/cweb/cadastro/persistence/entity/Endereco;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.Estado/377296711"] = [
        @br.com.cweb.cadastro.persistence.entity.Estado_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.Estado_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/Estado;),
        @br.com.cweb.cadastro.persistence.entity.Estado_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/Estado;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira/3001789167"] = [
        @br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/InstituicaoFinanceira;),
        @br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/InstituicaoFinanceira;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.PerfilComissao/555920445"] = [
        @br.com.cweb.cadastro.persistence.entity.PerfilComissao_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.PerfilComissao_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/PerfilComissao;),
        @br.com.cweb.cadastro.persistence.entity.PerfilComissao_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/PerfilComissao;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.Pessoa/4040299406"] = [
        @br.com.cweb.cadastro.persistence.entity.Pessoa_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.Pessoa_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/Pessoa;),
        @br.com.cweb.cadastro.persistence.entity.Pessoa_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/Pessoa;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.PessoaFisica/71683337"] = [
        @br.com.cweb.cadastro.persistence.entity.PessoaFisica_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.PessoaFisica_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/PessoaFisica;),
        @br.com.cweb.cadastro.persistence.entity.PessoaFisica_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/PessoaFisica;)
      ];
    
    result["[Lbr.com.cweb.cadastro.persistence.entity.PessoaFisica;/2949029722"] = [
        @br.com.cweb.cadastro.persistence.entity.PessoaFisica_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.PessoaFisica_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/cadastro/persistence/entity/PessoaFisica;),
        @br.com.cweb.cadastro.persistence.entity.PessoaFisica_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lbr/com/cweb/cadastro/persistence/entity/PessoaFisica;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.PessoaJuridica/2581919241"] = [
        @br.com.cweb.cadastro.persistence.entity.PessoaJuridica_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.PessoaJuridica_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/PessoaJuridica;),
        @br.com.cweb.cadastro.persistence.entity.PessoaJuridica_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/PessoaJuridica;)
      ];
    
    result["[Lbr.com.cweb.cadastro.persistence.entity.PessoaJuridica;/3761416939"] = [
        @br.com.cweb.cadastro.persistence.entity.PessoaJuridica_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.PessoaJuridica_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/cadastro/persistence/entity/PessoaJuridica;),
        @br.com.cweb.cadastro.persistence.entity.PessoaJuridica_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lbr/com/cweb/cadastro/persistence/entity/PessoaJuridica;)
      ];
    
    result["[Lbr.com.cweb.cadastro.persistence.entity.Pessoa;/1930767873"] = [
        @br.com.cweb.cadastro.persistence.entity.Pessoa_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.Pessoa_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/cadastro/persistence/entity/Pessoa;),
        @br.com.cweb.cadastro.persistence.entity.Pessoa_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lbr/com/cweb/cadastro/persistence/entity/Pessoa;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.TipoConta/1467776311"] = [
        @br.com.cweb.cadastro.persistence.entity.TipoConta_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.TipoConta_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/TipoConta;),
        @br.com.cweb.cadastro.persistence.entity.TipoConta_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/TipoConta;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.TipoEndereco/3705569210"] = [
        @br.com.cweb.cadastro.persistence.entity.TipoEndereco_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.TipoEndereco_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/TipoEndereco;),
        @br.com.cweb.cadastro.persistence.entity.TipoEndereco_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/TipoEndereco;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.TipoInstituicao/138639325"] = [
        @br.com.cweb.cadastro.persistence.entity.TipoInstituicao_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.TipoInstituicao_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/TipoInstituicao;),
        @br.com.cweb.cadastro.persistence.entity.TipoInstituicao_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/TipoInstituicao;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.TipoPessoa/1405647552"] = [
        @br.com.cweb.cadastro.persistence.entity.TipoPessoa_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.TipoPessoa_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/TipoPessoa;),
        @br.com.cweb.cadastro.persistence.entity.TipoPessoa_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/TipoPessoa;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO/2486216669"] = [
        @br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/UsuarioLogadoDTO;),
      ];
    
    result["br.com.cweb.mensagem.exception.MensagemException/694185558"] = [
        @br.com.cweb.mensagem.exception.MensagemException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.mensagem.exception.MensagemException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/mensagem/exception/MensagemException;),
      ];
    
    result["br.com.cweb.mensagem.to.Mensagem/4223174925"] = [
        @br.com.cweb.mensagem.to.Mensagem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.mensagem.to.Mensagem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/mensagem/to/Mensagem;),
      ];
    
    result["[Lbr.com.cweb.mensagem.to.Mensagem;/293322735"] = [
        @br.com.cweb.mensagem.to.Mensagem_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.mensagem.to.Mensagem_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/mensagem/to/Mensagem;),
      ];
    
    result["br.com.cweb.seguranca.persistence.entity.GrupoAcesso/1091394704"] = [
        @br.com.cweb.seguranca.persistence.entity.GrupoAcesso_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.GrupoAcesso_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/seguranca/persistence/entity/GrupoAcesso;),
        @br.com.cweb.seguranca.persistence.entity.GrupoAcesso_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/seguranca/persistence/entity/GrupoAcesso;)
      ];
    
    result["br.com.cweb.seguranca.persistence.entity.MenuDTO/2265074607"] = [
        @br.com.cweb.seguranca.persistence.entity.MenuDTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.MenuDTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/seguranca/persistence/entity/MenuDTO;),
      ];
    
    result["[Lbr.com.cweb.seguranca.persistence.entity.MenuDTO;/3770326044"] = [
        @br.com.cweb.seguranca.persistence.entity.MenuDTO_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.MenuDTO_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/seguranca/persistence/entity/MenuDTO;),
      ];
    
    result["br.com.cweb.seguranca.persistence.entity.TipoFuncionalidade/1362178606"] = [
        @br.com.cweb.seguranca.persistence.entity.TipoFuncionalidade_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.TipoFuncionalidade_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/seguranca/persistence/entity/TipoFuncionalidade;),
      ];
    
    result["br.com.cweb.seguranca.persistence.entity.Usuario/2445256274"] = [
        @br.com.cweb.seguranca.persistence.entity.Usuario_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.Usuario_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/seguranca/persistence/entity/Usuario;),
        @br.com.cweb.seguranca.persistence.entity.Usuario_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/seguranca/persistence/entity/Usuario;)
      ];
    
    result["[Lbr.com.cweb.seguranca.persistence.entity.Usuario;/45943676"] = [
        @br.com.cweb.seguranca.persistence.entity.Usuario_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.Usuario_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/seguranca/persistence/entity/Usuario;),
        @br.com.cweb.seguranca.persistence.entity.Usuario_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lbr/com/cweb/seguranca/persistence/entity/Usuario;)
      ];
    
    result["com.google.gwt.i18n.client.impl.DateRecord/3220471373"] = [
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/i18n/client/impl/DateRecord;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/i18n/client/impl/DateRecord;)
      ];
    
    result["com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533"] = [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ];
    
    result["com.google.gwt.user.client.rpc.RpcTokenException/2345075298"] = [
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/RpcTokenException;),
      ];
    
    result["com.google.gwt.user.client.rpc.XsrfToken/4254043109"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/XsrfToken;)
      ];
    
    result["java.lang.Boolean/476441737"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Boolean;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Boolean;)
      ];
    
    result["java.lang.Integer/3438268394"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Integer;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Integer;)
      ];
    
    result["java.lang.Long/4227064769"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Long;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Long;)
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["java.sql.Date/730999118"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Date;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Date;)
      ];
    
    result["java.sql.Time/1816797103"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Time;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Time;)
      ];
    
    result["java.sql.Timestamp/3040052672"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Timestamp;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Timestamp;)
      ];
    
    result["java.util.ArrayList/4159755760"] = [
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/ArrayList;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/ArrayList;)
      ];
    
    result["java.util.Arrays$ArrayList/2507071751"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$EmptyList/4157118744"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$SingletonList/1586180994"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Date/3385151746"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Date;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Date;)
      ];
    
    result["java.util.LinkedList/3953877921"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedList;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedList;)
      ];
    
    result["java.util.Stack/1346942793"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Stack;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Stack;)
      ];
    
    result["java.util.Vector/3057315478"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Vector;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Vector;)
      ];
    
    return result;
  }-*/;
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar::class)] = "br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar/2808529220";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.Atribuicao::class)] = "br.com.cweb.cadastro.persistence.entity.Atribuicao/2358068784";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.Cidade::class)] = "br.com.cweb.cadastro.persistence.entity.Cidade/1159706616";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.Cidade[]::class)] = "[Lbr.com.cweb.cadastro.persistence.entity.Cidade;/3695592329";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.ContaBancaria::class)] = "br.com.cweb.cadastro.persistence.entity.ContaBancaria/1963720608";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.ContaBancaria[]::class)] = "[Lbr.com.cweb.cadastro.persistence.entity.ContaBancaria;/2479143526";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.Endereco::class)] = "br.com.cweb.cadastro.persistence.entity.Endereco/1109738307";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.Endereco[]::class)] = "[Lbr.com.cweb.cadastro.persistence.entity.Endereco;/4233337058";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.Estado::class)] = "br.com.cweb.cadastro.persistence.entity.Estado/377296711";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira::class)] = "br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira/3001789167";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.PerfilComissao::class)] = "br.com.cweb.cadastro.persistence.entity.PerfilComissao/555920445";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.Pessoa::class)] = "br.com.cweb.cadastro.persistence.entity.Pessoa/4040299406";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.PessoaFisica::class)] = "br.com.cweb.cadastro.persistence.entity.PessoaFisica/71683337";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.PessoaFisica[]::class)] = "[Lbr.com.cweb.cadastro.persistence.entity.PessoaFisica;/2949029722";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.PessoaJuridica::class)] = "br.com.cweb.cadastro.persistence.entity.PessoaJuridica/2581919241";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.PessoaJuridica[]::class)] = "[Lbr.com.cweb.cadastro.persistence.entity.PessoaJuridica;/3761416939";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.Pessoa[]::class)] = "[Lbr.com.cweb.cadastro.persistence.entity.Pessoa;/1930767873";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.TipoConta::class)] = "br.com.cweb.cadastro.persistence.entity.TipoConta/1467776311";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.TipoEndereco::class)] = "br.com.cweb.cadastro.persistence.entity.TipoEndereco/3705569210";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.TipoInstituicao::class)] = "br.com.cweb.cadastro.persistence.entity.TipoInstituicao/138639325";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.TipoPessoa::class)] = "br.com.cweb.cadastro.persistence.entity.TipoPessoa/1405647552";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO::class)] = "br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO/2486216669";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.mensagem.exception.MensagemException::class)] = "br.com.cweb.mensagem.exception.MensagemException/694185558";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.mensagem.to.Mensagem::class)] = "br.com.cweb.mensagem.to.Mensagem/4223174925";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.mensagem.to.Mensagem[]::class)] = "[Lbr.com.cweb.mensagem.to.Mensagem;/293322735";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.GrupoAcesso::class)] = "br.com.cweb.seguranca.persistence.entity.GrupoAcesso/1091394704";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.MenuDTO::class)] = "br.com.cweb.seguranca.persistence.entity.MenuDTO/2265074607";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.MenuDTO[]::class)] = "[Lbr.com.cweb.seguranca.persistence.entity.MenuDTO;/3770326044";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.TipoFuncionalidade::class)] = "br.com.cweb.seguranca.persistence.entity.TipoFuncionalidade/1362178606";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.Usuario::class)] = "br.com.cweb.seguranca.persistence.entity.Usuario/2445256274";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.Usuario[]::class)] = "[Lbr.com.cweb.seguranca.persistence.entity.Usuario;/45943676";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.i18n.client.impl.DateRecord::class)] = "com.google.gwt.i18n.client.impl.DateRecord/3220471373";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.RpcTokenException::class)] = "com.google.gwt.user.client.rpc.RpcTokenException/2345075298";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.XsrfToken::class)] = "com.google.gwt.user.client.rpc.XsrfToken/4254043109";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Boolean::class)] = "java.lang.Boolean/476441737";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Integer::class)] = "java.lang.Integer/3438268394";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Long::class)] = "java.lang.Long/4227064769";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Date::class)] = "java.sql.Date/730999118";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Time::class)] = "java.sql.Time/1816797103";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Timestamp::class)] = "java.sql.Timestamp/3040052672";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ArrayList::class)] = "java.util.ArrayList/4159755760";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Arrays.ArrayList::class)] = "java.util.Arrays$ArrayList/2507071751";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.EmptyList::class)] = "java.util.Collections$EmptyList/4157118744";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.SingletonList::class)] = "java.util.Collections$SingletonList/1586180994";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Date::class)] = "java.util.Date/3385151746";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedList::class)] = "java.util.LinkedList/3953877921";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Stack::class)] = "java.util.Stack/1346942793";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Vector::class)] = "java.util.Vector/3057315478";
    return result;
  }-*/;
  
  public DesktopService_TypeSerializer() {
    super(null, methodMapNative, null, signatureMapNative);
  }
  
}
