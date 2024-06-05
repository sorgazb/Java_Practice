package unidad7.teoriaU7;

public class Empleado {
	private int id;
	private String nombre;
	private String departamento;
	private static int contador;
	
	
	public Empleado(int id, String nombre, String departamento) {
		this.id = id;
		this.nombre = nombre;
		this.departamento = departamento;
		contador++; //Incrementa en 1 el contador cada vez que se crea un objeto empleado.
	}
	
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
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		Empleado.contador = contador;
	}
}
