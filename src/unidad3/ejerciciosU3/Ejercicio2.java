package unidad3.ejerciciosU3;
import java.util.Scanner;

/*
 * Pedir dos numeros y mostrarlos ordenados de forma 
 * decreciente.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		int numero1, numero2;
		Scanner entrada= new Scanner(System.in);
		System.out.print("Introduce el primer numero:");
		numero1= entrada.nextInt();
		System.out.print("Introduce el segundo numero:");
		numero2= entrada.nextInt();
		if(numero1>numero2) {
			System.out.println("El orden es: "+numero1+" y "+numero2);
		}
		else {
			System.out.println("El orden es: "+numero2+" y "+numero1);
		}
		entrada.close();
	}

}
