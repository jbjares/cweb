package br.com.cweb.view.cadastro.cadastrogeral.client.view;

import com.extjs.gxt.ui.client.Style.Orientation;
import com.extjs.gxt.ui.client.widget.Window;
import com.extjs.gxt.ui.client.widget.layout.RowLayout;
import com.extjs.gxt.ui.client.widget.HtmlContainer;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.Style.Scroll;
import com.extjs.gxt.ui.client.widget.layout.RowData;
import com.extjs.gxt.ui.client.Style;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.TextArea;

public class AjudaCadastroGeralWindow extends Window {

	public AjudaCadastroGeralWindow() {
		this.setId("id_AjudaCadastroGeralWindow");
		setSize("820px", "540px");
		setResizable(false);
		setModal(true);
		setVScrollPosition(533);
		setHScrollPosition(848);
		setHeading("Gerenciar Pessoas e Usuarios - Ajuda");
		setLayout(new RowLayout(Orientation.VERTICAL));
		
		LayoutContainer layoutContainer = new LayoutContainer();
		layoutContainer.setScrollMode(Scroll.AUTO);
		
		TextArea txtrNewTextarea = new TextArea();
		txtrNewTextarea.setReadOnly(true);
		txtrNewTextarea.setVisible(true);
		txtrNewTextarea.setEmptyText("\r\nFuncionalidade:\r\n- Manter Cadastro Geral    \r\n\r\nObjetivo:\r\n- Incluir, alterar ou excluir informa\u00E7\u00F5es cadastrais sobre a Matriz, Substabelecidos, Bases Regionais, Corretores, Funcion\u00E1rios e Fornecedores.   \r\n\r\nDescri\u00E7\u00F5es adicionais: \r\n- \u00C9 poss\u00EDvel identificar e vincular uma pessoa a seu superior respons\u00E1vel, como uma base ou um corretor captador. \r\nConceder permiss\u00E3o para que a pessoa se torne um usu\u00E1rio do sistema e possa acess\u00E1-lo atrav\u00E9s de um Login/Senha.\r\nToda vez que um nova pessoa \u00E9 cadastrada e \u00E9 liberado seu acesso como usu\u00E1rio, o sistema envia uma senha provis\u00F3ria para o e-mail do usu\u00E1rio. A senha deve ser trocada no primeiro acesso.\r\nInformar dados de conta banc\u00E1ria para que as pessoas possam receber seus devidos pagamentos.    \r\n\r\nIncluir: \r\n- Orienta\u00E7\u00E3o: . Para realizar a a\u00E7\u00E3o de incluir \u00E9 clicar no bot\u00E3o Incluir da tela inicial de consulta. \r\nO sistema abrir\u00E1 a tela de cadastro onde ser\u00E1 preciso preencher algumas informa\u00E7\u00F5es obrigat\u00F3rias na tela, depois clicar em Salvar.   \r\n\r\nAlterar:    \r\n- Para realizar a a\u00E7\u00E3o de alterar \u00E9 preciso selecionar o registro na tela de consulta e clicar no bot\u00E3o Alterar. \r\nO sistema abrir\u00E1 a tela de cadastro com as informa\u00E7\u00F5es passiveis de altera\u00E7\u00E3o.    \r\n\r\nExcluir:\r\nOrienta\u00E7\u00E3o: . Para realizar a a\u00E7\u00E3o de excluir \u00E9 preciso selecionar o registro na tela de consulta e clicar no bot\u00E3o Excluir.\r\nUma pessoa s\u00F3 pode ser exclu\u00EDda do cadastro caso nenhuma outra informa\u00E7\u00E3o do sistema dependa deste registro. Por outro lado, o sistema permite que este cadastro possa ser alterado para situa\u00E7\u00E3o de inativo.    \r\n      \r\nPesquisar:\r\n- Para clicar no bot\u00E3o Pesquisar, uma tela de filtro \u00E9 apresentada. \u00C9 preciso informar pelo menos algum filtro na tela antes de clicar em pesquisar.\r\nO sistema abrir\u00E1 uma tela de consulta com resultado da pesquisa.    \r\n       \r\nImprimir:\r\n- Est\u00E1 op\u00E7\u00E3o permite que seja impresso as informa\u00E7\u00F5es apresentadas na tela de consulta.   \r\n       \r\nLimpar:\r\n- Limpa todos os campos da tela   \r\n        \r\n");
		layoutContainer.add(txtrNewTextarea);
		txtrNewTextarea.setSize("800", "500");
		txtrNewTextarea.setFieldLabel("New TextArea");
		add(layoutContainer, new RowData(805.0, 505.0, new Margins()));
		layoutContainer.setSize("834", "520");
		layoutContainer.setBorders(true);
	}

}
