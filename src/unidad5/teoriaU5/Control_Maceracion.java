package unidad5.teoriaU5;
import java.util.Scanner;

public class Control_Maceracion {
	
	public static final int NUM_DEPOSITOS=3;
	public static final int NUM_DEPO_TIPO=2;
	public static final double TAM_PARTE=1000;
	
	public static Scanner entrada= new Scanner (System.in);
	
	public static void main(String[] args) {
		
		double [][] control_Maceracion= new double [NUM_DEPOSITOS][NUM_DEPO_TIPO];
		funcionalidad(control_Maceracion);
		
	}
	
	private static void menu() {
		System.out.println("---- MENÚ CONTROL MACERACIÓN ----");
		System.out.println("1->Almacenar Vino.");
		System.out.println("2->Obtener Litros de un Tipo.");
		System.out.println("3->Obtener Deposito con mas Litros Por Tipo.");
		System.out.println("4->Obtener Medias de Litros.");
		System.out.println("5->Obtener Arrobas de un Tipo.");
		System.out.println("0->SALIR");
	}
	
	private static void funcionalidad(double [][] control_Maceracion) {
		int opcion;
		do {
			menu();
			System.out.print("-Opción:");
			opcion=entrada.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("1->Almacenar Vino.");
				funcionalidad1(control_Maceracion);
				break;
			case 2:
				System.out.println("2->Obtener Litros de un Tipo.");
				funcionalidad2(control_Maceracion);
				break;
			case 3:
				System.out.println("3->Obtener Deposito con mas Litros Por Tipo.");
				funcionalidad3(control_Maceracion);
				break;
			case 4:
				System.out.println("4->Obtener Medias de Litros.");
				break;
			case 5:
				System.out.println("5->Obtener Arrobas de un Tipo.");
				break;
			case 0:
				System.out.println("SALIENDO...");
				break;
			default:
				System.out.println("Opción no válida. Introduce otra.");
				break;
			}
		}while(opcion!=0);
		System.out.println("Has Salido del Programa. Gracias, hasta pronto.");
	}
	
	private static int pedirTipo() {
		int tipo=0;
		boolean fin=false;
		while(!fin) {
			System.out.println("Introduce el Tipo de Vino:");
			System.out.println("1->Tempranillo.");
			System.out.println("2->Garnacha.");
			System.out.println("3->Verdejo.");
			System.out.print("Tipo:");
			tipo=entrada.nextInt();
			if(tipo!=1 && tipo!=2 && tipo!=3) {
				fin=false;
				System.out.println("ERROR. Ese tipo no existe.");
			}else {
				fin=true;
			}
		}
		return tipo;
	}
	
	private static int pedirDeposito() {
		int deposito=0;
		boolean fin=false;
		while(!fin) {
			System.out.println("Introduce el Deposito:");
			System.out.println("1->Deposito 1.");
			System.out.println("2->Deposito 2.");
			System.out.print("Deposito:");
			deposito=entrada.nextInt();
			if(deposito!=1 && deposito!=2) {
				fin=false;
				System.out.println("ERROR. Ese Deposito no existe.");
			}else {
				fin=true;
			}
		}
		return deposito;
	}
	
	private static void insertarCantidad(int tipo,int deposito, double [][] control_Maceracion) {
		double cantidad=0;
		boolean fin=false;
		while(!fin) {
			System.out.print("Introduce la Cantidad de Vino a Almacenar:");
			cantidad=entrada.nextDouble();
			if(cantidad>0 && cantidad<=2000) {
				if(estaLleno(tipo,control_Maceracion)==false) {
					double cuantoFalta=cuantoFalta(tipo, control_Maceracion);
					double cantidadActual=obtenerCantidadDepo(tipo,deposito, control_Maceracion);
					if(cuantoFalta<cantidadActual) {
						System.out.println("Solo se pueden introducir "+cuantoFalta+"L.");
						control_Maceracion[tipo][deposito]=cantidadActual+cuantoFalta;
						fin=true;
					}else {
						fin=true;
						control_Maceracion[tipo][deposito]=cantidadActual+cantidad;
					}
				}else {
					System.out.println("No se puede introducir mas. Ya Está Lleno.");
				}
			}
			else {
				if(cantidad<=0) {
					System.out.println("ERROR. No se pueden Almacenar 0L o menos.");
				}else {
					System.out.println("ERROR.La Capacidad Maxima por Depoisto 1000L.");
				}
			}
		}
	}
	
	private static double obtenerCantidadDepo(int tipo,int deposito, double [][] control_Maceracion) {
		double cantidad=0;
		cantidad=control_Maceracion[tipo-1][deposito-1];
		return cantidad;
	}
	
	private static double obtenerCantidad(int tipo, double [][] control_Maceracion) {
		double cantidad=0;
		cantidad=control_Maceracion[tipo][0];
		cantidad=cantidad+control_Maceracion[tipo][1];
		return cantidad;
	}
	
	
	private static boolean estaLleno(int tipo,double [][] control_Maceracion) {
		boolean llena=false;
		double cantidad=obtenerCantidad(tipo, control_Maceracion);
		if(cantidad==TAM_PARTE) {
			llena=true;
		}
		return llena;
	}
	
	private static double cuantoFalta(int tipo,double [][] control_Maceracion) {
		double cuantoFalta=0;
		double cantidadActual=obtenerCantidad(tipo, control_Maceracion);
		cuantoFalta=2000-cantidadActual;
		return cuantoFalta;
	}
	
	
	private static void funcionalidad1(double [][] control_Maceracion) {
		int tipo=(pedirTipo()-1);
		int deposito=(pedirDeposito()-1);
		insertarCantidad(tipo, deposito, control_Maceracion);
	}
	
	private static void funcionalidad2(double [][] control_Maceracion) {
		int tipo=pedirTipo();
		double cantidad=obtenerCantidad(tipo, control_Maceracion);
		if(tipo==0) {
			System.out.println("Disponemos de "+cantidad+" L de Tempranillo.");
		}else if(tipo==1) {
			System.out.println("Disponemos de "+cantidad+" L de Garnacha.");
		}else if(tipo==2) {
			System.out.println("Disponemos de "+cantidad+" L de Verdejo.");
		}
	}
	
	private static void funcionalidad3(double [][] control_Maceracion) {
		System.out.println("De Tempranillo el deposito con mas litros es:");
		if(obtenerCantidadDepo(0, 0, control_Maceracion) > obtenerCantidadDepo(0, 1, control_Maceracion)) {
			System.out.println("El deposito 1 con "+obtenerCantidadDepo(0, 0, control_Maceracion));
		}
		else {
			System.out.println("El deposito 2 con "+obtenerCantidadDepo(0, 1, control_Maceracion));
		}
		System.out.println("De Garnacha el deposito con mas litros es:");
		if(obtenerCantidadDepo(1, 0, control_Maceracion) > obtenerCantidadDepo(1, 1, control_Maceracion)) {
			System.out.println("El deposito 1 con "+obtenerCantidadDepo(1, 0, control_Maceracion));
		}
		else {
			System.out.println("El deposito 2 con "+obtenerCantidadDepo(1, 1, control_Maceracion));
		}
		System.out.println("De Verdejo el deposito con mas litros es:");
		if(obtenerCantidadDepo(2, 0, control_Maceracion) > obtenerCantidadDepo(2, 1, control_Maceracion)) {
			System.out.println("El deposito 1 con "+obtenerCantidadDepo(2, 0, control_Maceracion));
		}
		else {
			System.out.println("El deposito 2 con "+obtenerCantidadDepo(2, 1, control_Maceracion));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
