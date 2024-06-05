package unidad5.ejerciciosU5;
import java.util.Scanner;

public class Ejercicio_Vendimia {
	
	public static Scanner entrada= new Scanner(System.in);
	public static final int TAM_VENDIMIA=6;
	
	public static void main(String[] args) {
		double [] array_vendimia= new double [TAM_VENDIMIA]; 
		funcionalidad(array_vendimia);
	}
	
	private static void menu() {
		System.out.println( "---- MENÚ VENDIMIA ----");
		System.out.println("1->Añadir Cantidad Zona.");
		System.out.println("2->Obtener Peso Total.");
		System.out.println("3->Obtener Cantidad Zona.");
		System.out.println("4->Media Peso.");
		System.out.println("0->Salir.");
	}
	
	private static void funcionalidad(double [] array) {
		int opcion;
		do {
			menu();
			System.out.print("->Opción:");
			opcion=entrada.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Ha elegido OPCION 1.");
				funcionalidad_Operacion1(array);
				break;
			case 2:
				System.out.println("Ha elegido OPCION 2.");
				obtenerPesoTotal(array);
				break;
			case 3:
				System.out.println("Ha elegido OPCION 3.");
				funcionalidad_Operacion2(array);
				break;
			case 4:
				System.out.println("Ha elegido OPCION 4.");
				obtenerPesoMedio(array);
				break;
			case 0:
				System.out.println("SALIENDO ...");
				break;
			default:
				System.out.println("Esa opción no es valida. Introduzca otra.");
				break;
			}
		}while(opcion!=0);
		System.out.println("Gracias por usar el programa. HASTA PRONTO");
	}
	
	private static int  aniadirCantidad(int valor, double [] array) {
		int valido=0;
		boolean enc=false;
		double cantidad;
		int i=0;
		while(i < array.length && enc==false && valido!=1) {
				enc=true;
				System.out.print("Introduce la candidad de Kg que quiere añadir a la Zona:");
				cantidad=entrada.nextDouble();
				if(cantidad<0.0) {
					System.out.println("Cantidad No Valida.");
				}
				else {
					array[i]=cantidad;
					valido=1;
					System.out.println("Ha añadido "+cantidad+" kg a la Zona "+valor+".");
				}
			i++;
		}
		if(enc==false) {
			System.out.println("Esa Zona no existe. Porfavor introduce una Zona Valida.");
		}
		return valido;
	}
	
	private static void funcionalidad_Operacion1(double [] array) {
		int valor=0;
		do {
			int zona;
			System.out.print("Introduce la Zona en la que deseas añadir zona:");
			zona=entrada.nextInt();
			valor=aniadirCantidad(zona, array);
		}while(valor!=1);
	}
	
	private static void obtenerPesoTotal(double [] array) {
		double peso=0;
		for(int i=0; i < array.length; i++) {
			peso=peso+array[i];
		}
		System.out.println("El peso total de la explotacion es:"+peso+" kg.");
	}
	
	private static int obtenerCantidadZona(int valor, double [] array) {
		int valido=0;
		boolean enc=false;
		double cantidad=0.0;
		int i=0;
		while(i < array.length && enc==false && valido!=1) {
			if(array[i]>0) {
				enc=true;
				valido=1;
				cantidad=array[i];
				System.out.println("La Zona "+valor+" tiene "+cantidad+" kg.");
			}
			else {
				enc=true;
				System.out.println("Esa zona está vacia");
				valido=1;
			}
			i++;
		}
		if(enc==false) {
			System.out.println("Esa Zona no existe. Porfavor introduce una Zona Valida.");
		}
		return valido;
	}
	
	private static void funcionalidad_Operacion2(double [] array) {
		int valor=0;
		do {
			int zona;
			System.out.print("Introduce la Zona que quieres consultar su cantidad:");
			zona=entrada.nextInt();
			valor=obtenerCantidadZona(zona, array);
		}while(valor!=1);
	}
	
	private static void obtenerPesoMedio(double [] array) {
		double peso=0;
		for(int i=0; i < array.length; i++) {
			peso=peso+array[i];
		}
		System.out.println("La media de peso de la explotación es: "+(peso/TAM_VENDIMIA)+" kg.");
	}

}
