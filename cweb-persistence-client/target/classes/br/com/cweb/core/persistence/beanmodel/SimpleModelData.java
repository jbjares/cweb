package br.com.cweb.core.persistence.beanmodel;



import java.io.Serializable;

import com.extjs.gxt.ui.client.data.BeanModel;

public class SimpleModelData extends BeanModel implements Serializable {

	private static final long serialVersionUID = -5260086576777444944L;
	
	public SimpleModelData(){}
	
	public SimpleModelData(Integer id, String text){
		setId(id);
		setText(text);
	}
	
	public Integer getId() {
		
		return get("id");
	}
	
	public void setId(Integer id) {
		
		set("id", id);
	}
	
	public String getText() {
		
		return get("text");
	}
	
	public void setText(String string) {
		
		set("text", string);
	}

	@Override
	public String toString() {

		return getText();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimpleModelData other = (SimpleModelData) obj;
		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;
		return true;
	}
	
}