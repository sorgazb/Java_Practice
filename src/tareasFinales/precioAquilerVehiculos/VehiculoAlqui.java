package tareasFinales.precioAquilerVehiculos;

public class VehiculoAlqui{
	
	protected static final double PRECIO_POR_DIA=50;
	private String matricula;
	
	public VehiculoAlqui(String matricula) {
		super();
		this.matricula = matricula;
	}
	
	
	public double precioAlquiler(int dias) {
		double precio=dias*PRECIO_POR_DIA;
		return precio;
	}

	public String getMatricula() {
		return matricula;
	}
	
}
