package unidad8.ejerciciosU8.ejercicio3;
/*
 * 3. Cree una clase llamada Caballo que contenga campos de datos 
 * para el nombre, el color y el año de nacimiento. 
 * Incluya los métodos get y set para estos campos. A continuación, cree una 
 * subclase llamada CarrerasCaballo, que contiene un campo adicional que contiene el 
 * número de carreras en las que el caballo ha competido y métodos adicionales para obtener 
 * y establecer el nuevo campo. Escriba una aplicación que demuestre el uso de objetos de cada clase.
 * Guarde los archivos como Caballo.java, CarrerasCaballo.java y ProgramaCaballos.java.
 */

public class ProgramaCaballos {
	public static void main(String[] args) {
		Caballo caballo1= new Caballo("Caballo1", "Negro", 2002);
		caballo1.mostrar();
		
		CarrerasCaballo carrera1= new CarrerasCaballo(caballo1.getNombre(), caballo1.getColor(), caballo1.getAnio_Nacimiento(), 0);
		carrera1.mostrar();
		
		caballo1.setNombre("Rocinante");
		caballo1.mostrar();
		carrera1.mostrar();
	}
}
