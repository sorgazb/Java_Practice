package unidad6.tareasU6.tarea1;

public class Asignatura {
	
	private int identificador;
	private double calificacion;
	
	public Asignatura(int identificador) {
		this.identificador=identificador;
	}

	public double getCalificacion() {
		return calificacion;
	}
	
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
	public int getIdentificador() {
		return identificador;
	}

}
