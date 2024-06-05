 package unidad11.ejercicioU11.donantes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SumaTipoDonantes {
	
	//Constantes tipo sangre:
	public static final String AB_NEG="AB-";
	public static final String AB_POS="AB+";
	public static final String A_NEG="A-";
	public static final String A_POS="A+";
	public static final String B_NEG="B-";
	public static final String B_POS="B+";
	public static final String O_NEG="O-";
	public static final String O_POS="O+";
	

	public static void main(String[] args) {
		
		 int valorInicial=0;
		
		String rutaFichero="ficheros//donantes.txt";
		File fichero= new File(rutaFichero);
		
		Map<String, Integer> mapaDonantes= new HashMap<String, Integer>();
		
		mapaDonantes.put(AB_NEG, mapaDonantes.getOrDefault(AB_NEG, valorInicial));
		mapaDonantes.put(AB_POS, mapaDonantes.getOrDefault(AB_POS, valorInicial));
		mapaDonantes.put(A_NEG, mapaDonantes.getOrDefault(A_NEG, valorInicial));
		mapaDonantes.put(A_POS, mapaDonantes.getOrDefault(A_POS, valorInicial));
		mapaDonantes.put(B_NEG, mapaDonantes.getOrDefault(B_NEG, valorInicial));
		mapaDonantes.put(B_POS, mapaDonantes.getOrDefault(B_POS, valorInicial));
		mapaDonantes.put(O_NEG, mapaDonantes.getOrDefault(O_NEG, valorInicial));
		mapaDonantes.put(O_POS, mapaDonantes.getOrDefault(O_POS, valorInicial));
		
		try (BufferedReader entrada= new BufferedReader(new FileReader(fichero))){
			
			String cadena;
			cadena= entrada.readLine();
			
			while(cadena!=null) {
				String linea[]=cadena.split(", ");
				mapaDonantes.put(linea[2],mapaDonantes.get(linea[2])+1);
				cadena=entrada.readLine();
			}
			
			System.out.println("Fichero leido correctamente.");
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		String nombreFichero="ficheros//ficheroDonantes.txt";
		
		try (BufferedWriter escritor= new BufferedWriter(new FileWriter(nombreFichero))){
			for (String tipoSangre : mapaDonantes.keySet()) {
				escritor.write("Tipo Sangre: " + tipoSangre+ " -Cantidad:" + mapaDonantes.get(tipoSangre));
				escritor.newLine();
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
