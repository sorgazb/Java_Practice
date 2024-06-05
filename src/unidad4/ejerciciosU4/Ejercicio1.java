package unidad4.ejerciciosU4;
import java.util.Scanner;

/*
 * Escribe un método Java para encontrar el número más pequeño entre tres numeros.
 */

public class Ejercicio1 {

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
		
		encontrarNumMenor(num1, num2, num3);
	}
	
	public static void encontrarNumMenor(int a, int b, int c) {
		int menor=a;
		if(b < menor) {
			menor=b;
			if(c < menor) {
				menor=c;
			}
		}else if(c < menor) {
			menor=c;
		}
		System.out.println("El numero más pequeño es: "+menor);
	}

}
