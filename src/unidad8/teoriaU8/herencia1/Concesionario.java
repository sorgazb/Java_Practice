package unidad8.teoriaU8.herencia1;

public class Concesionario {

	public static void main(String[] args) {
		Motor motorCoche= new Motor("Diesel", 2000, 150);
		String matricula="8765-KWH";
		String bastidor="3425423453534523FAS123";
		String marca="Lancia";
		String modelo="Stratos";
		int numPuertas=3;
		int numPlazas=4;
		double capacidadMaletero=80;
		String tipo="Rally";
		
		Coche coche= new Coche(matricula, bastidor, marca, modelo, motorCoche, numPuertas, numPlazas, capacidadMaletero, tipo);
		System.out.println("----COCHE-----");
		coche.mostrarDatos();
		
		Motor motorMotor = new Motor("Gasolina", 1500, 80);
		Moto moto= new Moto("1234-GTC", "124323542345HASD1", "Yamaha", "Virago", motorMotor, false, "Custom");
		System.out.println("----MOTO-----");
		moto.mostrarDatos();
	}

}
