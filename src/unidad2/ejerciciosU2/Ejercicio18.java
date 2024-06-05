package unidad2.ejerciciosU2;
import java.util.Scanner;
/*
 * Realice un programa en Java que nos ayude a convertir divisas Euros/Libreas y
 * viceversa. Consulte a cuanto está el cambio en el momento de realizar el ejercicio.
 */

public class Ejercicio18 {

	public static void main(String[] args) {
		double euros;
		double libras;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce los euros a cambiar a libras:");
		euros=entrada.nextDouble();
		libras=0.87*euros;
		System.out.println(euros+" euros son "+libras+" libras");
		libras=0.0;
		System.out.println("Introduce las libras a cambiar a euros:");
		libras=entrada.nextDouble();
		euros=libras*1.15;
		System.out.println(libras+" libras son "+euros+" euros");
	}

}
