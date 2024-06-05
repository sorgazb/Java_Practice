package pruebas.evaluacion1.prueba1.ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {
	
	public static Scanner entrada= new Scanner(System.in);
	public static final int TAM=12;
	public static final int TAM_30=30;
	public static final int TAM_31=31;
	public static final int TAM_28=28;
	
	public static void main(String[] args) {
		
		double [] enero=new double [TAM_31];
		double [] febrero=new double [TAM_28];
		double [] marzo=new double [TAM_31];
		double [] abril=new double [TAM_30];
		double [] mayo=new double [TAM_31];
		double [] junio=new double [TAM_30];
		double [] julio=new double [TAM_31];
		double [] agosto=new double [TAM_31];
		double [] septiembre=new double [TAM_30];
		double [] octubre=new double [TAM_31];
		double [] noviembre=new double [TAM_30];
		double [] diciembre=new double [TAM_31];
		funcionalidad(enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre);
		
	}
	
	private static void menu() {
		System.out.println("---- Menú Publiometro ----");
		System.out.println("1-> Introducir Valores Mes:");
		System.out.println("2-> Calcular Media Mes:");
		System.out.println("3-> Calcular Media Año:");
		System.out.println("0-> Salir:");
	}
	
	private static void funcionalidad(double [] enero, double [] febrero, double [] marzo, double [] abril, double [] mayo, double [] junio, double [] julio, double [] agosto, double [] septiembre, double [] octubre, double [] noviembre, double [] dicciembre) {
		int opcion=-1;
		int mes;
		double media;
		do {
			menu();
			opcion=entrada.nextInt();
			switch(opcion) {
			case 1:
				mes=pedirMes();
				if(mes==1) {
					System.out.println("Enero.");
					introducirValoresMeses(enero);
				}else if(mes==2) {
					System.out.println("Febrero.");
					introducirValoresMeses(febrero);
				}
				else if(mes==3) {
					System.out.println("Marzo.");
					introducirValoresMeses(marzo);
				}
				else if(mes==4) {
					System.out.println("Abril.");
					introducirValoresMeses(abril);
				}
				else if(mes==5) {
					System.out.println("Mayo.");
					introducirValoresMeses(mayo);
				}
				else if(mes==6) {
					System.out.println("Junio.");
					introducirValoresMeses(junio);
				}
				else if(mes==7) {
					System.out.println("Julio.");
					introducirValoresMeses(julio);
				}
				else if(mes==8) {
					System.out.println("Agosto.");
					introducirValoresMeses(agosto);
				}
				else if(mes==9) {
					System.out.println("Septiembre.");
					introducirValoresMeses(septiembre);
				}
				else if(mes==10) {
					System.out.println("Octubre.");
					introducirValoresMeses(octubre);
				}
				else if(mes==11) {
					System.out.println("Noviembre.");
					introducirValoresMeses(noviembre);
				}
				else if(mes==12) {
					System.out.println("Diciembre.");
					introducirValoresMeses(dicciembre);
				}
				
				break;
			case 2:
				mes=pedirMes();
				if(mes==1) {
					System.out.println("Enero.");
					media=calcularMediaMes(enero);
					System.out.println("La media de Enero es: "+media);
				}
				else if(mes==2) {
					System.out.println("Febrero.");
					media=calcularMediaMes(febrero);
					System.out.println("La media de Febrero es: "+media);
				}
				else if(mes==3) {
					System.out.println("Marzo.");
					media=calcularMediaMes(marzo);
					System.out.println("La media de Marzo es: "+media);
				}
				else if(mes==4) {
					System.out.println("Abril.");
					media=calcularMediaMes(abril);
					System.out.println("La media de Abril es: "+media);
				}
				else if(mes==5) {
					System.out.println("Mayo.");
					media=calcularMediaMes(mayo);
					System.out.println("La media de Mayo es: "+media);
				}
				else if(mes==6) {
					System.out.println("Junio.");
					media=calcularMediaMes(junio);
					System.out.println("La media de Junio es: "+media);
				}
				else if(mes==7) {
					System.out.println("Julio.");
					media=calcularMediaMes(julio);
					System.out.println("La media de Julio es: "+media);
				}
				else if(mes==8) {
					System.out.println("Agosto.");
					media=calcularMediaMes(agosto);
					System.out.println("La media de Agosto es: "+media);
				}
				else if(mes==9) {
					System.out.println("Septiembre.");
					media=calcularMediaMes(septiembre);
					System.out.println("La media de Septiembre es: "+media);
				}
				else if(mes==10) {
					System.out.println("Octubre.");
					media=calcularMediaMes(octubre);
					System.out.println("La media de Octubre es: "+media);
				}
				else if(mes==11) {
					System.out.println("Noviembre.");
					media=calcularMediaMes(noviembre);
					System.out.println("La media de Noviembre es: "+media);
				}
				else if(mes==12) {
					System.out.println("Diciembre.");
					media=calcularMediaMes(dicciembre);
					System.out.println("La media de Diciembre es: "+media);
				}
				break;
			case 3:
				media=mediaAnio(enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, dicciembre);
				System.out.println("La media de precipitaciones al año es:"+media);
				break;
			case 0:
				System.out.println("SALIENDO...");
				break;
			}
			
		}while(opcion!=0);
	}
	
	private static int pedirMes() {
		int mes=-1;
		boolean enc=false;
		while(!enc) {
			System.out.println("Introduce el mes(1-12):");
			mes=entrada.nextInt();
			if(mes<1 || mes>12) {
				System.out.println("Mes no valido.");
			}
			else {
				enc=true;
			}
		}
		return mes;
	}
	
	
	
	private static void introducirValoresMeses(double [] mes) {
		double valor;
		for(int i=0; i < mes.length; i++) {
			System.out.println("Dia"+(i+1)+": ");
			valor=entrada.nextDouble();
			mes[i]=valor;
		}
	}
	
	private static double calcularMediaMes(double [] mes) {
		double media=0;
		double suma=0;
		int cont=0;
		for(double elemento: mes) {
			suma=suma+elemento;
			cont++;
		}
		media=suma/cont;
		return media;
	}
	
	private static double mediaAnio(double [] enero, double [] febrero, double [] marzo, double [] abril, double [] mayo, double [] junio, double [] julio, double [] agosto, double [] septiembre, double [] octubre, double [] noviembre, double [] dicciembre) {
		double media=0;
		double media1=calcularMediaMes(enero);
		double media2=calcularMediaMes(febrero);;
		double media3=calcularMediaMes(marzo);;
		double media4=calcularMediaMes(abril);;
		double media5=calcularMediaMes(mayo);
		double media6=calcularMediaMes(junio);
		double media7=calcularMediaMes(julio);
		double media8=calcularMediaMes(agosto);
		double media9=calcularMediaMes(septiembre);
		double media10=calcularMediaMes(octubre);
		double media11=calcularMediaMes(noviembre);
		double media12=calcularMediaMes(dicciembre);
		
		media=(media1+media2+media3+media4+media5+media6+media7+media8+media9+media10+media11+media12)/TAM;
		
		return media;
	}
	

}
