package unidad8.ejerciciosU8.ejercicio3;

public class CarrerasCaballo extends Caballo{
	
	private int numero_Carreras;

	public CarrerasCaballo(String nombre, String color, int anio_Nacimiento, int numero_Carreras) {
		super(nombre, color, anio_Nacimiento);
		this.numero_Carreras= numero_Carreras + 1;
	}

	public int getNumero_Carreras() {
		return numero_Carreras;
	}

	public void setNumero_Carreras(int numero_Carreras) {
		this.numero_Carreras = numero_Carreras;
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("-Numero de Carreras: "+numero_Carreras);
	}

}
