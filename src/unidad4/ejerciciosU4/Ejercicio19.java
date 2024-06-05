package unidad4.ejerciciosU4;
import java.util.Scanner;
/*
 * Cree una aplicación llamada ProgramaNumeros cuyo método main () contenga dos variables enteras. 
 * Asigna valores a las variables. A su vez, pase cada valor a métodos llamados mostrarDobleNumero(), 
 * mostrar5vecesNumero () y mostrarCuadradoNumero(). Cree cada método para realizar la tarea que su nombre implica. 
 * Guarde la aplicación como ProgramaNumeros.java.
 * Modifique la clase ProgramaNumeros para aceptar los valores de los enteros por el teclado. 
 * Guarde el archivo como ProgramaNumeros2.java
 */

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int numero1, numero2;
		System.out.print("Introduce el primer número:");
		numero1=entrada.nextInt();
		System.out.print("Introduce el segundo número:");
		numero2=entrada.nextInt();
		System.out.println("Número-1:");
		menuNumero1(numero1);
		System.out.println("Número-2:");
		menuNumero2(numero2);
		entrada.close();

	}
	
	public static void menuNumero1(int num1) {
		System.out.println("Doble número="+devolverDoble(num1));
		System.out.println("Doble número="+devolver5Veces(num1));
		System.out.println("Doble número="+devolverCuadrado(num1));
	}
	
	public static void menuNumero2(int num2) {
		System.out.println("Doble número="+devolverDoble(num2));
		System.out.println("Doble número="+devolver5Veces(num2));
		System.out.println("Doble número="+devolverCuadrado(num2));
		
	}
	
	public static int devolverDoble(int num) {
		return num*2;
	}
	
	public static int devolver5Veces(int num) {
		return num*5;
	}
	
	public static int devolverCuadrado(int num) {
		return num*num;
	}

}
