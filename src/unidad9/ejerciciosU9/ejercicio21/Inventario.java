package unidad9.ejerciciosU9.ejercicio21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventario {
	
	List<Mascotas> listaMascotas= new ArrayList<Mascotas>();
	
	public void mostrarLista() {
		Iterator iteradorMascotas= listaMascotas.iterator();
		while(iteradorMascotas.hasNext()) {
			Mascotas mascota= (Mascotas)iteradorMascotas.next();
			mascota.mostrar();
		}
	}
	
	public void mostrarAnimal(String nombre) {
		Iterator iteradorMascotas= listaMascotas.iterator();
		while(iteradorMascotas.hasNext()) {
			Mascotas mascota= (Mascotas)iteradorMascotas.next();
			if(mascota.getNombre().equals(nombre)) {
				System.out.println(mascota);
			}
		}
	}
	
	public void mostrarMascotas() {
		Iterator iteradorMascotas= listaMascotas.iterator();
		while(iteradorMascotas.hasNext()) {
			Mascotas mascota= (Mascotas)iteradorMascotas.next();
			System.out.println(mascota);
		}
	}
	
	public void insertar(Mascotas mascota) {
		listaMascotas.add(mascota);
	}
	
	public void eliminar(Mascotas mascota) {
		listaMascotas.remove(mascota);
	}
	
	public void vaciar() {
		listaMascotas.clear();
	}
	
	
}
