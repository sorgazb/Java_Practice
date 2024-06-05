package unidad9.teoriaU9.colecciones.ejemploComparaciones.comparable;

public class Empleado implements Comparable<Empleado>{
	
	private String nombre;
	private double salario;
	
	
	public Empleado(String nombre, double salario) {
		this.nombre = nombre;
		this.salario = salario;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	@Override
	public String toString() {
		return "Nombre: "+nombre+" Salario: "+salario;
	}

	//para orden ascendente, en caso de que sea orden descendente el > devuelve negativo y el < devuelve positivo
	@Override
	public int compareTo(Empleado otroEmpleado) {
		int res=0; //Significa que los dos salarios son iguales.
		if(salario > otroEmpleado.salario) {
			res=1; //Significa que es mayor.
		}if (salario < otroEmpleado.salario) {
			res=-1; //Significa que es menor.
		}
		
		return res;
	}


}
