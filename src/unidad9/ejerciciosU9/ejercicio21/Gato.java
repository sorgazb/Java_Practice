package unidad9.ejerciciosU9.ejercicio21;

import java.time.LocalDate;

public class Gato extends Mascotas{
	
	public String color;
	public boolean peloLargo;

	public Gato(String nombre, int edad, LocalDate fechaNacimiento, String color, boolean peloLargo) {
		super(nombre, edad, fechaNacimiento);
		this.color=color;
		this.peloLargo=peloLargo;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPeloLargo() {
		return peloLargo;
	}

	public void setPeloLargo(boolean peloLargo) {
		this.peloLargo = peloLargo;
	}

	@Override
	public void habla() {
		System.out.println("Soy un gato MIAU MIAU...");
	}
	
	@Override
	public String toString() {
		return super.toString()+"Color: "+color+" Pelo Largo: "+peloLargo;
	}
	
	@Override
	public void mostrar() {
		System.out.println("-Tipo: Gato -Nombre: "+nombre);
	}

}
