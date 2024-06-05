package unidad12.teoriaU12.conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ObtenerConexion {

	public static void main(String[] args) {
		
		String urlBD="jdbc:mysql://localhost:3306/empresa";
		String usuario="root";
		String password="admin.1234";
		
		try (Connection con=DriverManager.getConnection(urlBD,usuario,password)){
			System.out.println(con);
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
