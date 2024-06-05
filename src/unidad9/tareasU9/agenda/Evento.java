package unidad9.tareasU9.agenda;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Evento {

	private String titulo;
	private String descripcion;
	private LocalDate fecha;
	private LocalTime hora;
	private int duracionMin;
	
	public Evento(String titulo, String descripcion, LocalDate fecha, LocalTime hora, int duracionMin) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		setFecha(fecha);
		this.hora = hora;
		setDuracionMin(duracionMin);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		if (fecha.isBefore(LocalDate.now())) {
			System.err.println("Fecha no válida");
			this.fecha=LocalDate.now().plusDays(1);
		}else {
			this.fecha = fecha;
		}
		
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public int getDuracionMin() {
		return duracionMin;
	}

	public void setDuracionMin(int duracionMin) {
		if (duracionMin<0) {
			System.err.println("Duración incorrecta");
			this.duracionMin=10;
		}else {
			this.duracionMin = duracionMin;
		}
		
	}

	@Override
	public String toString() {
		return "Evento titulo=" + titulo + ", descripcion=" + descripcion + ", fecha=" + fecha + ", hora=" + hora
				+ ", duracionMin=" + duracionMin;
	}

	
	
}
