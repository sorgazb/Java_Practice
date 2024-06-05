package pruebas.evaluacion1.prueba2.ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {
	
	public static Scanner entrada= new Scanner(System.in);
	
	public static final int TAM_SETS=3;
	public static final int TAM_JUEGO=8;
	
	public static void main(String[] args) {
		
		int [] sets_Pareja1=new int [TAM_SETS];
		int [] sets_Pareja2=new int [TAM_SETS];
		
		int [] juego_Pareja1= new int [TAM_JUEGO];
		int [] juego_Pareja2= new int [TAM_JUEGO];
		
		
		funcionalidadJuego(juego_Pareja1, juego_Pareja2, sets_Pareja1, sets_Pareja2);
	
	}
	
	private static void mostrarMarcador(int [] setsP1, int [] setsP2, int [] juegosP1, int [] juegosP2, int pnt) {
		System.out.print("PAREJA 1->");
		mostrarPuntaje(setsP1);
		System.out.print(" | ");
		mostrarPuntoActual(juegosP1, pnt);
		System.out.println("");
		System.out.print("PAREJA 2->");
		mostrarPuntaje(setsP2);
		System.out.print(" | ");
		mostrarPuntoActual(juegosP2, pnt);
	}
	
	private static void mostrarPuntaje(int [] array) {
		for(int elemento:array) {
			System.out.print(" "+elemento+" ");
		}
	}
	
	
	private static void mostrarPuntoActual(int [] array, int puntoAct) {
		System.out.println(array[puntoAct]);
	}
	
	//Función que rellena el  vector de puntos con el ultimo punto obtenido para cuando
	//anote el siguiente punto tenga almacenada la ultima puntuación.
	private static void rellenar(int [] puntos, int punto, int puntuacion) {
		for(int i=punto; i < puntos.length; i++) {
			puntos[i]=puntuacion;
		}
	}
	
	
	private static void ganadorPunto(int [] array_Punto, int pos) {
		boolean anotado=false;
		for(int i=0; i < array_Punto.length && !anotado; i++) {
			if(i==pos) {
				if(pos==0) {
					array_Punto[i]=15;
					rellenar(array_Punto, pos, 15);
					anotado=true;
				}
				else {
					if(array_Punto[i-1]==0) {
						array_Punto[i]=15;
						rellenar(array_Punto, pos, 15);
						anotado=true;
					}else if(array_Punto[i-1]==15) {
						array_Punto[i]=30;
						rellenar(array_Punto, pos, 30);
						anotado=true;
					}else if(array_Punto[i-1]==30) {
						array_Punto[i]=40;
						rellenar(array_Punto, pos, 40);
						anotado=true;
					}else if(array_Punto[i-1]==40) {
						array_Punto[i]=41;//punto de oro o punto fin juego.
						anotado=true;
					}
				}
			}
		}
	}
	
	
	private static void ganadorSet(int [] array_Set, int set) {
		boolean anotado=false;
		for(int i=set; i < array_Set.length && !anotado; i++) {
			if(array_Set[i]<6) {
				array_Set[i]=array_Set[i]+1;
				anotado=true;
			}
		}
	}
	
	private static boolean haGanadoJuego(int [] array_Juego) {
		boolean haGanado=false;
		for(int i=0; i < array_Juego.length && !haGanado; i++) {
			if(array_Juego[i]==41) {
				haGanado=true;
			}
		}
		return haGanado;
	}
	
	private static void finJuego(int [] juego) {
		for(int i=0; i < juego.length; i++) {
			juego[i]=0;
		}
	}
	
	private static boolean haGanadoSet(int [] array_Set, int set) {
		boolean haGanado=false;
		for(int i=set; i < array_Set.length && !haGanado; i++) {
			if(array_Set[i]==6) {
				haGanado=true;
			}
		}
		return haGanado;
	}
	
	private static boolean finPartida(int [] arraySet) {
		int cont=0;
		boolean haGanado=false;
		for(int i=0; i < arraySet.length; i++) {
			if(arraySet[i]==6) {
				cont++;
			}
		}
		if(cont==2) {
			haGanado=true;
		}
		return haGanado;
	}
	
	private static void mostrarMenuPunto() {
		System.out.println("¿Quién ha ganado el punto?:");
		System.out.println("1->Pareja 1.");
		System.out.println("2->Pareja 2.");
	}
	
	private static void funcionalidadJuego(int [] juegoP1, int [] juegoP2, int [] setsP1, int [] setsP2) {
		boolean finJuego=false;
		int puntoAct=0;
		int setAct=0;
		int ganador=0;
		do {
			mostrarMarcador(setsP1, setsP2, juegoP1, juegoP2,puntoAct);
			System.out.println(" ");
			mostrarMenuPunto();
			System.out.print("Ganador: ");
			ganador=entrada.nextInt();
			switch(ganador) {
			case 1:
				ganadorPunto(juegoP1, puntoAct);
				if(haGanadoJuego(juegoP1)==true) {
					ganadorSet(setsP1,setAct);
					finJuego(juegoP1);
					finJuego(juegoP2);
					puntoAct=0;
					if(haGanadoSet(setsP1, setAct)==true) {
						if(finPartida(setsP1)==true) {
							System.out.println("Ha GANADO LA PAREJA 1.");
							finJuego=true;
						}else {
							setAct++;
						}
					}
				}
				break;
			case 2:
				ganadorPunto(juegoP2, puntoAct);
				if(haGanadoJuego(juegoP2)==true) {
					ganadorSet(setsP2,setAct);
					finJuego(juegoP2);
					finJuego(juegoP1);
					puntoAct=0;
					if(haGanadoSet(setsP2, setAct)==true) {
						if(finPartida(setsP2)==true) {
							System.out.println("Ha GANADO LA PAREJA 2.");
							finJuego=true;
						}else {
							setAct++;
						}
					}
				}
				break;
			default:
				System.out.println("Error. Pareja no existente.");
			}
			puntoAct++;
		}while(!finJuego);
	}

}
