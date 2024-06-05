package unidad8.teoriaU8.herencia1;

//Clase Coche que hereda de la clase Vehiculo:
public class Coche extends Vehiculo {
	
	//Atributos de la clase Coche:
	private int num_Puertas;
	private int num_Plazas;
	private double capacidad_Maletero;
	private String tipo_Coche;
	
	//Constructor por defecto de la clase Coche:
	public Coche(String matricula, String n_Bastidor, String marca, String modelo, Motor motor) {
		//Constructo de la clase Vehículo:
		super(matricula, n_Bastidor, marca, modelo, motor);
	}
	
	//Constructor parametrizado de la clase Coche:
	public Coche(String matricula, String n_Bastidor, String marca, String modelo, Motor motor, 
			     int num_Puertas, int num_Plazas, double capacidad_Maletero, String tipo_Coche) {
		//Constructo de la clase Vehículo:
		super(matricula, n_Bastidor, marca, modelo, motor);
		this.num_Puertas=num_Puertas;
		this.num_Plazas=num_Plazas;
		this.capacidad_Maletero=capacidad_Maletero;
		this.tipo_Coche=tipo_Coche;
	}

	//Métodos Getters & Setters de la clase Coche:
	public int getNum_Puertas() {
		return num_Puertas;
	}

	public void setNum_Puertas(int num_Puertas) {
		this.num_Puertas = num_Puertas;
	}

	public int getNum_Plazas() {
		return num_Plazas;
	}

	public void setNum_Plazas(int num_Plazas) {
		this.num_Plazas = num_Plazas;
	}

	public double getCapacidad_Maletero() {
		return capacidad_Maletero;
	}

	public void setCapacidad_Maletero(double capacidad_Maletero) {
		this.capacidad_Maletero = capacidad_Maletero;
	}

	public String getTipo_Coche() {
		return tipo_Coche;
	}

	public void setTipo_Coche(String tipo_Coche) {
		this.tipo_Coche = tipo_Coche;
	}
	
	//Métodos de la clase Coche:
	
	public void mostrarDatos() {
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Motor: "+motor.getTipo());
		System.out.println("Plazas: "+num_Plazas);
	}

	
}
