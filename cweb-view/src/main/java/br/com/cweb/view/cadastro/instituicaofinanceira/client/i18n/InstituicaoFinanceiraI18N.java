package br.com.cweb.view.cadastro.instituicaofinanceira.client.i18n;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;

public interface InstituicaoFinanceiraI18N extends ClientBundle {

	public static final InstituicaoFinanceiraConstants constants = GWT.create(InstituicaoFinanceiraConstants.class);
	public static final InstituicaoFinanceiraTooltip tooltip = GWT.create(InstituicaoFinanceiraTooltip.class);
	public static final InstituicaoFinanceiraMessages messages = GWT.create(InstituicaoFinanceiraMessages.class);

}
