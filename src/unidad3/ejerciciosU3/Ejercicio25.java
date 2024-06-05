package unidad3.ejerciciosU3;
import java.util.Scanner;
/*
 *  Un agricultor tiene 150 hectáreas disponibles para plantar maíz y tomates. 
 *  Las semillas de tomates le cuestan 3.00 € por hectárea y las de maíz 5.00 € 
 *  por hectárea. Implemente una aplicación que permita determinar cuál es el 
 *  costo que invertirá el agricultor por la compra de cierta cantidad de hectáreas 
 *  de tomates y maíz, sabiendo que la suma de las hectáreas no debe exceder a 150 
 *  hectáreas. Además, deberá determinar en qué semilla se invirtió más dinero.
 */

public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double preHectareaTomate=3.00;
		double preHectareaMaiz=5.00;
		int hectareasTomate;
		int hectareasMaiz;
		double precioTomates;
		double precioMaiz;
		double precioTotal;
		
		System.out.println("¿Cuántas hectareas quiere plantar de Tomate?:");
		hectareasTomate=entrada.nextInt();
		System.out.println("¿Cuántas hectaresas quiere plantar de Maiz?:");
		hectareasMaiz=entrada.nextInt();
		
		if(hectareasTomate<151) {
			if(hectareasMaiz<151) {
				if((hectareasTomate+hectareasMaiz)<151) {
					precioTomates=preHectareaTomate*hectareasTomate;
					System.out.println("El precio invertido en los tomates es:"+precioTomates);
					precioMaiz=preHectareaMaiz*hectareasMaiz;
					System.out.println("El precio invertido en el maiz es:"+precioMaiz);
					precioTotal=precioTomates+precioMaiz;
					System.out.println("El precio total invertido es de:"+precioTotal);
					if(precioMaiz < precioTomates) {
						System.out.println("Ha invertido más en los tomates.");
					}else if(precioTomates < precioMaiz) {
						System.out.println("Ha invertido más en el maiz.");
					}else if(precioTomates==precioMaiz) {
						System.out.println("Ha invertido en ambos por igual.");
					}
				}
			}
		}
	}
}
