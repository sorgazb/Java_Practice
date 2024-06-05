package unidad11.teoriaU11.gson.ejemploEscritura.ejemEscriUsuarios;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscribirFicheroJsonUsuarios {

	public static void main(String[] args) {
		Usuario usuario1= new Usuario("Paco", "paco@gmail.com", 34,82828820, "Plasencia", false);
		Usuario usuario2= new Usuario("Lucía", "lucia@gmail.com", 56,4448820, "Coria", true);
		Usuario usuario3= new Usuario("Elena", "elena@gmail.com", 24,82828820, "Navalmoral de la Mata", false);

		List<Usuario> usuarios= new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		//Para dar formato:
		Gson gson= new GsonBuilder().setPrettyPrinting().create();
		//En una cadena almacenamos una lista (muy potente):
		String contenidoJson=gson.toJson(usuarios);
		
		System.out.println(contenidoJson);
		
		try {
			FileWriter escritor= new FileWriter("ficheros/json/usuariosNuevos.json");
			escritor.write(contenidoJson);
			escritor.close();
			System.out.println("Escritura completada");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
