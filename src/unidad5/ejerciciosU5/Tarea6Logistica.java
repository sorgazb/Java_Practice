package unidad5.ejerciciosU5;
import java.util.Scanner;

public abstract class Tarea6Logistica {
	
	public static Scanner entrada= new Scanner (System.in);
	
	public static final int MAX_ESTANTERIA=10;
	public static final int MAX_CAMION=16;
	
	public static final int [] estanteria_normal_1=new int [MAX_ESTANTERIA];
	public static final int [] estanteria_normal_2=new int [MAX_ESTANTERIA];
	
	public static final int [] estanteria_urgente_1=new int [MAX_ESTANTERIA];
	public static final int [] estanteria_urgente_2=new int [MAX_ESTANTERIA];
	
	public static final int [] estanteria_fragil_1=new int [MAX_ESTANTERIA];
	public static final int [] estanteria_fragil_2=new int [MAX_ESTANTERIA];
	
	public static final int [] camion_1=new int [MAX_CAMION];
	public static final int [] camion_2=new int [MAX_CAMION];
	public static final int [] camion_3=new int [MAX_CAMION];
	public static final int [] camion_4=new int [MAX_CAMION];
	
	
	public static void main(String[] args) {
		int num=0;
		boolean fin=false;
		while(!fin) {
			ingresarCajaEstanteria();
			System.out.println("Introduce -1 para salir.");
			System.out.println("¿Salir?");
			num=entrada.nextInt();
			if(num==-1) {
				fin=true;
			}
		}
		System.out.println("Ha salido del programa.");
		
	}

	private static int pedirTipoCaja() {
		int tipo=0;
		boolean fin=false;
		while(!fin) {
			System.out.println("Introduce el tipo de caja:");
			System.out.println("1->Normal.");
			System.out.println("2->Urgente.");
			System.out.println("3->Fragil.");
			System.out.print("Tipo:");
			tipo=entrada.nextInt();
			if(tipo==1 || tipo==2 || tipo==3) {
				fin=true;
			}
			else {
				System.out.println("Error. Ese tipo no existe.");
			}
		}
		return tipo;
	}
	
	private static int pedirNumeroCajas() {
		int num=0;
		boolean fin=false;
		while(!fin) {
			System.out.print("Introduce el numero de cajas:");
			num=entrada.nextInt();
			if(num>0 && num<=10) {
				fin=true;
			}
			else {
				System.out.println("Error.");
			}
		}
		return num;
	}
	
	private static int generarNumero(int tipo) {
		int id=0;
		boolean fin=false;
		while(!fin) {
			System.out.print("Introduce el id de la caja (4 digitos):");
			id=entrada.nextInt();
			if(id>=1000 && id<=99999) {
				id=id+(tipo*10000);
				fin=true;
			}
			else {
				System.out.println("El ID no cumple la condición.");
			}
		}
		return id;
	}
	
	private static int pedirEstanteria() {
		int estanteria=0;
		boolean fin=false;
		while(!fin) {
			System.out.println("Introduce la estanteria:");
			System.out.println("1->Estanteria 1:");
			System.out.println("2->Estanteria 2:");
			estanteria=entrada.nextInt();
			if(estanteria==1 || estanteria==2) {
				fin=true;
			}
			else {
				System.out.println("Error. Esa estanteria no existe.");
			}
		}
		return estanteria;
	}
	
	private static void ingresarCajaEstanteria() {
		boolean almacenada=false;
		boolean llena=false;
		int numCajas=pedirNumeroCajas();
		int tipo=pedirTipoCaja();
		int estanteria=pedirEstanteria();
		int cantidad=0;
		int id=0;
		if(tipo==1 && estanteria==1) {
			llena=estaLlena(estanteria_normal_1);
			if(llena==false) {
				while(cantidad<numCajas) {
					id=generarNumero(tipo);
					almacenada=false;
					int i=0;
					while(!almacenada) {
						if(estanteria_normal_1[i]==0) {
							estanteria_normal_1[i]=id;
							almacenada=true;
							System.out.println("Caja almacenada.");
						}else {
							i++;
						}
						
					}
					cantidad++;
				}
				
			}
			else {
				System.out.println("Error. La estanteria está llena.");
			}
			System.out.println("El estado de la Estanteria Normal 1 es:");
			mostrar(estanteria_normal_1);
			
		}else if(tipo==1 && estanteria==2) {
			llena=estaLlena(estanteria_normal_2);
			if(llena==false) {
				while(cantidad<numCajas) {
					id=generarNumero(tipo);
					almacenada=false;
					int i=0;
					while(!almacenada) {
						if(estanteria_normal_2[i]==0) {
							estanteria_normal_2[i]=id;
							almacenada=true;
							System.out.println("Caja almacenada.");
						}
						i++;
					}
					cantidad++;
				}
				
			}
			else {
				System.out.println("Error. La estanteria está llena.");
			}
			System.out.println("El estado de la Estanteria Normal 2 es:");
			mostrar(estanteria_normal_2);
			
		}else if(tipo==2 && estanteria==1) {
			llena=estaLlena(estanteria_urgente_1);
			if(llena==false) {
				while(cantidad<numCajas) {
					id=generarNumero(tipo);
					almacenada=false;
					int i=0;
					while(!almacenada) {	
						if(estanteria_urgente_1[i]==0) {
							estanteria_urgente_1[i]=id;
							almacenada=true;
							System.out.println("Caja almacenada.");
						}
						i++;
					}
					cantidad++;
				}
				
			}
			else {
				System.out.println("Error. La estanteria está llena.");
			}
			System.out.println("El estado de la Estanteria Urgente 1 es:");
			mostrar(estanteria_urgente_1);
			
		}else if(tipo==2 && estanteria==2) {
			llena=estaLlena(estanteria_urgente_2);
			if(llena==false) {
				while(cantidad<numCajas) {
					id=generarNumero(tipo);
					almacenada=false;
					int i=0;
					while(!almacenada) {
						
						
						if(estanteria_urgente_2[i]==0) {
							estanteria_urgente_2[i]=id;
							almacenada=true;
							System.out.println("Caja almacenada.");
						}
						i++;
					}
					cantidad++;
				}
				
			}
			else {
				System.out.println("Error. La estanteria está llena.");
			}
			System.out.println("El estado de la Estanteria Urgente 2 es:");
			mostrar(estanteria_urgente_2);
		}else if(tipo==3 && estanteria==1) {
			llena=estaLlena(estanteria_fragil_1);
			if(llena==false) {
				while(cantidad<numCajas) {
					almacenada=false;
					id=generarNumero(tipo);
					int i=0;
					while(!almacenada) {
						
						if(estanteria_fragil_1[i]==0) {
							estanteria_fragil_1[i]=id;
							almacenada=true;
							System.out.println("Caja almacenada.");
						}
						i++;
					}
					cantidad++;
				}
				
			}
			else {
				System.out.println("Error. La estanteria está llena.");
			}
			System.out.println("El estado de la Estanteria Fragil 1 es:");
			mostrar(estanteria_fragil_1);
			
		}else if(tipo==3 && estanteria==2) {
			llena=estaLlena(estanteria_fragil_2);
			if(llena==false) {
				while(cantidad<numCajas) {
					id=generarNumero(tipo);
					almacenada=false;
					int i=0;
					while(!almacenada) {
						if(estanteria_fragil_2[i]==0) {
							estanteria_fragil_2[i]=id;
							almacenada=true;
							System.out.println("Caja almacenada.");
						}
						i++;
					}
					cantidad++;
				}
				
			}
			else {
				System.out.println("Error. La estanteria está llena.");
			}
			System.out.println("El estado de la Estanteria Fragil 2 es:");
			mostrar(estanteria_fragil_2);
		}
	}
	
	private static void mostrar(int [] array) {
		for(int i=0; i < array.length; i++) {
			System.out.print("["+array[i]+"]");
		}
	}
	
	private static boolean estaLlena(int [] array) {
		boolean llena=false;
		int numElem=0;
		for(int i=0; i < array.length; i++) {
			if(array[i]!=0) {
				numElem++;
			}
		}
		if(numElem==MAX_ESTANTERIA) {
			llena=true;
		}
		return llena;
	}
	
	//Inacabado.
	private static void cambiarCajasEstante() {
		System.out.println("Introduce el tipo de caja origen:");
		int tipoOrigen=pedirTipoCaja();
		int estanteriaOrigen=pedirEstanteria();
		int idOrigen=generarNumero(tipoOrigen);
		System.out.println("Introduce el tipo de caja destino:");
		int tipoDestino=pedirTipoCaja();
		int estanteriaDestino=pedirEstanteria();
		if(tipoOrigen==1 && estanteriaOrigen==1) {
			
		}
	}

}
