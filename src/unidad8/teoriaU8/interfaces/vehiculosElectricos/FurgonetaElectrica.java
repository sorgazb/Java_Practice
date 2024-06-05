package unidad8.teoriaU8.interfaces.vehiculosElectricos;

public class FurgonetaElectrica implements IVehiculosElectricos{

	private int nivelBateria;
	
	public FurgonetaElectrica() {
		nivelBateria=60;
	}

	@Override
	public void cargar() {
		System.out.println("Cargando la furgoneta eléctrica...");
		nivelBateria=100;
		System.out.println("Carga completa. Nivel Batería: "+nivelBateria);
	}

	@Override
	public void descargar() {
		System.out.println("Descargando la furgoneta eléctrica...");
		nivelBateria-=12;
		if(nivelBateria<0) {
			nivelBateria=0;
		}
		System.out.println("Nivel de batería después de descargar: "+nivelBateria);
	}

}
