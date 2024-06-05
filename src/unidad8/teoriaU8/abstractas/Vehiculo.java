package unidad8.teoriaU8.abstractas;

public abstract class Vehiculo {
	
	private String fuente_Alimentacion;
	private int ruedas;
	protected int precio;
	
	public Vehiculo(String fuente_Alimentacion, int ruedas) {
		super();
		setFuente_Alimentacion(fuente_Alimentacion);
		setRuedas(ruedas);
	}
	
	
	
	public String getFuente_Alimentacion() {
		return fuente_Alimentacion;
	}



	public void setFuente_Alimentacion(String fuente_Alimentacion) {
		this.fuente_Alimentacion = fuente_Alimentacion;
	}



	public int getRuedas() {
		return ruedas;
	}



	public void setRuedas(int ruedas) {
		if(ruedas>=0) {
			this.ruedas = ruedas;
		}else {
			this.ruedas=0;
		}
	}



	public int getPrecio() {
		return precio;
	}



	public abstract void setPrecio();



	public void saludo() {
		System.out.println("Aplicación Vehículos");
	}
	
	public abstract double calcEficienciaCarburante();
	public abstract double calcDistanciaViaje();
}
