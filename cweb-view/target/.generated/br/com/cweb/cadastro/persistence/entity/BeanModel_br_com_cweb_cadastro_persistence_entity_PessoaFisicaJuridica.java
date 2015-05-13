package br.com.cweb.cadastro.persistence.entity;

import com.extjs.gxt.ui.client.data.BeanModel;
import com.extjs.gxt.ui.client.data.NestedModelUtil;

public class BeanModel_br_com_cweb_cadastro_persistence_entity_PessoaFisicaJuridica extends com.extjs.gxt.ui.client.data.BeanModel {
  public BeanModel_br_com_cweb_cadastro_persistence_entity_PessoaFisicaJuridica(){
  beanProperties.add("cpfCnpjMascarado");
  beanProperties.add("idSuperAtribuicao");
  beanProperties.add("idSuperUsuario");
  beanProperties.add("idPessoaUsuarioLogado");
  beanProperties.add("arvore");
  beanProperties.add("nivel");
  beanProperties.add("possuiUsuario");
  beanProperties.add("possuiCadastroPessoaAtivo");
  beanProperties.add("possuiCadastroUsuarioAtivo");
  beanProperties.add("tipoPessoa");
  beanProperties.add("apelidoNomeFantasia");
  beanProperties.add("id");
  beanProperties.add("idGrupoAcesso");
  beanProperties.add("siglaPessoaJuridica");
  beanProperties.add("idAtribuicao");
  beanProperties.add("nomeRazaoSocial");
  beanProperties.add("tipo");
  beanProperties.add("nomeCidade");
  beanProperties.add("siglaUF");
  beanProperties.add("login");
  beanProperties.add("idPai");
  beanProperties.add("idAravore");
  beanProperties.add("cpfCnpj");
  beanProperties.add("cpfCnpjPai");
  beanProperties.add("cpfCnpjVinculante");
  }
  public <X> X get(String s) {
  if (allowNestedValues && NestedModelUtil.isNestedProperty(s)) {
    return (X)NestedModelUtil.getNestedValue(this, s);
  }
  if (s.equals("cpfCnpjMascarado")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getCpfCnpjMascarado();
  return (X)processValue(value);
  }
  if (s.equals("idSuperAtribuicao")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getIdSuperAtribuicao();
  return (X)processValue(value);
  }
  if (s.equals("idSuperUsuario")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getIdSuperUsuario();
  return (X)processValue(value);
  }
  if (s.equals("idPessoaUsuarioLogado")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getIdPessoaUsuarioLogado();
  return (X)processValue(value);
  }
  if (s.equals("arvore")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getArvore();
  return (X)processValue(value);
  }
  if (s.equals("nivel")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getNivel();
  return (X)processValue(value);
  }
  if (s.equals("possuiUsuario")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getPossuiUsuario();
  return (X)processValue(value);
  }
  if (s.equals("possuiCadastroPessoaAtivo")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getPossuiCadastroPessoaAtivo();
  return (X)processValue(value);
  }
  if (s.equals("possuiCadastroUsuarioAtivo")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getPossuiCadastroUsuarioAtivo();
  return (X)processValue(value);
  }
  if (s.equals("tipoPessoa")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getTipoPessoa();
  return (X)processValue(value);
  }
  if (s.equals("apelidoNomeFantasia")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getApelidoNomeFantasia();
  return (X)processValue(value);
  }
  if (s.equals("id")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getId();
  return (X)processValue(value);
  }
  if (s.equals("idGrupoAcesso")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getIdGrupoAcesso();
  return (X)processValue(value);
  }
  if (s.equals("siglaPessoaJuridica")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getSiglaPessoaJuridica();
  return (X)processValue(value);
  }
  if (s.equals("idAtribuicao")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getIdAtribuicao();
  return (X)processValue(value);
  }
  if (s.equals("nomeRazaoSocial")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getNomeRazaoSocial();
  return (X)processValue(value);
  }
  if (s.equals("tipo")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getTipo();
  return (X)processValue(value);
  }
  if (s.equals("nomeCidade")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getNomeCidade();
  return (X)processValue(value);
  }
  if (s.equals("siglaUF")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getSiglaUF();
  return (X)processValue(value);
  }
  if (s.equals("login")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getLogin();
  return (X)processValue(value);
  }
  if (s.equals("idPai")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getIdPai();
  return (X)processValue(value);
  }
  if (s.equals("idAravore")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getIdAravore();
  return (X)processValue(value);
  }
  if (s.equals("cpfCnpj")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getCpfCnpj();
  return (X)processValue(value);
  }
  if (s.equals("cpfCnpjPai")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getCpfCnpjPai();
  return (X)processValue(value);
  }
  if (s.equals("cpfCnpjVinculante")) {
  Object value = ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).getCpfCnpjVinculante();
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
    if (s.equals("cpfCnpjMascarado")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setCpfCnpjMascarado((java.lang.String)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("idSuperAtribuicao")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setIdSuperAtribuicao((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("idSuperUsuario")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setIdSuperUsuario((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("idPessoaUsuarioLogado")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setIdPessoaUsuarioLogado((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("arvore")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setArvore((java.lang.String)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("nivel")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setNivel((java.lang.Integer)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("possuiUsuario")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setPossuiUsuario((java.lang.Boolean)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("possuiCadastroPessoaAtivo")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setPossuiCadastroPessoaAtivo((java.lang.Boolean)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("possuiCadastroUsuarioAtivo")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setPossuiCadastroUsuarioAtivo((java.lang.Boolean)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("tipoPessoa")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setTipoPessoa((br.com.cweb.cadastro.persistence.entity.TipoPessoa)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("apelidoNomeFantasia")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setApelidoNomeFantasia((java.lang.String)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("id")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setId((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("idGrupoAcesso")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setIdGrupoAcesso((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("siglaPessoaJuridica")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setSiglaPessoaJuridica((java.lang.String)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("idAtribuicao")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setIdAtribuicao((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("nomeRazaoSocial")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setNomeRazaoSocial((java.lang.String)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("tipo")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setTipo((java.lang.String)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("nomeCidade")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setNomeCidade((java.lang.String)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("siglaUF")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setSiglaUF((java.lang.String)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("login")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setLogin((java.lang.String)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("idPai")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setIdPai((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("idAravore")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setIdAravore((java.lang.Long)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("cpfCnpj")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setCpfCnpj((java.lang.String)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("cpfCnpjPai")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setCpfCnpjPai((java.lang.String)obj);
      notifyPropertyChanged(s, val, old);
      return (X)old;
    }
    if (s.equals("cpfCnpjVinculante")) {
      Object old = get(s);
      ((br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica)bean).setCpfCnpjVinculante((java.lang.String)obj);
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
