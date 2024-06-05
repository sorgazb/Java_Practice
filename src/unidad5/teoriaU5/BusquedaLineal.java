package unidad5.teoriaU5;

public class BusquedaLineal {

	public static void main(String[] args) {
		
		int arr []= {2,3,14,10,56,40};
		//Elemento a buscar.
		int x=14;
		
		//Método para buscar el elemento x en el array arr:
		int pos= buscar(arr,x);
		if(pos==-1) {
			System.out.println("Elemento no encontrado en el Array.");
		}else {
			System.out.println("La posción de "+x+" es "+pos+".");
		}
		
		
	}
	
	private static int buscar(int arr [], int x) {
		int pos=-1;
		//Versión bucle FOR:
		for (int i=0; i < arr.length; i++) {
			if(arr[i]==x) {
				pos=i;
				}
		}
		return pos;
	}
	
	
	
}
