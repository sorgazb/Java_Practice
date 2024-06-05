package unidad5.ejerciciosU5;
import java.util.Scanner;
/*
 * Escriba un programa Java para encontrar el 
 * valor máximo y mínimo de una matriz.
 */

public class Ejercicio6 {
	
	public static Scanner entrada= new Scanner(System.in);
	
	public static void main(String[] args) {
		int longitud=pedirLongitud();
		int [] array= new int [longitud];
		introducirValores(array);
		mostrarArray(array);
		int menor=devolverMenor(array);
		System.out.println("El menor es:"+menor);
		int mayor=devolverMayor(array);
		System.out.println("El mayor es:"+mayor);
	}
	
	private static int pedirLongitud() {
		int longitud;
		System.out.println("-Inrtroduce la longitud del Array:");
		longitud=entrada.nextInt();
		return longitud;
	}
	
	private static void introducirValores(int [] array) {
		int valor;
		for(int i=0; i < array.length; i++) {
			System.out.println("-Introduce el valor de la posición "+i+":");
			valor=entrada.nextInt();
			array[i]=valor;
		}
	}
	
	private static void mostrarArray(int [] array) {
		for(int i=0; i < array.length; i++) {
			System.out.print("["+array[i]+"]");
		}
	}
	
	private static int devolverMenor(int [] array) {
		int menor;
		int menorHastaAhora;
		menorHastaAhora=array[0];
		for(int i=1; i<array.length; i++) {
			if(menorHastaAhora > array[i]) {
				menorHastaAhora=array[i];
			}
		}
		menor=menorHastaAhora;
		return menor;
	}
	
	private static int devolverMayor(int [] array) {
		int mayor;
		int mayorHastaAhora;
		mayorHastaAhora=array[0];
		for(int i=1; i<array.length; i++) {
			if(mayorHastaAhora > array[i]) {
				mayorHastaAhora=array[i];
			}
		}
		mayor=mayorHastaAhora;
		return mayor;
	}

}
