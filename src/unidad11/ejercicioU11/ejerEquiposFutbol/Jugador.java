package unidad11.ejercicioU11.ejerEquiposFutbol;

public class Jugador {
	
	private String nombre;
	private String equipo;
	private Posicion posicion;
	
	public Jugador(String nombre, String equipo, Posicion posicion) {
		this.nombre = nombre;
		this.equipo = equipo;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Jugador [Nombre=" + nombre + ", Equipo=" + equipo + ", Posicion=" + posicion + "]";
	}

}
