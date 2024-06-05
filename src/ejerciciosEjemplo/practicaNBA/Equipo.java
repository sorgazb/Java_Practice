package ejerciciosEjemplo.practicaNBA;

public class Equipo {
	private String nombreEquipo;
	private String conferencia;
	
	public Equipo(String nombreEquipo, String conferencia) {
		this.nombreEquipo = nombreEquipo;
		this.conferencia = conferencia;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getConferencia() {
		return conferencia;
	}

	public void setConferencia(String conferencia) {
		this.conferencia = conferencia;
	}

	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", conferencia=" + conferencia + "]";
	}
	
}
