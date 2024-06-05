package pruebas.evaluacion2.prueba1.ejercicio2;

public abstract class Vehiculo {
	
	private String matricula;
	protected String modelo;
	
	public Vehiculo(String matricula, String modelo) {
		this.matricula = matricula;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}


	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Vehiculo: Matricula=" + matricula + ", Modelo=" + modelo;
	}
	
	
	
	
}
