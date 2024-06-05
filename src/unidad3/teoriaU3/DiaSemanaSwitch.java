package unidad3.teoriaU3;
import java.util.Scanner;

public class DiaSemanaSwitch {

	public static void main(String[] args) {
		int dia;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduzca el día de la semana: ");
		dia=entrada.nextInt();
		
		//Estructura básica del switch:
		switch(dia) {
		case 1:
			System.out.println("Es lunes");
			break;
		
		case 2:
			System.out.println("Es Martes");
			break;
        case 3:
		    System.out.println("Es Miercoles");
		    break;
		case 4:
		   System.out.println("Es Jueves");
		break;
		case 5:
			System.out.println("Es Viernes");
			break;
		case 6:
			System.out.println("Es Sabado");
			break;
		case 7:
			System.out.println("Es Domingo");
			break;
		default :
			System.out.println("No es un valor valido");
			break;
		}
		
		entrada.close();
	}
}
