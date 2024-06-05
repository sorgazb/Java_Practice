package pruebas.evaluacion1.prueba2.ejercicio1;
import java.util.Scanner;

public class Ejercicio1Sol {
	
	public static Scanner entrada= new Scanner(System.in);
	
	public static final int NUM_PARTICIPANTES=10;
	public static final int [] carrera= new int [NUM_PARTICIPANTES];
	public static final int [] menores= new int [NUM_PARTICIPANTES];
	public static final int [] positivos= new int [NUM_PARTICIPANTES];
	public static final int [] morosos= new int [NUM_PARTICIPANTES];
	
	public static void main(String[] args) {
		leerDorsales();
		leerDorsalesMenores();
		leerDorsalesPositivos();
		leerDorsalesMorosos();
		gestionarMenores();
		mostrarClasificacion();
	}
	
	private static void gestionarMenores() {
		int dorsalAux=0;
		int dorsalMenor=0;
		for(int i=0; i < menores.length; i++) {
			dorsalMenor=menores[i];
			if(dorsalMenor!=0) {
				for(int j=0; j < carrera.length; j++) {
					if(dorsalMenor==carrera[j] && j!=0) {//j!=0 es caso de que se el primero sea menor(No puede avanzar más).
						dorsalAux= carrera[j];
						carrera[j]=carrera[j-1];
						carrera[j-1]=dorsalAux;
					}
				}
			}
		}
	}

	//Función leer dorsales:
	private static void leerDorsales() {
		int cont=0;
		int dorsal=0;
		do {
			System.out.println("Introduzca un dorsal (-1 para terminar):");
			dorsal=entrada.nextInt();
			if(dorsal!=-1) {
				carrera[cont]=dorsal;
				cont=cont++;
			}
		}while(dorsal!=-1);
	}
	
	private static void leerDorsalesMenores() {
		int cont=0;
		int dorsal=0;
		do {
			System.out.println("Introduzca un dorsal del Menor(-1 para terminar):");
			dorsal=entrada.nextInt();
			if(dorsal!=-1) {
				menores[cont]=dorsal;
				cont++;
			}
		}while(dorsal!=-1);
	}
	
	private static void leerDorsalesPositivos() {
		int cont=0;
		int dorsal=0;
		do {
			System.out.println("Introduzca un dorsal del Positivo (-1 para terminar):");
			dorsal=entrada.nextInt();
			if(dorsal!=-1) {
				positivos[cont]=dorsal;
				cont++;
			}
		}while(dorsal!=-1);
	}
	
	private static void leerDorsalesMorosos() {
		int cont=0;
		int dorsal=0;
		do {
			System.out.println("Introduzca un dorsal del Moroso(-1 para terminar):");
			dorsal=entrada.nextInt();
			if(dorsal!=-1) {
				morosos[cont]=dorsal;
				cont++;
			}
		}while(dorsal!=-1);
	}
	
	private static void mostrarClasificacion() {
		int posicion=1;
		for(int i=0; i < carrera.length; i++) {
			if(carrera[i]!=0) {//Mostramos los corredores que no han sido descalificados
				System.out.println("Posición: "+posicion+" --Dorsal: "+carrera[i]);
				posicion=posicion++;
			}
		}
	}

}
