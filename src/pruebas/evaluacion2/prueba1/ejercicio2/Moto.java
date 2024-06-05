package pruebas.evaluacion2.prueba1.ejercicio2;

public class Moto extends Terrestre{
	
	private String color;

	public Moto(String matricula, String modelo, int numRuedas, String color) {
		super(matricula, modelo, numRuedas);
		this.color=color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Moto Color: "+color;
	}

}
