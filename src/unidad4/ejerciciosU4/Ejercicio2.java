package unidad4.ejerciciosU4;
import java.util.Scanner;
/*
 *  Escribe un método Java para calcular la media de tres números.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Introduce el primer numero:");
		num1=entrada.nextInt();
		System.out.print("Introduce el segundo numero:");
		num2=entrada.nextInt();
		System.out.print("Introduce el tercer numero:");
		num3=entrada.nextInt();
		
		System.out.printf("La media es:"+media(num1, num2, num3));
		
	}
	
	public static double media(int a, int b, int c) {
		double media;
		media=(a+b+c)/3;
		return media;
	}

}
