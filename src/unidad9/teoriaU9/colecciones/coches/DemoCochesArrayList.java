package unidad9.teoriaU9.colecciones.coches;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Recorrer y mostrar los elementos de una Lista (ArrayList) con un iterador:
public class DemoCochesArrayList {
	
	public static void main(String[] args) {
		
		List <String> listaMarcas= new ArrayList<String>();
		
		for(String marca:MarcasCoches.marcas) {
			listaMarcas.add(marca);
		}
		
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
