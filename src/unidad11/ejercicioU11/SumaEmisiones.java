package unidad11.ejercicioU11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumaEmisiones {

	public static void main(String[] args) {
		
		int sumaTotalEmisiones=0;
		
		String rutaFichero="emisiones.txt";
		
		File fichero= new File(rutaFichero);
		
		try (BufferedReader entrada= new BufferedReader(new FileReader(fichero))){
			
			String cadena;
			
			cadena= entrada.readLine();
			while(cadena!=null) {
				System.out.println(cadena);
				
				//Separamos la linea en partes y lo almacenamos en un array.
				String linea[]=cadena.split(",");
				//Sabemos que en la tercera casilla del array estará la emisión
				//y lo convertimos a Integer.
				int emision=Integer.parseInt(linea[2].trim());
				//Lo almacenamos en le contador total de emisiones.
				sumaTotalEmisiones=sumaTotalEmisiones+emision;
				
				cadena=entrada.readLine();
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("La suma total de emisiones es:"+sumaTotalEmisiones);
	}

}
