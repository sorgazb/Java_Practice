package unidad11.teoriaU11.tarjetasBancarias;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LeerDatosFicheroTarjetas {

	private static Map<String,List<String>> tarjetasPorTipo;
	private static final String directorio = "/home/profesor/LUIS/FICHEROS/TARJETAS";
	
	public static void main(String[] args) {
		
		tarjetasPorTipo  = new HashMap<String, List<String>>();
		
		leerInfoTarjetaCSV("ficheros/cuentasTarjetasBancos.csv");
		
		mostrarTiposTarjetas();
		
		crearCarpetasTiposTarjetas();
		
		
	}

	private static void crearCarpetasTiposTarjetas() {
		
		
		Iterator<String> it = tarjetasPorTipo.keySet().iterator();
		String clave;
		while(it.hasNext()) {
			
			clave = (String)it.next();
			File carpeta = new File(directorio+"/"+clave);
			if(carpeta.exists()) {
				System.out.println("Carpeta ya existe");
			}else {
				if(carpeta.mkdirs()) {
					System.out.printf("Carpeta %s creado con éxito%n",clave);
				}
			}
		}
		
		
	}

	private static void mostrarTiposTarjetas() {
		
		for(Map.Entry<String,List<String>> tarjetas: tarjetasPorTipo.entrySet()) {
			
			String clave = tarjetas.getKey();
			List<String> valores = tarjetas.getValue();
			
			System.out.println("Clave:"+clave+"_________________________");
			for(String elemento: valores) {
				System.out.println("-"+elemento);
			}
		}
		
	}

	private static void leerInfoTarjetaCSV(String fichero) {
		
		 BufferedReader br=null;
		try {
			 br = new BufferedReader(new FileReader(fichero));
			
			 String linea = br.readLine();
			 int numeroLinea = 0;
			 while(linea!=null) {
				 if(numeroLinea>0) {
					 String[] campos = linea.split(",");
					 Tarjeta tarjeta  = crearTarjeta(campos);
					 guardarTarjetaPorTipo(tarjeta);
				 }
				 
				 linea = br.readLine();
				 numeroLinea++;
			 }
			 
			
					 
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	private static void guardarTarjetaPorTipo(Tarjeta tarjeta) {
		
		String tipo = tarjeta.getTipo();
		String numeroTarjeta = tarjeta.getNumero();
		
		
		
		List<String> tarjetas  = tarjetasPorTipo.get(tipo);
		
		if(tarjetas == null) {
			tarjetas = new ArrayList<String>();
			tarjetasPorTipo.put(tipo, tarjetas);
		}
		
		tarjetas.add(numeroTarjeta);
		
	}

	private static Tarjeta crearTarjeta(String[] campos) {
		
		String numeroTarjeta = campos[0];
		String tipo = campos[1];
		String numeroCuenta = campos[2];
		LocalDate fechaCaducidad = obtenerFechaCaducidad(campos[3]);
		
		
		return new Tarjeta(numeroTarjeta, tipo, numeroCuenta, fechaCaducidad);
	}

	private static LocalDate obtenerFechaCaducidad(String fecha) {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaFormateada = LocalDate.parse(fecha,formato);
		
		return fechaFormateada;
	}

}





