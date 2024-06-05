package unidad5.ejerciciosU5;

/*
 * Escriba un programa Java para revertir una matriz de valores enteros.
 */

public class Ejercicio7 {

	public static void main(String[] args) {
		int [] array= {10,2,9};
		mostrarArray(array);
		revertirArray(array);
		System.out.println("");
		mostrarArray(array);
	}
	
	private static void mostrarArray(int [] array) {
		for(int elemento:array) {
			System.out.print("["+elemento+"]");
		}
	}
	
	private static void revertirArray(int [] array) {
		int ultPos=0;
		int aux;
		int tam=array.length;
		for(int i=0; i <= ultPos; i++) {
			ultPos=tam-1-i;
			aux=array[ultPos];
			array[ultPos]=array[i];
			array[i]=aux;
		}
	}

}
