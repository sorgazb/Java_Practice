package unidad4.ejerciciosU4;
import java.util.Scanner;

/*
 * Escribe un método llamado cuadrado que acepte un argumento entero
 * y devuelva el cuadrado de ese argumento.
 */

public class Ejercicio9 {

	//Método main en el cual el usuario nos da un numero entero y 
	//hacemos la llamada al método cuadrado.
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);//Scanner el cual nos deja escribir por pantalla.
		int numero;//Numero entero el cual nos da el usuario.
		
		System.out.print("Introduce el número de tipo entero:");
		numero=entrada.nextInt();
		System.out.println("El cuadrado del numero "+numero+" es "+cuadrado(numero));//Llamada al método cuadrado.
		
		entrada.close();
	}
	
	//Método cuadrado el cual nos devuleve el cuadrado del numero que le llega por parámetros.
	public static int cuadrado(int x) {
		return (x*x);
	}
}
