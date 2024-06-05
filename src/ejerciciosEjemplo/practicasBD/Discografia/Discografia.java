package ejerciciosEjemplo.practicasBD.Discografia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;


public class Discografia {
	
	static List<Artistas> listaArtistas= new ArrayList<Artistas>();
	
	public static void leerFichero() {
		try {
			String ruta="ficheros/ejerciciosExamen/ejercicioMusica/Cantantes.json";
			File fichero=new File(ruta);
			BufferedReader lector= new BufferedReader(new FileReader(fichero));
			
			StringBuilder contenido= new StringBuilder();
			String linea;
			//Leemos linea a linea el fichero y lo almacenamos en un StringBuilder:
			while((linea=lector.readLine())!=null) {
				contenido.append(linea);
			}
			lector.close();
			
			//Convertir el contenido Json a un Objeto de tipo Usuario:
			Gson gson= new Gson();
			//Array de Objeto Usuario
			Artistas [] arrayArtistas= gson.fromJson(contenido.toString(), Artistas[].class);
			//Mostramos el Array:
			for(Artistas artista: arrayArtistas) {
				listaArtistas.add(artista);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
