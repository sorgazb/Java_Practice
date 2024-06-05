package unidad3.ejerciciosU3;
import java.util.Scanner;
/*
 * Solicitar dos numeros distintos y mostrar solo el
 * mayor.
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int numero1,numero2;
		System.out.print("Introduce el primer numero: ");
		numero1= entrada.nextInt();
		System.out.print("Introduce el segundo numero: ");
		numero2=entrada.nextInt();
		if(numero1>numero2) {
			System.out.println("El numero mayor es: "+numero1);
		}
		else {
			System.out.println("El numero mayor es: "+numero2);
		}
		entrada.close();
	}

}
