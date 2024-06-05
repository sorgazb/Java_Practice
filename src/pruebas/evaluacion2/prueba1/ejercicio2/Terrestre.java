package pruebas.evaluacion2.prueba1.ejercicio2;

public class Terrestre extends Vehiculo{
	
	private int numRuedas;

	public Terrestre(String matricula, String modelo, int numRuedas) {
		super(matricula, modelo);
		this.numRuedas=numRuedas;
		if(!matricula.matches("\\d{4}-[A-Z]{3}")) {
			matricula="Error en la matricula";
		}
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	@Override
	public String toString() {
		return super.toString()+" Tipo : terrestre Numero de Ruedas=" + numRuedas;
	}
	
	
	

}
