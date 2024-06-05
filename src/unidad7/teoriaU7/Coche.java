package unidad7.teoriaU7;

public class Coche {
	//Atributos de la clase:
	private int id=0;
	private String marca="";
	private String modelo="";
	private int numPuertas=0;
	private String combustible="";
	private String numBastidor="";
	private String color="";
	private String matricula="";
	private int caballos=0;
	private int cilindrada=0;
	
	//Métodos Getter y Setters:
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	public String getCombustible() {
		return combustible;
	}
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	public String getNumBastidor() {
		return numBastidor;
	}
	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getCaballos() {
		return caballos;
	}
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	
	//Método constructor parametrizado:
	public Coche(int cilindrada, int id, String marca, String modelo, int numPuertas, String combustible, String numBastidor, String color, String matricula, int caballos) {
		this.id=id;
		this.marca=marca;
		this.modelo=modelo;
		this.numPuertas=numPuertas;
		this.combustible=combustible;
		this.numBastidor=numBastidor;
		this.color=color;
		this.matricula=matricula;
		this.caballos=caballos;
		this.cilindrada=cilindrada;
	}
	
	//Métodos de la clase:
	public void mostrarCoche() {
		System.out.println("--DATOS COCHE--");
		System.out.println("ID: "+id);
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Número de Puertas: "+numPuertas);
		System.out.println("Combustible: "+combustible);
		System.out.println("Número de Bastidos: "+numBastidor);
		System.out.println("Color: "+color);
		System.out.println("Matrícula: "+matricula);
		System.out.println("Caballos: "+caballos);
		System.out.println("Cilindrada: "+cilindrada);
	}
	
	
	 //Método toString:

	public String toString() {
		String coche="";
		coche="Datos coche\n";
		coche+="Marca: "+marca+"\n";
		coche+="Modelo: "+modelo+"\n";
		coche+="Número de Puertas: "+numPuertas+"\n";
		coche+="Combustible: "+combustible+"\n";
		coche+="Número de Bastidos: "+numBastidor+"\n";
		coche+="Color: "+color+"\n";
		coche+="Matrícula: "+matricula+"\n";
		coche+="Caballos: "+caballos+"\n";
		coche+="Cilindrada: "+cilindrada+"\n";
		return coche;
	}
	
}
