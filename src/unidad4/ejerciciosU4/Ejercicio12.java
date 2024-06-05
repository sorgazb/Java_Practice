package unidad4.ejerciciosU4;
import java.util.Scanner;
import java.util.*;
/*
 * Escribe un método Java para calcular el área de un triángulo.
 * Salida esperada:
 * Lado-1: 10
 * Lado-2: 15
 * Lado-3: 20
 * El área del triángulo es 72.6184377413890
 */

public class Ejercicio12 {
	
	public static int lado1;
	public static int lado2;
	public static int lado3;
	public static Scanner entrada= new Scanner(System.in);
	
	public static void main(String[] args) {
		menuLados();
		double perimetro=perimetro(lado1, lado2, lado3);
		System.out.println("El área del triángulo es "+area(lado1, lado2, lado3, perimetro));;
	}
	
	public static void menuLados() {
		System.out.println("Introduce los lados del Triángulo.");
		System.out.print("Lado-1: ");
		lado1=entrada.nextInt();
		System.out.print("Lado-2: ");
		lado2=entrada.nextInt();
		System.out.print("Lado-3: ");
		lado3=entrada.nextInt();
	}
	
	public static double perimetro(int lado1, int lado2, int lado3) {
		double perimetro;
		perimetro=lado1+lado2+lado3;
		return perimetro;
	}
	
	public static double area(int lado1, int lado2, int lado3, double perimetro) {
		double area;
		double semiPerimetro=perimetro/2;
		double area1=semiPerimetro*(semiPerimetro-lado1)*(semiPerimetro-lado2)*(semiPerimetro-lado3);
		area=Math.sqrt(area1);
		return area;
	}
	
}
