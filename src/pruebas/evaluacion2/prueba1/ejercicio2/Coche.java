package pruebas.evaluacion2.prueba1.ejercicio2;

public class Coche extends Terrestre{
	
	private boolean aireAcondicionado;

	public Coche(String matricula, String modelo, int numRuedas, boolean aireAcondicionado) {
		super(matricula, modelo, numRuedas);
		this.aireAcondicionado=aireAcondicionado;
	}

	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}

	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Coche Aire Acondicionado: "+aireAcondicionado;
	}
}
