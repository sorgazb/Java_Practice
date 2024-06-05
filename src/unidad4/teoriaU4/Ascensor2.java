package unidad4.teoriaU4;
import java.util.Scanner;

public class Ascensor2 {
	
	public static boolean puertaAbierta=false;
	public static int plantaActual=0;
	public static final int ULTIMA_PLANTA=5;
	public static final int PRIMERA_PLANTA=0;

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int opcion=0;
		int plantaMarcada;
		do {
			System.out.println("---- ASCENSOR ----");
			System.out.println("1.Marcar planta");
			System.out.println("2.Abrir puerta");
			System.out.println("3.Cerrar puerta");
			System.out.println("4.Apagar");
			opcion=entrada.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Introduzca el número de planata");
				plantaMarcada=entrada.nextInt();
				marcarPlanta(plantaMarcada);
				break;
			case 2:
				abrirPuerta();
				break;			
			case 3:
				cerrarPuerta();
				break;		
			case 4:
				System.out.println("Apagando...");
				break;			
			default:
				System.out.println("Opcion erronea");
				break;
			}
		}while(opcion!=4);	
		System.out.println("Ascensor apagado");	
		entrada.close();
	}

	private static void marcarPlanta(int plantaMarcada) {
		while(plantaMarcada!=plantaActual) {
			if(plantaActual<plantaMarcada) {
				subir();
			}else {
				bajar();
			}
		}
	}
	
	private static void abrirPuerta() {
		System.out.println("Abriendo puerta...");
		puertaAbierta=true;
		System.out.println("Puerta Abierta");
	}
	
	private static void cerrarPuerta() {
		System.out.println("Cerrando puerta...");
		puertaAbierta=false;
		System.out.println("Puerta Cerrada");
	}

	private static void subir() {	
		plantaActual++;
		System.out.println("Planta:"+plantaActual);
	}
	
	private static void bajar() {
		plantaActual--;
		System.out.println("Planta:"+plantaActual);
	}
	
	

}
