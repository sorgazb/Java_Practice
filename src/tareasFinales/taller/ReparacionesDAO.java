package tareasFinales.taller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import pruebas.evaluacion3.pruebaFinal.TablaCitas;


public class ReparacionesDAO {
	
	private String url;
	private String usuario;
	private String password;
	private Connection jdbcConnection;
	static String [] cabecera;
	

	public ReparacionesDAO(String url, String usuario, String password) {
		super();
		this.url = url;
		this.usuario = usuario;
		this.password = password;
	}

	public void crearTabla() {
		conectar();
		try {
			String sqlSentence="CREATE TABLE IF NOT EXISTS reparaciones(ID INT PRIMARY KEY AUTO_INCREMENT, "
					+ "matricula VARCHAR(10), descripcion VARCHAR(255), kilometraje NUMBER(10,2));";
			PreparedStatement sentencia=jdbcConnection.prepareStatement(sqlSentence);
			sentencia.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		desconectar();
	}
	
	public boolean insertarReparacion(Coche coche,Reparacion reparacion) {
		boolean filaInsertada=false;
		String sentenciaSQL="INSERT INTO reparaciones(matricula,descripcion,kilometraje) "
				+ "VALUES (?,?,?)";
		conectar();
		try {
			PreparedStatement sentenciaPreparada=jdbcConnection.prepareStatement(sentenciaSQL);
			sentenciaPreparada.setString(1, coche.getMatricula());
			sentenciaPreparada.setString(2, reparacion.getDescripcionReparacion());
			sentenciaPreparada.setDouble(3, reparacion.getKilometraje());
			filaInsertada=sentenciaPreparada.executeUpdate() > 0;	
			sentenciaPreparada.close();
		}catch (SQLIntegrityConstraintViolationException e) {
			System.err.println("ERROR. Ese Coche ya existe.");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		desconectar();
		return filaInsertada;
	}
	
	//Metodo de conexion con la base de datos:
	private void conectar() {
		try {
			if(jdbcConnection==null || jdbcConnection.isClosed()) {
				jdbcConnection=DriverManager.getConnection(url,usuario,password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//Metodo de desconexion con la base de datos:
	private void desconectar() {
		try {
			if(jdbcConnection!=null && !jdbcConnection.isClosed()) {
				jdbcConnection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void mostrarTablaReparaciones() {
		String titulo="Reparaciones";
		cabecera=new String [] {"ID","matricula","descripcion", "kilometraje"};
		String [][] datosTabla=recuperarListadoReparaciones();
		new TablaReparaciones(datosTabla,cabecera,titulo).setVisible(true);
	}
	
	//Recuperamos toda la informacion de las citas para mostrarlo en una tabla por interfaz gráfica.
	public String[][] recuperarListadoReparaciones() {
		conectar();
		
		String [][] datos=null;
		
		try {
			RowSetFactory rowSetFactory= RowSetProvider.newFactory();
			
			JdbcRowSet rowSet= rowSetFactory.createJdbcRowSet();
			
			rowSet.setUrl(url);
			rowSet.setUsername(usuario);
			rowSet.setPassword(password);
			
			rowSet.setCommand("SELECT * FROM reparaciones");
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
				String [] citas= new String [cabecera.length];
				citas[0]= String.valueOf(rowSet.getInt("ID"));
				citas[1]= rowSet.getString("matricula");
				citas[2]= rowSet.getString("descripcion");
				citas[3]= String.valueOf(rowSet.getDouble("kilometraje"));
				
				datos[contadorFilas]=citas;
				contadorFilas++;
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		desconectar();
		
		return datos;

	}
}
