package pruebas.evaluacion1.prueba1.ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static final int NUM_PUNTOS=4;
	//Declaración de la matriz y inicialización.
	static boolean [][] mapa= {
			{false, false, true, false},
			{false, false, true, true},
			{true, true, false, false},
			{false, true, false, false}
	};

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		
		int origen,destino;
		boolean hayRuta;
		
		System.out.println("Introduzca el origen:");
		origen=entrada.nextInt();
		System.out.println("Introduzca el destino:");
		destino=entrada.nextInt();
		
		hayRuta=comprobarRuta(origen,destino);
		if(hayRuta=true) {
			System.out.println("Están conectados.");
		}
		else {
			System.out.println("No hay ruta.");
		}
		entrada.close();
	}
	
	private static boolean comprobarRuta(int origen, int destino) {
		boolean ruta=false;
		boolean encontrado=false;
		boolean [] visitados= new boolean [NUM_PUNTOS];
		encontrado=buscar(origen,destino, visitados);
		return ruta;
	}

	private static boolean buscar(int origen, int destino, boolean [] visitados) {
		boolean encontrado=false;
		if(origen==destino) {
			encontrado=true;
		}else {
			visitados[origen]=true;
			for(int i=0; i < NUM_PUNTOS && !encontrado; i++) {
				if(mapa[origen][i] && !visitados[i]){
					if(buscar(i, destino, visitados)) {
						encontrado=true;
					}
				}
			}
		}
		return encontrado;
	}
	
}
