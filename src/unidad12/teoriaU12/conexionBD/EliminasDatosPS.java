package unidad12.teoriaU12.conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class EliminasDatosPS {

	public static void main(String[] args) {
		String urlBD = "jdbc:mysql://192.168.0.101:3306/OrgazBravo";
		//String urlBD = "jdbc:mysql://localhost:3306/OrgazBravo"; //Casa
		String usuario = "OrgazBravo";
		String password = "Orga";

		
		try (Connection con = DriverManager.getConnection(urlBD, usuario, password)) {
			String sql="DELETE FROM personas WHERE id=?";
			PreparedStatement sentencia=con.prepareStatement(sql);
			
			sentencia.setInt(1, 4);
			
			int filasAfectadas=sentencia.executeUpdate();
			System.out.println("Filas afectadas:"+filasAfectadas);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}