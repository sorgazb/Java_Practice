package unidad11.teoriaU11.listadoAlumnos;

public enum CicloFormativo {
	DAM("DAM"),DAW("DAW"),ASIR("ASIR");
	
	private final String codigo;
	
	private CicloFormativo(String codigo) {
		this.codigo=codigo;
	}
	
	public String getCodigo() {
		return codigo;
	}
}
