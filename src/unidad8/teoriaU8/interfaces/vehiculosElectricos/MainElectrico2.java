package unidad8.teoriaU8.interfaces.vehiculosElectricos;

public class MainElectrico2 {

	public static void main(String[] args) {
		
		IVehiculosElectricos array_Vehiculos[]= new IVehiculosElectricos [10];
		
		IVehiculosElectricos vehiculo1= new CocheElectrico();
		IVehiculosElectricos vehiculo2= new BicicletaElectrica();
		IVehiculosElectricos vehiculo3= new FurgonetaElectrica();
		IVehiculosElectricos vehiculo4= new MotoElectrica();
		IVehiculosElectricos vehiculo5= new PatineteElectrico();
		
		
		array_Vehiculos[0]=vehiculo1;
		array_Vehiculos[1]=vehiculo2;
		array_Vehiculos[2]=vehiculo3;
		array_Vehiculos[3]=vehiculo4;
		array_Vehiculos[4]=vehiculo5;
		
		
		vehiculo1.cargar();
		vehiculo1.descargar();
		System.out.println("----------------------------------");
		vehiculo2.cargar();
		vehiculo2.descargar();
		System.out.println("----------------------------------");
		vehiculo3.cargar();
		vehiculo3.descargar();
		System.out.println("----------------------------------");
		vehiculo4.cargar();
		vehiculo4.descargar();
		System.out.println("----------------------------------");
		vehiculo5.cargar();
		vehiculo5.descargar();
	}

}
