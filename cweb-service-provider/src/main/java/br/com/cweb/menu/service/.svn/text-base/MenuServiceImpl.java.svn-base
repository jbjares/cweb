package br.com.cweb.menu.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.cweb.seguranca.persistence.dao.AcessoMenuDAO;
import br.com.cweb.seguranca.persistence.dao.FuncionalidadeDAO;
import br.com.cweb.seguranca.persistence.entity.AcessoMenu;
import br.com.cweb.seguranca.persistence.entity.Funcionalidade;
import br.com.cweb.seguranca.persistence.entity.MenuDTO;
import br.com.cweb.seguranca.persistence.entity.TipoFuncionalidade;

/**
 * Metodo para recupear o menu do sistema. 
 * @author Sebastiao Nunes
 * @since 1.0
 */

@Service("menuService")
public class MenuServiceImpl implements MenuService {

	@Autowired
	private AcessoMenuDAO acessoMenuDAO;
	
	@Autowired
	private FuncionalidadeDAO funcionalidadeDAO;

	public List<MenuDTO> getMenu(Long idGrupoAcesso)throws Exception {

		List<MenuDTO> result = new ArrayList<MenuDTO>();

			List<AcessoMenu> acessos = acessoMenuDAO
					.findByIdGrupoAcesso(idGrupoAcesso);
			
			Set<Funcionalidade> funcionalidades = new LinkedHashSet<Funcionalidade>();

			for(AcessoMenu acesso : acessos){
				funcionalidades.add(acesso.getFuncionalidade());
			}
			
			Set<Funcionalidade> funcionalidadesPais = new LinkedHashSet<Funcionalidade>();
			
			for(Funcionalidade func:funcionalidades){
				
				Long idFuncPai = new Long(func.getPaiFuncionalidade().toString());
				Funcionalidade funcPai = funcionalidadeDAO.findById(idFuncPai);
				
				if(funcPai != null){
					funcionalidadesPais.add(funcPai);
				}
			}
			
			funcionalidades.addAll(funcionalidadesPais);
			
			for (Funcionalidade func : funcionalidades) {

				MenuDTO menu = new MenuDTO();
				menu.setIdGrupoAcesso(idGrupoAcesso);
				
				int tipoFuncionalidade = func.getTipoFuncionalidade();

				switch (tipoFuncionalidade) {

				case 1:
					menu.setTipoFuncionalidade(TipoFuncionalidade.MODULO);
					menu.setSigla(func.getSigla());
					break;

				case 2:
					menu.setTipoFuncionalidade(TipoFuncionalidade.MENU);
					menu.setTooltip(func.getTooltip());
				
				case 3:
					menu.setTipoFuncionalidade(TipoFuncionalidade.ROTINA);
					menu.setTooltip(func.getTooltip());
					
				default:
					break;
				}
				
				menu.setDescricao(func.getNome());
				int id = Integer.parseInt(func.getId().toString());
				menu.setId(id);
				menu.setPai(func.getPaiFuncionalidade());
				result.add(menu);
				
				if(result != null){
					Collections.sort(result);
					
				}
			}
		return result;

	}

}
