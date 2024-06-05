package unidad9.tareasU9.explotacionGanadera;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Carne extends Animales{
	
	private double kgDiarios;
	Map<TiposComida, Double> mapaTiposComida;
	
	public Carne(int id, int camada, String nombre, LocalDate fechaVacunacion, String raza, Tipo tipo, Sexo sexo, double kgDiarios,double kgPienso, double kgPasto, double kgHeno, double kgBellota) {
		super(id, camada, nombre, fechaVacunacion, raza, tipo, sexo);
		
		this.kgDiarios=kgDiarios;
		
		mapaTiposComida= new HashMap<TiposComida, Double>();
		
		mapaTiposComida.put(TiposComida.PIENSO, kgPienso);
		mapaTiposComida.put(TiposComida.PASTO, kgPasto);
		mapaTiposComida.put(TiposComida.HENO, kgHeno);
		mapaTiposComida.put(TiposComida.BELLOTA, kgBellota);
	}
	
	public void mostrarComidas() {
		System.out.println("Hoy ha comido: "+kgDiarios);
		for (TiposComida tipo : mapaTiposComida.keySet()) {
			System.out.println("-Tipo: " + tipo + " -Cantidad :" + mapaTiposComida.get(tipo));
		}
	}

}
