package tareasFinales.parqueMovilEmpresa;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;


public class GestionParqueMovil {
	
	private static final  String RUTA_CONFIG_BD="ficheros/sql/properties/conexionBD.properties";
	private static Map<String, Vehiculo> mapaVehiculos= new HashMap<String, Vehiculo>();
	private static Scanner entrada= new Scanner(System.in);
	static Properties configuracion= new Properties();
	
	public static void main(String[] args) {
		menu();
	}
	
	private static void menu() {
		System.out.println("-----MENÚ GESTIÓN PARQUE MOVIL-----");
		System.out.println("OPCION 1--> Dar Alta Vehículo.");
		System.out.println("OPCION 2--> Dar Baja Vehículo.");
		System.out.println("OPCION 3--> Cambiar Kilometraje Vehículo.");
		System.out.println("OPCION 4--> Mostrar Vehiculo Concreto.");
		System.out.println("OPCION 5--> Mostrar Listado de Vehículos.");
		System.out.println("OPCION 6--> Insertar Vehiculos en Base de Datos.");
		System.out.println("OPCION 0--> SALIR.");
		int opcion;
		do {
			System.out.println("Opcion:");
			opcion=entrada.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("OPCION 1--> Dar Alta Vehículo.");
				darAlta(crearNuevoVehiculo());
				break;
			case 2:
				System.out.println("OPCION 2--> Dar Baja Vehículo.");
				darBaja(buscarVehiculo());
				break;
			case 3:
				System.out.println("OPCION 3--> Cambiar Kilometraje Vehículo.");
				System.out.println("Introduce Matricula");
				String matricula=entrada.next();
				entrada.nextLine();
				int kilometraje=entrada.nextInt();
				entrada.nextLine();
				actualizarKilometraje(matricula, kilometraje);
				break;
			case 4:
				System.out.println("OPCION 4--> Mostrar Vehiculo Concreto.");
				System.out.println("Introduce Matricula");
				entrada.nextLine();
				String matriculaBusqueda=entrada.next();
				if(validarMatricula(matriculaBusqueda)==true) {
					mostrarDatosVehiculo(matriculaBusqueda);
				}else {
					System.out.println("ERROR. Formato de matricula incorrecto.");
				}
				break;
			case 5:
				System.out.println("OPCION 5--> Mostrar Listado de Vehículos.");
				mostrarListadoVehiculos();
				break;
			case 6:
				System.out.println("OPCION 6--> Insertar Vehiculos en Base de Datos.");
				cargarConfiguracionBD();
				
				//URL, Usuario y Password de la BD a trabajar
				String url= configuracion.getProperty("urlBD");
				String usuario= configuracion.getProperty("user");
				String password=configuracion.getProperty("password");
				insertarBD(url, usuario, password);
				break;
			case 0:
				System.out.println("SALIENDO...");
				break;
			default:
				System.out.println("ERROR. Opción no valida.");
				break;
			}
		}while (opcion!=0);

	}
	
	private static Vehiculo crearNuevoVehiculo() {
		String matricula,marca,modelo;
		int kilometraje;
		boolean datosCorrectos=false;
		do {
			System.out.println("-Introduce matricula:");
			matricula= entrada.next();
			System.out.println("-Introduce marca:");
			marca= entrada.next();
			System.out.println("-Introduce modelo:");
			modelo= entrada.next();
			entrada.nextLine();
			System.out.println("-Introduce Kilometraje:");
			kilometraje= entrada.nextInt();
			entrada.nextLine();
			if(validarMatricula(matricula)==true) {
				datosCorrectos=true;
			}else {
				System.out.println("Formato de Matricula Erroneo.");
			}
		}while(datosCorrectos==false);
		Vehiculo nuevoVehiculo= new Vehiculo(matricula, LocalDate.now() , marca, modelo, kilometraje);
		return nuevoVehiculo;
	}
	
	private static Vehiculo buscarVehiculo() {
		Vehiculo vehiculo=null;
		System.out.println("-Introduce matricula:");
		String matricula= entrada.next();
		if(validarMatricula(matricula)==true) {
			for(String matriculaAux:mapaVehiculos.keySet()) {
				if(matriculaAux.equals(matricula)) {
					 vehiculo= mapaVehiculos.get(matricula);
				}
			}
		}else {
			System.out.println("ERROR.Formato de matricula Erroneo.");
		}
		return vehiculo;
		
	}
	
	private static void darAlta(Vehiculo vehiculo) {
		boolean dadoAlta=false;
		if(!mapaVehiculos.containsKey(vehiculo.getMatricula())) {
			mapaVehiculos.put(vehiculo.getMatricula(), vehiculo);
			System.out.println("Vehiculo "+vehiculo.getMatricula()+" dado de alta.");
			dadoAlta=true;
		}
		if(dadoAlta==false) {
			System.out.println("No se ha podido dar de alta a ese Vehículo.");
		}
	}
	
	private static void darBaja(Vehiculo vehiculo) {
		boolean dadoBaja=false;
		if(mapaVehiculos.containsKey(vehiculo.getMatricula())) {
			mapaVehiculos.remove(vehiculo.getMatricula(), vehiculo);
			System.out.println("Vehiculo "+vehiculo.getMatricula()+" dado de baja.");
			dadoBaja=true;
		}
		if(dadoBaja==false) {
			System.out.println("No se ha podido dar de baja a ese Vehículo.");
		}
		
	}
	
	private static void actualizarKilometraje(String matricula, int kilometraje) {
		boolean actualizado=false;
		for(String matriculaAux:mapaVehiculos.keySet()) {
			if(matriculaAux.equals(matricula)) {
				 mapaVehiculos.get(matricula).setKilometraje(kilometraje);
				 System.out.println("Kilometraje actualizado.");
				 actualizado=true;
			}
		}
		if(actualizado==false) {
			System.out.println("No se ha podido actualizar el kilometraje.");
		}
	}
	
	private static void mostrarDatosVehiculo(String matricula) {
		for(String matriculaAux:mapaVehiculos.keySet()) {
			if(matriculaAux.equals(matricula)) {
				 System.out.println(mapaVehiculos.get(matricula));
			}
		}
	}
	
	private static void mostrarListadoVehiculos() {
		for(String matriculaAux:mapaVehiculos.keySet()) {
				 System.out.println(mapaVehiculos.get(matriculaAux));
		}
	}
	
	public static boolean validarMatricula(String matricula) {
		return matricula.matches("\\d{4}[A-Z]{3}");
	}
	
	private static void cargarConfiguracionBD() {
		FileInputStream fis;
		try {
			fis=new FileInputStream(RUTA_CONFIG_BD);
			configuracion.load(fis);
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	private static void insertarBD(String url, String usuario, String password) {
		crearTablaGestionParqueMovil(url, usuario, password);
		try (Connection conex= DriverManager.getConnection(url, usuario, password)){
			int cont=0;
			String sqlSentence="INSERT INTO ParqueMovil (matricula,fechaAlta,marca,modelo,kilometraje) VALUES(?,?,?,?,?)";
			PreparedStatement sentencia= conex.prepareStatement(sqlSentence);
			for (String matricula : mapaVehiculos.keySet()) {
				sentencia.setString(1, mapaVehiculos.get(matricula).getMatricula());
				sentencia.setString(2, String.valueOf(mapaVehiculos.get(matricula).getFechaMatriculacion()));
				sentencia.setString(3, mapaVehiculos.get(matricula).getMarca());
				sentencia.setString(4, mapaVehiculos.get(matricula).getModelo());
				sentencia.setInt(5, mapaVehiculos.get(matricula).getKilometraje());
				sentencia.executeUpdate();
				cont++;
			}
			System.out.println("Vehículos insertados: "+cont);
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	private static void crearTablaGestionParqueMovil(String url, String usuario, String password) {
		try (Connection conex= DriverManager.getConnection(url, usuario, password)){
			String sqlSentence="CREATE TABLE IF NOT EXISTS ParqueMovil(matricula VARCHAR(100) PRIMARY KEY, "
					+ "fechaAlta VARCHAR(255),"
					+ "marca VARCHAR(255),"
					+ "modelo VARCHAR(255),"
					+ "kilometraje INT (20));";
			PreparedStatement sentencia=conex.prepareStatement(sqlSentence);
			sentencia.executeUpdate();
			System.out.println("Tabla ParqueMovil Creada.");
			
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
