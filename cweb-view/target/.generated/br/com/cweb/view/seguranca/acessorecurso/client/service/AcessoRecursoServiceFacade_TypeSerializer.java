package br.com.cweb.view.seguranca.acessorecurso.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class AcessoRecursoServiceFacade_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
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
    result["br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar/2808529220"] = [
        @br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/ArvoreFamiliar;),
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.Atribuicao/2358068784"] = [
        @br.com.cweb.cadastro.persistence.entity.Atribuicao_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.Atribuicao_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/Atribuicao;),
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.Cidade/1159706616"] = [
        @br.com.cweb.cadastro.persistence.entity.Cidade_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.Cidade_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/Cidade;),
      ];
    
    result["[Lbr.com.cweb.cadastro.persistence.entity.Cidade;/3695592329"] = [
        @br.com.cweb.cadastro.persistence.entity.Cidade_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.Cidade_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/cadastro/persistence/entity/Cidade;),
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.ContaBancaria/1963720608"] = [
        @br.com.cweb.cadastro.persistence.entity.ContaBancaria_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.ContaBancaria_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/ContaBancaria;),
      ];
    
    result["[Lbr.com.cweb.cadastro.persistence.entity.ContaBancaria;/2479143526"] = [
        @br.com.cweb.cadastro.persistence.entity.ContaBancaria_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.ContaBancaria_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/cadastro/persistence/entity/ContaBancaria;),
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.Convenio/2257975695"] = [
        @br.com.cweb.cadastro.persistence.entity.Convenio_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.Convenio_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/Convenio;),
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.Endereco/1109738307"] = [
        @br.com.cweb.cadastro.persistence.entity.Endereco_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.Endereco_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/Endereco;),
      ];
    
    result["[Lbr.com.cweb.cadastro.persistence.entity.Endereco;/4233337058"] = [
        @br.com.cweb.cadastro.persistence.entity.Endereco_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.Endereco_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/cadastro/persistence/entity/Endereco;),
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.Estado/377296711"] = [
        @br.com.cweb.cadastro.persistence.entity.Estado_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.Estado_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/Estado;),
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira/3001789167"] = [
        @br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/InstituicaoFinanceira;),
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.PerfilComissao/555920445"] = [
        @br.com.cweb.cadastro.persistence.entity.PerfilComissao_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.PerfilComissao_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/PerfilComissao;),
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.Pessoa/4040299406"] = [
        @br.com.cweb.cadastro.persistence.entity.Pessoa_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.Pessoa_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/Pessoa;),
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.PessoaFisica/71683337"] = [
        @br.com.cweb.cadastro.persistence.entity.PessoaFisica_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.PessoaFisica_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/PessoaFisica;),
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica/660816837"] = [
        @br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/PessoaFisicaJuridica;),
      ];
    
    result["[Lbr.com.cweb.cadastro.persistence.entity.PessoaFisica;/2949029722"] = [
        @br.com.cweb.cadastro.persistence.entity.PessoaFisica_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.PessoaFisica_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/cadastro/persistence/entity/PessoaFisica;),
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.PessoaJuridica/2581919241"] = [
        @br.com.cweb.cadastro.persistence.entity.PessoaJuridica_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.PessoaJuridica_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/PessoaJuridica;),
      ];
    
    result["[Lbr.com.cweb.cadastro.persistence.entity.PessoaJuridica;/3761416939"] = [
        @br.com.cweb.cadastro.persistence.entity.PessoaJuridica_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.PessoaJuridica_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/cadastro/persistence/entity/PessoaJuridica;),
      ];
    
    result["[Lbr.com.cweb.cadastro.persistence.entity.Pessoa;/1930767873"] = [
        @br.com.cweb.cadastro.persistence.entity.Pessoa_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.Pessoa_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/cadastro/persistence/entity/Pessoa;),
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.TipoConta/1467776311"] = [
        @br.com.cweb.cadastro.persistence.entity.TipoConta_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.TipoConta_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/TipoConta;),
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.TipoEndereco/3705569210"] = [
        @br.com.cweb.cadastro.persistence.entity.TipoEndereco_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.TipoEndereco_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/TipoEndereco;),
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.TipoInstituicao/138639325"] = [
        @br.com.cweb.cadastro.persistence.entity.TipoInstituicao_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.TipoInstituicao_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/TipoInstituicao;),
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.TipoPessoa/1405647552"] = [
        @br.com.cweb.cadastro.persistence.entity.TipoPessoa_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.TipoPessoa_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/TipoPessoa;),
      ];
    
    result["br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO/2486216669"] = [
        @br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/cadastro/persistence/entity/UsuarioLogadoDTO;),
      ];
    
    result["br.com.cweb.core.persistence.beanmodel.Ordenacao/3918795316"] = [
        @br.com.cweb.core.persistence.beanmodel.Ordenacao_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.core.persistence.beanmodel.Ordenacao_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/core/persistence/beanmodel/Ordenacao;),
      ];
    
    result["br.com.cweb.core.persistence.beanmodel.Paginador/3688094731"] = [
        @br.com.cweb.core.persistence.beanmodel.Paginador_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.core.persistence.beanmodel.Paginador_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/core/persistence/beanmodel/Paginador;),
      ];
    
    result["br.com.cweb.core.persistence.beanmodel.ResultadoPaginado/3375020944"] = [
        @br.com.cweb.core.persistence.beanmodel.ResultadoPaginado_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.core.persistence.beanmodel.ResultadoPaginado_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/core/persistence/beanmodel/ResultadoPaginado;),
      ];
    
    result["br.com.cweb.core.persistence.beanmodel.SimpleModelData/2507063497"] = [
        @br.com.cweb.core.persistence.beanmodel.SimpleModelData_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.core.persistence.beanmodel.SimpleModelData_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/core/persistence/beanmodel/SimpleModelData;),
      ];
    
    result["[Lbr.com.cweb.core.persistence.beanmodel.SimpleModelData;/587083432"] = [
        @br.com.cweb.core.persistence.beanmodel.SimpleModelData_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.core.persistence.beanmodel.SimpleModelData_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/core/persistence/beanmodel/SimpleModelData;),
      ];
    
    result["br.com.cweb.core.persistence.entity.TipoSituacaoAtivacao/3052585075"] = [
        @br.com.cweb.core.persistence.entity.TipoSituacaoAtivacao_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.core.persistence.entity.TipoSituacaoAtivacao_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/core/persistence/entity/TipoSituacaoAtivacao;),
      ];
    
    result["br.com.cweb.core.persistence.entity.TipoVinculacao/2420228652"] = [
        @br.com.cweb.core.persistence.entity.TipoVinculacao_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.core.persistence.entity.TipoVinculacao_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/core/persistence/entity/TipoVinculacao;),
      ];
    
    result["br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException/2858437552"] = [
        @br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/core/persistence/exception/NenhumRegistroEncontradoException;),
      ];
    
    result["br.com.cweb.mensagem.exception.MensagemException/694185558"] = [
        @br.com.cweb.mensagem.exception.MensagemException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.mensagem.exception.MensagemException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/mensagem/exception/MensagemException;),
      ];
    
    result["br.com.cweb.mensagem.to.Mensagem/4223174925"] = [
        @br.com.cweb.mensagem.to.Mensagem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.mensagem.to.Mensagem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/mensagem/to/Mensagem;),
      ];
    
    result["[Lbr.com.cweb.mensagem.to.Mensagem;/293322735"] = [
        @br.com.cweb.mensagem.to.Mensagem_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.mensagem.to.Mensagem_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/mensagem/to/Mensagem;),
      ];
    
    result["br.com.cweb.relatorio.to.TipoFormatoRelatorio/1851932827"] = [
        @br.com.cweb.relatorio.to.TipoFormatoRelatorio_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.relatorio.to.TipoFormatoRelatorio_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/relatorio/to/TipoFormatoRelatorio;),
      ];
    
    result["br.com.cweb.relatorio.to.TipoNomeRelatorio/887727518"] = [
        @br.com.cweb.relatorio.to.TipoNomeRelatorio_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.relatorio.to.TipoNomeRelatorio_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/relatorio/to/TipoNomeRelatorio;),
      ];
    
    result["br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO/1680717994"] = [
        @br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/seguranca/persistence/entity/AcessoGrupoDTO;),
      ];
    
    result["br.com.cweb.seguranca.persistence.entity.AcessoMenu/2754561031"] = [
        @br.com.cweb.seguranca.persistence.entity.AcessoMenu_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.AcessoMenu_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/seguranca/persistence/entity/AcessoMenu;),
      ];
    
    result["br.com.cweb.seguranca.persistence.entity.Funcionalidade/835000344"] = [
        @br.com.cweb.seguranca.persistence.entity.Funcionalidade_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.Funcionalidade_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/seguranca/persistence/entity/Funcionalidade;),
      ];
    
    result["br.com.cweb.seguranca.persistence.entity.GrupoAcesso/1091394704"] = [
        @br.com.cweb.seguranca.persistence.entity.GrupoAcesso_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.GrupoAcesso_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/seguranca/persistence/entity/GrupoAcesso;),
      ];
    
    result["br.com.cweb.seguranca.persistence.entity.MenuDTO/2265074607"] = [
        @br.com.cweb.seguranca.persistence.entity.MenuDTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.MenuDTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/seguranca/persistence/entity/MenuDTO;),
      ];
    
    result["br.com.cweb.seguranca.persistence.entity.TipoFuncionalidade/1362178606"] = [
        @br.com.cweb.seguranca.persistence.entity.TipoFuncionalidade_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.TipoFuncionalidade_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/seguranca/persistence/entity/TipoFuncionalidade;),
      ];
    
    result["br.com.cweb.seguranca.persistence.entity.TipoPermissao/3395514979"] = [
        @br.com.cweb.seguranca.persistence.entity.TipoPermissao_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.TipoPermissao_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/seguranca/persistence/entity/TipoPermissao;),
      ];
    
    result["[Lbr.com.cweb.seguranca.persistence.entity.TipoPermissao;/2582740504"] = [
        @br.com.cweb.seguranca.persistence.entity.TipoPermissao_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.TipoPermissao_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/seguranca/persistence/entity/TipoPermissao;),
      ];
    
    result["br.com.cweb.seguranca.persistence.entity.TipoSituacaoGrupo/309174036"] = [
        @br.com.cweb.seguranca.persistence.entity.TipoSituacaoGrupo_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.TipoSituacaoGrupo_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/seguranca/persistence/entity/TipoSituacaoGrupo;),
      ];
    
    result["br.com.cweb.seguranca.persistence.entity.Usuario/2445256274"] = [
        @br.com.cweb.seguranca.persistence.entity.Usuario_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.Usuario_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/seguranca/persistence/entity/Usuario;),
      ];
    
    result["[Lbr.com.cweb.seguranca.persistence.entity.Usuario;/45943676"] = [
        @br.com.cweb.seguranca.persistence.entity.Usuario_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.seguranca.persistence.entity.Usuario_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lbr/com/cweb/seguranca/persistence/entity/Usuario;),
      ];
    
    result["br.com.cweb.view.template.client.ComboBoxClear$TriggerAction/4231503732"] = [
        @br.com.cweb.view.template.client.ComboBoxClear_TriggerAction_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.view.template.client.ComboBoxClear_TriggerAction_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/view/template/client/ComboBoxClear$TriggerAction;),
      ];
    
    result["br.com.cweb.widgets.constants.Function/474821551"] = [
        @br.com.cweb.widgets.constants.Function_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.widgets.constants.Function_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/widgets/constants/Function;),
      ];
    
    result["br.com.cweb.widgets.util.TypeFormatting/2149110565"] = [
        @br.com.cweb.widgets.util.TypeFormatting_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.widgets.util.TypeFormatting_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/widgets/util/TypeFormatting;),
      ];
    
    result["br.com.cweb.widgets.util.ValidationException/1713352715"] = [
        @br.com.cweb.widgets.util.ValidationException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.widgets.util.ValidationException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/widgets/util/ValidationException;),
      ];
    
    result["br.com.cweb.widgets.window.DefaultWindowConfig/2847093290"] = [
        @br.com.cweb.widgets.window.DefaultWindowConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @br.com.cweb.widgets.window.DefaultWindowConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lbr/com/cweb/widgets/window/DefaultWindowConfig;),
      ];
    
    result["com.extjs.gxt.ui.client.Style$AnchorPosition/3791543021"] = [
        @com.extjs.gxt.ui.client.Style_AnchorPosition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.Style_AnchorPosition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/Style$AnchorPosition;),
      ];
    
    result["com.extjs.gxt.ui.client.Style$AutoSizeMode/1628325995"] = [
        @com.extjs.gxt.ui.client.Style_AutoSizeMode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.Style_AutoSizeMode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/Style$AutoSizeMode;),
      ];
    
    result["com.extjs.gxt.ui.client.Style$ButtonArrowAlign/939200546"] = [
        @com.extjs.gxt.ui.client.Style_ButtonArrowAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.Style_ButtonArrowAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/Style$ButtonArrowAlign;),
      ];
    
    result["com.extjs.gxt.ui.client.Style$ButtonScale/2681928122"] = [
        @com.extjs.gxt.ui.client.Style_ButtonScale_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.Style_ButtonScale_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/Style$ButtonScale;),
      ];
    
    result["com.extjs.gxt.ui.client.Style$Direction/432614085"] = [
        @com.extjs.gxt.ui.client.Style_Direction_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.Style_Direction_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/Style$Direction;),
      ];
    
    result["com.extjs.gxt.ui.client.Style$HideMode/3524850165"] = [
        @com.extjs.gxt.ui.client.Style_HideMode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.Style_HideMode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/Style$HideMode;),
      ];
    
    result["com.extjs.gxt.ui.client.Style$HorizontalAlignment/1376617479"] = [
        @com.extjs.gxt.ui.client.Style_HorizontalAlignment_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.Style_HorizontalAlignment_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/Style$HorizontalAlignment;),
      ];
    
    result["com.extjs.gxt.ui.client.Style$IconAlign/2127438051"] = [
        @com.extjs.gxt.ui.client.Style_IconAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.Style_IconAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/Style$IconAlign;),
      ];
    
    result["com.extjs.gxt.ui.client.Style$LayoutRegion/2125781808"] = [
        @com.extjs.gxt.ui.client.Style_LayoutRegion_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.Style_LayoutRegion_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/Style$LayoutRegion;),
      ];
    
    result["com.extjs.gxt.ui.client.Style$Orientation/1688816558"] = [
        @com.extjs.gxt.ui.client.Style_Orientation_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.Style_Orientation_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/Style$Orientation;),
      ];
    
    result["com.extjs.gxt.ui.client.Style$Scroll/927846468"] = [
        @com.extjs.gxt.ui.client.Style_Scroll_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.Style_Scroll_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/Style$Scroll;),
      ];
    
    result["com.extjs.gxt.ui.client.Style$ScrollDir/4294106711"] = [
        @com.extjs.gxt.ui.client.Style_ScrollDir_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.Style_ScrollDir_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/Style$ScrollDir;),
      ];
    
    result["com.extjs.gxt.ui.client.Style$SelectionMode/1721996065"] = [
        @com.extjs.gxt.ui.client.Style_SelectionMode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.Style_SelectionMode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/Style$SelectionMode;),
      ];
    
    result["com.extjs.gxt.ui.client.Style$SortDir/640452531"] = [
        @com.extjs.gxt.ui.client.Style_SortDir_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.Style_SortDir_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/Style$SortDir;),
      ];
    
    result["com.extjs.gxt.ui.client.Style$VerticalAlignment/2743360252"] = [
        @com.extjs.gxt.ui.client.Style_VerticalAlignment_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.Style_VerticalAlignment_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/Style$VerticalAlignment;),
      ];
    
    result["com.extjs.gxt.ui.client.core.El$VisMode/2663458435"] = [
        @com.extjs.gxt.ui.client.core.El_VisMode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.core.El_VisMode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/core/El$VisMode;),
      ];
    
    result["com.extjs.gxt.ui.client.core.FastMap/3488076414"] = [
        @com.extjs.gxt.ui.client.core.FastMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.core.FastMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/core/FastMap;),
      ];
    
    result["com.extjs.gxt.ui.client.core.FastSet/2139705081"] = [
        @com.extjs.gxt.ui.client.core.FastSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.core.FastSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/core/FastSet;),
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig/47114578"] = [
        @com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseBooleanFilterConfig;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseBooleanFilterConfig;/1642589127"] = [
        @com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseBooleanFilterConfig;),
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseDateFilterConfig/4013643245"] = [
        @com.extjs.gxt.ui.client.data.BaseDateFilterConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseDateFilterConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseDateFilterConfig;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseDateFilterConfig;/2667437259"] = [
        @com.extjs.gxt.ui.client.data.BaseDateFilterConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseDateFilterConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseDateFilterConfig;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseFilterConfig;/3740213292"] = [
        @com.extjs.gxt.ui.client.data.BaseFilterConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseFilterConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseFilterConfig;),
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig/2138211457"] = [
        @com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseFilterPagingLoadConfig;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig;/34593227"] = [
        @com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseFilterPagingLoadConfig;),
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig/12264880"] = [
        @com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseGroupingLoadConfig;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseGroupingLoadConfig;/937164088"] = [
        @com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseGroupingLoadConfig;),
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseListFilterConfig/3409120418"] = [
        @com.extjs.gxt.ui.client.data.BaseListFilterConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseListFilterConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseListFilterConfig;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseListFilterConfig;/1641032626"] = [
        @com.extjs.gxt.ui.client.data.BaseListFilterConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseListFilterConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseListFilterConfig;),
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseListLoadConfig/2201172752"] = [
        @com.extjs.gxt.ui.client.data.BaseListLoadConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseListLoadConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseListLoadConfig;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseListLoadConfig;/3974160532"] = [
        @com.extjs.gxt.ui.client.data.BaseListLoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseListLoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseListLoadConfig;),
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseListLoadResult/756223242"] = [
        @com.extjs.gxt.ui.client.data.BaseListLoadResult_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseListLoadResult_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseListLoadResult;),
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseModel/405059268"] = [
        @com.extjs.gxt.ui.client.data.BaseModel_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseModel_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseModel;),
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseModelData/3541881726"] = [
        @com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseModelData;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseModelData;/1474801170"] = [
        @com.extjs.gxt.ui.client.data.BaseModelData_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseModelData_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseModelData;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseModel;/2011808370"] = [
        @com.extjs.gxt.ui.client.data.BaseModel_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseModel_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseModel;),
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseNumericFilterConfig/1870815159"] = [
        @com.extjs.gxt.ui.client.data.BaseNumericFilterConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseNumericFilterConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseNumericFilterConfig;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseNumericFilterConfig;/2888123402"] = [
        @com.extjs.gxt.ui.client.data.BaseNumericFilterConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseNumericFilterConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseNumericFilterConfig;),
      ];
    
    result["com.extjs.gxt.ui.client.data.BasePagingLoadConfig/2011366567"] = [
        @com.extjs.gxt.ui.client.data.BasePagingLoadConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BasePagingLoadConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BasePagingLoadConfig;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BasePagingLoadConfig;/2317712753"] = [
        @com.extjs.gxt.ui.client.data.BasePagingLoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BasePagingLoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BasePagingLoadConfig;),
      ];
    
    result["com.extjs.gxt.ui.client.data.BasePagingLoadResult/496878394"] = [
        @com.extjs.gxt.ui.client.data.BasePagingLoadResult_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BasePagingLoadResult_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BasePagingLoadResult;),
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig/312164525"] = [
        @com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseRemoteSortTreeLoadConfig;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig;/3584703654"] = [
        @com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseRemoteSortTreeLoadConfig;),
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseStringFilterConfig/2159604562"] = [
        @com.extjs.gxt.ui.client.data.BaseStringFilterConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseStringFilterConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseStringFilterConfig;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseStringFilterConfig;/1612961225"] = [
        @com.extjs.gxt.ui.client.data.BaseStringFilterConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseStringFilterConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseStringFilterConfig;),
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseTreeModel/629153380"] = [
        @com.extjs.gxt.ui.client.data.BaseTreeModel_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseTreeModel_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseTreeModel;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseTreeModel;/3798848776"] = [
        @com.extjs.gxt.ui.client.data.BaseTreeModel_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseTreeModel_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseTreeModel;),
      ];
    
    result["com.extjs.gxt.ui.client.data.BeanModel/158346479"] = [
        @com.extjs.gxt.ui.client.data.BeanModel_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BeanModel_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BeanModel;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BeanModel;/1738188982"] = [
        @com.extjs.gxt.ui.client.data.BeanModel_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BeanModel_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BeanModel;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.FilterConfig;/1920562560"] = [
        @com.extjs.gxt.ui.client.data.FilterConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.FilterConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/FilterConfig;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.FilterPagingLoadConfig;/764130373"] = [
        @com.extjs.gxt.ui.client.data.FilterPagingLoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.FilterPagingLoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/FilterPagingLoadConfig;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.GroupingLoadConfig;/2566816166"] = [
        @com.extjs.gxt.ui.client.data.GroupingLoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.GroupingLoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/GroupingLoadConfig;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.ListLoadConfig;/4056684818"] = [
        @com.extjs.gxt.ui.client.data.ListLoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.ListLoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/ListLoadConfig;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.LoadConfig;/305088416"] = [
        @com.extjs.gxt.ui.client.data.LoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.LoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/LoadConfig;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.ModelData;/1278407794"] = [
        @com.extjs.gxt.ui.client.data.ModelData_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.ModelData_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/ModelData;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.Model;/2864064799"] = [
        @com.extjs.gxt.ui.client.data.Model_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.Model_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/Model;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.PagingLoadConfig;/3362861869"] = [
        @com.extjs.gxt.ui.client.data.PagingLoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.PagingLoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/PagingLoadConfig;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.RemoteSortTreeLoadConfig;/837711618"] = [
        @com.extjs.gxt.ui.client.data.RemoteSortTreeLoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.RemoteSortTreeLoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/RemoteSortTreeLoadConfig;),
      ];
    
    result["com.extjs.gxt.ui.client.data.RpcMap/3441186752"] = [
        @com.extjs.gxt.ui.client.data.RpcMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.RpcMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/RpcMap;),
      ];
    
    result["com.extjs.gxt.ui.client.data.SortInfo/1143517771"] = [
        @com.extjs.gxt.ui.client.data.SortInfo_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.SortInfo_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/SortInfo;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.TreeModel;/4230972141"] = [
        @com.extjs.gxt.ui.client.data.TreeModel_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.TreeModel_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/TreeModel;),
      ];
    
    result["com.extjs.gxt.ui.client.dnd.DND$Feedback/2260779886"] = [
        @com.extjs.gxt.ui.client.dnd.DND_Feedback_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.dnd.DND_Feedback_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/dnd/DND$Feedback;),
      ];
    
    result["com.extjs.gxt.ui.client.dnd.DND$Operation/1345587808"] = [
        @com.extjs.gxt.ui.client.dnd.DND_Operation_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.dnd.DND_Operation_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/dnd/DND$Operation;),
      ];
    
    result["com.extjs.gxt.ui.client.dnd.DND$TreeSource/3162796664"] = [
        @com.extjs.gxt.ui.client.dnd.DND_TreeSource_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.dnd.DND_TreeSource_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/dnd/DND$TreeSource;),
      ];
    
    result["com.extjs.gxt.ui.client.event.EventType/1920152450"] = [
        @com.extjs.gxt.ui.client.event.EventType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.event.EventType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/event/EventType;),
      ];
    
    result["com.extjs.gxt.ui.client.fx.Resizable$Dir/829821481"] = [
        @com.extjs.gxt.ui.client.fx.Resizable_Dir_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.fx.Resizable_Dir_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/fx/Resizable$Dir;),
      ];
    
    result["com.extjs.gxt.ui.client.store.Record$RecordUpdate/464014577"] = [
        @com.extjs.gxt.ui.client.store.Record_RecordUpdate_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.store.Record_RecordUpdate_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/store/Record$RecordUpdate;),
      ];
    
    result["com.extjs.gxt.ui.client.util.DateWrapper$Unit/1117854696"] = [
        @com.extjs.gxt.ui.client.util.DateWrapper_Unit_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.util.DateWrapper_Unit_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/util/DateWrapper$Unit;),
      ];
    
    result["com.extjs.gxt.ui.client.util.Theme/903569106"] = [
        @com.extjs.gxt.ui.client.util.Theme_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.util.Theme_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/util/Theme;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.util.Theme;/2769591727"] = [
        @com.extjs.gxt.ui.client.util.Theme_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.util.Theme_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/util/Theme;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.Layer$ShadowPosition/1144660880"] = [
        @com.extjs.gxt.ui.client.widget.Layer_ShadowPosition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.Layer_ShadowPosition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/Layer$ShadowPosition;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.MessageBox$MessageBoxType/2970822448"] = [
        @com.extjs.gxt.ui.client.widget.MessageBox_MessageBoxType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.MessageBox_MessageBoxType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/MessageBox$MessageBoxType;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.TabPanel$TabPosition/1712079161"] = [
        @com.extjs.gxt.ui.client.widget.TabPanel_TabPosition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.TabPanel_TabPosition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/TabPanel$TabPosition;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.flash.FlashComponent$WMode/851095583"] = [
        @com.extjs.gxt.ui.client.widget.flash.FlashComponent_WMode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.flash.FlashComponent_WMode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/flash/FlashComponent$WMode;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.form.ComboBox$TriggerAction/856435210"] = [
        @com.extjs.gxt.ui.client.widget.form.ComboBox_TriggerAction_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.form.ComboBox_TriggerAction_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/form/ComboBox$TriggerAction;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.form.DualListField$Mode/321248023"] = [
        @com.extjs.gxt.ui.client.widget.form.DualListField_Mode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.form.DualListField_Mode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/form/DualListField$Mode;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.form.FormPanel$Encoding/1255136613"] = [
        @com.extjs.gxt.ui.client.widget.form.FormPanel_Encoding_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.form.FormPanel_Encoding_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/form/FormPanel$Encoding;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.form.FormPanel$LabelAlign/2499805453"] = [
        @com.extjs.gxt.ui.client.widget.form.FormPanel_LabelAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.form.FormPanel_LabelAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/form/FormPanel$LabelAlign;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.form.FormPanel$Method/3806475933"] = [
        @com.extjs.gxt.ui.client.widget.form.FormPanel_Method_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.form.FormPanel_Method_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/form/FormPanel$Method;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.form.SimpleComboValue/150969862"] = [
        @com.extjs.gxt.ui.client.widget.form.SimpleComboValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.form.SimpleComboValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/form/SimpleComboValue;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.widget.form.SimpleComboValue;/2952812979"] = [
        @com.extjs.gxt.ui.client.widget.form.SimpleComboValue_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.form.SimpleComboValue_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/widget/form/SimpleComboValue;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.form.Time/415600523"] = [
        @com.extjs.gxt.ui.client.widget.form.Time_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.form.Time_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/form/Time;),
      ];
    
    result["[Lcom.extjs.gxt.ui.client.widget.form.Time;/3588548357"] = [
        @com.extjs.gxt.ui.client.widget.form.Time_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.form.Time_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/widget/form/Time;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.grid.EditorGrid$ClicksToEdit/2626966747"] = [
        @com.extjs.gxt.ui.client.widget.grid.EditorGrid_ClicksToEdit_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.grid.EditorGrid_ClicksToEdit_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/grid/EditorGrid$ClicksToEdit;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.grid.filters.RangeMenu$RangeItem/2590574067"] = [
        @com.extjs.gxt.ui.client.widget.grid.filters.RangeMenu_RangeItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.grid.filters.RangeMenu_RangeItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/grid/filters/RangeMenu$RangeItem;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.layout.BoxLayout$BoxLayoutPack/3990108502"] = [
        @com.extjs.gxt.ui.client.widget.layout.BoxLayout_BoxLayoutPack_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.layout.BoxLayout_BoxLayoutPack_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/layout/BoxLayout$BoxLayoutPack;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.layout.HBoxLayout$HBoxLayoutAlign/656667609"] = [
        @com.extjs.gxt.ui.client.widget.layout.HBoxLayout_HBoxLayoutAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.layout.HBoxLayout_HBoxLayoutAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/layout/HBoxLayout$HBoxLayoutAlign;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.layout.VBoxLayout$VBoxLayoutAlign/3731435873"] = [
        @com.extjs.gxt.ui.client.widget.layout.VBoxLayout_VBoxLayoutAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.layout.VBoxLayout_VBoxLayoutAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/layout/VBoxLayout$VBoxLayoutAlign;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.tree.Tree$CheckCascade/796662336"] = [
        @com.extjs.gxt.ui.client.widget.tree.Tree_CheckCascade_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.tree.Tree_CheckCascade_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/tree/Tree$CheckCascade;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.tree.Tree$CheckNodes/2231532982"] = [
        @com.extjs.gxt.ui.client.widget.tree.Tree_CheckNodes_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.tree.Tree_CheckNodes_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/tree/Tree$CheckNodes;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.tree.Tree$Joint/1395293110"] = [
        @com.extjs.gxt.ui.client.widget.tree.Tree_Joint_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.tree.Tree_Joint_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/tree/Tree$Joint;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.treepanel.TreePanel$CheckCascade/3474775907"] = [
        @com.extjs.gxt.ui.client.widget.treepanel.TreePanel_CheckCascade_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.treepanel.TreePanel_CheckCascade_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/treepanel/TreePanel$CheckCascade;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.treepanel.TreePanel$CheckNodes/2045789707"] = [
        @com.extjs.gxt.ui.client.widget.treepanel.TreePanel_CheckNodes_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.treepanel.TreePanel_CheckNodes_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/treepanel/TreePanel$CheckNodes;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.treepanel.TreePanel$Joint/3859171004"] = [
        @com.extjs.gxt.ui.client.widget.treepanel.TreePanel_Joint_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.treepanel.TreePanel_Joint_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/treepanel/TreePanel$Joint;),
      ];
    
    result["com.extjs.gxt.ui.client.widget.treepanel.TreePanelView$TreeViewRenderMode/4266382970"] = [
        @com.extjs.gxt.ui.client.widget.treepanel.TreePanelView_TreeViewRenderMode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.treepanel.TreePanelView_TreeViewRenderMode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/treepanel/TreePanelView$TreeViewRenderMode;),
      ];
    
    result["com.google.gwt.canvas.dom.client.Context2d$Composite/3412511209"] = [
        @com.google.gwt.canvas.dom.client.Context2d_Composite_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.canvas.dom.client.Context2d_Composite_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/canvas/dom/client/Context2d$Composite;),
      ];
    
    result["com.google.gwt.canvas.dom.client.Context2d$LineCap/4137629416"] = [
        @com.google.gwt.canvas.dom.client.Context2d_LineCap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.canvas.dom.client.Context2d_LineCap_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/canvas/dom/client/Context2d$LineCap;),
      ];
    
    result["com.google.gwt.canvas.dom.client.Context2d$LineJoin/773759908"] = [
        @com.google.gwt.canvas.dom.client.Context2d_LineJoin_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.canvas.dom.client.Context2d_LineJoin_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/canvas/dom/client/Context2d$LineJoin;),
      ];
    
    result["com.google.gwt.canvas.dom.client.Context2d$Repetition/200032891"] = [
        @com.google.gwt.canvas.dom.client.Context2d_Repetition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.canvas.dom.client.Context2d_Repetition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/canvas/dom/client/Context2d$Repetition;),
      ];
    
    result["com.google.gwt.canvas.dom.client.Context2d$TextAlign/96304101"] = [
        @com.google.gwt.canvas.dom.client.Context2d_TextAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.canvas.dom.client.Context2d_TextAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/canvas/dom/client/Context2d$TextAlign;),
      ];
    
    result["com.google.gwt.canvas.dom.client.Context2d$TextBaseline/1387606880"] = [
        @com.google.gwt.canvas.dom.client.Context2d_TextBaseline_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.canvas.dom.client.Context2d_TextBaseline_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/canvas/dom/client/Context2d$TextBaseline;),
      ];
    
    result["com.google.gwt.core.client.CodeDownloadException$Reason/4099226274"] = [
        @com.google.gwt.core.client.CodeDownloadException_Reason_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.core.client.CodeDownloadException_Reason_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/core/client/CodeDownloadException$Reason;),
      ];
    
    result["com.google.gwt.core.client.impl.SerializableThrowable/3336179259"] = [
        @com.google.gwt.core.client.impl.SerializableThrowable_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.core.client.impl.SerializableThrowable_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/core/client/impl/SerializableThrowable;),
      ];
    
    result["com.google.gwt.dom.client.Style$BorderStyle/2769837833"] = [
        @com.google.gwt.dom.client.Style_BorderStyle_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_BorderStyle_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$BorderStyle;),
      ];
    
    result["com.google.gwt.dom.client.Style$Cursor/2666657890"] = [
        @com.google.gwt.dom.client.Style_Cursor_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_Cursor_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$Cursor;),
      ];
    
    result["com.google.gwt.dom.client.Style$Display/1537475515"] = [
        @com.google.gwt.dom.client.Style_Display_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_Display_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$Display;),
      ];
    
    result["com.google.gwt.dom.client.Style$Float/1495215860"] = [
        @com.google.gwt.dom.client.Style_Float_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_Float_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$Float;),
      ];
    
    result["com.google.gwt.dom.client.Style$FontStyle/2182768286"] = [
        @com.google.gwt.dom.client.Style_FontStyle_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_FontStyle_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$FontStyle;),
      ];
    
    result["com.google.gwt.dom.client.Style$FontWeight/3557458763"] = [
        @com.google.gwt.dom.client.Style_FontWeight_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_FontWeight_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$FontWeight;),
      ];
    
    result["com.google.gwt.dom.client.Style$ListStyleType/1064239610"] = [
        @com.google.gwt.dom.client.Style_ListStyleType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_ListStyleType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$ListStyleType;),
      ];
    
    result["com.google.gwt.dom.client.Style$Overflow/982122884"] = [
        @com.google.gwt.dom.client.Style_Overflow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_Overflow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$Overflow;),
      ];
    
    result["com.google.gwt.dom.client.Style$Position/548017857"] = [
        @com.google.gwt.dom.client.Style_Position_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_Position_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$Position;),
      ];
    
    result["com.google.gwt.dom.client.Style$TableLayout/1430616401"] = [
        @com.google.gwt.dom.client.Style_TableLayout_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_TableLayout_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$TableLayout;),
      ];
    
    result["com.google.gwt.dom.client.Style$TextDecoration/3846779252"] = [
        @com.google.gwt.dom.client.Style_TextDecoration_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_TextDecoration_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$TextDecoration;),
      ];
    
    result["com.google.gwt.dom.client.Style$Unit/269426519"] = [
        @com.google.gwt.dom.client.Style_Unit_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_Unit_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$Unit;),
      ];
    
    result["com.google.gwt.dom.client.Style$VerticalAlign/352429624"] = [
        @com.google.gwt.dom.client.Style_VerticalAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_VerticalAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$VerticalAlign;),
      ];
    
    result["com.google.gwt.dom.client.Style$Visibility/1861510052"] = [
        @com.google.gwt.dom.client.Style_Visibility_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_Visibility_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$Visibility;),
      ];
    
    result["com.google.gwt.event.shared.UmbrellaException/3104463596"] = [
        @com.google.gwt.event.shared.UmbrellaException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.event.shared.UmbrellaException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/event/shared/UmbrellaException;),
      ];
    
    result["com.google.gwt.http.client.RequestException/190587325"] = [
        @com.google.gwt.http.client.RequestException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.http.client.RequestException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/http/client/RequestException;),
      ];
    
    result["com.google.gwt.i18n.client.DateTimeFormat$PredefinedFormat/229723443"] = [
        @com.google.gwt.i18n.client.DateTimeFormat_PredefinedFormat_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.i18n.client.DateTimeFormat_PredefinedFormat_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/i18n/client/DateTimeFormat$PredefinedFormat;),
      ];
    
    result["com.google.gwt.i18n.client.HasDirection$Direction/1284232723"] = [
        @com.google.gwt.i18n.client.HasDirection_Direction_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.i18n.client.HasDirection_Direction_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/i18n/client/HasDirection$Direction;),
      ];
    
    result["com.google.gwt.i18n.client.impl.DateRecord/3220471373"] = [
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/i18n/client/impl/DateRecord;),
      ];
    
    result["[Lcom.google.gwt.i18n.client.impl.DateRecord;/1800624538"] = [
        @com.google.gwt.i18n.client.impl.DateRecord_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.i18n.client.impl.DateRecord_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/google/gwt/i18n/client/impl/DateRecord;),
      ];
    
    result["com.google.gwt.json.client.JSONException/2941795468"] = [
        @com.google.gwt.json.client.JSONException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.json.client.JSONException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/json/client/JSONException;),
      ];
    
    result["com.google.gwt.jsonp.client.TimeoutException/1112787596"] = [
        @com.google.gwt.jsonp.client.TimeoutException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.jsonp.client.TimeoutException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/jsonp/client/TimeoutException;),
      ];
    
    result["com.google.gwt.layout.client.Layout$Alignment/1758648740"] = [
        @com.google.gwt.layout.client.Layout_Alignment_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.layout.client.Layout_Alignment_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/layout/client/Layout$Alignment;),
      ];
    
    result["com.google.gwt.resources.client.ImageResource$RepeatStyle/2798118115"] = [
        @com.google.gwt.resources.client.ImageResource_RepeatStyle_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.resources.client.ImageResource_RepeatStyle_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/resources/client/ImageResource$RepeatStyle;),
      ];
    
    result["com.google.gwt.safecss.shared.SafeStylesString/1334499262"] = [
        @com.google.gwt.safecss.shared.SafeStylesString_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.safecss.shared.SafeStylesString_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/safecss/shared/SafeStylesString;),
      ];
    
    result["com.google.gwt.safehtml.shared.SafeHtmlString/235635043"] = [
        @com.google.gwt.safehtml.shared.SafeHtmlString_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.safehtml.shared.SafeHtmlString_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/safehtml/shared/SafeHtmlString;),
      ];
    
    result["com.google.gwt.user.cellview.client.HasKeyboardPagingPolicy$KeyboardPagingPolicy/3115114274"] = [
        @com.google.gwt.user.cellview.client.HasKeyboardPagingPolicy_KeyboardPagingPolicy_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.cellview.client.HasKeyboardPagingPolicy_KeyboardPagingPolicy_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/cellview/client/HasKeyboardPagingPolicy$KeyboardPagingPolicy;),
      ];
    
    result["com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy$KeyboardSelectionPolicy/2212535585"] = [
        @com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy_KeyboardSelectionPolicy_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy_KeyboardSelectionPolicy_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/cellview/client/HasKeyboardSelectionPolicy$KeyboardSelectionPolicy;),
      ];
    
    result["com.google.gwt.user.cellview.client.SimplePager$TextLocation/844327705"] = [
        @com.google.gwt.user.cellview.client.SimplePager_TextLocation_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.cellview.client.SimplePager_TextLocation_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/cellview/client/SimplePager$TextLocation;),
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
    
    result["com.google.gwt.user.client.rpc.SerializableException/3047383460"] = [
        @com.google.gwt.user.client.rpc.SerializableException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.SerializableException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/SerializableException;),
      ];
    
    result["com.google.gwt.user.client.rpc.SerializationException/2836333220"] = [
        @com.google.gwt.user.client.rpc.SerializationException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.SerializationException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/SerializationException;),
      ];
    
    result["com.google.gwt.user.client.rpc.ServiceDefTarget$NoServiceEntryPointSpecifiedException/3408313447"] = [
        @com.google.gwt.user.client.rpc.ServiceDefTarget_NoServiceEntryPointSpecifiedException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.ServiceDefTarget_NoServiceEntryPointSpecifiedException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/ServiceDefTarget$NoServiceEntryPointSpecifiedException;),
      ];
    
    result["com.google.gwt.user.client.rpc.XsrfToken/4254043109"] = [
        @com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/XsrfToken;),
        @com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/XsrfToken;)
      ];
    
    result["com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter$ResponseReader/3885798731"] = [
        @com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter_ResponseReader_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter_ResponseReader_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/impl/RequestCallbackAdapter$ResponseReader;),
      ];
    
    result["com.google.gwt.user.client.ui.ChangeListenerCollection/287642957"] = [
        @com.google.gwt.user.client.ui.ChangeListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.ChangeListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/ChangeListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.ClickListenerCollection/2152455986"] = [
        @com.google.gwt.user.client.ui.ClickListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.ClickListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/ClickListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.DockLayoutPanel$Direction/1124902987"] = [
        @com.google.gwt.user.client.ui.DockLayoutPanel_Direction_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.DockLayoutPanel_Direction_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/DockLayoutPanel$Direction;),
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
    
    result["com.google.gwt.user.client.ui.MultiWordSuggestOracle$MultiWordSuggestion/2803420099"] = [
        @com.google.gwt.user.client.ui.MultiWordSuggestOracle_MultiWordSuggestion_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.MultiWordSuggestOracle_MultiWordSuggestion_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/MultiWordSuggestOracle$MultiWordSuggestion;),
      ];
    
    result["[Lcom.google.gwt.user.client.ui.MultiWordSuggestOracle$MultiWordSuggestion;/1531882420"] = [
        @com.google.gwt.user.client.ui.MultiWordSuggestOracle_MultiWordSuggestion_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.MultiWordSuggestOracle_MultiWordSuggestion_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/google/gwt/user/client/ui/MultiWordSuggestOracle$MultiWordSuggestion;),
      ];
    
    result["com.google.gwt.user.client.ui.PopupListenerCollection/1920131050"] = [
        @com.google.gwt.user.client.ui.PopupListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.PopupListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/PopupListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.PopupPanel$AnimationType/2686977168"] = [
        @com.google.gwt.user.client.ui.PopupPanel_AnimationType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.PopupPanel_AnimationType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/PopupPanel$AnimationType;),
      ];
    
    result["com.google.gwt.user.client.ui.ScrollListenerCollection/210686268"] = [
        @com.google.gwt.user.client.ui.ScrollListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.ScrollListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/ScrollListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.SuggestOracle$Request/3707347745"] = [
        @com.google.gwt.user.client.ui.SuggestOracle_Request_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.SuggestOracle_Request_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/SuggestOracle$Request;),
      ];
    
    result["com.google.gwt.user.client.ui.SuggestOracle$Response/3840253928"] = [
        @com.google.gwt.user.client.ui.SuggestOracle_Response_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.SuggestOracle_Response_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/SuggestOracle$Response;),
      ];
    
    result["[Lcom.google.gwt.user.client.ui.SuggestOracle$Suggestion;/3224244884"] = [
        @com.google.gwt.user.client.ui.SuggestOracle_Suggestion_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.SuggestOracle_Suggestion_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/google/gwt/user/client/ui/SuggestOracle$Suggestion;),
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
    
    result["com.google.gwt.user.client.ui.ValueBoxBase$TextAlignment/3036099298"] = [
        @com.google.gwt.user.client.ui.ValueBoxBase_TextAlignment_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.ValueBoxBase_TextAlignment_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/ValueBoxBase$TextAlignment;),
      ];
    
    result["com.google.gwt.view.client.DefaultSelectionEventManager$SelectAction/3096171525"] = [
        @com.google.gwt.view.client.DefaultSelectionEventManager_SelectAction_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.view.client.DefaultSelectionEventManager_SelectAction_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/view/client/DefaultSelectionEventManager$SelectAction;),
      ];
    
    result["com.google.gwt.view.client.Range/1471336945"] = [
        @com.google.gwt.view.client.Range_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.view.client.Range_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/view/client/Range;),
      ];
    
    result["com.google.gwt.xml.client.impl.DOMParseException/3799120635"] = [
        @com.google.gwt.xml.client.impl.DOMParseException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.xml.client.impl.DOMParseException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/xml/client/impl/DOMParseException;),
      ];
    
    result["com.google.web.bindery.event.shared.UmbrellaException/1025846929"] = [
        @com.google.web.bindery.event.shared.UmbrellaException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.web.bindery.event.shared.UmbrellaException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/web/bindery/event/shared/UmbrellaException;),
      ];
    
    result["java.io.IOException/1159940531"] = [
        @com.google.gwt.user.client.rpc.core.java.io.IOException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.io.IOException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/io/IOException;),
      ];
    
    result["java.io.UnsupportedEncodingException/1526756933"] = [
        @com.google.gwt.user.client.rpc.core.java.io.UnsupportedEncodingException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.io.UnsupportedEncodingException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/io/UnsupportedEncodingException;),
      ];
    
    result["java.lang.ArithmeticException/1539622151"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.ArithmeticException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.ArithmeticException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/ArithmeticException;),
      ];
    
    result["java.lang.ArrayIndexOutOfBoundsException/600550433"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.ArrayIndexOutOfBoundsException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.ArrayIndexOutOfBoundsException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/ArrayIndexOutOfBoundsException;),
      ];
    
    result["java.lang.ArrayStoreException/3540507190"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.ArrayStoreException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.ArrayStoreException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/ArrayStoreException;),
      ];
    
    result["java.lang.AssertionError/3490171458"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.AssertionError_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.AssertionError_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/AssertionError;),
      ];
    
    result["java.lang.Boolean/476441737"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Boolean;),
      ];
    
    result["[Ljava.lang.Boolean;/2507200464"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Boolean;),
      ];
    
    result["java.lang.Byte/1571082439"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Byte;),
      ];
    
    result["[Ljava.lang.Byte;/3053163818"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Byte_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Byte_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Byte;),
      ];
    
    result["java.lang.Character/2663399736"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Character;),
      ];
    
    result["java.lang.ClassCastException/702295179"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.ClassCastException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.ClassCastException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/ClassCastException;),
      ];
    
    result["java.lang.Double/858496421"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Double;),
      ];
    
    result["[Ljava.lang.Double;/2857560407"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Double_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Double_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Double;),
      ];
    
    result["java.lang.Error/1331973429"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Error_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Error_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Error;),
      ];
    
    result["java.lang.Exception/1920171873"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Exception;),
        @com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Exception;)
      ];
    
    result["java.lang.Float/1718559123"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Float;),
      ];
    
    result["[Ljava.lang.Float;/3956181278"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Float_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Float_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Float;),
      ];
    
    result["java.lang.IllegalArgumentException/1755012560"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.IllegalArgumentException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.IllegalArgumentException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/IllegalArgumentException;),
      ];
    
    result["java.lang.IllegalStateException/1972187323"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.IllegalStateException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.IllegalStateException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/IllegalStateException;),
      ];
    
    result["java.lang.IndexOutOfBoundsException/2489527753"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.IndexOutOfBoundsException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.IndexOutOfBoundsException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/IndexOutOfBoundsException;),
      ];
    
    result["java.lang.Integer/3438268394"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Integer;),
      ];
    
    result["[Ljava.lang.Integer;/1574882222"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Integer;),
      ];
    
    result["java.lang.Long/4227064769"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Long;),
      ];
    
    result["[Ljava.lang.Long;/97727328"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Long_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Long;),
      ];
    
    result["java.lang.NegativeArraySizeException/3846860241"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.NegativeArraySizeException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.NegativeArraySizeException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/NegativeArraySizeException;),
      ];
    
    result["java.lang.NullPointerException/1463492344"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.NullPointerException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.NullPointerException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/NullPointerException;),
      ];
    
    result["java.lang.NumberFormatException/3305228476"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.NumberFormatException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.NumberFormatException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/NumberFormatException;),
      ];
    
    result["java.lang.RuntimeException/515124647"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/RuntimeException;),
        @com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/RuntimeException;)
      ];
    
    result["java.lang.Short/551743396"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Short;),
      ];
    
    result["[Ljava.lang.Short;/3779901635"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Short_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Short_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Short;),
      ];
    
    result["java.lang.StackTraceElement/455763907"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/StackTraceElement;),
      ];
    
    result["[Ljava.lang.StackTraceElement;/3867167983"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/StackTraceElement;),
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["java.lang.StringIndexOutOfBoundsException/500777603"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.StringIndexOutOfBoundsException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.StringIndexOutOfBoundsException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/StringIndexOutOfBoundsException;),
      ];
    
    result["[Ljava.lang.String;/2600011424"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/String;),
      ];
    
    result["java.lang.Throwable/2953622131"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Throwable_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Throwable_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Throwable;),
        @com.google.gwt.user.client.rpc.core.java.lang.Throwable_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Throwable;)
      ];
    
    result["java.lang.UnsupportedOperationException/3744010015"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.UnsupportedOperationException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.UnsupportedOperationException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/UnsupportedOperationException;),
      ];
    
    result["java.lang.Void/2139725816"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Void_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Void_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Void;),
      ];
    
    result["java.lang.annotation.AnnotationFormatError/2257184627"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationFormatError_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationFormatError_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/annotation/AnnotationFormatError;),
      ];
    
    result["java.lang.annotation.AnnotationTypeMismatchException/976205828"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationTypeMismatchException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationTypeMismatchException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/annotation/AnnotationTypeMismatchException;),
      ];
    
    result["java.lang.annotation.ElementType/15413163"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.ElementType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.ElementType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/annotation/ElementType;),
      ];
    
    result["java.lang.annotation.RetentionPolicy/1244130522"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.RetentionPolicy_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.RetentionPolicy_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/annotation/RetentionPolicy;),
      ];
    
    result["java.math.BigDecimal/8151472"] = [
        @com.google.gwt.user.client.rpc.core.java.math.BigDecimal_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.math.BigDecimal_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/math/BigDecimal;),
      ];
    
    result["java.math.BigInteger/927293797"] = [
        @com.google.gwt.user.client.rpc.core.java.math.BigInteger_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.math.BigInteger_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/math/BigInteger;),
      ];
    
    result["java.math.MathContext/1014811437"] = [
        @com.google.gwt.user.client.rpc.core.java.math.MathContext_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.math.MathContext_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/math/MathContext;),
      ];
    
    result["java.math.RoundingMode/2365096428"] = [
        @com.google.gwt.user.client.rpc.core.java.math.RoundingMode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.math.RoundingMode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/math/RoundingMode;),
      ];
    
    result["java.security.DigestException/629316798"] = [
        @com.google.gwt.user.client.rpc.core.java.security.DigestException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.security.DigestException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/security/DigestException;),
      ];
    
    result["java.security.GeneralSecurityException/2669239907"] = [
        @com.google.gwt.user.client.rpc.core.java.security.GeneralSecurityException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.security.GeneralSecurityException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/security/GeneralSecurityException;),
      ];
    
    result["java.security.NoSuchAlgorithmException/2892037213"] = [
        @com.google.gwt.user.client.rpc.core.java.security.NoSuchAlgorithmException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.security.NoSuchAlgorithmException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/security/NoSuchAlgorithmException;),
      ];
    
    result["java.sql.Date/730999118"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Date;),
      ];
    
    result["[Ljava.sql.Date;/177260296"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Date_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/sql/Date;),
      ];
    
    result["java.sql.Time/1816797103"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Time;),
      ];
    
    result["[Ljava.sql.Time;/1999508513"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Time_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/sql/Time;),
      ];
    
    result["java.sql.Timestamp/3040052672"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Timestamp;),
      ];
    
    result["[Ljava.sql.Timestamp;/1038705795"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/sql/Timestamp;),
      ];
    
    result["java.util.ArrayList/4159755760"] = [
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/ArrayList;),
      ];
    
    result["java.util.Arrays$ArrayList/2507071751"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
      ];
    
    result["java.util.Collections$EmptyList/4157118744"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
      ];
    
    result["java.util.Collections$EmptyMap/4174664486"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Map;),
      ];
    
    result["java.util.Collections$EmptySet/3523698179"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Set;),
      ];
    
    result["java.util.Collections$SingletonList/1586180994"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
      ];
    
    result["java.util.ConcurrentModificationException/2717383897"] = [
        @com.google.gwt.user.client.rpc.core.java.util.ConcurrentModificationException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.ConcurrentModificationException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/ConcurrentModificationException;),
      ];
    
    result["java.util.Date/3385151746"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Date;),
      ];
    
    result["[Ljava.util.Date;/3768760277"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Date_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/util/Date;),
      ];
    
    result["java.util.EmptyStackException/89438517"] = [
        @com.google.gwt.user.client.rpc.core.java.util.EmptyStackException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.EmptyStackException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/EmptyStackException;),
      ];
    
    result["java.util.HashMap/1797211028"] = [
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashMap;),
      ];
    
    result["java.util.HashSet/3273092938"] = [
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashSet;),
      ];
    
    result["java.util.IdentityHashMap/1839153020"] = [
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/IdentityHashMap;),
      ];
    
    result["java.util.LinkedHashMap/3008245022"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashMap;),
      ];
    
    result["java.util.LinkedHashSet/1826081506"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashSet;),
      ];
    
    result["java.util.LinkedList/3953877921"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedList;),
      ];
    
    result["java.util.NoSuchElementException/1559248883"] = [
        @com.google.gwt.user.client.rpc.core.java.util.NoSuchElementException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.NoSuchElementException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/NoSuchElementException;),
      ];
    
    result["java.util.Stack/1346942793"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Stack;),
      ];
    
    result["java.util.TooManyListenersException/2023078032"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TooManyListenersException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TooManyListenersException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TooManyListenersException;),
      ];
    
    result["java.util.TreeMap/1493889780"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeMap;),
      ];
    
    result["java.util.TreeSet/4043497002"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeSet;),
      ];
    
    result["java.util.Vector/3057315478"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Vector;),
      ];
    
    result["java.util.logging.Level/2839552483"] = [
        @com.google.gwt.user.client.rpc.core.java.util.logging.Level_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.logging.Level_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/logging/Level;),
      ];
    
    result["java.util.logging.LogRecord/2492345967"] = [
        @com.google.gwt.user.client.rpc.core.java.util.logging.LogRecord_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.logging.LogRecord_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/logging/LogRecord;),
      ];
    
    result["javax.validation.ConstraintDeclarationException/3610544007"] = [
        @com.google.gwt.user.client.rpc.core.javax.validation.ConstraintDeclarationException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.javax.validation.ConstraintDeclarationException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljavax/validation/ConstraintDeclarationException;),
      ];
    
    result["javax.validation.ConstraintDefinitionException/3732439488"] = [
        @com.google.gwt.user.client.rpc.core.javax.validation.ConstraintDefinitionException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.javax.validation.ConstraintDefinitionException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljavax/validation/ConstraintDefinitionException;),
      ];
    
    result["javax.validation.ConstraintViolationException/173345760"] = [
        @javax.validation.ConstraintViolationException_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @javax.validation.ConstraintViolationException_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljavax/validation/ConstraintViolationException;),
      ];
    
    result["javax.validation.GroupDefinitionException/4024780846"] = [
        @com.google.gwt.user.client.rpc.core.javax.validation.GroupDefinitionException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.javax.validation.GroupDefinitionException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljavax/validation/GroupDefinitionException;),
      ];
    
    result["javax.validation.UnexpectedTypeException/593026390"] = [
        @com.google.gwt.user.client.rpc.core.javax.validation.UnexpectedTypeException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.javax.validation.UnexpectedTypeException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljavax/validation/UnexpectedTypeException;),
      ];
    
    result["javax.validation.ValidationException/1570221831"] = [
        @com.google.gwt.user.client.rpc.core.javax.validation.ValidationException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.javax.validation.ValidationException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljavax/validation/ValidationException;),
      ];
    
    result["javax.validation.constraints.Pattern$Flag/3133410044"] = [
        @com.google.gwt.user.client.rpc.core.javax.validation.constraints.Pattern_Flag_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.javax.validation.constraints.Pattern_Flag_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljavax/validation/constraints/Pattern$Flag;),
      ];
    
    result["javax.validation.metadata.Scope/4054088630"] = [
        @com.google.gwt.user.client.rpc.core.javax.validation.metadata.Scope_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.javax.validation.metadata.Scope_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljavax/validation/metadata/Scope;),
      ];
    
    return result;
  }-*/;
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar::class)] = "br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar/2808529220";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.Atribuicao::class)] = "br.com.cweb.cadastro.persistence.entity.Atribuicao/2358068784";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.Cidade::class)] = "br.com.cweb.cadastro.persistence.entity.Cidade/1159706616";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.Cidade[]::class)] = "[Lbr.com.cweb.cadastro.persistence.entity.Cidade;/3695592329";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.ContaBancaria::class)] = "br.com.cweb.cadastro.persistence.entity.ContaBancaria/1963720608";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.ContaBancaria[]::class)] = "[Lbr.com.cweb.cadastro.persistence.entity.ContaBancaria;/2479143526";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.Convenio::class)] = "br.com.cweb.cadastro.persistence.entity.Convenio/2257975695";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.Endereco::class)] = "br.com.cweb.cadastro.persistence.entity.Endereco/1109738307";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.Endereco[]::class)] = "[Lbr.com.cweb.cadastro.persistence.entity.Endereco;/4233337058";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.Estado::class)] = "br.com.cweb.cadastro.persistence.entity.Estado/377296711";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira::class)] = "br.com.cweb.cadastro.persistence.entity.InstituicaoFinanceira/3001789167";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.PerfilComissao::class)] = "br.com.cweb.cadastro.persistence.entity.PerfilComissao/555920445";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.Pessoa::class)] = "br.com.cweb.cadastro.persistence.entity.Pessoa/4040299406";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.PessoaFisica::class)] = "br.com.cweb.cadastro.persistence.entity.PessoaFisica/71683337";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica::class)] = "br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica/660816837";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.PessoaFisica[]::class)] = "[Lbr.com.cweb.cadastro.persistence.entity.PessoaFisica;/2949029722";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.PessoaJuridica::class)] = "br.com.cweb.cadastro.persistence.entity.PessoaJuridica/2581919241";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.PessoaJuridica[]::class)] = "[Lbr.com.cweb.cadastro.persistence.entity.PessoaJuridica;/3761416939";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.Pessoa[]::class)] = "[Lbr.com.cweb.cadastro.persistence.entity.Pessoa;/1930767873";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.TipoConta::class)] = "br.com.cweb.cadastro.persistence.entity.TipoConta/1467776311";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.TipoEndereco::class)] = "br.com.cweb.cadastro.persistence.entity.TipoEndereco/3705569210";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.TipoInstituicao::class)] = "br.com.cweb.cadastro.persistence.entity.TipoInstituicao/138639325";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.TipoPessoa::class)] = "br.com.cweb.cadastro.persistence.entity.TipoPessoa/1405647552";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO::class)] = "br.com.cweb.cadastro.persistence.entity.UsuarioLogadoDTO/2486216669";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.core.persistence.beanmodel.Ordenacao::class)] = "br.com.cweb.core.persistence.beanmodel.Ordenacao/3918795316";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.core.persistence.beanmodel.Paginador::class)] = "br.com.cweb.core.persistence.beanmodel.Paginador/3688094731";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.core.persistence.beanmodel.ResultadoPaginado::class)] = "br.com.cweb.core.persistence.beanmodel.ResultadoPaginado/3375020944";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.core.persistence.beanmodel.SimpleModelData::class)] = "br.com.cweb.core.persistence.beanmodel.SimpleModelData/2507063497";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.core.persistence.beanmodel.SimpleModelData[]::class)] = "[Lbr.com.cweb.core.persistence.beanmodel.SimpleModelData;/587083432";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.core.persistence.entity.TipoSituacaoAtivacao::class)] = "br.com.cweb.core.persistence.entity.TipoSituacaoAtivacao/3052585075";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.core.persistence.entity.TipoVinculacao::class)] = "br.com.cweb.core.persistence.entity.TipoVinculacao/2420228652";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException::class)] = "br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException/2858437552";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.mensagem.exception.MensagemException::class)] = "br.com.cweb.mensagem.exception.MensagemException/694185558";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.mensagem.to.Mensagem::class)] = "br.com.cweb.mensagem.to.Mensagem/4223174925";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.mensagem.to.Mensagem[]::class)] = "[Lbr.com.cweb.mensagem.to.Mensagem;/293322735";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.relatorio.to.TipoFormatoRelatorio::class)] = "br.com.cweb.relatorio.to.TipoFormatoRelatorio/1851932827";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.relatorio.to.TipoNomeRelatorio::class)] = "br.com.cweb.relatorio.to.TipoNomeRelatorio/887727518";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO::class)] = "br.com.cweb.seguranca.persistence.entity.AcessoGrupoDTO/1680717994";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.AcessoMenu::class)] = "br.com.cweb.seguranca.persistence.entity.AcessoMenu/2754561031";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.Funcionalidade::class)] = "br.com.cweb.seguranca.persistence.entity.Funcionalidade/835000344";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.GrupoAcesso::class)] = "br.com.cweb.seguranca.persistence.entity.GrupoAcesso/1091394704";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.MenuDTO::class)] = "br.com.cweb.seguranca.persistence.entity.MenuDTO/2265074607";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.TipoFuncionalidade::class)] = "br.com.cweb.seguranca.persistence.entity.TipoFuncionalidade/1362178606";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.TipoPermissao::class)] = "br.com.cweb.seguranca.persistence.entity.TipoPermissao/3395514979";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.TipoPermissao[]::class)] = "[Lbr.com.cweb.seguranca.persistence.entity.TipoPermissao;/2582740504";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.TipoSituacaoGrupo::class)] = "br.com.cweb.seguranca.persistence.entity.TipoSituacaoGrupo/309174036";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.Usuario::class)] = "br.com.cweb.seguranca.persistence.entity.Usuario/2445256274";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.seguranca.persistence.entity.Usuario[]::class)] = "[Lbr.com.cweb.seguranca.persistence.entity.Usuario;/45943676";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.view.template.client.ComboBoxClear.TriggerAction::class)] = "br.com.cweb.view.template.client.ComboBoxClear$TriggerAction/4231503732";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.widgets.constants.Function::class)] = "br.com.cweb.widgets.constants.Function/474821551";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.widgets.util.TypeFormatting::class)] = "br.com.cweb.widgets.util.TypeFormatting/2149110565";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.widgets.util.ValidationException::class)] = "br.com.cweb.widgets.util.ValidationException/1713352715";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@br.com.cweb.widgets.window.DefaultWindowConfig::class)] = "br.com.cweb.widgets.window.DefaultWindowConfig/2847093290";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.Style.AnchorPosition::class)] = "com.extjs.gxt.ui.client.Style$AnchorPosition/3791543021";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.Style.AutoSizeMode::class)] = "com.extjs.gxt.ui.client.Style$AutoSizeMode/1628325995";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.Style.ButtonArrowAlign::class)] = "com.extjs.gxt.ui.client.Style$ButtonArrowAlign/939200546";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.Style.ButtonScale::class)] = "com.extjs.gxt.ui.client.Style$ButtonScale/2681928122";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.Style.Direction::class)] = "com.extjs.gxt.ui.client.Style$Direction/432614085";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.Style.HideMode::class)] = "com.extjs.gxt.ui.client.Style$HideMode/3524850165";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.Style.HorizontalAlignment::class)] = "com.extjs.gxt.ui.client.Style$HorizontalAlignment/1376617479";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.Style.IconAlign::class)] = "com.extjs.gxt.ui.client.Style$IconAlign/2127438051";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.Style.LayoutRegion::class)] = "com.extjs.gxt.ui.client.Style$LayoutRegion/2125781808";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.Style.Orientation::class)] = "com.extjs.gxt.ui.client.Style$Orientation/1688816558";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.Style.Scroll::class)] = "com.extjs.gxt.ui.client.Style$Scroll/927846468";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.Style.ScrollDir::class)] = "com.extjs.gxt.ui.client.Style$ScrollDir/4294106711";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.Style.SelectionMode::class)] = "com.extjs.gxt.ui.client.Style$SelectionMode/1721996065";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.Style.SortDir::class)] = "com.extjs.gxt.ui.client.Style$SortDir/640452531";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.Style.VerticalAlignment::class)] = "com.extjs.gxt.ui.client.Style$VerticalAlignment/2743360252";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.core.El.VisMode::class)] = "com.extjs.gxt.ui.client.core.El$VisMode/2663458435";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.core.FastMap::class)] = "com.extjs.gxt.ui.client.core.FastMap/3488076414";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.core.FastSet::class)] = "com.extjs.gxt.ui.client.core.FastSet/2139705081";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig::class)] = "com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig/47114578";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseBooleanFilterConfig;/1642589127";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseDateFilterConfig::class)] = "com.extjs.gxt.ui.client.data.BaseDateFilterConfig/4013643245";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseDateFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseDateFilterConfig;/2667437259";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseFilterConfig;/3740213292";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig::class)] = "com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig/2138211457";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig;/34593227";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig::class)] = "com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig/12264880";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseGroupingLoadConfig;/937164088";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseListFilterConfig::class)] = "com.extjs.gxt.ui.client.data.BaseListFilterConfig/3409120418";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseListFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseListFilterConfig;/1641032626";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseListLoadConfig::class)] = "com.extjs.gxt.ui.client.data.BaseListLoadConfig/2201172752";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseListLoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseListLoadConfig;/3974160532";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseListLoadResult::class)] = "com.extjs.gxt.ui.client.data.BaseListLoadResult/756223242";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseModel::class)] = "com.extjs.gxt.ui.client.data.BaseModel/405059268";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseModelData::class)] = "com.extjs.gxt.ui.client.data.BaseModelData/3541881726";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseModelData[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseModelData;/1474801170";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseModel[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseModel;/2011808370";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseNumericFilterConfig::class)] = "com.extjs.gxt.ui.client.data.BaseNumericFilterConfig/1870815159";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseNumericFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseNumericFilterConfig;/2888123402";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BasePagingLoadConfig::class)] = "com.extjs.gxt.ui.client.data.BasePagingLoadConfig/2011366567";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BasePagingLoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BasePagingLoadConfig;/2317712753";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BasePagingLoadResult::class)] = "com.extjs.gxt.ui.client.data.BasePagingLoadResult/496878394";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig::class)] = "com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig/312164525";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig;/3584703654";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseStringFilterConfig::class)] = "com.extjs.gxt.ui.client.data.BaseStringFilterConfig/2159604562";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseStringFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseStringFilterConfig;/1612961225";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseTreeModel::class)] = "com.extjs.gxt.ui.client.data.BaseTreeModel/629153380";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseTreeModel[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseTreeModel;/3798848776";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BeanModel::class)] = "com.extjs.gxt.ui.client.data.BeanModel/158346479";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BeanModel[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BeanModel;/1738188982";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.FilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.FilterConfig;/1920562560";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.FilterPagingLoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.FilterPagingLoadConfig;/764130373";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.GroupingLoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.GroupingLoadConfig;/2566816166";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.ListLoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.ListLoadConfig;/4056684818";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.LoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.LoadConfig;/305088416";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.ModelData[]::class)] = "[Lcom.extjs.gxt.ui.client.data.ModelData;/1278407794";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.Model[]::class)] = "[Lcom.extjs.gxt.ui.client.data.Model;/2864064799";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.PagingLoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.PagingLoadConfig;/3362861869";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.RemoteSortTreeLoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.RemoteSortTreeLoadConfig;/837711618";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.RpcMap::class)] = "com.extjs.gxt.ui.client.data.RpcMap/3441186752";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.SortInfo::class)] = "com.extjs.gxt.ui.client.data.SortInfo/1143517771";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.TreeModel[]::class)] = "[Lcom.extjs.gxt.ui.client.data.TreeModel;/4230972141";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.dnd.DND.Feedback::class)] = "com.extjs.gxt.ui.client.dnd.DND$Feedback/2260779886";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.dnd.DND.Operation::class)] = "com.extjs.gxt.ui.client.dnd.DND$Operation/1345587808";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.dnd.DND.TreeSource::class)] = "com.extjs.gxt.ui.client.dnd.DND$TreeSource/3162796664";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.event.EventType::class)] = "com.extjs.gxt.ui.client.event.EventType/1920152450";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.fx.Resizable.Dir::class)] = "com.extjs.gxt.ui.client.fx.Resizable$Dir/829821481";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.store.Record.RecordUpdate::class)] = "com.extjs.gxt.ui.client.store.Record$RecordUpdate/464014577";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.util.DateWrapper.Unit::class)] = "com.extjs.gxt.ui.client.util.DateWrapper$Unit/1117854696";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.util.Theme::class)] = "com.extjs.gxt.ui.client.util.Theme/903569106";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.util.Theme[]::class)] = "[Lcom.extjs.gxt.ui.client.util.Theme;/2769591727";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.Layer.ShadowPosition::class)] = "com.extjs.gxt.ui.client.widget.Layer$ShadowPosition/1144660880";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.MessageBox.MessageBoxType::class)] = "com.extjs.gxt.ui.client.widget.MessageBox$MessageBoxType/2970822448";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.TabPanel.TabPosition::class)] = "com.extjs.gxt.ui.client.widget.TabPanel$TabPosition/1712079161";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.flash.FlashComponent.WMode::class)] = "com.extjs.gxt.ui.client.widget.flash.FlashComponent$WMode/851095583";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.form.ComboBox.TriggerAction::class)] = "com.extjs.gxt.ui.client.widget.form.ComboBox$TriggerAction/856435210";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.form.DualListField.Mode::class)] = "com.extjs.gxt.ui.client.widget.form.DualListField$Mode/321248023";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.form.FormPanel.Encoding::class)] = "com.extjs.gxt.ui.client.widget.form.FormPanel$Encoding/1255136613";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.form.FormPanel.LabelAlign::class)] = "com.extjs.gxt.ui.client.widget.form.FormPanel$LabelAlign/2499805453";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.form.FormPanel.Method::class)] = "com.extjs.gxt.ui.client.widget.form.FormPanel$Method/3806475933";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.form.SimpleComboValue::class)] = "com.extjs.gxt.ui.client.widget.form.SimpleComboValue/150969862";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.form.SimpleComboValue[]::class)] = "[Lcom.extjs.gxt.ui.client.widget.form.SimpleComboValue;/2952812979";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.form.Time::class)] = "com.extjs.gxt.ui.client.widget.form.Time/415600523";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.form.Time[]::class)] = "[Lcom.extjs.gxt.ui.client.widget.form.Time;/3588548357";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.grid.EditorGrid.ClicksToEdit::class)] = "com.extjs.gxt.ui.client.widget.grid.EditorGrid$ClicksToEdit/2626966747";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.grid.filters.RangeMenu.RangeItem::class)] = "com.extjs.gxt.ui.client.widget.grid.filters.RangeMenu$RangeItem/2590574067";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.layout.BoxLayout.BoxLayoutPack::class)] = "com.extjs.gxt.ui.client.widget.layout.BoxLayout$BoxLayoutPack/3990108502";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.layout.HBoxLayout.HBoxLayoutAlign::class)] = "com.extjs.gxt.ui.client.widget.layout.HBoxLayout$HBoxLayoutAlign/656667609";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.layout.VBoxLayout.VBoxLayoutAlign::class)] = "com.extjs.gxt.ui.client.widget.layout.VBoxLayout$VBoxLayoutAlign/3731435873";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.tree.Tree.CheckCascade::class)] = "com.extjs.gxt.ui.client.widget.tree.Tree$CheckCascade/796662336";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.tree.Tree.CheckNodes::class)] = "com.extjs.gxt.ui.client.widget.tree.Tree$CheckNodes/2231532982";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.tree.Tree.Joint::class)] = "com.extjs.gxt.ui.client.widget.tree.Tree$Joint/1395293110";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.treepanel.TreePanel.CheckCascade::class)] = "com.extjs.gxt.ui.client.widget.treepanel.TreePanel$CheckCascade/3474775907";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.treepanel.TreePanel.CheckNodes::class)] = "com.extjs.gxt.ui.client.widget.treepanel.TreePanel$CheckNodes/2045789707";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.treepanel.TreePanel.Joint::class)] = "com.extjs.gxt.ui.client.widget.treepanel.TreePanel$Joint/3859171004";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.treepanel.TreePanelView.TreeViewRenderMode::class)] = "com.extjs.gxt.ui.client.widget.treepanel.TreePanelView$TreeViewRenderMode/4266382970";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.canvas.dom.client.Context2d.Composite::class)] = "com.google.gwt.canvas.dom.client.Context2d$Composite/3412511209";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.canvas.dom.client.Context2d.LineCap::class)] = "com.google.gwt.canvas.dom.client.Context2d$LineCap/4137629416";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.canvas.dom.client.Context2d.LineJoin::class)] = "com.google.gwt.canvas.dom.client.Context2d$LineJoin/773759908";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.canvas.dom.client.Context2d.Repetition::class)] = "com.google.gwt.canvas.dom.client.Context2d$Repetition/200032891";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.canvas.dom.client.Context2d.TextAlign::class)] = "com.google.gwt.canvas.dom.client.Context2d$TextAlign/96304101";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.canvas.dom.client.Context2d.TextBaseline::class)] = "com.google.gwt.canvas.dom.client.Context2d$TextBaseline/1387606880";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.core.client.CodeDownloadException.Reason::class)] = "com.google.gwt.core.client.CodeDownloadException$Reason/4099226274";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.core.client.impl.SerializableThrowable::class)] = "com.google.gwt.core.client.impl.SerializableThrowable/3336179259";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.BorderStyle::class)] = "com.google.gwt.dom.client.Style$BorderStyle/2769837833";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.Cursor::class)] = "com.google.gwt.dom.client.Style$Cursor/2666657890";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.Display::class)] = "com.google.gwt.dom.client.Style$Display/1537475515";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.Float::class)] = "com.google.gwt.dom.client.Style$Float/1495215860";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.FontStyle::class)] = "com.google.gwt.dom.client.Style$FontStyle/2182768286";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.FontWeight::class)] = "com.google.gwt.dom.client.Style$FontWeight/3557458763";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.ListStyleType::class)] = "com.google.gwt.dom.client.Style$ListStyleType/1064239610";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.Overflow::class)] = "com.google.gwt.dom.client.Style$Overflow/982122884";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.Position::class)] = "com.google.gwt.dom.client.Style$Position/548017857";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.TableLayout::class)] = "com.google.gwt.dom.client.Style$TableLayout/1430616401";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.TextDecoration::class)] = "com.google.gwt.dom.client.Style$TextDecoration/3846779252";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.Unit::class)] = "com.google.gwt.dom.client.Style$Unit/269426519";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.VerticalAlign::class)] = "com.google.gwt.dom.client.Style$VerticalAlign/352429624";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.Visibility::class)] = "com.google.gwt.dom.client.Style$Visibility/1861510052";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.event.shared.UmbrellaException::class)] = "com.google.gwt.event.shared.UmbrellaException/3104463596";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.http.client.RequestException::class)] = "com.google.gwt.http.client.RequestException/190587325";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.i18n.client.DateTimeFormat.PredefinedFormat::class)] = "com.google.gwt.i18n.client.DateTimeFormat$PredefinedFormat/229723443";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.i18n.client.HasDirection.Direction::class)] = "com.google.gwt.i18n.client.HasDirection$Direction/1284232723";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.i18n.client.impl.DateRecord::class)] = "com.google.gwt.i18n.client.impl.DateRecord/3220471373";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.i18n.client.impl.DateRecord[]::class)] = "[Lcom.google.gwt.i18n.client.impl.DateRecord;/1800624538";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.json.client.JSONException::class)] = "com.google.gwt.json.client.JSONException/2941795468";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.jsonp.client.TimeoutException::class)] = "com.google.gwt.jsonp.client.TimeoutException/1112787596";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.layout.client.Layout.Alignment::class)] = "com.google.gwt.layout.client.Layout$Alignment/1758648740";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.resources.client.ImageResource.RepeatStyle::class)] = "com.google.gwt.resources.client.ImageResource$RepeatStyle/2798118115";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.safecss.shared.SafeStylesString::class)] = "com.google.gwt.safecss.shared.SafeStylesString/1334499262";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.safehtml.shared.SafeHtmlString::class)] = "com.google.gwt.safehtml.shared.SafeHtmlString/235635043";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.cellview.client.HasKeyboardPagingPolicy.KeyboardPagingPolicy::class)] = "com.google.gwt.user.cellview.client.HasKeyboardPagingPolicy$KeyboardPagingPolicy/3115114274";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy::class)] = "com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy$KeyboardSelectionPolicy/2212535585";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.cellview.client.SimplePager.TextLocation::class)] = "com.google.gwt.user.cellview.client.SimplePager$TextLocation/844327705";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.RpcTokenException::class)] = "com.google.gwt.user.client.rpc.RpcTokenException/2345075298";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.SerializableException::class)] = "com.google.gwt.user.client.rpc.SerializableException/3047383460";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.SerializationException::class)] = "com.google.gwt.user.client.rpc.SerializationException/2836333220";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.ServiceDefTarget.NoServiceEntryPointSpecifiedException::class)] = "com.google.gwt.user.client.rpc.ServiceDefTarget$NoServiceEntryPointSpecifiedException/3408313447";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.XsrfToken::class)] = "com.google.gwt.user.client.rpc.XsrfToken/4254043109";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader::class)] = "com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter$ResponseReader/3885798731";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.ChangeListenerCollection::class)] = "com.google.gwt.user.client.ui.ChangeListenerCollection/287642957";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.ClickListenerCollection::class)] = "com.google.gwt.user.client.ui.ClickListenerCollection/2152455986";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.DockLayoutPanel.Direction::class)] = "com.google.gwt.user.client.ui.DockLayoutPanel$Direction/1124902987";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.FocusListenerCollection::class)] = "com.google.gwt.user.client.ui.FocusListenerCollection/119490835";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.FormHandlerCollection::class)] = "com.google.gwt.user.client.ui.FormHandlerCollection/3088681894";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.KeyboardListenerCollection::class)] = "com.google.gwt.user.client.ui.KeyboardListenerCollection/1040442242";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.LoadListenerCollection::class)] = "com.google.gwt.user.client.ui.LoadListenerCollection/3174178888";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.MouseListenerCollection::class)] = "com.google.gwt.user.client.ui.MouseListenerCollection/465158911";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.MouseWheelListenerCollection::class)] = "com.google.gwt.user.client.ui.MouseWheelListenerCollection/370304552";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.MultiWordSuggestOracle.MultiWordSuggestion::class)] = "com.google.gwt.user.client.ui.MultiWordSuggestOracle$MultiWordSuggestion/2803420099";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.MultiWordSuggestOracle.MultiWordSuggestion[]::class)] = "[Lcom.google.gwt.user.client.ui.MultiWordSuggestOracle$MultiWordSuggestion;/1531882420";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.PopupListenerCollection::class)] = "com.google.gwt.user.client.ui.PopupListenerCollection/1920131050";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.PopupPanel.AnimationType::class)] = "com.google.gwt.user.client.ui.PopupPanel$AnimationType/2686977168";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.ScrollListenerCollection::class)] = "com.google.gwt.user.client.ui.ScrollListenerCollection/210686268";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.SuggestOracle.Request::class)] = "com.google.gwt.user.client.ui.SuggestOracle$Request/3707347745";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.SuggestOracle.Response::class)] = "com.google.gwt.user.client.ui.SuggestOracle$Response/3840253928";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.SuggestOracle.Suggestion[]::class)] = "[Lcom.google.gwt.user.client.ui.SuggestOracle$Suggestion;/3224244884";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.TabListenerCollection::class)] = "com.google.gwt.user.client.ui.TabListenerCollection/3768293299";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.TableListenerCollection::class)] = "com.google.gwt.user.client.ui.TableListenerCollection/2254740473";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.TreeListenerCollection::class)] = "com.google.gwt.user.client.ui.TreeListenerCollection/3716243734";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.ValueBoxBase.TextAlignment::class)] = "com.google.gwt.user.client.ui.ValueBoxBase$TextAlignment/3036099298";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.view.client.DefaultSelectionEventManager.SelectAction::class)] = "com.google.gwt.view.client.DefaultSelectionEventManager$SelectAction/3096171525";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.view.client.Range::class)] = "com.google.gwt.view.client.Range/1471336945";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.xml.client.impl.DOMParseException::class)] = "com.google.gwt.xml.client.impl.DOMParseException/3799120635";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.web.bindery.event.shared.UmbrellaException::class)] = "com.google.web.bindery.event.shared.UmbrellaException/1025846929";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.io.IOException::class)] = "java.io.IOException/1159940531";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.io.UnsupportedEncodingException::class)] = "java.io.UnsupportedEncodingException/1526756933";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.ArithmeticException::class)] = "java.lang.ArithmeticException/1539622151";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.ArrayIndexOutOfBoundsException::class)] = "java.lang.ArrayIndexOutOfBoundsException/600550433";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.ArrayStoreException::class)] = "java.lang.ArrayStoreException/3540507190";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.AssertionError::class)] = "java.lang.AssertionError/3490171458";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Boolean::class)] = "java.lang.Boolean/476441737";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Boolean[]::class)] = "[Ljava.lang.Boolean;/2507200464";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Byte::class)] = "java.lang.Byte/1571082439";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Byte[]::class)] = "[Ljava.lang.Byte;/3053163818";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Character::class)] = "java.lang.Character/2663399736";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.ClassCastException::class)] = "java.lang.ClassCastException/702295179";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Double::class)] = "java.lang.Double/858496421";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Double[]::class)] = "[Ljava.lang.Double;/2857560407";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Error::class)] = "java.lang.Error/1331973429";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Exception::class)] = "java.lang.Exception/1920171873";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Float::class)] = "java.lang.Float/1718559123";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Float[]::class)] = "[Ljava.lang.Float;/3956181278";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.IllegalArgumentException::class)] = "java.lang.IllegalArgumentException/1755012560";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.IllegalStateException::class)] = "java.lang.IllegalStateException/1972187323";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.IndexOutOfBoundsException::class)] = "java.lang.IndexOutOfBoundsException/2489527753";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Integer::class)] = "java.lang.Integer/3438268394";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Integer[]::class)] = "[Ljava.lang.Integer;/1574882222";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Long::class)] = "java.lang.Long/4227064769";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Long[]::class)] = "[Ljava.lang.Long;/97727328";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.NegativeArraySizeException::class)] = "java.lang.NegativeArraySizeException/3846860241";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.NullPointerException::class)] = "java.lang.NullPointerException/1463492344";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.NumberFormatException::class)] = "java.lang.NumberFormatException/3305228476";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.RuntimeException::class)] = "java.lang.RuntimeException/515124647";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Short::class)] = "java.lang.Short/551743396";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Short[]::class)] = "[Ljava.lang.Short;/3779901635";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.StackTraceElement::class)] = "java.lang.StackTraceElement/455763907";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.StackTraceElement[]::class)] = "[Ljava.lang.StackTraceElement;/3867167983";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.StringIndexOutOfBoundsException::class)] = "java.lang.StringIndexOutOfBoundsException/500777603";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String[]::class)] = "[Ljava.lang.String;/2600011424";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Throwable::class)] = "java.lang.Throwable/2953622131";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.UnsupportedOperationException::class)] = "java.lang.UnsupportedOperationException/3744010015";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Void::class)] = "java.lang.Void/2139725816";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.annotation.AnnotationFormatError::class)] = "java.lang.annotation.AnnotationFormatError/2257184627";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.annotation.AnnotationTypeMismatchException::class)] = "java.lang.annotation.AnnotationTypeMismatchException/976205828";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.annotation.ElementType::class)] = "java.lang.annotation.ElementType/15413163";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.annotation.RetentionPolicy::class)] = "java.lang.annotation.RetentionPolicy/1244130522";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.math.BigDecimal::class)] = "java.math.BigDecimal/8151472";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.math.BigInteger::class)] = "java.math.BigInteger/927293797";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.math.MathContext::class)] = "java.math.MathContext/1014811437";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.math.RoundingMode::class)] = "java.math.RoundingMode/2365096428";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.security.DigestException::class)] = "java.security.DigestException/629316798";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.security.GeneralSecurityException::class)] = "java.security.GeneralSecurityException/2669239907";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.security.NoSuchAlgorithmException::class)] = "java.security.NoSuchAlgorithmException/2892037213";
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
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ConcurrentModificationException::class)] = "java.util.ConcurrentModificationException/2717383897";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Date::class)] = "java.util.Date/3385151746";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Date[]::class)] = "[Ljava.util.Date;/3768760277";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.EmptyStackException::class)] = "java.util.EmptyStackException/89438517";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.HashMap::class)] = "java.util.HashMap/1797211028";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.HashSet::class)] = "java.util.HashSet/3273092938";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.IdentityHashMap::class)] = "java.util.IdentityHashMap/1839153020";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedHashMap::class)] = "java.util.LinkedHashMap/3008245022";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedHashSet::class)] = "java.util.LinkedHashSet/1826081506";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedList::class)] = "java.util.LinkedList/3953877921";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.NoSuchElementException::class)] = "java.util.NoSuchElementException/1559248883";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Stack::class)] = "java.util.Stack/1346942793";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TooManyListenersException::class)] = "java.util.TooManyListenersException/2023078032";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeMap::class)] = "java.util.TreeMap/1493889780";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeSet::class)] = "java.util.TreeSet/4043497002";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Vector::class)] = "java.util.Vector/3057315478";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.logging.Level::class)] = "java.util.logging.Level/2839552483";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.logging.LogRecord::class)] = "java.util.logging.LogRecord/2492345967";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@javax.validation.ConstraintDeclarationException::class)] = "javax.validation.ConstraintDeclarationException/3610544007";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@javax.validation.ConstraintDefinitionException::class)] = "javax.validation.ConstraintDefinitionException/3732439488";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@javax.validation.ConstraintViolationException::class)] = "javax.validation.ConstraintViolationException/173345760";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@javax.validation.GroupDefinitionException::class)] = "javax.validation.GroupDefinitionException/4024780846";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@javax.validation.UnexpectedTypeException::class)] = "javax.validation.UnexpectedTypeException/593026390";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@javax.validation.ValidationException::class)] = "javax.validation.ValidationException/1570221831";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@javax.validation.constraints.Pattern.Flag::class)] = "javax.validation.constraints.Pattern$Flag/3133410044";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@javax.validation.metadata.Scope::class)] = "javax.validation.metadata.Scope/4054088630";
    return result;
  }-*/;
  
  public AcessoRecursoServiceFacade_TypeSerializer() {
    super(null, methodMapNative, null, signatureMapNative);
  }
  
}
