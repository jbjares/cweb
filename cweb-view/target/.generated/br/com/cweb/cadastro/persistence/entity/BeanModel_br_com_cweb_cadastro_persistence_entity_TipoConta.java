package br.com.cweb.cadastro.persistence.entity;

import com.extjs.gxt.ui.client.data.BeanModel;
import com.extjs.gxt.ui.client.data.NestedModelUtil;

public class BeanModel_br_com_cweb_cadastro_persistence_entity_TipoConta extends com.extjs.gxt.ui.client.data.BeanModel {
  public BeanModel_br_com_cweb_cadastro_persistence_entity_TipoConta(){
  beanProperties.add("declaringClass");
  beanProperties.add("value");
  beanProperties.add("tipo");
  beanProperties.add("descricao");
  }
  public <X> X get(String s) {
  if (allowNestedValues && NestedModelUtil.isNestedProperty(s)) {
    return (X)NestedModelUtil.getNestedValue(this, s);
  }
  if (s.equals("declaringClass")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.TipoConta)bean).getDeclaringClass();
  return (X)processValue(value);
  }
  if (s.equals("value")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.TipoConta)bean).getValue();
  return (X)processValue(value);
  }
  if (s.equals("tipo")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.TipoConta)bean).getTipo();
  return (X)processValue(value);
  }
  if (s.equals("descricao")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.TipoConta)bean).getDescricao();
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
    if (s.equals("tipo")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.TipoConta)bean).setTipo((java.lang.Integer)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("descricao")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.TipoConta)bean).setDescricao((java.lang.String)obj);
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
