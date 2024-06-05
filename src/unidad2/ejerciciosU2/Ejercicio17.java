package unidad2.ejerciciosU2;
import java.util.Scanner;
public class Ejercicio17 {
	/*
	 * Desarrollar un programa Java que realice la conversión de grados Fahrenheit a Celsius y viceversa,
	 * teniendo en cuenta que la fórmula para pasa de Fahrenheit a Celsius es (ºF-32)*5/9=ºC y para pasar
	 * de Celsius a Fahrenheit (ºC * 9/5)+32=ºF.
	 */

	public static void main(String[] args) {
		double celsius;
		double fahrenheit;
		Scanner entrada= new Scanner(System.in);
		int opcion;
		System.out.println("Introduce si quieres pasar de ºC a Fº o de Fº a ºC:");
		System.out.println("Opción 1: ºC a ºF:");
		System.out.println("Opción 2: ºF a ºC:");
		System.out.print("Opcion:");
		opcion=entrada.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("Ha elegido de ºC a ºF");
			System.out.print("Introdice los ºC:");
			celsius=entrada.nextDouble();
			fahrenheit=(celsius*1.8)+32;
			System.out.println(celsius+"º son "+fahrenheit+"º.");
			break;
		case 2:
			System.out.println("Ha elegido de ºF a ºC");
			System.out.print("Introdice los ºF:");
			fahrenheit=entrada.nextDouble();
			double div=(5.0/9.0);
			celsius=((fahrenheit-32)*div);
			System.out.println(fahrenheit+"º son "+celsius+"º.");
			break;
		default:
			System.out.println("Esa opcion no es valida.");
			break;
		}
	
		
	}

}
