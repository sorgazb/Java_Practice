package unidad6.tareasU6.tarea2;

public class Actividad2 {

	public static void main(String[] args) {
		Garaje garaje= new Garaje();
		
		Coche coche1= new Coche("Peugeot","407",140);
		Coche coche2= new Coche("Renault", "Kangoo",90);
		
		boolean aceptado=false;
		
		aceptado=garaje.aceptarCoche(coche1, "aceite");
		comprobarDisponibilidadGaraje(coche1, aceptado);
		aceptado=garaje.aceptarCoche(coche2, "aceite");
		comprobarDisponibilidadGaraje(coche2, aceptado);
		garaje.devolverCoche();
		aceptado=garaje.aceptarCoche(coche2, "aceite");
		comprobarDisponibilidadGaraje(coche2, aceptado);
		aceptado=garaje.aceptarCoche(coche1, "aceite");
		comprobarDisponibilidadGaraje(coche1, aceptado);
		garaje.devolverCoche();
		
		aceptado=garaje.aceptarCoche(coche1, "aceite");
		comprobarDisponibilidadGaraje(coche1, aceptado);
		aceptado=garaje.aceptarCoche(coche2, "aceite");
		comprobarDisponibilidadGaraje(coche2, aceptado);
		garaje.devolverCoche();
		
		coche1.mostrarDatosCoche();
		coche2.mostrarDatosCoche();
	
	}
	
	
	public static void comprobarDisponibilidadGaraje(Coche coche, boolean aceptado) {
		if(aceptado) {
			System.out.println("Coche: "+coche.getMarca()+" aceptado.");
		}else {
			System.out.println("Coche: "+coche.getMarca()+" denegado.");
		}
	}

}
