package unidad4.ejerciciosU4;
import java.util.Scanner;

/*
 * Escriba una función que reciba como parametros de entrada dos instantes de tiempo expresados en 
 * horas, minutos y segundos y devuleva como resultado un 1 o un 2 según el primer instante de tiempo
 * sea anterior al segundo o viceversa.
 */

public class Ejercicio10 {
	
	//Declaramos las variables.
	//Las declaramos en la clase para que puedan ser accedidas por 
	//todos los métodos de esta, lo declamos con una variable de 
	//tipo entero para cada atributo de las dos fechas para poder 
	//hacer una comparación optima.
	public static int hora1;
	public static int hora2;
	public static int minutos1;
	public static int minutos2;
	public static int segundos1;
	public static int segundos2;
	public static Scanner entrada= new Scanner (System.in);

	//Método principal en el cual llamamos a un menú para introducir las fechas
	//y a un método comparador de fechas.
	public static void main(String[] args) {
		menuHoras();
		System.out.println(compararFechasHoras(hora1, hora2));
	}
	
	//Menú horas, en el cual llamamos a dos menús uno para cada fecha.
	public static void menuHoras() {
		System.out.println("Valores primera fecha:");
		menuPrimeraFecha();
		System.out.println("Valores segunda fecha:");
		menuSegundaFecha();
		
	}
	
	//Menú primera fecha, el cual permite al usuario introducir los 
	//valores de la primera fecha.
	public static void menuPrimeraFecha() {
		System.out.print("Introduce las horas:");
		hora1=entrada.nextInt();
		System.out.print("Introduce los minutos:");
		minutos1=entrada.nextInt();
		System.out.print("Introduce los segundos:");
		segundos1=entrada.nextInt();
	}
	
	//Menú segunda fecha, el cual permite al usuario introducir los 
	//valores de la segunda fecha.
	public static void menuSegundaFecha() {
		System.out.print("Introduce las horas:");
		hora2=entrada.nextInt();
		System.out.print("Introduce los minutos:");
		minutos2=entrada.nextInt();
		System.out.print("Introduce los segundos:");
		segundos2=entrada.nextInt();
	}
	
	//Nos permite comparar las horas de las dos fechas
	public static int compararFechasHoras(int hora1, int hora2) {
		int numero=0;
		if(hora1<hora2) {
			numero=1;
		}else if(hora2<hora1) {
			numero=2;
		}else if(hora1==hora2) {//En caso de igualdad comparamos por los minutos.
			numero=compararFechasMinutos(minutos1, minutos2);
		}
		return numero;
	}
	
	//Nos permite comparar los minutos de las dos fechas
	public static int compararFechasMinutos(int min1, int min2) {
		int numero=0;
		if(min1<min2) {
			numero=1;
		}else if(min2<min1) {
			numero=2;
		}else if(min1==min2) {//En caso de igualdad comparamos por los segundos.
			numero=compararFechasSegundos(segundos1, segundos2);
		}
		return numero;
	}
	
	//Nos permite comparar los segundos de las dos fechas
	public static int compararFechasSegundos(int seg1, int seg2) {
		int numero=0;
		if(seg1<seg2) {
			numero=1;
		}else if(seg2<seg1) {
			numero=2;
		}else if(seg1==seg2) {//En caso de igualdad mostramos un 0.
			numero=0;
		}
		return numero;
	}

}
