package unidad9.tareasU9.orgaznizadorEventos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento implements Asistible{
	
	//Atributos de la clase Evento:
	private String nombre; //nombre del Evento.
	private LocalDate fecha;
	private int duracionHoras;
	private List <String> asistentes; //Lista de nombre de los asistentes.

	
	//Constructor de la clase Evento:
	public Evento(String nombre, LocalDate fecha, int duracionHoras) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.duracionHoras = duracionHoras;
		this.asistentes = new ArrayList <String> ();
	}

	
	//Métodos de la Interfaz Asistible:
	@Override
	public void registrarAsistente(String nombre) {
		if(esNombreValido(nombre)) {
			if(!esAsistenteRegistrado(nombre)) {
				asistentes.add(nombre);
				System.out.println(nombre+" registrado como asistente.");
			}else {
				System.err.println("ERROR. "+nombre+" ya está registrado como asistente del Evento: "+this.nombre+".");
			}
		}else {
			System.err.println("ERROR. Formato de nombre incorrecto.");
		}
	}
	
	@Override
	public void cancelarRegistroAsistente(String nombre) {
		if(esNombreValido(nombre)) {
			if(esAsistenteRegistrado(nombre)) {
				asistentes.remove(nombre);
				System.out.println(nombre+" ha sido eliminado como asistente del Evento: "+this.nombre);
			}else {
				System.err.println("ERROR. "+nombre+" no está registrado como asistente para el Evento: "+this.nombre);
			}
		}else {
			System.err.println("ERROR. Formato de nombre incorrecto.");
		}
	}

	@Override
	public boolean esAsistenteRegistrado(String nombre) {
		return asistentes.contains(nombre);
	}

	//Mostramos una copia de la lista de asistentes original.
	@Override
	public List<String> obtenerListaAsistentes() {
		return new ArrayList <> (asistentes);
	}

	@Override
	public void limpiarListaAsistentes() {
		asistentes.clear();
		System.out.println("Lista de Asistentes del Evento: "+this.nombre+" ha sido eliminada.");
	}

	
	//Métodos Getters & Setters de la clase Evento:
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getDuracionHoras() {
		return duracionHoras;
	}

	public void setDuracionHoras(int duracionHoras) {
		this.duracionHoras = duracionHoras;
	}

	public List<String> getAsistentes() {
		return asistentes;
	}

	public void setAsistentes(List<String> asistentes) {
		this.asistentes = asistentes;
	}
	
	//Métodos de la clase Evento:
	
	//Método para comprobar el formato del nombre:
	private boolean esNombreValido(String nombre) {
		String patronValido="[A-Z][a-z]*";
		boolean esValido=nombre.matches(patronValido);
		return esValido;
	}
	
	//FUNCIÓN AVISAR SI EL EVENTO ES DENTRO DE 30 DÍAS O MENOS:
	
	@Override
	public String toString() {
		return super.toString();
	}

}
