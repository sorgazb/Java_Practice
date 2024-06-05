package unidad4.ejerciciosU4;
import java.util.Scanner;

public class EjercicioBocadillos2 {
	
	public static Scanner entrada= new Scanner(System.in);
	public static final double BOCADILLO_JAMON=3.50;
	public static final double BOCADILLO_QUESO=3.00;
	public static final double BOCADILLO_MIXTO=4.00;
	public static final double BOCADILLO_VEGETAL=3.50;

	public static void main(String[] args) {
		char opcion;
		double cuenta=0;
		int cantidadJamon=0;
		int cantidadQueso=0;
		int cantidadMixto=0;
		int cantidadVegetal=0;
		do {
			mostrarMenu();
			System.out.print("Opcion:");
			opcion=entrada.next().charAt(0);
			switch(opcion) {
			case 'a':
				cantidadJamon=pedirJamon();
				cuenta=cuenta+(BOCADILLO_JAMON*cantidadJamon);
				break;
			case 'b':
				cantidadQueso=pedirQueso();
				cuenta=cuenta+(BOCADILLO_QUESO*cantidadQueso);
				break;
			case 'c':
				cantidadMixto=pedirMixto();
				cuenta=cuenta+(BOCADILLO_MIXTO*cantidadMixto);
				break;
			case 'd':
				cantidadVegetal=pedirVegetal();
				cuenta=cuenta+(BOCADILLO_VEGETAL*cantidadVegetal);
				break;
			case 'e':
				cuentaTotal(cantidadJamon, cantidadQueso, cantidadMixto, cantidadVegetal, cuenta);
				break;
			default:
				System.out.println("Ese bocadillo no existe porfavor elige otro...");
				break;
			}	
		}while(opcion!='e');
		System.out.println("Gracias por su visita.");
		entrada.close();
	}
	
	public static void mostrarMenu() {
		System.out.println("---- MENÚ BOCADILLOS ----");
		System.out.println("a. Bocadillos de jamón - 3.50€");
		System.out.println("b. Bocadillos de queso - 3.00€");
		System.out.println("c. Bocadillos mixto - 4.00€");
		System.out.println("d. Bocadillos vegetal - 3.50€");
		System.out.println("e. Salir");
	}
	
	public static void cuentaTotal(int a, int b, int c, int d, double e) {
		double precioTotJamon=0;
		double precioTotQueso=0;
		double precioTotMixto=0;
		double precioTotVegetal=0;
		if(e>0) {
			System.out.println("--------- TICKET ---------");
			if(a>0) {
				sumarJamon(a, precioTotJamon);
			}
		    if(b>0) {
			    sumarQueso(b, precioTotQueso);
		    }
		    if(c>0) {
			    sumarMixto(c, precioTotMixto);
		    }if(d>0) {
			    sumarVegetal(d, precioTotVegetal);
		    }
			System.out.println("- Precio Total:"+e+"€");
		}
	}
	
	public static void sumarJamon(int a, double j) {
		j=a*BOCADILLO_JAMON;
		System.out.println("- Bocadillo de jamón: ->Cantidad:"+a+" ->Precio:"+(j)+"€");
	}
	
	public static void sumarQueso(int b, double q) {
		q=b*BOCADILLO_QUESO;
		System.out.println("- Bocadillo de queso: ->Cantidad:"+b+" ->Precio:"+(q)+"€");
	}
	
	public static void sumarMixto(int c, double m) {
		m=c*BOCADILLO_MIXTO;
		System.out.println("- Bocadillo de mixto: ->Cantidad:"+c+" ->Precio:"+(m)+"€");
	}
	
	public static void sumarVegetal(int d, double v) {
		v=d*BOCADILLO_VEGETAL;
		System.out.println("- Bocadillo de vegetal: ->Cantidad:"+d+" ->Precio:"+(v)+"€");
	}
	
	public static int pedirJamon() {
		int cantidadJamon;
		System.out.println("¿Cuántos Bocadillos de Jamón quiere?");
		cantidadJamon=entrada.nextInt();
		return cantidadJamon;
	}
	
	public static int pedirQueso() {
		int cantidadQueso;
		System.out.println("¿Cuántos Bocadillos de Queso quiere?");
		cantidadQueso=entrada.nextInt();
		return cantidadQueso;
	}
	
	public static int pedirMixto() {
		int cantidadMixto;
		System.out.println("¿Cuántos Bocadillos Mixtos quiere?");
		cantidadMixto=entrada.nextInt();
		return cantidadMixto;
	}
	
	public static int pedirVegetal() {
		int cantidadVegetal;
		System.out.println("¿Cuántos Bocadillos Vegetales quiere?");
		cantidadVegetal=entrada.nextInt();
		return cantidadVegetal;
	}
}
