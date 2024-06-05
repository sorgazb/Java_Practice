package unidad9.ejerciciosU9.ejercicio21;

import java.time.LocalDate;

public class Canario extends Aves{
	
	public String color;
	public boolean canta;
	
	public Canario(String nombre, int edad, LocalDate fechaNacimiento, Picos pico, boolean vuela, String color, boolean canta) {
		super(nombre, edad, fechaNacimiento, pico, vuela);
		this.color=color;
		this.canta=canta;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isCanta() {
		return canta;
	}

	public void setCanta(boolean canta) {
		this.canta = canta;
	}

	@Override
	public void volar() {
		if(isVuela()) {
			setVuela(false);
		}else {
			setVuela(true);
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+" Color: "+color+" Canta: "+canta;
	}
	
	
	@Override
	public void habla() {
		System.out.println("PIO PIO soy un Canario...");
	}
	
	@Override
	public void mostrar() {
		System.out.println("-Tipo: Canario -Nombre: "+nombre);
	}
	
}
