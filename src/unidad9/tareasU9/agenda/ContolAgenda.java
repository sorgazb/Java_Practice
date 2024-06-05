package unidad9.tareasU9.agenda;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import unidad9.tareasU9.agenda.enums.Prioridad;
import unidad9.tareasU9.agenda.enums.TipoMetodo;
import unidad9.tareasU9.agenda.enums.TipoReunion;


public class ContolAgenda {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Reunion reunion = new Reunion("Reunion java", "Se va a hablar de java", LocalDate.of(2024, 3, 17),
				LocalTime.of(17, 30), 30, "Naval", TipoReunion.INFORMAL, "Java");
		Recordatorio recordatorio = new Recordatorio("Java", "Mucho Java", LocalDate.of(2024, 3, 16),
				LocalTime.of(16, 30), 30, "Reunion Java", Prioridad.MUY_URGENTE, TipoMetodo.CORREO,
				LocalDate.of(2024, 3, 17), false);
		Persona p1 = new Persona("Sergio", "Orgaz", 21);
		Persona p2 = new Persona("Daniel", "Curiel", 18);
		Agenda agenda = new Agenda();
		reunion.añadirParticipante(p1);
		reunion.añadirParticipante(p2);
		agenda.agregarEvento(recordatorio);
		agenda.agregarEvento(reunion);
		agenda.buscadorPorFecha(LocalDate.of(2024, 3, 17));
		System.out.println("--------");
		agenda.mostrarTodosEventos();
		agenda.eliminarEvento(recordatorio);
		System.out.println("--------");
		agenda.mostrarTodosEventos();

		
		/*
		System.out.println("Por favor, introduce una fecha en el formato yyyy-MM-dd:");
		String fechaStr = scanner.nextLine(); // Leer la fecha como una cadena
	
		// Definir un formateador de fecha
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		if (fechaStr.matches("\\d{4}-\\d{2}-\\d{2}")) {
			
		

		// Cambiar la cadena a un objeto LocalDate
		LocalDate fecha = LocalDate.parse(fechaStr, formatter);
		System.out.println("Fecha introducida: " + fecha);
		}
		*/
	}

}
