package unidad9.teoriaU9.colecciones.coches;

public class DemoCoches {

	public static void main(String[] args) {
		imprimirMarcas(MarcasCoches.marcas);
	}
	
	private static void imprimirMarcas(String [] marcasCoches) {
		System.out.println("---MARCAS DE COCHES---");
		for(String marca:marcasCoches) {
			System.out.println(marca);
		}
	}

}
