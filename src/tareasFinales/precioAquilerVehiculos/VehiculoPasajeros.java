package tareasFinales.precioAquilerVehiculos;

public class VehiculoPasajeros extends VehiculoAlqui{
	protected static final double PRECIO_POR_PLAZA_Y_DIA=1.5;
	private int plazas;

	public VehiculoPasajeros(String matricula, int plazas) {
		super(matricula);
		this.plazas = plazas;
	}

	@Override
	public double precioAlquiler(int dias) {
		return super.precioAlquiler(dias)+(PRECIO_POR_PLAZA_Y_DIA*plazas)*dias;
	}
	
	public int getPlazas() {
		return plazas;
	}
	
	
	
}
