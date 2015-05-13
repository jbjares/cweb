package br.com.cweb.widgets.util;

import com.extjs.gxt.ui.client.widget.button.Button;

public class ButtonUtil {

	public static void desabilitarBotao(Button botao, String label) {
		
		if ( !botao.getText().equals(label) )
			botao.setData("text", botao.getText());
		botao.setText(label);
		botao.disable();
	}
	
	public static void habilitarBotao(Button botao) {
		botao.setText((String)botao.getData("text"));
		botao.enable();
	}
	
	public static void habilitarBotao(Button botao, String textoAnterior) {
		botao.setText(textoAnterior);
		botao.enable();
	}
}
