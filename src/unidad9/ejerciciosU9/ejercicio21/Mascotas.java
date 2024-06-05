package unidad9.ejerciciosU9.ejercicio21;

import java.time.LocalDate;

public abstract class Mascotas {
	
	protected String nombre;
	protected int edad;
	protected Estado estado;
	protected LocalDate fechaNacimiento;
	
	
	public Mascotas(String nombre, int edad, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.edad = edad;
		this.estado = Estado.VIVO;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Mascotas [nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
	
	public void morir() {
		setEstado(Estado.MUERTO);
	}
	
	public abstract void habla();
	
	public abstract void mostrar();
	
	
}
