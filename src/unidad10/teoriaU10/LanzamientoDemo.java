package unidad10.teoriaU10;

public class LanzamientoDemo {

	public static void main(String[] args){
		try {
			lanzarException();
		} catch (IllegalAccessException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void lanzarException() throws IllegalAccessException{
		System.out.println("Lanzamos una Excepción.");
		throw new IllegalAccessException("Error producido en el método lanzarException.");
	}

}
