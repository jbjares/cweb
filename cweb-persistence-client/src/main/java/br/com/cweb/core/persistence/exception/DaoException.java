package br.com.cweb.core.persistence.exception;



public class DaoException extends Exception {
	private static final long serialVersionUID = 3328934L;

	public DaoException(String msg) {
		super(msg);
	}

	public DaoException(Throwable cause) {
		super(cause);
	}

}