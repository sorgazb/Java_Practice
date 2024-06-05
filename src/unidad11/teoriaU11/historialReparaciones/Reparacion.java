package unidad11.teoriaU11.historialReparaciones;

import java.util.List;

public class Reparacion {
	
	private TipoVehiculo tipo;
	private String matricula;
	private String anioCompra;
	private List<String> aniosReparacion;
	
	public Reparacion(TipoVehiculo tipo, String matricula, String anioCompra, List<String> aniosReparacion) {
		super();
		this.tipo = tipo;
		this.matricula = matricula;
		this.anioCompra = anioCompra;
		this.aniosReparacion = aniosReparacion;
	}
	
	public TipoVehiculo getTipo() {
		return tipo;
	}
	public void setTipo(TipoVehiculo tipo) {
		this.tipo = tipo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getAnioCompra() {
		return anioCompra;
	}
	public void setAnioCompra(String anioCompra) {
		this.anioCompra = anioCompra;
	}
	public List<String> getAniosReparacion() {
		return aniosReparacion;
	}
	public void setAniosReparacion(List<String> aniosReparacion) {
		this.aniosReparacion = aniosReparacion;
	}

	@Override
	public String toString() {
		return "Reparacion [tipo=" + tipo + ", matricula=" + matricula + ", anioCompra=" + anioCompra
				+ ", aniosReparacion=" + aniosReparacion + "]";
	}

}
