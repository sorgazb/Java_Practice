package tareasFinales.panelesYPlantaSolar;

public class PanelSolar {
	
	private String id;
	private int acimut;
	private boolean alineado;
	private double elevacion;
	private double potencia;
	private boolean averiado;
	
	public PanelSolar(String id, int acimut, boolean alineado, double elevacion, double potencia, boolean averiado) {
		super();
		this.id = id;
		this.acimut = acimut;
		this.alineado = alineado;
		this.elevacion = elevacion;
		this.potencia = potencia;
		this.averiado = averiado;
	}

	public boolean isAveriado() {
		return averiado;
	}

	public void setAveriado(boolean averiado) {
		this.averiado = averiado;
	}

	public String obtenerId() {
		return getId();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAcimut() {
		if(averiado==true) {
			System.out.println("Esta averidado");
			return 0;
		}
		return acimut;
	}
	public void setAcimut(int acimut) {
		this.acimut = acimut;
	}
	public boolean isAlineado() {
		return alineado;
	}
	public void setAlineado(boolean alineado) {
		this.alineado = alineado;
	}
	
	public double getElevacion() {
		if(averiado==true) {
			System.out.println("Esta averidado");
			return 0;
		}
		return elevacion;
	}
	public void setElevacion(double elevacion) {
		this.elevacion = elevacion;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

}
