package unidad3.teoriaU3;
import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		int dia;
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduzca el día de la semana: ");
		dia=entrada.nextInt();
		
		if(dia==1) {
			System.out.println("Es Lunes");
		}
		else if(dia==2) {
			System.out.println("Es Martes");
		}
		else if(dia==3) {
			System.out.println("Es Miercoles");
		}
		else if(dia==4) {
			System.out.println("Es Jueves");
		}
		else if(dia==5) {
			System.out.println("Es Viernes");
		}
		else if (dia==6) {
			System.out.println("Es Sábado");
		}
		else if(dia==7) {
			System.out.println("Es Domingo");
		}
		else {
			System.out.println("No es un valor valido.");
		}
		//Fin de la estructura condicional
		
		entrada.close();
	}

}
