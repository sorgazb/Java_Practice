package tareasFinales.precioAquilerVehiculos;

public class Microbus extends VehiculoPasajeros{
	private static final double PRECIO_POR_PLAZA=2;

	public Microbus(String matricula, int plazas) {
		super(matricula, plazas);
	}
	

	@Override
	public double precioAlquiler(int dias) {
		return super.precioAlquiler(dias)+(PRECIO_POR_PLAZA*getPlazas());
	}
}
