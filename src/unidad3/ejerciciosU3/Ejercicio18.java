package unidad3.ejerciciosU3;
import java.util.Scanner;
/*
 * Realizar un programa que acepte dos números enteros
 * por teclado. A continuación, muestre un menú de 
 * operaciones a realizar con los dos números. Estas
 * operaciones serán: suma, resta, multiplicación y
 * división. Se indicará la letra corespondiente la
 * operación (S,R,M y D). Se mostrará por pantalla
 * el resultado de la operación elegida.
 */

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int primerNumero;
		int segundoNumero;
		char letra;
		System.out.print("primer numero:");
		primerNumero= entrada.nextInt();
		System.out.print("segundo numero:");
		segundoNumero=entrada.nextInt();
		
		System.out.println("----    M E N U    ----");
		System.out.println("S = suma");
		System.out.println("R = resta");
		System.out.println("M = multiplicacion");
		System.out.println("D = division");
		System.out.println("");
		System.out.print("Elija una opcion (S/R/M/D) y enter:");
		letra=entrada.next().charAt(0);
		
		if(letra=='S') {
			System.out.println("La suma es: "+(primerNumero+segundoNumero));
		}else if(letra=='R') {
			System.out.println("La resta es: "+(primerNumero-segundoNumero));
		}else if(letra=='M') {
			System.out.println("La multiplicacion es: "+(primerNumero*segundoNumero));
		}else if(letra=='D') {
			System.out.println("La division es: "+(primerNumero/segundoNumero));
		}else {
			System.out.println("Esa opción no existe");
		}
	}

}
