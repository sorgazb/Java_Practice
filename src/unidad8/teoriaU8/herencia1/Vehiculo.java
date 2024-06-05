package unidad8.teoriaU8.herencia1;

public class Vehiculo {
	//Atributos de la clase Vehículos:
	protected String matricula;
	protected String n_Bastidor;
	protected String marca;
	protected String modelo;
	protected Motor motor;
	
	//Constructor de la clase Vehículo:
	public Vehiculo(String matricula, String n_Bastidor, String marca, String modelo, Motor motor) {
		this.matricula = matricula;
		this.n_Bastidor = n_Bastidor;
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
	}

	//Métodos Getters & Setters de la clase Vehiculo:
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getN_Bastidor() {
		return n_Bastidor;
	}

	public void setN_Bastidor(String n_Bastidor) {
		this.n_Bastidor = n_Bastidor;
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

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	
}
