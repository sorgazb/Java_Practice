package unidad8.teoriaU8.interfaces.vehiculosElectricos;

public class CocheElectrico implements IVehiculosElectricos{
	
	private int nivelBateria;
	
	public CocheElectrico() {
		nivelBateria=50;
	}

	@Override
	public void cargar() {
		System.out.println("Cargando el coche eléctrico...");
		nivelBateria=100;
		System.out.println("Carga completa. Nivel Batería: "+nivelBateria);
	}

	@Override
	public void descargar() {
		System.out.println("Descargando el coche eléctrico...");
		nivelBateria-=10;
		if(nivelBateria<0) {
			nivelBateria=0;
		}
		System.out.println("Nivel de batería después de descargar: "+nivelBateria);
	}
	

}
