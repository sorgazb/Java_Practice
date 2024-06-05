package unidad9.ejerciciosU9.ejercicio20;

public abstract class Astros {
	
	protected double radioEcuatorial;
	protected double rotacioEje; 
	protected double masa;
	protected double temperaturaMedia;
	protected double gravedad;
	protected String nombre;
	
	public Astros(double radioEcuatorial, double rotacioEje, double masa, double temperaturaMedia, double gravedad, String nombre) {
		this.nombre=nombre;
		this.radioEcuatorial = radioEcuatorial;
		this.rotacioEje = rotacioEje;
		this.masa = masa;
		this.temperaturaMedia = temperaturaMedia;
		this.gravedad = gravedad;
	}

	public double getRadioEcuatorial() {
		return radioEcuatorial;
	}

	public void setRadioEcuatorial(double radioEcuatorial) {
		this.radioEcuatorial = radioEcuatorial;
	}

	public double getRotacioEje() {
		return rotacioEje;
	}

	public void setRotacioEje(double rotacioEje) {
		this.rotacioEje = rotacioEje;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getTemperaturaMedia() {
		return temperaturaMedia;
	}

	public void setTemperaturaMedia(double temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
	}

	public double getGravedad() {
		return gravedad;
	}

	public void setGravedad(double gravedad) {
		this.gravedad = gravedad;
	}

	@Override
	public String toString() {
		return "Astros [nombre: "+ nombre +" radioEcuatorial=" + radioEcuatorial + ", rotacioEje=" + rotacioEje + ", masa=" + masa
				+ ", temperaturaMedia=" + temperaturaMedia + ", gravedad=" + gravedad + "]";
	}
	
	
	
	
	
}
