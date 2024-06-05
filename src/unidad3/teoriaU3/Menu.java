package unidad3.teoriaU3;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int opcion;
		int anio;
		do {
			System.out.println("-------MENU-------");
			System.out.println("1.Calcular si el año es bisiesto.");
			System.out.println("2.Salir.");
			System.out.println("------------------");
			System.out.print("Opción:");
			opcion=entrada.nextInt();
			if(opcion==1) {
				System.out.println("Ha elegido la opción 1.");
				System.out.print("Introduzca un año:");
				anio=entrada.nextInt();
				//Para saber si un año es bisiesto si es divisible por 4 y no por 100.
				//O divisible por 400.
				if( (anio%4==0 && anio%100!=0) || anio%400==0) {
					System.out.println("El año "+anio+" es bisiesto.");
				}
				else {
					System.out.println("El año "+anio+" no es bisiesto.");
				}
			}else if(opcion==2) {
				System.out.println("Gracias.Hasta la próxima.");
			}
			else {
				System.out.println("La opcion no es válida.Intentelo de nuevo.");
			}
		}while(opcion!=2);
	}
}
