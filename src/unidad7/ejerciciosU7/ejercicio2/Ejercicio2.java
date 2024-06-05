package unidad7.ejerciciosU7.ejercicio2;
import java.util.Scanner;

/*
 * Escriba un programa Java que pida por consola dos números, 
 * compruebe que son positivos y que son menores de 100. 
 * Genere un número aleatorio comprendido entre los dos números introducidos.
 */

public class Ejercicio2 {
	
	//Scanner para poder introducir datos por pantalla
	public static Scanner entrada= new Scanner(System.in);
	
	//Método main
	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		System.out.print("Introduce el valor del primer número: ");
		num1=entrada.nextInt();
		System.out.print("Introduce el valor del segundo número: ");
		num2=entrada.nextInt();
		if(sonPositivosMenores100(num1, num2)) {
			int res= generarAleatorioRango(num1, num2);
			System.out.print("Numero dentro del rango: "+res);
		}else {
			System.err.println("ERROR.Los números no cumplen con la condición establecida.");
		}
		
	}
	
	//Método que comprueba que los dos números cumplen la condición de que estan entre
	//0 y 100.
	public static boolean sonPositivosMenores100 (int num1, int num2) {
		boolean loSon=false;
		if(num1 >= 0 && num1 < 100) {
			if(num2 >=0 && num2 < 100) {
				loSon=true;
			}
		}
		return loSon;
	}
	
	//Método para generar un número aleatorio entre el rango de números que hemos
	//introducido por pantalla.
	public static int generarAleatorioRango(int num1, int num2) {
		boolean fin=false;
		int numAleatorio=0;
		do {
			numAleatorio=(int) (Math.random()*num2 +1);// pasamos el segundo numero 
			                                           //suponiendo que va a ser el grande para 
			                                           //que genere hasta ese número 
			if(numAleatorio >= num1) {
				if(numAleatorio <= num2) {
					fin=true;
				}
			}
		}while(fin==false);
		return numAleatorio;
	}

}
