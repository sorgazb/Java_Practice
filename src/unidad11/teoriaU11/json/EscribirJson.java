package unidad11.teoriaU11.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class EscribirJson {

	public static void main(String[] args) {
		JSONParser parser= new JSONParser();
		try {
			FileReader lector=new FileReader("ficheros/json/Menu.json");
			Object objeto=parser.parse(lector);
			JSONObject jsonObject=(JSONObject)objeto;
			JSONArray array=(JSONArray)jsonObject.get("PlatoFuerte");
			
			//Crear un objeto Json:
			JSONObject nuevoPlato= new JSONObject();
			nuevoPlato.put("nombre", "Arroz caldoso");
			nuevoPlato.put("precio", "12");
			nuevoPlato.put("duracion", "30 minutos");
			nuevoPlato.put("tamaño", "Mediano");
			
			array.add(nuevoPlato);
			
			//Escribir en el fichero el nuevo objeto:
			try (FileWriter escritor= new FileWriter("ficheros/json/MenuModificado.json")){
				escritor.write(jsonObject.toJSONString());
				escritor.flush();
				System.out.println("Objeto JSON modificado.");
			}catch (IOException e) {
				e.printStackTrace();
			}

		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
