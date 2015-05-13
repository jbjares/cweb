package br.com.cweb.view.desktop.client.contexto;

import java.util.List;

import br.com.cweb.seguranca.persistence.entity.MenuDTO;
import br.com.cweb.seguranca.persistence.entity.TipoFuncionalidade;
import br.com.cweb.view.cadastro.cadastroconvenio.client.view.PesquisaCadastroConvenioWindow;
import br.com.cweb.view.cadastro.cadastrogeral.client.view.PesquisaCadastroGeralWindow;
import br.com.cweb.view.cadastro.instituicaofinanceira.client.view.PesquisaInstituicaoFinanceiraWindow;
import br.com.cweb.view.desktop.client.CwebTaskBar;
import br.com.cweb.view.desktop.client.listener.WindowListener;
import br.com.cweb.view.desktop.client.service.DesktopService;
import br.com.cweb.view.desktop.client.service.DesktopServiceAsync;
import br.com.cweb.view.seguranca.cadastrogrupoacesso.client.view.CadastroGrupoAcessoWindow;
import br.com.cweb.view.seguranca.trocasenha.client.view.TrocaSenhaWindow;
import br.com.cweb.view.template.client.TemplateWindow;

import com.extjs.gxt.desktop.client.StartMenu;
import com.extjs.gxt.desktop.client.TaskBar;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.MenuEvent;
import com.extjs.gxt.ui.client.event.MessageBoxEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.util.IconHelper;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.menu.Menu;
import com.extjs.gxt.ui.client.widget.menu.MenuItem;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Classe para gerenciar as operacoes de
 * menu.
 * @author Sebastiao Nunes
 *
 */
public class GerenciadorMenu {

	private StartMenu menu;

    private GerenciadorContexto gerenciadorContexto;

    public GerenciadorMenu(GerenciadorContexto gerenciadorContexto)
    {
        this.gerenciadorContexto = gerenciadorContexto;
    }
    
    public void build(CwebTaskBar taskBar)
    {
    	this.menu = taskBar.getStartMenu();
		taskBar.setStartButtonText("CWEB");
		taskBar.setToolTip("Clique no botao CWEB para abrir o menu iniciar do sistema");
		menu.setIconStyle("user");
    }
    
    public void buildMainMenu(List<MenuDTO> windows)
    {
        for (MenuDTO dto : windows)
        {
            MenuItem item = null;

            if (dto.getTipoFuncionalidade().equals(TipoFuncionalidade.MODULO)){
                item = new MenuItem(dto.getDescricao());
            	item.setItemId(dto.getId().toString());
                item.setSubMenu(new Menu());
                item.setData("tipo", "MODULO");
                item.setIcon(IconHelper.createStyle(dto.getSigla()));
                menu.add(item);
            }
            else if (dto.getTipoFuncionalidade().equals(TipoFuncionalidade.MENU))
            {
                item = new MenuItem(dto.getDescricao());
                item.setItemId(dto.getId().toString());
                item.setData("tipo", "MENU");
                item.setToolTip(dto.getTooltip());
                item.setSubMenu(new Menu());
                addSubMenuItem(item, dto.getPai().toString());
            }
            else if (dto.getTipoFuncionalidade().equals(TipoFuncionalidade.ROTINA))
            {
            	item = new MenuItem(dto.getDescricao());
                item.setItemId(dto.getId().toString());
                item.setData("tipo", "ROTINA");
                item.setToolTip(dto.getTooltip());
                item.addSelectionListener(new WindowListener<MenuEvent>(dto.getId().toString(),dto.getIdGrupoAcesso().toString()));
                item.setData("window",obterInstanciaWindow(dto.getId()));
                addSubMenuItem(item, dto.getPai().toString());
            }
        }
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    private void addSubMenuItem(final MenuItem item, String parentId)
    {
        List<MenuItem> items = (List) menu.getItems();
        boolean added = false;

        for (MenuItem menuItem : items)
        {
            if (menuItem.getItemId().equals(parentId))
            {
                menuItem.getSubMenu().add(item);
                added = true;
                break;
            }
        }

        if (added)
        {
            return;
        }

        // pequisa nos modulos
        outer: for (MenuItem menuItem : items)
        {
            Menu submenu = menuItem.getSubMenu();

            if (submenu != null)
            {
                List<MenuItem> subitems = (List) submenu.getItems();

                for (MenuItem menuItem1 : subitems)
                {
                    if (menuItem1.getItemId().equals(parentId))
                    {
                        menuItem1.getSubMenu().add(item);
                        added = true;
                        break outer;
                    }
                }
            }
        }
    }
    
    //TODO desenvolver componente para persistir e buscar as janelas do sistema
    private TemplateWindow obterInstanciaWindow(int id){
    	
    	TemplateWindow window = null;
    	
    	switch (id) {

		case 1:
			window = new PesquisaCadastroGeralWindow();
			break;

		case 5:
			window = new PesquisaCadastroConvenioWindow(); 
			break;
			
		case 4:
			window = new PesquisaInstituicaoFinanceiraWindow();
			break;
			
		case 2:
			window = new CadastroGrupoAcessoWindow();	
			break;
			
		case 3:
			window = new TrocaSenhaWindow();	
			break;
			
		default:
			break;
		}
    	
    	return window;
    }
    
    public void addTools(){
    	
    	MenuItem tool = new MenuItem("Logout");
		
		tool.setIcon(IconHelper.createStyle("logout"));
		tool.setToolTip("Clique aqui para sair do sistema");
		tool.setId("id_DesktopImpl_Logout");
		tool.addSelectionListener(new SelectionListener<MenuEvent>() {

			@Override
			public void componentSelected(MenuEvent ce) {
				gerenciadorContexto.logoff();
			}
		});
		menu.addTool(tool);
    }
    
    public void addName(String name){
    	menu.setHeading(name);
    }
}
