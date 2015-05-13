package br.com.cweb.widgets.util;



/**Represents a CNPJ.<br>
 * This class executes validation on constructor.<br> 
 * You can not try create a CPF, 
 * it will throw a ValidationException.
 * @author Douglas Siviotti
 */
public class Cnpj extends CpfCnpj {
	
	public static boolean isValid(String cnpj) {
		String s = cnpj.replaceAll("[^0-9]*", "");
		if (s.length() == CNPJ_DIGITS) {
			return CpfCnpj.isValid(cnpj);
		}
		return false;
	}

    /**Default constructor.
     * @param cnpj the CNPJ number
     * @throws ValidationException
     */
    public Cnpj(String cnpj) throws ValidationException {     
        super(cnpj);
        String s = cnpj.replaceAll("[^0-9]*","");
        if (s.length() != CNPJ_DIGITS) {
            throw new ValidationException("O CPF deve ter " 
                    + CNPJ_DIGITS + " dgitos");
        }       
    }
    /**Always return true! The class represents a CNPJ. 
     * @see org.brazilutils.br.cpfcnpj.CpfCnpj#isCnpj()
     */
    public boolean isCnpj() {
        return true;
    }
    /**Always return false! The class represents a CNPJ. 
     * @see org.brazilutils.br.cpfcnpj.CpfCnpj#isCpf()
     */
    public boolean isCpf() {
        return false;
    }

	public static void main(String[] args) {
		Cnpj cnpj;
		try {
			cnpj = new Cnpj("18425798000189");
			System.out.println(cnpj.getCpfCnpj());
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
