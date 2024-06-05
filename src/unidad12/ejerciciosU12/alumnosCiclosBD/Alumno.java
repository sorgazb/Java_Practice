package unidad12.ejerciciosU12.alumnosCiclosBD;

public class Alumno {
		
	//Atributos de la clase Alumno:
	private int id;
	private String nombre;
	private String apellidos;
	private int ciclo;
	
	//Constructor de la clase Alumno:
	public Alumno(int id, String nombre, String apellidos, int ciclo) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ciclo = ciclo;
	}

	
	//Metodos Getters & Setters:
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getCiclo() {
		return ciclo;
	}

	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}


	//Metodo toString:
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", ciclo=" + ciclo + "]";
	}

	
}
