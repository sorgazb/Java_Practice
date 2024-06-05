package unidad11.teoriaU11.historialReparaciones;

public enum TipoVehiculo {
	
	COCHE("Coche"),MOTO("Moto"),CAMION("Camión");
	
	private final String nombre;
	
	private TipoVehiculo(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
}
