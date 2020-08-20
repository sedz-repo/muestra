package co.com.certification.google.excepciones;

public class TiposOpcionesExcepcion extends AssertionError{
	
	public TiposOpcionesExcepcion() {
		super("No se encuentran las opciones");
	}
	
	public TiposOpcionesExcepcion(String mensaje) {
		super(mensaje);
	}
	
	public TiposOpcionesExcepcion(String message, Throwable cause) {
		super(message,cause);
	}

}
