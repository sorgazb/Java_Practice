package unidad2.teoriaU2;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		int primerNumero;
		int segundoNumero ;
		int tercerNumero;
		double media;
		int modulo;
		int suma;
		int resta;
		int producto;
		final double pi=3.14;
		int radio;
		double area;
		String nombre;
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el primer número:");
		primerNumero=entrada.nextInt();
		System.out.println("Introduce el segundo número:");
		segundoNumero=entrada.nextInt();
		System.out.println("Introduce el tercer número:");
		tercerNumero=entrada.nextInt();
		
		suma=primerNumero+segundoNumero+tercerNumero;
		resta=primerNumero-segundoNumero-tercerNumero;
		producto=primerNumero*segundoNumero*tercerNumero;
		
		media=suma/3;
		modulo= suma%2;
		
		System.out.println("La suma es: "+suma);
		System.out.println("La resta es: "+resta);
		System.out.println("El producto es: "+producto);
		System.out.println("La media es: "+media);
		System.out.println("El módulo 2 es: "+modulo);
		
		suma++;
		resta--;
		
		System.out.println("Incrementamos en uno la suma: "+suma);
		System.out.println("Decrementamos la resta en uno: "+resta);
		
		suma+=3; //equivale a suma=suma+3;
		resta-=4; //equivale a resta=resta-4;
		
		System.out.println("Incrementamos la suma en tres: "+suma);
		System.out.println("Decrementamos la resta en cuatro: "+resta);
		
		System.out.println("Introduzca un radio: ");
		radio=entrada.nextInt();
		area=pi*radio*radio;
		System.out.println("El area es: "+area);
		
		nombre="Pepe";
		System.out.println("Estos son los resultados,"+nombre);
		System.out.printf("Estos son los resultados,%s%n",nombre);
		
		System.out.printf("El numero 1 es %d, el numero 2 es %d%n",primerNumero,segundoNumero);
		System.out.println("El número 1 es,"+primerNumero+",el numero 2 es,"+segundoNumero);
		
		System.out.println("El area es:"+area);
		System.out.printf("El area es: %.3f",area);
	}

}
