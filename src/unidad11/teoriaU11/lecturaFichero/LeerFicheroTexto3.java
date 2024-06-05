package unidad11.teoriaU11.lecturaFichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroTexto3 {

	public static void main(String[] args) {
		
		/*
		 * Esquema básico lectura de ficheros con BufferReader 
		 * versión 2 con apertura en try:
		 */
		
		String rutaFichero="mancomunidades_extremadura.txt";
		
		File fichero= new File(rutaFichero);
		
		try (BufferedReader entrada= new BufferedReader(new FileReader(fichero))){
			
			String cadena;
			
			cadena= entrada.readLine();
			while(cadena!=null) {
				System.out.println(cadena);
				cadena=entrada.readLine();
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
