package unidad6.teoriaU6.ejemplos_enumerados;

public class TestJuegoCartasNaipesV3 {

	public static void main(String[] args) {
		JuegoCartasV3 carta= new JuegoCartasV3(PaloNaipes.PALO_PICAS, 6);
		System.out.println("La carta es el "+carta.getPuntos()+" de "+carta.getPalo().getNombre()+".");
	}

}
