package pruebas.evaluacion1.prueba2.ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {
	
	public static final int TOT_CORREDORES=10;
	public static Scanner entrada= new Scanner(System.in);

	public static void main(String[] args) {
		int [] corredores= new int [TOT_CORREDORES];
		introducirDorsales(corredores);
		mostrarCorredores(corredores);
		cambiarMenor(corredores, 10);
		cambiarDopaje(corredores, 11);
		cambiarMoroso(corredores, 9);
		mostrarCorredores(corredores);
	}
	
	private static void introducirDorsales(int [] corredores) {
		int dorsal=0;
		int pos=0;
		boolean fin=false;
		while(!fin && pos < corredores.length) {
			System.out.print("Introduce dorsal: ");
			dorsal=entrada.nextInt();
			if(dorsal!=-1) {
				corredores[pos]=dorsal;
				pos++;
			}else {
				fin=true;
			}
		}
	}
	
	private static void mostrarCorredores(int [] corredores) {
		System.out.println("La lista de corredores es:");
		for (int i=0; i < corredores.length; i++) {
			if(corredores[i]!=0) {
				System.out.println(corredores[i]);
			}
		}
	}
	
	private static void cambiarMenor(int [] corredores, int dorsal) {
		int aux=0;
		for(int i=0; i < corredores.length; i++) {
			if(corredores[i]==dorsal) {
				aux=corredores[i-1];
				corredores[i-1]=dorsal;
				corredores[i]=aux;
			}
		}
	}
	
	private static void cambiarDopaje(int [] corredores, int dorsal) {
		int aux=0;
		for(int i=0; i < corredores.length; i++) {
			if(corredores[i]==dorsal) {
				aux=corredores[i+1];
				corredores[i-1]=aux;
				corredores[i]=0;
			}
		}
	}
	
	private static void cambiarMoroso(int [] corredores, int dorsal) {
		int aux=0;
		for(int i=0; i < corredores.length; i++) {
			if(corredores[i]==dorsal) {
				aux=corredores[i];
				corredores[(corredores.length)-1]=aux;
				corredores[i]=corredores[i+1];
			}
		}
	}

}
