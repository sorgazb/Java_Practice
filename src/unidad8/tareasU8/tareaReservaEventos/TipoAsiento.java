package unidad8.tareasU8.tareaReservaEventos;

public enum TipoAsiento {
	SOCIO("$"), LIBRE("O"), OCUPADO("X");
	
	private final String tipo_Asiento;
	
	private TipoAsiento(String tipo_Asiento) {
		this.tipo_Asiento=tipo_Asiento;
	}
	
	public String getTipo_Asiento() {
		return tipo_Asiento;
	}
}
