package unidad10.teoriaU10.crearExcepcion;

public class Demo2 {

	public static void main(String[] args) {
		Demo2 demo=new Demo2();
		try {
			demo.metodoQuePuedeLanzarExcepcion();
		}catch(MiExcepcion exc) {
			System.err.println(exc.getMessage());
			System.err.println("Causa de la Execpcion: "+exc.getCause());
		}
	}
	
	public void metodoQuePuedeLanzarExcepcion() throws MiExcepcion {
		boolean condicion=true;
		if(condicion) {
			throw new MiExcepcion("Se ha producido un pequeño error.",
								  new IllegalAccessError());
		}
	}
	

}
