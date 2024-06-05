package ejerciciosEjemplo.practicaExamen;


	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.Properties;

	import com.google.gson.Gson;
	import com.google.gson.GsonBuilder;


	public class LecturaJugadores {
		public static final String RUTA_LECTURA="ficheros/ejerciciosExamen/ejercicioJugadores/configuracionJugadores.properties";
		public static final String RUTA_ESCRITURA="ficheros/ejerciciosExamen/ejercicioJugadores";
		public static Map<String, List<Jugador>> mapaLigas;
		
		
		
		public LecturaJugadores() {
			mapaLigas=new HashMap<String, List<Jugador>>();
		}

		public void leerFichero() {
			try {
				Properties propiedades= new Properties();
				FileInputStream fis=new FileInputStream(RUTA_LECTURA);
				propiedades.load(fis);
				String directorio=propiedades.getProperty("directorio");
				String nombreFichero=propiedades.getProperty("fichero");
				
				File fichero= new File(directorio+File.separator+nombreFichero);
				FileReader fr= new FileReader(fichero);
				BufferedReader br= new BufferedReader(fr);
				
				String linea=br.readLine();
				while(linea!=null) {
					if(linea!=null) {
						String [] campos= linea.split(",");
						Jugador jugador=crearJugador(campos);
						guardarJugadorPorLiga(jugador);
					}
					linea=br.readLine();
				}
				br.close();
				fr.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public Jugador crearJugador(String [] campos) {
			Jugador jugador= new Jugador(campos[0], campos[1], campos[2], campos[3], Integer.parseInt(campos[4]), campos[5]);
			return jugador;
		}
		
		public void guardarJugadorPorLiga(Jugador jugador) {
			List<Jugador> listaJugadores=new ArrayList<Jugador>();
			String liga=jugador.getLiga();
			if(mapaLigas.containsKey(liga)) {
				mapaLigas.get(liga).add(jugador);
			}else {
				listaJugadores.add(jugador);
				mapaLigas.put(liga, listaJugadores);
			}
		}
		
		public void mostrarTodo() {
			for(String liga: mapaLigas.keySet()) {
				System.out.println("Liga:"+liga);
				for (Jugador jugador : mapaLigas.get(liga)) {
					System.out.println(jugador);
				}
			}
		}
		
		public void crearCarpetasLigas() {
			for (String liga: mapaLigas.keySet()) {
				File directorio= new File(RUTA_ESCRITURA+"/"+liga);
				if(directorio.exists()) {
					System.err.println("ERROR.El directorio ya existe");
				}else {
					directorio.mkdir();
					crearFicheroEquipos();
				}
			}
		}
		
		public void crearFicheroEquipos() {
			for (String liga: mapaLigas.keySet()) {
				for (Jugador jugador : mapaLigas.get(liga)) {
					String equipo=jugador.getEquipo();
					File fichero= new File(RUTA_ESCRITURA+"/"+liga+"/"+equipo+".json");
					if(fichero.exists()) {
					}else {
						try {
							if(fichero.createNewFile()) {
								System.out.printf("Fichero %s creado con éxito.",equipo+".json");
							}else {
								System.err.println("ERROR. No se ha creado el dichero.");
							}
						}catch (IOException e) {
							System.out.println(e.getMessage());
						}

					}
				}
			}
		}
		
		public void volcarFicherosJson() {
			for (String liga: mapaLigas.keySet()) {
				List<Jugador> equipo1= new ArrayList<Jugador>();
				List<Jugador> equipo2= new ArrayList<Jugador>();
				for (Jugador jugador : mapaLigas.get(liga)) {
					if(equipo1.isEmpty()) {
						equipo1.add(jugador);
					}else {
						if(!equipo1.get(0).getEquipo().equals(jugador.getEquipo())){
							equipo2.add(jugador);
						}else {
							equipo1.add(jugador);
						}
					}
				}
				escribirJson(equipo1);
				escribirJson(equipo2);
			}
		}

		private void escribirJson(List<Jugador> equipo) {
			Gson gson= new GsonBuilder().setPrettyPrinting().create();
			String contenidoJson=gson.toJson(equipo);
			try {
				FileWriter escritor= new FileWriter(RUTA_ESCRITURA+"/"+equipo.get(0).getLiga()+"/"+equipo.get(0).getEquipo()+".json");
				escritor.write(contenidoJson);
				escritor.close();
				System.out.println("Escritura completada");
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}


