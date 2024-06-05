package unidad9.tareasU9.orgaznizadorEventos;

import java.util.List;

public interface Asistible {
	
	//Registra a una persona como asistente al evento.
	void registrarAsistente(String nombre); 

	//Permite cancelar el registro de un asistente.
	void cancelarRegistroAsistente(String nombre); 

	//Verifica si un nombre específico está registrado como asistente al evento.
	boolean esAsistenteRegistrado(String nombre); 

	// Devuelve la lista completa de asistentes al evento.
	List <String> obtenerListaAsistentes(); 

	// Elimina todos los registros de asistentes, dejando la lista vacía.
	void limpiarListaAsistentes(); 
	
}
