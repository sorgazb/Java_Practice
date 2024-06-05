package unidad6.ejerciciosU6;

public class Ejercicio10 {
	
	//Atributos de la clase:
	private String nombre;
	private String apellidos;
	private double horas_trabajadas;
	private double pago_por_hora;
	private int bonificacion;
	private String puesto;
	
	//Constructores de la clase:
	public Ejercicio10() {
		
	}

	public Ejercicio10(String nombre, String apellidos, double horas_trabajadas, double pago_por_hora, int bonificacion,String puesto) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.horas_trabajadas = horas_trabajadas;
		this.pago_por_hora = pago_por_hora;
		this.bonificacion = bonificacion;
		this.puesto = puesto;
	}

	//Getters && Setters:
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

	public double getHoras_trabajadas() {
		return horas_trabajadas;
	}

	public void setHoras_trabajadas(double horas_trabajadas) {
		this.horas_trabajadas = horas_trabajadas;
	}

	public double getPago_por_hora() {
		return pago_por_hora;
	}

	public void setPago_por_hora(double pago_por_hora) {
		this.pago_por_hora = pago_por_hora;
	}

	public int getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(int bonificacion) {
		this.bonificacion = bonificacion;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public void mostrarDatos() {
		System.out.println("----DATOS EMPLEADOS----");
		System.out.println("-Nombre: "+nombre);
		System.out.println("-Apellidos: "+apellidos);
		System.out.println("-Puesto: "+puesto);
		System.out.println("-Horas Trabajadas: "+horas_trabajadas);
		System.out.println("-Pago por hora: "+pago_por_hora);
		System.out.println("-Bonificaciones: "+bonificacion);
		System.out.println("-----------------------");
	}
	
	
	
	
	
	
	
	
	

}
