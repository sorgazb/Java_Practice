package ejerciciosEjemplo.practicasBD.Biblioteca;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import unidad12.ConfiguracionBD;
import unidad12.teoriaU12.ferreteria.Producto;
import unidad12.teoriaU12.ferreteria.ProductosDAO;

public class DemoBiblioteca {
	
	static Properties configuracion= new Properties();
	static String url;
	static String usuario;
	static String password;

	public static void main(String[] args) {
		cargarConfiguracionBD();
		
		List<String> listaLibros= new ArrayList<String>();
		
		try {
			listaLibros = Files.readAllLines(Paths.get("ficheros/ejerciciosExamen/ejercicioBiblioteca/bibloteca.txt")
					,StandardCharsets.UTF_8);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		for(String lineaLibro:listaLibros) {
			String [] datos=lineaLibro.split(",");
			//Antes de insertar es donde hariamos una validacion si algo esta mal
			//Producto producto= new Producto(datos[0], datos[1], datos[2], Double.parseDouble(datos[3]));
			Libro libro= new Libro(datos[0], datos[1], Integer.parseInt(datos[2]), Double.parseDouble(datos[3]));
			insertarLibroBD(libro);
		}
		
		Libro libroNuevo= new Libro("¿Donde esta Wally?", "Martin Handford", 1999, 14.20);
		insertarLibroNuevoBD(libroNuevo);
	}
	
	private static void insertarLibroBD(Libro libro) {		
		LibroDAO libroDAO= new LibroDAO(url, usuario, password);
		libroDAO.insertLibro(libro);
	}
	
	private static void insertarLibroNuevoBD(Libro libro) {		
		LibroDAO libroDAO= new LibroDAO(url, usuario, password);
		libroDAO.insertLibro(libro);
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
