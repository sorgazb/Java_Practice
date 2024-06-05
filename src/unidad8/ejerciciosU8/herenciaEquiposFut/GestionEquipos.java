package unidad8.ejerciciosU8.herenciaEquiposFut;

public class GestionEquipos {

	public static void main(String[] args) {
		Jugador [] arrayJugador= new Jugador [5];
		arrayJugador[0]= new Jugador("Leo", "Messi", "Delantero");
		arrayJugador[1]= new Jugador("Sergio", "Ramos", "Defensa");
		arrayJugador[2]= new Jugador("Cristiano", "Ronaldo", "Delantero");
		arrayJugador[3]= new Jugador("Vini", "Jr", "Delantero");
		arrayJugador[4]= new Jugador("Ansu", "Fati", "Delantero");
		Equipo e1= new Equipo("Moralo", "Navalmoral", arrayJugador);
		
		Jugador [] arrayJugador2= new Jugador [5];
		arrayJugador2[0]= new Jugador("Leo", "Messi", "Delantero");
		arrayJugador2[1]= new Jugador("Sergio", "Ramos", "Defensa");
		arrayJugador2[2]= new Jugador("Cristiano", "Ronaldo", "Delantero");
		arrayJugador2[3]= new Jugador("Vini", "Jr", "Delantero");
		arrayJugador2[4]= new Jugador("Ansu", "Fati", "Delantero");
		Equipo e2= new Equipo("Moralo", "Navalmoral", arrayJugador2);
		
		
		if(e1.equals(e2)) {
			System.out.println("Son equipos iguales");
		}else {
			System.out.println("No son equipos iguales");
		}
		
		
		
		
		
	}

}
