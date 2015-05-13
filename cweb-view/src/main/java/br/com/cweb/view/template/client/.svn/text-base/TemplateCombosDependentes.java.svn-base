package br.com.cweb.view.template.client;




import java.util.ArrayList;
import java.util.List;
import com.extjs.gxt.ui.client.data.PagingLoader;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.FieldEvent;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.widget.form.ComboBox;

public class TemplateCombosDependentes {
	
	private List<ComboBox<?>> combos=new ArrayList<ComboBox<?>>();
	
	public void adicionarCombo(ComboBox<?> combo){
		if(combo==null){
			throw new NullPointerException();
		}
		if(combos.contains(combo)){
			return;
		}
		combos.add(combo);
		combo.addListener(Events.Select, new Listener<FieldEvent>() {

			public void handleEvent(FieldEvent be) {
				ComboBox<?> comboEvent=(ComboBox<?>)be.getSource();
				if(comboEvent.getValue()==null){
					return;
				}
				configurarCombos(comboEvent);
			}
			
		});

		combo.addListener(Events.Change, new Listener<FieldEvent>() {

			public void handleEvent(FieldEvent be) {
				ComboBox<?> comboEvent=(ComboBox<?>)be.getSource();
				if(comboEvent.getValue()!=null){
					return;
				}
				configurarCombos(comboEvent);
			}
			
		});
	}
	
	public void configurarCombos(ComboBox<?> fonte) {
		List<ComboBox<?>> proximos=getProximosCombos(fonte);
		if(proximos==null || proximos.isEmpty()){
			return;
		}
		for(int i=0;i<proximos.size();i++){
			ComboBox<?> cb=proximos.get(i);
			cb.getStore().removeAll();
			cb.clear();
			cb.clearSelections();
			if(i==0){
				if(fonte.getValue()!=null){
					cb.enable();
					if(!(cb.getStore().getLoader() instanceof PagingLoader<?>)){
						load(fonte,cb);
					}
					else{
						PagingLoader<?> loader =(PagingLoader<?>) cb.getStore().getLoader();
						loader.load();
					}					
				}
				else{
					cb.disable();
				}
			}
			else{
				cb.disable();
			}
		}
	}
	
	protected void load(ComboBox<?> fonte, ComboBox<?> cb){}

	private List<ComboBox<?>> getProximosCombos(ComboBox<?> combo){
		int indice=combos.indexOf(combo);
		if(indice==-1){
			return null;
		}
		if(indice==combos.size()-1){
			return null;
		}
		return combos.subList(indice+1, combos.size());
	}
	
	public void init(){
		for(int i=0;i<combos.size();i++){
			ComboBox<?> cb=combos.get(i);
			cb.setEnabled(i==0);
		}
	}
}