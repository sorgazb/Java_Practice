package unidad11.ejercicioU11.ejerEquiposFutbol;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class ListadoEquipos {

	private static Map<String, List<String>> listadoEquipos;
	private static final String RUTA_FICHERO="ficheros/ejerEquiposFut/configuracionEquipos.properties";
	
	public static void main(String[] args) {
		listadoEquipos= new HashMap<String, List<String>>();
		leerFicheroEquipos();
		mostrarDatos();
		organizarFicherosEquipos();
	}
	
	public static void leerFicheroEquipos() {
		try {
			Properties propiedades= new Properties();
			FileInputStream fis=new FileInputStream(RUTA_FICHERO);
			propiedades.load(fis);
			String directorio=propiedades.getProperty("directorio");
			String nombreFichero=propiedades.getProperty("fichero");
			
			File fichero= new File(directorio+File.separator+nombreFichero);
			FileReader fr= new FileReader(fichero);
			BufferedReader br= new BufferedReader(fr);
			
			String linea=br.readLine();
			while(linea!=null) {
				if(linea!=null) {
					String [] campos= linea.split(", ");
					Jugador jugador= crearJugador(campos);
					guardarJugadorPorEquipo(jugador);
				}

				linea=br.readLine();
			}
			br.close();
			fr.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static Jugador crearJugador(String [] campos) {
		String nombre=campos[1];
		String equipo=campos[0];
		Posicion posicion=obtenerPosicionJugador(campos[2]);
		return new Jugador(nombre, equipo, posicion);
		
	}
	
	private static Posicion obtenerPosicionJugador(String posicionJugador) {
		Posicion posicion=null;
		if(Posicion.PORTERO.getPosicion().equals(posicionJugador)) {
			posicion=Posicion.PORTERO;
		}if(Posicion.DEFENSA.getPosicion().equals(posicionJugador)) {
			posicion=Posicion.DEFENSA;
		}if(Posicion.CENTRO_CAMPISTA.getPosicion().equals(posicionJugador)) {
			posicion=Posicion.CENTRO_CAMPISTA;
		}if(Posicion.DELANTERO.getPosicion().equals(posicionJugador)) {
			posicion=Posicion.DELANTERO;
		}
		return posicion;
	}
	
	private static void guardarJugadorPorEquipo(Jugador jugador) {
		String equipo=jugador.getEquipo();
		String nombre=jugador.getNombre();
		
		List<String> equipos= listadoEquipos.get(equipo);
		
		if(equipos==null) {
			equipos=new ArrayList<String>();
			listadoEquipos.put(equipo, equipos);
		}
		equipos.add(nombre);		
	}
	
	private static void mostrarDatos() {
		for(Map.Entry<String, List<String>> equipos:listadoEquipos.entrySet()) {
			String clave=equipos.getKey();
			List<String> jugadores=equipos.getValue();
			System.out.println("Equipo: "+clave);
			for(String elemento:jugadores) {
				System.out.println("-"+elemento);
			}
		}
	}
	
	private static void organizarFicherosEquipos() {
		Iterator<String> iterador=listadoEquipos.keySet().iterator();
		String equipo;
		while(iterador.hasNext()) {
			equipo=(String)iterador.next();
			File capeta=new File("ficheros/ejerEquiposFut/ficherosEscritura/"+equipo);
			if(capeta.exists()) {
				System.out.println("Carpeta ya existe");
				organizarFicherosPosiciones();
			}else {
				if(capeta.mkdirs()) {
					System.out.printf("Carpeta %s creado con éxito%n",equipo);
				}
			}
		}
	}

	private static void organizarFicherosPosiciones() {
	}

}
