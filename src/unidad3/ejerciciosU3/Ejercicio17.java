package unidad3.ejerciciosU3;
import java.util.Scanner;
/*
 * La clinica veterinaria ofrece venta de pienso para ganado vacuno al por mayor, teniendo
 * en cuenta que 3 categorías de alimentación: A, B y C.Los precios por kilogramo de pienso
 * son 30, 20 y 15 centimos respectivamente. Realizar un programa que recoja el tipo de pienso
 * que desea el cliente y muestre el precio por pantalla. En caso de elegir una opción no
 * válida, se mostrará un mensaje de error.
 */

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int precioA=30;
		int precioB=20;
		int precioC=15;
		char letra;
		System.out.println("Introduce el tipo de pienso que quiere:");
		System.out.println("A-> Tipo de pienso  1.");
		System.out.println("B-> Tipo de pienso  2.");
		System.out.println("C-> Tipo de pienso  3.");
		System.out.print("Opción:");
		letra=entrada.next().charAt(0);
		if(letra=='A') {
			System.out.println("Usted ha elegido el Tipo de pienso A, con precio "+precioA);
		}else if(letra=='B') {
			System.out.println("Usted ha elegido el Tipo de pienso B, con precio "+precioB);
		}else if(letra=='C') {
			System.out.println("Usted ha elegido el Tipo de pienso C, con precio "+precioC);
		}else {
			System.out.println("Caracter introducido erroneo.");
		}
	}

}
