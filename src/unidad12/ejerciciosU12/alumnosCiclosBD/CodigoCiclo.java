package unidad12.ejerciciosU12.alumnosCiclosBD;

public enum CodigoCiclo {
	DAM("DAM"),DAW("DAW"),ASIR("ASIR");
	
	private final String codigoCiclo;
	
	private CodigoCiclo(String codigoCiclo) {
		this.codigoCiclo=codigoCiclo;
	}
	
	public String getCodigoCiclo() {
		return codigoCiclo;
	}

}
