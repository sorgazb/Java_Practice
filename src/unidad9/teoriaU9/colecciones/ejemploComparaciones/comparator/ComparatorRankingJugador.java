package unidad9.teoriaU9.colecciones.ejemploComparaciones.comparator;

import java.util.Comparator;

public class ComparatorRankingJugador implements Comparator<Jugador>{

	@Override
	public int compare(Jugador o1, Jugador o2) {
		return Integer.compare(o1.getRanking(), o2.getRanking());
	}
	

}
