package lfp;

public class ExcepcionLiga extends Exception{

	public ExcepcionLiga() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExcepcionLiga(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ExcepcionLiga(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ExcepcionLiga(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ExcepcionLiga(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Excepcion de LFP: " + super.getMessage();
	}
	
	
	
	
}
