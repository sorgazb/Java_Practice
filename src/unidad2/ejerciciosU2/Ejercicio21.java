package unidad2.ejerciciosU2;
import java.util.Scanner;

/*
 * Calculadora de ahorro en viajes compartidos. Investigue varios sitios web sobre viajes compartidos. 
 * Crear una aplicación que calcula su costo de conducción diario, para que pueda estimar cuánto 
 * dinero podría ahorrarse. Compartir coche también tiene otras ventajas como reducir las 
 * emisiones de carbono y reducir la congestión del tráfico.La aplicación debe ingresar la siguiente 
 * información y mostrar el costo del usuario por día de conducción al trabajo:
 * kilometros totales recorridos por día.
 * Costo por litro de gasolina.
 * Promedio de kilometros por litro.
 * Tarifas de estacionamiento por día.
 * Peajes por día.
 */

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		double kmRecorridos;
		double costeLitroGasolina;
		double litroKm;
		double tarifaEstacionamiento;
		double precioPeajes;
		
		System.out.println("Introduzca el total de Km que recorre al día:");
		kmRecorridos=entrada.nextDouble();
		System.out.println("Introduzca el coste del litro de gasolina:");
		costeLitroGasolina=entrada.nextDouble();
		System.out.println("Introduzca el consumo de su vehiculo a los 100km (L/km):");
		litroKm=entrada.nextDouble();
		System.out.println("Introduzca el precio de estacionamiento al día:");
		tarifaEstacionamiento=entrada.nextDouble();
		System.out.println("Introduzca el precio del peaje al día:");
		precioPeajes=entrada.nextDouble();
		
		double consumoKm=litroKm/100;
		double costeGasolina=(consumoKm*kmRecorridos) * costeLitroGasolina;
		double costeTotal= costeGasolina + tarifaEstacionamiento + precioPeajes;
		
		System.out.println("El coste total de su viaje es: "+ costeTotal + "€");
	}

}
