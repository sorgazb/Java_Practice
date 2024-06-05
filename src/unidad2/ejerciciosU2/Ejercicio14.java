package unidad2.ejerciciosU2;
import java.util.Scanner;

public class Ejercicio14 {
	/*
	 * Escribe un programa Java que realice lo siguiente: declara una variable N de tipo int,
	 * una variable A de tipo double y una variable C de tipo  char y asigna a cada una un valor.
	 * A continuación muestra por pantalla: 
	 * El valor de cada variable. La suma de N + A.
	 * La diferencia de A - N.
	 * El valor numérico correspondiente al carácter que contiene la variable C.
	 * Si por ejemplo le hemos dado a N el valor 5, a A  el valor 4.56 y a C el valor ‘a’, 
	 * se debe mostrar por pantalla:
	 * Variable N = 5 Variable A = 4.56 Variable C = a
	 * 5 + 4.56 = 9.559999999999999
	 * 4.56 - 5 = -0.4400000000000004
	 * Valor numérico del carácter a = 97
	 */

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int N;
		double A;
		char c;
		
		
		System.out.println("Introduce el valor de la variable N: ");
		N=entrada.nextInt();
		System.out.println("Introduce el valor de la variable A: ");
		A=entrada.nextDouble();
		System.out.println("Introduce el valor de la variable c: ");
		c=entrada.next().charAt(0);
		
		System.out.println("El valor de N ="+N);
		System.out.println("El valor de A ="+A);
		System.out.println("El valor de c ="+c);
		
		double suma=N+A;
		double diferencia=A-N;
		int numero;
		numero=(int)c;
		
		System.out.println("La suma de N+A: "+N+" + "+A+"="+suma);
		System.out.println("La diferencia de A-N: "+A+" - "+N+"="+diferencia);
		System.out.println("El valor númerico del carácter "+c+" es: "+numero);
	}

}
