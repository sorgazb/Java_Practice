package unidad7.teoriaU7;

public class Bicicleta {
	
	//Atributos Clase:
	private String marca="";
	private String modelo="";
	private String color="";
	private int id=0;
	private int tipo=0;
	private double peso=0;
	private char talla=' ';
	private double precio=0;
	
	//Métodos Getters y Setters:
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public char getTalla() {
		return talla;
	}
	public void setTalla(char talla) {
		this.talla = talla;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	//Métodos Constructores:(Cosntrutor Parametrizado)
	public Bicicleta(String marca, String modelo, String color, int id, int tipo, double peso, char talla, double precio) {
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
		this.id=id;
		this.tipo=tipo;
		this.peso=peso;
		this.talla=talla;
		this.precio=precio;
	}

	//Métodos Clase
	public void imprimirDatos() {
		System.out.println("--DATOS DE LA BICICLETA--");
		System.out.println("ID: "+id);
		System.out.println("Tipo: "+tipo);
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Color: "+color);
		System.out.println("Peso: "+peso);
		System.out.println("Talla: "+talla);
		System.out.println("Precio "+precio);
	}
}
