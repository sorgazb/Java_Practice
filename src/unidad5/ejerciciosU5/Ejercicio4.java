package unidad5.ejerciciosU5;
import java.util.Scanner;

/*
 * Escriba un programa Java para eliminar un elemento
 * específico de una matriz.
 * 
 * (En este caso vamos a suponer de que estamos en el caso de un Array de enteros)
 */
public class Ejercicio4 {
	
	public static Scanner entrada= new Scanner(System.in);

	public static void main(String[] args) {
		//Primero le pedimos al usuario el numero de elementos que debe tener el Array.
		int elementos=numeroElementos();
				
		//Ahora creamos el Array.
		int [] array= new int [elementos];
				
		//Ahora le pedimos al usuario el elemento que quiere almacenar en cada posición del Array.
		introducirValores(array);
		mostrarVector(array);
		
		//Ahora introducimos la parte de borrar.
		System.out.println("Introduce la posición a borrar:");
		int pos=entrada.nextInt();
		borrarValor(array, pos);
		mostrarVector(array);
		
		//ah
	}
	
	private static int numeroElementos() {
		int numero;
		System.out.print("-Introduce el número de elementos del Array:");
		numero=entrada.nextInt();
		return numero;
	}
	
	private static void introducirValores(int [] array) {
		for(int i=0; i < array.length; i ++) {
			System.out.println("Introduce el valor de la posición "+i);
			array[i]=entrada.nextInt();
		}
	}
	
	private static void mostrarVector(int [] array) {
		for(int i=0; i < array.length; i++) {
			System.out.print("["+array[i]+"]");
		}
	}
	
	private static void borrarValor(int [] array, int valor) {
		boolean enc=false;
		int i=0;
		while(i<array.length && enc==false) {
			if(array[i]==valor) {
				array[i]=0;
				enc=true;
			}
			i++;
		}
		if(enc==false) {
			System.out.println("Ese elemento no se encuentra dentro.");
		}
	}

}
