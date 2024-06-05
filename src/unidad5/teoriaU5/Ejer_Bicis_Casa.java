package unidad5.teoriaU5;
import java.util.Scanner;

/*
 * Servicio de Bicicleta Eléctricas
 */

public class Ejer_Bicis_Casa {
	
	public static final int TAM_ESTACION=6;
	
	public static Scanner entrada= new Scanner (System.in);

	public static void main(String[] args) {
		int [] estacion1= new int [TAM_ESTACION];
		int [] estacion2= new int [TAM_ESTACION];
		int [] estacion3= new int [TAM_ESTACION];
		int [] bicicletasReservadas= new int [TAM_ESTACION];
		
		iniciarEstaciones(estacion1, estacion2, estacion3);
		
		funcionalidad(estacion1, estacion2, estacion3, bicicletasReservadas);
	}
	
	private static void menu() {
		System.out.println("---- MENÚ BICICLETAS ELECTRICAS ----");
		System.out.println("1-> Reservar Bicicleta.");
		System.out.println("2-> Depositar Bicicleta.");
		System.out.println("3-> Mostrar Bicicletas Reservadas.");
		System.out.println("4-> Mostrar Estado Estaciones.");
		System.out.println("0-> Salir.");
	}
	
	private static void iniciarEstaciones(int [] estacion1, int [] estacion2, int [] estacion3) {
		//ESTACION 1:
		estacion1[0]=10;
		estacion1[1]=20;
		estacion1[2]=30;
		estacion1[3]=40;
		
		//ESTACION 2:
		estacion2[0]=50;
		estacion2[1]=60;
		estacion2[2]=70;
		estacion2[3]=80;
		
		//ESTACION 3:
		estacion3[0]=90;
		estacion3[1]=100;
		estacion3[2]=110;
		estacion3[3]=120;
	}
	
	private static void mostrarEstacion(int [] estacion) {
		for(int elemento:estacion) {
			if(elemento!=0) {
				System.out.println("Bici ID:"+elemento);
			}
		}
	}
	
	private static void mostrarEstadoEstaciones(int [] estacion1, int [] estacion2, int [] estacion3) {
		System.out.println("----ESTACION 1----");
		mostrarEstacion(estacion1);
		System.out.println("");
		System.out.println("----ESTACION 2----");
		mostrarEstacion(estacion2);
		System.out.println("");
		System.out.println("----ESTACION 3----");
		mostrarEstacion(estacion3);
	}
	
	private static void funcionalidad(int [] estacion1, int [] estacion2, int [] estacion3, int [] bicicletasReservadas) {
		int opcion;
		do {
			menu();
			System.out.print("-Opción:");
			opcion=entrada.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("OPCION 1 -> Reservar Bicicleta.");
				reservarBicicleta(estacion1, estacion2, estacion3, bicicletasReservadas);
				break;
			case 2:
				System.out.println("OPCION 2 -> Depositar Bicicleta.");
				depositarBicicleta(estacion1, estacion2, estacion3, bicicletasReservadas);
				break;
			case 3:
				System.out.println("OPCION 3 -> Mostrar Bicicletas Reservadas.");
				System.out.println("---- BICICLETAS RESERVADAS ----");
				mostrarEstacion(bicicletasReservadas);
				break;
			case 4:
				System.out.println("OPCION 4 -> Mostrar Estado Estaciones.");
				mostrarEstadoEstaciones(estacion1, estacion2, estacion3);
				break;
			case 0:
				System.out.println("SALIENDO ...");
				break;
			default:
				System.out.println("Opción no valida, porfavor introduce otra.");
				break;
			}
		}while(opcion!=0);
		System.out.println("Ha Salido, hasta la proxima.");
	}
	
	private static void reservarBicicleta(int [] estacion1, int [] estacion2, int [] estacion3, int [] bicicletasReservadas) {
		if(comprobarOcupacion(bicicletasReservadas)==6) {
			System.out.println("Ha reservado el número maximo de Bicicletas. Porfavor deposite alguna.");
		}
		else {
			double horasReserva=pedirHorasReserva();
			boolean bono=pedirBono();
			double precioReserva;
			if(bono==true) {
				precioReserva=horasReserva*2;
			}else {
				precioReserva=horasReserva*4;
			}
			System.out.println("El precio de la reserva serán:" +precioReserva+"€");
			funcionalidadReserva(estacion1, estacion2, estacion3, bicicletasReservadas);
		}
	}
	
	private static void funcionalidadReserva(int [] estacion1, int [] estacion2,  int [] estacion3, int [] bicicletasReservadas) {
		boolean fin=false;
		int ocupacion;
		int idBicicleta=-1;
		while(!fin) {
			int estacion=pedirEstacion();
			if(estacion==1) {
				System.out.println("Ha elegido la ESTACION 1:");
				ocupacion=comprobarOcupacion(estacion1);
				if(ocupacion<1) {
					System.out.println("La Estación 1 está vacia. Porfavor elige otra.");
				}
				else {
					mostrarEstacion(estacion1);
					idBicicleta=pedirBicicleta(estacion1);
					intercambiarBicicleta(idBicicleta, estacion1, bicicletasReservadas);
					fin=true;
				}
				
			}
			else if(estacion==2) {
				System.out.println("Ha elegido la ESTACION 2:");
				ocupacion=comprobarOcupacion(estacion2);
				if(ocupacion<1) {
					System.out.println("La Estación 2 está vacia. Porfavor elige otra.");
				}
				else {
					mostrarEstacion(estacion2);
					idBicicleta=pedirBicicleta(estacion2);
					intercambiarBicicleta(idBicicleta, estacion2, bicicletasReservadas);
					fin=true;
				}
				
			}
			else if(estacion==3) {
				System.out.println("Ha elegido la ESTACION 3:");
				ocupacion=comprobarOcupacion(estacion3);
				if(ocupacion<1) {
					System.out.println("La Estación 3 está vacia. Porfavor elige otra.");
				}
				else {
					mostrarEstacion(estacion3);
					idBicicleta=pedirBicicleta(estacion3);
					intercambiarBicicleta(idBicicleta, estacion3, bicicletasReservadas);
					fin=true;
				}
			}
		}
		if(fin==true) {
			System.out.println("Bicicleta "+ idBicicleta+" reservada.");
		}
	}
	
	
	private static void depositarBicicleta(int [] estacion1, int [] estacion2, int [] estacion3, int [] bicicletasReservadas) {
		if(comprobarOcupacion(bicicletasReservadas)==0) {
			System.out.println("No ha reservado ninguna Bicicleta. Porfavor reserve una antes de depositar.");
		}
		else {
			mostrarEstacion(bicicletasReservadas);
			funcionalidadDeposito(estacion1, estacion2, estacion3, bicicletasReservadas);
		}
	}
	
	private static void funcionalidadDeposito(int [] estacion1, int [] estacion2,  int [] estacion3, int [] bicicletasReservadas) {
		boolean fin=false;
		int ocupacion;
		int idBicicleta=-1;
		while(!fin) {
			idBicicleta=pedirBicicleta(bicicletasReservadas);
			System.out.print("¿En que Estación quieres realizar el Deposito?:");
			int estacion=pedirEstacion();
			if(estacion==1) {
				System.out.println("Ha elegido la ESTACION 1:");
				ocupacion=comprobarOcupacion(estacion1);
				if(ocupacion>=6) {
					System.out.println("La Estación 1 está Llena. Porfavor elige otra.");
				}
				else {
					intercambiarBicicleta(idBicicleta, bicicletasReservadas, estacion1);
					fin=true;
				}
				
			}
			else if(estacion==2) {
				System.out.println("Ha elegido la ESTACION 2:");
				ocupacion=comprobarOcupacion(estacion2);
				if(ocupacion>=6) {
					System.out.println("La Estación 2 está Llena. Porfavor elige otra.");
				}
				else {
					intercambiarBicicleta(idBicicleta, bicicletasReservadas, estacion2);
					fin=true;
				}
				
			}
			else if(estacion==3) {
				System.out.println("Ha elegido la ESTACION 3:");
				ocupacion=comprobarOcupacion(estacion3);
				if(ocupacion>=6) {
					System.out.println("La Estación 3 está Llena. Porfavor elige otra.");
				}
				else {
					intercambiarBicicleta(idBicicleta, bicicletasReservadas, estacion3);
					fin=true;
				}
			}
		}
		if(fin==true) {
			System.out.println("Bicicleta "+ idBicicleta+" depositada.");
		}
	}
	
	private static void intercambiarBicicleta(int idBicicleta, int [] origen, int [] destino) {
		int aux=-1;
		for(int i=0; i <origen.length; i++) {
			if(origen[i]==idBicicleta) {
				aux=idBicicleta;
				origen[i]=0;
			}
		}
		
		if(aux!=0) {
			int j=0;
			boolean fin=false;
			while (j < destino.length && !fin) {
				if(destino[j]==0) {
					destino[j]=aux;
					fin=true;
				}
				j++;
			}
		}
	}
	
	private static int pedirBicicleta(int [] array) {
		int idBicicleta=-1;
		boolean fin=false;
		while(!fin) {
			System.out.print("Introduce el ID de la Bicicleta:");
			idBicicleta=entrada.nextInt();
			for(int elemento:array) {
				if(elemento==idBicicleta) {
					fin=true;
				}
			}
			if(fin!=true) {
				System.out.println("Valor No Valido. Porfavor introduce un dato valido.");
			}
		}
		return idBicicleta;
	}
	
	
	
	private static int pedirEstacion() {
		int estacion=0;
		boolean fin=false;
		while(!fin) {
			System.out.println("Elige una Estacion:");
			System.out.println("1-> Estacion 1.");
			System.out.println("2-> Estacion 2.");
			System.out.println("3-> Estacion 3.");
			System.out.print("-Opción:");
			estacion=entrada.nextInt();
			if(estacion!=1 && estacion!=2 && estacion!=3) {
				System.out.println("Valor No Valido. Porfavor introduce un dato valido.");
			}else {
				fin=true;
			}
		}
		return estacion;
	}
	
	private static int comprobarOcupacion(int [] estacion) {
		int cont=0;
		for(int elemento:estacion) {
			if(elemento!=0) {
				cont++;
			}
		}
		return cont;
	}
	
	private static double pedirHorasReserva() {
		double horas=-1;
		boolean fin=false;
		while(!fin) {
			System.out.print("Introduzca el número de horas que quiere reservar la Bicicleta:");
			horas=entrada.nextDouble();
			if(horas<0) {
				System.out.println("Valor No Valido. Porfavor introduce un dato valido.");
			}
			else {
				fin=true;
			}
		}
		return horas;
	}
	
	private static boolean pedirBono() {
		boolean bono=false;
		int sino=0;
		boolean fin=false;
		while(!fin) {
			System.out.println("¿Dispone de Bono?:");
			System.out.println("1-> SI");
			System.out.println("2-> NO");
			System.out.print("Respuesta:");
			sino=entrada.nextInt();
			if(sino!=1 && sino!=2) {
				System.out.println("Valor No Valido. Porfavor introduce un dato valido.");
			}
			else {
				fin=true;
			}
		}
		if(sino==1) {
			bono=true;
		}
		return bono;
	}
	
	
}
