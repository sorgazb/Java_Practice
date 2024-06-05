package ejerciciosEjemplo.practicasBD.Biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;


public class LibroDAO {
	
	private String url;
	private String usuario;
	private String password;
	private Connection jdbcConnection;
	
	public LibroDAO(String url, String usuario, String password) {
		this.url = url;
		this.usuario = usuario;
		this.password = password;
	}
	
	public void crearTabla() {
		conectar();
		try {
			String sqlSentence="CREATE TABLE IF NOT EXISTS libros(ID int PRIMARY KEY AUTO_INCREMENT, titulo VARCHAR(255) UNIQUE,"
					+ "autor VARCHAR(255), anio_publicacion int(4), precio DOUBLE(5,2));";
			PreparedStatement sentencia=jdbcConnection.prepareStatement(sqlSentence);
			sentencia.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		desconectar();
	}
	
	public boolean insertLibro(Libro libro) {
		crearTabla();
		boolean filaInsertada=false;
		
		String sentenciaSQL="INSERT INTO libros(titulo,autor,anio_publicacion,precio)"
				+"VALUES (?,?,?,?)";
		conectar();
		try {
			PreparedStatement sentenciaPreparada=jdbcConnection.prepareStatement(sentenciaSQL);
			sentenciaPreparada.setString(1, libro.getTitulo());
			sentenciaPreparada.setString(2, libro.getAutor());
			sentenciaPreparada.setInt(3, libro.getAnioPublicacion());
			sentenciaPreparada.setDouble(4, libro.getPrecio());
			
			filaInsertada=sentenciaPreparada.executeUpdate() > 0;
			
			sentenciaPreparada.close();
			
		
		}catch (SQLIntegrityConstraintViolationException e) {
			System.err.println("ERROR. Ese libro ya existe.");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		desconectar();
		
		return filaInsertada;
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
