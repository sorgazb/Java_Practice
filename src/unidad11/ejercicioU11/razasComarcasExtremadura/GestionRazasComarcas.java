package unidad11.ejercicioU11.razasComarcasExtremadura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class GestionRazasComarcas {
	public static void main(String[] args) {
		Map<String, Integer> mapaRazas= new HashMap<String, Integer>();
		try {
			File fichero= new File("ficheros/json/razasComarcasExtremadura.json");
			BufferedReader lector= new BufferedReader(new FileReader(fichero));
			
			StringBuilder contenido= new StringBuilder();
			String linea;
			while((linea=lector.readLine())!=null) {
				contenido.append(linea);
			}
			lector.close();
			Gson gson= new Gson();
			Raza [] razas= gson.fromJson(contenido.toString(), Raza [].class);
			for(Raza raza:razas) {
				mapaRazas.put(raza.getRaza_ganado(),mapaRazas.getOrDefault(raza.getNumero(),0)+raza.getNumero());
			}
			for (String tipo : mapaRazas.keySet()) {
				System.out.println("Tipo: " + tipo + " -Cantidad:" + mapaRazas.get(tipo));
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
