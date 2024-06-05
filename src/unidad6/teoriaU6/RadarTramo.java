package unidad6.teoriaU6;

import java.util.Scanner;

public class RadarTramo {
	
	public static Scanner entrada= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Distancia:");
		double distancia=entrada.nextDouble();//metros
		System.out.println("Velocidad Maxima Permitida:");
		double vmp=entrada.nextDouble();//velocidad maxima permitida km/h
		System.out.println("Tiempo:");
		double tiempo=entrada.nextDouble();//s
		double vm=0;
		boolean haSuperado=false;
		double porcentajeSuperado;
		
		if(distancia <= 0 || vmp <= 0 || tiempo <= 0) {
			System.err.println("ERROR");
		}else {
			vmp=vmp/3.6;//ms
			//Calcular la v media
			vm=distancia/tiempo;
			haSuperado=vm>vmp;
			porcentajeSuperado=((vm-vmp)/vmp)*100; //de aqui se obtiene el porcentaje de superación de la velocidad
			
			if(!haSuperado) {
				System.out.println("Ok");
			}else if(porcentajeSuperado<20) {
				System.out.println("Multa");
			}else {
				System.out.println("Puntos");
			}
			
		}

	}

}
