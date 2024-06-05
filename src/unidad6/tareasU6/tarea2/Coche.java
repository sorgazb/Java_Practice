package unidad6.tareasU6.tarea2;

public class Coche {
	private Motor motor;
	private String marca;
	private String modelo;
	private double precio_total_averias;
	
	public Coche(String marca, String modelo, int cv) {
		this.marca = marca;
		this.modelo = modelo;
		this.motor= new Motor(cv);
	}

	public Motor getMotor() {
		return motor;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public double getPrecio_total_averias() {
		return precio_total_averias;
	}
	
	public void acumularAveria(double averia) {
		this.precio_total_averias=precio_total_averias+averia;
	}
	
	public void mostrarDatosCoche() {
		System.out.println("----Información coche:----");
		System.out.println("-Marca: "+marca);
		System.out.println("-Modelo: "+modelo);
		System.out.println("-Precio Averias:"+precio_total_averias);
		motor.mostrarDatosMotor();
		System.out.println("--------------------------");
	}
	
}
