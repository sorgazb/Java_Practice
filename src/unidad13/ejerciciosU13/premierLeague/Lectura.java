package unidad13.ejerciciosU13.premierLeague;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.google.gson.Gson;

public class Lectura {
	
	private static final String RUTA_FICHERO_EQUIPOS="ficheros/sql/sqlEjercicios/ejerFutbol/equipos.properties";
	
	private static List<Equipo> listaEquipos= new ArrayList<Equipo>();
	
	public void leerFicheroEquiposJSON() {
		try {
			Properties propiedades= new Properties();
			FileInputStream fis= new FileInputStream(RUTA_FICHERO_EQUIPOS);
			propiedades.load(fis);
			String directorio=propiedades.getProperty("directorio");
			String nombreFichero=propiedades.getProperty("fichero");
			
			File fichero=new File(directorio+File.separator+nombreFichero);
			BufferedReader br= new BufferedReader(new FileReader(fichero));
			
			StringBuilder contenido= new StringBuilder();
			String linea;
			
			while((linea=br.readLine())!=null) {
				contenido.append(linea);
			}
			br.close();
			
			Gson gson= new Gson();
			Equipo [] equipos= gson.fromJson(contenido.toString(), Equipo[].class);
			
			for(Equipo equipo: equipos) {
				listaEquipos.add(equipo);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
