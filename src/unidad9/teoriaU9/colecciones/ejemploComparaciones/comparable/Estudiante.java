package unidad9.teoriaU9.colecciones.ejemploComparaciones.comparable;

public class Estudiante implements Comparable<Estudiante>{
	
	private String nombre;
	private int edad;
	private int matricula;
	
	public Estudiante(String nombre, int edad, int matricula) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public int compareTo(Estudiante o) {
		int comparacion=0;
		
		if(matricula > o.matricula) {
			comparacion=1;
		}
		if(matricula < o.matricula) {
			comparacion=-1;
		}
		
		return comparacion;
	}
	
	
	@Override
	public String toString() {
		return "Nombre: "+nombre+" Matricula: "+matricula+" Edad: "+edad;
	}
	
	
	
}
