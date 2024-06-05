package unidad3.ejerciciosU3;
import java.util.Scanner;
/*
 * Se ingresan tres notas de un alumno, si el promedio 
 * es mayor o igual a siete mostrar un mensaje "Promociona".
 */

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		float nota1;
		float nota2;
		float nota3;
		float media;
		System.out.print("Introduce la primera nota:");
		nota1=entrada.nextFloat();
		System.out.print("Introduce la segunda nota:");
		nota2=entrada.nextFloat();
		System.out.print("Introduce la tercera nota:");
		nota3=entrada.nextFloat();
		media=(nota1+nota2+nota3)/3;
		if(media>=7){
			System.out.println("Promociona.");
		}
	}

}
