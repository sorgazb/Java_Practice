package unidad4.ejerciciosU4;
import java.util.Scanner;
/*
 * Escriba una función que reciba como parametros de entrada un valor entero y comprueba si se encuentra
 * comprendido entre dos valores constantes OPMIN Y OPMAX. La función devolverá un valor lógico true en 
 * caso afirmativo, y false en caso contrario.
 */

public class Ejercicio7 {
	//Establecemos los valores de las constantes
	public final static int OPMIN=10;
	public final static int OPMAX=100;
	
	//Método main en el que llamamos al método boolean
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);//Declaramos el Scanner
		int numero;//Declaramos el número entero el cual nos dará el usuario
		
		System.out.println("Introduce un número.");
		numero=entrada.nextInt();
		estaEntreValores(numero);//Llamada al método de la clase
		
		entrada.close();
	}
	
	//Método estaEntreValores en el cual dado un número nos dice si está entre los
	//valores OPMIN y OPMAX
	public static boolean estaEntreValores(int x) {
		boolean esta=false;
		
		if(x >= OPMIN && x <= OPMAX) {
			esta=true;
			System.out.println("True. Está");
		}
		else {
			System.out.println("False. No está");
		}
		
		return esta;
	}

}
