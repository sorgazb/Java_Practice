package ejerciciosEjemplo.practicaExamen;

public class DemoJugadores {

	public static void main(String[] args) {
		LecturaJugadores lj= new LecturaJugadores();
		lj.leerFichero();
		lj.crearCarpetasLigas();
		lj.volcarFicherosJson();

	}

}
