package ejerciciosEjemplo.practicaNBA;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.google.gson.Gson;


public class LecturaNBA {
	private static final String RUTA_LECTURA="ficheros/ejerciciosExamen/ejercicioNBA/jugadoresNBA.properties";
	public static Map<String, List<Jugador>> mapaJugadores;
	public static Set<Equipo> setEquipos;
	
	public LecturaNBA() {
		mapaJugadores= new HashMap<String, List<Jugador>>();
		setEquipos= new HashSet<Equipo>();
	}
	
	public void leerFichero() {
		Gson gson= new Gson();
		try {
			Properties propiedades= new Properties();
			FileInputStream fis=new FileInputStream(RUTA_LECTURA);
			propiedades.load(fis);
			String directorio=propiedades.getProperty("directorio");
			String nombreFichero=propiedades.getProperty("fichero");
			
			File fichero= new File(directorio+File.separator+nombreFichero);
			
			FileReader lector= new FileReader(fichero);
			
			Jugadores jugadores= gson.fromJson(lector, Jugadores.class);
			lector.close();
			for(Jugador jugador:jugadores.getJugadores()) {
				guardarJugadorPorEquipo(jugador);
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void guardarJugadorPorEquipo(Jugador jugador) {
		List<Jugador> listaJugadores= new ArrayList<Jugador>();
		String equipoJugador=jugador.getEquipo();
		if(mapaJugadores.containsKey(equipoJugador)) {
			mapaJugadores.get(equipoJugador).add(jugador);
		}else {
			Equipo equipo= new Equipo(jugador.getEquipo(), jugador.getConferencia());
			setEquipos.add(equipo);
			listaJugadores.add(jugador);
			mapaJugadores.put(equipoJugador, listaJugadores);
		}
	}
	
}
