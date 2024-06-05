package unidad9.tareasU9.energiasRenovables;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class ProductorEnergia {
	
	protected String id;
	protected double capacidadGenerada;
	protected LocalDate fechaUltimaRev;
	protected double eficiciencia;
	
	public ProductorEnergia(String id, LocalDate fechaUltimaRev) {
		this.id = id;
		this.fechaUltimaRev = fechaUltimaRev;
	}
	public String getId() {
		return id;
	}
	public void setId() {
		this.id = id;
	}
	public double getCapacidadGenerada() {
		return capacidadGenerada;
	}
	public void setCapacidadGenerada(double capacidadGenerada) {
		this.capacidadGenerada = capacidadGenerada;
	}
	public LocalDate getFechaUltimaRev() {
		return fechaUltimaRev;
	}
	public void setFechaUltimaRev(LocalDate fechaUltimaRev) {
		this.fechaUltimaRev = fechaUltimaRev;
	}
	public double getEficiciencia() {
		return eficiciencia;
	}
	public void setEficiciencia(double eficiciencia) {
		this.eficiciencia = eficiciencia;
	}
	
	public abstract void generadorDatos();
	
	public abstract void calcularEficiencia();
	
	public void obtenerDiasUltimaRevision() {
		LocalDate fechaActual= LocalDate.now();
		System.out.println("Han pasado "+ChronoUnit.DAYS.between(fechaActual, fechaUltimaRev)+" días desde la ultima revisión.");
	}
	@Override
	public String toString() {
		return "ProductorEnergia [id=" + id + ", capacidadGenerada=" + capacidadGenerada + ", fechaUltimaRev="
				+ fechaUltimaRev + ", eficiciencia=" + eficiciencia + "]";
	}
	
	
	

	
}
