package unidad3.ejerciciosU3;
import java.util.Scanner;
/*
 * Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente(de 0 a 4), Suficiente(5),
 * Bien (6), Notable (7 y 8) y Sobresaliente (9 y 10).
 */

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		float nota;
		System.out.println("Introduce una nota: ");
		nota=entrada.nextFloat();
		if(nota >= 0 && nota < 5) {
			System.out.println("Insuficiente");
		}else if(nota >= 5 && nota < 6) {
			System.out.println("Suficiente");
		}else if(nota >= 6 && nota < 7) {
			System.out.println("Bien");
		}else if(nota >= 7 && nota < 9) {
			System.out.println("Notable");
		}else if(nota >= 9 && nota <= 10) {
			System.out.println("Sobresaliente");
		}
	}

}
