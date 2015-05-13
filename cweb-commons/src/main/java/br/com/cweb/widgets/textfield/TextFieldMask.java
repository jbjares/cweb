package br.com.cweb.widgets.textfield;

import java.util.HashMap;
import java.util.Map;
import br.com.cweb.widgets.util.TypeFormatting;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.FieldEvent;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.google.gwt.event.dom.client.KeyCodes;

public class TextFieldMask extends TextField<String> {

	private final String mask;

	private int maxLength;

	private String[] buffer;

	private String[] arrayMask;

	private static final Map<String, String> defs;

	private int lastKeyCode;

	private TypeFormatting typeFormatting;

	public TextFieldMask(String mask) {
		this.mask = mask;
		maskField();
	}
	
	static {
		defs = new HashMap<String, String>();
		defs.put("9", "[0-9]");
		defs.put("a", "[A-Za-z]");
		defs.put("*", "[A-Za-z0-9]");
	}

	private static boolean cotainDef(String key) {
		if (defs.get(key) != null) {
			return true;
		} else {
			return false;
		}
	}

	private static String getDef(String key) {
		return defs.get(key);
	}

	private void buffer() {
		String[] aux = split(mask);
		buffer = new String[aux.length];
		for (int i = 0; i < aux.length; i++) {
			if (cotainDef(aux[i])) {
				buffer[i] = null;
			} else {
				buffer[i] = aux[i];
			}
		}
	}

	private void each() {
		for (int i = 0; i < arrayMask.length; i++) {
			String c = arrayMask[i];
			if (cotainDef(c)) {
				arrayMask[i] = getDef(c);
			} else {
				arrayMask[i] = null;
			}
		}
	}

	private void maskField() {
		arrayMask = split(mask);

		maxLength = mask.length();

		each();
		buffer();
	}

	@Override
	protected void onBlur(ComponentEvent be) {
		super.onBlur(be);
		String value = getValue() == null ? "" : getValue();
		String valueBuffer = getValueBuffer();
		if (!value.equals(valueBuffer)) {
			setValueBuffer(value);
			value = getValueBuffer();
			writeBuffer();
		}
		if (value != null && value.length() >= 1 && value.length() != maxLength) {
			if (TypeFormatting.PAD_LEFT.equals(typeFormatting)) {
				String flag = "0";
				for (int i = value.length(); i < maxLength; i++) {
					if (arrayMask[i] != null) {
						for (int j = 0; j < maxLength; j++) {
							if (arrayMask[j] != null
									&& flag.matches(arrayMask[j])) {
								shiftRight(j);
								buffer[j] = flag;
								break;
							}
						}
					}
				}
				writeBuffer();
			} else if (TypeFormatting.PAD_RIGTH.equals(typeFormatting)) {
				String flag = "0";
				for (int i = value.length(); i < maxLength; i++) {
					if (arrayMask[i] != null) {
						for (int j = 0; j < maxLength; j++) {
							if (buffer[j] == null && flag.matches(arrayMask[j])) {
								buffer[j] = flag;
								break;
							}
						}
					}
				}
			}
			if (!isBufferValid()){
				clearBuffer();
				writeBuffer();
			}
		} else if (!isBufferValid()) {
			clearBuffer();
			writeBuffer();
		}

	}

	private boolean isBufferValid() {
		for (int i = 0; i < arrayMask.length; i++) {
			if (arrayMask[i] != null) {
				if (buffer[i] == null || !buffer[i].matches(arrayMask[i]))
					return false;
			}
		}
		return true;
	}

	@Override
	protected void onKeyDown(FieldEvent fe) {
		super.onKeyDown(fe);
		lastKeyCode = fe.getKeyCode();
	}

	@Override
	protected void onKeyPress(FieldEvent fe) {
		super.onKeyPress(fe);

		if (isSpecialKey(lastKeyCode) || fe.isControlKey())
			return;

		if (isReadOnly())
			return;
		
		int k = fe.getKeyCode();

		/* para atender ao firefox*/
		if(k == 0){
			k = fe.getEvent().getCharCode();
		}
		
		if (k == KeyCodes.KEY_BACKSPACE) {
			if (getCursorPos() != 0 || getSelectionLength() != 0) {
				int countBackSpace = getCountBackSpaceOrDelete();
				int posicao = getCursorPos() + getSelectionLength();
				for (int count = 0; count < countBackSpace; count++) {
					posicao = seekLast(posicao);
					shiftLeft(posicao);
				}
				writeBuffer();
				setCursorPos(posicao);
			}
		} else if (k == KeyCodes.KEY_DELETE) {
			int posicao = getCursorPos();
			if (posicao < maxLength) {
				int countBackSpace = getCountBackSpaceOrDelete();
				for (int count = 0; count < countBackSpace; count++) {
					shiftLeft(posicao);
				}
				writeBuffer();
			}
			setCursorPos(posicao);
		} else if ((k >= 32 && k <= 125) || k > 186) {
			int posicao = seekNext(getCursorPos() - 1);
			if (posicao < maxLength) {
				/* para atender ao firefox*/
				//String valorDigitado = String.valueOf((char) fe.getKeyCode());
				String valorDigitado = String.valueOf((char) k);
				if (arrayMask[posicao] != null
						&& valorDigitado.matches(arrayMask[posicao])) {
					shiftRight(posicao);
					buffer[posicao] = valorDigitado;
					writeBuffer();
					int next = seekNext(posicao);
					setCursorPos(next);
				}
			}
		}
		fe.stopEvent();
	}

	@Override
	protected void onKeyUp(FieldEvent fe) {
		super.onKeyUp(fe);
		String value = getValue() == null ? "" : getValue();
		String valueBuffer = getValueBuffer();
		if (!value.equals(valueBuffer) && !isReadOnly()) {
			setMaskValue(value);
		}
	}

	private void clearBuffer() {
		for (int i = 0; i < maxLength; i++) {
			if (arrayMask[i] != null)
				buffer[i] = null;
		}
	}

	private void setMaskValue(String value) {
		setValueBuffer(value);
		writeBuffer();
	}

	private void setValueBuffer(String value) {
		clearBuffer();
		if (value != null && !value.trim().equals("")) {
			for (int i = 0; i < arrayMask.length; i++) {
				if (arrayMask[i] != null) {
					while (value.length() != 0) {
						String c = value.substring(0, 1);
						value = value.substring(1);
						if (c.matches(arrayMask[i])) {
							buffer[i] = c;
							break;
						}
					}
				}
			}
		}
	}

	private String getValueBuffer() {
		String value = "";
		for (int i = 0; i < arrayMask.length; i++) {
			if (arrayMask[i] == null && seekNext(i) == maxLength)
				value += buffer[i];
			else if (arrayMask[i] != null && buffer[i] != null)
				value += buffer[i];
			else if (arrayMask[i] == null && buffer[seekNext(i)] != null)
				value += buffer[i];
			else
				break;
		}
		return value;
	}

	private boolean isSpecialKey(int k) {
		if ((k >= 33 && k <= 40) || k == KeyCodes.KEY_ESCAPE
				|| k == KeyCodes.KEY_ENTER || k == KeyCodes.KEY_TAB
				|| k == KeyCodes.KEY_CTRL || k == KeyCodes.KEY_SHIFT
				|| k == KeyCodes.KEY_ALT || (k >= 19 && k <= 20) || k == 45)
			return true;
		else
			return false;
	}

	private int seekNext(int index) {
		while (++index <= maxLength) {
			try {
				if (arrayMask[index] != null)
					break;
			} catch (Exception e) {
				break;
			}
		}
		return index;
	}

	private int seekLast(int index) {
		while (--index >= 0) {
			try {
				if (arrayMask[index] != null)
					break;
			} catch (Exception e) {
				break;
			}
		}
		return index;
	}

	private int getCountBackSpaceOrDelete() {
		int beginIndex = getCursorPos();
		int endIndex = beginIndex + getSelectionLength();
		int selectionLength = 0;
		for (int i = beginIndex; i < endIndex; i++) {
			if (arrayMask[i] != null)
				selectionLength++;
		}
		return selectionLength == 0 ? 1 : selectionLength;
	}

	private void shiftLeft(int index) {
		for (int i = index; i < maxLength; i++) {
			if (arrayMask[i] != null) {
				int j = seekNext(i);
				if (j < maxLength) {
					String nextValue = buffer[j];
					if (nextValue != null && nextValue.matches(arrayMask[i]))
						buffer[i] = nextValue;
					else
						buffer[i] = null;
					buffer[j] = null;
				} else {
					buffer[i] = null;
				}
			}
		}

	}

	private void shiftRight(int index) {
		String placeHolder = null;
		for (int i = index; i < maxLength; i++) {
			if (arrayMask[i] != null) {
				int j = seekNext(i);
				String value = buffer[i];
				buffer[i] = placeHolder;
				if (j < maxLength
						&& (value == null || value.matches(arrayMask[j]))) {
					placeHolder = value;
				} else {
					break;
				}
			}
		}
	}

	private String[] split(String text) {
		int length = text.length();
		String[] array = new String[length];
		for (int i = 0; i < length; i++) {
			array[i] = String.valueOf(text.charAt(i));
		}
		return array;
	}

	private void writeBuffer() {
		setValue(getValueBuffer());
	}

	/**
	 * Define valor ao campo, utilizando a mascara ja definida Exemplo:
	 * 
	 * <pre>
	 * TextFieldMask tfm = new TextFieldMask("99999-999");
	 * tfm.setMaskedValue("30455770);
	 * </pre>
	 * 
	 * @param value
	 */
	public void setMaskedValue(String value) {
		setMaskValue(value);
	}

	public TypeFormatting getTypeFormatting() {
		return typeFormatting;
	}

	public void setTypeFormatting(TypeFormatting typeFormatting) {
		this.typeFormatting = typeFormatting;
	}


	public String getValueUnMask(){
        String value = this.getValue();
		String condicao="[\\.\\-\\/\\(\\)]*";
		value = value.replaceAll(condicao,"");
		return value;
	} 
	
}
