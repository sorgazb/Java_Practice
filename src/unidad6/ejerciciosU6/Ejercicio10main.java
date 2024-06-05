package unidad6.ejerciciosU6;
import java.util.Scanner;

public class Ejercicio10main {
	
	public static Scanner entrada= new Scanner(System.in);
	public static final int MAX_EMPLEADOS=10;

	public static void main(String[] args) {
		
		//Array de tipo Empleado en el que almacenamos los empleados:
		Ejercicio10 [] array_Empleados= new Ejercicio10[MAX_EMPLEADOS];
		
		//Creamos varios objetos de tipo empleado y los almacenamos en las primeras casillas del Array:
		Ejercicio10 empleado1= new Ejercicio10("Sergio", "Orgaz Bravo",200, 20, 20, "Gerente");
		array_Empleados[0]=empleado1;
		Ejercicio10 empleado2= new Ejercicio10("Mario", "Garcia Martinez",10, 8, 20, "Jefe");
		array_Empleados[1]=empleado2;
		Ejercicio10 empleado3= new Ejercicio10("Jesús", "Ramirez Silva",20.5, 20, 10, "Gerente");
		array_Empleados[2]=empleado3;
		Ejercicio10 empleado4= new Ejercicio10("Roberto", "Bravo Casas",15, 0, 10, "Administrativo");
		array_Empleados[3]=empleado4;
		Ejercicio10 empleado5= new Ejercicio10("Alejandro", "Vargas Silva",250, 3.5, 20, "Operario");
		array_Empleados[4]=empleado5;
		
		obtenerSueldoEmpleado(0, array_Empleados);
		//funcionalidadGestionEmpleados(array_Empleados);
	}
	
	public static void funcionalidadGestionEmpleados(Ejercicio10 [] array_Empleados) {
		int opcion=0;
		do {
			mostrarMenuGestion();
			opcion=entrada.nextInt();
			switch(opcion) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				String tipo="Operario";
				obtenerCantidadEmpleadosTipo(tipo, array_Empleados);
				break;
			case 4:
				String tipo2="Jefe";
				obtenerCantidadEmpleadosTipo(tipo2, array_Empleados);
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 0:
				break;
			default:
				System.out.println("ERROR.Opción no valida");
				break;
			}
		}while (opcion!=0);
	}
	
	public static void mostrarMenuGestion() {
		System.out.println("--------------------------MENÚ----------------------------");
		System.out.println("1_.Mostrar Datos Empleado.");
		System.out.println("2_.Obtener sueldo mensual.");
		System.out.println("3_.Obtener el Nº de Operarios.");
		System.out.println("4_.Obtener el Nº de Jefes.");
		System.out.println("5_.Obtener el Nº de Empleados sueldo < 1200€.");
		System.out.println("6_.Obtener el Nº de Empleados sueldo >= 1200€ && <= 2500€.");
		System.out.println("7_.Obtener el Nº de Empleados sueldo > 2500€.");
		System.out.println("0_.TERMINAR PROGRAMA");
		System.out.println("----------------------------------------------------------");
	}
	
	public static void obtenerSueldoEmpleado(int posicion, Ejercicio10 [] array_Empleados) {
		int bonificacion=array_Empleados[posicion].getBonificacion();
		double horas=array_Empleados[posicion].getHoras_trabajadas();
		double salarioHora=array_Empleados[posicion].getPago_por_hora();
		double salarioAux=salarioHora*horas;
		double porcentaje=(salarioAux*bonificacion)/100;
		double salario=salarioAux+porcentaje;
		System.out.println("El salario es "+salario+" €");
	}
	
	public static void obtenerCantidadEmpleadosTipo(String puesto, Ejercicio10 []array_Empleados) {
		int cont=0;
		for (int i=0; i < MAX_EMPLEADOS; i++) {
			if(array_Empleados[i]!=null) {
				if(array_Empleados[i].getPuesto().equals(puesto)) {
					cont ++;
				}
			}
		}
		System.out.println("El nº total de "+puesto+" es "+cont+".");
	}
	
	

}
