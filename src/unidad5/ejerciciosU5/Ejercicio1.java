package unidad5.ejerciciosU5;
import java.util.Scanner;
/*
 * Escriba un programa Java para calcular el valor 
 * promedio de los elementos de la matriz.
 */

public class Ejercicio1 {
	
	public static Scanner entrada= new Scanner(System.in);

	public static void main(String[] args) {
		int numElementos=numeroElementos();
		int [] array= new int [numElementos];
		introducirValores(array);
		//comentario21565
		recorrerMedia(array);
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
	
	private static void recorrerMedia(int [] array) {
		int media=0;
		int suma=0;
		for(int i=0; i < array.length; i++) {
			suma=suma+array[i];
		}
		media=suma/array.length;
		System.out.println("El valor promedio del array es: "+media);
	}

}
