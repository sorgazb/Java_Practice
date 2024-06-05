package unidad2.ejerciciosU2;
import java.util.Scanner;

public class Ejercicio12 {
	/*
	 * Escribe una aplicación que, usando números, imprima la suma,
	 * producto,diferencia y cociente(división) de los números
	 */

	public static void main(String[] args) {
		double numero1;
		double numero2;
		double suma;
		double resta;
		double producto;
		double cociente;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el primer número:");
		numero1=entrada.nextDouble();
		System.out.println("Introduce el segundo número:");
		numero2=entrada.nextDouble();
		suma=numero1+numero2;
		System.out.println("La suma es: "+numero1+"+"+numero2+"="+suma);
		resta=numero1-numero2;
		System.out.println("La resta es: "+numero1+"+"+numero2+"="+resta);
		producto=numero1*numero2;
		System.out.println("El producto es: "+numero1+"*"+numero2+"="+producto);
		cociente=numero1/numero2;
		System.out.println("El cocientes es: "+numero1+"/"+numero2+"="+cociente);
	}

}
