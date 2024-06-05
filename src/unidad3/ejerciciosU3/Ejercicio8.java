package unidad3.ejerciciosU3;
import java.util.Scanner;

public class Ejercicio8 {
	
	public boolean esCapicua() {
		int numeroCapi;
		boolean esCapicua=false;
		Scanner entrada= new Scanner (System.in);
		System.out.println("Introduce un numero:");
		numeroCapi=entrada.nextInt();
		return esCapicua;
	}
	
	public static void ponerNumReves(int num) {
		int u=0;
		int d=0;
		int c=0;
		int m=0;
		int um=0;
		u=num%10;
		num=num-u;
		num=num/10;
		int cont=1;
		int numAux;
		int suma=0;
		while(num!=0) {
			numAux=num%10;
			num=num-numAux;
			num=num/10;
			cont++;
			if(cont==2) {
				d=numAux;
			}
			if(cont==3) {
				c=numAux;
			}
			if(cont==4) {
				m=numAux;
			}
			if(cont==5) {
				um=numAux;
			}
		}
		if(cont==5) {
			suma=suma+(u*10000);
			suma=suma+(d*1000);
			suma=suma+(c*100);
			suma=suma+(m*10);
			suma=suma+um;
		}
		if(cont==4) {
			suma=suma+(u*1000);
			suma=suma+(d*100);
			suma=suma+(c*10);
			suma=suma+m;
		}
		if(cont==3) {
			suma=suma+(u*100);
			suma=suma+(d*10);
			suma=suma+c;
		}
		if(cont==2) {
			suma=suma+(u*10);
			suma=suma+d;
		}
		if(cont==1) {
			suma=suma+u;
		}
		System.out.println(suma);
	}

	public static void main(String[] args) {
	}

}
