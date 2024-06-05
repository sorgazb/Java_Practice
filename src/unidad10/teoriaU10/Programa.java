package unidad10.teoriaU10;

public class Programa {

	//Lanzamos excepciones de un método a otro, hasta que uno lo trate.
	
	public static void main(String[] args) {
		try {
			metodo1();
		} catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void metodo1() throws IllegalAccessException {
		metodo2();
	}
	
	public static void metodo2() throws IllegalAccessException {
		lanzarExcepcion();
	}
	
	public static void lanzarExcepcion() throws IllegalAccessException {
		try {
			System.out.println("Lanzamos una Excepción");
			throw new IllegalAccessException("Error producido en lanzarExcepcion");
		}catch(IllegalAccessException exc) {
			throw exc;
		}
	}

}
