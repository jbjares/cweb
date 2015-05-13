package br.com.cweb.cadastro.persistence.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.springframework.stereotype.Repository;

import br.com.cweb.cadastro.persistence.entity.ArvoreFamiliar;
import br.com.cweb.cadastro.persistence.entity.Estado;
import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.cadastro.persistence.entity.PessoaFisicaJuridica;
import br.com.cweb.core.persistence.exception.DaoException;
import br.com.cweb.core.persistence.exception.NenhumRegistroEncontradoException;
import br.com.cweb.seguranca.persistence.entity.Usuario;

@Repository("pessoaFisicaJuridicaDAO")
public class PessoaFisicaJuridicaDAOImpl  extends PessoaFisicaJuridicaDAO{

	@SuppressWarnings("unchecked")
	@Override
	public List<PessoaFisicaJuridica> findAll() throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(PessoaFisicaJuridica.class);
		List<PessoaFisicaJuridica> result = getHibernateTemplate().findByCriteria(criteria); 
		return result;
	}

	@Override
	public PessoaFisicaJuridica findById(Long value) throws DaoException {
		return (PessoaFisicaJuridica) getHibernateTemplate().get(PessoaFisicaJuridica.class, value);
	}
	
	@Override
	public PessoaFisicaJuridica findByCpfCnpj(String value) throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(PessoaFisicaJuridica.class);
		criteria.add(Restrictions.eq("cpfCnpj",value));
		List<PessoaFisicaJuridica> result = getHibernateTemplate().findByCriteria(criteria);
		return result.isEmpty()?null:result.get(0);
	}


	@Override
	public List<PessoaFisicaJuridica> findAllByCodigoAtribuicao(Long codigoTipoVinculacao,Usuario usuarioLogado) throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(PessoaFisicaJuridica.class);
		
		if(codigoTipoVinculacao.equals(usuarioLogado.getPessoa().getAtribuicao().getId())){
			if(usuarioLogado.getIdSuperUsuario()!=null){
				criteria.add(Restrictions.eq("id",usuarioLogado.getIdSuperUsuario()));
			}else{
				criteria.add(Restrictions.eq("id",usuarioLogado.getPessoa().getId()));
			}
			return getHibernateTemplate().findByCriteria(criteria);
		}
		
		criteria.add(Restrictions.eq("idAtribuicao", codigoTipoVinculacao));
		SimpleExpression restrictions;

		//TODO --INICIO: O TRECHO DE CODIGO ABAIXO DEVE SER ADICIONADO A UM INTERCEPTADOR DE CONSULTAS
		restrictions = Restrictions.ge("nivel",usuarioLogado.getPessoa().getArvoreFamiliar().getNivel());
		String arvoreFilhos = usuarioLogado.getPessoa().getArvoreFamiliar().getArvore()+usuarioLogado.getId()+";"; 
		criteria.add(Restrictions.and(Restrictions.ilike("arvore",arvoreFilhos, MatchMode.ANYWHERE),restrictions));
		//--FIM;
		return getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public List<PessoaFisicaJuridica> findAll(PessoaFisicaJuridica pessoaFisicaJuridica, Pessoa pessoaLogada)throws DaoException {
		DetachedCriteria criteria = DetachedCriteria.forClass(PessoaFisicaJuridica.class);
		
		if(pessoaFisicaJuridica.getCpfCnpjVinculante()!=null){
			PessoaFisicaJuridica pessoaVinculante = findByCpfCnpj(pessoaFisicaJuridica.getCpfCnpjVinculante());
			String arvoreDoVinculante = pessoaVinculante.getArvore();
			String arvoreFilhosUsuarioLogado = pessoaLogada.getArvoreFamiliar().getArvore()+pessoaLogada.getId()+";";
			String arvoreFilhos = arvoreDoVinculante+pessoaVinculante.getId()+";";
			//Verifica se o vinculante est� debaixo da arvore do usuario logado
			if(!(arvoreDoVinculante.contains(arvoreFilhosUsuarioLogado)||
					arvoreFilhosUsuarioLogado.contains(arvoreDoVinculante))){
				return Collections.EMPTY_LIST;
			}
			criteria.add(Restrictions.and(Restrictions.ilike("arvore",arvoreFilhos,MatchMode.ANYWHERE),
					Restrictions.gt("nivel",pessoaVinculante.getNivel())));
		}else{
			//TODO --INICIO: O TRECHO DE CODIGO ABAIXO DEVE SER ADICIONADO A UM INTERCEPTADOR DE CONSULTAS
			SimpleExpression restrictions;
			if(";0;".equals(pessoaLogada.getArvoreFamiliar().getArvore())){
				restrictions = Restrictions.ge("nivel",pessoaLogada.getArvoreFamiliar().getNivel());
				criteria.add(Restrictions.and(Restrictions.ilike("arvore",pessoaLogada.getArvoreFamiliar().getArvore(), MatchMode.ANYWHERE),restrictions));
			}else{
				restrictions = Restrictions.gt("nivel",pessoaLogada.getArvoreFamiliar().getNivel());
				String arvoreFilhos = pessoaLogada.getArvoreFamiliar().getArvore()+pessoaLogada.getId()+";";
				criteria.add(Restrictions.and(Restrictions.ilike("arvore",arvoreFilhos, MatchMode.ANYWHERE),restrictions));
			}
			//--FIM;
		}

		
		if(pessoaFisicaJuridica.getCpfCnpj()!=null){
			criteria.add(Restrictions.eq("cpfCnpj",pessoaFisicaJuridica.getCpfCnpj()));
		}
		if(pessoaFisicaJuridica.getPossuiCadastroPessoaAtivo()!=null){
			criteria.add(Restrictions.eq("possuiCadastroPessoaAtivo",pessoaFisicaJuridica.getPossuiCadastroPessoaAtivo()));
		}

		if(pessoaFisicaJuridica.getApelidoNomeFantasia()!=null){
			criteria.add(Restrictions.ilike("apelidoNomeFantasia",pessoaFisicaJuridica.getApelidoNomeFantasia(),MatchMode.START));
		}
		if(pessoaFisicaJuridica.getId()!=null){
			criteria.add(Restrictions.eq("id",pessoaFisicaJuridica.getId()));
		}

		if(pessoaFisicaJuridica.getIdAtribuicao()!=null){
			criteria.add(Restrictions.eq("idAtribuicao",pessoaFisicaJuridica.getIdAtribuicao()));
		}

		if(pessoaFisicaJuridica.getNomeRazaoSocial()!=null){
			criteria.add(Restrictions.ilike("nomeRazaoSocial",pessoaFisicaJuridica.getNomeRazaoSocial(),MatchMode.START));
		}
		if(pessoaFisicaJuridica.getSiglaPessoaJuridica()!=null){
			criteria.add(Restrictions.ilike("siglaPessoaJuridica",pessoaFisicaJuridica.getSiglaPessoaJuridica(),MatchMode.START));
		}
		if(pessoaFisicaJuridica.getTipoPessoa()!=null){
			criteria.add(Restrictions.eq("tipoPessoa",pessoaFisicaJuridica.getTipoPessoa()));
		}
		

		if(pessoaFisicaJuridica.getPossuiUsuario()==null){
			if(pessoaFisicaJuridica.getLogin()!=null){
				criteria.add(Restrictions.ilike("login",pessoaFisicaJuridica.getLogin(),MatchMode.START));
			}
			if(pessoaFisicaJuridica.getIdGrupoAcesso()!=null){
				criteria.add(Restrictions.eq("idGrupoAcesso",pessoaFisicaJuridica.getIdGrupoAcesso()));
			}			
		}
		
		if(pessoaFisicaJuridica.getPossuiUsuario()!=null && pessoaFisicaJuridica.getPossuiUsuario()){
			criteria.add(Restrictions.isNotNull("login"));
			if(pessoaFisicaJuridica.getLogin()!=null){
				criteria.add(Restrictions.ilike("login",pessoaFisicaJuridica.getLogin(),MatchMode.START));
			}
			if(pessoaFisicaJuridica.getIdGrupoAcesso()!=null){
				criteria.add(Restrictions.eq("idGrupoAcesso",pessoaFisicaJuridica.getIdGrupoAcesso()));
			}
			if(pessoaFisicaJuridica.getPossuiCadastroUsuarioAtivo()!=null){
				criteria.add(Restrictions.eq("possuiCadastroUsuarioAtivo",pessoaFisicaJuridica.getPossuiCadastroUsuarioAtivo()));
			}
			
		}else if(pessoaFisicaJuridica.getPossuiUsuario()!=null){
			criteria.add(Restrictions.isNull("login"));
		}
		
		
		List<PessoaFisicaJuridica> result = getHibernateTemplate().findByCriteria(criteria);
		return result;
	}
}
