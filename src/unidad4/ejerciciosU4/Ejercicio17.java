package unidad4.ejerciciosU4;
import java.util.Scanner;

/*
 * El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: 
 * Se divide el número de DNI entre 23 y el resto es codificado por una letra según la siguiente equivalencia: 
 * 0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12: "N", 13: "J", 
 * 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E". 
 * Escribe un programa que pida el DNI y muestre por pantalla la letra asociada. Para ello se deberá crear una 
 * función a la que se le pase el número y devuelva la letra. 
 * Ejemplo: para el DNI 56321122 el NIF es ‘X’. 
 */

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el DNI:");
		int numero=entrada.nextInt();
		if(numero>99999999 || numero < 10000000) {
			System.out.println("Error");
		}
		else {
			int letra=obtenerResto(numero);
			System.out.println(numero+"-"+devolverLetra(letra));
		}
		
		entrada.close();
	}
	
	public static int obtenerResto(int num) {
		return num%23;
	}
	
	public static char devolverLetra(int num) {
		char letra=' ';
		if(num==0) {
			letra='T';
		}else if(num==1) {
			letra='R';
		}else if(num==2) {
			letra='W';
		}else if(num==3) {
			letra='A';
		}else if(num==4) {
			letra='G';
		}else if(num==5) {
			letra='M';
		}else if(num==6) {
			letra='Y';
		}else if(num==7) {
			letra='F';
		}else if(num==8) {
			letra='P';
		}else if(num==9) {
			letra='D';
		}else if(num==10) {
			letra='X';
		}else if(num==11) {
			letra='B';
		}else if(num==12) {
			letra='N';
		}else if(num==13) {
			letra='J';
		}else if(num==14) {
			letra='Z';
		}else if(num==15) {
			letra='S';
		}else if(num==16) {
			letra='Q';
		}else if(num==17) {
			letra='V';
		}else if(num==18) {
			letra='H';
		}else if(num==19) {
			letra='L';
		}else if(num==20) {
			letra='C';
		}else if(num==21) {
			letra='K';
		}else if(num==22) {
			letra='E';
		}
		return letra;
	}

}
