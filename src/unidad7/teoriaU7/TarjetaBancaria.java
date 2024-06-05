package unidad7.teoriaU7;

public class TarjetaBancaria {
	//Atributos o propiedades
	private String numero;
	private String cvv;
	private String titular;
	private int mesCad;
	private int anioCad;
	private String marca;
	private String entidad;
	
	//Constructor por defecto.
	public TarjetaBancaria() {
		this.numero="";
		this.cvv="";
		this.titular="";
		this.mesCad=0;
		this.anioCad=0;
		this.marca="";
		this.entidad="";
	}
	//Constructor Parametrizado
	public TarjetaBancaria(String numero, String cvv, String titular, int mesCad, int anioCad, String marca,String entidad) {
		this.numero = numero;
		this.cvv = cvv;
		this.titular = titular;
		this.mesCad = mesCad;
		this.anioCad = anioCad;
		this.marca = marca;
		this.entidad = entidad;
	}
	
	//Métodos Getters & Setters
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getMesCad() {
		return mesCad;
	}
	public void setMesCad(int mesCad) {
		this.mesCad = mesCad;
	}
	public int getAnioCad() {
		return anioCad;
	}
	public void setAnioCad(int anioCad) {
		this.anioCad = anioCad;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	
	public void mostrarDatos() {
		System.out.println("----TARJETA BANCARIA-----");
		System.out.println("-Entidad: "+this.entidad);
		System.out.println("-Marca: "+this.marca);
		System.out.println("-Número: "+this.numero);
		System.out.println("-Titular: "+this.titular);
		System.out.println("-CVV: "+this.cvv);
		System.out.println("-Fecha Cad: "+this.mesCad+"/"+this.anioCad);
	}
	
	
	
}
