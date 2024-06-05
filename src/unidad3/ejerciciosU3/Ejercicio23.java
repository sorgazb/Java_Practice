package unidad3.ejerciciosU3;
import java.util.Scanner;
/*
 * Realice una aplicación que permita emitir una factura correspondiente a la venta 
 * de un artículo del cual se adquieren varias unidades. El IVA a aplicar es del 21% 
 * y si el monto total (precio de ventas + IVA) es menor o igual a 30.00 €. Se 
 * aplicará un 10% de descuento, si el monto total es mayor a 30.00 € pero menor 
 * a 70.00 €. Se le aplicará un 25% y si el monto total es superior a 70.00 € 
 * entonces se le aplicará un descuento del 35%. 	
 * El programa recogerá por teclado la cantidad de un artículo y el precio unitario 
 * de ese artículo. Se mostrará la cuantía de la factura sobre dicho artículo.
 */

public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		//Variables:
		int nArticulos;
		double precioArticulo;
		
		System.out.println("---- FACTURA ----");
		System.out.println("- Introduce el número de articulos:");
		nArticulos=entrada.nextInt();
		System.out.println("- Introduce el precio de la unidad del artículo:");
		precioArticulo=entrada.nextDouble();
		
		double precioNoIVA=nArticulos*precioArticulo;
		System.out.println("-Precio sin IVA: "+precioNoIVA);
		double precioIVA=precioNoIVA+(precioNoIVA*0.21);
		System.out.println("-Precio con IVA: "+precioIVA);
		
		if(precioIVA <= 30.00) {
			precioIVA=precioIVA * 0.9;
			System.out.println("El precio total es:" + precioIVA);
		}else if(precioIVA > 30.00 && precioIVA <= 70.00 ) {
			precioIVA=precioIVA * 0.75;
			System.out.println("El precio total es:" + precioIVA);
		}else if(precioIVA > 70.00) {
			precioIVA=precioIVA * 0.65;
			System.out.println("El precio total es:" + precioIVA);
			
		}
		
		
		entrada.close();
	}

}
