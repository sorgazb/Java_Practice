package unidad6.teoriaU6;
import java.security.SecureRandom;

//Esta es la forma más segura de generar aleatorio, es la menos probable que repita números.
public class GenerarAleatorioSeguro {

	public static void main(String[] args) {
		SecureRandom random= new SecureRandom();
		
		int numAleatorio= random.nextInt();
		System.out.println(numAleatorio);
	}

}
