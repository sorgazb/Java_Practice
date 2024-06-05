package unidad11.tareas.tarea2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestionVentas {
	
	private static Map<String,List<Integer>> mapaVentas;
	private static List<Integer> listaVentas;
	
	public static void main(String[] args) {
		mapaVentas= new HashMap<String, List<Integer>>();
		leerFichero();
		mostrarMapa();
	}
	
	public static void leerFichero() {
		String rutaFichero="ficheros/ventas.csv";
		
		File fichero= new File(rutaFichero);
		
		try (BufferedReader entrada= new BufferedReader(new FileReader(fichero))){
			String cadena;
			cadena= entrada.readLine();
			int numeroLinea = 0;
			while(cadena!=null) {
				if(numeroLinea>0) {
					String [] linea= cadena.split(",");
					Cliente cliente = crearVenta(linea);
					if(existeCliente(cliente)==true){
						listaVentas.add(cliente.getCantidadVendida());
					}
					else {
						
						listaVentas.add(cliente.getCantidadVendida());
						mapaVentas.put(cliente.getNif(), listaVentas);
					}
				}
				cadena=entrada.readLine();
				numeroLinea++;
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void mostrarMapa() {
		for (String marca : mapaVentas.keySet()) {
			System.out.println("Marca: " + marca);
		}
	}
	
	private static Cliente crearVenta(String [] linea) {
		String cif=linea[0];
		int cantidadVentida=Integer.parseInt(linea[4]);
		listaVentas= new ArrayList<Integer>();
		return new Cliente(cif, cantidadVentida);
	}
	
	private static boolean existeCliente(Cliente cliente) {
		boolean existe=false;
		for (String clienteMapa : mapaVentas.keySet()) {
			if(cliente.getNif()==clienteMapa) {
				existe=true;
			}
		}
		return existe;
	}

}
