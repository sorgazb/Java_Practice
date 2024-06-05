package unidad5.ejerciciosU5;
import java.util.Scanner;
/*
 * Escriba un programa Java para encontrar 
 * el índice de un elemento de matriz.
 */

public class Ejercicio3 {
	
	public static Scanner entrada= new Scanner(System.in);
	
	public static void main(String[] args) {
		//Primero le pedimos al usuario el numero de elementos que debe tener el Array.
		int elementos=numeroElementos();
		
		//Ahora creamos el Array.
		int [] array= new int [elementos];
		
		//Ahora le pedimos al usuario el elemento que quiere almacenar en cada posición del Array.
		introducirValores(array);
		
		//Ahora le mostramos al usuario un mensaje para que introduzca el valor del cual quiere saber su 
		//posición en el Array.
		System.out.print("-Introduce el elemento del cual quiere saber la posición:");
		int numero=entrada.nextInt();
		buscarPosicion(array, numero);
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
	
	private static void buscarPosicion(int [] array,int valor) {
		boolean enc=false;
		int pos=0;
		int i=0;
		while(i<array.length && enc==false) {
			if(array[i]==valor) {
				pos=i;
				System.out.println("-> El elemento "+valor+" se encuentra en la posición: "+pos+" del Array.");
				enc=true;
			}
			i++;
		}
		if(enc==false) {
			System.out.println("-> El elemento "+valor+" no se encuentra en el Array.");
		}
	}

}
