package unidad5.ejerciciosU5;
import java.util.Scanner;

/*
 * Cree una aplicación que contenga un array que almacene ocho enteros. 
 * La aplicación debe llamar a cinco métodos:(1) muestran todos los enteros, 
 * (2) muestran todos los enteros en orden inverso, (3) muestran la suma de los enteros, 
 * (4) muestran todos los valores menores que un argumento limitante, y 
 * (5) muestra todos los valores que son más altos que el valor promedio calculado. 
 * Guarde el archivo como MetodosArray.java
 */

public class Ejercicio12 {
	
	public static Scanner entrada= new Scanner(System.in);

	public static void main(String[] args) {
		
		int longitud=pedirLongitud();
		int [] array= new int [longitud];
		rellenarArray(array);
		mostrarArray(array);

	}
	
	private static void menu() {
		System.out.println("---- MENÚ ----");
		System.out.println("1->Mostrar todos los elementos.");
		System.out.println("2->Mostrar elementos orden inverso.");
		System.out.println("3->Mostrar suma de los elementos.");
		System.out.println("4->Mostrar valores del Array menores de N.");
		System.out.println("5->Mostrar valores más altos que el promedio.");
	}
	
	private static int pedirLongitud() {
		int longitud;
		System.out.print("Introduce la longitud del Array:");
		longitud=entrada.nextInt();
		return longitud;
	}
	
	private static void rellenarArray(int [] array) {
		for(int i=0; i < array.length; i++) {
			System.out.println("Introduce valor posición "+i+":");
			array[i]=entrada.nextInt();
		}
	}
	
	private static void mostrarArray(int [] array) {
		for(int i=0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
