package ejerciciosEjemplo.practicaNBA;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import unidad12.ConfiguracionBD;

public class Main {
	
	static Properties configuracion= new Properties();
	static String url;
	static String usuario;
	static String password;
	
	public static void main(String[] args) {
		cargarConfiguracionBD();
		LecturaNBA lectura= new LecturaNBA();
		lectura.leerFichero();
		
		JugadorDAO jugadorDAO= new JugadorDAO(url, usuario, password);
		jugadorDAO.crearTabla();
		for(String jugador:lectura.mapaJugadores.keySet()) {
			for(Jugador jugadorNBA:lectura.mapaJugadores.get(jugador)) {
				jugadorDAO.insertarJugador(jugadorNBA);
			}
		}
	}
	
	public static void cargarConfiguracionBD() {
		FileInputStream fis;
		try {
			fis=new FileInputStream(ConfiguracionBD.ficheroConfiguracioBD);
			configuracion.load(fis);
			url= configuracion.getProperty("urlCasa");
			usuario= configuracion.getProperty("user");
			password=configuracion.getProperty("password");
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
