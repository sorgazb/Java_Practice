package unidad3.teoriaU3;
import java.util.Scanner;

public class Estacion {

	public static void main(String[] args) {
		int mes;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introzca el mes:");
		mes=entrada.nextInt();
		
		//Caso para agrupar cases que tienen el mismo valor.
		switch (mes) {
		case 1:
		case 2:
			System.out.println("Invierno");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Primavera");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Verano");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Otoño");
			break;
		case 12:
			System.out.println("Invierno");
			break;
		default :
			System.out.println("Valor introducido no valido");
			break;
		}
		
	
		entrada.close();
	}

}
