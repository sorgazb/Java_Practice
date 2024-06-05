package unidad9.tareasU9.energiasRenovables;

import java.time.LocalDate;
import java.util.Scanner;

public class DemoPlantas {

	public static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		int opcion=0;
		do {
			opcion=menu();
			switch(opcion) {
			case 1:
				opcion=menuPlaca();
				switch(opcion) {
				case 1:
					String id=registrarId();
					TipoPlacas tipo=registrarTipoPlaca();
					Orientaciones orientaciones= registrarOrientacionPlaca();
					double inclinacion= entrada.nextDouble();
					ProductorEnergia placa1= new PlacaSolar(id, LocalDate.of(2012, 4, 15), tipo, orientaciones, inclinacion);
					System.out.println("PLACA REGISTRADA.");
					break;
				case 0:
					break;
			    }
				break;
			case 2:
				opcion=menuMolino();
				switch(opcion) {
				case 1:
					String id=registrarId();
					ProductorEnergia molino= new MolinoViento(id, LocalDate.of(2010, 11, 20));
					break;
				case 0:
					break;
			    }
				break;
			case 3:
				break;
			case 0:
				break;
			}
		}while(opcion!=0);

	}
	
	public static int menu() {
		int opcion=0;
		System.out.println("1_MANEJAR PLACA.");
		System.out.println("2_MANEJAR MOLINO.");
		System.out.println("3_INFORMACION PLANTA.");
		System.out.println("0_SALIR");
		opcion=entrada.nextInt();
		return opcion;
	}
	
	public static int menuPlaca() {
		int opcion=0;
		System.out.println("1_REGISTRAR PLACA.");
		System.out.println("0_SALIR");
		opcion=entrada.nextInt();
		return opcion;
	}
	
	public static int menuMolino() {
		int opcion=0;
		System.out.println("1_REGISTRAR MOLINO.");
		System.out.println("0_SALIR");
		opcion=entrada.nextInt();
		return opcion;
	}
	
	public static String registrarId() {
		String id;
		boolean fin=false;
		do {
			System.out.println("Introduce un ID:");
			entrada.nextLine();
			id=entrada.next();
			if(id.matches("[0-9]{5}-[A-Z]{3}")) {
				fin=true;
			}
		}while(!fin);
		return id;
	}
	
	public static TipoPlacas registrarTipoPlaca() {
		String tipo;
		TipoPlacas tipoPlaca=null;
		boolean fin=false;
		do {
			System.out.println("Introduce una tipo:");
			entrada.nextLine();
			tipo=entrada.next();
			if(tipo.equals("Fotovoltaica")) {
				tipoPlaca=TipoPlacas.PANEL_FOTOVOLTAICO;
				fin=true;
			}else if(tipo.equals("Hibrida")) {
				tipoPlaca=TipoPlacas.PANEL_HIBRIDO;
				fin=true;
			}else if(tipo.equals("Termica")){
				tipoPlaca=TipoPlacas.PANEL_TERMICO;
				fin=true;
			}
		}while(!fin);
		return tipoPlaca;
	}
	
	public static Orientaciones registrarOrientacionPlaca() {
		String tipo;
		Orientaciones orientacion=null;
		boolean fin=false;
		do {
			System.out.println("Introduce una orientacion:");
			entrada.nextLine();
			tipo=entrada.next();
			if(tipo.equals("Sur")) {
				orientacion=Orientaciones.SUR;
				fin=true;
			}else if(tipo.equals("Norte")) {
				orientacion=Orientaciones.NORTE;
				fin=true;
			}else if(tipo.equals("Este")){
				orientacion=Orientaciones.ESTE;
				fin=true;
			}else if(tipo.equals("Oeste")) {
				orientacion=Orientaciones.OESTE;
				fin=true;
			}
		}while(!fin);
		return orientacion;
	}


}
