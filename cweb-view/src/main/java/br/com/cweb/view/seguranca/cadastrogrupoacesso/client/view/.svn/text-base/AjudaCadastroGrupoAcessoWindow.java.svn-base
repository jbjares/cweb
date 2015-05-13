package br.com.cweb.view.seguranca.cadastrogrupoacesso.client.view;

import com.extjs.gxt.ui.client.Style.Orientation;
import com.extjs.gxt.ui.client.Style.Scroll;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.Window;
import com.extjs.gxt.ui.client.widget.form.TextArea;
import com.extjs.gxt.ui.client.widget.layout.RowData;
import com.extjs.gxt.ui.client.widget.layout.RowLayout;

public class AjudaCadastroGrupoAcessoWindow extends Window{

	public AjudaCadastroGrupoAcessoWindow() {
		this.setId("id_AjudaCadastroGeralWindow");
		setSize("820px", "540px");
		setResizable(false);
		setModal(true);
		setVScrollPosition(533);
		setHScrollPosition(848);
		setHeading("Administrar Grupo de Acesso");
		setLayout(new RowLayout(Orientation.VERTICAL));
		
		LayoutContainer layoutContainer = new LayoutContainer();
		layoutContainer.setScrollMode(Scroll.AUTO);
		
		TextArea txtrNewTextarea = new TextArea();
		txtrNewTextarea.setReadOnly(true);
		txtrNewTextarea.setVisible(true);
		txtrNewTextarea.setEmptyText("\r\nFuncionalidade:\r\n- Grupo de Acesso    \r\n\r\nObjetivo:\r\n- Incluir, consultar, alterar ou excluir informações cadastrais sobre grupos de acesso e seus respectivo acesso ao menu do sistema.   \r\n\r\nDescrições adicionais: \r\n- \u00C9 poss\u00EDvel identificar e vincular uma pessoa a seu superior respons\u00E1vel, como uma base ou um corretor captador. \r\nConceder permiss\u00E3o para que a pessoa se torne um usu\u00E1rio do sistema e possa acess\u00E1-lo atrav\u00E9s de um Login/Senha.\r\nToda vez que um nova pessoa \u00E9 cadastrada e \u00E9 liberado seu acesso como usu\u00E1rio, o sistema envia uma senha provis\u00F3ria para o e-mail do usu\u00E1rio. A senha deve ser trocada no primeiro acesso.\r\nInformar dados de conta banc\u00E1ria para que as pessoas possam receber seus devidos pagamentos.    \r\n\r\nIncluir: \r\n- Orienta\u00E7\u00E3o: . Para realizar a ação de incluir é preciso preencher o campo descrição, selecionar a situação e clicar em salvar.    \r\n\r\nAlterar: \r\n- Para realizar a ação de alterar é preciso selecionar o registro na tela de consulta. \r\nO sistema abrir\u00E1 a tela de cadastro com as informa\u00E7\u00F5es passiveis de altera\u00E7\u00E3o.    \r\n\r\nExcluir:\r\nOrienta\u00E7\u00E3o: . Para realizar a ação de excluir é preciso selecionar o registro na tela de consulta e clicar no botão Excluir. \r\n Um registro só pode ser excluído do cadastro caso nenhuma outra informações do sistema dependa deste. Por outro lado, o sistema executará a ação de alterar a situação para inativo.\r\n \r\n Imprimir:\r\n- Est\u00E1 op\u00E7\u00E3o permite que seja impresso as informa\u00E7\u00F5es apresentadas na tela de consulta.   \r\n       \r\nLimpar:\r\n- Limpa todos os campos da tela   \r\n        \r\n");
		layoutContainer.add(txtrNewTextarea);
		txtrNewTextarea.setSize("800", "500");
		txtrNewTextarea.setFieldLabel("New TextArea");
		add(layoutContainer, new RowData(805.0, 505.0, new Margins()));
		layoutContainer.setSize("834", "520");
		layoutContainer.setBorders(true);
	}

	
}
