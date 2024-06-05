package unidad5.teoriaU5;
import java.util.Scanner;

public class ParkingManager {
	
	public static Scanner entrada= new Scanner(System.in);
	

	public static void main(String[] args) {
		int fila=pedirFila();
		int columna=pedirColumna();
		String [][] matrizAparcamiento= new String [fila][columna];
		iniciarParkingVacio(fila,columna,matrizAparcamiento);
		funcionalidadParking(fila, columna, matrizAparcamiento);
	}
	
	private static void mostrarParking(int fila, int columna, String [][] matrizAparcamiento) {
		System.out.println("--- ESTADO PARKING ---");
		for(int i=0; i < fila; i++) {
			for(int j=0; j < columna; j++) {
				System.out.print("["+matrizAparcamiento[i][j]+"]");
			}
			System.out.println("");
		}
	}
	
	private static void iniciarParkingVacio(int fila, int columna, String [][] matrizAparcamiento) {
		for(int i=0; i < fila; i++) {
			for(int j=0; j < columna; j++) {
				matrizAparcamiento[i][j]="L";
			}
		}
	}
	
	private static int pedirFila() {
		int numFila=0;
		boolean fin=false;
		while(!fin) {
			System.out.println("-Introduce el nº de Filas del Parking:");
			numFila=entrada.nextInt();
			if(numFila>=0) {
				fin=true;
			}
		}
		return numFila;
	}
	
	private static int pedirColumna() {
		int numColumna=0;
		boolean fin=false;
		while(!fin) {
			System.out.println("-Introduce el nº de Columnas del Parking:");
			numColumna=entrada.nextInt();
			if(numColumna>=0) {
				fin=true;
			}
		}
		return numColumna;
	}
	
	private static void funcionalidadOcupar(String [][] matrizAparcamiento,int fila, int columna) {
		int filaOcupar=0;
		int columnaOcupar=0;
		boolean fin=false;
		while(!fin) {
			filaOcupar=pedirFila();
			if(filaOcupar>=0 && filaOcupar<=fila) {
				columnaOcupar=pedirColumna();
				if(columnaOcupar>=0 && columnaOcupar<=columna) {
					ocuparPlaza(filaOcupar, columnaOcupar, matrizAparcamiento);
					fin=true;
				}
				else {
					System.out.println("Columna NO VALIDA.");
				}
			}
			else {
				System.out.println("Fila NO VALIDA.");
			}
		}
	}
	
	private static void funcionalidadLiberar(String [][] matrizAparcamiento,int fila, int columna) {
		int filaOcupar=0;
		int columnaOcupar=0;
		boolean fin=false;
		while(!fin) {
			filaOcupar=pedirFila();
			if(filaOcupar>=0 && filaOcupar<=fila) {
				columnaOcupar=pedirColumna();
				if(columnaOcupar>=0 && columnaOcupar<=columna) {
					liberarPlaza(filaOcupar, columnaOcupar, matrizAparcamiento);
					fin=true;
				}
				else {
					System.out.println("Columna NO VALIDA.");
				}
			}
			else {
				System.out.println("Fila NO VALIDA.");
			}
		}
	}
	
	private static void ocuparPlaza(int fila, int columna, String [][] matrizAparcamiento) {
		if(matrizAparcamiento[fila][columna]=="L") {
			matrizAparcamiento[fila][columna]="O";
			System.out.println("Plaza ocupada con exito.");
		}
	}
	
	private static void liberarPlaza(int fila, int columna, String [][] matrizAparcamiento) {
		if(matrizAparcamiento[fila][columna]=="O") {
			matrizAparcamiento[fila][columna]="L";
			System.out.println("Plaza liberada con exito.");
		}
	}
	
	private static boolean estaLleno(String [][] matrizAparcamiento, int fila, int columna) {
		int totalElementos=fila*columna;
		int cont=0;
		boolean lleno=false;
		for(int i=0; i < fila; i++) {
			for(int j=0; j < columna; j++) {
				if(matrizAparcamiento[i][j]=="O") {
					cont++;
				}
			}
		}
		if(totalElementos==cont) {
			lleno=true;
		}
		return lleno;
		
	}
	
	private static void funcionalidadParking(int fila, int columna, String [][] matrizAparcamiento) {
		int opcion;
		do {
			menu();
			opcion=entrada.nextInt();
			switch (opcion) {
			case 1:
				mostrarParking(fila, columna, matrizAparcamiento);
				break;
			case 2:
				if(estaLleno(matrizAparcamiento, fila, columna)==false) {
					funcionalidadOcupar(matrizAparcamiento, fila, columna);
				}
				else {
					System.out.println("Parking lleno.");
				}
				break;
			case 3:
				funcionalidadLiberar(matrizAparcamiento, fila, columna);
				break;
			case 4:
				System.out.println("SALIENDO...");
				break;
			default:
				System.out.println("Opción no valida.");
				break;
			}
		}while(opcion!=4);
	}
	
	private static void menu() {
		System.out.println("---- MENÚ PARKING ----");
		System.out.println("1-> Mostrar estado parking.");
		System.out.println("2-> Ocupar Plaza.");
		System.out.println("3-> Liberar Plaza.");
		System.out.println("4-> Salir.");
	}

}
