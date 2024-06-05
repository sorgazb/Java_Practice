package tareasFinales.taller;

public class Reparacion {
	
	private String descripcionReparacion;
	private double kilometraje;
	
	public Reparacion(String descripcionReparacion, double kilometraje) {
		super();
		this.descripcionReparacion = descripcionReparacion;
		this.kilometraje = kilometraje;
	}

	public String getDescripcionReparacion() {
		return descripcionReparacion;
	}

	public void setDescripcionReparacion(String descripcionReparacion) {
		this.descripcionReparacion = descripcionReparacion;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}

	@Override
	public String toString() {
		return "Reparacion [descripcionReparacion=" + descripcionReparacion + ", kilometraje=" + kilometraje + "]";
	}
	
}
