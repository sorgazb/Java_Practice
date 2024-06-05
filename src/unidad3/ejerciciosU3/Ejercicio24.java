package unidad3.ejerciciosU3;
import java.util.Scanner;
/*
 * Implementar una aplicación que permita agregar una letra para representar la 
 * calificación de los estudiantes, las calificaciones son notas entre 1 y 10; 
 * use los siguientes parámetros: A para calificaciones mayores o iguales a 9, 
 * B para calificaciones mayores o iguales a 8, C para calificaciones mayores 
 * o iguales a 7, D para calificaciones mayores o iguales a 6, F para todas las 
 * demás calificaciones.
 */

public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		float nota;
		boolean fin=false;
		System.out.println("Introduce la nota que ha sacado el usuario");
		nota=entrada.nextFloat();
		
		do {
			System.out.println("Introduce la nota que ha sacado el usuario");
			nota=entrada.nextFloat();
			if(nota >= 9 && nota <=10) {
				System.out.println("Ha obtenido una calificación de -> A");
				fin=true;
			}else if(nota >= 8 && nota < 9) {
				System.out.println("Ha obtenido una calificación de -> B");
				fin=true;
			}else if(nota >= 7 && nota < 8) {
				System.out.println("Ha obtenido una calificación de -> C");
				fin=true;
			}else if(nota >= 6 && nota < 7) {
				System.out.println("Ha obtenido una calificación de -> D");
				fin=true;
			}else if(nota >= 1 && nota < 6) {
				System.out.println("Ha obtenido una calificación de -> F");
				fin=true;
			}else {
				System.out.println("Ha introducido una nota no valida. Por favor introduce la nota otra vez:");
			}
			
		}while(!fin);
	}

}
