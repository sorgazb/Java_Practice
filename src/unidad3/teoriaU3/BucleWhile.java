package unidad3.teoriaU3;
import java.util.Scanner;

public class BucleWhile {

	public static void main(String[] args) {
		/*
		 * Estructra bucle WHILE:
		 * inicializacion;
		 * while(condicion) {
		 *      acción a repetir;
		 *    actualización;
		 * }
		 */
		
		/*int i=0;
		int num=1;
		while(i<10) {
			System.out.println(num+"_."+" Valor de i="+i);
			i++;
			num=num+1;
		}*/
		
		//Ejercicio adivinanza:
		Scanner entrada=new Scanner(System.in);
		/*int sorteo=6;
		int eleccion;
		System.out.println("Introduce un numero:");
		eleccion=entrada.nextInt();
		while(eleccion != sorteo) {
			System.out.println("Ese no es el numero.");
			System.out.println("Introduce otro numero:");
			eleccion=entrada.nextInt();
		}
		System.out.println("Has encontrado el numero.");*/
		
		//Otra forma
		boolean enc=false;
		int sorteo2=6;
		int num;
		System.out.println("Introduce tu número:");
		num=entrada.nextInt();
		
		while(!enc) {
			if(num!=sorteo2) {
				System.out.println("No es ese numero. Introduce otro numero:");
				num=entrada.nextInt();
			}
			else {
				System.out.println("Ha acertado.");
				enc=true;
			}
		}
		System.out.println("Fin del juego");
	}

}
