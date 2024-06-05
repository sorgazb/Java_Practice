package ejerciciosEjemplo.practicaNBA;

public class Jugador {
	
	//Atributos de la clase Jugador:
	private String nombre;
	private String posicion;
	private String nacionalidad;
	private int anillos;
	private String equipo;
	private String conferencia;
	
	//Constructor de la clase Jugador:
	public Jugador(String nombre, String posicion, String nacionalidad, int anillos, String equipo,String conferencia) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.nacionalidad = nacionalidad;
		this.anillos = anillos;
		this.equipo = equipo;
		this.conferencia= conferencia;
	}

	//Getters & Setters de la clase Jugador:
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getAnillos() {
		return anillos;
	}

	public void setAnillos(int anillos) {
		this.anillos = anillos;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getConferencia() {
		return conferencia;
	}

	public void setConferencia(String conferencia) {
		this.conferencia = conferencia;
	}

	//Metodo toString:
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", nacionalidad=" + nacionalidad + ", anillos="
				+ anillos + ", equipo=" + equipo + ", conferencia=" + conferencia + "]";
	}

}
