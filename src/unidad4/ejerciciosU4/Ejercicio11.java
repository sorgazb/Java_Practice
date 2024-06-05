package unidad4.ejerciciosU4;
import java.util.Scanner;

/*
 * Escribe un programa que pida un valor entero en millas y muestre su equivalente
 * en kilómetros. Recuerda que una milla son 1.60934 kilómetros. Implementa y utiliza
 * la función: double millas_a_kilometros(int millas)//Devuelva la conversión de millas a kilometros.
 */

public class Ejercicio11 {
	
	//Creamos una constante para el valor equivalente de milla a km.
	public final static double MILLA_X_KM=1.60934;

	//Método principal el cual nos permite introducir el numero de millas que queremos convertir a km.
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce el número de millas:");
		int millas=entrada.nextInt();
		System.out.println("Son equivalentes a "+millas_a_kilometros(millas)+" km");
		
		entrada.close();
	}
	
	//Metodo de conversión de millas a km.
	public static double millas_a_kilometros(int millas) {
		double km;
		km=millas*MILLA_X_KM;
		return km;
	}

}
