package unidad6.tareasU6.tarea1;

import java.text.DecimalFormat;

public class Actividad1 {

	public static void main(String[] args) {
		DecimalFormat formato= new DecimalFormat("0.00");
		
		Asignatura asig1=new Asignatura(1);
		Asignatura asig2=new Asignatura(2);
		Asignatura asig3=new Asignatura(3);
		
		Alumno alumno= new Alumno(asig1, asig2, asig3);
		
		Profesor profesor= new Profesor();
		
		profesor.ponerNota(alumno);
		
		double notaMedia=profesor.calcularMedia(alumno);
		
		System.out.println("La nota media del alumno es: "+formato.format(notaMedia));
	}

}
