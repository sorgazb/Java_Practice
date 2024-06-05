package unidad3.ejerciciosU3;
import java.util.Scanner;
/*
 * Escriba una aplicación que solicite a un usuario la cantidad de años que el usuario tiene
 * hasta la jubilación y la cantidad de dinero que el usuario puede ahorrar anualmente.
 * Si el usuario infresa 0 o un número negativo para cualquiera de los valores, vuelva
 * a comunicar al usuario hasta que se hagan entradas válidas. Suponga que no se ganan
 * intereses sobre el dinero. Muestra la cantidad de dinero que tendrá el usuario al
 * momento de la jubilación. Guarda el archivo como ObjetivoJubilacion.java.
 * Modifique la aplicación ObjetivoJubilacion para mostrar la cantidad de dinero que el
 * usuario tendrá si el usuario gana 4% de interés sobre el saldo cada año. Guarde la aplicación como 
 * ObjetivoJubilacion2.java
 */
public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		boolean enc=false;
		int aniosRestantes;
		double dineroAhorradoAnio;
		double dinero=0;
		while(!enc) {
			System.out.print("Introduzca la cantidad de años que le quedan para la jubilación:");
			aniosRestantes=entrada.nextInt();
			System.out.print("Introduza la cantidad de dinero que es capaz de ahorrar usted al anio: ");
			dineroAhorradoAnio=entrada.nextDouble();
			if(dineroAhorradoAnio > 0 && aniosRestantes > 0) {
				enc=true;
				dinero=dineroAhorradoAnio*aniosRestantes;
				//Con intereses del 4%
				dinero=((dinero*4)/100) + dinero;
				System.out.println("Usted puede llegar a ahorrar: "+dinero+"€");
			}
			else {
				enc=false;
				System.out.println("Ha introducido unos valores erroneos. Porfavor repita el proceso.");
			}
		}

		
	}
}
