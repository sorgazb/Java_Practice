package unidad4.ejerciciosU4;
import java.util.Scanner;
/*
 * Realice un programa que proporcione la suma desde 1 hasta un número introducido
 * por el usuario. Realice la solución utilizando recursividad.
 */

public class Ejercicio21 {
	
	public static Scanner entrada= new Scanner (System.in);

	public static void main(String[] args) {
		System.out.println("----SOLUCIÓN ITERATIVA----");
		System.out.print("Introduce el número hasta el que quieres sumar:");
		int numeroFin=entrada.nextInt();
		System.out.println("El Resultado es="+suma(numeroFin));
		System.out.println("----SOLUCIÓN RECURSIVA----");
		System.out.print("Introduce el número hasta el que quieres sumar:");
		numeroFin=entrada.nextInt();
		System.out.println("El Resultado es="+sumarRecursivo(numeroFin));
	}
	
	private static int suma(int numeroFin) {
		int res=0;
		for(int i=1; i <= numeroFin; i++) {
			res=res+i;
		}
		return res;
	}
	
	private static int sumarRecursivo(int numeroFin) {
		int res=0;
		if(numeroFin<=1) {
			res=1;
		}else {
			res=numeroFin+(suma(numeroFin-1));
		}
		return res;
	}

}
