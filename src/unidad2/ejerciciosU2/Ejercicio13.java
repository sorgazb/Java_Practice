package unidad2.ejerciciosU2;
import java.util.Scanner;

public class Ejercicio13 {
	/*
	 * Escribe un programa que calcule el área y la circunferencia de un círculo cuyo radio estará
	 * almacenado en una variable entera llamada "r".Tal vez necesites buscar las fórmulas para calcular
	 * ambas magnitudes. Comprueba que el programa funciona correctamente para cualquier valor de r.
	 */

	public static void main(String[] args) {
		int r;
		final double pi=3.14;
		double area;
		double circunferencia;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el valor del radio: ");
		r=entrada.nextInt();
		area=pi*r*r;
		System.out.println("El area de la circunferencia es: "+area);
		circunferencia=2*pi*r;
		System.out.println("La circunferencia es: "+circunferencia);
		
	}

}
