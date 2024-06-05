package unidad5.ejerciciosU5;

/*
 * Escriba un programa Java para encontrar los elementos 
 * comunes entre dos matrices (valores de cadena).
 */

public class Ejercicio8 {

	public static void main(String[] args) {
		System.out.println("Array 1");
		String [] array1= {"Luis","Pepe"};
		mostrarArray(array1);
		System.out.println("\nArray 2");
		String [] array2= {"Juan","Jorge","Pepe","Luis"};
		mostrarArray(array2);
		System.out.println("");
		compararArrays(array1, array2);

	}
	
	private static void mostrarArray(String [] array) {
		for(String elemento:array) {
			System.out.print("["+elemento+"]");
		}
	}
	
	private static void compararArrays(String [] array1, String [] array2) {
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
