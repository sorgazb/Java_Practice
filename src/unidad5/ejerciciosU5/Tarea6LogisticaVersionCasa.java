package unidad5.ejerciciosU5;
import java.util.Scanner;

public class Tarea6LogisticaVersionCasa {
	
	public static Scanner entrada= new Scanner (System.in);
	
	/*
	 * De cada tipo de estanntería disponemos dos estantes y cada uno
	 * de ellos cuenta con 10 espacios de almacenaje.
	 */
	public static final int NUM_ESTANTES_TIPO=2;
	public static final int CAP_ESTANTE=10;
	
	/*
	 * Cada camión será capaz de transportar 16 cajas.
	 */
	public static final int CAP_CAMION=16;

	/*
	 * Creamos 3 arrays bidimensionales, uno por cada tipo de caja, en 
	 * este caso los creamos de 2*10, el numero de filas corresponde 
	 * a cada estanteria de ese tipo.
	 */
	public static final String [][] cajas_normales= new String [NUM_ESTANTES_TIPO][CAP_ESTANTE];
	public static final String [][] cajas_fragiles= new String [NUM_ESTANTES_TIPO][CAP_ESTANTE];
	public static final String [][] cajas_urgentes= new String [NUM_ESTANTES_TIPO][CAP_ESTANTE];
	
	/*
	 * Creamos 4 arrays, cada uno corresponde a uno de los camiones,
	 * los cuales tienen la capacidad de transportar 16 cajas.
	 */
	public static final String [] camion1= new String [CAP_CAMION];
	public static final String [] camion2= new String [CAP_CAMION];
	public static final String [] camion3= new String [CAP_CAMION];
	public static final String [] camion4= new String [CAP_CAMION];
	
	public static void main(String[] args) {
		funcionalidadCajas();
	}
	
	/*
	 * Menú principal en el cual el usuario nos indicará que acción quiere realizar.
	 */
	private static int menuPrincipal() {
		int opcion=0;
		System.out.println("--------- NAVALOG ---------");
		System.out.println("1->Almacenar Caja.");
		System.out.println("2->Cambiar caja de estante.");
		System.out.println("3->Mostrar estado estantes.");
		System.out.println("0->Salir.");
		System.out.print("Opción: ");
		opcion=entrada.nextInt();
		return opcion;
	}
	
	/*
	 * Función en la cual una vez indicada la acción que quiere realizar el usuario el programa
	 * pasará a ejecutar dicha acción.
	 */
	private static void funcionalidadCajas() {

		int opcion=0;
		do {
			opcion=menuPrincipal();
			System.out.println("----------------------------");
			entrada.nextLine();
			switch (opcion) {
			case 1:
				System.out.println("OPCIÓN 1->Almacenar Caja.");
				funcionalidadIngresarCaja();
				break;
			case 2:
				System.out.println("OPCIÓN 2->Cambiar caja de estante.");
				funcionalidadCambiarCaja();
				break;
			case 3:
				System.out.println("OPCIÓN 3->Mostrar estado estantes.");
				mostrarTodasEstanterias();
				break;
			case 0:
				System.out.println("OPCIÓN 0->Salir.");
				System.out.println("SALIENDO...");
				break;
			default:
				System.out.println("ERROR. Opción no valida porfavor introduce una opción valida.");
				break;
			}
		}while(opcion!=0);
		System.out.println("Gracias por usar NAVALOG, hasta la próxima.");
	}
	
	/*
	 * Función la cual muestra por pantalla el estado de la estanteria que se le indica por 
	 * parametros.
	 */
	private static void mostrarEstadoEstante(String [][] array) {
		for(int i=0; i < NUM_ESTANTES_TIPO; i++) {
			for(int j=0; j < CAP_ESTANTE; j++) {
				System.out.print("["+array[i][j]+"]");
			}
			System.out.println(" ");
		}
	}
	
	/*
	 * Función la cual muestra por pantalla el estado de todas las estanterias.
	 */
	private static void mostrarTodasEstanterias() {
		System.out.println("-- CAJAS NORMALES --");
		mostrarEstadoEstante(cajas_normales);
		System.out.println("");
		System.out.println("-- CAJAS URGENTES --");
		mostrarEstadoEstante(cajas_urgentes);
		System.out.println("");
		System.out.println("-- CAJAS FRAGILES --");
		mostrarEstadoEstante(cajas_fragiles);
	}
	
	/*
	 * Función que nos indica si la fila indicada por parametros de esa estanteria
	 * está llena o no.
	 */
	private static boolean estaLlena(String [][] array, int fila) {
		boolean llena=false;
		int cont=0;
		for(int i=0; i < CAP_ESTANTE; i++) {
			if(array[fila][i]!=null) {
				cont++;
			}
		}
		if(cont==CAP_ESTANTE) {
			llena=true;
		}
		return llena;
	}
	
	/*
	 * 
	 */
	private static boolean existeCaja(String id, int estanteria, String [][] array) {
		boolean existe=false;
		for(int i=0; i < CAP_ESTANTE; i++) {
			if(array[estanteria][i]!=null) {
				if(array[estanteria][i].equals(id)) {
					existe=true;
				}
			}
		}
		return existe;
	}
	
	/*
	 * Función con la cual el usuario indicará con que tipo de caja quiere operar.
	 */
	private static String pedirTipoCaja() {
		String tipo="";
		boolean fin=false;
		while(!fin) {
			System.out.println("--- TIPO DE CAJA ---");
			System.out.println("N-> NORMAL.");
			System.out.println("U-> URGENTE.");
			System.out.println("F-> FRÁGIL.");
			System.out.print("Tipo: ");
			tipo=entrada.next();
			if(tipo=="N" || tipo!="U" || tipo!="F") {
				fin=true;
			}
			else {
				System.out.println("ERROR. Ese tipo de caja no existe, porfavor indique un tipo de caja válido.");
			}
		}
		return tipo;
	}
	
	/*
	 * Función que nos devuelve la estanteria con la que quiere operar el usuario.
	 */
	private static int pedirFila() {
		int fila=0;
		boolean fin=false;
		while(!fin) {
			System.out.println("--- ESTANTERIA ---");
			System.out.println("1-> Estanteria 1.");
			System.out.println("2-> Estanteria 2.");
			System.out.println("Estanteria: ");
			fila=entrada.nextInt();
			if(fila==1 || fila==2) {
				fin=true;
			}
			else {
				System.out.println("ERROR. Esa fila no existe, porfavor introduce una fila válida.");
			}
		}
		fila=fila-1;
		return fila;
	}
	
	/*
	 * Con está función lo que hacemos es generar el ID de la caja N(tipo caja)+XXXX(número de id)
	 */
	private static String generarIDCaja(String tipo, int fila, String [][] array) {
		String id="";
		int idNum=0;
		boolean fin=false;
		while(!fin) {
			System.out.println("Introduce ID de caja a almacenar (1000-9999):");
			idNum=entrada.nextInt();
			if(idNum>=1000 && idNum<=9999) {
				id=tipo+idNum;
				if(existeCaja(id, fila, array)==false) {
					fin=true;
				}
				else {
					System.out.println("ERROR. El ID de esa caja ya existen el estanteria.");
				}
			}
			else {
				System.out.println("ERROR. ID no tiene los parametros válidos.");
			}
		}
		return id;
	}
	
	/*
	 * Esta función permite al usuario ingresar una caja del tipo que el usuario quiera en la estanteria que el quiera.
	 */
	private static void funcionalidadIngresarCaja() {
		String tipo=pedirTipoCaja();
		entrada.nextLine();
		int estanteria=pedirFila();
		String id="";
		switch(tipo) {
		case "N":
			if(estaLlena(cajas_normales, estanteria)==false) {
				id=generarIDCaja(tipo, estanteria, cajas_normales);
				ingresarCaja(id, estanteria, cajas_normales);
				mostrarEstadoEstante(cajas_normales);
			}else {
				System.out.println("ERROR. Estanteria llena, por favor repita la que opción quiere realizar.");
				
			}
			break;
		case "U":
			if(estaLlena(cajas_urgentes, estanteria)==false) {
				id=generarIDCaja(tipo, estanteria, cajas_urgentes);
				ingresarCaja(id, estanteria, cajas_urgentes);
				mostrarEstadoEstante(cajas_urgentes);
			}else {
				System.out.println("ERROR. Estanteria llena, por favor repita la que opción quiere realizar.");
			}
			break;
		case "F":
			if(estaLlena(cajas_fragiles, estanteria)==false) {
				id=generarIDCaja(tipo, estanteria, cajas_fragiles);
				ingresarCaja(id, estanteria, cajas_fragiles);
				mostrarEstadoEstante(cajas_fragiles);
			}else {
				System.out.println("ERROR. Estanteria llena, por favor repita la que opción quiere realizar.");
			}
			break;
		}
	}
	
	/*
	 * Esta función ingresa la caja en el primer hueco vacio de esa fila, la cual no está llena.
	 */
	private static void ingresarCaja(String id, int estanteria, String [][] array) {
		boolean almacenado=false;
		int i=0;
		while(!almacenado) {
			if(array[estanteria][i]==null) {
				array[estanteria][i]=id;
				almacenado=true;
			}else {
				i++;
			}
		}
	}
	
	private static void funcionalidadCambiarCaja() {
		boolean almacenada=false;
		int i=0;
		System.out.println("--- INFORMACIÓN ORIGEN CAJA ---");
		String tipoOrigen=pedirTipoCaja();
		entrada.nextLine();
		int estanteriaOrigen=pedirFila();
		entrada.nextLine();
		System.out.println("ID de la Caja:");
		String id=entrada.next();
		switch(tipoOrigen) {
		case "N":
			if(existeCaja(id, estanteriaOrigen, cajas_normales)==true) {
				System.out.println("--- INFORMACIÓN DESTINO CAJA ---");
				String tipoDestino=pedirTipoCaja();
				entrada.nextLine();
				int estanteriaDestino=pedirFila();
				switch (tipoDestino) {
				case "N":
					if(estaLlena(cajas_normales, estanteriaDestino)==false) {
						while(!almacenada) {
							if(cajas_normales[estanteriaDestino][i]==null) {
								cajas_normales[estanteriaDestino][i]=id;
								almacenada=true;
								cajas_normales[estanteriaOrigen][i]=null;
							}
						}
					}
					break;
				case "U":
					if(estaLlena(cajas_urgentes, estanteriaDestino)==false) {
						while(!almacenada) {
							if(cajas_urgentes[estanteriaDestino][i]==null) {
								cajas_urgentes[estanteriaDestino][i]=id;
								almacenada=true;
								cajas_normales[estanteriaOrigen][i]=null;
							}
						}
					}
					break;
				case "F":
					if(estaLlena(cajas_fragiles, estanteriaDestino)==false) {
						while(!almacenada) {
							if(cajas_fragiles[estanteriaDestino][i]==null) {
								cajas_fragiles[estanteriaDestino][i]=id;
								almacenada=true;
								cajas_normales[estanteriaOrigen][i]=null;
							}
						}
					}
					break;
				}
			}
			break;
		case "U":
			if(existeCaja(id, estanteriaOrigen, cajas_urgentes)==true) {
				System.out.println("--- INFORMACIÓN DESTINO CAJA ---");
				String tipoDestino=pedirTipoCaja();
				entrada.nextLine();
				int estanteriaDestino=pedirFila();
				switch (tipoDestino) {
				case "N":
					if(estaLlena(cajas_normales, estanteriaDestino)==false) {
						while(!almacenada) {
							if(cajas_normales[estanteriaDestino][i]==null) {
								cajas_normales[estanteriaDestino][i]=id;
								almacenada=true;
								cajas_urgentes[estanteriaOrigen][i]=null;
							}
						}
					}
					break;
				case "U":
					if(estaLlena(cajas_urgentes, estanteriaDestino)==false) {
						while(!almacenada) {
							if(cajas_urgentes[estanteriaDestino][i]==null) {
								cajas_urgentes[estanteriaDestino][i]=id;
								almacenada=true;
								cajas_urgentes[estanteriaOrigen][i]=null;
							}
						}
					}
					break;
				case "F":
					if(estaLlena(cajas_fragiles, estanteriaDestino)==false) {
						while(!almacenada) {
							if(cajas_fragiles[estanteriaDestino][i]==null) {
								cajas_fragiles[estanteriaDestino][i]=id;
								almacenada=true;
								cajas_urgentes[estanteriaOrigen][i]=null;
							}
						}
					}
					break;
				}

			}
			break;
		case "F":
			if(existeCaja(id, estanteriaOrigen, cajas_fragiles)==true) {
				System.out.println("--- INFORMACIÓN DESTINO CAJA ---");
				String tipoDestino=pedirTipoCaja();
				entrada.nextLine();
				int estanteriaDestino=pedirFila();
				switch (tipoDestino) {
				case "N":
					if(estaLlena(cajas_normales, estanteriaDestino)==false) {
						while(!almacenada) {
							if(cajas_normales[estanteriaDestino][i]==null) {
								cajas_normales[estanteriaDestino][i]=id;
								almacenada=true;
								cajas_fragiles[estanteriaOrigen][i]=null;
							}
						}
					}
					break;
				case "U":
					if(estaLlena(cajas_urgentes, estanteriaDestino)==false) {
						while(!almacenada) {
							if(cajas_urgentes[estanteriaDestino][i]==null) {
								cajas_urgentes[estanteriaDestino][i]=id;
								almacenada=true;
								cajas_fragiles[estanteriaOrigen][i]=null;
							}
						}
					}
					break;
				case "F":
					if(estaLlena(cajas_fragiles, estanteriaDestino)==false) {
						while(!almacenada) {
							if(cajas_fragiles[estanteriaDestino][i]==null) {
								cajas_fragiles[estanteriaDestino][i]=id;
								almacenada=true;
								cajas_fragiles[estanteriaOrigen][i]=null;
							}
						}
					}
					break;
				}

			}
			break;
		}
	}
	
}
