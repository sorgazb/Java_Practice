package unidad2.teoriaU2;

import java.util.Scanner;

public class LectorEscritor {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in) ;
		
		//Para leer cadenas.
		String nombre;
		System.out.println("Introduzca su nombre:");
		//nombre=entrada.nextLine();//Lee una linea entera hasta que el usuario de al intro,
		                            //con espacios en blanco.
		nombre=entrada.next();//Lee solo una palabra.
		
		//Para leer un numero que introduce el usuario
		int dato,dato2,res;
		System.out.println(nombre+" Dame un numero entero: ");	
		dato=entrada.nextInt();

		System.out.println("Usted ha escrito el numero: "+dato);
		
		System.out.println(nombre+" Introduce otro numero: ");
		
		dato2=entrada.nextInt();

		System.out.println("Usted ha escrito el numero: "+dato2);
		
		res=dato+dato2;
		
		System.out.println(nombre+" La suma de los dos numeros es:"+res);
		
		/*
		 * Otra opción seria:
		 * -System.out.println("La suma de los dos numeros es:"+(dato+dato2));
		 * Con esta opción te ahorras crear otra variable para almacenar el resultado.
		 */
		
		double dato3;
		System.out.println(nombre+" Dame su saldo del banco: ");
		dato3=entrada.nextDouble();
		System.out.println("Su saldo es: "+dato3);
		
		System.out.println("Gracias por todo "+nombre);
		
		/*
		 * En el caso de que lo que primero leamos sean numeros
		 * y despues una cadena, para que no nos de error despues de leer
		 * los numeros hay que vaciar el buffer con "entrada.nextLine()"
		 * y despues ya podemos leer la cadena.
		 */
		
		
		entrada.close();
	}
}
