package br.com.cweb.seguranca.persistence.entity;

import com.extjs.gxt.ui.client.data.BeanModel;
import com.extjs.gxt.ui.client.data.NestedModelUtil;

public class BeanModel_br_com_cweb_seguranca_persistence_entity_Funcionalidade extends com.extjs.gxt.ui.client.data.BeanModel {
  public BeanModel_br_com_cweb_seguranca_persistence_entity_Funcionalidade(){
  beanProperties.add("id");
  beanProperties.add("idUsuarioAtualizador");
  beanProperties.add("dataHoraAtualizacao");
  beanProperties.add("possuiCadastroAtivo");
  beanProperties.add("paiFuncionalidade");
  beanProperties.add("tipoFuncionalidade");
  beanProperties.add("id");
  beanProperties.add("nome");
  beanProperties.add("sigla");
  beanProperties.add("tooltip");
  beanProperties.add("tipoPermissoes");
  }
  public <X> X get(String s) {
  if (allowNestedValues && NestedModelUtil.isNestedProperty(s)) {
    return (X)NestedModelUtil.getNestedValue(this, s);
  }
  if (s.equals("id")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).getId();
  return (X)processValue(value);
  }
  if (s.equals("idUsuarioAtualizador")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).getIdUsuarioAtualizador();
  return (X)processValue(value);
  }
  if (s.equals("dataHoraAtualizacao")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).getDataHoraAtualizacao();
  return (X)processValue(value);
  }
  if (s.equals("possuiCadastroAtivo")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).getPossuiCadastroAtivo();
  return (X)processValue(value);
  }
  if (s.equals("paiFuncionalidade")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).getPaiFuncionalidade();
  return (X)processValue(value);
  }
  if (s.equals("tipoFuncionalidade")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).getTipoFuncionalidade();
  return (X)processValue(value);
  }
  if (s.equals("id")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).getId();
  return (X)processValue(value);
  }
  if (s.equals("nome")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).getNome();
  return (X)processValue(value);
  }
  if (s.equals("sigla")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).getSigla();
  return (X)processValue(value);
  }
  if (s.equals("tooltip")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).getTooltip();
  return (X)processValue(value);
  }
  if (s.equals("tipoPermissoes")) {
  Object value = ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).getTipoPermissoes();
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
      ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).setId((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("idUsuarioAtualizador")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).setIdUsuarioAtualizador((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("dataHoraAtualizacao")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).setDataHoraAtualizacao((java.util.Date)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("possuiCadastroAtivo")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).setPossuiCadastroAtivo((java.lang.Boolean)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("paiFuncionalidade")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).setPaiFuncionalidade((java.lang.Integer)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("tipoFuncionalidade")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).setTipoFuncionalidade((java.lang.Integer)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("id")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).setId((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("nome")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).setNome((java.lang.String)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("sigla")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).setSigla((java.lang.String)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("tooltip")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).setTooltip((java.lang.String)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("tipoPermissoes")) {
      Object old = get(s);
      ((br.com.cweb.seguranca.persistence.entity.Funcionalidade)bean).setTipoPermissoes((java.util.Set)obj);
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
