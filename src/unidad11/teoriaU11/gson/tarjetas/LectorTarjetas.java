package unidad11.teoriaU11.gson.tarjetas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class LectorTarjetas {

	public static void main(String[] args) {
		
		Gson gson= new Gson();
		try {
			FileReader lector= new FileReader("ficheros/json/tarjetas.json");
			Tarjetas tarjetas= gson.fromJson(lector, Tarjetas.class);
			lector.close();
			for(TarjetaCredito tarjeta:tarjetas.getTarjetas()) {
				System.out.println("___________________________________");
				System.out.println("Tipo:"+tarjeta.getTipo_de_tarjeta());
				System.out.println("Numero:"+tarjeta.getNumero_de_tarjeta());
				System.out.println("Cuenta:"+tarjeta.getNumero_de_cuenta_asociada());
				System.out.println("Titular:"+tarjeta.getTitular());
				System.out.println("Fecha Caducidad:"+tarjeta.getFecha_caducidad());
				System.out.println("___________________________________");
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
