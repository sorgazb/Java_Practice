package unidad6.teoriaU6.ejemplos_enumerados;

//Versión 3.

public enum PaloNaipes {
	PALO_PICAS("Picas"),PALO_CORAZONES ("Corazones"),PALO_TREBOLES("Trebol"),PALO_DIAMANTES("Diamantes");
	
	private final String nombre;
	
	private PaloNaipes(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
}
