package br.com.cweb.view.desktop.client.build;

import com.extjs.gxt.ui.client.widget.Window;

/**
 * Interface para as implementacoes de renderizacao
 * de Janela.
 * @author Sebastiao Nunes
 *
 */
public interface IWindowBulider {

	public void buildWindow(Window window,String codigoFuncionalidade);
	public void buildWindow(final Window window,String codigoFunc,String idGrupoAcesso);
	public void buildWindow(Window window);
}
