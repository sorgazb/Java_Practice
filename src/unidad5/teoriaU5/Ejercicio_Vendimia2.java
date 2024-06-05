package unidad5.teoriaU5;
import java.util.Scanner;

public class Ejercicio_Vendimia2 {
	
	public static Scanner entrada= new Scanner(System.in);
	public static final int TAM_VENDIMIA=6;
	public static double [] zonas= new double [TAM_VENDIMIA];
	
	public static void main(String[] args) {
		funcionalidad2(zonas);
	}
	
	private static void menu() {
		System.out.println("---- MENÚ VENDIMIA ----");
		System.out.println("1->Añadir Cantidad Zona.");
		System.out.println("2->Obtener Peso Total.");
		System.out.println("3->Obtener Cantidad Zona.");
		System.out.println("4->Media Peso.");
		System.out.println("5->Salir.");
	}
	
	private static void funcionalidad2(double [] array) {
		int opcion;
		do {
			menu();
			System.out.print("->Opción:");
			opcion=entrada.nextInt();
			operar(opcion);
		}while(opcion!=5);
		System.out.println("Gracias por usar el programa. HASTA PRONTO");
	}
	
	private static void operar(int opcion) {
		switch(opcion) {
		case 1:
			registrarPeso(pedirZona(), pedirPeso());
			break;
		case 2:	
			double pesoTotal=obtenerPesoTotal();
			System.out.println("El peso total es: "+pesoTotal+" kg.");
			break;
		case 3:
			cantidadPorZona(pedirZona());
			break;
		case 4:
			obtenerMediaPesos();
			break;
		case 5:
			System.out.println("Cerrando programa....");
			break;
		default:
			break;
		}
	}
	
	private static void obtenerMediaPesos() {
		double media= obtenerPesoTotal()/TAM_VENDIMIA;
		System.out.println("La media recogida por zona es: "+media+" kg.");
	}

	private static int pedirZona() {
		int zona=0;
		boolean zonaCorrecta=false;
		do {
			System.out.println("Introduzca la zona (1-6):");
			zona= entrada.nextInt();
			if(zona<1 || zona>TAM_VENDIMIA) {
				System.out.println("La Zona no existe");
			}else {
				zonaCorrecta=true;
			}
		}while(!zonaCorrecta);
		return zona;
	}
	
	private static double pedirPeso() {
		double peso;
		System.out.println("Introduzca el peso:");
		peso=entrada.nextDouble();
		return peso;
	}
	
	private static void registrarPeso(int zona,double peso) {
		zonas[zona-1]=zonas[zona-1]+peso;
	}
	
	private static double obtenerPesoTotal() {
		double pesoTotal=0;
		for(int i=0; i < zonas.length; i++) {
			pesoTotal=pesoTotal+zonas[i];
		}
		return pesoTotal;
	}
	
	private static void cantidadPorZona(int zona) {
		System.out.println("La zona "+zona+"---->"+zonas[zona-1]);
	}
	
	private static void imprimirDatos() {
		for(int i=0; i < zonas.length; i++) {
			System.out.println("Zona "+(i+1)+"--->"+zonas[i]);
		}
	}

}
