package unidad9.tareasU9.orgaznizadorEventos;

import java.time.LocalDate;

public class Taller extends Evento {
	
	//Atributos de la clase Taller:
	private String instructor;

	//Cosntructor de la clase Taller:
	public Taller(String nombre, LocalDate fecha, int duracionHoras, String instructor) {
		super(nombre, fecha, duracionHoras);
		this.instructor= instructor;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
