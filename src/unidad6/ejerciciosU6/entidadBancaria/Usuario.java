package unidad6.ejerciciosU6.entidadBancaria;

public class Usuario {
	
	//Atributos de la clase
	private String dni;
	private String fechaNacimiento;
	private String [] clave= new String [6];
	
	//Constructor por defecto
	public Usuario() {
	}
	
	public Usuario(String dni, String fechaNacimiento, String [] clave) {
		this.dni=dni;
		this.fechaNacimiento=fechaNacimiento;
		this.clave=clave;
	}

	//Métodos Getters & Setters
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String[] getClave() {
		return clave;
	}
	public void setClave(String[] clave) {
		this.clave = clave;
	}
	
	public void imprimirDatos() {
		System.out.println("--DATOS USUARIO--");
		System.out.println("-DNI: "+this.dni);
		System.out.println("-Fecha Nacimiento: "+this.fechaNacimiento);
		System.out.print("-Clave Usuario: ");
		for(String elemento:clave) {
			System.out.print("["+elemento+"]");
		}
		System.out.println("");
	}

}
