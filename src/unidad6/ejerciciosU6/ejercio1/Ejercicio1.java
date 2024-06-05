package unidad6.ejerciciosU6.ejercio1;

/*
 * Diseña una clase que contenga los siguientes datos personales: nombre, dirección, 
 * edad y numero de teléfono. Escriba los métodos de acceso y modificación adecuados:
 */

public class Ejercicio1 {
	
	//Atributos de la clase:
	private String nombre;
	private String direccion;
	private int edad;
	private String numeroTelefono;
	
	//Métodos Getters & Setters de la clase:
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
}
