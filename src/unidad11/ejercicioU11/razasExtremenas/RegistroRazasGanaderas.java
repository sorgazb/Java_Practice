package unidad11.ejercicioU11.razasExtremenas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class RegistroRazasGanaderas {

	static List<Registro> registros;
	static Map<String, Map> mapaZonas= new HashMap<String, Map>();
	
	public static void main(String[] args) {
		//Estructura para almacenar el contenido de un fichero Json en una lista (LIST):
		String rutaFichero="ficheros/json/razasComarcasExtremadura.json";
		File fichero=new File(rutaFichero);
		try (BufferedReader lector= new BufferedReader(new FileReader(fichero))){
			StringBuilder contenido= new StringBuilder();
			String linea;
			while((linea=lector.readLine())!=null) {
				contenido.append(linea);
			}
			
			Gson gson= new Gson();
			//Te pasa el contenido a una lista:(NO ARRAYLIST)
			Type listaTipo= new TypeToken<List<Registro>>(){}.getType();
			registros=gson.fromJson(contenido.toString(), listaTipo);
			
			System.out.println("Contenido del fichero Json almacenado en la lista.");
			
			/*for(Registro registro:registros) {
				System.out.println(registro);
			}*/
			
			registrarZonas();
			registrarRazasZona();
			sumarCantidadesRazasZona();
			mostrarDatos();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void mostrarDatos() {
		for(String zonaNombre:mapaZonas.keySet()) {
			Map<String, Integer> zona=mapaZonas.get(zonaNombre);
			System.out.println("Zona: "+zonaNombre.toUpperCase());
			for(String nombreRaza:zona.keySet()) {
				int cantidad=zona.get(nombreRaza);
				System.out.println("Raza: " +nombreRaza.toUpperCase()+" -Cantidad: "+cantidad);
			}
			System.out.println("________________________________________________________");
		}
	}

	private static void registrarZonas() {
		for(Registro registro:registros) {
			mapaZonas.put(registro.getZonas(),new HashMap<String, Integer>());
		}
	}

	private static void registrarRazasZona() {
		for(Registro registro:registros) {
			Map<String,Integer> zona= mapaZonas.get(registro.getZonas());
			zona.put(registro.getRaza_ganado(),0);
		}
	}

	private static void sumarCantidadesRazasZona() {
		for(Registro registro:registros) {
			Map<String,Integer> zona= mapaZonas.get(registro.getZonas());
			int cantidad=registro.getNumero();
			int valorActualCantidad=zona.get(registro.getRaza_ganado());
			zona.put(registro.getRaza_ganado(), valorActualCantidad+cantidad);
		}
	}
}
