package unidad8.teoriaU8.interfaces.vehiculosElectricos;

public class MainElectrico {

	public static void main(String[] args) {
		
		CocheElectrico array_Vehiculos[]= new CocheElectrico[10];
		
		CocheElectrico coche= new CocheElectrico();
		BicicletaElectrica bici= new BicicletaElectrica();
		FurgonetaElectrica furgo= new FurgonetaElectrica();
		MotoElectrica moto= new MotoElectrica();
		PatineteElectrico patinete= new PatineteElectrico();
		
		array_Vehiculos[0]=coche;
		//No se pueden almacenar estos objetos:
		//array_Vehiculos[1]=bici;
		//array_Vehiculos[2]=furgo;
		//array_Vehiculos[3]=moto;
		//array_Vehiculos[4]=patinete;
		
		
		coche.cargar();
		coche.descargar();
		System.out.println("----------------------------------");
		bici.cargar();
		bici.descargar();
		System.out.println("----------------------------------");
		furgo.cargar();
		furgo.descargar();
		System.out.println("----------------------------------");
		moto.cargar();
		moto.descargar();
		System.out.println("----------------------------------");
		patinete.cargar();
		patinete.descargar();
	}

}
