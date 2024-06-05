package unidad11.teoriaU11.directorios;

import java.io.File;

public class FicheroODirectorio {

	public static void main(String[] args) {
		File fichero= new File("/home/diurno/SergioProg/Directorio/fichero.txt");
		
		if(fichero.isDirectory()) {
			System.out.println("Es un directorio.");
		}else {
			System.out.println("Es un fichero.");
		}
	}

}
