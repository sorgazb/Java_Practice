package unidad6.tareasU6.tarea1;

import java.security.SecureRandom;

public class Profesor {

	public void ponerNota(Alumno alumno) {
		SecureRandom random= new SecureRandom();
		
		alumno.getAsignatura1().setCalificacion(random.nextDouble(10));
		alumno.getAsignatura2().setCalificacion(random.nextDouble(10));
		alumno.getAsignatura3().setCalificacion(random.nextDouble(10));
	}
	
	public double calcularMedia(Alumno alumno) {
		double media=0;
		media=(alumno.getAsignatura1().getCalificacion()+alumno.getAsignatura2().getCalificacion()+alumno.getAsignatura3().getCalificacion());
		media=media/3;
		return media;
		
	}
}
