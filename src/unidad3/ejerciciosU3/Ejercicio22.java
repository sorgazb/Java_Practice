package unidad3.ejerciciosU3;
import java.util.Scanner;
/*
 * Determinar la cantidad de dinero que recibirá un/a trabajador/a por concepto de las 
 * horas extras trabajadas en una empresa, sabiendo que cuando las horas de trabajo 
 * exceden de 40, el resto se consideran horas extras y que éstas se pagan al doble 
 * de una hora normal cuando no exceden de 8; si las horas extras exceden de 8 
 * se pagan las primeras 8 al doble de lo que se paga por una hora normal y el resto 
 * al triple. La hora normal se paga a 12,5 €.
 * Realice un programa que reciba el número de horas extras que un trabajador/a 
 * ha realizado y muestre por pantalla la cantidad de dinero que percibirá por dichas 
 * horas extras.
 */

public class Ejercicio22 {

	public static void main(String[] args) {		
		//SOLUCIÓN LUIS 1:
		//Scanner entrada= new Scanner(System.in);
		//int numHoras=0;
		//double sueldo=0;
		
		//System.out.println("Introduce el número de horas: ");
		//numHoras=entrada.nextInt();
		
		//if(numHoras <= 40){
		//	sueldo=numHoras*12.5;
		//}else if(numHoras <= 48) {
		//	sueldo=(40*12.5) + ((numHoras-40)*25);
		//}else {
		//	sueldo=(40*12.5)+(8*25)+((numHoras-48)*37.5);
		//}
		//System.out.println("Su sueldo es: "+sueldo+"€");
		//--------------------------------------------------------------------------------
		//SOLUCIÓN LUIS 2:
		//Scanner entrada= new Scanner(System.in);
		//final double VALOR_HORA_A=12.5;
		//final double VALOR_HORA_B=25;
		//final double VALOR_HORA_C=37.5;
		
		//final int LIMITE_A=40;
		//final int LIMITE_B=48;
		
		//int numHoras=0;
		//double sueldo=0;
		
		//System.out.println("Introduce el número de horas: ");
		//numHoras=entrada.nextInt();
		
		//if(numHoras <= LIMITE_A){
		//	sueldo=numHoras*VALOR_HORA_A;
		//}else if(numHoras <= LIMITE_B) {
		//	sueldo=(LIMITE_A*VALOR_HORA_A) + ((numHoras-LIMITE_B)*VALOR_HORA_B);
		//}else {
		//	sueldo=(LIMITE_A*VALOR_HORA_A)+((LIMITE_B - LIMITE_A)*VALOR_HORA_B)+((numHoras-LIMITE_B)*VALOR_HORA_C);
		//}
		//System.out.println("Su sueldo es: "+sueldo+"€");
		//--------------------------------------------------------------------------------
		//SOLUCIÓN LUIS 3:
		Scanner entrada= new Scanner(System.in);
		final double VALOR_HORA_A=12.5;
		final double VALOR_HORA_B=25;
		final double VALOR_HORA_C=37.5;
		
		final int LIMITE_A=40;
		final int LIMITE_B=48;
		
		int numHorasA=0;
		int numHorasB=0;
		int numHorasC=0;
		int numHoras=0;
		double sueldo=0;
		
		System.out.println("Introduce el número de horas: ");
		numHoras=entrada.nextInt();
		
		if(numHoras <= LIMITE_A){
			sueldo=numHoras*VALOR_HORA_A;
			numHorasA=numHoras;
		}else if(numHoras <= LIMITE_B) {
			numHorasA=LIMITE_A;
			sueldo=(LIMITE_A*VALOR_HORA_A) + ((numHoras-LIMITE_B)*VALOR_HORA_B);
			numHorasB=numHoras-LIMITE_A;
			
		}else {
			numHorasA=LIMITE_A;
			sueldo=(LIMITE_A*VALOR_HORA_A)+((LIMITE_B - LIMITE_A)*VALOR_HORA_B)+((numHoras-LIMITE_B)*VALOR_HORA_C);
			numHorasB=LIMITE_B-LIMITE_A;
			numHorasC=numHoras-LIMITE_B;
		}
		
		System.out.println("Su sueldo es: "+sueldo+"€");
		System.out.println("Horas Tipo A: "+numHorasA);
		System.out.println("Horas Tipo B: "+numHorasB);
		System.out.println("Horas Tipo C: "+numHorasC);
	}
}
