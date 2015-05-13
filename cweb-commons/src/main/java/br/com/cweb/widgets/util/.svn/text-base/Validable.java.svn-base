
package br.com.cweb.widgets.util;

public interface Validable {
    
    /** <b>SILENT VALIDATION</b>
     * @return true if is valid, false if is not valid
     */
    boolean isValid();
    
    /** <b> NOISY VALIDATION </b><br>
     * if the object is not valid throws a Exception<br>
     * often implemented like this:<br>
     * <code>
     * if (!isValid()) throw new ValidationException();
     * </code>     
     * @throws Exception
     */
    void validate() throws ValidationException;

}
