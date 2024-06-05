package pruebas.evaluacion2.prueba1.ejercicio2;

public class Aereos extends Vehiculo{

	private int numAsientos;
	
	public Aereos(String matricula, String modelo, int numAsientos) {
		super(matricula, modelo);
		this.numAsientos=numAsientos;
		if(!matricula.matches("[A-Z]{4}-\\d{6}")) {
			matricula="Error en la matricula";
		}
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	@Override
	public String toString() {
		return super.toString()+" Tipo Aereos Numero Asientos=" + numAsientos;
	}
	
	
	
	

}
