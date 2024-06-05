package unidad3.ejerciciosU3;
import java.util.Scanner;

/*
 * Crea un programa llamado ComprobarFecha, que pida una fecha formada por tres valores numéricos
 * (día, mes y año), y determine si la fecha corresponde a un valor válido.
 * Pista: se debe tener presente el valor de los días en función de los meses y de los años. Es decir:
 * -Los meses 1,3,5,7,8,10 y 12 tienen 31 días.
 * -Los meses 4,6,9 y 11 tienen 30 días.
 * -El mes 2 tiene 28 días, excepto cuando el año es divisible por 4, que tiene 29 días.
 */

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int dia;
		int mes;
		int anio;
		System.out.print("Introduce un día:");
		dia= entrada.nextInt();
		System.out.print("Introduce un mes:");
		mes=entrada.nextInt();
		System.out.print("Introduce un año:");
		anio=entrada.nextInt();
		
		if(dia<=31 && dia >= 1) {
			if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
				System.out.println("Fecha valida: "+dia+"/"+mes+"/"+anio);

			}else if((mes==4 || mes==6 || mes==9 || mes==11) && dia <=30) {
				System.out.println("Fecha valida: "+dia+"/"+mes+"/"+anio);
			}else if(mes==2) {
				if(anio%4==0) {
					if(dia <=29) {
						System.out.println("Fecha valida: "+dia+"/"+mes+"/"+anio);
					}
					else {
						System.out.println("Fecha no valida");
					}
				}
				else {
					if(dia <= 28) {
						System.out.println("Fecha valida: "+dia+"/"+mes+"/"+anio);
					}
					else {
						System.out.println("Fecha no valida");
					}
				}
			}
			else {
				System.out.println("Fecha no valida");
			}
		}
		else {
			System.out.println("Fecha no valida");
		}
			
	}

}
