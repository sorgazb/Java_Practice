package unidad4.ejerciciosU4;
import java.util.Scanner;
/*
 * Escriba un método llamado diezVeces. El método debe aceptar un valor de tipo doble y devuelve
 * un valor doble que es diez veces el valor del argumento.
 */

public class Ejercicio8 {

	//Método main en cual pedimos el numero de tipo doble
	//y llamamos al método diezVeces
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);//Scanner el cual dejará escribir al usuario
		double num;//El numero doble que nos dará el usuario
		
		System.out.print("Introduce un numero de tipo doble:");
		num=entrada.nextDouble();
		System.out.println(diezVeces(num));//Llamada al método diezVeces
		
		entrada.close();
	}
	
	//Metodo diezVeces el cual multiplica el numero de tipo doble
	//por 10.
	public static double diezVeces(double x) {
		return x*10;
	}
}
