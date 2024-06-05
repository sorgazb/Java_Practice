package unidad12.teoriaU12.ferreteria;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import unidad12.ConfiguracionBD;

public class Main {
	
	static Properties configuracion= new Properties();
	static String url;
	static String usuario;
	static String password;

	public static void main(String[] args) {
		
		cargarConfiguracionBD();
		
		List<String> listaProductos= new ArrayList<String>();
		
		try {
			listaProductos = Files.readAllLines(Paths.get("ficheros//sql//sqlEjercicios//ferreteria//productos.csv")
					,StandardCharsets.UTF_8);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		int cont=0;
		for(String lineaProducto:listaProductos) {
			if(cont>0) {
				String [] datos=lineaProducto.split(",");
				//Antes de insertar es donde hariamos una validacion si algo esta mal
				Producto producto= new Producto(datos[0], datos[1], datos[2], Double.parseDouble(datos[3]));
				System.out.println(producto);
				insertarProductoBD(producto);
			}
			cont++;
		}
		
		tratarProductos();
		
	}

	private static void insertarProductoBD(Producto producto) {		
		ProductosDAO productoDAO=new ProductosDAO(url, usuario, password);
		productoDAO.insertProducto(producto);
	}
	
	private static void tratarProductos() {		
		ProductosDAO productoDAO=new ProductosDAO(url, usuario, password);
		
		//List<Producto> lista=productoDAO.listarTodosLosProductos();
		//JTable
		//insertar .dat
		//insertar. json
		//BDDOO
		
		//Producto productoEliminar= new Producto();
		//productoDAO.eliminarProducto(productoEliminar);
		
		Producto productoModificar= new Producto("C2JKQAQJ","Taladro","Taladro muy potente",120);
		productoDAO.actualizarProducto(productoModificar);
		
		Producto productoBuscado=productoDAO.obtenerProducto("C2JKQAQJ");
		System.out.println(productoBuscado);
	}
	
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
