package unidad3.teoriaU3;
import java.util.Scanner;

public class Estacion2 {

	public static void main(String[] args) {
		int mes;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introzca el mes:");
		mes=entrada.nextInt();
		
		//Uso de operadores logicos.
		
		if((mes >= 1 && mes <=2) || mes==12) {
			System.out.println("Invierno");
		}
		else if(mes>=3 && mes<=5) {
			System.out.println("Primavera");
		}
		else if(mes>=6 && mes <=8) {
			System.out.println("Verano");
		}
		else if(mes>=9 && mes<=11) {
			System.out.println("Otoño");
		}
		else {
			System.out.println("No has introducido un valor válido.");
		}
	}

}
