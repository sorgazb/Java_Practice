package unidad9.tareasU9.agenda;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import unidad9.tareasU9.agenda.enums.TipoReunion;

public class Reunion extends Evento {

	ArrayList<Persona> participantes;
	private String lugar;
	private TipoReunion tipo;
	private String tema;
	
	public Reunion(String titulo, String descripcion, LocalDate fecha, LocalTime hora, int duracionMin,
			String lugar, TipoReunion tipo, String tema) {
		super(titulo, descripcion, fecha, hora, duracionMin);
		participantes = new ArrayList<Persona>();
		this.lugar = lugar;
		this.tipo = tipo;
		this.tema = tema;
	}
	
	public void añadirParticipante(Persona persona) {
		participantes.add(persona);
	}
	
	public void borrarParticipante(Persona persona) {
		participantes.remove(persona);
	}

	public ArrayList<Persona> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(ArrayList<Persona> participantes) {
		this.participantes = participantes;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public TipoReunion getTipo() {
		return tipo;
	}

	public void setTipo(TipoReunion tipo) {
		this.tipo = tipo;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	@Override
	public String toString() {
		return "Reunion participantes=" + participantes + ", lugar=" + lugar + ", tipo=" + tipo.getTipo() + ", tema=" + tema;
	}

	
}
