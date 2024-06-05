package tareasFinales.taller;

import java.util.ArrayList;
import java.util.List;

public class Coche {
	
	private String matricula;
	private String direccionPropietario;
	private List<Reparacion> historialReparaciones;
	
	public Coche(String matricula, String direccionPropietario) {
		this.matricula = matricula;
		this.direccionPropietario = direccionPropietario;
		this.historialReparaciones = new ArrayList<Reparacion>();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDireccionPropietario() {
		return direccionPropietario;
	}

	public void setDireccionPropietario(String direccionPropietario) {
		this.direccionPropietario = direccionPropietario;
	}

	public List<Reparacion> getHistorialReparaciones() {
		return historialReparaciones;
	}

	public void setHistorialReparaciones(List<Reparacion> historialReparaciones) {
		this.historialReparaciones = historialReparaciones;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", direccionPropietario=" + direccionPropietario
				+ ", historialReparaciones=" + historialReparaciones + "]";
	}
	
	public void aniadirReparacion(Reparacion reparacion) {
		if(historialReparaciones.isEmpty()) {
			historialReparaciones.add(reparacion);
		}else {
			if(reparacion.getKilometraje() > 
			historialReparaciones.get(historialReparaciones.size()-1).getKilometraje()) {
				historialReparaciones.add(reparacion);
				
			}else {
				System.err.println("ERROR. La reparacion actual tiene un kilometraje inferior a la ultima.");
			}
		}
	}
	
	public Reparacion obtenerUltimaReparacion() {
		Reparacion ultimaReparacion= null;
		if(!historialReparaciones.isEmpty()) {
			ultimaReparacion=historialReparaciones.get(historialReparaciones.size()-1);
		}
		else {
			System.err.println("ERROR. No tenemos ninguna reparacion asociada a ese coche.");
		}
		return ultimaReparacion;
	}
	
	public void obtenerReparacionConcreta(String reparacionConcreta) {
		if(!historialReparaciones.isEmpty()) {
			for(Reparacion reparacion:historialReparaciones) {
				if(reparacion.getDescripcionReparacion().contains(reparacionConcreta)) {
					System.out.println(reparacion);
				}
			}
		}else {
			System.err.println("ERROR. No tenemos ninguna reparacion asociada a ese coche.");
		}
	}
}
