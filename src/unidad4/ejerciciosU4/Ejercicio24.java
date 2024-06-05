package unidad4.ejerciciosU4;
import java.util.Scanner;

//HACER DEBUG

/*
 *  La tasa de ocupación de un hotel se calcula de la siguiente manera:
 *  Tasa de ocupación =  
 *  Número de habitaciones ocupadas / Número total de habitaciones
 *  Escribe un programa que calcule la tasa de ocupación para cada piso de un hotel. 
 *  El programa debe comenzar preguntando por el número de pisos del hotel. 
 *  Luego, un bucle debe repetirse una vez para cada piso. Durante cada iteración, 
 *  el bucle debe preguntar al usuario el número de habitaciones en el piso y el número de ellos que están ocupados. 
 *  Después de todas las iteraciones, el programa debe mostrar el número de habitaciones que tiene el hotel, 
 *  el número de ellas que están ocupadas, el número que están vacantes y la tasa de ocupación del hotel.
 *  Validación de entrada: no acepte un valor menor que 1 para el número de pisos. 
 *  No acepto un número menor que 10 para el número de habitaciones en un piso.
 */
public class Ejercicio24 {
	public static Scanner entrada= new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(bucle());
	}
	
	private static int pedirPlantas() {
		int numeroPlantas=0;
		System.out.println("Introduce el numero de Plantas del Hotel:");
		numeroPlantas=entrada.nextInt();
		return numeroPlantas;
	}
	
	private static int pedirNumeroHab() {
		int numeroHab=0;
		System.out.println("Introduce el numero de Habitaciones de la Planta:");
		numeroHab=entrada.nextInt();
		return numeroHab;
	}
	
	private static int pedirNumeroHabOcu() {
		int numeroHab=0;
		System.out.println("Introduce el numero de Habitaciones Ocupadas de la Planta:");
		numeroHab=entrada.nextInt();
		return numeroHab;
	}
	
	private static double bucle() {
		int numeroHab=0;
		int numeroHabPlanta=0;
		int numeroHabOcu=0;
		int numeroHabOcuPlanta=0;
		int numeroPlantas=pedirPlantas();
		for(int i=1; i <= numeroPlantas; i++) {
			numeroHabPlanta=pedirNumeroHab();
			numeroHab=numeroHab+numeroHabPlanta;
			numeroHabOcuPlanta=pedirNumeroHabOcu();
			numeroHabOcu=numeroHabOcu+numeroHabOcuPlanta;
		}
		
		double tasaOcupacion=numeroHabOcu/numeroHab;
		return tasaOcupacion;
	}

}
