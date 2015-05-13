package br.com.cweb.seguranca.persistence.entity;

import com.extjs.gxt.ui.client.data.BeanModel;
import com.extjs.gxt.ui.client.data.NestedModelUtil;

public class BeanModel_br_com_cweb_seguranca_persistence_entity_TipoPermissao extends com.extjs.gxt.ui.client.data.BeanModel {
  public BeanModel_br_com_cweb_seguranca_persistence_entity_TipoPermissao(){
  beanProperties.add("id");
  beanProperties.add("idUsuarioAtualizador");
  beanProperties.add("dataHoraAtualizacao");
  beanProperties.add("possuiCadastroAtivo");
  beanProperties.add("id");
  beanProperties.add("nome");
  beanProperties.add("sigla");
  }
  public <X> X get(String s) {
  if (allowNestedValues && NestedModelUtil.isNestedProperty(s)) {
    return (X)NestedModelUtil.getNestedValue(this, s);
  }
  if (s.equals("id")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.TipoPermissao)bean).getId();
  return (X)processValue(value);
  }
  if (s.equals("idUsuarioAtualizador")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.TipoPermissao)bean).getIdUsuarioAtualizador();
  return (X)processValue(value);
  }
  if (s.equals("dataHoraAtualizacao")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.TipoPermissao)bean).getDataHoraAtualizacao();
  return (X)processValue(value);
  }
  if (s.equals("possuiCadastroAtivo")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.TipoPermissao)bean).getPossuiCadastroAtivo();
  return (X)processValue(value);
  }
  if (s.equals("id")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.TipoPermissao)bean).getId();
  return (X)processValue(value);
  }
  if (s.equals("nome")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.TipoPermissao)bean).getNome();
  return (X)processValue(value);
  }
  if (s.equals("sigla")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.TipoPermissao)bean).getSigla();
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
    if (s.equals("id")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.TipoPermissao)bean).setId((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("idUsuarioAtualizador")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.TipoPermissao)bean).setIdUsuarioAtualizador((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("dataHoraAtualizacao")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.TipoPermissao)bean).setDataHoraAtualizacao((java.util.Date)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("possuiCadastroAtivo")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.TipoPermissao)bean).setPossuiCadastroAtivo((java.lang.Boolean)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("id")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.TipoPermissao)bean).setId((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("nome")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.TipoPermissao)bean).setNome((java.lang.String)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("sigla")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.TipoPermissao)bean).setSigla((java.lang.String)obj);
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
