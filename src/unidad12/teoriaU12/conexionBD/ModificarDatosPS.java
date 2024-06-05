package unidad12.teoriaU12.conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ModificarDatosPS {

	public static void main(String[] args) {
		String urlBD = "jdbc:mysql://192.168.0.101:3306/OrgazBravo";
		//String urlBD = "jdbc:mysql://localhost:3306/OrgazBravo";//Casa
		String usuario = "OrgazBravo";
		String password = "Orga";

		
		try (Connection con = DriverManager.getConnection(urlBD, usuario, password)) {
			String sql="UPDATE personas SET ciudad=? WHERE id=?";
			PreparedStatement sentencia=con.prepareStatement(sql);
			
			sentencia.setString(1, "Valdelacasa del Tajo");
			sentencia.setInt(2, 11);
			
			int filasAfectadas=sentencia.executeUpdate();
			System.out.println("Filas afectadas:"+filasAfectadas);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}