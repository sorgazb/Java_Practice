package pruebas.evaluacion1.prueba2.ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static Scanner entrada= new Scanner(System.in);
	
	public static final int TAM_APUESTA=6;

	public static void main(String[] args) {
		
		int [] apuestaPersonal= new int [TAM_APUESTA];
		int [] apuestaGanadora= new int [TAM_APUESTA];

		
		funcionalidad(apuestaPersonal, apuestaGanadora);
	}
	
	
	private static void pedirNumerosApuesta(int [] apuesta) {
		int num;
		for(int i=0; i < apuesta.length; i++) {
			System.out.println("Introduce el numero "+(i+1)+":");
			num=entrada.nextInt();
			if(num>0 && num<100) {
				apuesta[i]=num;
			}
		}
	}
	
	private static void mostrar(int [] apuesta) {
		for(int i=0; i < apuesta.length; i++) {
			System.out.print("["+apuesta[i]+"]");
		}
	}
	
	private static double pedirTotalApostado() {
		double apostado=0;
		boolean fin=false;
		while(!fin) {
			System.out.print("Introduce el total apostado:");
			apostado=entrada.nextDouble();
			if(apostado>0) {
				fin=true;
			}
		}
		return apostado;
	}
	
	private static void obtenerPremio(int [] aPersonal, int [] aGanadora,double premio) {
		double posiblepremio=0;
		int totAciertos=0;
		for(int i=0; i < aGanadora.length; i++) {
			for(int j=0; j < aPersonal.length; j++) {
				if(aPersonal[j]==aGanadora[i]) {
					totAciertos++;
					System.out.println("Tienes el número "+aGanadora[i]+" de la apuesta Ganadora.");
				}
			}
		}
		if(totAciertos == 6) {
			posiblepremio=premio*0.5;
		}else if(totAciertos==5) {
			posiblepremio=premio*0.25;
		}else if(totAciertos==4) {
			posiblepremio=premio*0.15;
		}else if(totAciertos==3) {
			posiblepremio=premio*0.05;
		}else {
			System.out.println("Lo siento, no ha obtenido premio.");
		}
		
		if(posiblepremio>0) {
			System.out.println("Ha ganado "+posiblepremio+"€");
		}
		
	}
	
	private static void mostrarMenu() {
		System.out.println("--- MENU APUESTA ----");
		System.out.println("1-> Introducir numeros apuesta ganadora.");
		System.out.println("2-> Introducir numeros apuesta personal.");
		System.out.println("3-> Introducir recaudación sorteo.");
		System.out.println("4-> Mostrar Premio.");
	}
	
	private static void funcionalidad(int [] aPersonal, int [] aGanadora) {
		double recaudado=0;
		int opcion=0;
		double premioTotal=0;
		do {
			mostrarMenu();
			System.out.print("Opción:");
			opcion=entrada.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("1-> Introducir numeros apuesta ganadora.");
				pedirNumerosApuesta(aGanadora);
				mostrar(aGanadora);
				break;
			case 2:
				System.out.println("2-> Introducir numeros apuesta personal.");
				pedirNumerosApuesta(aPersonal);
				mostrar(aPersonal);
				break;
			case 3:
				System.out.println("3-> Introducir recaudación sorteo.");
				recaudado=pedirTotalApostado();
				premioTotal=(recaudado*0.55);
				System.out.println("El premio total es: "+premioTotal+" €.");
				break;
			case 4:
				System.out.println("4-> Mostrar Premio.");
				obtenerPremio(aPersonal, aGanadora, premioTotal);
				break;
			default:
				System.out.println("ERROR. Opción no valida.");
				break;
			}
		}while(opcion!=4);
	}

}
