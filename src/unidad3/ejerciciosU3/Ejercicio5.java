package unidad3.ejerciciosU3;
import java.util.Scanner;

/*
 * Realizar un programa que lea por teclado dos numeros,
 * si el primero es mayor al segundo realizar la suma de 
 * ambos, en caso contrario realizar el producto del primero
 * respecto al segundo. 
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int numero1,numero2;
		System.out.print("Introduce el primer numero: ");
		numero1= entrada.nextInt();
		System.out.print("Introduce el segundo numero: ");
		numero2=entrada.nextInt();
		if(numero1>numero2) {
			System.out.println("Como el primer numero es mayor al segundo realizamos la suma.");
			System.out.println(numero1+"+"+numero2+"="+(numero1+numero2));
		}
		else if(numero2>numero1) {
			System.out.println("Como el segundo numero es mayor al primero realizamos el producto.");
			System.out.println(numero1+"*"+numero2+"="+(numero1*numero2));
		}else if(numero1==numero2) {
			System.out.println("Son los dos numeros iguales.");
		}
		entrada.close();
	}

}
