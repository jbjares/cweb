package br.com.cweb.view.seguranca.acessomenugrupo.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class AcessoMenuGrupoServiceFacade_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
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
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/ArvoreFamiliar;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.Atribuicao/2358068784"] = [
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.Atribuicao_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/Atribuicao;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.Cidade/1159706616"] = [
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.Cidade_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/Cidade;)
      ];
    
    result["[Lbr.com.cweb.cadastro.persistence.entity.Cidade;/3695592329"] = [
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.Cidade_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lbr/com/cweb/cadastro/persistence/entity/Cidade;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.ContaBancaria/1963720608"] = [
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.ContaBancaria_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/ContaBancaria;)
      ];
    
    result["[Lbr.com.cweb.cadastro.persistence.entity.ContaBancaria;/2479143526"] = [
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.ContaBancaria_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lbr/com/cweb/cadastro/persistence/entity/ContaBancaria;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.Endereco/1109738307"] = [
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.Endereco_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/Endereco;)
      ];
    
    result["[Lbr.com.cweb.cadastro.persistence.entity.Endereco;/4233337058"] = [
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.Endereco_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lbr/com/cweb/cadastro/persistence/entity/Endereco;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.Estado/377296711"] = [
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.Estado_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/Estado;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira/3001789167"] = [
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/InstituicaoFinanceira;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.PerfilComissao/555920445"] = [
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.PerfilComissao_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/PerfilComissao;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.Pessoa/4040299406"] = [
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.Pessoa_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/Pessoa;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.PessoaFisica/71683337"] = [
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.PessoaFisica_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/PessoaFisica;)
      ];
    
    result["[Lbr.com.cweb.cadastro.persistence.entity.PessoaFisica;/2949029722"] = [
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.PessoaFisica_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lbr/com/cweb/cadastro/persistence/entity/PessoaFisica;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.PessoaJuridica/2581919241"] = [
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.PessoaJuridica_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/PessoaJuridica;)
      ];
    
    result["[Lbr.com.cweb.cadastro.persistence.entity.PessoaJuridica;/3761416939"] = [
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.PessoaJuridica_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lbr/com/cweb/cadastro/persistence/entity/PessoaJuridica;)
      ];
    
    result["[Lbr.com.cweb.cadastro.persistence.entity.Pessoa;/1930767873"] = [
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.Pessoa_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lbr/com/cweb/cadastro/persistence/entity/Pessoa;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.TipoConta/1467776311"] = [
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.TipoConta_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/TipoConta;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.TipoEndereco/3705569210"] = [
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.TipoEndereco_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/TipoEndereco;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.TipoInstituicao/138639325"] = [
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.TipoInstituicao_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/TipoInstituicao;)
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.TipoPessoa/1405647552"] = [
        ,
        ,
        @br.com.cweb.cadastro.persistence.entity.TipoPessoa_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/TipoPessoa;)
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
    
    result["br.com.cweb.seguranca.persistence.entity.Funcionalidade/835000344"] = [
        @br.com.cweb.seguranca.persistence.entity.Funcionalidade_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.Funcionalidade_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/seguranca/persistence/entity/Funcionalidade;),
        @br.com.cweb.seguranca.persistence.entity.Funcionalidade_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/seguranca/persistence/entity/Funcionalidade;)
      ];
    
    result["[Lbr.com.cweb.seguranca.persistence.entity.Funcionalidade;/144322026"] = [
        @br.com.cweb.seguranca.persistence.entity.Funcionalidade_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.Funcionalidade_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/seguranca/persistence/entity/Funcionalidade;),
      ];
    
    result["br.com.cweb.seguranca.persistence.entity.GrupoAcesso/1091394704"] = [
        ,
        ,
        @br.com.cweb.seguranca.persistence.entity.GrupoAcesso_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/seguranca/persistence/entity/GrupoAcesso;)
      ];
    
    result["br.com.cweb.seguranca.persistence.entity.TipoPermissao/3395514979"] = [
        @br.com.cweb.seguranca.persistence.entity.TipoPermissao_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.TipoPermissao_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/seguranca/persistence/entity/TipoPermissao;),
        @br.com.cweb.seguranca.persistence.entity.TipoPermissao_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/seguranca/persistence/entity/TipoPermissao;)
      ];
    
    result["[Lbr.com.cweb.seguranca.persistence.entity.TipoPermissao;/2582740504"] = [
        @br.com.cweb.seguranca.persistence.entity.TipoPermissao_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.TipoPermissao_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/seguranca/persistence/entity/TipoPermissao;),
        @br.com.cweb.seguranca.persistence.entity.TipoPermissao_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lbr/com/cweb/seguranca/persistence/entity/TipoPermissao;)
      ];
    
    result["br.com.cweb.seguranca.persistence.entity.Usuario/2445256274"] = [
        ,
        ,
        @br.com.cweb.seguranca.persistence.entity.Usuario_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/seguranca/persistence/entity/Usuario;)
      ];
    
    result["[Lbr.com.cweb.seguranca.persistence.entity.Usuario;/45943676"] = [
        ,
        ,
        @br.com.cweb.seguranca.persistence.entity.Usuario_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lbr/com/cweb/seguranca/persistence/entity/Usuario;)
      ];
    
    result["com.extjs.gxt.ui.client.Style$SortDir/640452531"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.Style_SortDir_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/Style$SortDir;)
      ];
    
    result["com.extjs.gxt.ui.client.core.FastMap/3488076414"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.core.FastMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/core/FastMap;)
      ];
    
    result["com.extjs.gxt.ui.client.core.FastSet/2139705081"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.core.FastSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/core/FastSet;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig/47114578"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseBooleanFilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseBooleanFilterConfig;/1642589127"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseBooleanFilterConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseDateFilterConfig/4013643245"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseDateFilterConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseDateFilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseDateFilterConfig;/2667437259"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseDateFilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseDateFilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseFilterConfig;/3740213292"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseFilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseFilterConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig/2138211457"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseFilterPagingLoadConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseListFilterConfig/3409120418"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseListFilterConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseListFilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseListFilterConfig;/1641032626"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseListFilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseListFilterConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseNumericFilterConfig/1870815159"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseNumericFilterConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseNumericFilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseNumericFilterConfig;/2888123402"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseNumericFilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseNumericFilterConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BasePagingLoadConfig/2011366567"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BasePagingLoadConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BasePagingLoadConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BasePagingLoadResult/496878394"] = [
        @com.extjs.gxt.ui.client.data.BasePagingLoadResult_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BasePagingLoadResult_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BasePagingLoadResult;),
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseStringFilterConfig/2159604562"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseStringFilterConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseStringFilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseStringFilterConfig;/1612961225"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseStringFilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseStringFilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.FilterConfig;/1920562560"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.FilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/FilterConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.RpcMap/3441186752"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.RpcMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/RpcMap;)
      ];
    
    result["com.google.gwt.i18n.client.impl.DateRecord/3220471373"] = [
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/i18n/client/impl/DateRecord;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/i18n/client/impl/DateRecord;)
      ];
    
    result["[Lcom.google.gwt.i18n.client.impl.DateRecord;/1800624538"] = [
        ,
        ,
        @com.google.gwt.i18n.client.impl.DateRecord_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/google/gwt/i18n/client/impl/DateRecord;)
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
    
    result["com.google.gwt.user.client.ui.ChangeListenerCollection/287642957"] = [
        @com.google.gwt.user.client.ui.ChangeListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.ChangeListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/ChangeListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.ClickListenerCollection/2152455986"] = [
        @com.google.gwt.user.client.ui.ClickListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.ClickListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/ClickListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.FocusListenerCollection/119490835"] = [
        @com.google.gwt.user.client.ui.FocusListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.FocusListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/FocusListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.FormHandlerCollection/3088681894"] = [
        @com.google.gwt.user.client.ui.FormHandlerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.FormHandlerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/FormHandlerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.KeyboardListenerCollection/1040442242"] = [
        @com.google.gwt.user.client.ui.KeyboardListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.KeyboardListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/KeyboardListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.LoadListenerCollection/3174178888"] = [
        @com.google.gwt.user.client.ui.LoadListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.LoadListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/LoadListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.MouseListenerCollection/465158911"] = [
        @com.google.gwt.user.client.ui.MouseListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.MouseListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/MouseListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.MouseWheelListenerCollection/370304552"] = [
        @com.google.gwt.user.client.ui.MouseWheelListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.MouseWheelListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/MouseWheelListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.PopupListenerCollection/1920131050"] = [
        @com.google.gwt.user.client.ui.PopupListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.PopupListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/PopupListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.ScrollListenerCollection/210686268"] = [
        @com.google.gwt.user.client.ui.ScrollListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.ScrollListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/ScrollListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.TabListenerCollection/3768293299"] = [
        @com.google.gwt.user.client.ui.TabListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.TabListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/TabListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.TableListenerCollection/2254740473"] = [
        @com.google.gwt.user.client.ui.TableListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.TableListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/TableListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.TreeListenerCollection/3716243734"] = [
        @com.google.gwt.user.client.ui.TreeListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.TreeListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/TreeListenerCollection;),
      ];
    
    result["java.lang.Boolean/476441737"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Boolean;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Boolean;)
      ];
    
    result["[Ljava.lang.Boolean;/2507200464"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Boolean;)
      ];
    
    result["java.lang.Byte/1571082439"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Byte;)
      ];
    
    result["[Ljava.lang.Byte;/3053163818"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Byte_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Byte;)
      ];
    
    result["java.lang.Double/858496421"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Double;)
      ];
    
    result["[Ljava.lang.Double;/2857560407"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Double_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Double;)
      ];
    
    result["java.lang.Float/1718559123"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Float;)
      ];
    
    result["[Ljava.lang.Float;/3956181278"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Float_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Float;)
      ];
    
    result["java.lang.Integer/3438268394"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Integer;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Integer;)
      ];
    
    result["[Ljava.lang.Integer;/1574882222"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Integer;)
      ];
    
    result["java.lang.Long/4227064769"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Long;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Long;)
      ];
    
    result["[Ljava.lang.Long;/97727328"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Long_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Long;)
      ];
    
    result["java.lang.Short/551743396"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Short;)
      ];
    
    result["[Ljava.lang.Short;/3779901635"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Short_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Short;)
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["[Ljava.lang.String;/2600011424"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/String;)
      ];
    
    result["java.sql.Date/730999118"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Date;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Date;)
      ];
    
    result["[Ljava.sql.Date;/177260296"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.sql.Date_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/sql/Date;)
      ];
    
    result["java.sql.Time/1816797103"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Time;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Time;)
      ];
    
    result["[Ljava.sql.Time;/1999508513"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.sql.Time_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/sql/Time;)
      ];
    
    result["java.sql.Timestamp/3040052672"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Timestamp;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Timestamp;)
      ];
    
    result["[Ljava.sql.Timestamp;/1038705795"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/sql/Timestamp;)
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
    
    result["java.util.Collections$EmptyMap/4174664486"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Map;)
      ];
    
    result["java.util.Collections$EmptySet/3523698179"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Set;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Set;)
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
    
    result["[Ljava.util.Date;/3768760277"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.Date_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/util/Date;)
      ];
    
    result["java.util.HashMap/1797211028"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashMap;)
      ];
    
    result["java.util.HashSet/3273092938"] = [
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashSet;),
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashSet;)
      ];
    
    result["java.util.IdentityHashMap/1839153020"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/IdentityHashMap;)
      ];
    
    result["java.util.LinkedHashMap/3008245022"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashMap;)
      ];
    
    result["java.util.LinkedHashSet/1826081506"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashSet;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashSet;)
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
    
    result["java.util.TreeMap/1493889780"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeMap;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeMap;)
      ];
    
    result["java.util.TreeSet/4043497002"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeSet;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeSet;)
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
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.mensagem.exception.MensagemException::class)] = "br.com.cweb.mensagem.exception.MensagemException/694185558";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.mensagem.to.Mensagem::class)] = "br.com.cweb.mensagem.to.Mensagem/4223174925";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.mensagem.to.Mensagem[]::class)] = "[Lbr.com.cweb.mensagem.to.Mensagem;/293322735";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.Funcionalidade::class)] = "br.com.cweb.seguranca.persistence.entity.Funcionalidade/835000344";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.Funcionalidade[]::class)] = "[Lbr.com.cweb.seguranca.persistence.entity.Funcionalidade;/144322026";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.GrupoAcesso::class)] = "br.com.cweb.seguranca.persistence.entity.GrupoAcesso/1091394704";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.TipoPermissao::class)] = "br.com.cweb.seguranca.persistence.entity.TipoPermissao/3395514979";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.TipoPermissao[]::class)] = "[Lbr.com.cweb.seguranca.persistence.entity.TipoPermissao;/2582740504";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.Usuario::class)] = "br.com.cweb.seguranca.persistence.entity.Usuario/2445256274";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.Usuario[]::class)] = "[Lbr.com.cweb.seguranca.persistence.entity.Usuario;/45943676";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.Style.SortDir::class)] = "com.extjs.gxt.ui.client.Style$SortDir/640452531";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.core.FastMap::class)] = "com.extjs.gxt.ui.client.core.FastMap/3488076414";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.core.FastSet::class)] = "com.extjs.gxt.ui.client.core.FastSet/2139705081";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig::class)] = "com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig/47114578";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseBooleanFilterConfig;/1642589127";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseDateFilterConfig::class)] = "com.extjs.gxt.ui.client.data.BaseDateFilterConfig/4013643245";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseDateFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseDateFilterConfig;/2667437259";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseFilterConfig;/3740213292";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig::class)] = "com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig/2138211457";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseListFilterConfig::class)] = "com.extjs.gxt.ui.client.data.BaseListFilterConfig/3409120418";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseListFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseListFilterConfig;/1641032626";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseNumericFilterConfig::class)] = "com.extjs.gxt.ui.client.data.BaseNumericFilterConfig/1870815159";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseNumericFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseNumericFilterConfig;/2888123402";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BasePagingLoadConfig::class)] = "com.extjs.gxt.ui.client.data.BasePagingLoadConfig/2011366567";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BasePagingLoadResult::class)] = "com.extjs.gxt.ui.client.data.BasePagingLoadResult/496878394";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseStringFilterConfig::class)] = "com.extjs.gxt.ui.client.data.BaseStringFilterConfig/2159604562";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseStringFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseStringFilterConfig;/1612961225";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.FilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.FilterConfig;/1920562560";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.RpcMap::class)] = "com.extjs.gxt.ui.client.data.RpcMap/3441186752";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.i18n.client.impl.DateRecord::class)] = "com.google.gwt.i18n.client.impl.DateRecord/3220471373";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.i18n.client.impl.DateRecord[]::class)] = "[Lcom.google.gwt.i18n.client.impl.DateRecord;/1800624538";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.RpcTokenException::class)] = "com.google.gwt.user.client.rpc.RpcTokenException/2345075298";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.XsrfToken::class)] = "com.google.gwt.user.client.rpc.XsrfToken/4254043109";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.ChangeListenerCollection::class)] = "com.google.gwt.user.client.ui.ChangeListenerCollection/287642957";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.ClickListenerCollection::class)] = "com.google.gwt.user.client.ui.ClickListenerCollection/2152455986";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.FocusListenerCollection::class)] = "com.google.gwt.user.client.ui.FocusListenerCollection/119490835";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.FormHandlerCollection::class)] = "com.google.gwt.user.client.ui.FormHandlerCollection/3088681894";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.KeyboardListenerCollection::class)] = "com.google.gwt.user.client.ui.KeyboardListenerCollection/1040442242";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.LoadListenerCollection::class)] = "com.google.gwt.user.client.ui.LoadListenerCollection/3174178888";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.MouseListenerCollection::class)] = "com.google.gwt.user.client.ui.MouseListenerCollection/465158911";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.MouseWheelListenerCollection::class)] = "com.google.gwt.user.client.ui.MouseWheelListenerCollection/370304552";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.PopupListenerCollection::class)] = "com.google.gwt.user.client.ui.PopupListenerCollection/1920131050";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.ScrollListenerCollection::class)] = "com.google.gwt.user.client.ui.ScrollListenerCollection/210686268";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.TabListenerCollection::class)] = "com.google.gwt.user.client.ui.TabListenerCollection/3768293299";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.TableListenerCollection::class)] = "com.google.gwt.user.client.ui.TableListenerCollection/2254740473";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.TreeListenerCollection::class)] = "com.google.gwt.user.client.ui.TreeListenerCollection/3716243734";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Boolean::class)] = "java.lang.Boolean/476441737";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Boolean[]::class)] = "[Ljava.lang.Boolean;/2507200464";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Byte::class)] = "java.lang.Byte/1571082439";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Byte[]::class)] = "[Ljava.lang.Byte;/3053163818";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Double::class)] = "java.lang.Double/858496421";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Double[]::class)] = "[Ljava.lang.Double;/2857560407";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Float::class)] = "java.lang.Float/1718559123";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Float[]::class)] = "[Ljava.lang.Float;/3956181278";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Integer::class)] = "java.lang.Integer/3438268394";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Integer[]::class)] = "[Ljava.lang.Integer;/1574882222";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Long::class)] = "java.lang.Long/4227064769";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Long[]::class)] = "[Ljava.lang.Long;/97727328";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Short::class)] = "java.lang.Short/551743396";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Short[]::class)] = "[Ljava.lang.Short;/3779901635";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String[]::class)] = "[Ljava.lang.String;/2600011424";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Date::class)] = "java.sql.Date/730999118";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Date[]::class)] = "[Ljava.sql.Date;/177260296";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Time::class)] = "java.sql.Time/1816797103";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Time[]::class)] = "[Ljava.sql.Time;/1999508513";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Timestamp::class)] = "java.sql.Timestamp/3040052672";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Timestamp[]::class)] = "[Ljava.sql.Timestamp;/1038705795";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ArrayList::class)] = "java.util.ArrayList/4159755760";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Arrays.ArrayList::class)] = "java.util.Arrays$ArrayList/2507071751";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.EmptyList::class)] = "java.util.Collections$EmptyList/4157118744";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.EmptyMap::class)] = "java.util.Collections$EmptyMap/4174664486";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.EmptySet::class)] = "java.util.Collections$EmptySet/3523698179";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.SingletonList::class)] = "java.util.Collections$SingletonList/1586180994";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Date::class)] = "java.util.Date/3385151746";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Date[]::class)] = "[Ljava.util.Date;/3768760277";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.HashMap::class)] = "java.util.HashMap/1797211028";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.HashSet::class)] = "java.util.HashSet/3273092938";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.IdentityHashMap::class)] = "java.util.IdentityHashMap/1839153020";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedHashMap::class)] = "java.util.LinkedHashMap/3008245022";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedHashSet::class)] = "java.util.LinkedHashSet/1826081506";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedList::class)] = "java.util.LinkedList/3953877921";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Stack::class)] = "java.util.Stack/1346942793";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeMap::class)] = "java.util.TreeMap/1493889780";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeSet::class)] = "java.util.TreeSet/4043497002";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Vector::class)] = "java.util.Vector/3057315478";
    return result;
  }-*/;
  
  public AcessoMenuGrupoServiceFacade_TypeSerializer() {
    super(null, methodMapNative, null, signatureMapNative);
  }
  
}
