package unidad6.teoriaU6.ejemplos_enumerados;

public class TestJuegoCartas {

	public static void main(String[] args) {
		
		JuegosCartas carta1= new JuegosCartas(JuegosCartas.PALO_CORAZONES, 4);
		System.out.println("La carta es el "+carta1.getPuntos() + " de "+carta1.getNombrePalo()+".");
		
	}

}
