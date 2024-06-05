package unidad10.teoriaU10.crearExcepcion;

public class Demo1 {

	public static void main(String[] args) {
		Demo1 demo=new Demo1();
		try {
			demo.metodoQuePuedeLanzarExcepcion();
		}catch(MiExcepcion exc) {
			System.out.println(exc.getMessage());
			exc.printStackTrace();
		}
	}

	public void metodoQuePuedeLanzarExcepcion() throws MiExcepcion {
		boolean condicion=true;
		if(condicion) {
			throw new MiExcepcion("Se ha producido un pequeño error.");
		}
	}
	
}
