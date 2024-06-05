package unidad3.ejerciciosU3;
import java.util.Scanner;

public class EjercicioReservaVehiculo {

	public static void main(String[] args) {
		
		//Constantes:
		final double BICI_NO_BONO=4.00;
		final double PATINETE_NO_BONO=3.00;
		final double MOTO_NO_BONO=9.00;
		final double BICI_BONO=2.00;
		final double PATINETE_BONO=1.50;
		final double MOTO_BONO=5.00;
		
		//Variebles:
		Scanner entrada=new Scanner(System.in);
		int opcion;
		int horasAlquiler=0;
		char bono=' ';
		char confirmacion;
		double precioNoBono=0;
		double precioBono=0;
		boolean confirReserva=false;
		
		do {
			System.out.println("---- MENU VEHICULOS ----");
			System.out.println("1_.Reservar Bicicleta.");
			System.out.println("2_.Reservar Patinete.");
			System.out.println("3_.Reservar Moto.");
			System.out.println("4_.SALIR.");
			System.out.println("-------------------------");
			System.out.print("Opcion:");
			opcion=entrada.nextInt();
			
			switch(opcion) {
			
			case 1:
				System.out.println("-Usted ha seleccionado una Bicicleta.");
				
				//Preguntamos por el numero de horas, si el numero de horas es menor de 1 nos devuelve al 
				//menú inicial.
				System.out.print("¿Cuántas horas desea alquilar la Bicicleta?:");
				horasAlquiler=entrada.nextInt();
				if(horasAlquiler > 0) {
					
					//Preguntamos mediante un carater si el usuario dispone de bono, si el caracter introducido no es 
					//ni S,s,N o n, nos saldrá un mensaje de error y nos devolverá al menú inicial.
					System.out.println("¿Dispone usted de Bono Transporte?.(S/n)");
					bono=entrada.next().charAt(0);
					if(bono=='S' || bono=='s') {
						System.out.println("Usted tiene bono. Por lo tanto tiene un DESCUENTO.");
						precioBono=horasAlquiler*BICI_BONO;
						System.out.println("-El precio final es: "+precioBono+"€");
						
						//Preguntamos si el usuario quiere confirmar la reserva, si el caracter no es valido o es N,n nos
						//sale un mensaje de cancelación de la reserva nos devuelve al menú inical.
						System.out.println("¿Desea confirmar la reserva?:(S/N)");
						confirmacion=entrada.next().charAt(0);
						if(confirmacion=='S' || confirmacion=='s') {
							System.out.println("Reserva confirmada.");
							confirReserva=true;
						}else if(confirmacion=='N' || confirmacion=='n') {
							System.out.println("Reserva cancelada.");
							confirReserva=false;
						}else {
							System.out.println("Reserva cancelada.");
							confirReserva=false;
						}
						
					}else if(bono=='N' || bono=='n') {
						System.out.println("Usted no tiene bono.");
						precioNoBono=horasAlquiler*BICI_NO_BONO;
						System.out.println("-El precio final es: "+precioNoBono+"€");
						System.out.println("¿Desea confirmar la reserva?:(S/N)");
						confirmacion=entrada.next().charAt(0);
						if(confirmacion=='S' || confirmacion=='s') {
							System.out.println("Reserva confirmada.");
							confirReserva=true;
						}else if(confirmacion=='N' || confirmacion=='n') {
							System.out.println("Reserva cancelada.");
							confirReserva=false;
						}else {
							System.out.println("Reserva cancelada.");
							confirReserva=false;
						}
					}else {
						System.out.println("Caracter no válido");
					}
				}else {
					System.out.println("Error. El número de horas no es válido.");
				}
				break;
				
			case 2:
				System.out.println("-Usted ha seleccionado un Patinete.");
				System.out.print("¿Cuántas horas desea alquilar el Patinete?:");
				horasAlquiler=entrada.nextInt();
				if(horasAlquiler > 0) {
					System.out.println("¿Dispone usted de Bono Transporte?.(S/N)");
					bono=entrada.next().charAt(0);
					if(bono=='S' || bono=='s') {
						System.out.println("Usted tiene bono. Por lo tanto tiene un DESCUENTO.");
						precioBono=horasAlquiler*PATINETE_BONO;
						System.out.println("-El precio final es: "+precioBono+"€");
						System.out.println("¿Desea confirmar la reserva?:(S/N)");
						confirmacion=entrada.next().charAt(0);
						if(confirmacion=='S' || confirmacion=='s') {
							System.out.println("Reserva confirmada.");
							confirReserva=true;
						}else if(confirmacion=='N' || confirmacion=='n') {
							System.out.println("Reserva cancelada.");
							confirReserva=false;
						}else {
							System.out.println("Reserva cancelada.");
							confirReserva=false;
						}
					}else if(bono=='N' || bono=='n') {
						System.out.println("Usted no tiene bono.");	
						precioNoBono=horasAlquiler*PATINETE_NO_BONO;
						System.out.println("-El precio final es: "+precioNoBono+"€");
						System.out.println("¿Desea confirmar la reserva?:(S/N)");
						confirmacion=entrada.next().charAt(0);
						if(confirmacion=='S' || confirmacion=='s') {
							System.out.println("Reserva confirmada.");
							confirReserva=true;
						}else if(confirmacion=='N' || confirmacion=='n') {
							System.out.println("Reserva cancelada.");
							confirReserva=false;
						}else {
							System.out.println("Reserva cancelada.");
							confirReserva=false;
						}
					}else {
						System.out.println("Caracter no válido");
					}
				}else {
					System.out.println("Error. El número de horas no es válido.");
				}
				break;
				
			case 3:
				System.out.println("-Usted ha seleccionado una Moto.");
				System.out.print("¿Cuántas horas desea alquilar la Moto?:");
				horasAlquiler=entrada.nextInt();
				if(horasAlquiler > 0) {
					System.out.println("¿Dispone usted de Bono Transporte?.(S/N)");
					bono=entrada.next().charAt(0);
					if(bono=='S' || bono=='s') {
						System.out.println("Usted tiene bono. Por lo tanto tiene un DESCUENTO.");
						precioBono=horasAlquiler*MOTO_BONO;
						System.out.println("-El precio final es: "+precioBono+"€");
						System.out.println("¿Desea confirmar la reserva?:(S/N)");
						confirmacion=entrada.next().charAt(0);
						if(confirmacion=='S' || confirmacion=='s') {
							System.out.println("Reserva confirmada.");
							confirReserva=true;
						}else if(confirmacion=='N' || confirmacion=='n') {
							System.out.println("Reserva cancelada.");
							confirReserva=false;
						}else {
							System.out.println("Reserva cancelada.");
							confirReserva=false;
						}
					}else if(bono=='N' || bono=='n') {
						System.out.println("Usted no tiene bono.");	
						precioNoBono=horasAlquiler*MOTO_NO_BONO;
						System.out.println("-El precio final es: "+precioNoBono+"€");
						System.out.println("¿Desea confirmar la reserva?:(S/N)");
						confirmacion=entrada.next().charAt(0);
						if(confirmacion=='S' || confirmacion=='s') {
							System.out.println("Reserva confirmada.");
							confirReserva=true;
						}else if(confirmacion=='N' || confirmacion=='n') {
							System.out.println("Reserva cancelada.");
							confirReserva=false;
						}else {
							System.out.println("Reserva cancelada.");
							confirReserva=false;
						}
					}else {
						System.out.println("Caracter no válido");
					}
				}else {
					System.out.println("Error. El número de horas no es válido.");
				}
				break;
				
			case 4:
				System.out.println("-SALIENDO...");
				break;
				
			default:
				System.out.println("-Opción no valida, porfavor elija otra.");
				break;
			}
			
			
		}while(opcion!=4);
		
		if(confirReserva) {
			System.out.println("---- TICKET ----");
			if(bono=='S' || bono=='s') {
				System.out.println("Precio Total: "+precioBono+"€");
			}else if(bono=='N' || bono=='n') {
				System.out.println("Precio Total: "+precioNoBono+"€");
			}
		}
		entrada.close();
	}
	
}
