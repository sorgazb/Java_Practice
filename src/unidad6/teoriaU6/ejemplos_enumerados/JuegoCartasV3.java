package unidad6.teoriaU6.ejemplos_enumerados;

public class JuegoCartasV3 {
	private PaloNaipes palo;
	private int puntos;
	
	public JuegoCartasV3(PaloNaipes palo ,int puntos) {
		this.palo=palo;
		this.puntos=puntos;
	}

	public PaloNaipes getPalo() {
		return palo;
	}

	public void setPalo(PaloNaipes palo) {
		this.palo = palo;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

}
