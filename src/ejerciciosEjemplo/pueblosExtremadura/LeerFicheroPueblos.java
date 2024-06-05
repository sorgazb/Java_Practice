package ejerciciosEjemplo.pueblosExtremadura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.JsonParser;

public class LeerFicheroPueblos {
	
	public static final String RUTA_FICHERO_LECTURA="ficheros/ficherosPracticar/pueblosExtremadura/configuracionPueblos.properties";
	
	public static Map<String, List<Pueblo>> mapaPueblos;
	
	public static void main(String[] args) {
		mapaPueblos=new HashMap<String, List<Pueblo>>();
		leerFichero();
		organizarPueblosProvinicias();
		escribirJson();
	}
	
	public static void leerFichero() {
		try {
			Properties propediades= new Properties();
			FileInputStream fis= new FileInputStream(RUTA_FICHERO_LECTURA);
			propediades.load(fis);
			String directorio=propediades.getProperty("directorio");
			String nombreFichero=propediades.getProperty("fichero");
			
			File fichero= new File(directorio+File.separator+nombreFichero);
			FileReader fr= new FileReader(fichero);
			BufferedReader br= new BufferedReader(fr);
			
			String linea=br.readLine();
			while(linea!=null) {
				tratarLinea(linea);
				linea=br.readLine();
			}
			br.close();
			fr.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void escribirJson() {
		JSONParser parser= new JSONParser();
		try {
			FileReader lector=new FileReader("ficheros/json/Menu.json");
			Object objeto=parser.parse(lector);
			JSONObject jsonObject=(JSONObject)objeto;
			JSONArray array=(JSONArray)jsonObject.get("PlatoFuerte");
			
			JSONObject nuevoPueblo=new JSONObject();
			nuevoPueblo.putAll(mapaPueblos);
			try (FileWriter escritor= new FileWriter("ficheros/json/MenuModificado.json")){
				escritor.write(jsonObject.toJSONString());
				escritor.flush();
				System.out.println("Objeto JSON modificado.");
			}catch (IOException e) {
				e.printStackTrace();
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static void tratarLinea(String linea) {
		String [] datosPueblo=linea.split(";");
		Pueblo pueblo= new Pueblo(datosPueblo[0],Integer.parseInt(datosPueblo[1]) ,Integer.parseInt(datosPueblo[2]), datosPueblo[3], datosPueblo[4]);
		guardarPuebloProvincia(pueblo);
	}
	
	private static void guardarPuebloProvincia(Pueblo pueblo) {
		String provincia=pueblo.getProvincia();
		
		List<Pueblo> pueblosProvin=mapaPueblos.get(provincia);
		
		if(pueblosProvin==null) {
			pueblosProvin= new ArrayList<Pueblo>();
			mapaPueblos.put(provincia, pueblosProvin);
		}
		pueblosProvin.add(pueblo);
	}
	
	private static void organizarPueblosProvinicias() {
		Iterator<String> iterador=mapaPueblos.keySet().iterator();
		String provincia;
		while(iterador.hasNext()) {
			provincia=(String)iterador.next();
			File capeta=new File("ficheros/ficherosPracticar/pueblosExtremadura/"+provincia);
			if(capeta.exists()) {
				System.out.println("Carpeta ya existe");
			}else {
				if(capeta.mkdirs()) {
					System.out.printf("Carpeta %s creado con éxito%n",provincia);
				}
			}
		}
	}

}
