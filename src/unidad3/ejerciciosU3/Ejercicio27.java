package unidad3.ejerciciosU3;
import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		int cantidad;
		int billetes500, billetes200, billetes100, billetes50, billetes20, billetes10, billetes5;
		Scanner entrada= new Scanner(System.in);
		System.out.print("Introduce la cantidad (multiplo de 5): ");
		cantidad=entrada.nextInt();
		if(cantidad >= 500) {
			billetes500= cantidad/500;
			cantidad=cantidad%500;
			System.out.print("Numero de billetes de 500:"+billetes500+", ");
		}
		if(cantidad >= 200) {
			billetes200=cantidad/200;
			cantidad=cantidad%200;
			System.out.print("Numero de billetes de 200:"+billetes200+", ");
		}
		if(cantidad >= 100) {
			billetes100= cantidad/100;
			cantidad=cantidad%100;
			System.out.print("Numero de billetes de 100:"+billetes100+", ");
		}
		if(cantidad >= 50) {
			billetes50= cantidad/50;
			cantidad=cantidad%50;
			System.out.print("Numero de billetes de 50:"+billetes50+", ");
		}
		if(cantidad >= 20) {
			billetes20= cantidad/20;
			cantidad=cantidad%20;
			System.out.print("Numero de billetes de 20:"+billetes20+", ");
		}
		if(cantidad >= 10) {
			billetes10= cantidad/10;
			cantidad=cantidad%10;
			System.out.print("Numero de billetes de 10:"+billetes10+", ");
		}
		if(cantidad >= 5) {
			billetes5= cantidad/5;
			cantidad=cantidad%5;
			System.out.print("Numero de billetes de 5:"+billetes5);
		}	
		entrada.close();
	}
}
