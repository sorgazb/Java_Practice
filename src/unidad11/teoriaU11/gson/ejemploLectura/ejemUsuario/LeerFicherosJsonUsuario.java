package unidad11.teoriaU11.gson.ejemploLectura.ejemUsuario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class LeerFicherosJsonUsuario {
	
	public static void main(String[] args) {
		try {
			String ruta="ficheros/json/usuario.json";
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
			Usuario usuario= gson.fromJson(contenido.toString(), Usuario.class);
			
			System.out.println(usuario);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
