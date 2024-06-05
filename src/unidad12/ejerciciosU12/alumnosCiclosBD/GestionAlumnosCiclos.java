package unidad12.ejerciciosU12.alumnosCiclosBD;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class GestionAlumnosCiclos {
	
	//Ruta del fichero de configuracion BD.
	private static final  String RUTA_CONFIG_BD="ficheros/sql/properties/conexionBD.properties";
	//Ruta del fichero properties el cual nos proporciona la ruta del fichero a tratar.
	private static final String RUTA_FICHERO_ALUM="ficheros/sql/sqlEjercicios/ejerAlumnosCiclos/configuracionListadoAlumnos.properties";
	
	static Properties configuracion= new Properties();
	
	//Array list en el cual vamos a almacenar los alumnos que vamos a leer del fichero.
	private static List<Alumno> listaAlumnos = new ArrayList<Alumno>();
	//Mapa en el cual vamos a insertar los distintos ciclos que existan en el fichero.
	private static Map<Integer, Ciclo> mapaCiclos = new HashMap<Integer, Ciclo>();
	
	public static void main(String[] args) {
		
		cargarConfiguracionBD();
		
		//URL, Usuario y Password de la BD a trabajar
		String url= configuracion.getProperty("urlBD");
		String usuario= configuracion.getProperty("user");
		String password=configuracion.getProperty("password");
		
		crearTablaAlumnos(url, usuario, password);
		crearTablaCiclos(url, usuario, password);
		
		lecturaFichero();
		
		insertarCiclosBD(url, usuario, password);
		insertarAlumnosBD(url, usuario, password);
	}

	/*
	 * Metodo en el cual vamos a cargar la configuracion (Properties) de la BD.
	 */
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
	
	/*
	 * Metodo en el cual creamos la tabla Alumnos en la cual posteriormente insetaremos los distintos
	 * alumnos de nuestro fichero de alumnos y ciclos.
	 */
	private static void crearTablaAlumnos(String url, String usuario, String password) {
		try (Connection conex= DriverManager.getConnection(url, usuario, password)){
			String sqlSentence="CREATE TABLE alumnos(ID int PRIMARY KEY, nombre VARCHAR(255),"
					+ "apellidos VARCHAR(255), cicloformativo int(2));";
			PreparedStatement sentencia=conex.prepareStatement(sqlSentence);
			sentencia.executeUpdate();
			System.out.println("Tabla Alumnos Creada.");
			
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	/*
	 * Metodo en el cual creamos la tabla Ciclos en la cual posteriormente insetaremos los distintos
	 * ciclos de nuestro fichero de alumnos y ciclos.
	 */
	private static void crearTablaCiclos(String url, String usuario, String password) {
		try (Connection conex= DriverManager.getConnection(url, usuario, password)){
			String sqlSentence="CREATE TABLE ciclos(ID int PRIMARY KEY, nombre VARCHAR(255),"
					+ "codigo VARCHAR(255));";
			PreparedStatement sentencia=conex.prepareStatement(sqlSentence);
			sentencia.executeUpdate();
			System.out.println("Tabla Ciclos Creada.");
			
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	/*
	 * Metodo en el vamos a leer y tratar los diferentes elementos del fichero.
	 */
	private static void lecturaFichero() {
		try {
			Properties propiedades= new Properties();
			FileInputStream fis= new FileInputStream(RUTA_FICHERO_ALUM);
			propiedades.load(fis);
			String directorio=propiedades.getProperty("directorio");
			String nombreFichero=propiedades.getProperty("fichero");
			
			File fichero=new File(directorio+File.separator+nombreFichero);
			FileReader fr= new FileReader(fichero);
			BufferedReader br= new BufferedReader(fr);
			
			int numeroLinea=0;
			String linea= br.readLine();
			
			while(linea!=null) {
				if(numeroLinea>0) {
					tratarLinea(linea,numeroLinea);
				}
				linea=br.readLine();
				numeroLinea++;
			}
			br.close();
			fr.close();
			System.out.println("Alumnos y ciclos tratados.");
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	/*
	 * Metodo en el cual tratamos la linea actual que estamos tratando.
	 * id lo usaremos como numero de linea el cual sera el id del alumno.
	 */
	private static void tratarLinea(String linea, int id) {
		String [] datos=linea.split("\\|");
		int ciclo=0;
		ciclo=obtenerCicloFormativo(datos[2]);
		almacenarAlumno(id,datos[0],ciclo);
		almacenarCiclo(ciclo,datos[1],datos[2]);
	}

	/*
	 * Almacenaremos en un mapa el ciclo el cual estamos tratando, si el numero de ciclo ya
	 * existe en el mapa no sera insertado.
	 */
	private static void almacenarCiclo(int numCiclo, String nombreCiclo, String codigoCiclo) {
		Ciclo ciclo= new Ciclo(numCiclo, nombreCiclo, codigoCiclo);
		if(!mapaCiclos.containsKey(numCiclo)) {
			mapaCiclos.put(numCiclo, ciclo);
		}
		
	}

	/*
	 * Almacenamos en el ArrayList el alumno que estamos tratando.
	 */
	private static void almacenarAlumno(int id, String nombreApellidos, int ciclo) {
		String[] datosAlumnos = nombreApellidos.split(", ");
		Alumno alumno = new Alumno(id, datosAlumnos[1].trim(), datosAlumnos[0], ciclo);
		listaAlumnos.add(alumno);
	}

	/*
	 * Metodo para convertir el codigo de ciclo en el numero de ciclo.
	 */
	private static int obtenerCicloFormativo(String codigoCiclo) {
		int codigo = 0;
		if (CodigoCiclo.DAM.getCodigoCiclo().equals(codigoCiclo)) {
			codigo = 1;
		}
		if (CodigoCiclo.DAW.getCodigoCiclo().equals(codigoCiclo)) {
			codigo = 2;
		}
		if (CodigoCiclo.ASIR.getCodigoCiclo().equals(codigoCiclo)) {
			codigo = 3;
		}
		return codigo;
	}
	
	/*
	 * Metodo en el cual ejecutaremos un INSERT por cada uno de los alumnos que tenemos en nuestro ArrayList.
	 */
	private static void insertarAlumnosBD(String url, String usuario, String password) {
		try (Connection conex= DriverManager.getConnection(url, usuario, password)){
			int cont=0;
			String sqlSentence="INSERT INTO alumnos (id,nombre,apellidos,cicloformativo) VALUES(?,?,?,?)";
			PreparedStatement sentencia= conex.prepareStatement(sqlSentence);
			Iterator it=listaAlumnos.iterator();
			while(it.hasNext()) {
				Alumno alumno=(Alumno)it.next();
				sentencia.setInt(1, alumno.getId());
				sentencia.setString(2, alumno.getNombre());
				sentencia.setString(3, alumno.getApellidos());
				sentencia.setInt(4, alumno.getCiclo());
				sentencia.executeUpdate();
				cont++;
			}
			System.out.println("Alumnos insertados: "+cont);
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	/*
	 * Metodo en el cual ejecutaremos un INSERT por cada uno de los ciclos que tenemos
	 * almacenados en nuestro mapa de ciclos.
	 */
	private static void insertarCiclosBD(String url, String usuario, String password) {
		try (Connection conex= DriverManager.getConnection(url, usuario, password)){
			int cont=0;
			String sqlSentence="INSERT INTO ciclos(id,nombre,codigo) VALUES(?,?,?)";
			PreparedStatement sentencia= conex.prepareStatement(sqlSentence);
			for (int ciclo : mapaCiclos.keySet()) {
				sentencia.setInt(1, mapaCiclos.get(ciclo).getId());
				sentencia.setString(2, mapaCiclos.get(ciclo).getNombre());
				sentencia.setString(3, mapaCiclos.get(ciclo).getCodigo());
				sentencia.executeUpdate();
				cont++;
			}
			System.out.println("Ciclos insertados: "+cont);
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
