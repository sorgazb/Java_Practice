package unidad8.teoriaU8.herencia1;

public class Moto extends Vehiculo{
	
	private boolean limitacion;
	private String tipo;

	public Moto(String matricula, String n_Bastidor, String marca, String modelo, Motor motor,boolean limitacion, String tipo) {
		super(matricula, n_Bastidor, marca, modelo, motor);
		this.limitacion=limitacion;
		this.tipo=tipo;
	}

	public boolean isLimitacion() {
		return limitacion;
	}

	public void setLimitacion(boolean limitacion) {
		this.limitacion = limitacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void mostrarDatos() {
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Potencia: "+motor.getCc());
		System.out.println("Tipo: "+tipo);
	}

}
