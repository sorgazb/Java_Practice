package unidad11.teoriaU11.listadoAlumnos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;



public class ListadoAlumnos {

	private static List<Alumno> listaAlumnos= new ArrayList<Alumno>();
	
	public static void main(String[] args) {
		try {
			Properties propiedades= new Properties();
			FileInputStream fis= new FileInputStream("ficheros/configuracionListadoAlumnos.properties");
			propiedades.load(fis);
			String directorio=propiedades.getProperty("directorio");
			String nombreFichero=propiedades.getProperty("fichero");
			
			File fichero= new File(directorio+File.separator+nombreFichero);
			FileReader fr= new FileReader(fichero);
			BufferedReader br= new BufferedReader(fr);
			
			int numeroLinea=0;
			String linea = br.readLine();
			while(linea!=null) {
				if(numeroLinea>0) {
					tratarLineaDatosAlumnado(linea, numeroLinea);
				}
				linea=br.readLine();
				numeroLinea++;
			}
			br.close();
			fr.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		mostrarDatos();
		
		try{
			PrintWriter escritor= new PrintWriter("insertar.txt");			
			Iterator it=listaAlumnos.iterator();
			while(it.hasNext()) {
				Alumno alumno=(Alumno)it.next();
				escritor.println("INSERT INTO (ID,nombre,apellidos,cicloformativo) VALUES("+alumno.getId()+","+alumno.getNombre()+","+alumno.getApellidos()+","+alumno.getCiclo()+");");
			}
			
			escritor.close();

		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	
	private static void mostrarDatos() {
		Iterator ite=listaAlumnos.iterator();
		while(ite.hasNext()) {
			Alumno alumno=(Alumno)ite.next();
			System.out.println(alumno);
		}
	}

	private static void tratarLineaDatosAlumnado(String linea, int id) {
		String [] datos=linea.split("\\|");
		int ciclo= 0;
		ciclo=obtenerCicloFormativo(datos[2]);
		crearNuevoAlumno(id,datos[0], datos[1], ciclo);
	}


	private static void crearNuevoAlumno(int id,String nombreApellido, String nombreCiclo, int ciclo) {
		String [] datosAlumnos=nombreApellido.split(", ");
		Alumno alumno= new Alumno(id, datosAlumnos[1].trim(), datosAlumnos[0], ciclo);
		listaAlumnos.add(alumno);
	}


	private static int obtenerCicloFormativo(String codigoCiclo) {
		int codigo=0;
		if(CicloFormativo.DAM.getCodigo().equals(codigoCiclo)) {
			codigo=1;
		}
		if(CicloFormativo.DAW.getCodigo().equals(codigoCiclo)) {
			codigo=2;
		}
		if(CicloFormativo.ASIR.getCodigo().equals(codigoCiclo)) {
			codigo=3;
		}
		return codigo;
	}

}
