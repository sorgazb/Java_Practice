package unidad9.teoriaU9.colecciones.coches;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class DemoCochesHashSet {
	
	public static void main(String[] args) {
		
		Set <String> conjuntoMarcas= new HashSet <String>();
		
		for(String marca:MarcasCoches.marcas) {
			conjuntoMarcas.add(marca);
		}
		
		System.out.println("---CONJUNTO DE MARCAS---");
		Iterator iteradorMarcas= conjuntoMarcas.iterator();
		while(iteradorMarcas.hasNext()) {
			String marca= (String)iteradorMarcas.next();
			System.out.println(marca);
		}
		
		conjuntoMarcas.add("Toyota");
		//No hay orden de inserción (esto no pasa en las listas:)
		conjuntoMarcas.add("Renault");
		
		System.out.println("------------------------");
		System.out.println("---CONJUNTO DE MARCAS---");
		iteradorMarcas= conjuntoMarcas.iterator();
		while(iteradorMarcas.hasNext()) {
			String marca= (String)iteradorMarcas.next();
			System.out.println(marca);
		}
	
	}
}