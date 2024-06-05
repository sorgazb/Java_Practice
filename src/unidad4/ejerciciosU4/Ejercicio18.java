package unidad4.ejerciciosU4;
import java.util.Scanner;

/*
 * Escribe un método llamado quintosAEuros. El método debe aceptar un argumento int 
 * que sea un número de monedas de veinte céntimos y devolver el número equivalente de euros como doble. 
 * Por ejemplo, si pasa 5 como argumento, el método debería devolver 1.0; 
 * y si pasa 8 como argumento, el método debería devolver 1,60.
 */

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el número de monedas de 20 cents:");
		int monedas=entrada.nextInt();
		double resultado=quintoAEuros(monedas);
		System.out.printf("El equivalente en euros es: %.2f€",resultado);
		entrada.close();
	}
	
	public static double quintoAEuros(int num) {
		double euros=0.0;
		euros=num*0.2;
		return euros;
	}

}
