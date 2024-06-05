package unidad3.ejerciciosU3;
import java.util.Scanner;
/*
 * Implemente una aplicación que tome el peso en kilos de una cantidad de ropa a lavar en una lavadora industrial y nos
 * devuelva el nivel de agua dependiendo del peso. Se sabe que con más de 30 kilos la lavadora no funcionará ya que es
 * DEMASIADO PESO. Si la ropa pesa 22 o más kilos, el nivel será de MÁXIMO; si pesa 15 o más será de ALTO; si pesa 8 o más,
 * será un nivel MEDIO; o de lo contrario el nivel será MÍNIMO.
 */

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		float kgRopa;
		System.out.println("Introduce los kilos de ropa a lavar:");
		kgRopa= entrada.nextFloat();
		if(kgRopa > 30) {
			System.out.println("DEMASIADO PESO");
		}else if(kgRopa >= 22 && kgRopa < 30) {
			System.out.println("MAXIMO");
		}else if(kgRopa >= 15 && kgRopa < 22) {
			System.out.println("ALTO");
		}else if(kgRopa >= 8 && kgRopa < 15) {
			System.out.println("MEDIO");
		}else {
			System.out.println("MINIMO");
		}
	}
}
