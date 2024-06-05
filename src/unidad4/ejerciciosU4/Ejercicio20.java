package unidad4.ejerciciosU4;
import java.util.Scanner;
import java.util.*;
/*
 * Escribe un programa que muestre un menú con 2 opciones: 
 * “1.Circunferencia” y “2.Área”. En ambas se le pedirá al usuario que introduzca un 
 * radio y luego se le mostrará el cálculo oportuno. Implementa las funciones: 
 * -int menu() // Muestra el menú y devuelve el número elegido 
 * -double pideRadio() // Pide que se introduzca el radio y lo devuelve 
 * -double circunferencia(double r) // Calcula la circunferencia y la devuelve 
 * -double area(double r) // Calcula el área y la devuelve.
 * -Modifica el programa añadiendo otra opción llamada “Volumen”, permitiendo que el usuario también pueda solicitar 
 * el cálculo del volumen. Añade la función: 
 * -double volumen(double r) // Calcula el volumen y lo devuelve 
 * 
 * Modifica el programa añadiendo otra opción llamada “Todas” en la que se pida el radio una sola vez y se
 * muestren los tres cálculos posibles (circunferencia, área y volumen). 
 * 
 * Modifica el programa anterior de modo que el proceso se repita una y otra vez 
 * (mostrar menú -> realizar el cálculo -> volver a mostrar menú). 
 * Añade una opción más llamada “Salir” que terminará el programa si es elegida. 
 */

public class Ejercicio20 {
	public static Scanner entrada= new Scanner(System.in);
	public static final double PI=3.1416;

	public static void main(String[] args) {
		pedirMenu();
	}
	
	private static void menu() {
		System.out.println("----- MENÚ -----");
		System.out.println("1.Circunferencia");
		System.out.println("2.Área");
		System.out.println("3.Volumen");
		System.out.println("4.Realizar Todas");
		System.out.println("0.Salir");
		System.out.println("----------------");
	}
	
	private static void pedirMenu() {
		double radio=0;
		int opcion;
		do {
			menu();
			System.out.print("Opción:");
			opcion=entrada.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("OPERACIÓN 1 -> Calcular Circunferencia:");
				radio=pedirRadio();
				System.out.println("La circunferencia es= "+calcularCircunferencia(radio)); 
				break;
			case 2:
				System.out.println("OPERACIÓN 2 -> Calcular Area:");
				radio=pedirRadio();
				System.out.println("El area es="+calcularArea(radio));
				break;
			case 3:
				System.out.println("OPERACIÓN 3 -> Calcular Volumen:");
				radio=pedirRadio();
				System.out.println("El volumen es="+calcularVolumen(radio));
				break;
			case 4:
				System.out.println("OPERACIÓN 4 -> Calcular Todas las Operaciones:");
				radio=pedirRadio();
				calcularTodasOperaciones(radio);
				break;
			case 0:
				System.out.println("SALIENDO ...");
				break;
			default:
				System.out.println("Esa opción no es válida, porfavor introduce otra.");
				break;
			}
		}while(opcion!=0);
		System.out.println("GRACIAS POR SU VISITA");
	}
	
	private static double pedirRadio() {
		double radio=0;
		boolean fin=false;
		while(!fin) {
			System.out.print("Porfavor introduzca el radio de su circunferencia(valor > 0):");
			radio=entrada.nextDouble();
			if(radio > 0) {
				fin=true;
			}
			else {
				fin=false;
			}
		}
		return radio;
	}
	
	private static double calcularCircunferencia(double radio) {
		double res=0;
		res=PI*(radio*2);
		return res;
	}
	private static double calcularArea(double radio) {
		double res=0;
		res=PI*(radio*radio);
		return res;
	}
	
	private static double calcularVolumen(double radio) {
		double res=0;
		res=(4/3)*PI*(Math.pow(radio,3));
		return res;
	}
	
	private static void calcularTodasOperaciones(double radio) {
		double area=calcularArea(radio);
		double circunferencia=calcularCircunferencia(radio);
		double volumen=calcularVolumen(radio);
		System.out.println("La circunferencia es="+circunferencia);
		System.out.println("El area es="+area);
		System.out.println("El volumén es="+volumen);
	}
	
}
