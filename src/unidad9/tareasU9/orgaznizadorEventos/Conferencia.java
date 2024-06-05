package unidad9.tareasU9.orgaznizadorEventos;

import java.time.LocalDate;

public class Conferencia extends Evento {
	
	//Atributos de la clase Conferencia:
	private String tema;

	//Constructor de la clase Conferencia:
	public Conferencia(String nombre, LocalDate fecha, int duracionHoras, String tema) {
		super(nombre, fecha, duracionHoras);
		this.tema=tema;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
