package unidad4.ejerciciosU4;
/*
 * Encontrar el error en los siguientes códigos:
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
    /*	
	 * A)//Este método tiene un error!
	 * public static void saludar(){
	 *      System.out.println("Hola");
	 * }
	 */
	//El error es que hay un ; en el método.
	public static void saludar(){
		System.out.println("Hola");
	}
	
	/*
	 * B)Un método presenta la siguiente cabecera
	 * public static void mostrarValor(int x)
	 * El siguiente código hace una llamada al método
	 * int x=8;
	 * mostrarValor(int x);
	 */
	//El error es que hemos declarado una nueva variable en la llamada al método.
	/*
	 * int x=8;
	 * mostrarValor(x);
	 */
	
	/*
	 * C) public static double multiplicarPorDos(double num){
	 *           double result=num*2;
	 *    }
	 */
	//El error es que no tiene return el método.
	public static double multiplicarPorDos(double num) {
		double result=num*2;
		return result;
	}
	
	/*
	 * D) public static int obtenerMitad(double num){
	 *        double result=num/2.0;
	 *        return result;
	 *    }
	 */
	//El error es que hemos declarado un metodo int y nos interesa un double.
	public static double obtenerMitad(double num) {
		double result=num/2.0;
		return result;
	}
}
