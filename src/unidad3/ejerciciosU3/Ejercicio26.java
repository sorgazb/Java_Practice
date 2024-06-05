package unidad3.ejerciciosU3;
import java.util.Scanner;
/*
 *  Un cliente solicita el pedido de cierta cantidad de brochas de cerda, rodillos 
 *  y sellador. Las brochas de cerda tienen un 20% de descuento; los rodillos, un 15% 
 *  de descuento; y el sellador, 5%. Los precios de cada artículo son como siguen: 	
 *  Brochas de cerda 20.00€ 	
 *  Rodillos 45.00€
 *  Sellador 10.00€ 	
 *  Se desea implementar una aplicación que permita ingresar la cantidad comprada 
 *  por un determinado cliente. Además, si paga al contado tiene un descuento del 7%. 
 *  Al final deberá mostrar el costo total de la orden, tanto para el pago de contado 
 *  como para el caso de pago de crédito.
 */

public class Ejercicio26 {

	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES:
		Scanner entrada= new Scanner(System.in);
		int nBrochas;
		int nRodillos;
		int nSelladores;
		double precioBrocha=20.00;
		double precioRodillo=45.00;
		double precioSellador=10.00;
		
		System.out.println("---- LISTA DE COMPRA ----");
		System.out.print("Introduce número de BROCHAS DE CERDA: ");
		nBrochas= entrada.nextInt();
		System.out.print("Introduce número de ROLLIDOS: ");
		nRodillos= entrada.nextInt();
		System.out.print("Introduce número de SELLADORES: ");
		nSelladores= entrada.nextInt();
		
		double pTotalBrochas=(nBrochas*precioBrocha)*0.8;
		double pTotalRodillos=(nRodillos*precioRodillo)*0.85;
		double pTotalSelladores=(nSelladores*precioSellador)*0.95;
		
		double pTotal= pTotalBrochas + pTotalRodillos + pTotalSelladores;
		
		boolean esFinal=true;
		int opcion=0;
		
		if(nBrochas==0 && nRodillos==0 && nSelladores==0) {
			System.out.println("Gracias por su visita.");
		}else {
			do {
				System.out.println("---- FORMA DE PAGO ----");
				System.out.println("1-> Al contado (7% descuento).");
				System.out.println("2-> Con tarjeta de credito.");
				System.out.println("Opción:");
				opcion=entrada.nextInt();
				
				switch(opcion) {
				case 1:
					System.out.println("Ha elegido Pago al Contado:");
					System.out.println("---- TICKET ----");
					System.out.println("-Brochas: "+nBrochas+" -Precio Unidad: "+precioBrocha+"€"+" -Precio Total: "+pTotalBrochas+"€");
					System.out.println("-Rodillos: "+nRodillos+" -Precio Unidad: "+precioRodillo+"€"+" -Precio Total: "+pTotalRodillos+"€");
					System.out.println("-Selladores: "+nSelladores+" -Precio Unidad: "+precioSellador+"€"+" -Precio Total: "+pTotalSelladores+"€");
					System.out.println("-----------------");
					System.out.println("Total (descuento 7%): "+(pTotal*0.93)+"€");
					esFinal=false;
					break;
				case 2:
					System.out.println("Ha elegido Pago con Tarjeta de Credito:");
					System.out.println("---- TICKET ----");
					System.out.println("-Brochas: "+nBrochas+" -Precio Unidad: "+precioBrocha+"€"+" -Precio Total: "+pTotalBrochas+"€");
					System.out.println("-Rodillos: "+nRodillos+" -Precio Unidad: "+precioRodillo+"€"+" -Precio Total: "+pTotalRodillos+"€");
					System.out.println("-Selladores: "+nSelladores+" -Precio Unidad: "+precioSellador+"€"+" -Precio Total: "+pTotalSelladores+"€");
					System.out.println("-----------------");
					System.out.println("Total : "+(pTotal)+"€");
					esFinal=false;
					break;
				default:
					System.out.println("Esa opción NO ES VALIDA");
				    break;
				}

			}while(esFinal);
		}
		entrada.close();
	}
}
