package tareasFinales.precioAquilerVehiculos;

public class VehiculoCarga extends VehiculoAlqui{
	protected static final double PRECIO_POR_TONELADA_DE_PMA=20;
	private double pma;
	
	public VehiculoCarga(String matricula, double pma) {
		super(matricula);
		this.pma = pma;
	}
	
	@Override
	public double precioAlquiler(int dias) {
		return super.precioAlquiler(dias)+(PRECIO_POR_TONELADA_DE_PMA*pma);
	}
	
	
}
