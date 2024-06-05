package unidad5.ejerciciosU5;

import java.util.Scanner;
import java.util.Scanner;

/*
 * Escriba un programa Java para probar si 
 * una matriz contiene un valor específico.
 */

public class Ejercicio2 {

	public static Scanner entrada= new Scanner(System.in);
	
	public static void main(String[] args) {
		int numElementos=numeroElementos();
		int [] array= new int [numElementos];
		introducirValores(array);
		System.out.println("Introduce el valor que quieres buscar:");
		int elemento=entrada.nextInt();
		buscarElemento(array, elemento);
	}
	
	private static int numeroElementos() {
		int numero;
		System.out.println("Introduce el numero de elemtos del array");
		numero=entrada.nextInt();
		return numero;
	}
	
	private static void introducirValores(int [] array) {
		for(int i=0; i < array.length; i ++) {
			System.out.println("Introduce el valor de la posición "+i);
			array[i]=entrada.nextInt();
		}
	}
	
	private static void buscarElemento(int [] array, int elemento) {
		for(int i=0; i < array.length; i++) {
			if(array[i]==elemento) {
				System.out.println("El elemento "+elemento+" está en la posición "+i);
			}
		}
	}

}
