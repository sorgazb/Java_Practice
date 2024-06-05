package ejerciciosEjemplo.practicasBD.Discografia;

public class Artistas {
	
	//Atributos de la clase Artista:
	private String nombre;
	private String apellido;
	private int oyentes_spotify;
	private String cancion_mas_famosa;
	private String nacionalidad;
	
	//Constructor de la clase Artista:
	public Artistas(String nombre, String apellido, int oyentes_spotify, String cancion_mas_famosa,
			String nacionalidad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.oyentes_spotify = oyentes_spotify;
		this.cancion_mas_famosa = cancion_mas_famosa;
		this.nacionalidad = nacionalidad;
	}

	//Getters & Setters:
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getOyentes_spotify() {
		return oyentes_spotify;
	}

	public void setOyentes_spotify(int oyentes_spotify) {
		this.oyentes_spotify = oyentes_spotify;
	}

	public String getCancion_mas_famosa() {
		return cancion_mas_famosa;
	}

	public void setCancion_mas_famosa(String cancion_mas_famosa) {
		this.cancion_mas_famosa = cancion_mas_famosa;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	//Metodo toString:
	@Override
	public String toString() {
		return "Artistas [nombre=" + nombre + ", apellido=" + apellido + ", oyentes_spotify=" + oyentes_spotify
				+ ", cancion_mas_famosa=" + cancion_mas_famosa + ", nacionalidad=" + nacionalidad + "]";
	}
	
	
}
