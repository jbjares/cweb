package br.com.cweb.menu.service.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import br.com.cweb.cadastro.persistence.entity.Pessoa;
import br.com.cweb.cadastro.service.OrganogramaService;
import br.com.cweb.menu.service.MenuService;
import br.com.cweb.seguranca.persistence.entity.MenuDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( {"classpath:cweb-service.xml","classpath:cweb-persistence.xml", "classpath:hibernate.cfg.xml"})
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
public class MenuServiceImplTest {
	
	@Autowired
	private MenuService menuService;
	
	@Test
	public void init(){
		Assert.assertNotNull(menuService);
	}
	
	@Test
	public void testRecuperarMenu() throws Exception {
		
		List<MenuDTO> menus = menuService.getMenu(1l);
		
		System.out.println("Funcionalidades:");
		
		for(MenuDTO menu:menus){
			System.out.println(menu.getDescricao());
		}
	}
		
	

}
