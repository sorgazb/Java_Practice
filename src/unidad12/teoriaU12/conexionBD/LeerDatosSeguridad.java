package unidad12.teoriaU12.conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LeerDatosSeguridad {

	public static void main(String[] args) {
		
		String urlBD="jdbc:mysql://localhost:3306/empresa";
		String usuario="root";
		String password="admin.1234";
		
		String ciudad="Madrid";//hemos leido este dato por teclado, fichero, ... 
		
		try (Connection con=DriverManager.getConnection(urlBD,usuario,password)){
			

			String sql= "SELECT * FROM personas WHERE ciudad=? AND id>=?";//mayor seguridad.
			PreparedStatement sentencia=con.prepareStatement(sql);
			
			sentencia.setString(1, "Sevilla");//1 hace referencia al primer interrogante de la sentencia SQL.
			sentencia.setInt(2, 2);
			
			ResultSet resultado=sentencia.executeQuery();
			
			while(resultado.next()) {                                                  
				System.out.println(resultado.getString("nombre"));                  
			}                                                                          

			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
