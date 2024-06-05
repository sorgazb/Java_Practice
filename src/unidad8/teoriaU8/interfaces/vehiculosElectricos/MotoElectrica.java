package unidad8.teoriaU8.interfaces.vehiculosElectricos;

public class MotoElectrica implements IVehiculosElectricos {
	
	private int nivelBateria;
	
	public MotoElectrica() {
		nivelBateria=40;
	}

	@Override
	public void cargar() {
		System.out.println("Cargando la moto eléctrica...");
		nivelBateria=100;
		System.out.println("Carga completa. Nivel Batería: "+nivelBateria);
	}

	@Override
	public void descargar() {
		System.out.println("Descargando la moto eléctrica...");
		nivelBateria-=8;
		if(nivelBateria<0) {
			nivelBateria=0;
		}
		System.out.println("Nivel de batería después de descargar: "+nivelBateria);
	}

}
