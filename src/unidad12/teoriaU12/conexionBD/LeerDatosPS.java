package unidad12.teoriaU12.conexionBD;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class LeerDatosPS {
	
	static Properties configuracion=new Properties();

	public static void main(String[] args) {
		
		cargarConfiguracion();
		
		String url=configuracion.getProperty("urlBD");
		String usuario=configuracion.getProperty("user");
		String password=configuracion.getProperty("password");
		
		try (Connection con = DriverManager.getConnection(url, usuario, password)) {
			String sql="INSERT INTO personas(nombre,apellido,ciudad)"
					+"VALUES(?,?,?)";
			PreparedStatement sentencia=con.prepareStatement(sql);
			
			sentencia.setString(1, "Fouad");
			sentencia.setString(2, "Allay");
			sentencia.setString(3, "Losar");
			
			int filasAfectadas=sentencia.executeUpdate();
			System.out.println("Filas insertadas:"+filasAfectadas);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void cargarConfiguracion() {
		FileInputStream fis;
		try {
			fis=new FileInputStream("ficheros/sql/properties/conexionBD.properties");
			configuracion.load(fis);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
