package tareasFinales.formularioTenistas;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Properties;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import unidad12.ConfiguracionBD;
import unidad13.ejerciciosU13.premierLeague.Equipo;


public class BaseDatosTenistas {
	
	static Properties configuracion= new Properties();
	static String [] cabecera;
	
	public static void mostrarTabla() {
		String titulo="Tenistas";
		cabecera=new String [] {"Nombre","Apellido","Retirado", "Sexo", "Reves", "Superficie"};
		String [][] datosTabla=recuperarListadoTenistas();
		new TablaTenistas(datosTabla,cabecera,titulo).setVisible(true);
	}
	
	public static void cargarConfiguracionBD() {
		FileInputStream fis;
		try {
			fis=new FileInputStream(ConfiguracionBD.ficheroConfiguracioBD);
			configuracion.load(fis);
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static void crearTabla() {
		String url= configuracion.getProperty("urlCasa");
		String usuario= configuracion.getProperty("user");
		String password=configuracion.getProperty("password");
		try (Connection conex= DriverManager.getConnection(url, usuario, password)){
			String sqlSentence="CREATE TABLE IF NOT EXISTS tenistas"
					+ "(nombre VARCHAR(100) PRIMARY KEY, apellidos VARCHAR(100),"
					+ "retirado BOOLEAN, sexo VARCHAR(100), reves VARCHAR(100),superficie VARCHAR(100));";
			PreparedStatement sentencia=conex.prepareStatement(sqlSentence);
			sentencia.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static void insertarTenista(Tenista tenista) {
		String url= configuracion.getProperty("urlCasa");
		String usuario= configuracion.getProperty("user");
		String password=configuracion.getProperty("password");
		try (Connection conex= DriverManager.getConnection(url, usuario, password)){
			String sqlSentence="INSERT INTO tenistas (nombre,apellidos,retirado,sexo,"
					+ "reves,superficie) VALUES(?,?,?,?,?,?)";
			PreparedStatement sentencia= conex.prepareStatement(sqlSentence);
				sentencia.setString(1, tenista.getNombre());
				sentencia.setString(2, tenista.getApellido());
				sentencia.setBoolean(3, tenista.isRetirado());
				sentencia.setString(4, tenista.getSexo());
				sentencia.setString(5, tenista.getReves());
				sentencia.setString(6, tenista.getSuperficie());
				sentencia.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static String[][] recuperarListadoTenistas() {
		//URL, Usuario y Password de la BD a trabajar
		String url= configuracion.getProperty("urlCasa");
		String usuario= configuracion.getProperty("user");
		String password=configuracion.getProperty("password");
		
		String [][] datos=null;
		
		try {
			RowSetFactory rowSetFactory= RowSetProvider.newFactory();
			
			JdbcRowSet rowSet= rowSetFactory.createJdbcRowSet();
			
			rowSet.setUrl(url);
			rowSet.setUsername(usuario);
			rowSet.setPassword(password);
			
			rowSet.setCommand("SELECT * FROM tenistas");
			rowSet.execute();
			
			//Obtener numero de filas que nos devuelve la sentencia:
			int numFilas=0;
			if(rowSet.last()) {
				numFilas=rowSet.getRow();
				rowSet.beforeFirst();//Regresa el cursor a la primera posicion.
			}
			
			datos= new String [numFilas][cabecera.length];
			
			int contadorFilas=0;
			while(rowSet.next()) {
				String [] tenista= new String [cabecera.length];
				tenista[0]= rowSet.getString("nombre");
				tenista[1]= rowSet.getString("apellidos");
				tenista[2]= String.valueOf(rowSet.getBoolean("retirado"));
				tenista[3]= rowSet.getString("sexo");
				tenista[4]= rowSet.getString("reves");
				tenista[5]= rowSet.getString("superficie");
				
				datos[contadorFilas]=tenista;
				contadorFilas++;
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return datos;

	}

}
