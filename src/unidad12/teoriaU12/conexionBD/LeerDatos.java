package unidad12.teoriaU12.conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LeerDatos {

	public static void main(String[] args) {
		
		String urlBD="jdbc:mysql://localhost:3306/empresa";
		String usuario="root";
		String password="admin.1234";
		
		String ciudad="Madrid";//hemos leido este dato por teclado, fichero, ... 
		
		try (Connection con=DriverManager.getConnection(urlBD,usuario,password)){
			
			Statement sentencia=con.createStatement();
			ResultSet resultado= sentencia.executeQuery("SELECT * FROM personas WHERE ciudad='"+ciudad+"'"+"OR 1=1");
			while(resultado.next()) {                                                  //con el OR 1=1 sql inyección el where
				System.out.println(resultado.getString("nombre"));                     //siempre es verdadero y te da toda la info
			}                                                                          //error de seguridad.

			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
