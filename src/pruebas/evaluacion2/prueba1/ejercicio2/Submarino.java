package pruebas.evaluacion2.prueba1.ejercicio2;

public class Submarino extends Acuaticos{

	private double profundidadMaxima;
	
	public Submarino(String matricula, String modelo, double eslora,double profundidadMaxima) {
		super(matricula, modelo, eslora);
		this.profundidadMaxima=profundidadMaxima;
	}

	public double getProfundidadMaxima() {
		return profundidadMaxima;
	}

	public void setProfundidadMaxima(double profundidadMaxima) {
		this.profundidadMaxima = profundidadMaxima;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Tipo Submarino Profundiad Maxima:"+profundidadMaxima;
	}
}
