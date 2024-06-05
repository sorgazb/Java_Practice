package pruebas.evaluacion1.prueba1.ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {
	
	public static final int TAM_PILA=10;
	public static final int TAM_COLA=10;
	
	public static Scanner entrada= new Scanner ( System.in);

	public static void main(String[] args) {
		int [] pila= new int [TAM_PILA];
		int [] cola= new int [TAM_COLA];
		funcionalidad(pila, cola);
	}
	
	private static void menu() {
		System.out.println("---- MENU PILA/COLA ----");
		System.out.println("1->Apilar Elemento Pila.");
		System.out.println("2->Despilar Elemento Pila.");
		System.out.println("3->Encolar Elemento Cola.");
		System.out.println("4->Desencolar Elemento Cola.");
		System.out.println("5->Mostrar Pila.");
		System.out.println("6->Mostrar Cola.");
		System.out.println("7->Numero Elementos Pares Pila.");
		System.out.println("8->Suma elementos mayores de 10 impares Cola.");
		System.out.println("9->Mostrar Orden Decreciente Cola.");
		System.out.println("10->Buscar Elemento Pila.");
		System.out.println("11->Buscar Elemento Cola.");
		System.out.println("0->Salir.");

	}
	
	private static void funcionalidad(int [] pila, int [] cola) {
		int opcion=-1;
		do {
			menu();
			System.out.print("Opcion:");
			opcion=entrada.nextInt();
			switch (opcion) {
			case 1:
				apilarPila(pila);
				break;
			case 2:
				desapilarPila(pila);
				break;
			case 3:
				encolarCola(cola);
				break;
			case 4:
				desencolarCola(cola);
				break;
			case 5:
				mostrarPila(pila);
				break;
			case 6:
				mostrarCola(cola);
				break;
			case 7:
				numerosParesPila(pila);
				break;
			case 8:
				sumaElementosCola(cola);
				break;
			case 9:
				ordenarDecrecienteCola(cola);
				break;
			case 10:
				buscarElementoPila(pila);
				break;
			case 11:
				buscarElementoCola(cola);
				break;
			case 0:
				System.out.println("SALIENDO...");
				break;
			default:
				break;
			}
		}while(opcion!=0);
		System.out.println("Fin Ejecucion.");
	}
	
	private static void mostrarPila(int [] pila) {
		for(int elemento:pila) {
			System.out.println("["+elemento+"]");
		}
	}
	
	private static void mostrarCola(int [] cola) {
		for(int elemento:cola) {
			System.out.print("["+elemento+"]");
		}
	}
	
	private static void apilarPila(int [] pila) {
		System.out.print("Introduce el elemento a APILAR:");
		int elemento=entrada.nextInt();
		int i=TAM_PILA;
		boolean insertado=false;
		while(i>0 && !insertado) {
			if(pila[i-1]==0) {
				pila[i-1]=elemento;
				insertado=true;
			}
			i--;
		}
		if(insertado==true) {
			System.out.println("Has insertado el elemento "+elemento+" en la pila.");
		}
		else {
			System.out.println("Pila lleva. No se puede insertar más elemento.");
		}
	}
	
	private static void encolarCola(int [] cola) {
		System.out.print("Introduce el elemento a ENCOLAR:");
		int elemento=entrada.nextInt();
		int i=TAM_PILA;
		boolean insertado=false;
		while(i>0 && !insertado) {
			if(cola[i-1]==0) {
				cola[i-1]=elemento;
				insertado=true;
			}
			i--;
		}
		if(insertado==true) {
			System.out.println("Has insertado el elemento "+elemento+" en la cola.");
		}
		else {
			System.out.println("Cola lleva. No se puede insertar más elemento.");
		}
	}
	
	private static void desapilarPila(int [] pila) {
		boolean desapilado=false;
		int i=0;
		while(i<pila.length && !desapilado) {
			if(pila[i]!=0) {
				pila[i]=0;
				desapilado=true;
			}
			i++;
		}
		if(desapilado==true) {
			System.out.println("Elemento desapilado.");
		}
		else {
			System.out.println("Pila vacia no se puede desapilar.");
		}
	}
	
	private static void desencolarCola(int [] cola) {
		boolean desencolado=false;
		int i=TAM_COLA;
		while(i>0 && !desencolado) {
			if(cola[i-1]!=0) {
				cola[i-1]=0;
				desencolado=true;
			}
			i--;
		}
		if(desencolado==true) {
			System.out.println("Elemento desencolado.");
		}
		else {
			System.out.println("Cola vacia no se puede desencolar.");
		}
	}
	
	private static void numerosParesPila(int [] pila) {
		int cont=0;
		for(int elemento:pila) {
			if(elemento%2==0) {
				if(elemento!=0) {
					cont++;
				}
			}
		}
		System.out.println("Hay "+cont+" elemento pares en la pila.");
	}
	
	private static void sumaElementosCola(int [] cola) {
		int suma=0;
		for(int elemento:cola) {
			if(elemento > 10 && (elemento%2!=0)) {
				suma=suma+elemento;
			}
		}
		System.out.println("La suma de los elementos mayores de 10 e impares de la Cola es: "+suma);
	}
	
	private static void ordenarDecrecienteCola(int [] cola) {
		int aux;
		int tam=cola.length;
		for(int i=0; i < tam-1; i++) {
			for(int j=0;j<tam-i-1;j++) {
				if(cola[j]<cola[j+1]) {
					aux=cola[j];
					cola[j]=cola[j+1];
					cola[j+1]=aux;
				}
			}
		}
		mostrarCola(cola);
		
	}
	
	private static void buscarElementoPila(int [] pila) {
		System.out.println("Introduce el elemento a buscar en la pila:");
		int numero=entrada.nextInt();
		boolean enc=false;
		for(int elemento:pila) {
			if(elemento==numero) {
				enc=true;
			}
		}
		
		if(enc==true) {
			System.out.println("El elemento se encuentra en la pila.");
		}
		else {
			System.out.println("El elemento NO se encuentra en la pila.");
		}
	}
	
	private static void buscarElementoCola(int [] cola) {
		System.out.println("Introduce el elemento a buscar en la cola:");
		int numero=entrada.nextInt();
		boolean enc=false;
		for(int elemento:cola) {
			if(elemento==numero) {
				enc=true;
			}
		}
		
		if(enc==true) {
			System.out.println("El elemento se encuentra en la cola.");
		}
		else {
			System.out.println("El elemento NO se encuentra en la cola.");
		}
	}

}
