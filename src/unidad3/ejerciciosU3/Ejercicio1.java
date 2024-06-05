package unidad3.ejerciciosU3;
import java.util.Scanner;
/*
 * Codificar un programa que solicite al usuario un numero
 * e indique si es par o impar;
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int numero;
		System.out.print("Introuce un numero: ");
		numero=entrada.nextInt();
		if(numero%2==0) {
			System.out.println("El numero es PAR.");
		}
		else {
			System.out.println("El numero es IMPAR.");
		}
		entrada.close();
	}
}
