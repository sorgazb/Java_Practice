package unidad8.ejerciciosU8.ejercicio3;

public class Caballo {
	
	//Atributos de la clase Caballo:
	private String nombre;
	private String color;
	private int anio_Nacimiento;
	
	//Constructor de la clase Caballo:
	public Caballo(String nombre, String color, int anio_Nacimiento) {
		this.nombre = nombre;
		this.color = color;
		this.anio_Nacimiento = anio_Nacimiento;
	}
	//Métodos Getters && Setters de la clase Caballo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAnio_Nacimiento() {
		return anio_Nacimiento;
	}
	public void setAnio_Nacimiento(int anio_Nacimiento) {
		this.anio_Nacimiento = anio_Nacimiento;
	}
	
	public void mostrar(){
		System.out.println("----CABALLO----");
		System.out.println("-Nombre: "+nombre);
		System.out.println("-Color: "+color);
		System.out.println("-Año Nacimiento: "+anio_Nacimiento);
	}
	
	
}
