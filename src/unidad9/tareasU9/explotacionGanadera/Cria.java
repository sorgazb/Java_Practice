package unidad9.tareasU9.explotacionGanadera;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Cria extends Animales{
	
	Map <Integer,Integer> mapaCrias;
	
	public Cria(int id, int camada, String nombre, LocalDate fechaVacunacion, String raza, Tipo tipo, Sexo sexo) {
		super(id, camada, nombre, fechaVacunacion, raza, tipo, sexo);
		mapaCrias= new HashMap<Integer, Integer>();
	}
	
	public void aniadirCria(int anio, int numCrias) {
		mapaCrias.put(anio, numCrias);
	}
	
	public void mostrarCrias() {
		System.out.println("Control de Crias:");
		for (int anio : mapaCrias.keySet()) {
			System.out.println("-Año: " + anio + " -Cantidad de Crias:" + mapaCrias.get(anio));
		}
	}

}
