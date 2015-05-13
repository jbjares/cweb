package br.com.cweb.view.cadastro.cadastroconvenio.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class CadastroConvenioServiceFacade_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
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
    result["br.com.cweb.cadastro.persistence.entity.Convenio/2257975695"] = [
        @br.com.cweb.cadastro.persistence.entity.Convenio_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.Convenio_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/Convenio;),
        @br.com.cweb.cadastro.persistence.entity.Convenio_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lbr/com/cweb/cadastro/persistence/entity/Convenio;)
      ];
    
    result["[Lbr.com.cweb.cadastro.persistence.entity.Convenio;/3819186323"] = [
        @br.com.cweb.cadastro.persistence.entity.Convenio_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.Convenio_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/cadastro/persistence/entity/Convenio;),
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
        ,
        ,
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
        ,
        ,
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
        ,
        ,
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
        ,
        ,
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
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeMap;)
      ];
    
    result["java.util.TreeSet/4043497002"] = [
        ,
        ,
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
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.Convenio::class)] = "br.com.cweb.cadastro.persistence.entity.Convenio/2257975695";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.Convenio[]::class)] = "[Lbr.com.cweb.cadastro.persistence.entity.Convenio;/3819186323";
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
  
  public CadastroConvenioServiceFacade_TypeSerializer() {
    super(null, methodMapNative, null, signatureMapNative);
  }
  
}
