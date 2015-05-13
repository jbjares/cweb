package br.com.cweb.cadastro.persistence.entity;

import com.extjs.gxt.ui.client.data.BeanModel;
import com.extjs.gxt.ui.client.data.NestedModelUtil;

public class BeanModel_br_com_cweb_cadastro_persistence_entity_Atribuicao extends com.extjs.gxt.ui.client.data.BeanModel {
  public BeanModel_br_com_cweb_cadastro_persistence_entity_Atribuicao(){
  beanProperties.add("id");
  beanProperties.add("idUsuarioAtualizador");
  beanProperties.add("dataHoraAtualizacao");
  beanProperties.add("possuiCadastroAtivo");
  beanProperties.add("codigoHierarquico");
  beanProperties.add("nome");
  beanProperties.add("id");
  }
  public <X> X get(String s) {
  if (allowNestedValues && NestedModelUtil.isNestedProperty(s)) {
    return (X)NestedModelUtil.getNestedValue(this, s);
  }
  if (s.equals("id")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.Atribuicao)bean).getId();
  return (X)processValue(value);
  }
  if (s.equals("idUsuarioAtualizador")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.Atribuicao)bean).getIdUsuarioAtualizador();
  return (X)processValue(value);
  }
  if (s.equals("dataHoraAtualizacao")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.Atribuicao)bean).getDataHoraAtualizacao();
  return (X)processValue(value);
  }
  if (s.equals("possuiCadastroAtivo")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.Atribuicao)bean).getPossuiCadastroAtivo();
  return (X)processValue(value);
  }
  if (s.equals("codigoHierarquico")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.Atribuicao)bean).getCodigoHierarquico();
  return (X)processValue(value);
  }
  if (s.equals("nome")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.Atribuicao)bean).getNome();
  return (X)processValue(value);
  }
  if (s.equals("id")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.Atribuicao)bean).getId();
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
      ((br.com.cweb.cadastro.persistence.entity.Atribuicao)bean).setId((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("idUsuarioAtualizador")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.Atribuicao)bean).setIdUsuarioAtualizador((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("dataHoraAtualizacao")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.Atribuicao)bean).setDataHoraAtualizacao((java.util.Date)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("possuiCadastroAtivo")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.Atribuicao)bean).setPossuiCadastroAtivo((java.lang.Boolean)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("codigoHierarquico")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.Atribuicao)bean).setCodigoHierarquico((java.lang.Integer)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("nome")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.Atribuicao)bean).setNome((java.lang.String)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("id")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.Atribuicao)bean).setId((java.lang.Long)obj);
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
