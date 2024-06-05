package unidad4.ejerciciosU4;
import java.util.Scanner;

/*
 * Escriba un método Java para calcular el valor de la inversión futura 
 * a una tasa de interés determinada durante un número específico de años.
 * Ingresar el monto de la inversión: 1000
 * Ingresar la tasa de interés: 10
 * Ingresar el número de años: 5
 * Salida esperada:
 * Años	Valores futuros                                 	
 * 1        	1104.71                                 	
 * 2        	1220.39                                     
 * 3        	1348.18                                 	
 * 4        	1489.35                                 	
 * 5        	1645.31
 */



public class Ejercicio13_2 {
	//Variables:
	public static double inversion;
	public static double tipoInteres;
	public static int numAnio;
	public static Scanner entrada= new Scanner(System.in);
	
    public static void main(String[] args) {
    	inversion= pedirInversion();
    	tipoInteres= pedirTipoInteres();
    	numAnio= pedirAnio();
    	
    }   
    
    public static double pedirInversion() {
    	double inversion=0;
    	System.out.println("Introduzca la inversión a realizar");
    	inversion=entrada.nextDouble();
    	return inversion;
    }
    
    public static double pedirTipoInteres() {
    	double tipoInteres=0;
    	System.out.println("Introduzca el tipo de interés:");
    	tipoInteres=entrada.nextDouble();
    	return tipoInteres;
    }
    
    public static int pedirAnio() {
    	int numAnio=0;
    	System.out.println("Introduzca el número de años:");
    	numAnio=entrada.nextInt();
    	return numAnio;
    }
    
    
}
