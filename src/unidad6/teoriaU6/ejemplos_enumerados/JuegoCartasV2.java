package unidad6.teoriaU6.ejemplos_enumerados;

public class JuegoCartasV2 {
	
	//Atributos de la clase:
	private Palo palo;
	private int puntos;
	
	//Constructores:
	public JuegoCartasV2(Palo palo, int puntos) {
		this.palo=palo;
		this.puntos=puntos;
	}

	//Getters & Setters
	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public String getNombrePalo() {
		String nombre="";
		switch(this.palo) {
		case PALO_PICAS:
			nombre="Picas";
			break;
		case PALO_CORAZONES:
			nombre="Corazones";
			break;
		case PALO_TREBOLES:
			nombre="Trebol";
			break;
		case PALO_DIAMANTES:
			nombre="Diamantes";
			break;
		default:
			System.err.println("ERROR. Palo inválido.");
		}
		return nombre;
	}
	
	

}
