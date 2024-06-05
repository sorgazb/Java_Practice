package unidad2.ejerciciosU2;

public class Ejercicio9{
	/*
	 * 9_.Los siguientes programas contienen uno o varios 
	 * errores que hacen que no compilen. Modifícalos hasta que 
	 * funcionen correctamente.
	 */
	
	/*
	 * a) class Suma{
	 *      static int n1=50;
	 *      
	 *      public static void main(String[] args){
	 *          int n2=30, suma=0, n3;
	 *          suma= n1 + n2;
	 *          System.out.println("La suma es: " + suma);
	 *          suma=suma + n3;
	 *          System.out.println(suma);
	 *      }
	 *    } 
	 */
	static int n1=50;
	public static void apartadoA() {
		 int n2=30, suma=0, n3;
		 n3=0;
		 suma= n1 + n2;
		 System.out.println("La suma es: " + suma);
		 suma=suma + n3;
		 System.out.println(suma);
	}
	
	/*
	 * b) class Suma{
	 *      public static void main(String[] args){
	 *          int n1=5, n2=6;
	 *          boolean suma=0;
	 *          suma=n1 + n2;
	 *          System.out.println(La suma es = suma);
	 *      }
	 *    } 
	 */
	public static void apartadoB() {
		int n1=5, n2=6;
		int suma=0;
		suma=n1 + n2;
		System.out.println("La suma es =" + suma);
	}
	
	/*
	 * c) class Cuadrado{
	 *      public static void main(String[] args){
	 *          int n=8;
	 *          cuad=n*n;
	 *          System.out.println("El cuadrado de"+N+"es:"+cuad);
	 *      }
	 *    }
	 */
	public static void apartadoC() {
		int n=8;
		int cuad=n*n;
		System.out.println("El cuadrado de " + n + " es: " + cuad);
	}
	
	public static void main(String[] args) {
		System.out.println("Solución apartado A:");
		apartadoA();
		System.out.println("Solución apartado B:");
		apartadoB();
		System.out.println("Solución apartado C:");
		apartadoC();
	}

}
