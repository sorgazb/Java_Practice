package unidad3.teoriaU3;
import java.util.Scanner;

public class MayorEdad {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int edad;
		
		System.out.println("Introduzca su edad. Gracias: ");
		edad=entrada.nextInt();
		
		if(edad >= 18) {
			System.out.println("Es mayor de edad.");
			if(edad >= 30) {
				System.out.println("Es un/a pureta.");
			}
			else {
				System.out.println("No eres un pureta.");
			}
		}
		else {
			System.out.println("No es mayor de edad. ");
		}
		System.out.println("Gracias por usar el programa.");
	}

}
