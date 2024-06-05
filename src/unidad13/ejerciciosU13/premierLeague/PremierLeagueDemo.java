package unidad13.ejerciciosU13.premierLeague;

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
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import com.google.gson.Gson;

import unidad12.ConfiguracionBD;

public class PremierLeagueDemo {

	private static final String RUTA_FICHERO_EQUIPOS="ficheros/sql/sqlEjercicios/ejerFutbol/equipos.properties";
	private static List<Equipo> listaEquipos= new ArrayList<Equipo>();
	static Properties configuracion= new Properties();
	
	public static void main(String[] args) {
		leerFicheroEquiposJSON();
		 
		cargarConfiguracionBD();
		
		//URL, Usuario y Password de la BD a trabajar
		String url= configuracion.getProperty("urlCasa");
		String usuario= configuracion.getProperty("user");
		String password=configuracion.getProperty("password");
		
		crearTablaEquipos(url, usuario, password);
		insertarEquiposBD(url, usuario, password);
		

	}
	
	private static void cargarConfiguracionBD() {
		FileInputStream fis;
		try {
			fis=new FileInputStream(ConfiguracionBD.ficheroConfiguracioBD);
			configuracion.load(fis);
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	private static void crearTablaEquipos(String url,String usuario, String password){
		try (Connection conex= DriverManager.getConnection(url, usuario, password)){
			String sqlSentence="CREATE TABLE equipos(nombre VARCHAR(255) PRIMARY KEY, puntos INT(3),"
					+ "partidosGanados int(3), partidosEmpatados int(3), partidosPerdidos INT(3),"
					+ "golesAFavor INT(3), golesEnContra INT(3), tarjetasAmarillas INT(3), tarjetasRojas INT(3));";
			PreparedStatement sentencia=conex.prepareStatement(sqlSentence);
			sentencia.executeUpdate();
			System.out.println("Tabla Equipos Creada.");
			
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	private static void insertarEquiposBD(String url, String usuario, String password) {
		Lectura lectura= new Lectura();
		lectura.leerFicheroEquiposJSON();
		try (Connection conex= DriverManager.getConnection(url, usuario, password)){
			int cont=0;
			String sqlSentence="INSERT INTO equipos (nombre,puntos,partidosGanados,partidosEmpatados,"
					+ "partidosPerdidos,golesAFavor,golesEnContra,tarjetasAmarillas,tarjetasRojas) VALUES(?,?,?,?,?,?,?,?,?)";
			PreparedStatement sentencia= conex.prepareStatement(sqlSentence);
			Iterator it=listaEquipos.iterator();
			while(it.hasNext()) {
				Equipo equipo=(Equipo)it.next();
				sentencia.setString(1, equipo.getNombre());
				sentencia.setInt(2, Integer.parseInt(equipo.getPuntos()));
				sentencia.setInt(3, Integer.parseInt(equipo.getPartidosGanados()));
				sentencia.setInt(4, Integer.parseInt(equipo.getPartidosEmpatados()));
				sentencia.setInt(5, Integer.parseInt(equipo.getPartidosPerdidos()));
				sentencia.setInt(6, Integer.parseInt(equipo.getGolesAFavor()));
				sentencia.setInt(7, Integer.parseInt(equipo.getGolesEnContra()));
				sentencia.setInt(8, Integer.parseInt(equipo.getTarjetasAmarillas()));
				sentencia.setInt(9, Integer.parseInt(equipo.getTarjetasRojas()));
				sentencia.executeUpdate();
				cont++;
			}
			System.out.println("Equipos insertados: "+cont);
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	private static void leerFicheroEquiposJSON() {
		try {
			Properties propiedades= new Properties();
			FileInputStream fis= new FileInputStream(RUTA_FICHERO_EQUIPOS);
			propiedades.load(fis);
			String directorio=propiedades.getProperty("directorio");
			String nombreFichero=propiedades.getProperty("fichero");
			
			File fichero=new File(directorio+File.separator+nombreFichero);
			BufferedReader br= new BufferedReader(new FileReader(fichero));
			
			StringBuilder contenido= new StringBuilder();
			String linea;
			
			while((linea=br.readLine())!=null) {
				contenido.append(linea);
			}
			br.close();
			
			Gson gson= new Gson();
			Equipo [] equipos= gson.fromJson(contenido.toString(), Equipo[].class);
			
			for(Equipo equipo: equipos) {
				listaEquipos.add(equipo);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
