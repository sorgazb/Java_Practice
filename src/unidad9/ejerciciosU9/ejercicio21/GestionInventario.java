package unidad9.ejerciciosU9.ejercicio21;

import java.time.LocalDate;

public class GestionInventario {

	public static void main(String[] args) {
		
		Inventario inventario= new Inventario();
		
		Mascotas mascota1= new Perro("Rex", 21, LocalDate.of(2002,11, 20), Razas.CANICHE, false);
		Mascotas mascota2= new Gato("Mia", 11, LocalDate.of(2012,11, 20), "Pardo", false);
		Mascotas mascota3= new Loro("Rio",21, LocalDate.of(2002,11, 20), Picos.INSECTIVORO, false, "Brasil", true);
		Mascotas mascota4= new Canario("Perico", 0, LocalDate.now(), Picos.COMEDOR_SEMILLAS, true, "Amarillo", true);
		
		inventario.insertar(mascota1);
		inventario.insertar(mascota2);
		inventario.insertar(mascota3);
		inventario.insertar(mascota4);
		
		inventario.mostrarLista();
		
		mascota4.morir();
		inventario.mostrarAnimal("Perico");
		System.out.println("-----------------------");
		inventario.mostrarMascotas();
		System.out.println("-----------------------");
		inventario.eliminar(mascota4);
		inventario.mostrarMascotas();
		System.out.println("-----------------------");
		inventario.vaciar();
		inventario.mostrarLista();
		
		
	}

}
