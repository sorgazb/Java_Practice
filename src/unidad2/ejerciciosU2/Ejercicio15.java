package unidad2.ejerciciosU2;
import java.util.Scanner;

public class Ejercicio15 {
	/*
	 * Escribe un programa Java que declare una variable entera N y asígnale un valor.
	 * A continuación escribe las instrucciones que realicen los siguientes:
	 * -Incrementar N en 77.
	 * -Decrementarla en 3.
	 * -Duplicar su valor.
	 */

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int N;
		System.out.println("Valor inicial de N:");
		N=entrada.nextInt();
		System.out.println(N+"+77="+(N+77));
		System.out.println(N+"-3="+(N-3));
		System.out.println(N+"*2="+(N*2));
	}

}
