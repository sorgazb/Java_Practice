package unidad5.ejerciciosU5;
import java.util.Scanner;

/*
 * Escriba un programa Java para insertar un elemento 
 * (posición específica) en una matriz.
 */

public class Ejercicio5 {
	
	public static Scanner entrada= new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int nElementos=pedirLongitudArray();
		
		//Declaramos el Array.
		int [] array= new int [nElementos];
		
		introducirValor(array, pedirPosicion(), pedirValor());
		mostrarVector(array);
	}
	
	//Método para añadir la longitud del Array con el que vamos a trabajar.
	private static int pedirLongitudArray() {
		int nElementos;
		System.out.println("-Introduce el número de elementos del Array:");
		nElementos=entrada.nextInt();
		return nElementos;
	}
	
	private static int pedirPosicion() {
		int pos;
		System.out.println("-Introduce la posición en la que quieres introducir el valor:");
		pos=entrada.nextInt();
		return pos;
	}
	
	private static int pedirValor() {
		int valor;
		System.out.println("-Introduce que valor quieres introducir:");
		valor=entrada.nextInt();
		return valor;
	}
	
	private static void introducirValor(int [] array, int pos, int valor) {
		for(int i=0; i < array.length; i++) {
			if(i == (pos-1)) {
				array[i]=valor;
			}
		}
	}
	
	private static void mostrarVector(int [] array) {
		for(int i=0; i < array.length; i++) {
			System.out.print("["+array[i]+"]");
		}
	}

}
