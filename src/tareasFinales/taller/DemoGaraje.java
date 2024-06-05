package tareasFinales.taller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import unidad12.ConfiguracionBD;

public class DemoGaraje {
	
	static Properties configuracion= new Properties();
	static String url;
	static String usuario;
	static String password;
	
	public static void main(String[] args) {
		cargarConfiguracionBD();
		Garaje garaje= new Garaje();
		String matricula1="WHM-1422";
		String matricula2="HVC-1030";
		Coche coche1=null;
		Coche coche2=null;
		if(garaje.validarMatricula(matricula1) && garaje.validarMatricula(matricula2)) {
			coche1= new Coche(matricula1,"Calle mia");
			coche2= new Coche(matricula2,"Calle tuya");
		}
		
		garaje.aniadirCocheGaraje(coche1);
		garaje.aniadirCocheGaraje(coche2);
		
		
		Reparacion reparacion1= new Reparacion("Ruedas Nuevas", 1);
		Reparacion reparacion2= new Reparacion("Aceite", 2);
		Reparacion reparacion3= new Reparacion("Motor", 1);
		Reparacion reparacion4= new Reparacion("Pintura", 2);
		
		coche1.aniadirReparacion(reparacion1);
		coche1.aniadirReparacion(reparacion2);
		coche2.aniadirReparacion(reparacion3);
		coche2.aniadirReparacion(reparacion4);
		
		coche1.obtenerReparacionConcreta("Ruedas");
		coche2.obtenerUltimaReparacion();
		
		ReparacionesDAO reparacionesDAO= new ReparacionesDAO(url, usuario, password);
		GarajeDAO garajeDAO= new GarajeDAO(url, usuario, password);
		
		garajeDAO.crearTabla();
		garajeDAO.insertarCocheTaller(coche1);
		garajeDAO.insertarCocheTaller(coche2);
		garajeDAO.mostrarTablaGaraje();
		
		reparacionesDAO.crearTabla();
		reparacionesDAO.insertarReparacion(coche1, reparacion1);
		reparacionesDAO.insertarReparacion(coche1, reparacion2);
		reparacionesDAO.insertarReparacion(coche2, reparacion3);
		reparacionesDAO.insertarReparacion(coche2, reparacion4);
		reparacionesDAO.mostrarTablaReparaciones();
		
		
		
	}
	
	//Lectura de un fichero propertites toda la configuaracion de conexion con la base de datos:
	public static void cargarConfiguracionBD() {
		FileInputStream fis;
		try {
			fis=new FileInputStream(ConfiguracionBD.ficheroConfiguracioBD);
			configuracion.load(fis);
			url= configuracion.getProperty("urlBD");
			usuario= configuracion.getProperty("user");
			password=configuracion.getProperty("password");
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
