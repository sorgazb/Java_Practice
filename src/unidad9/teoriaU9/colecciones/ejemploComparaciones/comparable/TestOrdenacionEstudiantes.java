package unidad9.teoriaU9.colecciones.ejemploComparaciones.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestOrdenacionEstudiantes {

	public static void main(String[] args) {
		
		Estudiante e1= new Estudiante("Juan", 21, 20);
		Estudiante e2= new Estudiante("Messi", 38, 1);
		Estudiante e3= new Estudiante("Patricia", 19, 155);
		
		List <Estudiante> listaEstudiantes= new ArrayList<Estudiante>();
		listaEstudiantes.add(e1);
		listaEstudiantes.add(e2);
		listaEstudiantes.add(e3);
		
		mostrar(listaEstudiantes);
		Collections.sort(listaEstudiantes);
		System.out.println("---LISTA ESTUDIANTES ORDENADOS POR MATRICULA---");
		mostrar(listaEstudiantes);

	}
	
	private static void mostrar(List <Estudiante> listaEstudiantes) {
		for(Estudiante estudiantes: listaEstudiantes) {
			System.out.println(estudiantes);
		}
	}

}
