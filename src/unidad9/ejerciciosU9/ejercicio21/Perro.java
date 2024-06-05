package unidad9.ejerciciosU9.ejercicio21;

import java.time.LocalDate;

public class Perro extends Mascotas{
	
	public Razas raza;
	public boolean pulgas;

	public Perro(String nombre, int edad, LocalDate fechaNacimiento, Razas raza, boolean pulgas) {
		super(nombre, edad, fechaNacimiento);
		this.raza=raza;
		this.pulgas=pulgas;
	}

	public Razas getRaza() {
		return raza;
	}

	public void setRaza(Razas raza) {
		this.raza = raza;
	}

	public boolean isPulgas() {
		return pulgas;
	}

	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}

	@Override
	public void habla() {
		System.out.println("Soy un perro GUAU GUAU...");
	}
	
	@Override
	public String toString() {
		return super.toString()+"Raza: "+raza+" Pulgas: "+pulgas;
	}
	
	@Override
	public void mostrar() {
		System.out.println("-Tipo: Perro -Nombre: "+nombre);
	}

}
