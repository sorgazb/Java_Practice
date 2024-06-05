package unidad7.ejerciciosU7.ejercicio4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * 4.Realice un programa en Java que 
 * muestre por pantalla la fecha actual en formato dd-mm-aaaa.
 */
public class Ejercicio4 {
	
	
	
	public static void main(String[] args) {
		
		LocalDate fechaActual= LocalDate.now(); // almacenamos en la variable fechaActual la fecha del sistema
		DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd-MM-yyyy");// establecemos el formato de fecha
		String fecha= formato.format(fechaActual);
		System.out.println(fecha);

	}

}
