package unidad11.teoriaU11.directorios;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreacionDirectoriosFicheros {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Ingrese la ruta del directorio a crear: ");
		String nombreDirectorio= entrada.nextLine();
		
		//No crea el directorio.
		File directorio= new File(nombreDirectorio);
		
		if(directorio.exists()) {
			System.out.println("El directorio ya existe");
		}else {
			System.out.println("El directorio no existe. Vamos a crearlo.");
			//mdkdir Crea toda la estructura necesaria.
			if(directorio.mkdir()) {
				System.out.println("Directorio creado.");
			}else {
				System.err.println("ERROR.Directorio no creado.");
			}
		}
		
		System.out.println("Ingrese la ruta y el nombre del fichero a crear: ");
		String nombreFichero= entrada.nextLine();
		
		File fichero= new File(nombreFichero);
		
		if(fichero.exists()) {
			System.out.println("El fichero ya existe");
		}else {
			try {
				if(fichero.createNewFile()) {
					System.out.printf("Fichero %s creado con éxito.",nombreFichero);
				}else {
					System.err.println("ERROR. No se ha creado el dichero.");
				}
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}

		}
		
		entrada.close();
	}

}
