package com.extjs.gxt.ui.client.data;

import com.extjs.gxt.ui.client.data.BeanModelFactory;
import java.util.Map;
import com.extjs.gxt.ui.client.core.FastMap;

public class BeanModelLookupImpl extends com.extjs.gxt.ui.client.data.BeanModelLookup {
  private Map<String, BeanModelFactory> m;
  public BeanModelFactory getFactory(Class b) {
    String n = b.getName();
    if (m == null) {
      m = new FastMap<BeanModelFactory>();
    }
    if (m.get(n) == null) {
      if (br.com.cweb.cadastro.persistence.entity.Convenio.class.getName().equals(n)) {
        m0();
      } else if (br.com.cweb.cadastro.persistence.entity.Atribuicao.class.getName().equals(n)) {
        m1();
      } else if (br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira.class.getName().equals(n)) {
        m2();
      } else if (br.com.cweb.cadastro.persistence.entity.Cidade.class.getName().equals(n)) {
        m3();
      } else if (br.com.cweb.cadastro.persistence.entity.Estado.class.getName().equals(n)) {
        m4();
      } else if (br.com.cweb.seguranca.persistence.entity.GrupoAcesso.class.getName().equals(n)) {
        m5();
      } else if (br.com.cweb.cadastro.persistence.entity.PerfilComissao.class.getName().equals(n)) {
        m6();
      } else if (br.com.cweb.cadastro.persistence.entity.Pessoa.class.getName().equals(n)) {
        m7();
      } else if (br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica.class.getName().equals(n)) {
        m8();
      } else if (br.com.cweb.cadastro.persistence.entity.PessoaJuridica.class.getName().equals(n)) {
        m9();
      } else if (br.com.cweb.cadastro.persistence.entity.TipoConta.class.getName().equals(n)) {
        m10();
      } else if (br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira.class.getName().equals(n)) {
        m11();
      } else if (br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO.class.getName().equals(n)) {
        m12();
      } else if (br.com.cweb.seguranca.persistence.entity.AcessoMenu.class.getName().equals(n)) {
        m13();
      } else if (br.com.cweb.seguranca.persistence.entity.Funcionalidade.class.getName().equals(n)) {
        m14();
      } else if (br.com.cweb.seguranca.persistence.entity.TipoPermissao.class.getName().equals(n)) {
        m15();
      }}
    return m.get(n);
  }
  private void m0() {
    m.put(br.com.cweb.cadastro.persistence.entity.Convenio.class.getName(), new com.extjs.gxt.ui.client.data.BeanModel_br_com_cweb_cadastro_persistence_entity_Convenio_Factory());
  }
  private void m1() {
    m.put(br.com.cweb.cadastro.persistence.entity.Atribuicao.class.getName(), new com.extjs.gxt.ui.client.data.BeanModel_br_com_cweb_cadastro_persistence_entity_Atribuicao_Factory());
  }
  private void m2() {
    m.put(br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira.class.getName(), new com.extjs.gxt.ui.client.data.BeanModel_br_com_cweb_cadastro_persistence_entity_InstituicaoFinanceira_Factory());
  }
  private void m3() {
    m.put(br.com.cweb.cadastro.persistence.entity.Cidade.class.getName(), new com.extjs.gxt.ui.client.data.BeanModel_br_com_cweb_cadastro_persistence_entity_Cidade_Factory());
  }
  private void m4() {
    m.put(br.com.cweb.cadastro.persistence.entity.Estado.class.getName(), new com.extjs.gxt.ui.client.data.BeanModel_br_com_cweb_cadastro_persistence_entity_Estado_Factory());
  }
  private void m5() {
    m.put(br.com.cweb.seguranca.persistence.entity.GrupoAcesso.class.getName(), new com.extjs.gxt.ui.client.data.BeanModel_br_com_cweb_seguranca_persistence_entity_GrupoAcesso_Factory());
  }
  private void m6() {
    m.put(br.com.cweb.cadastro.persistence.entity.PerfilComissao.class.getName(), new com.extjs.gxt.ui.client.data.BeanModel_br_com_cweb_cadastro_persistence_entity_PerfilComissao_Factory());
  }
  private void m7() {
    m.put(br.com.cweb.cadastro.persistence.entity.Pessoa.class.getName(), new com.extjs.gxt.ui.client.data.BeanModel_br_com_cweb_cadastro_persistence_entity_Pessoa_Factory());
  }
  private void m8() {
    m.put(br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica.class.getName(), new com.extjs.gxt.ui.client.data.BeanModel_br_com_cweb_cadastro_persistence_entity_PessoaFisicaJuridica_Factory());
  }
  private void m9() {
    m.put(br.com.cweb.cadastro.persistence.entity.PessoaJuridica.class.getName(), new com.extjs.gxt.ui.client.data.BeanModel_br_com_cweb_cadastro_persistence_entity_PessoaJuridica_Factory());
  }
  private void m10() {
    m.put(br.com.cweb.cadastro.persistence.entity.TipoConta.class.getName(), new com.extjs.gxt.ui.client.data.BeanModel_br_com_cweb_cadastro_persistence_entity_TipoConta_Factory());
  }
  private void m11() {
    m.put(br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira.class.getName(), new com.extjs.gxt.ui.client.data.BeanModel_br_com_cweb_cadastro_persistence_entity_InstituicaoFinanceira_Factory());
  }
  private void m12() {
    m.put(br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO.class.getName(), new com.extjs.gxt.ui.client.data.BeanModel_br_com_cweb_seguranca_persistence_entity_AcessoGrupoDTO_Factory());
  }
  private void m13() {
    m.put(br.com.cweb.seguranca.persistence.entity.AcessoMenu.class.getName(), new com.extjs.gxt.ui.client.data.BeanModel_br_com_cweb_seguranca_persistence_entity_AcessoMenu_Factory());
  }
  private void m14() {
    m.put(br.com.cweb.seguranca.persistence.entity.Funcionalidade.class.getName(), new com.extjs.gxt.ui.client.data.BeanModel_br_com_cweb_seguranca_persistence_entity_Funcionalidade_Factory());
  }
  private void m15() {
    m.put(br.com.cweb.seguranca.persistence.entity.TipoPermissao.class.getName(), new com.extjs.gxt.ui.client.data.BeanModel_br_com_cweb_seguranca_persistence_entity_TipoPermissao_Factory());
  }
  
}
