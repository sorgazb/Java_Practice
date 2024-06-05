package unidad11.teoriaU11.tarjetasBancarias;

import java.time.LocalDate;

//POJO - DTO - TO - VO
public class Tarjeta {
	
	private String numero;
	private String tipo;
	private String cuenta;
	private LocalDate caducidad;


	public Tarjeta(String numero, String tipo, String cuenta, LocalDate caducidad) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.cuenta = cuenta;
		this.caducidad = caducidad;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getCuenta() {
		return cuenta;
	}


	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}


	public LocalDate getCaducidad() {
		return caducidad;
	}


	public void setCaducidad(LocalDate caducidad) {
		this.caducidad = caducidad;
	}


	@Override
	public String toString() {
		return "Tarjeta [numero=" + numero + ", tipo=" + tipo + ", cuenta=" + cuenta + ", caducidad=" + caducidad + "]";
	}
	
	
	

}
