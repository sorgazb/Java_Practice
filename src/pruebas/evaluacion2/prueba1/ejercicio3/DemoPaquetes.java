package pruebas.evaluacion2.prueba1.ejercicio3;

public class DemoPaquetes {

	public static void main(String[] args) {
		
		Paquetes paquetes= new Paquetes();
		
		System.out.println("LISTADO PAQUETES COMPLETO:");
		paquetes.obtenerListadoPaquetes();


		System.out.println("LISTADO DE PAQUETES POR ZONA:");
		System.out.println("CACERES");
		paquetes.obtenerListadoZona(10);

		System.out.println("LISTADO PAQUETES ID + PRECIO:");
		paquetes.obtenerListadoPaquetesCoste();
		
		System.out.println("LISTADO PAQUETES ID ACORTADO:");
		paquetes.mostrarIdCorto();
	}

}
