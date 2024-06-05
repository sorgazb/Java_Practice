package unidad7.ejerciciosU7.ejercicio6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
 * 6.Realiza un programa que sume 4 meses a la 
 * fecha actual y muestra por pantalla la fecha resultante.
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		LocalDate fechaActual = LocalDate.now();
		System.out.println("Fecha Actual: "+fechaActual);
		LocalDate cuatroMeses= fechaActual.plus(4, ChronoUnit.MONTHS);
		System.out.println("Fecha dentro de 4 Meses: "+cuatroMeses);
	}

}
