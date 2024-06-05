package unidad11.ejercicioU11.ejerEquiposFutbol;

public enum Posicion {
	PORTERO("Portero"),DEFENSA("Defensa"),CENTRO_CAMPISTA("Centrocampista"),DELANTERO("Delantero");
	
	private final String posicion;
	
	private Posicion(String posicion) {
		this.posicion=posicion;
	}
	
	public String getPosicion() {
		return posicion;
	}
}
