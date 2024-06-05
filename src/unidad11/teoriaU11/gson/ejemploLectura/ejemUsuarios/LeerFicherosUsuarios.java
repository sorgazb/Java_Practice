package unidad11.teoriaU11.gson.ejemploLectura.ejemUsuarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

import unidad11.teoriaU11.gson.ejemploLectura.ejemUsuario.Usuario;

public class LeerFicherosUsuarios {

	public static void main(String[] args) {
		try {
			String ruta="ficheros/json/usuarios.json";
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
			Usuario [] usuarios= gson.fromJson(contenido.toString(), Usuario[].class);
			//Mostramos el Array:
			for(Usuario usuario:usuarios) {
				System.out.println(usuario);
				System.out.println("________________");
			}
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
