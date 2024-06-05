package unidad9.tareasU9.explotacionGanadera;

import java.time.LocalDate;

public class Revision {
	
	private String nombreVeterinario;
	private LocalDate fechaRevision;
	private boolean cuidado;
	
	public Revision(String nombreVeterinario, LocalDate fechaRevision, boolean cuidado) {
		this.nombreVeterinario = nombreVeterinario;
		this.fechaRevision = fechaRevision;
		this.cuidado = cuidado;
	}

	public String getNombreVeterinario() {
		return nombreVeterinario;
	}

	public void setNombreVeterinario(String nombreVeterinario) {
		this.nombreVeterinario = nombreVeterinario;
	}

	public LocalDate getFechaRevision() {
		return fechaRevision;
	}

	public void setFechaRevision(LocalDate fechaRevision) {
		this.fechaRevision = fechaRevision;
	}

	public boolean isCuidado() {
		return cuidado;
	}

	public void setCuidado(boolean cuidado) {
		this.cuidado = cuidado;
	}
	
	@Override
	public String toString() {
		return "-Veterinario: "+nombreVeterinario+" -Fecha: "+fechaRevision+" -Necesitó Cuidado: "+cuidado;
	}
	
	
}
