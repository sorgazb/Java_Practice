package unidad9.tareasU9.agenda;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

public class Agenda {

	HashSet<Evento> agenda;

	public Agenda() {
		super();
		agenda = new HashSet<Evento>();
	}
	
	public void agregarEvento(Evento evento) {
		agenda.add(evento);
	}
	
	public void eliminarEvento(Evento evento) {
		agenda.remove(evento);
	}
	
	public void buscadorPorFecha(LocalDate fecha) {
		Iterator iteradorAgenda = agenda.iterator();
		System.out.println("Eventos que coinciden con la fecha: " + fecha);
		while (iteradorAgenda.hasNext()) {
			Evento evento = (Evento)iteradorAgenda.next();
			if (fecha.equals(evento.getFecha())) {
				System.out.println(evento);
			}
		}
	}
	
	public void mostrarTodosEventos() {
		Iterator iteradorAgenda = agenda.iterator();
		while (iteradorAgenda.hasNext()) {
			Evento Evento = (Evento)iteradorAgenda.next();
			System.out.println(Evento);
		}
	}
	
	
	
}
