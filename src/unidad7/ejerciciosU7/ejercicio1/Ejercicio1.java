package unidad7.ejerciciosU7.ejercicio1;

/*
 * Escriba un programa Java generar un número aleatorio entre 1 y 10.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 10 + 1);
		System.out.println(num);
	}
}
