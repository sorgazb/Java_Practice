package unidad3.ejerciciosU3;
import java.util.Scanner;
/*
 * Una empresa de alquiler de vehículos de tres clases: pequeños, medianos y grandes. 
 * La tarifa del alquiler por día es: 15€ en el auto pequeño, 20 € en el auto mediano 
 * y 30€ en el auto grande. Además, la empresa cobra 0.20 €/km recorrido en vehículo 
 * pequeño, 0.30 €/km recorrido en vehículo mediano y 0.40€ /km recorrido en vehículo 
 * grande. Si la cantidad de km recorridos por el auto supera los 10 km por día se le 
 * aumentara un 2.5% sobre el monto a pagar por el cliente. 	
 * Realice un programa que reciba el tipo de vehículo, los km a recorrer y muestre por 
 * pantalla el coste del alquiler del vehículo.
 */

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		String auto;
		double kmRecorridos;
		int pequeño=15;
		int mediano=20;
		int grande=30;
		double precio;
		
		System.out.println("Introduce el tipo de vehiculo que va a usar: ");
		System.out.println("-Auto PEQUEÑO.");
		System.out.println("-Auto MEDIANO.");
		System.out.println("-Auto GRANDE.");
		System.out.print("Opcion:");
		auto=entrada.next();
		
		System.out.print("Introduce los Kilometros que va a recorrer:");
		kmRecorridos=entrada.nextDouble();
		
		if(auto=="Pequenio") {
			System.out.println("Usted ha seleccionado el auto PEQUEÑO->15€");
			precio=pequeño+(0.20*kmRecorridos);
			if(kmRecorridos<10) {
				precio=precio+((precio*2.5)/100);
			}
			System.out.println("El costo total de su viaje de "+kmRecorridos+" km es:"+precio+"€");
		}else if(auto=="MEDIANO") {
			System.out.println("Usted ha seleccionado el auto MEDIANO->20€");
			precio=mediano+(0.30*kmRecorridos);
			if(kmRecorridos<10) {
				precio=precio+((precio*2.5)/100);
			}
			System.out.println("El costo total de su viaje de "+kmRecorridos+" km es:"+precio+"€");
		}else if(auto=="GRANDE") {
			System.out.println("Usted ha seleccionado el auto GRANDE->30€");
			precio=grande+(0.40*kmRecorridos);
			if(kmRecorridos<10) {
				precio=precio+((precio*2.5)/100);
			}
			System.out.println("El costo total de su viaje de "+kmRecorridos+" km es:"+precio+"€");
		}
		
	}

}
