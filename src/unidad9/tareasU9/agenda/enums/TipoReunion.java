package unidad9.tareasU9.agenda.enums;

public enum TipoReunion {

	FORMAL("formal"),INFORMAL("informal"),SEGUIMIENTO("de seguimiento");
private final String tipo;
	
	TipoReunion(String tipo) {
		this.tipo = tipo;
		
	}

	public String getTipo() {
		return tipo;
	}
}
