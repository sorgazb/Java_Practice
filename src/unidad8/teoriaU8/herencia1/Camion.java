package unidad8.teoriaU8.herencia1;

public class Camion extends Vehiculo{
	
	private double tara;
	private double longitud;
	
	
	public Camion(String matricula, String n_Bastidor, String marca, String modelo, Motor motor, double tara,double longitud) {
		super(matricula, n_Bastidor, marca, modelo, motor);
		this.tara = tara;
		this.longitud = longitud;
	}


	public double getTara() {
		return tara;
	}


	public void setTara(double tara) {
		this.tara = tara;
	}


	public double getLongitud() {
		return longitud;
	}


	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	public void mostrarDatosCamion() {
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Potencia: "+motor.getCc());
		System.out.println("Tara: "+tara);
		System.out.println("Longitud: "+longitud);
	}
	
	
	

}
