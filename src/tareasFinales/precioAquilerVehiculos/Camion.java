package tareasFinales.precioAquilerVehiculos;

public class Camion extends VehiculoCarga{
	public static final double PRECIO_FIJO_CAMION=40;

	public Camion(String matricula, double pma) {
		super(matricula, pma);
	}

	@Override
	public double precioAlquiler(int dias) {
		return super.precioAlquiler(dias)+(PRECIO_FIJO_CAMION);
	}
}
