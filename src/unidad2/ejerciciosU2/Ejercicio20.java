package unidad2.ejerciciosU2;
import java.util.Scanner;
/*
 * Escribe una aplicación que introduzca del usuario el radio de un círculo 
 * como un número entero e imprima el diámetro, la circunferencia y el área del círculo 
 * utilizando el valor en coma flotante 3.14159 para π. 
 * Utiliza las siguientes fórmulas (r es el radio):
 * diámetro = 2r 
 * circunferencia = 2πr 
 * área = πr2
 * No almacene los resultados de cada cálculo en una variable. En su lugar, especifique 
 * cada cálculo como el valor que se mostrará en una sentencia System.out.printf. 
 * Los valores producidos por los cálculos de circunferencia y área son números en coma flotante. 
 * Tales valores pueden ser mostrados con el especificador de formato %f 
 * en una sentencia System.out.printf. 
 */

public class Ejercicio20 {

	public static void main(String[] args) {
		int r;
		final double pi=3.1416;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el radio del circulo:");
		r=entrada.nextInt();
		System.out.println("El diametro del circulo es: "+2*r);
		System.out.println("La circunferencia es: "+2*pi*r);
		System.out.println("El area de la circunferencia es: "+pi*r*r);
	}

}
