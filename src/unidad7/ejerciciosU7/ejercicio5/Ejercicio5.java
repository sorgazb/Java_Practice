package unidad7.ejerciciosU7.ejercicio5;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 * 5.Escriba un programa en Java que muestre por pantalla el mensaje de 
 * “Son las hh horas y mm minutos”.
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		LocalTime horaActual = LocalTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("'Son las' HH 'horas y' mm 'minutos'" );
		String hora= formato.format(horaActual);
		System.out.println(hora);
	}

}
