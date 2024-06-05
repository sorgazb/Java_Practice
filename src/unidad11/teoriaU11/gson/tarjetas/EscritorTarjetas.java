package unidad11.teoriaU11.gson.tarjetas;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscritorTarjetas {

	public static void main(String[] args) {
		//Para no hace los list.add:
		List<TarjetaCredito> listaTarjetas= Arrays.asList(
				new TarjetaCredito("Visa", "134254234242", "313131313", "Juan Perez", "12/26"),
				new TarjetaCredito("Masterdcard", "23123131", "56454654", "Ana Gómez", "06/24"),
				new TarjetaCredito("Visa", "2131231342342", "34234242", "Rubén García", "01/28"));
		
		Tarjetas contenedor= new Tarjetas();
		contenedor.setTarjetas(listaTarjetas);
		
		Gson gson= new GsonBuilder().setPrettyPrinting().create();
		try {
			FileWriter escritor= new FileWriter("ficheros/json/tarjetasEscritura.json");
			gson.toJson(contenedor,escritor);
			escritor.close();
			System.out.println("Escritura completada");
		}catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
