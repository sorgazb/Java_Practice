package unidad8.teoriaU8.interfaces.vehiculosElectricos;

public class PatineteElectrico implements IVehiculosElectricos{
	private int nivelBateria;
	
	public PatineteElectrico() {
		nivelBateria=20;
	}

	@Override
	public void cargar() {
		System.out.println("Cargando el patinete eléctrico...");
		nivelBateria=100;
		System.out.println("Carga completa. Nivel Batería: "+nivelBateria);
	}

	@Override
	public void descargar() {
		System.out.println("Descargando el patinete eléctrico...");
		nivelBateria-=4;
		if(nivelBateria<0) {
			nivelBateria=0;
		}
		System.out.println("Nivel de batería después de descargar: "+nivelBateria);
	}
}
