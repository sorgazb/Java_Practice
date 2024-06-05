package unidad9.ejerciciosU9.ejercicio21;

import java.time.LocalDate;

public class Loro extends Aves{

	public String origen;
	public boolean habla;
	
	public Loro(String nombre, int edad, LocalDate fechaNacimiento, Picos pico, boolean vuela, String origen, boolean habla) {
		super(nombre, edad, fechaNacimiento, pico, vuela);
		this.origen=origen;
		this.habla=habla;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public boolean isHabla() {
		return habla;
	}

	public void setHabla(boolean habla) {
		this.habla = habla;
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
		return super.toString()+" Origen: "+origen+" Habla: "+habla;
	}
	
	public void saluda() {
		System.out.println("Hola amigo soy un Loro.");
	}
	
	@Override
	public void habla() {
	}

	@Override
	public void mostrar() {
		System.out.println("-Tipo: Loro -Nombre: "+nombre);
	}


}
