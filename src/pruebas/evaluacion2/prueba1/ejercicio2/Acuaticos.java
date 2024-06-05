package pruebas.evaluacion2.prueba1.ejercicio2;

public class Acuaticos extends Vehiculo{

	private double eslora;
	
	public Acuaticos(String matricula, String modelo, double eslora) {
		super(matricula, modelo);
		this.eslora=eslora;
	}

	public double getEslora() {
		return eslora;
	}

	public void setEslora(double eslora) {
		this.eslora = eslora;
	}

	@Override
	public String toString() {
		return super.toString()+" Tipo: Acuaticos Eslora=" + eslora;
	}
	
	

}
