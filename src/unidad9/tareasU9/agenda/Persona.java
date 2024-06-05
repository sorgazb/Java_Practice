package unidad9.tareasU9.agenda;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	
	
	public Persona(String nombre, String apellido, int edad) {
		super();
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if (nombre.matches("[A-z][a-z]*")) {
			this.nombre = nombre;
		}else {
			System.out.println("Nombre incorrecto");
			this.nombre = "Sin nombre";
		}
		
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		if (apellido.matches("[A-z][a-z]*")) {
			this.apellido = apellido;
		}else {
			System.out.println("Apellido incorrecto");
			this.apellido = "Sin apellido";
		}
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if (edad<0) {
			System.out.println("Error en la edad");
			this.edad = 1;
		}else {
			this.edad = edad;
		}
		
	}
	@Override
	public String toString() {
		return "Persona nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad;
	}
	
	
	
}
