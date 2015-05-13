package br.com.cweb.seguranca.persistence.entity;

import com.extjs.gxt.ui.client.data.BeanModel;
import com.extjs.gxt.ui.client.data.NestedModelUtil;

public class BeanModel_br_com_cweb_seguranca_persistence_entity_AcessoGrupoDTO extends com.extjs.gxt.ui.client.data.BeanModel {
  public BeanModel_br_com_cweb_seguranca_persistence_entity_AcessoGrupoDTO(){
  beanProperties.add("permissoes");
  beanProperties.add("nomeFuncionalidade");
  beanProperties.add("idFuncionalidade");
  beanProperties.add("isfnAlterar");
  beanProperties.add("isfnIncluir");
  beanProperties.add("isfnConsultar");
  beanProperties.add("isfnExcluir");
  beanProperties.add("isfnImprimir");
  beanProperties.add("idGrupoAcesso");
  beanProperties.add("idAcessoMenu");
  }
  public <X> X get(String s) {
  if (allowNestedValues && NestedModelUtil.isNestedProperty(s)) {
    return (X)NestedModelUtil.getNestedValue(this, s);
  }
  if (s.equals("permissoes")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)bean).getPermissoes();
  if (value != null) {
    java.util.List list = (java.util.List)value;
    java.util.List list2 = com.extjs.gxt.ui.client.data.BeanModelLookup.get().getFactory(br.com.cweb.seguranca.persistence.entity.TipoPermissao.class).createModel((java.util.Collection) list);
  return (X) list2;
  }
  return (X)processValue(value);
  }
  if (s.equals("nomeFuncionalidade")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)bean).getNomeFuncionalidade();
  return (X)processValue(value);
  }
  if (s.equals("idFuncionalidade")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)bean).getIdFuncionalidade();
  return (X)processValue(value);
  }
  if (s.equals("isfnAlterar")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)bean).isIsfnAlterar();
  return (X)processValue(value);
  }
  if (s.equals("isfnIncluir")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)bean).isIsfnIncluir();
  return (X)processValue(value);
  }
  if (s.equals("isfnConsultar")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)bean).isIsfnConsultar();
  return (X)processValue(value);
  }
  if (s.equals("isfnExcluir")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)bean).isIsfnExcluir();
  return (X)processValue(value);
  }
  if (s.equals("isfnImprimir")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)bean).isIsfnImprimir();
  return (X)processValue(value);
  }
  if (s.equals("idGrupoAcesso")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)bean).getIdGrupoAcesso();
  return (X)processValue(value);
  }
  if (s.equals("idAcessoMenu")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)bean).getIdAcessoMenu();
  return (X)processValue(value);
  }
  return super.get(s);
  }
  public <X> X set(String s, X val) {
    Object obj = val;
    if (obj instanceof BeanModel) {
    obj = ((BeanModel) obj).getBean();
    } else if (obj instanceof java.util.List) {
    java.util.List list = new java.util.ArrayList();
    for(Object o : (java.util.List) obj) {
    if(o instanceof BeanModel) {
    list.add(((BeanModel) o).getBean());
    } else {
    list.add(o);
    }
    }
    obj = list;
    }
    if (allowNestedValues && val instanceof BeanModel) {
      obj = ((BeanModel)val).getBean();
      if (nestedModels.containsKey(s)) {
        nestedModels.put(s, (BeanModel)val);
      }
    }
    if (allowNestedValues && NestedModelUtil.isNestedProperty(s)) {
      X old = (X) NestedModelUtil.setNestedValue(this, s, val);
      notifyPropertyChanged(s, val, old);
      return old;
    }
    if (s.equals("permissoes")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)bean).setPermissoes((java.util.List)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("nomeFuncionalidade")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)bean).setNomeFuncionalidade((java.lang.String)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("idFuncionalidade")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)bean).setIdFuncionalidade((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("isfnAlterar")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)bean).setIsfnAlterar((Boolean)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("isfnIncluir")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)bean).setIsfnIncluir((Boolean)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("isfnConsultar")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)bean).setIsfnConsultar((Boolean)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("isfnExcluir")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)bean).setIsfnExcluir((Boolean)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("isfnImprimir")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)bean).setIsfnImprimir((Boolean)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("idGrupoAcesso")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)bean).setIdGrupoAcesso((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("idAcessoMenu")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO)bean).setIdAcessoMenu((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    return super.set(s, val);
  }
  public boolean equals(Object obj) {
    if (obj instanceof BeanModel) {
      obj = ((BeanModel)obj).getBean();
    }
    return bean.equals(obj);
  }
  public int hashCode(){
    return bean.hashCode();
  }
}
