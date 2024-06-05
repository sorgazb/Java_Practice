package unidad11.teoriaU11.escrituraFichero;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

	public static void main(String[] args) {
		
		File fichero= new File("ejemplo.txt");
		
		String nombreFichero="ejemplo.txt";
		
		int caracter=97;
		char caracter2='B';
		String cadena="Este es un ejemplo de uso de FileWriter";
		
		FileWriter escritor= null;
		
		/*
		 * escritor.flush();
		 * con esta función grabamos si o si
		 * en el fichero sin necesidad de 
		 * cerrar el fichero con
		 * escritor.close(); en el finally.
		 */
		
		try {
			
			escritor= new FileWriter(fichero);
			
			escritor.write(caracter);
			escritor.write("\n");
			escritor.write(caracter2);
			escritor.write("\n");
			escritor.write(cadena);
			
			System.out.println("Datos escritos con éxito en el fichero");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				escritor.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
