package unidad8.teoriaU8.herencia1;

public class Motor {
	//Atributos de la clase Motor:
	private String tipo; //candidato a enum;
	private double cc; // centimetros cúbicos
	private double potencia;
	
	//Constructor de la clase Motor:
	public Motor(String tipo, double cc, double potencia) {
		this.tipo = tipo;
		this.cc = cc;
		this.potencia = potencia;
	}
	
	//Métodos Getters & Setters de la clase Motor:
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getCc() {
		return cc;
	}
	public void setCc(double cc) {
		this.cc = cc;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	

	
	
	
}
