package unidad9.ejerciciosU9.ejercicio20;

public class GestorPlanetas {

	public static void main(String[] args) {
		Planetas tierra= new Planetas(3, 27.89, 82.3, 27, 9.8, 14000, 4, true, "Tierra");
		
		Satelites luna= new Satelites("Luna", 3, 39.9, 7000, 12.9, 2, 120, 4, tierra);
		Satelites luna2= new Satelites("Luna-2", 3, 39.9, 7000, 12.9, 2, 120, 4, tierra);
		
		System.out.println(tierra);
		
		tierra.aniadirSatelites(luna);
		tierra.aniadirSatelites(luna2);
		
		tierra.mostrarInformacionPlaneta();
	}

}
