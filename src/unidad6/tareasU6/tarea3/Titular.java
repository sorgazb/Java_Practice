package unidad6.tareasU6.tarea3;

public class Titular {
	
	//Atributos de la clase Titular:
	private String nombre;
	private String apellidos;
	private int edad;
	
	//Constructor parametrizado de la clase Titular:
	public Titular(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	//Métodos Getters & Setters de la clase Titular:
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
