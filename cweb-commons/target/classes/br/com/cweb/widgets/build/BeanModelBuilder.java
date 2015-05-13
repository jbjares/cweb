package br.com.cweb.widgets.build;

import java.util.Collection;
import java.util.List;
import com.extjs.gxt.ui.client.data.BeanModel;
import com.extjs.gxt.ui.client.data.BeanModelLookup;

public class BeanModelBuilder {

	public static <T> BeanModel buildBeanModel(Object bean, Class<T> classe)
	{
		return BeanModelLookup.get().getFactory(classe).createModel(bean);
	}
	
	public static <T> List<? extends BeanModel> buildListBeanModel(Collection<?> beans, Class<T> classe) 
	{
		return BeanModelLookup.get().getFactory(classe).createModel(beans);
	}
	
	
}
