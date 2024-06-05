package ejerciciosEjemplo.practicaNBA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import pruebas.evaluacion3.prueba2.CertificadoEnergetico;

public class JugadorDAO {
	
	private String url;
	private String usuario;
	private String password;
	private Connection jdbcConnection;
	
	public JugadorDAO(String url, String usuario, String password) {
		this.url = url;
		this.usuario = usuario;
		this.password = password;
	}
	
	
	public boolean insertarJugador(Jugador jugador) {
		boolean filaInsertada=false;
		
		String sentenciaSQL="INSERT INTO JugadoresBaloncesto(nombre,posicion,nacionalidad,anillos,equipo,conferencia) "
				+ "VALUES (?,?,?,?,?,?)";

		conectar();
		try {
			PreparedStatement sentenciaPreparada=jdbcConnection.prepareStatement(sentenciaSQL);
			sentenciaPreparada.setString(1, jugador.getNombre());
			sentenciaPreparada.setString(2, jugador.getPosicion());
			sentenciaPreparada.setString(3, jugador.getNacionalidad());
			sentenciaPreparada.setInt(4, jugador.getAnillos());
			sentenciaPreparada.setString(5, jugador.getEquipo());
			sentenciaPreparada.setString(6, jugador.getConferencia());
			
			filaInsertada=sentenciaPreparada.executeUpdate() > 0;
			
			sentenciaPreparada.close();
			
			System.out.println("Jugador Insertado.");
		
		}catch (SQLIntegrityConstraintViolationException e) {
			System.err.println("ERROR. Ese Jugador ya existe.");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		desconectar();
		
		return filaInsertada;
	}
	
	public void crearTabla() {
		conectar();
		try {
			String sqlSentence="CREATE TABLE IF NOT EXISTS JugadoresBaloncesto(nom VARCHAR(10) PRIMARY KEY,"
					+ "posicion VARCHAR(255), nacionalidad VARCHAR(255),anillos INT,"
					+ "equipo VARCHAR(255),conferencia VARCHAR(255));";
			PreparedStatement sentencia=jdbcConnection.prepareStatement(sqlSentence);
			sentencia.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		desconectar();
	}
	
	private void conectar() {
		try {
			if(jdbcConnection==null || jdbcConnection.isClosed()) {
				jdbcConnection=DriverManager.getConnection(url,usuario,password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void desconectar() {
		try {
			if(jdbcConnection!=null && !jdbcConnection.isClosed()) {
				jdbcConnection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
