package unidad4.teoriaU4;
import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce un numero:");
		int num1=entrada.nextInt();
		System.out.println("Introduce un numero:");
		int num2=entrada.nextInt();
		
		//Una opción de llamada (int)
		int suma=sumarEnteros(num1, num2);
		System.out.println("La suma es:"+suma);
		
		//Otra opcion de llamada (int)
		System.out.println("La suma es:"+sumarEnteros(num1, num2));
		
		//Opcion de llamada (void)
		sumarEnteros2(num1, num2);
		
		//Operación de resta
		int resta= restarEnteros(num1,num2);
		System.out.println("La resta es:"+resta);
		
		entrada.close();
	}
	
	public static int sumarEnteros(int a, int b) {
		int suma=a+b;
		return suma;
	}
	
	//Operación de suma hecha con un método void.
	public static void sumarEnteros2(int a, int b) {
		int suma=a+b;
		System.out.println("La suma es:"+suma);
	} 
	
	public static int restarEnteros(int a, int b) {
		int resta=a-b;
		return resta;
	}
	
}