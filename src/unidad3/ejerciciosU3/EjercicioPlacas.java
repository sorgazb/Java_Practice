package unidad3.ejerciciosU3;
import java.util.Scanner;

public class EjercicioPlacas {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int opcion;
		double cantidadEnergia=0;
		int id=0;
		String ubicacion=" ";
		/*
		 * Yo uso un String para poner º ' ", pero otra forma
		 * mas obtima sería:
		 * Para las coordenadas:
		 * long coordenadaX;
		 * long coordenadaY;
		 */
		boolean estado=true;
		boolean fin=false;
		boolean existe=false;
		do {
			System.out.println("------------ MENU ------------");
			System.out.println("1.Registrar nuevo panel.");
			System.out.println("2.Consultar panel.");
			System.out.println("3.Cambiar estado panel.");
			System.out.println("4.Calcular generación energia.");
			System.out.println("5.Salir del programa.");
			System.out.print("Opcion:");
			opcion=entrada.nextInt();
			System.out.println("------------------------------");
			
			//Otra opción más optima seria crear un switch en vez de los if else.
			if(opcion==1) {
				if(existe==false) {
					System.out.println("Usted ha elegido la opcion->1");
					System.out.println("Nueva Placa solar.");
					System.out.print("Introduce el identificador del panel(solo caracteres numericos): ");
					id=entrada.nextInt();
					System.out.print("Introduce la potencia que genera al día: ");
					cantidadEnergia=entrada.nextDouble();
					System.out.print("Introduce la ubicación en coordenadas del panel: ");
					ubicacion=entrada.next();
					if(estado==true) {
						System.out.println("Estado panel: Activo. ");
					}
					else {
						System.out.println("Estado panel: Desactivado.");
					}
					existe=true;
				}else {
					System.out.println("Ya existe una placa.");
				}
			}else if(opcion==2) {
				System.out.println("Usted ha elegido la opcion->2");
				System.out.println("Consultar panel.");
				int numero;
				System.out.print("Introduce el identificador del panel:");
				numero=entrada.nextInt();
				if(numero==id) {
					System.out.println("ID: "+id);
					System.out.println("Potencia: "+cantidadEnergia);
					System.out.println("Ubicación: "+ubicacion);
					if(estado==true) {//redundancia poner solo el boolean sin operadores. estado(activo) !estado(false).
						System.out.println("Estado: Activo");
					}else {
						System.out.println("Estado: Desactivado");
					}
				}else {
					if(existe==false) {
						System.out.println("No existe ningun panel. Registre uno nuevo.");
					}
					else {
						System.out.println("Identificador erroneo.");
					}
				}
			}else if(opcion==3) {
				System.out.println("Usted ha elegido la opcion->3");
				System.out.println("Cambiar estado panel.");
				if(existe==true) {
					int numero2;
					System.out.print("Introduce el identificador del panel:");
					numero2=entrada.nextInt();
					if(numero2==id) {
						if(estado==true) {
							estado=false;
							System.out.println("El estado del panel "+id+" es DESACTIVADO.");
						}else {
							estado=true;
							System.out.println("El estado del panel "+id+" es ACTIVADO.");
						}
					}else {
						System.out.println("Ese ID no existe.");
					}
				}else {
					System.out.println("No existe ningún panel");
				}
			}else if(opcion==4) {
				System.out.println("Usted ha elegido la opcion->4");
				System.out.println("Carcular generación de potencia.");
				int numero3;
				if(existe==true) {
					System.out.print("Introduce el identificador del panel:");
					numero3=entrada.nextInt();
					if(numero3==id) {
						System.out.print("Introduce la candiad de días que quiere ver la cantidad que genera:");
						int dias;
						dias=entrada.nextInt();
						System.out.println("La cantidad de energía generada en "+dias+" es: "+(cantidadEnergia*dias));
					}
					else {
						System.out.println("Ese ID no existe.");
					}
				}
				else {
					System.out.println("No existe ningún panel");
				}

				
			}else if(opcion==5) {
				System.out.println("Usted ha elegido la opcion->5");
				System.out.println("Gracias por usar el programa.FIN");
				fin=true;
				entrada.close();
			}else {
				System.out.println("Es opción no es valida. Introduce otra.");
			}
			
		}while (fin!=true);// Otra condición de salida sería opcion!=5


	}

}
