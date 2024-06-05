package unidad9.tareasU9.explotacionGanadera;

import java.time.LocalDate;

public class Leche extends Animales{
	
	private int edad;
	private double litrosSemanales;

	public Leche(int id, int camada, String nombre, LocalDate fechaVacunacion, String raza, Tipo tipo, Sexo sexo, int edad, double litrosSemanales) {
		super(id, camada, nombre, fechaVacunacion, raza, tipo, sexo);
		this.edad=edad;
		this.litrosSemanales=litrosSemanales;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getLitrosSemanales() {
		return litrosSemanales;
	}

	public void setLitrosSemanales(double litrosSemanales) {
		this.litrosSemanales = litrosSemanales;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\n"+
				"-Edad: "+edad+"\n"+
				"-Litros Semanales: "+litrosSemanales;
	}

}
