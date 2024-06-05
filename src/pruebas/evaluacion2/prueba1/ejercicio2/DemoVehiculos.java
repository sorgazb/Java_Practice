package pruebas.evaluacion2.prueba1.ejercicio2;

public class DemoVehiculos {

	public static void main(String[] args) {
		Vehiculo v1= new Coche("0000-HVC", "Ford", 4, false);
		System.out.println(v1);
		
		Vehiculo v2= new Moto("0000-HVC", "BMW", 4, "Rojo");
		System.out.println(v2);
		
		Vehiculo v3= new Barco("AAA", "Modelo barco", 450, false);
		System.out.println(v3);
		
		Vehiculo v4= new Submarino("BBBB", "Modelo Subamrino", 170, 1599.99);
		System.out.println(v4);
		
		Vehiculo v5= new Avion("0000-HVC", "Modelo Avion", 34, 16);
		System.out.println(v5);
		
		Vehiculo v6= new Helicoptero("0000-HVC", "Modelo Helicoptero", 2, 6);
		System.out.println(v6);
	}

}
