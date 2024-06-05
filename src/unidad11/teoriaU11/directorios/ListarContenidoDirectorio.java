package unidad11.teoriaU11.directorios;

import java.io.File;

public class ListarContenidoDirectorio {
	
	public static void main(String[] args) {
		File directorio= new File("/home/diurno/SergioProg/Directorio");
		
		if(!directorio.exists() || !directorio.isDirectory()) {
			System.out.println("ERROR.No existe o no es un directorio.");
		}else {
			
			//Listar el contenido usando list()
			String [] elementos=directorio.list();
			for(String elemento: elementos) {
				System.out.println(elemento);
			}
			System.out.println("__________segunda forma___________");
			//Lista el contenido usando listFiles()
			File [] elementosFiles= directorio.listFiles();
			for(File elementoFile: elementosFiles) {
				System.out.println(elementoFile.getName());
			}
		}

	}
}
