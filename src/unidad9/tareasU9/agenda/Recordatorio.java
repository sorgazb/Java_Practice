package unidad9.tareasU9.agenda;

import java.time.LocalDate;
import java.time.LocalTime;

import unidad9.tareasU9.agenda.enums.Prioridad;
import unidad9.tareasU9.agenda.enums.TipoMetodo;

public class Recordatorio extends Evento {

	private String mensajeRecordatorio;
	private Prioridad prioridad;
	private TipoMetodo metodoRecordatorio;
	private LocalDate fechaVencimiento;
	private boolean completado;
	
	public Recordatorio(String titulo, String descripcion, LocalDate fecha, LocalTime hora, int duracionMin,
			String mensajeRecordatorio, Prioridad prioridad, TipoMetodo metodoRecordatorio, LocalDate fechaVencimiento,
			boolean completado) {
		super(titulo, descripcion, fecha, hora, duracionMin);
		this.mensajeRecordatorio = mensajeRecordatorio;
		this.prioridad = prioridad;
		this.metodoRecordatorio = metodoRecordatorio;
		setFechaVencimiento(fechaVencimiento);
		this.completado = completado;
	}

	public String getMensajeRecordatorio() {
		return mensajeRecordatorio;
	}

	public void setMensajeRecordatorio(String mensajeRecordatorio) {
		this.mensajeRecordatorio = mensajeRecordatorio;
	}

	public Prioridad getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Prioridad prioridad) {
		this.prioridad = prioridad;
	}

	public TipoMetodo getMetodoRecordatorio() {
		return metodoRecordatorio;
	}

	public void setMetodoRecordatorio(TipoMetodo metodoRecordatorio) {
		this.metodoRecordatorio = metodoRecordatorio;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		if (fechaVencimiento.isBefore(LocalDate.now())) {
			System.err.println("Fecha no válida");
			this.fechaVencimiento=LocalDate.now().plusDays(1);
		}else {
			this.fechaVencimiento = fechaVencimiento;
		}
	}

	public boolean isCompletado() {
		return completado;
	}

	public void setCompletado(boolean completado) {
		this.completado = completado;
	}

	@Override
	public String toString() {
		return "Recordatorio=" + mensajeRecordatorio + ", prioridad=" + prioridad.getPrioridad()
				+ ", metodoRecordatorio=" + metodoRecordatorio.getTipo() + ", fechaVencimiento=" + fechaVencimiento
				+ ", completado=" + completado;
	}
	
	

}
