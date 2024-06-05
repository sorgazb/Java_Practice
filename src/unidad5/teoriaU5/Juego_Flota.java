package unidad5.teoriaU5;
import java.util.Scanner;

public class Juego_Flota {
	//Constantes:
	static final int FILAS=8;
	static final int COLUMNAS=8;
	//Scanner:
	public static Scanner entrada= new Scanner (System.in);
	
	
	public static void main(String[] args) {
		//Definimos el tablero de Juego:
		int [][] tablero=new int [FILAS][COLUMNAS];
		
		definirTableroVacio(tablero);
		mostrarTablero(tablero);
		funcionalidadInicio(tablero);
		mostrarTablero(tablero);

	}
	
	//Metodo para añadir un barco:
	private static void aniadirBarco(int [][] tablero) {
		int fila=pedirFila();
		int columna=pedirColumna();
		tablero[fila][columna]=1;
	}
	
	//Método para pedir fila:
	private static int pedirFila() {
		int fila;
		System.out.println("Que fila quieres?(0-7)");
		fila=entrada.nextInt();
		return fila;
	}
	
	//Método para pedir columna:
	private static int pedirColumna() {
		int columna;
		System.out.println("Que columna quieres?(0-7)");
		columna=entrada.nextInt();
		return columna;
	}
	
	private static void mostrarTablero(int [][] tablero) {
		for(int i=0; i < FILAS; i++) {
			for(int j=0; j < COLUMNAS; j++) {
				System.out.print("["+tablero[i][j]+"]");
			}
			System.out.println("");
		}
	}
	
	private static void definirTableroVacio(int [][] tablero) {
		for(int i=0; i < FILAS; i++) {
			for(int j=0; j < COLUMNAS; j++) {
				tablero[i][j]=0;
			}
		}
	}
	
	private static void menuInicio() {
		System.out.println("----MENÚ INICIO----");
		System.out.println("1_. Añadir Barcos");
		System.out.println("2_. Comenzar Juego");
		System.out.println("0_. Terminar Juego");
	}
	

	
	private static void funcionalidadInicio(int [][] tablero) {
		menuInicio(); 
		int opcion;
		do {
			System.out.println("Opción:");
			opcion=entrada.nextInt();
			switch (opcion) {
			case 1: 
				System.out.println("1_. Añadir Barcos");
				funcionalidadAniadirBarco(tablero);
				break;
			case 2:
				System.out.println("2_. Comenzar Juego");
				funcionalidadJugarJuego(tablero);
				break;
			case 0:
				System.out.println("0_. Terminar Juego");
				System.out.println("SALIENDO...");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		}while(opcion!=0);
		System.out.println("GRACIAS POR JUGAR.");
	}
	
	private static void menuAniadirBarcos() {
		System.out.println("---- AÑADIR BARCO----");
		System.out.println("1_. Añadir Posicion Barco:");
		System.out.println("0_. Fin Añadir Barcos.");
	}
	
	private static void funcionalidadAniadirBarco(int [][] tablero) {
		menuAniadirBarcos();
		int opcion;
		do {
			System.out.println("Opción Añadir Barcos:");
			opcion=entrada.nextInt();
			switch (opcion) {
			case 1: 
				System.out.println("1_. Añadir Posicion Barcos");
				aniadirBarco(tablero);
				mostrarTablero(tablero);
				break;
			case 0:
				System.out.println("0_. Terminar Añadir Barcos");
				System.out.println("MOSTRANDO MENÚ INICIO...");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		}while(opcion!=0);
	}
	
	private static void menuJugar() {
		System.out.println("----JUGAR JUEGO----");
		System.out.println("1_. Introducir posicion:");
		System.out.println("0_. Fin Juego.");
	}
	
	private static void funcionalidadJugarJuego(int [][] tablero) {
		menuJugar();
		int opcion;
		do {
			System.out.println("Opción Jugar Juego:");
			opcion=entrada.nextInt();
			switch (opcion) {
			case 1: 
				System.out.println("1_. Introducir posicion:");
				registrarPosicion(tablero);
				break;
			case 0:
				System.out.println("0_. Terminar Jugar Juego:");
				System.out.println("MOSTRANDO MENÚ INICIO...");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		}while(opcion!=0);
	}
	
	private static void registrarPosicion(int [][] tablero) {
		int fila=pedirFila();
		int columna=pedirColumna();
		if(tablero[fila][columna]==0) {
			System.out.println("Agua");
		}else if(tablero[fila][columna]==1) {
			System.out.println("Tocado");
			tablero[fila][columna]=2;
			comprobarCasillas(fila, columna, tablero);
		}
	}
	
	//Mejorar
	private static void comprobarCasillas(int fila, int columna, int [][] tablero) {
		if(tablero[fila+1][columna]==0 || tablero[fila+1][columna]==2) {
			if(tablero[fila-1][columna]==0 || tablero[fila-1][columna]==2) {
				if(tablero[fila][columna+1]==0 || tablero[fila][columna+1]==2) {
					if(tablero[fila][columna-1]==0 || tablero[fila][columna-1]==2) {
						System.out.println("Y HUNDIDO!!!");
					}
				}
				
			}
		}
	}
	
}
