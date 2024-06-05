package unidad4.ejerciciosU4;
import java.util.Scanner;
/*
 * Escribe un programa que pida la edad por teclado y muestre
 * por pantalla si eres mayor de edad o no. Implementa y utiliza la función: 
 * boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario 
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		int edad;
		Scanner entrada=new Scanner(System.in);
		System.out.print("Introduce tu edad:");
		edad=entrada.nextInt();
		
		if(esMayorEdad(edad)) {
			System.out.println("Mayor edad.");
		}else {
			System.out.println("Menor edad.");
		}
	}
	
	public static boolean esMayorEdad(int a) {
		boolean mayorEdad=false;
		if(a > 17) {
			mayorEdad=true;
		}
		return mayorEdad;
	}

}
