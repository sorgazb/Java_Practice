package unidad7.ejerciciosU7.ejercicio3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 * Realice un programa en Java que muestre pon pantalla la hora actual 
 * en formato HH:MM:SS.
 */
public class Ejercicio3 {
	
	static LocalTime horaActual;
	
	public static void main(String[] args) {
		
		horaActual= LocalTime.now();// con esto en la variable horaActual almacenamos la 
		                            // la hora del sistema
		
		DateTimeFormatter formato= DateTimeFormatter.ofPattern("HH:mm:ss"); //Establecemos
		                                                                    //el formato de hora
		String hora= formato.format(horaActual);
		System.out.println(hora);
		
	}
}
