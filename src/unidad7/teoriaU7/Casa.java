package unidad7.teoriaU7;

public class Casa {
	//Atributos de la clase:
	int id=0;
	String localidad="";
	String ubicacion="";
	double m2=0;
	int numPlantas=0;
	double precio=0;
	
	public Casa(int id, String localidad, String ubicacion, double m2, int numPlantas, double precio) {
		this.id = id;
		this.localidad = localidad;
		this.ubicacion = ubicacion;
		this.m2 = m2;
		this.numPlantas = numPlantas;
		this.precio = precio;
	}

	//Métodos Getters y Setters:
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public double getM2() {
		return m2;
	}
	public void setM2(double m2) {
		this.m2 = m2;
	}
	public int getNumPlantas() {
		return numPlantas;
	}
	public void setNumPlantas(int numPlantas) {
		this.numPlantas = numPlantas;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void imprimirCasa() {
		System.out.println("--DATOS CASA--");
		System.out.println("ID: "+id);
		System.out.println("Localidad: "+localidad);
		System.out.println("Ubicación: "+ubicacion);
		System.out.println("Metros cuadrados: "+m2);
		System.out.println("Número de Plantas: "+numPlantas);
		System.out.println("Precio: "+precio);
	}
}
