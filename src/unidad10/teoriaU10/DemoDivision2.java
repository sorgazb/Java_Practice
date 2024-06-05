package unidad10.teoriaU10;

import java.util.Scanner;

public class DemoDivision2 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a=0;
		int b=0;
		double resultado=0;
		boolean fin=true;
		do {
			fin=true;
			System.out.print("Introduce dividendo:");
			a=entrada.nextInt();
			System.out.print("Introduce divisor:");
			b=entrada.nextInt();
			try{
				resultado=a/b;
			}catch(ArithmeticException exc) {
				System.err.println("Se ha producido un error. "+exc.getMessage());
				fin=false;
			}finally {
				System.out.println("Gracias por usar el programa.");
			}
		}while(!fin);

		
		System.out.println("Resultado: "+resultado);
    
	}
}
