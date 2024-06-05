package unidad5.ejerciciosU5;

/*
 * Escriba un programa Java para encontrar los 
 * elementos comunes entre dos matrices de enteros.
 */

public class Ejercicio9 {
	public static void main(String[] args) {
		System.out.println("Array 1");
		int [] array1= {1,2,4,5,656};
		mostrarArray(array1);
		System.out.println("\nArray 2");
		int [] array2= {656,4244,42,13,1};
		mostrarArray(array2);
		System.out.println("");
		compararArrays(array1, array2);

	}
	
	private static void mostrarArray(int [] array) {
		for(int elemento:array) {
			System.out.print("["+elemento+"]");
		}
	}
	
	private static void compararArrays(int [] array1, int [] array2) {
		int cont=0;
		for(int i=0; i< array1.length; i++) {
			for(int j=0; j < array2.length; j++) {
				if(array1[i]==array2[j]) {
					System.out.println("El elemento "+array1[i]+" está en el Array2.");
					cont++;
				}
			}
		}
		System.out.println("Hay "+cont+" elementos en ambos Arrays.");
	}
}
