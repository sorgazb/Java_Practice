package pruebas.evaluacion2.prueba1.ejercicio2;

public class Avion extends Aereos{

	private double tiempoMaximoVuelo;
	
	public Avion(String matricula, String modelo, int numAsientos, double tiempoMaximoVuelo) {
		super(matricula, modelo, numAsientos);
		this.tiempoMaximoVuelo=tiempoMaximoVuelo;
	}

	public double getTiempoMaximoVuelo() {
		return tiempoMaximoVuelo;
	}

	public void setTiempoMaximoVuelo(double tiempoMaximoVuelo) {
		this.tiempoMaximoVuelo = tiempoMaximoVuelo;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Tipo Avion Tiempo Máximo Vuelo: "+tiempoMaximoVuelo;
	}

}
