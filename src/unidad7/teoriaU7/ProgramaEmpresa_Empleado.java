package unidad7.teoriaU7;

public class ProgramaEmpresa_Empleado {

	public static void main(String[] args) {
		System.out.println("Nº de empleados creados: "+Empleado.getContador());
		Empleado e1= new Empleado(1, "Tomás", "Ventas");
		Empleado e2= new Empleado(2, "Susana", "Administración");
		Empleado e3= new Empleado(3, "Pedro", "Operaciones");
		Empleado e4= new Empleado(4, "Juana", "RRHH");
		
		System.out.println("Nº de empleados creados: "+Empleado.getContador());
		System.out.println("Nº de empleados creados: "+e1.getContador());
		System.out.println("Nº de empleados creados: "+e4.getContador());

	}

}
