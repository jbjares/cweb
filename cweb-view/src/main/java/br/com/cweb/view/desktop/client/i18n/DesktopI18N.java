package br.com.cweb.view.desktop.client.i18n;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;

public interface DesktopI18N extends ClientBundle{

	public static final DesktopMessages messages = GWT.create(DesktopMessages.class);
}
