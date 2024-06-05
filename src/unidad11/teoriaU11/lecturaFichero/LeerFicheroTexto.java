package unidad11.teoriaU11.lecturaFichero;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroTexto {

	public static void main(String[] args) {
		
		//Esquema básico para lectura de ficheros con FileReader:
		
		String rutaFichero="mancomunidades_extremadura.txt";
		
		File fichero= new File(rutaFichero);
		FileReader lector= null;
		
		try {
			lector= new FileReader(fichero);
			int caracter;
			while((caracter=lector.read())!=-1) {
				System.out.print((char)caracter);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
