package unidad9.teoriaU9.colecciones.coches;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class DemoCochesLinkList {
	
	public static void main(String[] args) {
		
		List <String> listaMarcas= new LinkedList<String>();
		
		for(String marca:MarcasCoches.marcas) {
			listaMarcas.add(marca);
		}
		
		listaMarcas.add(2,"Peugeot"); 
		
		System.out.println("---LISTA DE MARCAS---");
		Iterator iteradorMarcas= listaMarcas.iterator();
		while(iteradorMarcas.hasNext()) {
			String marca= (String)iteradorMarcas.next();
			System.out.println(marca);
		}
		
		//Otra forma de mostrar pero menos eficiente que el caso de los Iteradores:
		System.out.println("---LISTA DE MARCAS---");
		for(int i = 0 ; i < listaMarcas.size(); i++) {
			System.out.println(listaMarcas.get(i));
		}
		
	}
}
