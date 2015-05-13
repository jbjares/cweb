package br.com.cweb.widgets.util;



/**
 * Represents a CPF.<br>
 * This class executes validation on constructor.<br>
 * You can not try create a CNPJ, it will throw a ValidationException.
 * 
 * @author Douglas Siviotti
 */
public class Cpf extends CpfCnpj {

	public static boolean isValid(String cpf) {
		String s = cpf.replaceAll("[^0-9]*", "");
		if (s.length() == CPF_DIGITS) {
			return CpfCnpj.isValid(cpf);
		}
		return false;
	}

	/**
	 * Default Constructor.
	 * 
	 * @param cpf
	 *            the CPF number
	 * @throws ValidationException
	 */
	public Cpf(String cpf) throws ValidationException {
		super(cpf);
		String s = cpf.replaceAll("[^0-9]*", "");
		if (s.length() != CPF_DIGITS) {
			throw new ValidationException("O CPF deve ter " + CPF_DIGITS
					+ " d�gitos");
		}
	}

	/**
	 * Always return false! The class represents a CPF.
	 * 
	 * @see org.brazilutils.br.cpfcnpj.CpfCnpj#isCnpj()
	 */
	public boolean isCnpj() {
		return false;
	}

	/**
	 * Always return true! The class represents a CPF.
	 * 
	 * @see org.brazilutils.br.cpfcnpj.CpfCnpj#isCpf()
	 */
	public boolean isCpf() {
		return true;
	}
	public static void main(String[] args) {
		Cpf cpf;
		try {
			cpf = new Cpf("18425798000189");
			System.out.println(cpf.getCpfCnpj());
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
