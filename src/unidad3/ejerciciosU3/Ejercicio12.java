package unidad3.ejerciciosU3;
import java.util.Scanner;

/*
 * Crea un programa llamado MedidasTornillos, que pida por teclado el tamaño
 * de un tornillo y muestre por pantalla el texto correspondiente al tamaño,
 * según la siguiente tabla:
 * - de 1 cm(incluido) hasta 3 cm(no incluido): pequeño.
 * - de 3 cm(incluido) hasta 5 cm(no incluido): mediano.
 * - de 5 cm(incluido) hasta 6.5 cm(no incluido): grande.
 * - de 6.5 cm(incluido) hasta 8.5 cm(no incluido): muy grande.
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		float medidaTornillo;
		System.out.println("Introduce la medida del tornillo: ");
		medidaTornillo=entrada.nextFloat();
		if(medidaTornillo>=1 && medidaTornillo < 3) {
			System.out.println("Pequeño");
		}else if(medidaTornillo >= 3 && medidaTornillo < 5) {
			System.out.println("Mediano");
		}else if(medidaTornillo >= 5 && medidaTornillo < 6.5) {
			System.out.println("Grande");
		}else if(medidaTornillo >= 6.5 && medidaTornillo < 8.5) {
			System.out.println("Muy grande");
		}else {
			System.out.println("No existe esa medida");
		}
	}
}
