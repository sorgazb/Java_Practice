package unidad5.teoriaU5;

public class BusquedaBinaria {

	public static void main(String[] args) {
		int arr[]= {3,11,22,34,49,51,64,78,86,90};
		int elementoBuscado=86;
		int resultado=1;
		
		/*
		 * Para que lea el elementoBuscado con
		 * int elementoBuscado=Interger.Int(args[0]);
		 */
		
		//Imprimir los elementos del Array
		System.out.println("Array");
		imprimirArray(arr);
	
		resultado= buscarBinario(arr,elementoBuscado);
		System.out.println(" ");
		if(resultado==-1) {
			System.out.println("El elemento no se encuentra en el Array.");
		}else {
			System.out.println("El "+elementoBuscado+" se encuentra de la posicion "+resultado);
		}
		
	}
	
	
	//Bucle FOR CLASICO:
	private static void imprimirArray(int [] arr) {
		for(int i=0; i < arr.length; i++) {
			System.out.print("["+arr[i]+"] ");
		}
	}
	
	//Bucle FOR EACH:
	private static void mostrarArray(int [] arr) {
		for(int elemento:arr) {
			System.out.print("["+elemento+"] ");
		}
	}
	
	private static int buscarBinario(int [] arr, int elementoBuscado) {
		int pos=-1;
		boolean enc=false;
		//Límite del Array por la Izquierda:
		int izquierdaLim=0;
		//Límite del Array por la Derecha.
		int derechaLim=(arr.length-1);
		int medio=-1;
		while (izquierdaLim!=derechaLim && !enc) {	
			//medio=izquierdaLim+(derechaLim-izquierdaLim)/2;
			medio=((izquierdaLim+derechaLim)/2);
			if(arr[medio]==elementoBuscado) {
				enc=true;
				pos=medio;
			}else {
				if(arr[medio]< elementoBuscado) {
					izquierdaLim=medio+1;
				}else {
					derechaLim=medio-1;
				}
			}
		}
		return pos;
	}

}
