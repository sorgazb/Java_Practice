package unidad4.teoriaU4;
import java.util.Scanner;

public class Recursividad {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduzca las veces que quiere ser saludado:");
		int numVeces=entrada.nextInt();
		System.out.println("-SOLUCIÓN ITERATIVA:");
		saludarIterativo(numVeces);
		System.out.println("-SOLUCIÓN RECURSIVA:");
		saludarRecursivo(numVeces);
		entrada.close();
	}
	
	private static void saludarIterativo(int numVeces) {
		for (int i=0; i < numVeces; i++) {
			System.out.println("Hola.");
		}
	}
	
	private static void saludarRecursivo(int numVeces) {
		if(numVeces>0) {
			System.out.println("Hola.");
			//La llamada recursiva se hace dentro del condicional.
			saludarRecursivo(numVeces-1);
		}
	}
	
}
