package br.com.cweb.view.cadastro.instituicaofinanceira.client.view;

import com.extjs.gxt.ui.client.Style.Orientation;
import com.extjs.gxt.ui.client.Style.Scroll;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.Window;
import com.extjs.gxt.ui.client.widget.form.TextArea;
import com.extjs.gxt.ui.client.widget.layout.RowData;
import com.extjs.gxt.ui.client.widget.layout.RowLayout;

public class AjudaInstituicaoFinanceiraWindow extends Window {
	
	public AjudaInstituicaoFinanceiraWindow(){
		setSize("820px", "540px");
		setResizable(false);
		setModal(true);
		setVScrollPosition(533);
		setHScrollPosition(848);
		setHeading("Manter Cadastro de Institui\u00E7\u00E3o financeira - Ajuda");
		setLayout(new RowLayout(Orientation.VERTICAL));
		
		LayoutContainer layoutContainer = new LayoutContainer();
		layoutContainer.setScrollMode(Scroll.AUTO);
		
		TextArea txtrNewTextarea = new TextArea();
		txtrNewTextarea.setReadOnly(true);
		txtrNewTextarea.setVisible(true);
		txtrNewTextarea.setEmptyText("\r\nFuncionalidade:\r\n- Manter Cadastro de Institui\u00E7\u00E3o financeira    " +
									 "\r\n\r\nObjetivo:\r\n- Incluir, alterar ou excluir informa\u00E7\u00F5es cadastrais sobre institui\u00E7\u00F5es financeiras, sendo elas bancos ou parceiros.   " +
									 "\r\n\r\nA\u00E7\u00E3o: Incluir \r\n- Orienta\u00E7\u00E3o: Para realizar a a\u00E7\u00E3o de incluir \u00E9  preciso preencher o campo descri\u00E7\u00E3o, selecionar a situa\u00E7\u00E3o e clicar em salvar. " +
									 "\r\n\r\nA\u00E7\u00E3o: Alterar \r\n- Orienta\u00E7\u00E3o: Para realizar a a\u00E7\u00E3o de alterar \u00E9 preciso selecionar o registro na tela de consulta. O sistema retornar\u00E1 na tela de cadastro as informa\u00E7\u00F5es para altera\u00E7\u00E3o. "+
									 "\r\n\r\nA\u00E7\u00E3o: Excluir \r\n- Orienta\u00E7\u00E3o: Para realizar a a\u00E7\u00E3o de excluir \u00E9 preciso selecionar o registro na tela de consulta e clicar no bot\u00E3o Excluir.\r\nUm registro s\u00F3 pode ser exclu\u00EDdo do cadastro caso nenhuma outra informa\u00E7\u00E3o do sistema dependa deste registro. Por outro lado, o sistema poder\u00E1 executar a a\u00E7\u00E3o de alterar a situa\u00E7\u00E3o para inativo.    " +
									 "\r\n\r\nA\u00E7\u00E3o: Imprimir \r\n- Orienta\u00E7\u00E3o: Est\u00E1 op\u00E7\u00E3o permite a impressao das informa\u00E7\u00F5es apresentadas na tela de consulta.   " +
									 "\r\n\r\nA\u00E7\u00E3o: Limpar\r\n- Limpa todos os campos da tela");
		layoutContainer.add(txtrNewTextarea);
		txtrNewTextarea.setSize("800", "500");
		txtrNewTextarea.setFieldLabel("New TextArea");
		add(layoutContainer, new RowData(805.0, 505.0, new Margins()));
		layoutContainer.setSize("834", "520");
		layoutContainer.setBorders(true);
	}

}
