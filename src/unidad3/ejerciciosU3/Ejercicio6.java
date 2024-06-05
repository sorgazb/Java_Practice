package unidad3.ejerciciosU3;
import java.util.Scanner;

/*
 * Se ingresa por teclado un número positivo de 
 * uno o dos digitos(1.99) mostrar un mensaje indicando
 * si el numero tiene uno o dos digitos(Tener en cuenta que 
 * condición debe cumplirse para tener dos digitos, un numero
 * entero)
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		int numero;
		Scanner entrada= new Scanner(System.in);
		System.out.print("Introduce un numero de 1 o 2 cifras:");
		numero=entrada.nextInt();
		if(numero<100 && numero>=0) {
			if(numero > 9) {
				System.out.println("El numero "+numero+" tiene dos digitos.");
			}
			else {
				System.out.println("El numero "+numero+" tiene un digito.");
			}
		}
		else {
			System.out.println("El numero "+numero+" introducido no cumple los requisitos.");
		}	
		entrada.close();
	}
}
