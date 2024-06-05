package unidad9.teoriaU9.colecciones.ejemploComparaciones.comparable;

import java.util.Arrays;

public class TestOrdenacionEmpleado {

	public static void main(String[] args) {
		Empleado [] departamento = new Empleado[3];
		
		departamento[0]= new Empleado("Paco", 30000);
		departamento[1]= new Empleado("Elena", 70000);
		departamento[2]= new Empleado("Tamara", 39000);
		
		mostrarEmpleados(departamento);
		System.out.println("-------ORDEN ASCENDENTE DE SALARIO--------");
		Arrays.sort(departamento); //Ordena el array el solo.
		mostrarEmpleados(departamento);

	}
	
	private static void mostrarEmpleados(Empleado [] array) {
		for(Empleado e: array) {
			System.out.println(e);
		}
	}

}
