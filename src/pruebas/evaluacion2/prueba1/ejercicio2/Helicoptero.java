package pruebas.evaluacion2.prueba1.ejercicio2;

public class Helicoptero extends Aereos{

	private int numHelices;
	
	public Helicoptero(String matricula, String modelo, int numAsientos, int numHelices) {
		super(matricula, modelo, numAsientos);
		this.numHelices=numHelices;
	}

	public int getNumHelices() {
		return numHelices;
	}

	public void setNumHelices(int numHelices) {
		this.numHelices = numHelices;
	}
	
	@Override
	public String toString() {
		return super.toString()+ " Tipo Helicoptero Numero Helices: "+numHelices;
	}
	

}
