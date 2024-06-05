package unidad9.ejerciciosU9.ejercicio19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestionProductos {
	public static void main(String[] args) {
		
		Producto p1= new Producto("P1", 2);
		Producto p2= new Producto("P2", 24);
		Producto p3= new Producto("P3", 52);
		Producto p4= new Producto("P4", 152);
		Producto p5= new Producto("P5", 542);
		
		List<Producto> listaProductos= new ArrayList<Producto>();
		
		listaProductos.add(p1);
		listaProductos.add(p2);
		listaProductos.add(p3);
		listaProductos.add(p4);
		listaProductos.add(p5);
		System.out.println("LISTA ORIGINAL");
		mostrarLista(listaProductos);
		
		System.out.println("LISTA -2 ELEMENTOS");
		listaProductos.remove(p1);
		listaProductos.remove(p5);
		
		mostrarLista(listaProductos);
		
		System.out.println("OBJETO EN MITAD");
		Producto p6= new Producto("P_MITAD", 2);
		listaProductos.add(listaProductos.size()/2, p6);
		mostrarLista(listaProductos);
		
		
		System.out.println("LISTA VACIA");
		listaProductos.clear();
		mostrarLista(listaProductos);

	}

	private static void mostrarLista(List<Producto> listaProductos) {
		Iterator iterator= listaProductos.iterator();
		while(iterator.hasNext()) {
			Producto producto= (Producto) iterator.next();
			System.out.println(producto);
		}
	}
}
