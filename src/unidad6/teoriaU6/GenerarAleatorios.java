package unidad6.teoriaU6;
import java.util.Random;

public class GenerarAleatorios {

	public static void main(String[] args) {
		Random random= new Random();
		
		//Generar un numero aleatorio
		int numAleatorio1= random.nextInt();
		System.out.println(numAleatorio1);
		
		//Generar un numero aleatorio entre 1 y 100
		int numAleatorio2= random.nextInt(101);// aquí le indicamos el límite.
		System.out.println(numAleatorio2);
	}

}
