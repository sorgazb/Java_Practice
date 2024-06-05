package unidad12.teoriaU12.salidaentrada;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import unidad12.ConfiguracionBD;

public class CrearTabla {
	
	static Properties configuracion= new Properties();
	static String [] cabecera;
	public static void main(String[] args) {
		cabecera=new String[] {"ID","Nombre","Apellido","Ciudad"};
		String  [][]datos=recuperarListadoPersonas();
		String titulo="Personas";
		new Tabla(datos,cabecera,titulo).setVisible(true);
	}
	
	public static String[][] recuperarListadoPersonas() {
		cargarConfiguracionBD();
		
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
			
			rowSet.setCommand("SELECT * FROM personas");
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
				String [] persona= new String [cabecera.length];
				persona[0]= String.valueOf(rowSet.getInt("id"));
				persona[1]= rowSet.getString("nombre");
				persona[2]= rowSet.getString("apellido");
				persona[3]= rowSet.getString("ciudad");
				
				datos[contadorFilas]=persona;
				contadorFilas++;
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return datos;

	}
	
	private static void cargarConfiguracionBD() {
		FileInputStream fis;
		try {
			fis=new FileInputStream(ConfiguracionBD.ficheroConfiguracioBD);
			configuracion.load(fis);
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
