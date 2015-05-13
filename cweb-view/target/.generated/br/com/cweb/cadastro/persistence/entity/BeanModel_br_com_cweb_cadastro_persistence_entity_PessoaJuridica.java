package br.com.cweb.cadastro.persistence.entity;

import com.extjs.gxt.ui.client.data.BeanModel;
import com.extjs.gxt.ui.client.data.NestedModelUtil;

public class BeanModel_br_com_cweb_cadastro_persistence_entity_PessoaJuridica extends com.extjs.gxt.ui.client.data.BeanModel {
  public BeanModel_br_com_cweb_cadastro_persistence_entity_PessoaJuridica(){
  beanProperties.add("id");
  beanProperties.add("idUsuarioAtualizador");
  beanProperties.add("dataHoraAtualizacao");
  beanProperties.add("possuiCadastroAtivo");
  beanProperties.add("arvoreFamiliar");
  beanProperties.add("possuiBonificacaoContratual");
  beanProperties.add("atribuicao");
  beanProperties.add("pessoaVinculadora");
  beanProperties.add("vinculados");
  beanProperties.add("id");
  beanProperties.add("perfilComissao");
  beanProperties.add("tipoPessoa");
  beanProperties.add("enderecos");
  beanProperties.add("dadosBancarios");
  beanProperties.add("usuario");
  beanProperties.add("razaoSocial");
  beanProperties.add("cnpj");
  beanProperties.add("nomeFantasia");
  beanProperties.add("sigla");
  }
  public <X> X get(String s) {
  if (allowNestedValues && NestedModelUtil.isNestedProperty(s)) {
    return (X)NestedModelUtil.getNestedValue(this, s);
  }
  if (s.equals("id")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).getId();
  return (X)processValue(value);
  }
  if (s.equals("idUsuarioAtualizador")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).getIdUsuarioAtualizador();
  return (X)processValue(value);
  }
  if (s.equals("dataHoraAtualizacao")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).getDataHoraAtualizacao();
  return (X)processValue(value);
  }
  if (s.equals("possuiCadastroAtivo")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).getPossuiCadastroAtivo();
  return (X)processValue(value);
  }
  if (s.equals("arvoreFamiliar")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).getArvoreFamiliar();
  return (X)processValue(value);
  }
  if (s.equals("possuiBonificacaoContratual")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).getPossuiBonificacaoContratual();
  return (X)processValue(value);
  }
  if (s.equals("atribuicao")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).getAtribuicao();
  if (value != null) {
      BeanModel nestedModel = nestedModels.get(s);
      if (nestedModel != null) {
        Object bean = nestedModel.getBean();
        if (!bean.equals(value)){
          nestedModel = null;
        }
      }
      if (nestedModel == null) {
          nestedModel = com.extjs.gxt.ui.client.data.BeanModelLookup.get().getFactory(br.com.cweb.cadastro.persistence.entity.Atribuicao.class).createModel(value);
          nestedModels.put(s, nestedModel);
      }
      return (X)processValue(nestedModel);
  }
  return (X)processValue(value);
  }
  if (s.equals("pessoaVinculadora")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).getPessoaVinculadora();
  if (value != null) {
      BeanModel nestedModel = nestedModels.get(s);
      if (nestedModel != null) {
        Object bean = nestedModel.getBean();
        if (!bean.equals(value)){
          nestedModel = null;
        }
      }
      if (nestedModel == null) {
          nestedModel = com.extjs.gxt.ui.client.data.BeanModelLookup.get().getFactory(br.com.cweb.cadastro.persistence.entity.Pessoa.class).createModel(value);
          nestedModels.put(s, nestedModel);
      }
      return (X)processValue(nestedModel);
  }
  return (X)processValue(value);
  }
  if (s.equals("vinculados")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).getVinculados();
  if (value != null) {
    java.util.List list = (java.util.List)value;
    java.util.List list2 = com.extjs.gxt.ui.client.data.BeanModelLookup.get().getFactory(br.com.cweb.cadastro.persistence.entity.Pessoa.class).createModel((java.util.Collection) list);
  return (X) list2;
  }
  return (X)processValue(value);
  }
  if (s.equals("id")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).getId();
  return (X)processValue(value);
  }
  if (s.equals("perfilComissao")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).getPerfilComissao();
  if (value != null) {
      BeanModel nestedModel = nestedModels.get(s);
      if (nestedModel != null) {
        Object bean = nestedModel.getBean();
        if (!bean.equals(value)){
          nestedModel = null;
        }
      }
      if (nestedModel == null) {
          nestedModel = com.extjs.gxt.ui.client.data.BeanModelLookup.get().getFactory(br.com.cweb.cadastro.persistence.entity.PerfilComissao.class).createModel(value);
          nestedModels.put(s, nestedModel);
      }
      return (X)processValue(nestedModel);
  }
  return (X)processValue(value);
  }
  if (s.equals("tipoPessoa")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).getTipoPessoa();
  return (X)processValue(value);
  }
  if (s.equals("enderecos")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).getEnderecos();
  return (X)processValue(value);
  }
  if (s.equals("dadosBancarios")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).getDadosBancarios();
  return (X)processValue(value);
  }
  if (s.equals("usuario")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).getUsuario();
  return (X)processValue(value);
  }
  if (s.equals("razaoSocial")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).getRazaoSocial();
  return (X)processValue(value);
  }
  if (s.equals("cnpj")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).getCnpj();
  return (X)processValue(value);
  }
  if (s.equals("nomeFantasia")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).getNomeFantasia();
  return (X)processValue(value);
  }
  if (s.equals("sigla")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).getSigla();
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
      ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).setId((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("idUsuarioAtualizador")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).setIdUsuarioAtualizador((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("dataHoraAtualizacao")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).setDataHoraAtualizacao((java.util.Date)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("possuiCadastroAtivo")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).setPossuiCadastroAtivo((java.lang.Boolean)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("arvoreFamiliar")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).setArvoreFamiliar((br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("possuiBonificacaoContratual")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).setPossuiBonificacaoContratual((java.lang.Boolean)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("atribuicao")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).setAtribuicao((br.com.cweb.cadastro.persistence.entity.Atribuicao)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("pessoaVinculadora")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).setPessoaVinculadora((br.com.cweb.cadastro.persistence.entity.Pessoa)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("vinculados")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).setVinculados((java.util.List)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("id")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).setId((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("perfilComissao")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).setPerfilComissao((br.com.cweb.cadastro.persistence.entity.PerfilComissao)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("tipoPessoa")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).setTipoPessoa((br.com.cweb.cadastro.persistence.entity.TipoPessoa)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("enderecos")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).setEnderecos((java.util.List)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("dadosBancarios")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).setDadosBancarios((java.util.List)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("usuario")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).setUsuario((br.com.cweb.seguranca.persistence.entity.Usuario)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("razaoSocial")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).setRazaoSocial((java.lang.String)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("cnpj")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).setCnpj((java.lang.String)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("nomeFantasia")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).setNomeFantasia((java.lang.String)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("sigla")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaJuridica)bean).setSigla((java.lang.String)obj);
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
