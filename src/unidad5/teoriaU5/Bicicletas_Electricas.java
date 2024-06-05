package unidad5.teoriaU5;
import java.util.Scanner;

public class Bicicletas_Electricas {
	
	public static Scanner entrada= new Scanner(System.in);
	
	public static final int TAM_ESTACION=6;

	public static void main(String[] args) {
		int [] array_Estacion1= new int [6];
		int [] array_Estacion2= new int [6];
		int [] array_Estacion3= new int [6];
		bicicletasEstacion(array_Estacion1, array_Estacion2, array_Estacion3);
		funcionalidad(array_Estacion1, array_Estacion2, array_Estacion3);
	}
	
	private static void menu() {
		System.out.println("---- MENÚ ----");
		System.out.println("1-> Reservar Bicicleta");
		System.out.println("2-> Ver Estado Estaciones");
		System.out.println("0-> SALIR");
	}
	
	private static void funcionalidad(int [] array_Estacion1, int [] array_Estacion2, int [] array_Estacion3) {
		int opcion;
		do {
			menu();
			System.out.print("-Opción:");
			opcion=entrada.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Ha elegido la opción 1:");
				reservarBicicleta(array_Estacion1, array_Estacion2, array_Estacion3);
				break;
			case 2:
				System.out.println("Ha elegido la opción 2:");
				System.out.println("El estado de las Estaciones es:");
				mostrar_Todas_Estaciones(array_Estacion1, array_Estacion2, array_Estacion3);
				break;
			case 0:
				System.out.println("SALIENDO ...");
				break;
			default:
				System.out.println("Introduce una opción válida.");
				break;
			}
		}while(opcion!=0);
		System.out.println("Gracias por usar el programa.");
	}
	
	private static void bicicletasEstacion(int [] array_Estacion1, int [] array_Estacion2, int [] array_Estacion3) {
		array_Estacion1[0]=10;
		array_Estacion1[1]=20;
		array_Estacion1[2]=30;
		array_Estacion1[3]=40;
		
		array_Estacion2[0]=50;
		array_Estacion2[1]=60;
		array_Estacion2[2]=70;
		array_Estacion2[3]=80;
		
		array_Estacion3[0]=90;
		array_Estacion3[1]=100;
		array_Estacion3[2]=110;
		array_Estacion3[3]=120;
	}
	
	private static int ocupacionEstacion(int [] array_Estacion) {
		int cont=0;
		for(int i=0; i < array_Estacion.length; i++) {
			if(array_Estacion[i]!=0) {
				cont++;
			}
		}
		return cont;
	}

	private static void reservarBicicleta(int [] array_Estacion1, int [] array_Estacion2, int [] array_Estacion3) {
		int id;
		double precio;
		int estacion=elegirEstacion(array_Estacion1, array_Estacion2, array_Estacion3);
		int destino=elegirEstacionDestino(array_Estacion1, array_Estacion2, array_Estacion3);
		if(estacion==1) {
			id=elegirBicicleta(array_Estacion1);
			if(tieneBono()==true) {
				System.out.println("El precio es: "+(2*numeroHoras()));
			}else {
				System.out.println("El precio es: "+(4*numeroHoras()));
			}
			if(destino==1) {
				intercambiarBici(array_Estacion1, array_Estacion1, id);
			}
			if(destino==2) {
				intercambiarBici(array_Estacion1, array_Estacion2, id);
			}
			if(destino==3) {
				intercambiarBici(array_Estacion1, array_Estacion3, id);
			}
		}
		else {
			if(estacion==2) {
				id=elegirBicicleta(array_Estacion2);
				if(tieneBono()==true) {
					System.out.println("El precio es: "+(2*numeroHoras()));
				}else {
					System.out.println("El precio es: "+(4*numeroHoras()));
				}
				if(destino==1) {
					intercambiarBici(array_Estacion2, array_Estacion1, id);
				}
				if(destino==2) {
					intercambiarBici(array_Estacion2, array_Estacion2, id);
				}
				if(destino==3) {
					intercambiarBici(array_Estacion2, array_Estacion3, id);
				}
			}
			else {
				if(estacion==3) {
				    id=elegirBicicleta(array_Estacion3);
					if(tieneBono()==true) {
						System.out.println("El precio es: "+(2*numeroHoras()));
					}else {
						System.out.println("El precio es: "+(4*numeroHoras()));
					}
					if(destino==1) {
						intercambiarBici(array_Estacion3, array_Estacion1, id);
					}
					if(destino==2) {
						intercambiarBici(array_Estacion3, array_Estacion2, id);
					}
					if(destino==3) {
						intercambiarBici(array_Estacion3, array_Estacion3, id);
					}
				}
			}
		}
	}
	
	private static double numeroHoras() {
		System.out.println("Introduce el numero de horas:");
		double horas=entrada.nextDouble();
		return horas;
		
		
		
		
		
	}
	
	private static boolean tieneBono() {
		boolean bono=false;
		System.out.println("Tiene Bono:");
		System.out.println("1-> SI   2-> NO");
		int bonoNum=entrada.nextInt();
		if(bonoNum==1) {
			bono=true;
		}
		return bono;
	}
	
	private static void intercambiarBici(int [] estacionOrigen, int [] estacionDestino, int id) {
		for(int i=0; i < estacionOrigen.length; i++) {
			if(estacionOrigen[i]==id) {
				estacionOrigen[i]=0;		
				int j=0;
				boolean fin=false;
				while(!fin){
					if(estacionDestino[j]==0) {
						estacionDestino[j]=id;
						fin=true;
					}
					j++;
				}
				
			}
		}

	}
	
	
	private static int elegirEstacion(int [] array_Estacion1, int [] array_Estacion2, int [] array_Estacion3) {
		int estacion;
		boolean fin=false;
		do {
			System.out.println("¿En qué estación desea realizar la Reserva?(1-2-3):");
			System.out.println("1->Estacion 1.");
			System.out.println("2->Estacion 2.");
			System.out.println("3->Estacion 3.");
			System.out.print("Introduce estacion:");
			estacion=entrada.nextInt();
			switch (estacion) {
			case 1: 
				System.out.println("Ha elegido la ESTACION 1");
				if(ocupacionEstacion(array_Estacion1)==0) {
					System.out.println("Estacion Vacia");
				}
				else {
					estacion=1;
					fin=true;
				}
				break;
			case 2:
				System.out.println("Ha elegido la ESTACION 2");
				if(ocupacionEstacion(array_Estacion2)==0) {
					System.out.println("Estacion Vacia");
				}
				else {
					estacion=2;
					fin=true;
				}
				break;
			case 3:
				System.out.println("Ha elegido la ESTACION 3");
				if(ocupacionEstacion(array_Estacion3)==0) {
					System.out.println("Estacion Vacia");
				}
				else {
					estacion=3;
					fin=true;
				}
				break;
			default:
				System.out.println("Introduce una Estacion Válida.");
				break;
			}
		}while(!fin);
		
		return estacion;
	}
	
	private static int elegirBicicleta(int [] array_Estacion) {
		System.out.println("La Bicicletas disponibles de la estación son:");
		mostrarBicicletasEstacion(array_Estacion);
		int id=-1;
		boolean fin=false;
		while(!fin) {
			System.out.println("Introduce un ID:");
			id=entrada.nextInt();
			if(existeBici(array_Estacion, id)==true) {
				fin=true;
			}
			else {
				System.out.println("Introduce in ID valido.");
			}
		}
		return id;
	}
	
	private static boolean existeBici(int [] array_Estacion, int id) {
		boolean disponible=false;
		for(int elemento:array_Estacion) {
			if(elemento==id) {
				disponible=true;
			}
		}
		return disponible;
	}
	
	private static int elegirEstacionDestino(int [] array_Estacion1, int [] array_Estacion2, int [] array_Estacion3) {
		int estacion;
		boolean fin=false;
		do {
			System.out.println("¿En qué estación desea realizar el Deposito?(1-2-3):");
			System.out.println("1->Estacion 1.");
			System.out.println("2->Estacion 2.");
			System.out.println("3->Estacion 3.");
			System.out.print("Introduce estacion:");
			estacion=entrada.nextInt();
			switch (estacion) {
			case 1: 
				System.out.println("Ha elegido la ESTACION 1");
				if(ocupacionEstacion(array_Estacion1)==6) {
					System.out.println("Estacion Llena");
				}
				else {
					estacion=1;
					fin=true;
				}
				break;
			case 2:
				System.out.println("Ha elegido la ESTACION 2");
				if(ocupacionEstacion(array_Estacion2)==6) {
					System.out.println("Estacion Llena");
				}
				else {
					estacion=2;
					fin=true;
				}
				break;
			case 3:
				System.out.println("Ha elegido la ESTACION 3");
				if(ocupacionEstacion(array_Estacion3)==6) {
					System.out.println("Estacion Llena");
				}
				else {
					estacion=3;
					fin=true;
				}
				break;
			default:
				System.out.println("Introduce una Estacion Válida.");
				break;
			}
		}while(!fin);
		
		return estacion;
		
	}
	
	private static void mostrarBicicletasEstacion(int [] array_Estacion) {
		for(int elemento:array_Estacion) {
			if(elemento!=0) {
				System.out.println("ID BICICLETA: "+elemento);
			}
		}
	}
	
	private static void mostrar_Todas_Estaciones(int [] array_Estacion1, int [] array_Estacion2, int [] array_Estacion3) {
		System.out.println("ESTACION 1:");
		mostrarBicicletasEstacion(array_Estacion1);
		System.out.println("ESTACION 2:");
		mostrarBicicletasEstacion(array_Estacion2);
		System.out.println("ESTACION 3:");
		mostrarBicicletasEstacion(array_Estacion3);
	}
}
