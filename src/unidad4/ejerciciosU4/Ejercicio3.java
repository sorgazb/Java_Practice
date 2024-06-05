package unidad4.ejerciciosU4;
import java.util.Scanner;

/*
 * Escribe un programa que pida dos números reales por teclado y muestre por pantalla el 
 * resultado de multiplicarlos. Implementa y utiliza la función: 
 * double multiplica(double a, double b) // Devuelve la multiplicación de dos números 
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double num1;
		double num2;
		
		System.out.print("Introduce el primer numero:");
		num1= entrada.nextDouble();
		System.out.print("Introduce el segundo numero:");
		num2= entrada.nextDouble();
		
		System.out.println("El resultado del producto es:"+multiplica(num1, num2));
		
		entrada.close();
	}
	
	public static double multiplica(double a, double b) {
		double resultado=a*b;
		return resultado;
	}

}
