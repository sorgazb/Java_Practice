package unidad9.ejerciciosU9.ejercicio21;

import java.time.LocalDate;

public abstract class Aves extends Mascotas{
	
	protected Picos pico;
	protected boolean vuela;

	public Aves(String nombre, int edad, LocalDate fechaNacimiento, Picos pico, boolean vuela) {
		super(nombre, edad, fechaNacimiento);
		this.pico=pico;
		this.vuela=vuela;
	}

	public Picos getPico() {
		return pico;
	}

	public void setPico(Picos pico) {
		this.pico = pico;
	}

	public boolean isVuela() {
		return vuela;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}
		
	public abstract void volar();

}
