package lfp;

public class NoExisteEquipoExcepcion extends Exception {

	private static final long serialVersionUID = 1L;

	public NoExisteEquipoExcepcion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoExisteEquipoExcepcion(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NoExisteEquipoExcepcion(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoExisteEquipoExcepcion(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NoExisteEquipoExcepcion(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Excepcion de LFP: " + super.getMessage();
	}
	
}
