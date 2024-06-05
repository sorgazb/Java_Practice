package unidad2.ejerciciosU2;
import java.util.Scanner;

public class Ejercicio16 {
	/*
	 * Programa Java que declare cuatro variales enteras A,B,C y D y asignarle un valor a cada una.
	 * A continuación realiza las instrucciones necesarias para que:
	 * -B tome el valor de C.
	 * -C tome el valor de A.
	 * -A tome el valor de D.
	 * -D tome el valor de B.
	 */

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int A;
		int B;
		int C;
		int D;
		int auxA;
		int auxB;
		int auxC;
		int auxD;
		System.out.println("Valores iniciales:");
		System.out.println("A=");
		A=entrada.nextInt();
		System.out.println("B=");
		B=entrada.nextInt();
		System.out.println("C=");
		C=entrada.nextInt();
		System.out.println("D=");
		D=entrada.nextInt();
		auxA=A;
		auxB=B;
		auxC=C;
		auxD=D;
		B=auxC;
		C=auxA;
		A=auxD;
		D=auxB;
		System.out.println("Valores finales:");
		System.out.println("B toma valor de C -> B="+B);
		System.out.println("C toma valor de A -> C="+C);
		System.out.println("A toma valor de D -> A="+A);
		System.out.println("D toma valor de B -> D="+D);
	}

}
