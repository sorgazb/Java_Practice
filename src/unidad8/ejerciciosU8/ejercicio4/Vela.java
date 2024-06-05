package unidad8.ejerciciosU8.ejercicio4;

public class Vela {

	//Atributos de la clase Vela:
	private String color;
	private int altura;
	private int precio;
	
	//Constructor de la clase Vela:
	public Vela(String color, int altura) {
		this.color = color;
		this.altura = altura;
		this.precio=2*altura;
	}
	
	
	//Métodos Getters && Setters de la clase Vela:
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getPrecio() {
		return precio;
	}

	
	
}
