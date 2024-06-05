package unidad3.ejerciciosU3;
import java.util.Scanner;
/*
 * Escribir un programa que indique cuántas cifras tiene un número entero introducido 
 * por teclado, que estará comprendido entre 0 y 99999.
 */

public class Ejercicio7 {

	public static void main(String[] args) {
		int numero;
		Scanner entrada= new Scanner(System.in);
		System.out.print("Introduce un numero comprendido entre 0 y 99999:");
		numero=entrada.nextInt();
		if(numero>=0 && numero<100000) {
			int cifras=0;
			while(numero>0) {
				numero=numero/10;
				cifras++;
			}
			System.out.println("El numero tiene "+cifras+" cifras.");
		}
		else {
			System.out.println("El numero introducido "+numero+" no es valido.");
		}
	}

}
