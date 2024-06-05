package unidad2.ejerciciosU2;
import java.util.Scanner;
/*
 * Nos piden realizar un programa que a partir del peso expresado en gramos nos muestre su equivalencia
 * en kilogramos, libras y onzas.Hay que tener en cuenta que:
 * -1libra(lb) =16 onzas(oz)= 0,454 kilogramos(kg)
 * -1 kilogramo= 2,2 libras
 * -1 oz= 28,35 gramos(g)
 * 1 gramo=0,035 oz
 */

public class Ejercicio23 {

	public static void main(String[] args) {
		double gramos;
		Scanner entrada= new Scanner(System.in);
		System.out.print("Introduce una cantidad en gramos: ");
		gramos=entrada.nextDouble();
		double oz=gramos*0.035;
		double lb=gramos*0.0022;
		double kg=gramos/1000;
		System.out.println(oz+" "+lb+" "+kg);
	}
}
