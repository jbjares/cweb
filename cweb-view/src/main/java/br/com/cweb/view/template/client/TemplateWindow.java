package br.com.cweb.view.template.client;

import java.util.ArrayList;
import java.util.List;

import br.com.cweb.core.persistence.beanmodel.SimpleModelData;
import br.com.cweb.relatorio.to.RelatorioConstantes;
import br.com.cweb.relatorio.to.TipoFormatoRelatorio;
import br.com.cweb.relatorio.to.TipoNomeRelatorio;
import br.com.cweb.seguranca.persistence.entity.TipoPermissao;
import br.com.cweb.widgets.constants.Function;
import br.com.cweb.widgets.window.IWindow;
import br.com.cweb.widgets.window.IWindowConfig;

import com.extjs.gxt.ui.client.event.BaseEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.IconButtonEvent;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.Window;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.button.ToolButton;
import com.extjs.gxt.ui.client.widget.form.ComboBox;
import com.extjs.gxt.ui.client.widget.form.ComboBox.TriggerAction;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.RootPanel;

public abstract class TemplateWindow extends Window implements IWindow{

	protected ToolButton helpBtn;
	private IWindowConfig windowConfig;
	private List<Button> listButtonsWindows = new ArrayList<Button>();;
	 
	protected abstract void onAjuda();
	
	protected void initTools() {
		helpBtn = new ToolButton("x-tool-help");
		helpBtn.addSelectionListener(new SelectionListener<IconButtonEvent>() {
			public void componentSelected(IconButtonEvent ce) {
				onAjuda();
			}
		});
		head.addTool(helpBtn);
		super.initTools();
	}
	
	
	@SuppressWarnings("unchecked")
	public static void formatarCombo(final ComboBox combo) {
		combo.setTypeAhead(true);  
		combo.setTriggerAction(ComboBox.TriggerAction.ALL); 
		combo.setStateful(false);
		combo.setHideTrigger(false);
		combo.setMinChars(1);
		combo.setForceSelection(true);
		combo.setEditable(true);
		combo.addListener(Events.OnBlur, new Listener<BaseEvent>() {
			
			public void handleEvent(BaseEvent be) {
				ComboBox<SimpleModelData> cmb = (ComboBox<SimpleModelData>) be.getSource();
				if ("".equals(cmb.getRawValue()))
						cmb.setValue(null);
			}
		});
	}
	
	
	@SuppressWarnings("unchecked")
	public static void formatarCombo(final ComboBoxClear combo) {
		combo.setTypeAhead(true);  
		combo.setTriggerAction(ComboBoxClear.TriggerAction.ALL);
		combo.setForceSelection(true);
		combo.setStateful(false);
		combo.addListener(Events.OnBlur, new Listener<BaseEvent>() {
			public void handleEvent(BaseEvent be) {
				ComboBoxClear<SimpleModelData> cmb = (ComboBoxClear<SimpleModelData>) be.getSource();
				if ("".equals(cmb.getRawValue()))
						cmb.setValue(null);
			}
		});
	}
	
	public static void exibirRelatorio(TipoNomeRelatorio nomeRelatorio,TipoFormatoRelatorio formato){
		Frame frame = new Frame();
		frame.setUrl("RelatorioServlet?"+RelatorioConstantes.NOME_RELATORIO+
				"="+nomeRelatorio.getNome()+"&"
				+RelatorioConstantes.TIPO_RELATORIO+"="+formato.getExtensao());
		frame.setVisible(true);
		frame.setWidth("100%");
		frame.setHeight("100%");
		RootPanel.get().add(frame);			
	}
	
	public Function getOperacao() 
	{
		if(windowConfig != null){
			return (Function) windowConfig.getParameters().get(IWindow.OPERATION);
		}
		else{
			return null;
		}
	}
	
	public void setWindowConfig(IWindowConfig cfg) {
		windowConfig = cfg;
	}

	public IWindowConfig getWindowConfig() {
		return windowConfig;
	}

	protected abstract void onClearForm();
	
	/**
	 * metodo que verifica se o botton pode ser
	 * renderizado. Executado no momento da
	 * renderizacao da janela.
	 * @author Sebastiao Nunes
	 */
	public void securityButton(){
		
		
		loop:for(Button button:listButtonsWindows){
			
			if(button == null){
				continue loop;
			}
			
			String siglaPermissao = button.getData(IWindow.OPERATION);
			
			if(siglaPermissao != null && getWindowConfig() != null){
				
				if((getWindowConfig().getParameters().get(siglaPermissao) == null) || (getWindowConfig().getParameters().get(siglaPermissao) == Boolean.FALSE)){
					button.disable();
				}
				else{
					button.enable();
				}
			}
		}
	}
	
	/**
	 * metodo para adicionar os botoes de 
	 * uma window para o controle de  acesso
	 * a nivel de botao.
	 * @author Sebastiao Nunes
	 * @param buttons
	 */
	public void addSecurityButton(Button ... buttons){
		
		for(Button button:buttons){
			listButtonsWindows.add(button);
		}
	}
	
	public boolean isRenderButton(Button button){
		
		if(button == null){
			return false;
		}
		
		String siglaPermissao = button.getData(IWindow.OPERATION);
		
		if(siglaPermissao == null && getWindowConfig() == null){
			return false;
		}
	
		if((getWindowConfig().getParameters().get(siglaPermissao) == null) || (getWindowConfig().getParameters().get(siglaPermissao) == Boolean.FALSE)){
				return false;
		}
		else{
			return true;
		}
	}
	
}
