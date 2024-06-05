package unidad3.ejerciciosU3;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		boolean afiliado=false;
		int numero;
		Scanner entrada= new Scanner(System.in);
		System.out.println("¿El cliente es afiliado?:");
		System.out.println("1-> Es afiliado.");
		System.out.println("2->No es afiliado.");
		System.out.print("Opcion:");
		numero=entrada.nextInt();
		System.out.println("--------------------------");
		if(numero==1) {
			afiliado=true;
		}else if(numero==2) {
			afiliado=false;
		}
		else {
			
			System.out.println("Esta opción no existe.");
		}
		
		if(numero==1 || numero==2) {
			double tipo1=25.00;
			double tipo2=36.00;
			double tipo3=50.00;
			int opcionAnalisis;
			
			System.out.println("¿Que tipo de analisis quiere?: ");
			System.out.println("1->Analisis 1= 25.00 (no afiliados).");
			System.out.println("2->Analisis 2= 36.00 (no afiliados).");
			System.out.println("3->Analisis 3= 50.00 (no afiliados).");
			System.out.print("Opcion:");
			opcionAnalisis=entrada.nextInt();
			System.out.println("--------------------------------------");
			
			if(opcionAnalisis==1) {
				if(afiliado==true) {
					tipo1=(tipo1*0.92);
					System.out.println("Usted ha seleccionado el Analisis de Tipo 1, usted tiene"+
					" un descuento del 8%; el precio final es: "+tipo1);
				}
				else {
					System.out.println("Usted ha seleccionadp el Analisis de Tipo 1, el precio es de: "+tipo1);
				}
			}else if(opcionAnalisis==2) {
				if(afiliado==true) {
					tipo2=(tipo2*0.92);
					System.out.println("Usted ha seleccionado el Analisis de Tipo 2, usted tiene"+
							" un descuento del 8%; el precio final es: "+tipo2);
				}
				else {
					System.out.println("Usted ha seleccionado el Analisis de Tipo 2,el precio es de: "+tipo2);
				}	
			}else if(opcionAnalisis==3){
				if(afiliado==true) {
					tipo3=tipo3*0.92;
					System.out.println("Usted ha selccionado el Analisis de Tipo 3, usted tiene"+
					"un descuento del 8% al ser afiliado, el precio final es de:"+tipo3);
					}
				else {
					System.out.println("Usted ha seleccionado el Analisis de Tipo 3, el precio es de:"+tipo3);
				}
			}else {
				System.out.println("Esa opción no existe.");
			}
		}
		
		
		
	}

}
