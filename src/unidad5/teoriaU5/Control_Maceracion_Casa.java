package unidad5.teoriaU5;
import java.util.Scanner;

public class Control_Maceracion_Casa {
	public static final int NUMERO_DEPOSITO=2;
	public static final int NUMERO_TIPOS=3;
	public static final double CAP_MAX=1000;
	public static final double ARROBA=16.133;
	public static Scanner entrada= new Scanner(System.in);

	public static void main(String[] args) {
		double [][] control_Maceracion= new double [NUMERO_DEPOSITO][NUMERO_TIPOS];
		funcionalidad(control_Maceracion);
	}
	
	private static void funcionalidad(double [][] control_Maceracion) {
		int opcion;
		do {
			opcion=menu();
			switch(opcion) {
			case 1:
				System.out.println("OPCIÓN 1->Mostral Estado Depositos.");
				mostrarControlMaceracion(control_Maceracion);
				break;
			case 2:
				System.out.println("OPCIÓN 2->Almacenar Vino.");
				almacenarVino(control_Maceracion);
				break;
			case 3:
				System.out.println("OPCIÓN 3->Obtener Litros por tipo de Uva.");
				obtenerLitrosPorTipo(control_Maceracion);
				break;
			case 4:
				System.out.println("OPCIÓN 4->Obtener Deposito con más Litros de cada Tipo.");
				obtenerDepositoConMasLitrosPorTipo(control_Maceracion);
				break;
			case 5:
				System.out.println("OPCIÓN 5->Obtener Media de Litros Almacenados.");
				obtenerMedia(control_Maceracion);
				break;
			case 6:
				System.out.println("OPCIÓN 6->Obtener Arrobas de Vino por Tipo.");
				pasarAArrobas(control_Maceracion);
				break;
			case 0:
				System.out.println("SALIENDO...");
				break;
			default:
				System.out.println("ERROR. Opción no válida, porfavor ingrese otra opción. ");
				break;
			}
		}while(opcion!=0);
		System.out.println("Gracias por usar el programa, hasta la próxima.");
	}
	
	private static int menu() {
		int opcion;
		System.out.println("------------ MENÚ CONTROL MACERACIÓN -----------");
		System.out.println("1->Mostral Estado Depositos.");
		System.out.println("2->Almacenar Vino.");
		System.out.println("3->Obtener Litros por tipo de Uva.");
		System.out.println("4->Obtener Deposito con más Litros de cada Tipo.");
		System.out.println("5->Obtener Media de Litros Almacenados.");
		System.out.println("6->Obtener Arrobas de Vino por Tipo.");
		System.out.println("0->Salir.");
		System.out.println("");
		System.out.print("-OPCIÓN: ");
		opcion=entrada.nextInt();
		System.out.println("------------------------------------------------");
		return opcion;
	}
	
	private static void mostrarControlMaceracion(double [][] control_Maceracion) {
		System.out.println("CONTROL MACERACIÓN");
		for(int i=0; i < NUMERO_DEPOSITO; i++) {
			for(int j=0; j < NUMERO_TIPOS; j++) {
				System.out.print("["+control_Maceracion[i][j]+"L]");
			}
			System.out.println(" ");
		}
	}
	
	private static void almacenarVino(double [][] control_Maceracion) {
		int tipo=0;
		int deposito=0;
		double cantidad=0;
		double cantidadActualDeposito=0;
		boolean almacenado=false;
		while(!almacenado) {
			tipo=((pedirTipoVino())-1);
			deposito=((pedirDeposito())-1);
			if(estaLleno(deposito, tipo,control_Maceracion)==false) {
				cantidad=pedirCantidad();
				cantidadActualDeposito=obtenerCantidadDeposito(deposito, tipo,control_Maceracion);
				double cabe=CAP_MAX-cantidadActualDeposito;
				if(cantidad <= cabe) {
					control_Maceracion[deposito][tipo]=cantidad;
					almacenado=true;
					System.out.println("Ha almacenado "+cantidad+"L en el deposito "+(deposito+1)+".");
				}
				else {
					System.out.println("Solo se podrán almacenar "+(CAP_MAX-cantidadActualDeposito)+"L en el deposito "+(deposito+1)+".");
					control_Maceracion[deposito][tipo]=cantidadActualDeposito+(CAP_MAX-cantidadActualDeposito);
					almacenado=true;
				}
			}
			else {
				System.out.println("ERROR. Ese deposito está lleno, porfavor ingrese un deposito válido.");
			}
		}
	}
	
	private static void obtenerLitrosPorTipo(double [][] control_Maceracion) {
		int tipo;
		double cantidadDepo1;
		double cantidadDepo2;
		double cantidadTotal;
		tipo=(pedirTipoVino()-1);
		cantidadDepo1=obtenerCantidadDeposito(0, tipo,control_Maceracion);
		cantidadDepo2=obtenerCantidadDeposito(1, tipo,control_Maceracion);
		cantidadTotal=cantidadDepo1+cantidadDepo2;
		System.out.println("En el deposito 1 hay: "+cantidadDepo1+"L.");
		System.out.println("En el deposito 2 hay: "+cantidadDepo2+"L.");
		System.out.println("En total hay: "+cantidadTotal+"L.");
	}
	
	private static void obtenerDepositoConMasLitrosPorTipo(double [][] control_Maceracion) {
		System.out.println("De Tempranillo el deposito con mas litros es:");
		if(obtenerCantidadDeposito(0, 0,control_Maceracion) > obtenerCantidadDeposito(1, 0,control_Maceracion)) {
			System.out.println("El deposito 1 con "+obtenerCantidadDeposito(0, 0,control_Maceracion));
		}
		else {
			System.out.println("El deposito 2 con "+obtenerCantidadDeposito(1, 0,control_Maceracion));
		}
		System.out.println("De Garnacha el deposito con mas litros es:");
		if(obtenerCantidadDeposito(0, 1,control_Maceracion) > obtenerCantidadDeposito(1, 1,control_Maceracion)) {
			System.out.println("El deposito 1 con "+obtenerCantidadDeposito(0, 1,control_Maceracion));
		}
		else {
			System.out.println("El deposito 2 con "+obtenerCantidadDeposito(1, 1,control_Maceracion));
		}
		System.out.println("De Verdejo el deposito con mas litros es:");
		if(obtenerCantidadDeposito(0, 2,control_Maceracion) > obtenerCantidadDeposito(1, 2,control_Maceracion)) {
			System.out.println("El deposito 1 con "+obtenerCantidadDeposito(0, 2,control_Maceracion));
		}
		else {
			System.out.println("El deposito 2 con "+obtenerCantidadDeposito(1, 2,control_Maceracion));
			}
	}
	
	private static void obtenerMedia(double [][] control_Maceracion) {
		double suma=0;
		double media=0;
		for(int i=0; i < NUMERO_DEPOSITO; i++) {
			for(int j=0; j < NUMERO_TIPOS; j++) {
				suma=suma+control_Maceracion[i][j];
			}
		}
		media=suma/6;
		System.out.println("La media de litros almacenados es: "+media+"L.");
	}
	
	private static void pasarAArrobas(double [][] control_Maceracion) {
		int tipo=0;
		tipo=(pedirTipoVino()-1);
		double cantidadDepo1=obtenerCantidadDeposito(0, tipo,control_Maceracion);
		double cantidadDepo2=obtenerCantidadDeposito(1, tipo,control_Maceracion);
		double cantidadTotal=cantidadDepo1+cantidadDepo2;
		double cantidadArrobas=(cantidadTotal/ARROBA);
		System.out.println("En total disponemos de "+cantidadArrobas+" arrobas de ese tipo.");
	}
	
	private static int pedirTipoVino() {
		int tipo=0;
		boolean fin=false;
		System.out.println("Elige Tipo de Vino:");
		System.out.println("TIPO 1-> TEMPRANILLO.");
		System.out.println("TIPO 2-> GARNACHA.");
		System.out.println("TIPO 3-> VERDEJO.");
		while(!fin) {
			System.out.print("TIPO: ");
			tipo=entrada.nextInt();
			if(tipo==1 || tipo==2 || tipo==3) {
				fin=true;
			}
			else {
				System.out.println("ERROR. Tipo de Vino no válido, porfavor ingrese un tipo válido.");
			}
		}
		return tipo;
	}
	
	private static int pedirDeposito() {
		int deposito=0;
		boolean fin=false;
		System.out.println("Elige Deposito:");
		System.out.println("1-> DEPOSITO 1.");
		System.out.println("2-> DEPOSITO 2.");
		while(!fin) {
			System.out.print("DEPOSITO: ");
			deposito=entrada.nextInt();
			if(deposito==1 || deposito==2) {
				fin=true;
			}
			else {
				System.out.println("ERROR. Deposito no válido, porfavor ingrese un deposito válido.");
			}
		}
		return deposito;
	}
	
	private static double pedirCantidad() {
		double cantidad=0;
		boolean fin=false;
		System.out.println("Introduce Cantidad(0.1L - 1000L):");
		while(!fin) {
			System.out.print("CANTIDAD: ");
			cantidad=entrada.nextDouble();
			if(cantidad > 0 && cantidad <= CAP_MAX) {
				fin=true;
			}
			else {
				System.out.println("ERROR. Cantidad no válida, porfavor ingrese una cantidad válida.");
			}
		}
		return cantidad;
	}
	
	private static double obtenerCantidadDeposito(int deposito, int tipo,double [][] control_Maceracion) {
		double cantidad=control_Maceracion[deposito][tipo];
		return cantidad;
	}
	
	private static boolean estaLleno(int deposito, int tipo,double [][] control_Maceracion) {
		boolean lleno=false;
		double cantidad=obtenerCantidadDeposito(deposito, tipo,control_Maceracion);
		if(cantidad==CAP_MAX) {
			lleno=true;
		}
		return lleno;
	}

}
