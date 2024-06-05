package unidad6.teoriaU6.ejemplos_enumerados;

public class TestJuegoCartasV2 {

	public static void main(String[] args) {
		JuegoCartasV2 carta= new JuegoCartasV2(Palo.PALO_DIAMANTES, 7);
		System.out.println("La carta es el "+carta.getPuntos()+" de "+carta.getNombrePalo()+".");
		
		JuegoCartasV2 carta2= new JuegoCartasV2(Palo.PALO_PICAS, 4);
		System.out.println("La carta es el "+carta2.getPuntos()+" de "+carta2.getNombrePalo()+".");
		
		//Con esta V2 al poner JuegoCartasV2(78,1) nos salta un error de compilación.
	}

}
