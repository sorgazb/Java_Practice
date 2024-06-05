package unidad7.teoriaU7;

public class Aplicacion {

	public static void main(String[] args) {
		//Objetos Bici de la clase Bicicleta:
		Bicicleta bici= new Bicicleta("Obrea", "X-34", "Negro", 17473, 2, 3.6, 'M', 124.60);
		Bicicleta bici2= new Bicicleta("Obrea", "X-35", "Azul", 574774, 1, 3.6, 'M', 124.60);
		//Llamada al método mostrar datos:
		bici.imprimirDatos();
		bici2.imprimirDatos();
		System.out.println(" ");
		
		Coche coche1= new Coche(1200,1, "Audi", "R-8", 3, "Gasolina", "B-656456", "Negro", "1994-GTR", 220);
		//coche1.mostrarCoche();
		System.out.println(" ");
		System.out.println(coche1.toString());
		
		Casa casa1= new Casa(1212, "Navalmoral de la Mata", "Calle Extremadura", 90, 1, 100000);
		casa1.imprimirCasa();
		System.out.println(" ");
		
	}

}
