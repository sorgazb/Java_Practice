package unidad6.teoriaU6.ejemplos_enumerados;

public class JuegosCartas {
	
	public static final int PALO_PICAS=0;
	public static final int PALO_CORAZONES=1;
	public static final int PALO_TREBOLES=2;
	public static final int PALO_DIAMANTES=3;
	
	//Atributos de la Clase:
	private int palo;
	private int puntos;
	
	//Constructores:
	public JuegosCartas() {
		this.palo=0;
		this.puntos=0;
	}
	
	public JuegosCartas(int palo, int puntos) {
		this.palo=palo;
		this.puntos=puntos;
	}
	
	//Getters & Setters:
	public int getPalo() {
		return palo;
	}

	public void setPalo(int palo) {
		this.palo = palo;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	//Funciones o Métodos:
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
