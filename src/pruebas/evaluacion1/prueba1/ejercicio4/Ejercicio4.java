package pruebas.evaluacion1.prueba1.ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {
	
	public static Scanner entrada= new Scanner (System.in);
	
	public static void main(String[] args) {
		funcionalidad();
	}
	
	private static void funcionalidad() {
		char opcion=' ';
		do {
			menu();
			System.out.print("Opcion:");
			opcion=entrada.next().charAt(0);
			switch (opcion) {
			case 'i':
				comprobarDatos();
				break;
			case 'I':
				comprobarDatos();
				break;
			case 's':
				System.out.println("SALIENDO...");
				break;
			case 'S':
				System.out.println("SALIENDO...");
				break;
			default:
				System.out.println("Opcion no valida.");
			}
			
		}while(opcion!='s' && opcion!='S');
		System.out.println("Fin ejecucion.");
	}
	
	private static void comprobarDatos() {
		double temperatura= pedirTemperatura();
		double humedad= humedad();
		int hora=pedirHora();
		funcionTemperatura(temperatura);
		funcionalidadHumedad(humedad);
		funcionalidadHora(hora);
	}
	
	private static void funcionalidadHora(int hora) {
		if(hora==8) {
			System.out.println("Enciendo Motor para girar Huevo...");
		}
		else {
			System.out.println("Motor apagado.");
		}
	}
	
	private static void funcionalidadHumedad(double humedad) {
		if(humedad<75) {
			System.out.println("Llena el Agua...");
		}
		else {
			System.out.println("Nivel de agua Optimo.");
		}
	}
	
	private static void funcionTemperatura(double temperatura) {
		if(temperatura!=37) {
			if(temperatura < 37) {
				System.out.println("Encendiendo Bombilla...");
			}
			else {
				System.out.println("Encendiendo Ventilador...");
			}
		}
		else {
			System.out.println("Temperatura Optima.");
		}
	}
	
	private static void menu() {
		System.out.println("---- MENU INCUBADORA ----");
		System.out.println("i/I-> Introducir valores Incubadora.");
		System.out.println("s/S-> Salir.");
	}
	
	private static double pedirTemperatura() {
		double temperatura;
		System.out.print("Introduce la Temperatura");
		temperatura=entrada.nextDouble();
		return temperatura;
	}
	
	private static double humedad() {
		double humedad=-1;
		boolean fin=false;
		while(!fin) {
			System.out.print("Introduce el % de humedad:");
			humedad=entrada.nextDouble();
			if(humedad<0) {
				System.out.println("No se pueden introducir % de humedad negativos.");
			}
			else {
				fin=true;
			}
		}
		return humedad;
	}
	
	private static int pedirHora() {
		int hora;
		System.out.print("Introduce la Temperatura");
		hora=entrada.nextInt();
		return hora;
	}
	
}
