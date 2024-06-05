package unidad9.teoriaU9.colecciones.ejemploComparaciones.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestOrdenJugadoresComparator {

	public static void main(String[] args) {
		List <Jugador> equipo= new ArrayList<Jugador> ();
		
		Jugador j1= new Jugador(1, 33, "Fernando");
		Jugador j2= new Jugador(88, 17, "Juan");
		Jugador j3= new Jugador(17, 67, "Rebeca");
		
		equipo.add(j1);
		equipo.add(j2);
		equipo.add(j3);
		
		System.out.println(equipo);
		
		ComparatorRankingJugador com = new ComparatorRankingJugador();
		
		Collections.sort(equipo,com);
		System.out.println("Orden de Ranking:");
		System.out.println(equipo);
		
		ComparatorEdadJugador com1 = new ComparatorEdadJugador();
		System.out.println("Orden de edad:");
		Collections.sort(equipo,com1);
		System.out.println(equipo);

	}
	

}
