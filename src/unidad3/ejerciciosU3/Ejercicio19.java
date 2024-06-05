package unidad3.ejerciciosU3;
/*
 * Desarrollar un programa Java que sume los 
 * numeros del 1 al 100(ambos inclusive).
 */

public class Ejercicio19 {

	public static void main(String[] args) {
		int suma=0;
		int numero;
		for(int i=1; i < 101; i++ ) {
			numero=i;
			suma=suma+numero;
		}
		System.out.println("El resultado es: "+suma);
	}
}
