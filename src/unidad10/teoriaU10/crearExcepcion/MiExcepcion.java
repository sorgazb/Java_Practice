package unidad10.teoriaU10.crearExcepcion;

public class MiExcepcion extends Exception{
	
	public MiExcepcion(String mensaje) {
		super(mensaje);
	}
	
	public MiExcepcion(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}

}
