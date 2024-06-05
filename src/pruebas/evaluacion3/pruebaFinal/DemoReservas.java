package pruebas.evaluacion3.pruebaFinal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.util.Properties;
import java.util.Scanner;

import unidad12.ConfiguracionBD;

public class DemoReservas {
	
	public static Scanner entrada= new Scanner(System.in);
	static Properties configuracion= new Properties();
	static String url;
	static String usuario;
	static String password;
	public static final String RUTA_ESCRITURA = "ficheros";


	public static void main(String[] args) {
		cargarConfiguracionBD();
		crearCarpetasJustificantesReservas();
		funcionalidad();
	}
	
	//Metodo que gestiona el funcionamieto principal del programa:
	public static void funcionalidad() {
		ReservasDAO reservasDAO= new ReservasDAO(url, usuario, password);
		menu();
		int opcion=0;
		do {
			System.out.println("Opcion:");
			opcion=entrada.nextInt();
			entrada.nextLine();
			switch (opcion) {
			case 1:
				System.out.println("OPCION 1 -> Añadir nueva cita:");
				Reserva reserva=crearReservaNueva();
				reservasDAO.insertarReserva(reserva);
				int justificante=0;
				System.out.println("Desea generar un justificante de la reserva:");
				System.out.println("1->Si");
				System.out.println("2->No");
				justificante=entrada.nextInt();
				if(justificante==1) {
					escribirJustificanteReserva(reserva);
				}
				entrada.nextLine();
				break;
			case 2:
				reservasDAO.mostrarTablaCitas();
				break;
			case 3:
				reservasDAO.mostrarTablaPagos();
				break;
			case 0:
				System.out.println("Saliendo...");
				opcion=0;
				break;
			default:
				System.out.println("Opcion no valida.");
			}
		}while(opcion!=0);
	}
	
	//Menu que se le muestra por consola al usuario:
	public static void menu() {
		System.out.println("Menu:");
		System.out.println("1->Añadir una nueva Cita.");
		System.out.println("2->Listar Citas.");
		System.out.println("3->Listar Pagos.");
		System.out.println("0->Salir del programa.");
	}
	
	//Metodo para crear una nueva reserva la cual se insertará en la base de datos:
	public static Reserva crearReservaNueva() {
		Reserva nuevaReserva=null;
		int numeroCita=generarNumeroCita();
		String tipoDocumento=pedirTipoDocumento();
		System.out.println("Introduce Numero de "+tipoDocumento+" :");
		String numeroDocumento=entrada.nextLine();
		System.out.println("Introduce la fecha de la reserva:");
		String fecha=entrada.nextLine();
		System.out.println("Introduce la hora de la reserva:");
		String horaString=entrada.nextLine();
		int hora=Integer.parseInt(horaString);
		String estadoPago=obtenerEstadoPago();
		System.out.println("Introduce un teléfono:");
		String telefono=entrada.nextLine();
		String email="";
		if(telefono.equals("")) {
			boolean emailIntroducido=false;
			while(emailIntroducido==false) {
				System.out.println("Introduce un Email:");
				email=entrada.nextLine();
				if(!email.equals("")) {
					emailIntroducido=true;
				}
			}
		}else {
			System.out.println("Introduce un Email:");
			email=entrada.nextLine();
			
		}
		nuevaReserva= new Reserva(numeroCita, numeroDocumento, fecha, hora,estadoPago,tipoDocumento,telefono, email);
		return nuevaReserva;
	}
	
	//Lectura de un fichero propertites toda la configuaracion de conexion con la base de datos:
	public static void cargarConfiguracionBD() {
		FileInputStream fis;
		try {
			fis=new FileInputStream(ConfiguracionBD.ficheroConfiguracioBD);
			configuracion.load(fis);
			url= configuracion.getProperty("urlBD");
			usuario= configuracion.getProperty("user");
			password=configuracion.getProperty("password");
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	//Metodo para generar el numero aleatorio de la cita:
	private static int generarNumeroCita() {
		SecureRandom random= new SecureRandom();
		int numeroCita=0;
		String numSeisCifras="";
		int cont=6;
		for(int i=0; i < cont; i++) {
			int numAleatorio= random.nextInt(10);
			numSeisCifras=numSeisCifras.concat(""+numAleatorio);
		}
		numeroCita=Integer.parseInt(numSeisCifras);
		return numeroCita;
	}
	
	//Metodo por el cual el usuario indica el tipo de documento a renovar:
	private static String pedirTipoDocumento() {
		String tipoDocumento="";
		int opcion=0;
		System.out.println("Docuemento a renovar:");
		System.out.println("1->DNI");
		System.out.println("2->Pasaporte");
		
		do {
			System.out.println("Opcion:");
			opcion=entrada.nextInt();
			switch (opcion) {
			case 1:
				tipoDocumento="DNI";
				opcion=0;
				break;
			case 2:
				tipoDocumento="Pasaporte";
				opcion=0;
				break;
			default:
				System.out.println("Opcion no valida introduce una correcta.");
			}
			entrada.nextLine();
		}while(opcion!=0);
		return tipoDocumento;
	}

	//Metodo por el cual el usuario indica cuando desea pagar o si esta exento de pago:
	private static String obtenerEstadoPago() {
		String estadoPago="";
		int opcion=0;
		System.out.println("Introduce el estado de pago:");
		System.out.println("1->Pagar ahora.");
		System.out.println("2->Exento de pago");
		System.out.println("0->Pagar otro dia");
		
		do {
			System.out.println("Opcion:");
			opcion=entrada.nextInt();
			switch (opcion) {
			case 1:
				estadoPago="Pagado";
				opcion=0;
				break;
			case 2:
				estadoPago="Exento";
				opcion=0;
				break;
			case 0:
				System.out.println("Tendrás que pagar otro dia.");
				estadoPago="Pendiente";
				opcion=0;
				break;
			default:
				System.out.println("Opcion no valida.");
				break;
			}
			entrada.nextLine();
		}while(opcion!=0);
		return estadoPago;
	}
	
	//Metodo para crear la carpeta donde se guardaran los justificantes
	private static void crearCarpetasJustificantesReservas() {
			File directorio = new File(RUTA_ESCRITURA + "/citasdni");
			if (directorio.exists()) {
			} else {
				directorio.mkdir();
				crearCarpetasJustificantes();
			}
	}
	
	//Metodo para crear la carpeta donde se guardaran los justificantes de pago.
	private static void crearCarpetasJustificantes() {
		File directorio = new File(RUTA_ESCRITURA + "/citasdni/justificantes");
		if (directorio.exists()) {
		} else {
			directorio.mkdir();
		}
	}
	
	//Metodo el cual vuelca en un fichero la información del justificante de la reserva:
	private static void escribirJustificanteReserva(Reserva reserva) {
		try {
			PrintWriter escritor = new PrintWriter(RUTA_ESCRITURA + "/citasdni/justificantes/"+reserva.getNumeroCita()+".txt");
				escritor.println(reserva.getNumeroCita() + "," + reserva.getFecha() + "," + reserva.getHora() + "," + reserva.getTramite());

			escritor.close();

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
