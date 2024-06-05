package unidad6.teoriaU6;
import java.util.Scanner;

public class DemoExpresionesRegulares {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		//.= cualquier caracter
		/*
		 * En este caso de ejemplo la condición de la entrada
		 * es que le lleguen 3 caracteres, en los cuales
		 * el primero debe ser una "a" y el ultimo una "b"; 
		 * el del medio puede ser cual caracter.
		 */
		System.out.println("Dame el dato:");
		String dato=entrada.next();
		String expresionRegular="a.b";
		boolean resultado=dato.matches(expresionRegular);
		if(resultado) {
			System.out.println("Dato válido");
		}else {
			System.out.println("Dato NO válido");
		}
		
		
		//*= coincide con 0 o más repeticiones
		/*
		 * Con el * lo que haya a su izquierda
		 * se puede repetir de 0 a n veces, en el ejemplo la condición
		 * será una cadena que empiece por "a" y termine con "b"; .* significa
		 * que podemos poner cualquier caracter de 0 a n veces.
		 */
		System.out.println("Dame el dato:");
		String dato2=entrada.next();
		String expresionRegular2="a.*b";
		boolean resultado2=dato2.matches(expresionRegular2);
		if(resultado2) {
			System.out.println("Dato válido");
		}else {
			System.out.println("Dato NO válido");
		}
		
		//+= coincide con 1 o más repeticiones
		/*
		 * Con el + lo que haya a su izquierda
		 * se puede repetir de 1 a n veces, en el ejemplo la condición
		 * será una cadena que empiece por una letra mayuscula; .+ significa
		 * que podemos poner cualquier caracter de 1 a n veces.
		 */
		System.out.println("Dame el dato:");
		String dato3=entrada.next();
		String expresionRegular3="[A-Z].+";
		boolean resultado3=dato3.matches(expresionRegular3);
		if(resultado3) {
			System.out.println("Dato válido");
		}else {
			System.out.println("Dato NO válido");
		}
		
		/*
		 * \\s=para poner espacios
		 * \\d
		 * {n}=el numero de veces
		 * {n,m}= de n a m veces
		 * {n,}= al menos n veces lo que haya a la izquierda
		 */
		System.out.println("Dame el dato:");
		String dato4=entrada.nextLine();//NOTA: si vamos a introducir cadenas con espacios trabajamos en el Scanner con nextLine
		String expresionRegular4="\\d{3,5}\\s[A-Z]+";//un num de 3 a 5 cifras, un espacio y acaba con una letra mayuscula como min
		boolean resultado4=dato4.matches(expresionRegular4);
		if(resultado4) {
			System.out.println("Dato válido");
		}else {
			System.out.println("Dato NO válido");
		}
		
		
		
		
		
		
		entrada.close();
	}
}
