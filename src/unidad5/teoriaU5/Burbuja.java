package unidad5.teoriaU5;

/*
 * Clase para Ordenar un Array por el Algoritmo de la Burbuja:
 */

public class Burbuja {

	public static void main(String[] args) {
		//Array:
		int [] array= {62,23,10,20,9};
		//Mostramos el Array original (desordenado):
		System.out.println("Array original:");
		mostrarArray(array);
		//Llamamos al método para ordenar el Array por el Método de la Burbuja:
		ordenarBurbujas(array);
		System.out.println("\nArray ordenado:");
		//Mostramos el Array ya ordenado:
		mostrarArray(array);
	}
	
	//Método para mostrar el Array con buble for each:
	private static void mostrarArray(int [] array) {
		for(int elemento:array) {
			System.out.print("["+elemento+"]");
		}
	}
	
	//Método para ordenar el Array por el método de la burbuja, el cual compara la casilla 0 con sus sucedaneas
	//hasta encontrar su casilla ordenada.
	private static void ordenarBurbujas(int [] array) {
		//Variable auxiliar:
		int aux;
		int tam=array.length;
		for(int i=0; i < tam-1; i++) {
			//Este bucle lo que hace es comprar con el siguiente valor de la casilla j(primer elemento del array).
			//tam-i-1: Con esto de aquí lo que hacemos es establecer un límite de compración una vez esté ordenado.
			for(int j=0;j<tam-i-1;j++) {
				if(array[j]>array[j+1]) {
					aux=array[j];
					array[j]=array[j+1];
					array[j+1]=aux;
				}
			}
		}
	}
	
}
