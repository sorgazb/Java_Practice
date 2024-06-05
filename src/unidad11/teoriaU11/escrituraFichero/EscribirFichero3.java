package unidad11.teoriaU11.escrituraFichero;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscribirFichero3 {

	public static void main(String[] args) {
		
		//Permite formatear texto
		
		try{
			PrintWriter escritor= new PrintWriter("ejemplo3.txt");
			
			escritor.write("Este es un ejemplo de cómo escribir con PrintWriter");
			escritor.println();
			escritor.printf("Podemos escribir %s con formato","textos");
			escritor.println();
			escritor.printf("Podemos escribir %d con formato",6);
			
			System.out.println("Datos escritos correctamente");
			
			escritor.close();

		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
