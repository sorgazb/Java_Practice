package unidad9.teoriaU9.mapas;

import java.util.HashMap;
import java.util.Map;

public class DemoCochesMapa {

	public static void main(String[] args) {

		Map<String, Integer> cantidadesMarcas = new HashMap<String, Integer>();

		for (String marca : MarcasCoches2.marcas) {
			cantidadesMarcas.put(marca, 0);
			// otra forma:
			// cantidadesMarcas.put(marca, Integer.valueOf(0));
		}
		System.out.println("MARCAS COCHES - CANTIDAD");
		imprimirMapa(cantidadesMarcas);
		
		System.out.println("------------------------------------------");

		cantidadesMarcas.put("Toyota", 3);
		cantidadesMarcas.put("Mazda", 6);
		cantidadesMarcas.put("Volkswagen", 4);

		System.out.println("MARCAS COCHES - CANTIDAD");
		imprimirMapa(cantidadesMarcas);
		
		
		System.out.println("------------------------------------------");
		cantidadesMarcas.replace("Toyota", 12);
		System.out.println("MARCAS COCHES - CANTIDAD");
		imprimirMapa(cantidadesMarcas);
		
		System.out.println("------------------------------------------");
		cantidadesMarcas.replace("Kia", cantidadesMarcas.get("Kia"), 10000);
		System.out.println("MARCAS COCHES - CANTIDAD");
		imprimirMapa(cantidadesMarcas);
	}

	private static void imprimirMapa(Map<String, Integer> marcasCoches) {
		for (String marca : marcasCoches.keySet()) {
			System.out.println("Marca: " + marca + " -Cantidad:" + marcasCoches.get(marca));
		}
	}
}
