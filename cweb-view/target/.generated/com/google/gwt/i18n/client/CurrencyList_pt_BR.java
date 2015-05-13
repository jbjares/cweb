package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_pt_BR extends com.google.gwt.i18n.client.CurrencyList_pt {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("BRL", "R$", 2, "R$");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "BRL", "R$", 2, "R$"];
  }-*/;
}
