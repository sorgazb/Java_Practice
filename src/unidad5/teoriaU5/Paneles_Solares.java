package unidad5.teoriaU5;
import java.util.Scanner;

public class Paneles_Solares {
	
	public static Scanner entrada= new Scanner (System.in);
	public static final int MAX_PLACAS=10;
	
	public static void main(String[] args) {
		int [] id_Panel= new int [MAX_PLACAS];
		double [] potencia_Panel= new double [MAX_PLACAS];
		double [] ubicacion_X_Panel= new double [MAX_PLACAS];
		double [] ubicacion_Y_Panel= new double [MAX_PLACAS];
		String [] orientacion_Panel= new String [MAX_PLACAS];
		String [] estado_Panel= new String [MAX_PLACAS];
		
		funcionalidadMenu(id_Panel, potencia_Panel, ubicacion_X_Panel,ubicacion_Y_Panel, orientacion_Panel, estado_Panel);
	}

	
	private static void menu() {
		System.out.println("------------ MENU ------------");
		System.out.println("1.Registrar nuevo panel.");
		System.out.println("2.Consultar panel.");
		System.out.println("3.Cambiar estado panel.");
		System.out.println("4.Calcular generación energia.");
		System.out.println("5.Obtener listado placas.");
		System.out.println("6.Camibiar orientación placa");
		System.out.println("0.Salir del programa.");
	}
	
	private static void funcionalidadMenu(int [] id_Panel, double [] potencia_Panel, double [] ubicacion_X_Panel,double [] ubicacion_Y_Panel, String [] orientacion_Panel, String [] estado_Panel) {
		int opcion=-1;
		do {
			menu();
			System.out.print("Opción:");
			opcion=entrada.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("OPCION 1");
				registrarPanel(id_Panel, potencia_Panel, ubicacion_X_Panel,ubicacion_Y_Panel, orientacion_Panel, estado_Panel);
				break;
			case 2:
				System.out.println("OPCION 2");
				break;
			case 3:
				System.out.println("OPCION 3");
				break;
			case 4:
				System.out.println("OPCION 4");
				break;
			case 5:
				System.out.println("OPCION 5");
				break;
			case 6:
				System.out.println("OPCION 6");
				break;
			case 0:
				System.out.println("OPCION 0");
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción NO valida. Introduce otra.");
				break;
			}
		}while(opcion!=0);
		System.out.println("Gracias por usar el programa.");
	}
	
	private static void registrarPanel(int [] id_Panel, double [] potencia_Panel, double [] ubicacion_X_Panel,double [] ubicacion_Y_Panel, String [] orientacion_Panel, String [] estado_Panel) {
		System.out.println("Usted ha elegido la opcion->1");
		registrarIdPanel(id_Panel);
		registrarPotenciaPanel(potencia_Panel);
		registrarPotenciaEstado(estado_Panel);
		
	}
	
	private static void registrarIdPanel(int [] id_Panel) {
		int id;
		int i=0;
		boolean aniadido=false;
		while (i < id_Panel.length && !aniadido) {
			if(id_Panel[i]==0) {
				System.out.println("Introduce el Identificador del Panel:");
				id=entrada.nextInt();
				id_Panel[i]=id;
				aniadido=true;
			}
			i++;
		}
		if(aniadido==true) {
			System.out.println("ID añadido.");
		}
		else {
			System.out.println("Error.");
		}
	}
	
	private static void registrarPotenciaPanel(double [] potencia_Panel) {
		double potencia;
		int i=0;
		boolean aniadido=false;
		while (i < potencia_Panel.length && !aniadido) {
			if(potencia_Panel[i]==0) {
				System.out.println("Introduce la Potencia del Panel:");
				potencia=entrada.nextDouble();
				potencia_Panel[i]=potencia;
				aniadido=true;
			}
			i++;
		}
		if(aniadido==true) {
			System.out.println("Potencia añadida.");
		}
		else {
			System.out.println("Error.");
		}
	}
		
	private static void registrarPotenciaEstado(String [] estado_Panel) {
		String estado=" ";
		int i=0;
		boolean aniadido=false;
		while (i < estado_Panel.length && !aniadido) {
			if(estado_Panel[i]=="") {
				estado="Inactivo";
				estado_Panel[i]=estado;
				aniadido=true;
			}
			i++;
		}
		if(aniadido==true) {
			System.out.println("Estado añadido.");
		}
		else {
			System.out.println("Error.");
		}
	}
	
	
		

}



