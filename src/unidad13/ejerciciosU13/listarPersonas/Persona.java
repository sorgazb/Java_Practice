package unidad13.ejerciciosU13.listarPersonas;

public class Persona {
	private String nombre;
	private String apellidos;
	private String ciudad;
	
	public Persona(String nombre, String apellidos, String ciudad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ciudad = ciudad;
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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
}
