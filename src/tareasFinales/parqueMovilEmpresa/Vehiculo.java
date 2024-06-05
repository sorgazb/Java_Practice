package tareasFinales.parqueMovilEmpresa;

import java.time.LocalDate;
import java.util.Date;

public class Vehiculo {
	private String matricula;
	private LocalDate fechaMatriculacion;
	private String marca;
	private String modelo;
	private int kilometraje;
	
	public Vehiculo(String matricula, LocalDate fechaMatriculacion, String marca, String modelo, int kilometraje) {
		this.matricula = matricula;
		this.fechaMatriculacion = fechaMatriculacion;
		this.marca = marca;
		this.modelo = modelo;
		this.kilometraje = kilometraje;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public LocalDate getFechaMatriculacion() {
		return fechaMatriculacion;
	}

	public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", fechaMatriculacion=" + fechaMatriculacion + ", marca=" + marca
				+ ", modelo=" + modelo + ", kilometraje=" + kilometraje + "]";
	}
	
	
	
}
