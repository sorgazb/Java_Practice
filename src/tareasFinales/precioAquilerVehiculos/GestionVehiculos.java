package tareasFinales.precioAquilerVehiculos;

import java.util.Scanner;

public class GestionVehiculos {

	public static Scanner entrada= new Scanner(System.in);
	
	public static void main(String[] args) {
		gestioVehiculos();
	}
	
	public static void gestioVehiculos() {
		RegistroVehiculos rv= new RegistroVehiculos();
		int opcion=0;
		do {
			menu();
			System.out.print("-Opcion:");
			opcion=entrada.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("OPCION 1--> Añadir Vehiculo");
				rv.registrarVehiculo(pedirTipoVehiculo());
				break;
			case 2:
				System.out.println("OPCION 2--> Obtener Precio Alquiler");
				rv.buscarVehiculo(pedirMatricula());
				break;
			case 3:
				System.out.println("OPCION 3--> Mostrar Todos Los Precios");
				rv.mostrarTodosPrecio(pedirNumDias());
				break;
			case 0:
				System.out.println("SALIENDO...");
				break;
			default:
				System.out.println("ERROR. Opción no valida.");
				break;
			}
		}while(opcion!=0);
	}
	
	public static void menu() {
		System.out.println("--MENU ALQUILER--");
		System.out.println("OPCION 1--> Añadir Vehiculo");
		System.out.println("OPCION 2--> Obtener Precio Alquiler");
		System.out.println("OPCION 3--> Mostrar Todos Los Precios");
		System.out.println("OPCION 0--> SALIR");
	}
	
	public static VehiculoAlqui pedirTipoVehiculo() {
		VehiculoAlqui vAlquilar=null;
		int opcion=0;
		do {
			System.out.println("-Elige el tipo de Vehiculo.");
			System.out.println("1-->Vehiculo de Pasajeros.");
			System.out.println("2-->Vehiculo de Carga.");
			System.out.println("OPCION 0--> SALIR");
			opcion=entrada.nextInt();
			switch(opcion) {
			case 1:
				vAlquilar=crearVehiculoPasajero();
				break;
			case 2:
				vAlquilar=crearVehiculoCarga();
				break;
			case 0:
				System.out.println("SALIENDO...");
				break;
			default:
				System.out.println("ERROR.Opción no valida.");
				break;
			}
		}while(opcion!=0);
		return vAlquilar;
	}
	
	public static VehiculoAlqui crearVehiculoPasajero() {
		VehiculoAlqui vAlquilar=null;
		String matricula;
		int plazas;
		int opcion=0;
		do {
			System.out.println("1-->Añadir Coche.");
			System.out.println("2-->Añadir Microbus.");
			System.out.println("OPCION 0--> SALIR");
			System.out.print("-Opcion:");
			opcion=entrada.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("1-->Añadir Coche.");
				matricula=pedirMatricula();
				plazas=pedirNumPlazas();
				vAlquilar= new Coche(matricula, plazas);
				break;
			case 2:
				System.out.println("2-->Añadir Microbus.");
				matricula=pedirMatricula();
				plazas=pedirNumPlazas();
				vAlquilar=new Microbus(matricula, plazas);
				break;
			case 0:
				System.out.println("SALIENDO...");
				break;
			default:
				System.out.println("ERROR.Esa opción no es válida.");
				break;
			}
		}while(opcion!=0);
		return vAlquilar;
	}
	
	public static VehiculoAlqui crearVehiculoCarga() {
		VehiculoAlqui vAlquilar=null;
		String matricula;
		double pma;
		int opcion=0;
		do {
			System.out.println("1-->Añadir Furgoneta.");
			System.out.println("2-->Añadir Camion.");
			System.out.println("OPCION 0--> SALIR");
			System.out.print("-Opcion:");
			opcion=entrada.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("1-->Añadir Furgoneta.");
				matricula=pedirMatricula();
				pma=pedirPMA();
				vAlquilar= new Furgoneta(matricula, pma);
				break;
			case 2:
				System.out.println("2-->Añadir Camion.");
				matricula=pedirMatricula();
				pma=pedirPMA();
				vAlquilar= new Camion(matricula, pma);
				break;
			case 0:
				System.out.println("SALIENDO...");
				break;
			default:
				System.out.println("ERROR.Esa opción no es válida.");
				break;
			}
		}while(opcion!=0);
		return vAlquilar;
	}
	
	public static String pedirMatricula() {
		boolean formatoCorrecto=false;
		String matricula;
		do {
			System.out.println("-Introduce matricula:");
			matricula=entrada.next();
			entrada.nextLine();
			if(validarMatricula(matricula)==true) {
				formatoCorrecto=true;
			}
		}while(formatoCorrecto==false);
		return matricula;
	}
	
	public static int pedirNumPlazas() {
		boolean formatoCorrecto=false;
		int plazas;
		do {
			System.out.println("-Introduce el número de plazas:");
			plazas=entrada.nextInt();
			entrada.nextLine();
			if(plazas>0) {
				formatoCorrecto=true;
			}
		}while(formatoCorrecto==false);
		return plazas;
	}
	
	public static double pedirPMA() {
		boolean formatoCorrecto=false;
		double pma;
		do {
			System.out.println("-Introduce el PMA:");
			pma=entrada.nextDouble();
			entrada.nextLine();
			if(pma>0) {
				formatoCorrecto=true;
			}
		}while(formatoCorrecto==false);
		return pma;
	}
	
	public static int pedirNumDias() {
		boolean formatoCorrecto=false;
		int dias;
		do {
			System.out.println("-Introduce el número de dias:");
			dias=entrada.nextInt();
			entrada.nextLine();
			if(dias>0) {
				formatoCorrecto=true;
			}
		}while(formatoCorrecto==false);
		return dias;
	}
	
	public static boolean validarMatricula(String matricula) {
		return matricula.matches("\\d{4}[A-Z]{3}");
	}

}
