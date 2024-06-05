package pruebas.evaluacion2.prueba1.ejercicio2;

public class Barco extends Acuaticos{

	private boolean motor;
	
	public Barco(String matricula, String modelo, double eslora, boolean motor) {
		super(matricula, modelo, eslora);
		this.motor=motor;
	}

	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Tipo Barco ¿Tiene motor?: "+motor;
	}

}
